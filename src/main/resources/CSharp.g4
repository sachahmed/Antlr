grammar CSharp;

import CSharpFragment;

@header{
package com.hijas.test.antlr;
}

//Syntactic grammar

//Basic concepts
identifier:
     IDENTIFIER
    | FROM
    | LET
    | WHERE
    | JOIN
    ;
namespace_or_type_name
    : ( identifier type_argument_list
    ) (DOT identifier type_argument_list )*
    ;
type
    : base_type
    | identifier
    ;
base_type
    : simple_type
    | class_type  // represents types: enum, class, interface, delegate, type_parameter
    | VOID
    ;
simple_type
	: numeric_type
	| BOOL
	;
numeric_type
	: integral_type
	| floating_point_type
	| DECIMAL
	;
integral_type
	: SBYTE
	| BYTE
	| SHORT
	| USHORT
	| INT
	| UINT
	| LONG
	| ULONG
	| CHAR
	;
floating_point_type
	: FLOAT
	| DOUBLE
	;
class_type
	: namespace_or_type_name
	| OBJECT
	| dynamic_contextual_keyword
	| STRING
	;
type_argument_list
	: LT type_arguments GT
	;
type_arguments
	: type ( COMMA type)*
	;
argument_list
	: argument ( COMMA argument)*
	;
argument
	: argument_name? expression
	;
argument_name
	: identifier COLON
	;
primary_expression
    : pe=primary_expression_start bracket_expression* (
        ( member_access
            | method_invocation
            | OP_INC
            | OP_DEC
            | OP_PTR identifier
            )
            bracket_expression*
        )*
    ;
primary_expression_start
    : literal
    | simple_name
    | parenthesized_expression
    | predefined_type // member_access
    | this_access
    | base_access
    | NEW type method_invocation
    | identifier
    ;
bracket_expression
    : OPEN_BRACKET expression_list CLOSE_BRACKET
    ;
simple_name
	: identifier type_argument_list
	;
parenthesized_expression
	: OPEN_PARENS expression CLOSE_PARENS
	;
predefined_type
	: BOOL
	| BYTE
	| CHAR
	| DECIMAL
	| DOUBLE
	| FLOAT
	| INT
	| LONG
	| OBJECT
	| SBYTE
	| SHORT
	| STRING
	| UINT
	| ULONG
	| USHORT
	;
expression_list
	: expression ( COMMA expression)*
	;
this_access
	: THIS
	;
base_access
	: BASE DOT identifier type_argument_list
	| BASE OPEN_BRACKET expression_list CLOSE_BRACKET
	;
object_initializer
    : OPEN_BRACE CLOSE_BRACE
    | OPEN_BRACE member_initializer_list COMMA? CLOSE_BRACE
    ;
member_initializer_list
	: member_initializer ( COMMA member_initializer)*
	;
member_initializer
	: identifier ASSIGNMENT initializer_value
	;
initializer_value
	: expression
	| object_initializer
	;
unary_expression
	: cast_expression
	| primary_expression
	| PLUS unary_expression
	| MINUS unary_expression
	| BANG unary_expression
	| TILDE unary_expression
	| pre_increment_expression
	| pre_decrement_expression
	;
pre_increment_expression
	: OP_INC unary_expression
	;
pre_decrement_expression
	: OP_DEC unary_expression
	;
cast_expression
	: OPEN_PARENS type CLOSE_PARENS unary_expression
	;
multiplicative_expression
	: unary_expression ( ( STAR  unary_expression ) | ( DIV  unary_expression ) | ( PERCENT  unary_expression ) )*
	;
additive_expression
	: multiplicative_expression ( ( PLUS  multiplicative_expression ) | ( MINUS  multiplicative_expression ) )*
	;
shift_expression
	: additive_expression ( ( OP_LEFT_SHIFT  additive_expression ) | ( right_shift  additive_expression ) )*
	;
relational_expression
    : shift_expression ( LT shift_expression
                        | GT shift_expression
                        | OP_LE shift_expression
                        | OP_GE shift_expression
                        )*
	;
equality_expression
	: relational_expression ( ( OP_EQ  relational_expression ) | ( OP_NE  relational_expression ) )*
	;
and_expression
	: equality_expression ( AMP equality_expression)*
	;
exclusive_or_expression
	: and_expression ( CARET and_expression)*
	;
inclusive_or_expression
	: exclusive_or_expression ( BITWISE_OR exclusive_or_expression)*
	;
conditional_and_expression
	: inclusive_or_expression ( OP_AND inclusive_or_expression)*
	;
conditional_or_expression
	: conditional_and_expression ( OP_OR conditional_and_expression)*
	;
null_coalescing_expression
    : conditional_or_expression (OP_COALESCING null_coalescing_expression)?
    ;
conditional_expression
    : null_coalescing_expression (INTERR expression COLON expression)?
    ;
assignment
	: unary_expression assignment_operator expression
	;
assignment_operator
	: ASSIGNMENT
	| OP_ADD_ASSIGNMENT
	| OP_SUB_ASSIGNMENT
	| OP_MULT_ASSIGNMENT
	| OP_DIV_ASSIGNMENT
	| OP_MOD_ASSIGNMENT
	| OP_AND_ASSIGNMENT
	| OP_OR_ASSIGNMENT
	| OP_XOR_ASSIGNMENT
	| OP_LEFT_SHIFT_ASSIGNMENT
	;
expression
	: assignment
	| conditional_expression
	;
embedded_statement
	: block
	| simple_embedded_statement
	;
block
    : OPEN_BRACE statement_list? CLOSE_BRACE
    ;
statement_list
    : statement+
    ;
statement
    : variable_statement
    | embedded_statement
    ;
variable_statement
    :
    local_variable_declaration SEMICOLON
    ;
local_variable_declaration
	: type? local_variable_declarators
	;
local_variable_declarators
	: local_variable_declarator ( COMMA local_variable_declarator )*
	;
local_variable_declarator
    : identifier (ASSIGNMENT expression)?
    ;
simple_embedded_statement
	: SEMICOLON
	| expression SEMICOLON
	| if_statement
    | switch_statement
	| while_statement
    | for_statement
	| return_statement
    | throw_statement
	| try_statement
	| yield_statement
	;
if_body
    : block                     # ifBodyBlock
    | simple_embedded_statement # ifBodySingle
    ;
if_statement
    : IF OPEN_PARENS expression CLOSE_PARENS if_body (ELSE if_body)?
    ;
switch_statement
	: SWITCH OPEN_PARENS expression CLOSE_PARENS switch_block
	;
switch_block
	: OPEN_BRACE switch_sections? CLOSE_BRACE
	;
switch_sections
	: switch_section ( switch_section )*
	;
switch_section
	: switch_labels statement_list
	;
switch_labels
	: switch_label ( switch_label )*
	;
switch_label
	: CASE expression COLON
	| DEFAULT COLON
	;
while_statement
	: WHILE OPEN_PARENS expression CLOSE_PARENS embedded_statement
	;
for_statement
	: FOR OPEN_PARENS for_initializer? SEMICOLON expression? SEMICOLON statement_expression_list? CLOSE_PARENS embedded_statement
	;
for_initializer
	: local_variable_declaration
	| statement_expression_list
	;
statement_expression_list
	: expression ( COMMA  expression )*
	;
return_statement
	: RETURN expression? SEMICOLON
	;
throw_statement
	: THROW expression? SEMICOLON
	;
try_statement
    : TRY block catch_clauses? finally_clause?
    ;
catch_clauses
    : CATCH block
    ;
finally_clause
	: FINALLY block
	;
yield_statement
	: yield_contextual_keyword RETURN expression SEMICOLON
	| yield_contextual_keyword BREAK SEMICOLON
	;

//compilation unit
compilation_unit
    : BYTE_ORDER_MARK?
    using_directives?
    namespace_member_declarations?
    EOF
    ;
using_directives
    : using_directive+
    ;
using_directive
    : USING namespace_or_type_name SEMICOLON
    ;
qualified_identifier
	: identifier ( DOT identifier )*
	;
namespace_member_declarations
	: namespace_member_declaration+
	;
namespace_member_declaration
	: namespace_declaration
	| type_declaration
	;
namespace_declaration
	: NAMESPACE qi=qualified_identifier namespace_body SEMICOLON?
	;
namespace_body
    : OPEN_BRACE namespace_member_declarations? CLOSE_BRACE
    ;
type_declaration
    : attribute_sections? all_member_modifiers? class_definition
    ;
type_parameter_list
	: LT type_parameters GT
	;
type_parameters
	: attribute_sections? identifier ( COMMA  attribute_sections?  identifier )*
	;
all_member_modifiers
    : (m=all_member_modifier)+
    ;
all_member_modifier
    : NEW
    | PUBLIC
    | PROTECTED
    | INTERNAL
    | PRIVATE
    | READONLY
    | VIRTUAL
    | SEALED
    | OVERRIDE
    | ABSTRACT
    | STATIC
    | UNSAFE
    | EXTERN
    | partial_contextual_keyword
    ;
class_definition
    : CLASS identifier
    type_parameter_list?
    class_base?
    class_body SEMICOLON?
    ;
class_base
    : COLON class_type
    ;
class_body
    : OPEN_BRACE class_member_declarations? CLOSE_BRACE
    ;
class_member_declarations
    : class_member_declaration+
    ;
class_member_declaration
    : attribute_sections? all_member_modifiers?
      variable_statement* common_member_declaration
    ;
common_member_declaration :
    all_member_modifier?
    (
        constructor_declaration
        | type method_declaration  // we use type_void instead of VOID to switch rules
    )
    ;
constructor_declaration
    : identifier OPEN_PARENS fixed_parameters? CLOSE_PARENS constructor_initializer? body
    ;
method_declaration
    : method_member_name type_parameter_list? OPEN_PARENS fixed_parameters? CLOSE_PARENS
        body
    ;
method_member_name
    : ( identifier
        | identifier DOUBLE_COLON identifier
        ) (type_argument_list DOT identifier)*
    ;
body
	: block
	| SEMICOLON
	;
fixed_parameters
	: fixed_parameter ( COMMA fixed_parameter )*
	;
fixed_parameter
    : attribute_sections? type identifier default_argument?
    | arglist
    ;
default_argument
	: ASSIGNMENT expression
	;
constructor_initializer
	: COLON BASE OPEN_PARENS argument_list? CLOSE_PARENS
	| COLON THIS OPEN_PARENS argument_list? CLOSE_PARENS
	;
attribute_sections
	: attribute_section+
	;
attribute_section
    : OPEN_BRACKET attribute_target_specifier? attribute_list COMMA? CLOSE_BRACKET
    ;
attribute_target_specifier
    : attribute_target COLON
    ;
attribute_target
    : keyword
    | identifier
    ;
attribute_list
	: namespace_or_type_name ( COMMA  namespace_or_type_name )*
	;
partial_contextual_keyword: PARTIAL;
yield_contextual_keyword: YIELD;
dynamic_contextual_keyword: DYNAMIC;
arglist: ARGLIST;
right_shift
    : first=GT second=GT {$first.index + 1 == $second.index}? // Nothing between the tokens?
    ;
literal
    : boolean_literal
    | INTEGER_LITERAL
    | REAL_LITERAL
    | CHARACTER_LITERAL
    | STRING_LITERAL
    | NULL
    ;
boolean_literal
    : TRUE
    | FALSE
    ;
keyword
    : BREAK
    | CASE
    | CATCH
    | CLASS
    | CONTINUE
    | DEFAULT
    | DO
    | ELSE
    | FINALLY
    | FOR
    | FOREACH
    | IF
    | INTERFACE
    | NAMESPACE
    | NEW
    | PRIVATE
    | PROTECTED
    | PUBLIC
    | RETURN
    | SHORT
    | STATIC
    | STRING
    | SWITCH
    | THIS
    | THROW
    | TRY
    | USING
    | VOID
    | WHILE
    | STRING
    ;
member_access
    : DOT identifier type_argument_list?
    ;
method_invocation
    : OPEN_PARENS argument_list? CLOSE_PARENS
    ;