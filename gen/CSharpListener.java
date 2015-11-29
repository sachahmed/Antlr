// Generated from D:/Users/SACHAHMED/IdeaProjects/TestAntlr/src/main/resources\CSharp.g4 by ANTLR 4.5.1

package com.hijas.test.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSharpParser}.
 */
public interface CSharpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSharpParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CSharpParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CSharpParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#namespace_or_type_name}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_or_type_name(CSharpParser.Namespace_or_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#namespace_or_type_name}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_or_type_name(CSharpParser.Namespace_or_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CSharpParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CSharpParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#base_type}.
	 * @param ctx the parse tree
	 */
	void enterBase_type(CSharpParser.Base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#base_type}.
	 * @param ctx the parse tree
	 */
	void exitBase_type(CSharpParser.Base_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void enterSimple_type(CSharpParser.Simple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void exitSimple_type(CSharpParser.Simple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_type(CSharpParser.Numeric_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_type(CSharpParser.Numeric_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#integral_type}.
	 * @param ctx the parse tree
	 */
	void enterIntegral_type(CSharpParser.Integral_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#integral_type}.
	 * @param ctx the parse tree
	 */
	void exitIntegral_type(CSharpParser.Integral_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#floating_point_type}.
	 * @param ctx the parse tree
	 */
	void enterFloating_point_type(CSharpParser.Floating_point_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#floating_point_type}.
	 * @param ctx the parse tree
	 */
	void exitFloating_point_type(CSharpParser.Floating_point_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(CSharpParser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(CSharpParser.Class_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#type_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterType_argument_list(CSharpParser.Type_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#type_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitType_argument_list(CSharpParser.Type_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#type_arguments}.
	 * @param ctx the parse tree
	 */
	void enterType_arguments(CSharpParser.Type_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#type_arguments}.
	 * @param ctx the parse tree
	 */
	void exitType_arguments(CSharpParser.Type_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(CSharpParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(CSharpParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(CSharpParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(CSharpParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#argument_name}.
	 * @param ctx the parse tree
	 */
	void enterArgument_name(CSharpParser.Argument_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#argument_name}.
	 * @param ctx the parse tree
	 */
	void exitArgument_name(CSharpParser.Argument_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(CSharpParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(CSharpParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression_start(CSharpParser.Primary_expression_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression_start(CSharpParser.Primary_expression_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void enterBracket_expression(CSharpParser.Bracket_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void exitBracket_expression(CSharpParser.Bracket_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void enterSimple_name(CSharpParser.Simple_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void exitSimple_name(CSharpParser.Simple_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized_expression(CSharpParser.Parenthesized_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized_expression(CSharpParser.Parenthesized_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void enterPredefined_type(CSharpParser.Predefined_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void exitPredefined_type(CSharpParser.Predefined_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(CSharpParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(CSharpParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#this_access}.
	 * @param ctx the parse tree
	 */
	void enterThis_access(CSharpParser.This_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#this_access}.
	 * @param ctx the parse tree
	 */
	void exitThis_access(CSharpParser.This_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#base_access}.
	 * @param ctx the parse tree
	 */
	void enterBase_access(CSharpParser.Base_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#base_access}.
	 * @param ctx the parse tree
	 */
	void exitBase_access(CSharpParser.Base_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#object_initializer}.
	 * @param ctx the parse tree
	 */
	void enterObject_initializer(CSharpParser.Object_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#object_initializer}.
	 * @param ctx the parse tree
	 */
	void exitObject_initializer(CSharpParser.Object_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#member_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_initializer_list(CSharpParser.Member_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#member_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_initializer_list(CSharpParser.Member_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#member_initializer}.
	 * @param ctx the parse tree
	 */
	void enterMember_initializer(CSharpParser.Member_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#member_initializer}.
	 * @param ctx the parse tree
	 */
	void exitMember_initializer(CSharpParser.Member_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#initializer_value}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_value(CSharpParser.Initializer_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#initializer_value}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_value(CSharpParser.Initializer_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(CSharpParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(CSharpParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#pre_increment_expression}.
	 * @param ctx the parse tree
	 */
	void enterPre_increment_expression(CSharpParser.Pre_increment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#pre_increment_expression}.
	 * @param ctx the parse tree
	 */
	void exitPre_increment_expression(CSharpParser.Pre_increment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#pre_decrement_expression}.
	 * @param ctx the parse tree
	 */
	void enterPre_decrement_expression(CSharpParser.Pre_decrement_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#pre_decrement_expression}.
	 * @param ctx the parse tree
	 */
	void exitPre_decrement_expression(CSharpParser.Pre_decrement_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(CSharpParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(CSharpParser.Cast_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(CSharpParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(CSharpParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(CSharpParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(CSharpParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(CSharpParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(CSharpParser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(CSharpParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(CSharpParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(CSharpParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(CSharpParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(CSharpParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(CSharpParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(CSharpParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(CSharpParser.Exclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(CSharpParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(CSharpParser.Inclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#conditional_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_and_expression(CSharpParser.Conditional_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#conditional_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_and_expression(CSharpParser.Conditional_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#conditional_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_or_expression(CSharpParser.Conditional_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#conditional_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_or_expression(CSharpParser.Conditional_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#null_coalescing_expression}.
	 * @param ctx the parse tree
	 */
	void enterNull_coalescing_expression(CSharpParser.Null_coalescing_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#null_coalescing_expression}.
	 * @param ctx the parse tree
	 */
	void exitNull_coalescing_expression(CSharpParser.Null_coalescing_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(CSharpParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(CSharpParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CSharpParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CSharpParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(CSharpParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(CSharpParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CSharpParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CSharpParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmbedded_statement(CSharpParser.Embedded_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmbedded_statement(CSharpParser.Embedded_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CSharpParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CSharpParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(CSharpParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(CSharpParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CSharpParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CSharpParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#variable_statement}.
	 * @param ctx the parse tree
	 */
	void enterVariable_statement(CSharpParser.Variable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#variable_statement}.
	 * @param ctx the parse tree
	 */
	void exitVariable_statement(CSharpParser.Variable_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#local_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declaration(CSharpParser.Local_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#local_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declaration(CSharpParser.Local_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#local_variable_declarators}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declarators(CSharpParser.Local_variable_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#local_variable_declarators}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declarators(CSharpParser.Local_variable_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#local_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declarator(CSharpParser.Local_variable_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#local_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declarator(CSharpParser.Local_variable_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_embedded_statement(CSharpParser.Simple_embedded_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_embedded_statement(CSharpParser.Simple_embedded_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifBodyBlock}
	 * labeled alternative in {@link CSharpParser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIfBodyBlock(CSharpParser.IfBodyBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifBodyBlock}
	 * labeled alternative in {@link CSharpParser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIfBodyBlock(CSharpParser.IfBodyBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifBodySingle}
	 * labeled alternative in {@link CSharpParser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIfBodySingle(CSharpParser.IfBodySingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifBodySingle}
	 * labeled alternative in {@link CSharpParser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIfBodySingle(CSharpParser.IfBodySingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(CSharpParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(CSharpParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(CSharpParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(CSharpParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#switch_block}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_block(CSharpParser.Switch_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#switch_block}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_block(CSharpParser.Switch_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#switch_sections}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_sections(CSharpParser.Switch_sectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#switch_sections}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_sections(CSharpParser.Switch_sectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_section(CSharpParser.Switch_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_section(CSharpParser.Switch_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#switch_labels}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_labels(CSharpParser.Switch_labelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#switch_labels}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_labels(CSharpParser.Switch_labelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#switch_label}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_label(CSharpParser.Switch_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#switch_label}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_label(CSharpParser.Switch_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(CSharpParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(CSharpParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(CSharpParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(CSharpParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#for_initializer}.
	 * @param ctx the parse tree
	 */
	void enterFor_initializer(CSharpParser.For_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#for_initializer}.
	 * @param ctx the parse tree
	 */
	void exitFor_initializer(CSharpParser.For_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_expression_list(CSharpParser.Statement_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_expression_list(CSharpParser.Statement_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(CSharpParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(CSharpParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(CSharpParser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(CSharpParser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(CSharpParser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(CSharpParser.Try_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void enterCatch_clauses(CSharpParser.Catch_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void exitCatch_clauses(CSharpParser.Catch_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void enterFinally_clause(CSharpParser.Finally_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void exitFinally_clause(CSharpParser.Finally_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#yield_statement}.
	 * @param ctx the parse tree
	 */
	void enterYield_statement(CSharpParser.Yield_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#yield_statement}.
	 * @param ctx the parse tree
	 */
	void exitYield_statement(CSharpParser.Yield_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(CSharpParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(CSharpParser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#using_directives}.
	 * @param ctx the parse tree
	 */
	void enterUsing_directives(CSharpParser.Using_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#using_directives}.
	 * @param ctx the parse tree
	 */
	void exitUsing_directives(CSharpParser.Using_directivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#using_directive}.
	 * @param ctx the parse tree
	 */
	void enterUsing_directive(CSharpParser.Using_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#using_directive}.
	 * @param ctx the parse tree
	 */
	void exitUsing_directive(CSharpParser.Using_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#qualified_identifier}.
	 * @param ctx the parse tree
	 */
	void enterQualified_identifier(CSharpParser.Qualified_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#qualified_identifier}.
	 * @param ctx the parse tree
	 */
	void exitQualified_identifier(CSharpParser.Qualified_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#namespace_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_member_declarations(CSharpParser.Namespace_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#namespace_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_member_declarations(CSharpParser.Namespace_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#namespace_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_member_declaration(CSharpParser.Namespace_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#namespace_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_member_declaration(CSharpParser.Namespace_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#namespace_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_declaration(CSharpParser.Namespace_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#namespace_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_declaration(CSharpParser.Namespace_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#namespace_body}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_body(CSharpParser.Namespace_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#namespace_body}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_body(CSharpParser.Namespace_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(CSharpParser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(CSharpParser.Type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_list(CSharpParser.Type_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_list(CSharpParser.Type_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#type_parameters}.
	 * @param ctx the parse tree
	 */
	void enterType_parameters(CSharpParser.Type_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#type_parameters}.
	 * @param ctx the parse tree
	 */
	void exitType_parameters(CSharpParser.Type_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#all_member_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterAll_member_modifiers(CSharpParser.All_member_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#all_member_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitAll_member_modifiers(CSharpParser.All_member_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#all_member_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAll_member_modifier(CSharpParser.All_member_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#all_member_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAll_member_modifier(CSharpParser.All_member_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(CSharpParser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(CSharpParser.Class_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#class_base}.
	 * @param ctx the parse tree
	 */
	void enterClass_base(CSharpParser.Class_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#class_base}.
	 * @param ctx the parse tree
	 */
	void exitClass_base(CSharpParser.Class_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(CSharpParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(CSharpParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#class_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterClass_member_declarations(CSharpParser.Class_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#class_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitClass_member_declarations(CSharpParser.Class_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#class_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_member_declaration(CSharpParser.Class_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#class_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_member_declaration(CSharpParser.Class_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#common_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCommon_member_declaration(CSharpParser.Common_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#common_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCommon_member_declaration(CSharpParser.Common_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration(CSharpParser.Constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration(CSharpParser.Constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(CSharpParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(CSharpParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#method_member_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_member_name(CSharpParser.Method_member_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#method_member_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_member_name(CSharpParser.Method_member_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CSharpParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CSharpParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#fixed_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFixed_parameters(CSharpParser.Fixed_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#fixed_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFixed_parameters(CSharpParser.Fixed_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#fixed_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFixed_parameter(CSharpParser.Fixed_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#fixed_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFixed_parameter(CSharpParser.Fixed_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#default_argument}.
	 * @param ctx the parse tree
	 */
	void enterDefault_argument(CSharpParser.Default_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#default_argument}.
	 * @param ctx the parse tree
	 */
	void exitDefault_argument(CSharpParser.Default_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#constructor_initializer}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_initializer(CSharpParser.Constructor_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#constructor_initializer}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_initializer(CSharpParser.Constructor_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#attribute_sections}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_sections(CSharpParser.Attribute_sectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#attribute_sections}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_sections(CSharpParser.Attribute_sectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#attribute_section}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_section(CSharpParser.Attribute_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#attribute_section}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_section(CSharpParser.Attribute_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#attribute_target_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_target_specifier(CSharpParser.Attribute_target_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#attribute_target_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_target_specifier(CSharpParser.Attribute_target_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#attribute_target}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_target(CSharpParser.Attribute_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#attribute_target}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_target(CSharpParser.Attribute_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(CSharpParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(CSharpParser.Attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#partial_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterPartial_contextual_keyword(CSharpParser.Partial_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#partial_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitPartial_contextual_keyword(CSharpParser.Partial_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#yield_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterYield_contextual_keyword(CSharpParser.Yield_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#yield_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitYield_contextual_keyword(CSharpParser.Yield_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#dynamic_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_contextual_keyword(CSharpParser.Dynamic_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#dynamic_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_contextual_keyword(CSharpParser.Dynamic_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(CSharpParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(CSharpParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#right_shift}.
	 * @param ctx the parse tree
	 */
	void enterRight_shift(CSharpParser.Right_shiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#right_shift}.
	 * @param ctx the parse tree
	 */
	void exitRight_shift(CSharpParser.Right_shiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CSharpParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CSharpParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(CSharpParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(CSharpParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(CSharpParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(CSharpParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#member_access}.
	 * @param ctx the parse tree
	 */
	void enterMember_access(CSharpParser.Member_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#member_access}.
	 * @param ctx the parse tree
	 */
	void exitMember_access(CSharpParser.Member_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#method_invocation}.
	 * @param ctx the parse tree
	 */
	void enterMethod_invocation(CSharpParser.Method_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#method_invocation}.
	 * @param ctx the parse tree
	 */
	void exitMethod_invocation(CSharpParser.Method_invocationContext ctx);
}