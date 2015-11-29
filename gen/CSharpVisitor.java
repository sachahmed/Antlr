// Generated from D:/Users/SACHAHMED/IdeaProjects/TestAntlr/src/main/resources\CSharp.g4 by ANTLR 4.5.1

package com.hijas.test.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSharpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSharpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSharpParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CSharpParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#namespace_or_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_or_type_name(CSharpParser.Namespace_or_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CSharpParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#base_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type(CSharpParser.Base_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#simple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_type(CSharpParser.Simple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#numeric_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_type(CSharpParser.Numeric_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#integral_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegral_type(CSharpParser.Integral_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#floating_point_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating_point_type(CSharpParser.Floating_point_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#class_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type(CSharpParser.Class_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#type_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_argument_list(CSharpParser.Type_argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#type_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_arguments(CSharpParser.Type_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(CSharpParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(CSharpParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#argument_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_name(CSharpParser.Argument_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(CSharpParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#primary_expression_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression_start(CSharpParser.Primary_expression_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#bracket_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket_expression(CSharpParser.Bracket_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#simple_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_name(CSharpParser.Simple_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized_expression(CSharpParser.Parenthesized_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#predefined_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefined_type(CSharpParser.Predefined_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(CSharpParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#this_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis_access(CSharpParser.This_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#base_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_access(CSharpParser.Base_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#object_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_initializer(CSharpParser.Object_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#member_initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_initializer_list(CSharpParser.Member_initializer_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#member_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_initializer(CSharpParser.Member_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#initializer_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_value(CSharpParser.Initializer_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(CSharpParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#pre_increment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_increment_expression(CSharpParser.Pre_increment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#pre_decrement_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_decrement_expression(CSharpParser.Pre_decrement_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expression(CSharpParser.Cast_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(CSharpParser.Multiplicative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(CSharpParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(CSharpParser.Shift_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(CSharpParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(CSharpParser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(CSharpParser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusive_or_expression(CSharpParser.Exclusive_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusive_or_expression(CSharpParser.Inclusive_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#conditional_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_and_expression(CSharpParser.Conditional_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#conditional_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_or_expression(CSharpParser.Conditional_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#null_coalescing_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_coalescing_expression(CSharpParser.Null_coalescing_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(CSharpParser.Conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CSharpParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(CSharpParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CSharpParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#embedded_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbedded_statement(CSharpParser.Embedded_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CSharpParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(CSharpParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CSharpParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#variable_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_statement(CSharpParser.Variable_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#local_variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_variable_declaration(CSharpParser.Local_variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#local_variable_declarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_variable_declarators(CSharpParser.Local_variable_declaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#local_variable_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_variable_declarator(CSharpParser.Local_variable_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_embedded_statement(CSharpParser.Simple_embedded_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifBodyBlock}
	 * labeled alternative in {@link CSharpParser#if_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBodyBlock(CSharpParser.IfBodyBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifBodySingle}
	 * labeled alternative in {@link CSharpParser#if_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBodySingle(CSharpParser.IfBodySingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(CSharpParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(CSharpParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#switch_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_block(CSharpParser.Switch_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#switch_sections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_sections(CSharpParser.Switch_sectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#switch_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_section(CSharpParser.Switch_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#switch_labels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_labels(CSharpParser.Switch_labelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#switch_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_label(CSharpParser.Switch_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(CSharpParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(CSharpParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#for_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_initializer(CSharpParser.For_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#statement_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_expression_list(CSharpParser.Statement_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(CSharpParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#throw_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(CSharpParser.Throw_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#try_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_statement(CSharpParser.Try_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#catch_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_clauses(CSharpParser.Catch_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#finally_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_clause(CSharpParser.Finally_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#yield_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_statement(CSharpParser.Yield_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#compilation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_unit(CSharpParser.Compilation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#using_directives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_directives(CSharpParser.Using_directivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#using_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_directive(CSharpParser.Using_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#qualified_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_identifier(CSharpParser.Qualified_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#namespace_member_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_member_declarations(CSharpParser.Namespace_member_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#namespace_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_member_declaration(CSharpParser.Namespace_member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#namespace_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_declaration(CSharpParser.Namespace_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#namespace_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_body(CSharpParser.Namespace_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_declaration(CSharpParser.Type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#type_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_parameter_list(CSharpParser.Type_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#type_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_parameters(CSharpParser.Type_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#all_member_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_member_modifiers(CSharpParser.All_member_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#all_member_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_member_modifier(CSharpParser.All_member_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#class_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_definition(CSharpParser.Class_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#class_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_base(CSharpParser.Class_baseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(CSharpParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#class_member_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_member_declarations(CSharpParser.Class_member_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#class_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_member_declaration(CSharpParser.Class_member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#common_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_member_declaration(CSharpParser.Common_member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#constructor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_declaration(CSharpParser.Constructor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(CSharpParser.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#method_member_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_member_name(CSharpParser.Method_member_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CSharpParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#fixed_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_parameters(CSharpParser.Fixed_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#fixed_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_parameter(CSharpParser.Fixed_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#default_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_argument(CSharpParser.Default_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#constructor_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_initializer(CSharpParser.Constructor_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#attribute_sections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_sections(CSharpParser.Attribute_sectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#attribute_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_section(CSharpParser.Attribute_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#attribute_target_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_target_specifier(CSharpParser.Attribute_target_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#attribute_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_target(CSharpParser.Attribute_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#attribute_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_list(CSharpParser.Attribute_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#partial_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartial_contextual_keyword(CSharpParser.Partial_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#yield_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_contextual_keyword(CSharpParser.Yield_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#dynamic_contextual_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_contextual_keyword(CSharpParser.Dynamic_contextual_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(CSharpParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#right_shift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_shift(CSharpParser.Right_shiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CSharpParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(CSharpParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(CSharpParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#member_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_access(CSharpParser.Member_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSharpParser#method_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_invocation(CSharpParser.Method_invocationContext ctx);
}