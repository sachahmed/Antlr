// Generated from D:/Users/SACHAHMED/IdeaProjects/TestAntlr/src/main/resources\CSharp.g4 by ANTLR 4.5.1

package com.hijas.test.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSharpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BYTE_ORDER_MARK=1, SINGLE_LINE_DOC_COMMENT=2, DELIMITED_DOC_COMMENT=3, 
		NEW_LINE=4, SINGLE_LINE_COMMENT=5, DELIMITED_COMMENT=6, WHITESPACE=7, 
		ABSTRACT=8, ADD=9, ALIAS=10, ARGLIST=11, AS=12, ASCENDING=13, BASE=14, 
		BOOL=15, BREAK=16, BY=17, BYTE=18, CASE=19, CATCH=20, CHAR=21, CHECKED=22, 
		CLASS=23, CONST=24, CONTINUE=25, DECIMAL=26, DEFAULT=27, DELEGATE=28, 
		DESCENDING=29, DO=30, DOUBLE=31, DYNAMIC=32, ELSE=33, ENUM=34, EQUALS=35, 
		EVENT=36, EXPLICIT=37, EXTERN=38, FALSE=39, FINALLY=40, FIXED=41, FLOAT=42, 
		FOR=43, FOREACH=44, FROM=45, GET=46, GOTO=47, GROUP=48, IF=49, IMPLICIT=50, 
		IN=51, INT=52, INTERFACE=53, INTERNAL=54, INTO=55, IS=56, JOIN=57, LET=58, 
		LOCK=59, LONG=60, NAMESPACE=61, NEW=62, NULL=63, OBJECT=64, ON=65, OPERATOR=66, 
		ORDERBY=67, OUT=68, OVERRIDE=69, PARAMS=70, PARTIAL=71, PRIVATE=72, PROTECTED=73, 
		PUBLIC=74, READONLY=75, REF=76, REMOVE=77, RETURN=78, SBYTE=79, SEALED=80, 
		SELECT=81, SET=82, SHORT=83, SIZEOF=84, STACKALLOC=85, STATIC=86, STRING=87, 
		STRUCT=88, SWITCH=89, THIS=90, THROW=91, TRUE=92, TRY=93, TYPEOF=94, UINT=95, 
		ULONG=96, UNCHECKED=97, UNSAFE=98, USHORT=99, USING=100, VIRTUAL=101, 
		VOID=102, VOLATILE=103, WHERE=104, WHILE=105, YIELD=106, OPEN_BRACE=107, 
		CLOSE_BRACE=108, OPEN_BRACKET=109, CLOSE_BRACKET=110, OPEN_PARENS=111, 
		CLOSE_PARENS=112, DOT=113, COMMA=114, COLON=115, SEMICOLON=116, PLUS=117, 
		MINUS=118, STAR=119, DIV=120, PERCENT=121, AMP=122, BITWISE_OR=123, CARET=124, 
		BANG=125, TILDE=126, ASSIGNMENT=127, LT=128, GT=129, INTERR=130, DOUBLE_COLON=131, 
		OP_COALESCING=132, OP_INC=133, OP_DEC=134, OP_AND=135, OP_OR=136, OP_PTR=137, 
		OP_EQ=138, OP_NE=139, OP_LE=140, OP_GE=141, OP_ADD_ASSIGNMENT=142, OP_SUB_ASSIGNMENT=143, 
		OP_MULT_ASSIGNMENT=144, OP_DIV_ASSIGNMENT=145, OP_MOD_ASSIGNMENT=146, 
		OP_AND_ASSIGNMENT=147, OP_OR_ASSIGNMENT=148, OP_XOR_ASSIGNMENT=149, OP_LEFT_SHIFT=150, 
		OP_LEFT_SHIFT_ASSIGNMENT=151, QUOTE=152, DOUBLE_QUOTE=153, BACK_SLASH=154, 
		DOUBLE_BACK_SLASH=155, SHARP=156, IDENTIFIER=157, INTEGER_LITERAL=158, 
		LiteralAccess=159, REAL_LITERAL=160, CHARACTER_LITERAL=161, STRING_LITERAL=162;
	public static final int
		RULE_identifier = 0, RULE_namespace_or_type_name = 1, RULE_type = 2, RULE_base_type = 3, 
		RULE_simple_type = 4, RULE_numeric_type = 5, RULE_integral_type = 6, RULE_floating_point_type = 7, 
		RULE_class_type = 8, RULE_type_argument_list = 9, RULE_type_arguments = 10, 
		RULE_argument_list = 11, RULE_argument = 12, RULE_argument_name = 13, 
		RULE_primary_expression = 14, RULE_primary_expression_start = 15, RULE_bracket_expression = 16, 
		RULE_simple_name = 17, RULE_parenthesized_expression = 18, RULE_predefined_type = 19, 
		RULE_expression_list = 20, RULE_this_access = 21, RULE_base_access = 22, 
		RULE_object_initializer = 23, RULE_member_initializer_list = 24, RULE_member_initializer = 25, 
		RULE_initializer_value = 26, RULE_unary_expression = 27, RULE_pre_increment_expression = 28, 
		RULE_pre_decrement_expression = 29, RULE_cast_expression = 30, RULE_multiplicative_expression = 31, 
		RULE_additive_expression = 32, RULE_shift_expression = 33, RULE_relational_expression = 34, 
		RULE_equality_expression = 35, RULE_and_expression = 36, RULE_exclusive_or_expression = 37, 
		RULE_inclusive_or_expression = 38, RULE_conditional_and_expression = 39, 
		RULE_conditional_or_expression = 40, RULE_null_coalescing_expression = 41, 
		RULE_conditional_expression = 42, RULE_assignment = 43, RULE_assignment_operator = 44, 
		RULE_expression = 45, RULE_embedded_statement = 46, RULE_block = 47, RULE_statement_list = 48, 
		RULE_statement = 49, RULE_variable_statement = 50, RULE_local_variable_declaration = 51, 
		RULE_local_variable_declarators = 52, RULE_local_variable_declarator = 53, 
		RULE_simple_embedded_statement = 54, RULE_if_body = 55, RULE_if_statement = 56, 
		RULE_switch_statement = 57, RULE_switch_block = 58, RULE_switch_sections = 59, 
		RULE_switch_section = 60, RULE_switch_labels = 61, RULE_switch_label = 62, 
		RULE_while_statement = 63, RULE_for_statement = 64, RULE_for_initializer = 65, 
		RULE_statement_expression_list = 66, RULE_return_statement = 67, RULE_throw_statement = 68, 
		RULE_try_statement = 69, RULE_catch_clauses = 70, RULE_finally_clause = 71, 
		RULE_yield_statement = 72, RULE_compilation_unit = 73, RULE_using_directives = 74, 
		RULE_using_directive = 75, RULE_qualified_identifier = 76, RULE_namespace_member_declarations = 77, 
		RULE_namespace_member_declaration = 78, RULE_namespace_declaration = 79, 
		RULE_namespace_body = 80, RULE_type_declaration = 81, RULE_type_parameter_list = 82, 
		RULE_type_parameters = 83, RULE_all_member_modifiers = 84, RULE_all_member_modifier = 85, 
		RULE_class_definition = 86, RULE_class_base = 87, RULE_class_body = 88, 
		RULE_class_member_declarations = 89, RULE_class_member_declaration = 90, 
		RULE_common_member_declaration = 91, RULE_constructor_declaration = 92, 
		RULE_method_declaration = 93, RULE_method_member_name = 94, RULE_body = 95, 
		RULE_fixed_parameters = 96, RULE_fixed_parameter = 97, RULE_default_argument = 98, 
		RULE_constructor_initializer = 99, RULE_attribute_sections = 100, RULE_attribute_section = 101, 
		RULE_attribute_target_specifier = 102, RULE_attribute_target = 103, RULE_attribute_list = 104, 
		RULE_partial_contextual_keyword = 105, RULE_yield_contextual_keyword = 106, 
		RULE_dynamic_contextual_keyword = 107, RULE_arglist = 108, RULE_right_shift = 109, 
		RULE_literal = 110, RULE_boolean_literal = 111, RULE_keyword = 112, RULE_member_access = 113, 
		RULE_method_invocation = 114;
	public static final String[] ruleNames = {
		"identifier", "namespace_or_type_name", "type", "base_type", "simple_type", 
		"numeric_type", "integral_type", "floating_point_type", "class_type", 
		"type_argument_list", "type_arguments", "argument_list", "argument", "argument_name", 
		"primary_expression", "primary_expression_start", "bracket_expression", 
		"simple_name", "parenthesized_expression", "predefined_type", "expression_list", 
		"this_access", "base_access", "object_initializer", "member_initializer_list", 
		"member_initializer", "initializer_value", "unary_expression", "pre_increment_expression", 
		"pre_decrement_expression", "cast_expression", "multiplicative_expression", 
		"additive_expression", "shift_expression", "relational_expression", "equality_expression", 
		"and_expression", "exclusive_or_expression", "inclusive_or_expression", 
		"conditional_and_expression", "conditional_or_expression", "null_coalescing_expression", 
		"conditional_expression", "assignment", "assignment_operator", "expression", 
		"embedded_statement", "block", "statement_list", "statement", "variable_statement", 
		"local_variable_declaration", "local_variable_declarators", "local_variable_declarator", 
		"simple_embedded_statement", "if_body", "if_statement", "switch_statement", 
		"switch_block", "switch_sections", "switch_section", "switch_labels", 
		"switch_label", "while_statement", "for_statement", "for_initializer", 
		"statement_expression_list", "return_statement", "throw_statement", "try_statement", 
		"catch_clauses", "finally_clause", "yield_statement", "compilation_unit", 
		"using_directives", "using_directive", "qualified_identifier", "namespace_member_declarations", 
		"namespace_member_declaration", "namespace_declaration", "namespace_body", 
		"type_declaration", "type_parameter_list", "type_parameters", "all_member_modifiers", 
		"all_member_modifier", "class_definition", "class_base", "class_body", 
		"class_member_declarations", "class_member_declaration", "common_member_declaration", 
		"constructor_declaration", "method_declaration", "method_member_name", 
		"body", "fixed_parameters", "fixed_parameter", "default_argument", "constructor_initializer", 
		"attribute_sections", "attribute_section", "attribute_target_specifier", 
		"attribute_target", "attribute_list", "partial_contextual_keyword", "yield_contextual_keyword", 
		"dynamic_contextual_keyword", "arglist", "right_shift", "literal", "boolean_literal", 
		"keyword", "member_access", "method_invocation"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\u00EF\\u00BB\\u00BF'", null, null, null, null, null, null, "'abstract'", 
		"'add'", "'alias'", "'__arglist'", "'as'", "'ascending'", "'base'", "'bool'", 
		"'break'", "'by'", "'byte'", "'case'", "'catch'", "'char'", "'checked'", 
		"'class'", "'const'", "'continue'", "'decimal'", "'default'", "'delegate'", 
		"'descending'", "'do'", "'double'", "'dynamic'", "'else'", "'enum'", "'equals'", 
		"'event'", "'explicit'", "'extern'", "'false'", "'finally'", "'fixed'", 
		"'float'", "'for'", "'foreach'", "'from'", "'get'", "'goto'", "'group'", 
		"'if'", "'implicit'", "'in'", "'int'", "'interface'", "'internal'", "'into'", 
		"'is'", "'join'", "'let'", "'lock'", "'long'", "'namespace'", "'new'", 
		"'null'", "'object'", "'on'", "'operator'", "'orderby'", "'out'", "'override'", 
		"'params'", "'partial'", "'private'", "'protected'", "'public'", "'readonly'", 
		"'ref'", "'remove'", "'return'", "'sbyte'", "'sealed'", "'select'", "'set'", 
		"'short'", "'sizeof'", "'stackalloc'", "'static'", "'string'", "'struct'", 
		"'switch'", "'this'", "'throw'", "'true'", "'try'", "'typeof'", "'uint'", 
		"'ulong'", "'unchecked'", "'unsafe'", "'ushort'", "'using'", "'virtual'", 
		"'void'", "'volatile'", "'where'", "'while'", "'yield'", "'{'", "'}'", 
		"'['", "']'", "'('", "')'", "'.'", "','", "':'", "';'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'!'", "'~'", "'='", "'<'", 
		"'>'", "'?'", "'::'", "'??'", "'++'", "'--'", "'&&'", "'||'", "'->'", 
		"'=='", "'!='", "'<='", "'>='", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'&='", "'|='", "'^='", "'<<'", "'<<='", "'''", "'\"'", "'\\'", "'\\\\'", 
		"'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BYTE_ORDER_MARK", "SINGLE_LINE_DOC_COMMENT", "DELIMITED_DOC_COMMENT", 
		"NEW_LINE", "SINGLE_LINE_COMMENT", "DELIMITED_COMMENT", "WHITESPACE", 
		"ABSTRACT", "ADD", "ALIAS", "ARGLIST", "AS", "ASCENDING", "BASE", "BOOL", 
		"BREAK", "BY", "BYTE", "CASE", "CATCH", "CHAR", "CHECKED", "CLASS", "CONST", 
		"CONTINUE", "DECIMAL", "DEFAULT", "DELEGATE", "DESCENDING", "DO", "DOUBLE", 
		"DYNAMIC", "ELSE", "ENUM", "EQUALS", "EVENT", "EXPLICIT", "EXTERN", "FALSE", 
		"FINALLY", "FIXED", "FLOAT", "FOR", "FOREACH", "FROM", "GET", "GOTO", 
		"GROUP", "IF", "IMPLICIT", "IN", "INT", "INTERFACE", "INTERNAL", "INTO", 
		"IS", "JOIN", "LET", "LOCK", "LONG", "NAMESPACE", "NEW", "NULL", "OBJECT", 
		"ON", "OPERATOR", "ORDERBY", "OUT", "OVERRIDE", "PARAMS", "PARTIAL", "PRIVATE", 
		"PROTECTED", "PUBLIC", "READONLY", "REF", "REMOVE", "RETURN", "SBYTE", 
		"SEALED", "SELECT", "SET", "SHORT", "SIZEOF", "STACKALLOC", "STATIC", 
		"STRING", "STRUCT", "SWITCH", "THIS", "THROW", "TRUE", "TRY", "TYPEOF", 
		"UINT", "ULONG", "UNCHECKED", "UNSAFE", "USHORT", "USING", "VIRTUAL", 
		"VOID", "VOLATILE", "WHERE", "WHILE", "YIELD", "OPEN_BRACE", "CLOSE_BRACE", 
		"OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PARENS", "CLOSE_PARENS", "DOT", 
		"COMMA", "COLON", "SEMICOLON", "PLUS", "MINUS", "STAR", "DIV", "PERCENT", 
		"AMP", "BITWISE_OR", "CARET", "BANG", "TILDE", "ASSIGNMENT", "LT", "GT", 
		"INTERR", "DOUBLE_COLON", "OP_COALESCING", "OP_INC", "OP_DEC", "OP_AND", 
		"OP_OR", "OP_PTR", "OP_EQ", "OP_NE", "OP_LE", "OP_GE", "OP_ADD_ASSIGNMENT", 
		"OP_SUB_ASSIGNMENT", "OP_MULT_ASSIGNMENT", "OP_DIV_ASSIGNMENT", "OP_MOD_ASSIGNMENT", 
		"OP_AND_ASSIGNMENT", "OP_OR_ASSIGNMENT", "OP_XOR_ASSIGNMENT", "OP_LEFT_SHIFT", 
		"OP_LEFT_SHIFT_ASSIGNMENT", "QUOTE", "DOUBLE_QUOTE", "BACK_SLASH", "DOUBLE_BACK_SLASH", 
		"SHARP", "IDENTIFIER", "INTEGER_LITERAL", "LiteralAccess", "REAL_LITERAL", 
		"CHARACTER_LITERAL", "STRING_LITERAL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CSharp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSharpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CSharpParser.IDENTIFIER, 0); }
		public TerminalNode FROM() { return getToken(CSharpParser.FROM, 0); }
		public TerminalNode LET() { return getToken(CSharpParser.LET, 0); }
		public TerminalNode WHERE() { return getToken(CSharpParser.WHERE, 0); }
		public TerminalNode JOIN() { return getToken(CSharpParser.JOIN, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FROM) | (1L << JOIN) | (1L << LET))) != 0) || _la==WHERE || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_or_type_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<Type_argument_listContext> type_argument_list() {
			return getRuleContexts(Type_argument_listContext.class);
		}
		public Type_argument_listContext type_argument_list(int i) {
			return getRuleContext(Type_argument_listContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(CSharpParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CSharpParser.DOT, i);
		}
		public Namespace_or_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_or_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterNamespace_or_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitNamespace_or_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitNamespace_or_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_or_type_nameContext namespace_or_type_name() throws RecognitionException {
		Namespace_or_type_nameContext _localctx = new Namespace_or_type_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespace_or_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(232);
			identifier();
			setState(233);
			type_argument_list();
			}
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(235);
				match(DOT);
				setState(236);
				identifier();
				setState(237);
				type_argument_list();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				base_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_typeContext extends ParserRuleContext {
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitBase_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitBase_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_base_type);
		try {
			setState(251);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				simple_type();
				}
				break;
			case DYNAMIC:
			case FROM:
			case JOIN:
			case LET:
			case OBJECT:
			case STRING:
			case WHERE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				class_type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_typeContext extends ParserRuleContext {
		public Numeric_typeContext numeric_type() {
			return getRuleContext(Numeric_typeContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(CSharpParser.BOOL, 0); }
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterSimple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitSimple_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitSimple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simple_type);
		try {
			setState(255);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				numeric_type();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_typeContext extends ParserRuleContext {
		public Integral_typeContext integral_type() {
			return getRuleContext(Integral_typeContext.class,0);
		}
		public Floating_point_typeContext floating_point_type() {
			return getRuleContext(Floating_point_typeContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(CSharpParser.DECIMAL, 0); }
		public Numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterNumeric_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitNumeric_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitNumeric_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_typeContext numeric_type() throws RecognitionException {
		Numeric_typeContext _localctx = new Numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_numeric_type);
		try {
			setState(260);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				integral_type();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				floating_point_type();
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integral_typeContext extends ParserRuleContext {
		public TerminalNode SBYTE() { return getToken(CSharpParser.SBYTE, 0); }
		public TerminalNode BYTE() { return getToken(CSharpParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode USHORT() { return getToken(CSharpParser.USHORT, 0); }
		public TerminalNode INT() { return getToken(CSharpParser.INT, 0); }
		public TerminalNode UINT() { return getToken(CSharpParser.UINT, 0); }
		public TerminalNode LONG() { return getToken(CSharpParser.LONG, 0); }
		public TerminalNode ULONG() { return getToken(CSharpParser.ULONG, 0); }
		public TerminalNode CHAR() { return getToken(CSharpParser.CHAR, 0); }
		public Integral_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integral_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterIntegral_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitIntegral_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitIntegral_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integral_typeContext integral_type() throws RecognitionException {
		Integral_typeContext _localctx = new Integral_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_integral_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (SBYTE - 79)) | (1L << (SHORT - 79)) | (1L << (UINT - 79)) | (1L << (ULONG - 79)) | (1L << (USHORT - 79)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Floating_point_typeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(CSharpParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(CSharpParser.DOUBLE, 0); }
		public Floating_point_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_point_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterFloating_point_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitFloating_point_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitFloating_point_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Floating_point_typeContext floating_point_type() throws RecognitionException {
		Floating_point_typeContext _localctx = new Floating_point_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_floating_point_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_typeContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode OBJECT() { return getToken(CSharpParser.OBJECT, 0); }
		public Dynamic_contextual_keywordContext dynamic_contextual_keyword() {
			return getRuleContext(Dynamic_contextual_keywordContext.class,0);
		}
		public TerminalNode STRING() { return getToken(CSharpParser.STRING, 0); }
		public Class_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterClass_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitClass_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitClass_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_typeContext class_type() throws RecognitionException {
		Class_typeContext _localctx = new Class_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_class_type);
		try {
			setState(270);
			switch (_input.LA(1)) {
			case FROM:
			case JOIN:
			case LET:
			case WHERE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				namespace_or_type_name();
				}
				break;
			case OBJECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(OBJECT);
				}
				break;
			case DYNAMIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				dynamic_contextual_keyword();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_argument_listContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CSharpParser.LT, 0); }
		public Type_argumentsContext type_arguments() {
			return getRuleContext(Type_argumentsContext.class,0);
		}
		public TerminalNode GT() { return getToken(CSharpParser.GT, 0); }
		public Type_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterType_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitType_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitType_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_argument_listContext type_argument_list() throws RecognitionException {
		Type_argument_listContext _localctx = new Type_argument_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_argument_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(LT);
			setState(273);
			type_arguments();
			setState(274);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_argumentsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Type_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterType_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitType_arguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitType_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_argumentsContext type_arguments() throws RecognitionException {
		Type_argumentsContext _localctx = new Type_argumentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			type();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(277);
				match(COMMA);
				setState(278);
				type();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			argument();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(285);
				match(COMMA);
				setState(286);
				argument();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Argument_nameContext argument_name() {
			return getRuleContext(Argument_nameContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(292);
				argument_name();
				}
				break;
			}
			setState(295);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Argument_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterArgument_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitArgument_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitArgument_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_nameContext argument_name() throws RecognitionException {
		Argument_nameContext _localctx = new Argument_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			identifier();
			setState(298);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public Primary_expression_startContext pe;
		public Primary_expression_startContext primary_expression_start() {
			return getRuleContext(Primary_expression_startContext.class,0);
		}
		public List<Bracket_expressionContext> bracket_expression() {
			return getRuleContexts(Bracket_expressionContext.class);
		}
		public Bracket_expressionContext bracket_expression(int i) {
			return getRuleContext(Bracket_expressionContext.class,i);
		}
		public List<Member_accessContext> member_access() {
			return getRuleContexts(Member_accessContext.class);
		}
		public Member_accessContext member_access(int i) {
			return getRuleContext(Member_accessContext.class,i);
		}
		public List<Method_invocationContext> method_invocation() {
			return getRuleContexts(Method_invocationContext.class);
		}
		public Method_invocationContext method_invocation(int i) {
			return getRuleContext(Method_invocationContext.class,i);
		}
		public List<TerminalNode> OP_INC() { return getTokens(CSharpParser.OP_INC); }
		public TerminalNode OP_INC(int i) {
			return getToken(CSharpParser.OP_INC, i);
		}
		public List<TerminalNode> OP_DEC() { return getTokens(CSharpParser.OP_DEC); }
		public TerminalNode OP_DEC(int i) {
			return getToken(CSharpParser.OP_DEC, i);
		}
		public List<TerminalNode> OP_PTR() { return getTokens(CSharpParser.OP_PTR); }
		public TerminalNode OP_PTR(int i) {
			return getToken(CSharpParser.OP_PTR, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primary_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			((Primary_expressionContext)_localctx).pe = primary_expression_start();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACKET) {
				{
				{
				setState(301);
				bracket_expression();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (OPEN_PARENS - 111)) | (1L << (DOT - 111)) | (1L << (OP_INC - 111)) | (1L << (OP_DEC - 111)) | (1L << (OP_PTR - 111)))) != 0)) {
				{
				{
				setState(313);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(307);
					member_access();
					}
					break;
				case OPEN_PARENS:
					{
					setState(308);
					method_invocation();
					}
					break;
				case OP_INC:
					{
					setState(309);
					match(OP_INC);
					}
					break;
				case OP_DEC:
					{
					setState(310);
					match(OP_DEC);
					}
					break;
				case OP_PTR:
					{
					setState(311);
					match(OP_PTR);
					setState(312);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_BRACKET) {
					{
					{
					setState(315);
					bracket_expression();
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expression_startContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Predefined_typeContext predefined_type() {
			return getRuleContext(Predefined_typeContext.class,0);
		}
		public This_accessContext this_access() {
			return getRuleContext(This_accessContext.class,0);
		}
		public Base_accessContext base_access() {
			return getRuleContext(Base_accessContext.class,0);
		}
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Method_invocationContext method_invocation() {
			return getRuleContext(Method_invocationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Primary_expression_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterPrimary_expression_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitPrimary_expression_start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitPrimary_expression_start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expression_startContext primary_expression_start() throws RecognitionException {
		Primary_expression_startContext _localctx = new Primary_expression_startContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primary_expression_start);
		try {
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				simple_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				parenthesized_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				predefined_type();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				this_access();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(331);
				base_access();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(332);
				match(NEW);
				setState(333);
				type();
				setState(334);
				method_invocation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(336);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bracket_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public Bracket_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterBracket_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitBracket_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitBracket_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bracket_expressionContext bracket_expression() throws RecognitionException {
		Bracket_expressionContext _localctx = new Bracket_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bracket_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(OPEN_BRACKET);
			setState(340);
			expression_list();
			setState(341);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public Simple_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterSimple_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitSimple_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitSimple_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_nameContext simple_name() throws RecognitionException {
		Simple_nameContext _localctx = new Simple_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simple_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			identifier();
			setState(344);
			type_argument_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parenthesized_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Parenthesized_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterParenthesized_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitParenthesized_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitParenthesized_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parenthesized_expressionContext parenthesized_expression() throws RecognitionException {
		Parenthesized_expressionContext _localctx = new Parenthesized_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parenthesized_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(OPEN_PARENS);
			setState(347);
			expression();
			setState(348);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Predefined_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(CSharpParser.BOOL, 0); }
		public TerminalNode BYTE() { return getToken(CSharpParser.BYTE, 0); }
		public TerminalNode CHAR() { return getToken(CSharpParser.CHAR, 0); }
		public TerminalNode DECIMAL() { return getToken(CSharpParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(CSharpParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(CSharpParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(CSharpParser.INT, 0); }
		public TerminalNode LONG() { return getToken(CSharpParser.LONG, 0); }
		public TerminalNode OBJECT() { return getToken(CSharpParser.OBJECT, 0); }
		public TerminalNode SBYTE() { return getToken(CSharpParser.SBYTE, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode STRING() { return getToken(CSharpParser.STRING, 0); }
		public TerminalNode UINT() { return getToken(CSharpParser.UINT, 0); }
		public TerminalNode ULONG() { return getToken(CSharpParser.ULONG, 0); }
		public TerminalNode USHORT() { return getToken(CSharpParser.USHORT, 0); }
		public Predefined_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefined_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterPredefined_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitPredefined_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitPredefined_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Predefined_typeContext predefined_type() throws RecognitionException {
		Predefined_typeContext _localctx = new Predefined_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_predefined_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OBJECT - 64)) | (1L << (SBYTE - 64)) | (1L << (SHORT - 64)) | (1L << (STRING - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (USHORT - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			expression();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(353);
				match(COMMA);
				setState(354);
				expression();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class This_accessContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public This_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_this_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterThis_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitThis_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitThis_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final This_accessContext this_access() throws RecognitionException {
		This_accessContext _localctx = new This_accessContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_this_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_accessContext extends ParserRuleContext {
		public TerminalNode BASE() { return getToken(CSharpParser.BASE, 0); }
		public TerminalNode DOT() { return getToken(CSharpParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public Base_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterBase_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitBase_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitBase_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_accessContext base_access() throws RecognitionException {
		Base_accessContext _localctx = new Base_accessContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_base_access);
		try {
			setState(372);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(BASE);
				setState(363);
				match(DOT);
				setState(364);
				identifier();
				setState(365);
				type_argument_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(BASE);
				setState(368);
				match(OPEN_BRACKET);
				setState(369);
				expression_list();
				setState(370);
				match(CLOSE_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Member_initializer_listContext member_initializer_list() {
			return getRuleContext(Member_initializer_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CSharpParser.COMMA, 0); }
		public Object_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterObject_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitObject_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitObject_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_initializerContext object_initializer() throws RecognitionException {
		Object_initializerContext _localctx = new Object_initializerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_object_initializer);
		int _la;
		try {
			setState(383);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(OPEN_BRACE);
				setState(375);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(OPEN_BRACE);
				setState(377);
				member_initializer_list();
				setState(379);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(378);
					match(COMMA);
					}
				}

				setState(381);
				match(CLOSE_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_initializer_listContext extends ParserRuleContext {
		public List<Member_initializerContext> member_initializer() {
			return getRuleContexts(Member_initializerContext.class);
		}
		public Member_initializerContext member_initializer(int i) {
			return getRuleContext(Member_initializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Member_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterMember_initializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitMember_initializer_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitMember_initializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_initializer_listContext member_initializer_list() throws RecognitionException {
		Member_initializer_listContext _localctx = new Member_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_member_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			member_initializer();
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(386);
					match(COMMA);
					setState(387);
					member_initializer();
					}
					} 
				}
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_initializerContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public Initializer_valueContext initializer_value() {
			return getRuleContext(Initializer_valueContext.class,0);
		}
		public Member_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterMember_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitMember_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitMember_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_initializerContext member_initializer() throws RecognitionException {
		Member_initializerContext _localctx = new Member_initializerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_member_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			identifier();
			setState(394);
			match(ASSIGNMENT);
			setState(395);
			initializer_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_valueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Object_initializerContext object_initializer() {
			return getRuleContext(Object_initializerContext.class,0);
		}
		public Initializer_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterInitializer_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitInitializer_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitInitializer_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_valueContext initializer_value() throws RecognitionException {
		Initializer_valueContext _localctx = new Initializer_valueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_initializer_value);
		try {
			setState(399);
			switch (_input.LA(1)) {
			case BASE:
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FALSE:
			case FLOAT:
			case FROM:
			case INT:
			case JOIN:
			case LET:
			case LONG:
			case NEW:
			case NULL:
			case OBJECT:
			case SBYTE:
			case SHORT:
			case STRING:
			case THIS:
			case TRUE:
			case UINT:
			case ULONG:
			case USHORT:
			case WHERE:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case IDENTIFIER:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				object_initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CSharpParser.PLUS, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CSharpParser.MINUS, 0); }
		public TerminalNode BANG() { return getToken(CSharpParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(CSharpParser.TILDE, 0); }
		public Pre_increment_expressionContext pre_increment_expression() {
			return getRuleContext(Pre_increment_expressionContext.class,0);
		}
		public Pre_decrement_expressionContext pre_decrement_expression() {
			return getRuleContext(Pre_decrement_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unary_expression);
		try {
			setState(413);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				cast_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				primary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				match(PLUS);
				setState(404);
				unary_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(405);
				match(MINUS);
				setState(406);
				unary_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(407);
				match(BANG);
				setState(408);
				unary_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(409);
				match(TILDE);
				setState(410);
				unary_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(411);
				pre_increment_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(412);
				pre_decrement_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_increment_expressionContext extends ParserRuleContext {
		public TerminalNode OP_INC() { return getToken(CSharpParser.OP_INC, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Pre_increment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_increment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterPre_increment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitPre_increment_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitPre_increment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pre_increment_expressionContext pre_increment_expression() throws RecognitionException {
		Pre_increment_expressionContext _localctx = new Pre_increment_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pre_increment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(OP_INC);
			setState(416);
			unary_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_decrement_expressionContext extends ParserRuleContext {
		public TerminalNode OP_DEC() { return getToken(CSharpParser.OP_DEC, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Pre_decrement_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_decrement_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterPre_decrement_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitPre_decrement_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitPre_decrement_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pre_decrement_expressionContext pre_decrement_expression() throws RecognitionException {
		Pre_decrement_expressionContext _localctx = new Pre_decrement_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_pre_decrement_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(OP_DEC);
			setState(419);
			unary_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitCast_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitCast_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cast_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(OPEN_PARENS);
			setState(422);
			type();
			setState(423);
			match(CLOSE_PARENS);
			setState(424);
			unary_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(CSharpParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(CSharpParser.STAR, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CSharpParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CSharpParser.DIV, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(CSharpParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(CSharpParser.PERCENT, i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitMultiplicative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			unary_expression();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (STAR - 119)) | (1L << (DIV - 119)) | (1L << (PERCENT - 119)))) != 0)) {
				{
				setState(433);
				switch (_input.LA(1)) {
				case STAR:
					{
					{
					setState(427);
					match(STAR);
					setState(428);
					unary_expression();
					}
					}
					break;
				case DIV:
					{
					{
					setState(429);
					match(DIV);
					setState(430);
					unary_expression();
					}
					}
					break;
				case PERCENT:
					{
					{
					setState(431);
					match(PERCENT);
					setState(432);
					unary_expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CSharpParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CSharpParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CSharpParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CSharpParser.MINUS, i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitAdditive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitAdditive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			multiplicative_expression();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(443);
				switch (_input.LA(1)) {
				case PLUS:
					{
					{
					setState(439);
					match(PLUS);
					setState(440);
					multiplicative_expression();
					}
					}
					break;
				case MINUS:
					{
					{
					setState(441);
					match(MINUS);
					setState(442);
					multiplicative_expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<TerminalNode> OP_LEFT_SHIFT() { return getTokens(CSharpParser.OP_LEFT_SHIFT); }
		public TerminalNode OP_LEFT_SHIFT(int i) {
			return getToken(CSharpParser.OP_LEFT_SHIFT, i);
		}
		public List<Right_shiftContext> right_shift() {
			return getRuleContexts(Right_shiftContext.class);
		}
		public Right_shiftContext right_shift(int i) {
			return getRuleContext(Right_shiftContext.class,i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_shift_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			additive_expression();
			setState(456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(454);
					switch (_input.LA(1)) {
					case OP_LEFT_SHIFT:
						{
						{
						setState(449);
						match(OP_LEFT_SHIFT);
						setState(450);
						additive_expression();
						}
						}
						break;
					case GT:
						{
						{
						setState(451);
						right_shift();
						setState(452);
						additive_expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(CSharpParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CSharpParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(CSharpParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CSharpParser.GT, i);
		}
		public List<TerminalNode> OP_LE() { return getTokens(CSharpParser.OP_LE); }
		public TerminalNode OP_LE(int i) {
			return getToken(CSharpParser.OP_LE, i);
		}
		public List<TerminalNode> OP_GE() { return getTokens(CSharpParser.OP_GE); }
		public TerminalNode OP_GE(int i) {
			return getToken(CSharpParser.OP_GE, i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			shift_expression();
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LT - 128)) | (1L << (GT - 128)) | (1L << (OP_LE - 128)) | (1L << (OP_GE - 128)))) != 0)) {
				{
				setState(468);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(460);
					match(LT);
					setState(461);
					shift_expression();
					}
					break;
				case GT:
					{
					setState(462);
					match(GT);
					setState(463);
					shift_expression();
					}
					break;
				case OP_LE:
					{
					setState(464);
					match(OP_LE);
					setState(465);
					shift_expression();
					}
					break;
				case OP_GE:
					{
					setState(466);
					match(OP_GE);
					setState(467);
					shift_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public List<TerminalNode> OP_EQ() { return getTokens(CSharpParser.OP_EQ); }
		public TerminalNode OP_EQ(int i) {
			return getToken(CSharpParser.OP_EQ, i);
		}
		public List<TerminalNode> OP_NE() { return getTokens(CSharpParser.OP_NE); }
		public TerminalNode OP_NE(int i) {
			return getToken(CSharpParser.OP_NE, i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			relational_expression();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_EQ || _la==OP_NE) {
				{
				setState(478);
				switch (_input.LA(1)) {
				case OP_EQ:
					{
					{
					setState(474);
					match(OP_EQ);
					setState(475);
					relational_expression();
					}
					}
					break;
				case OP_NE:
					{
					{
					setState(476);
					match(OP_NE);
					setState(477);
					relational_expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_expressionContext extends ParserRuleContext {
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<TerminalNode> AMP() { return getTokens(CSharpParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(CSharpParser.AMP, i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			equality_expression();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(484);
				match(AMP);
				setState(485);
				equality_expression();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(CSharpParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(CSharpParser.CARET, i);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitExclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitExclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			and_expression();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(492);
				match(CARET);
				setState(493);
				and_expression();
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public List<Exclusive_or_expressionContext> exclusive_or_expression() {
			return getRuleContexts(Exclusive_or_expressionContext.class);
		}
		public Exclusive_or_expressionContext exclusive_or_expression(int i) {
			return getRuleContext(Exclusive_or_expressionContext.class,i);
		}
		public List<TerminalNode> BITWISE_OR() { return getTokens(CSharpParser.BITWISE_OR); }
		public TerminalNode BITWISE_OR(int i) {
			return getToken(CSharpParser.BITWISE_OR, i);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitInclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitInclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			exclusive_or_expression();
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITWISE_OR) {
				{
				{
				setState(500);
				match(BITWISE_OR);
				setState(501);
				exclusive_or_expression();
				}
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_and_expressionContext extends ParserRuleContext {
		public List<Inclusive_or_expressionContext> inclusive_or_expression() {
			return getRuleContexts(Inclusive_or_expressionContext.class);
		}
		public Inclusive_or_expressionContext inclusive_or_expression(int i) {
			return getRuleContext(Inclusive_or_expressionContext.class,i);
		}
		public List<TerminalNode> OP_AND() { return getTokens(CSharpParser.OP_AND); }
		public TerminalNode OP_AND(int i) {
			return getToken(CSharpParser.OP_AND, i);
		}
		public Conditional_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterConditional_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitConditional_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitConditional_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_and_expressionContext conditional_and_expression() throws RecognitionException {
		Conditional_and_expressionContext _localctx = new Conditional_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_conditional_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			inclusive_or_expression();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AND) {
				{
				{
				setState(508);
				match(OP_AND);
				setState(509);
				inclusive_or_expression();
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_or_expressionContext extends ParserRuleContext {
		public List<Conditional_and_expressionContext> conditional_and_expression() {
			return getRuleContexts(Conditional_and_expressionContext.class);
		}
		public Conditional_and_expressionContext conditional_and_expression(int i) {
			return getRuleContext(Conditional_and_expressionContext.class,i);
		}
		public List<TerminalNode> OP_OR() { return getTokens(CSharpParser.OP_OR); }
		public TerminalNode OP_OR(int i) {
			return getToken(CSharpParser.OP_OR, i);
		}
		public Conditional_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterConditional_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitConditional_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitConditional_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_or_expressionContext conditional_or_expression() throws RecognitionException {
		Conditional_or_expressionContext _localctx = new Conditional_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_conditional_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			conditional_and_expression();
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OR) {
				{
				{
				setState(516);
				match(OP_OR);
				setState(517);
				conditional_and_expression();
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_coalescing_expressionContext extends ParserRuleContext {
		public Conditional_or_expressionContext conditional_or_expression() {
			return getRuleContext(Conditional_or_expressionContext.class,0);
		}
		public TerminalNode OP_COALESCING() { return getToken(CSharpParser.OP_COALESCING, 0); }
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public Null_coalescing_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_coalescing_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterNull_coalescing_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitNull_coalescing_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitNull_coalescing_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_coalescing_expressionContext null_coalescing_expression() throws RecognitionException {
		Null_coalescing_expressionContext _localctx = new Null_coalescing_expressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_null_coalescing_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			conditional_or_expression();
			setState(526);
			_la = _input.LA(1);
			if (_la==OP_COALESCING) {
				{
				setState(524);
				match(OP_COALESCING);
				setState(525);
				null_coalescing_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public TerminalNode INTERR() { return getToken(CSharpParser.INTERR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitConditional_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitConditional_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_conditional_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			null_coalescing_expression();
			setState(534);
			_la = _input.LA(1);
			if (_la==INTERR) {
				{
				setState(529);
				match(INTERR);
				setState(530);
				expression();
				setState(531);
				match(COLON);
				setState(532);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			unary_expression();
			setState(537);
			assignment_operator();
			setState(538);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public TerminalNode OP_ADD_ASSIGNMENT() { return getToken(CSharpParser.OP_ADD_ASSIGNMENT, 0); }
		public TerminalNode OP_SUB_ASSIGNMENT() { return getToken(CSharpParser.OP_SUB_ASSIGNMENT, 0); }
		public TerminalNode OP_MULT_ASSIGNMENT() { return getToken(CSharpParser.OP_MULT_ASSIGNMENT, 0); }
		public TerminalNode OP_DIV_ASSIGNMENT() { return getToken(CSharpParser.OP_DIV_ASSIGNMENT, 0); }
		public TerminalNode OP_MOD_ASSIGNMENT() { return getToken(CSharpParser.OP_MOD_ASSIGNMENT, 0); }
		public TerminalNode OP_AND_ASSIGNMENT() { return getToken(CSharpParser.OP_AND_ASSIGNMENT, 0); }
		public TerminalNode OP_OR_ASSIGNMENT() { return getToken(CSharpParser.OP_OR_ASSIGNMENT, 0); }
		public TerminalNode OP_XOR_ASSIGNMENT() { return getToken(CSharpParser.OP_XOR_ASSIGNMENT, 0); }
		public TerminalNode OP_LEFT_SHIFT_ASSIGNMENT() { return getToken(CSharpParser.OP_LEFT_SHIFT_ASSIGNMENT, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_la = _input.LA(1);
			if ( !(((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (ASSIGNMENT - 127)) | (1L << (OP_ADD_ASSIGNMENT - 127)) | (1L << (OP_SUB_ASSIGNMENT - 127)) | (1L << (OP_MULT_ASSIGNMENT - 127)) | (1L << (OP_DIV_ASSIGNMENT - 127)) | (1L << (OP_MOD_ASSIGNMENT - 127)) | (1L << (OP_AND_ASSIGNMENT - 127)) | (1L << (OP_OR_ASSIGNMENT - 127)) | (1L << (OP_XOR_ASSIGNMENT - 127)) | (1L << (OP_LEFT_SHIFT_ASSIGNMENT - 127)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expression);
		try {
			setState(544);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				conditional_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Embedded_statementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_embedded_statementContext simple_embedded_statement() {
			return getRuleContext(Simple_embedded_statementContext.class,0);
		}
		public Embedded_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embedded_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterEmbedded_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitEmbedded_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitEmbedded_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Embedded_statementContext embedded_statement() throws RecognitionException {
		Embedded_statementContext _localctx = new Embedded_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_embedded_statement);
		try {
			setState(548);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				block();
				}
				break;
			case BASE:
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FALSE:
			case FLOAT:
			case FOR:
			case FROM:
			case IF:
			case INT:
			case JOIN:
			case LET:
			case LONG:
			case NEW:
			case NULL:
			case OBJECT:
			case RETURN:
			case SBYTE:
			case SHORT:
			case STRING:
			case SWITCH:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case UINT:
			case ULONG:
			case USHORT:
			case WHERE:
			case WHILE:
			case YIELD:
			case OPEN_PARENS:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case IDENTIFIER:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				simple_embedded_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(OPEN_BRACE);
			setState(552);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASE) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << FALSE) | (1L << FLOAT) | (1L << FOR) | (1L << FROM) | (1L << IF) | (1L << INT) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NEW) | (1L << NULL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OBJECT - 64)) | (1L << (RETURN - 64)) | (1L << (SBYTE - 64)) | (1L << (SHORT - 64)) | (1L << (STRING - 64)) | (1L << (SWITCH - 64)) | (1L << (THIS - 64)) | (1L << (THROW - 64)) | (1L << (TRUE - 64)) | (1L << (TRY - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (USHORT - 64)) | (1L << (VOID - 64)) | (1L << (WHERE - 64)) | (1L << (WHILE - 64)) | (1L << (YIELD - 64)) | (1L << (OPEN_BRACE - 64)) | (1L << (OPEN_PARENS - 64)) | (1L << (SEMICOLON - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OP_INC - 133)) | (1L << (OP_DEC - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (INTEGER_LITERAL - 133)) | (1L << (REAL_LITERAL - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (STRING_LITERAL - 133)))) != 0)) {
				{
				setState(551);
				statement_list();
				}
			}

			setState(554);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitStatement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitStatement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(556);
				statement();
				}
				}
				setState(559); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASE) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << FALSE) | (1L << FLOAT) | (1L << FOR) | (1L << FROM) | (1L << IF) | (1L << INT) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NEW) | (1L << NULL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OBJECT - 64)) | (1L << (RETURN - 64)) | (1L << (SBYTE - 64)) | (1L << (SHORT - 64)) | (1L << (STRING - 64)) | (1L << (SWITCH - 64)) | (1L << (THIS - 64)) | (1L << (THROW - 64)) | (1L << (TRUE - 64)) | (1L << (TRY - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (USHORT - 64)) | (1L << (VOID - 64)) | (1L << (WHERE - 64)) | (1L << (WHILE - 64)) | (1L << (YIELD - 64)) | (1L << (OPEN_BRACE - 64)) | (1L << (OPEN_PARENS - 64)) | (1L << (SEMICOLON - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OP_INC - 133)) | (1L << (OP_DEC - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (INTEGER_LITERAL - 133)) | (1L << (REAL_LITERAL - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (STRING_LITERAL - 133)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Variable_statementContext variable_statement() {
			return getRuleContext(Variable_statementContext.class,0);
		}
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_statement);
		try {
			setState(563);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				variable_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				embedded_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_statementContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Variable_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterVariable_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitVariable_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitVariable_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_statementContext variable_statement() throws RecognitionException {
		Variable_statementContext _localctx = new Variable_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_variable_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			local_variable_declaration();
			setState(566);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_declarationContext extends ParserRuleContext {
		public Local_variable_declaratorsContext local_variable_declarators() {
			return getRuleContext(Local_variable_declaratorsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Local_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterLocal_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitLocal_variable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitLocal_variable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_variable_declarationContext local_variable_declaration() throws RecognitionException {
		Local_variable_declarationContext _localctx = new Local_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_local_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(568);
				type();
				}
				break;
			}
			setState(571);
			local_variable_declarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_declaratorsContext extends ParserRuleContext {
		public List<Local_variable_declaratorContext> local_variable_declarator() {
			return getRuleContexts(Local_variable_declaratorContext.class);
		}
		public Local_variable_declaratorContext local_variable_declarator(int i) {
			return getRuleContext(Local_variable_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Local_variable_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterLocal_variable_declarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitLocal_variable_declarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitLocal_variable_declarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_variable_declaratorsContext local_variable_declarators() throws RecognitionException {
		Local_variable_declaratorsContext _localctx = new Local_variable_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_local_variable_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			local_variable_declarator();
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(574);
				match(COMMA);
				setState(575);
				local_variable_declarator();
				}
				}
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Local_variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterLocal_variable_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitLocal_variable_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitLocal_variable_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_variable_declaratorContext local_variable_declarator() throws RecognitionException {
		Local_variable_declaratorContext _localctx = new Local_variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_local_variable_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			identifier();
			setState(584);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(582);
				match(ASSIGNMENT);
				setState(583);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_embedded_statementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Throw_statementContext throw_statement() {
			return getRuleContext(Throw_statementContext.class,0);
		}
		public Try_statementContext try_statement() {
			return getRuleContext(Try_statementContext.class,0);
		}
		public Yield_statementContext yield_statement() {
			return getRuleContext(Yield_statementContext.class,0);
		}
		public Simple_embedded_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_embedded_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterSimple_embedded_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitSimple_embedded_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitSimple_embedded_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_embedded_statementContext simple_embedded_statement() throws RecognitionException {
		Simple_embedded_statementContext _localctx = new Simple_embedded_statementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_simple_embedded_statement);
		try {
			setState(598);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(SEMICOLON);
				}
				break;
			case BASE:
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FALSE:
			case FLOAT:
			case FROM:
			case INT:
			case JOIN:
			case LET:
			case LONG:
			case NEW:
			case NULL:
			case OBJECT:
			case SBYTE:
			case SHORT:
			case STRING:
			case THIS:
			case TRUE:
			case UINT:
			case ULONG:
			case USHORT:
			case WHERE:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case IDENTIFIER:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				expression();
				setState(588);
				match(SEMICOLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				if_statement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				switch_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(592);
				while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(593);
				for_statement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(594);
				return_statement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 8);
				{
				setState(595);
				throw_statement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 9);
				{
				setState(596);
				try_statement();
				}
				break;
			case YIELD:
				enterOuterAlt(_localctx, 10);
				{
				setState(597);
				yield_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_bodyContext extends ParserRuleContext {
		public If_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_body; }
	 
		public If_bodyContext() { }
		public void copyFrom(If_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfBodyBlockContext extends If_bodyContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfBodyBlockContext(If_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterIfBodyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitIfBodyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitIfBodyBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfBodySingleContext extends If_bodyContext {
		public Simple_embedded_statementContext simple_embedded_statement() {
			return getRuleContext(Simple_embedded_statementContext.class,0);
		}
		public IfBodySingleContext(If_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterIfBodySingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitIfBodySingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitIfBodySingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bodyContext if_body() throws RecognitionException {
		If_bodyContext _localctx = new If_bodyContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_if_body);
		try {
			setState(602);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				_localctx = new IfBodyBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				block();
				}
				break;
			case BASE:
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FALSE:
			case FLOAT:
			case FOR:
			case FROM:
			case IF:
			case INT:
			case JOIN:
			case LET:
			case LONG:
			case NEW:
			case NULL:
			case OBJECT:
			case RETURN:
			case SBYTE:
			case SHORT:
			case STRING:
			case SWITCH:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case UINT:
			case ULONG:
			case USHORT:
			case WHERE:
			case WHILE:
			case YIELD:
			case OPEN_PARENS:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case IDENTIFIER:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
				_localctx = new IfBodySingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				simple_embedded_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CSharpParser.IF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public List<If_bodyContext> if_body() {
			return getRuleContexts(If_bodyContext.class);
		}
		public If_bodyContext if_body(int i) {
			return getRuleContext(If_bodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CSharpParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(IF);
			setState(605);
			match(OPEN_PARENS);
			setState(606);
			expression();
			setState(607);
			match(CLOSE_PARENS);
			setState(608);
			if_body();
			setState(611);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(609);
				match(ELSE);
				setState(610);
				if_body();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_statementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(CSharpParser.SWITCH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Switch_blockContext switch_block() {
			return getRuleContext(Switch_blockContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(SWITCH);
			setState(614);
			match(OPEN_PARENS);
			setState(615);
			expression();
			setState(616);
			match(CLOSE_PARENS);
			setState(617);
			switch_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Switch_sectionsContext switch_sections() {
			return getRuleContext(Switch_sectionsContext.class,0);
		}
		public Switch_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterSwitch_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitSwitch_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitSwitch_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_blockContext switch_block() throws RecognitionException {
		Switch_blockContext _localctx = new Switch_blockContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_switch_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(OPEN_BRACE);
			setState(621);
			_la = _input.LA(1);
			if (_la==CASE || _la==DEFAULT) {
				{
				setState(620);
				switch_sections();
				}
			}

			setState(623);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_sectionsContext extends ParserRuleContext {
		public List<Switch_sectionContext> switch_section() {
			return getRuleContexts(Switch_sectionContext.class);
		}
		public Switch_sectionContext switch_section(int i) {
			return getRuleContext(Switch_sectionContext.class,i);
		}
		public Switch_sectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_sections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterSwitch_sections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitSwitch_sections(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitSwitch_sections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_sectionsContext switch_sections() throws RecognitionException {
		Switch_sectionsContext _localctx = new Switch_sectionsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_switch_sections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			switch_section();
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(626);
				switch_section();
				}
				}
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_sectionContext extends ParserRuleContext {
		public Switch_labelsContext switch_labels() {
			return getRuleContext(Switch_labelsContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Switch_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterSwitch_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitSwitch_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitSwitch_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_sectionContext switch_section() throws RecognitionException {
		Switch_sectionContext _localctx = new Switch_sectionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_switch_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			switch_labels();
			setState(633);
			statement_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_labelsContext extends ParserRuleContext {
		public List<Switch_labelContext> switch_label() {
			return getRuleContexts(Switch_labelContext.class);
		}
		public Switch_labelContext switch_label(int i) {
			return getRuleContext(Switch_labelContext.class,i);
		}
		public Switch_labelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_labels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterSwitch_labels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitSwitch_labels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitSwitch_labels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_labelsContext switch_labels() throws RecognitionException {
		Switch_labelsContext _localctx = new Switch_labelsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_switch_labels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			switch_label();
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(636);
				switch_label();
				}
				}
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_labelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CSharpParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public Switch_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterSwitch_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitSwitch_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitSwitch_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_labelContext switch_label() throws RecognitionException {
		Switch_labelContext _localctx = new Switch_labelContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_switch_label);
		try {
			setState(648);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				match(CASE);
				setState(643);
				expression();
				setState(644);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				match(DEFAULT);
				setState(647);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CSharpParser.WHILE, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(WHILE);
			setState(651);
			match(OPEN_PARENS);
			setState(652);
			expression();
			setState(653);
			match(CLOSE_PARENS);
			setState(654);
			embedded_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CSharpParser.FOR, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CSharpParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CSharpParser.SEMICOLON, i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public For_initializerContext for_initializer() {
			return getRuleContext(For_initializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(FOR);
			setState(657);
			match(OPEN_PARENS);
			setState(659);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASE) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << INT) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NEW) | (1L << NULL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OBJECT - 64)) | (1L << (SBYTE - 64)) | (1L << (SHORT - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (USHORT - 64)) | (1L << (VOID - 64)) | (1L << (WHERE - 64)) | (1L << (OPEN_PARENS - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OP_INC - 133)) | (1L << (OP_DEC - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (INTEGER_LITERAL - 133)) | (1L << (REAL_LITERAL - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (STRING_LITERAL - 133)))) != 0)) {
				{
				setState(658);
				for_initializer();
				}
			}

			setState(661);
			match(SEMICOLON);
			setState(663);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASE) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << INT) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NEW) | (1L << NULL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OBJECT - 64)) | (1L << (SBYTE - 64)) | (1L << (SHORT - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (USHORT - 64)) | (1L << (WHERE - 64)) | (1L << (OPEN_PARENS - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OP_INC - 133)) | (1L << (OP_DEC - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (INTEGER_LITERAL - 133)) | (1L << (REAL_LITERAL - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (STRING_LITERAL - 133)))) != 0)) {
				{
				setState(662);
				expression();
				}
			}

			setState(665);
			match(SEMICOLON);
			setState(667);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASE) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << INT) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NEW) | (1L << NULL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OBJECT - 64)) | (1L << (SBYTE - 64)) | (1L << (SHORT - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (USHORT - 64)) | (1L << (WHERE - 64)) | (1L << (OPEN_PARENS - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OP_INC - 133)) | (1L << (OP_DEC - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (INTEGER_LITERAL - 133)) | (1L << (REAL_LITERAL - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (STRING_LITERAL - 133)))) != 0)) {
				{
				setState(666);
				statement_expression_list();
				}
			}

			setState(669);
			match(CLOSE_PARENS);
			setState(670);
			embedded_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_initializerContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public For_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterFor_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitFor_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitFor_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initializerContext for_initializer() throws RecognitionException {
		For_initializerContext _localctx = new For_initializerContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_for_initializer);
		try {
			setState(674);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				local_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				statement_expression_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Statement_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterStatement_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitStatement_expression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitStatement_expression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_expression_listContext statement_expression_list() throws RecognitionException {
		Statement_expression_listContext _localctx = new Statement_expression_listContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_statement_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			expression();
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(677);
				match(COMMA);
				setState(678);
				expression();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(RETURN);
			setState(686);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASE) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << INT) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NEW) | (1L << NULL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OBJECT - 64)) | (1L << (SBYTE - 64)) | (1L << (SHORT - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (USHORT - 64)) | (1L << (WHERE - 64)) | (1L << (OPEN_PARENS - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OP_INC - 133)) | (1L << (OP_DEC - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (INTEGER_LITERAL - 133)) | (1L << (REAL_LITERAL - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (STRING_LITERAL - 133)))) != 0)) {
				{
				setState(685);
				expression();
				}
			}

			setState(688);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throw_statementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(CSharpParser.THROW, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Throw_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterThrow_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitThrow_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitThrow_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throw_statementContext throw_statement() throws RecognitionException {
		Throw_statementContext _localctx = new Throw_statementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_throw_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(THROW);
			setState(692);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASE) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << INT) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NEW) | (1L << NULL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OBJECT - 64)) | (1L << (SBYTE - 64)) | (1L << (SHORT - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (USHORT - 64)) | (1L << (WHERE - 64)) | (1L << (OPEN_PARENS - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OP_INC - 133)) | (1L << (OP_DEC - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (INTEGER_LITERAL - 133)) | (1L << (REAL_LITERAL - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (STRING_LITERAL - 133)))) != 0)) {
				{
				setState(691);
				expression();
				}
			}

			setState(694);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_statementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(CSharpParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Catch_clausesContext catch_clauses() {
			return getRuleContext(Catch_clausesContext.class,0);
		}
		public Finally_clauseContext finally_clause() {
			return getRuleContext(Finally_clauseContext.class,0);
		}
		public Try_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitTry_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitTry_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_statementContext try_statement() throws RecognitionException {
		Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_try_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(TRY);
			setState(697);
			block();
			setState(699);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(698);
				catch_clauses();
				}
			}

			setState(702);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(701);
				finally_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_clausesContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(CSharpParser.CATCH, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Catch_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterCatch_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitCatch_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitCatch_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_clausesContext catch_clauses() throws RecognitionException {
		Catch_clausesContext _localctx = new Catch_clausesContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_catch_clauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(CATCH);
			setState(705);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_clauseContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(CSharpParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterFinally_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitFinally_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitFinally_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_clauseContext finally_clause() throws RecognitionException {
		Finally_clauseContext _localctx = new Finally_clauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_finally_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(FINALLY);
			setState(708);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Yield_statementContext extends ParserRuleContext {
		public Yield_contextual_keywordContext yield_contextual_keyword() {
			return getRuleContext(Yield_contextual_keywordContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(CSharpParser.BREAK, 0); }
		public Yield_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterYield_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitYield_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitYield_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yield_statementContext yield_statement() throws RecognitionException {
		Yield_statementContext _localctx = new Yield_statementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_yield_statement);
		try {
			setState(719);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				yield_contextual_keyword();
				setState(711);
				match(RETURN);
				setState(712);
				expression();
				setState(713);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				yield_contextual_keyword();
				setState(716);
				match(BREAK);
				setState(717);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compilation_unitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CSharpParser.EOF, 0); }
		public TerminalNode BYTE_ORDER_MARK() { return getToken(CSharpParser.BYTE_ORDER_MARK, 0); }
		public Using_directivesContext using_directives() {
			return getRuleContext(Using_directivesContext.class,0);
		}
		public Namespace_member_declarationsContext namespace_member_declarations() {
			return getRuleContext(Namespace_member_declarationsContext.class,0);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterCompilation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitCompilation_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitCompilation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_compilation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			_la = _input.LA(1);
			if (_la==BYTE_ORDER_MARK) {
				{
				setState(721);
				match(BYTE_ORDER_MARK);
				}
			}

			setState(725);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(724);
				using_directives();
				}
			}

			setState(728);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << EXTERN) | (1L << INTERNAL) | (1L << NAMESPACE) | (1L << NEW))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (OVERRIDE - 69)) | (1L << (PARTIAL - 69)) | (1L << (PRIVATE - 69)) | (1L << (PROTECTED - 69)) | (1L << (PUBLIC - 69)) | (1L << (READONLY - 69)) | (1L << (SEALED - 69)) | (1L << (STATIC - 69)) | (1L << (UNSAFE - 69)) | (1L << (VIRTUAL - 69)) | (1L << (OPEN_BRACKET - 69)))) != 0)) {
				{
				setState(727);
				namespace_member_declarations();
				}
			}

			setState(730);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_directivesContext extends ParserRuleContext {
		public List<Using_directiveContext> using_directive() {
			return getRuleContexts(Using_directiveContext.class);
		}
		public Using_directiveContext using_directive(int i) {
			return getRuleContext(Using_directiveContext.class,i);
		}
		public Using_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterUsing_directives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitUsing_directives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitUsing_directives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_directivesContext using_directives() throws RecognitionException {
		Using_directivesContext _localctx = new Using_directivesContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_using_directives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(732);
				using_directive();
				}
				}
				setState(735); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USING );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_directiveContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Using_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterUsing_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitUsing_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitUsing_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_directiveContext using_directive() throws RecognitionException {
		Using_directiveContext _localctx = new Using_directiveContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_using_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(USING);
			setState(738);
			namespace_or_type_name();
			setState(739);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_identifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(CSharpParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CSharpParser.DOT, i);
		}
		public Qualified_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterQualified_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitQualified_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitQualified_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_identifierContext qualified_identifier() throws RecognitionException {
		Qualified_identifierContext _localctx = new Qualified_identifierContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_qualified_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			identifier();
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(742);
				match(DOT);
				setState(743);
				identifier();
				}
				}
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_member_declarationsContext extends ParserRuleContext {
		public List<Namespace_member_declarationContext> namespace_member_declaration() {
			return getRuleContexts(Namespace_member_declarationContext.class);
		}
		public Namespace_member_declarationContext namespace_member_declaration(int i) {
			return getRuleContext(Namespace_member_declarationContext.class,i);
		}
		public Namespace_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_member_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterNamespace_member_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitNamespace_member_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitNamespace_member_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_member_declarationsContext namespace_member_declarations() throws RecognitionException {
		Namespace_member_declarationsContext _localctx = new Namespace_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_namespace_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(749);
				namespace_member_declaration();
				}
				}
				setState(752); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << EXTERN) | (1L << INTERNAL) | (1L << NAMESPACE) | (1L << NEW))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (OVERRIDE - 69)) | (1L << (PARTIAL - 69)) | (1L << (PRIVATE - 69)) | (1L << (PROTECTED - 69)) | (1L << (PUBLIC - 69)) | (1L << (READONLY - 69)) | (1L << (SEALED - 69)) | (1L << (STATIC - 69)) | (1L << (UNSAFE - 69)) | (1L << (VIRTUAL - 69)) | (1L << (OPEN_BRACKET - 69)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_member_declarationContext extends ParserRuleContext {
		public Namespace_declarationContext namespace_declaration() {
			return getRuleContext(Namespace_declarationContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Namespace_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterNamespace_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitNamespace_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitNamespace_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_member_declarationContext namespace_member_declaration() throws RecognitionException {
		Namespace_member_declarationContext _localctx = new Namespace_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_namespace_member_declaration);
		try {
			setState(756);
			switch (_input.LA(1)) {
			case NAMESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				namespace_declaration();
				}
				break;
			case ABSTRACT:
			case CLASS:
			case EXTERN:
			case INTERNAL:
			case NEW:
			case OVERRIDE:
			case PARTIAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case READONLY:
			case SEALED:
			case STATIC:
			case UNSAFE:
			case VIRTUAL:
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				type_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_declarationContext extends ParserRuleContext {
		public Qualified_identifierContext qi;
		public TerminalNode NAMESPACE() { return getToken(CSharpParser.NAMESPACE, 0); }
		public Namespace_bodyContext namespace_body() {
			return getRuleContext(Namespace_bodyContext.class,0);
		}
		public Qualified_identifierContext qualified_identifier() {
			return getRuleContext(Qualified_identifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Namespace_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterNamespace_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitNamespace_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitNamespace_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_declarationContext namespace_declaration() throws RecognitionException {
		Namespace_declarationContext _localctx = new Namespace_declarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_namespace_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(NAMESPACE);
			setState(759);
			((Namespace_declarationContext)_localctx).qi = qualified_identifier();
			setState(760);
			namespace_body();
			setState(762);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(761);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Namespace_member_declarationsContext namespace_member_declarations() {
			return getRuleContext(Namespace_member_declarationsContext.class,0);
		}
		public Namespace_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterNamespace_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitNamespace_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitNamespace_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_bodyContext namespace_body() throws RecognitionException {
		Namespace_bodyContext _localctx = new Namespace_bodyContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_namespace_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(OPEN_BRACE);
			setState(766);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << EXTERN) | (1L << INTERNAL) | (1L << NAMESPACE) | (1L << NEW))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (OVERRIDE - 69)) | (1L << (PARTIAL - 69)) | (1L << (PRIVATE - 69)) | (1L << (PROTECTED - 69)) | (1L << (PUBLIC - 69)) | (1L << (READONLY - 69)) | (1L << (SEALED - 69)) | (1L << (STATIC - 69)) | (1L << (UNSAFE - 69)) | (1L << (VIRTUAL - 69)) | (1L << (OPEN_BRACKET - 69)))) != 0)) {
				{
				setState(765);
				namespace_member_declarations();
				}
			}

			setState(768);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_declarationContext extends ParserRuleContext {
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public Attribute_sectionsContext attribute_sections() {
			return getRuleContext(Attribute_sectionsContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterType_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitType_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitType_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(770);
				attribute_sections();
				}
			}

			setState(774);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << EXTERN) | (1L << INTERNAL) | (1L << NEW))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (OVERRIDE - 69)) | (1L << (PARTIAL - 69)) | (1L << (PRIVATE - 69)) | (1L << (PROTECTED - 69)) | (1L << (PUBLIC - 69)) | (1L << (READONLY - 69)) | (1L << (SEALED - 69)) | (1L << (STATIC - 69)) | (1L << (UNSAFE - 69)) | (1L << (VIRTUAL - 69)))) != 0)) {
				{
				setState(773);
				all_member_modifiers();
				}
			}

			setState(776);
			class_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameter_listContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CSharpParser.LT, 0); }
		public Type_parametersContext type_parameters() {
			return getRuleContext(Type_parametersContext.class,0);
		}
		public TerminalNode GT() { return getToken(CSharpParser.GT, 0); }
		public Type_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterType_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitType_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitType_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_parameter_listContext type_parameter_list() throws RecognitionException {
		Type_parameter_listContext _localctx = new Type_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_type_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(LT);
			setState(779);
			type_parameters();
			setState(780);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parametersContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<Attribute_sectionsContext> attribute_sections() {
			return getRuleContexts(Attribute_sectionsContext.class);
		}
		public Attribute_sectionsContext attribute_sections(int i) {
			return getRuleContext(Attribute_sectionsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Type_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterType_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitType_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitType_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_parametersContext type_parameters() throws RecognitionException {
		Type_parametersContext _localctx = new Type_parametersContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_type_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(782);
				attribute_sections();
				}
			}

			setState(785);
			identifier();
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(786);
				match(COMMA);
				setState(788);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(787);
					attribute_sections();
					}
				}

				setState(790);
				identifier();
				}
				}
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_member_modifiersContext extends ParserRuleContext {
		public All_member_modifierContext m;
		public List<All_member_modifierContext> all_member_modifier() {
			return getRuleContexts(All_member_modifierContext.class);
		}
		public All_member_modifierContext all_member_modifier(int i) {
			return getRuleContext(All_member_modifierContext.class,i);
		}
		public All_member_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_member_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterAll_member_modifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitAll_member_modifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitAll_member_modifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_member_modifiersContext all_member_modifiers() throws RecognitionException {
		All_member_modifiersContext _localctx = new All_member_modifiersContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_all_member_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(797); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(796);
					((All_member_modifiersContext)_localctx).m = all_member_modifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(799); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_member_modifierContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode PUBLIC() { return getToken(CSharpParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(CSharpParser.PROTECTED, 0); }
		public TerminalNode INTERNAL() { return getToken(CSharpParser.INTERNAL, 0); }
		public TerminalNode PRIVATE() { return getToken(CSharpParser.PRIVATE, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public TerminalNode VIRTUAL() { return getToken(CSharpParser.VIRTUAL, 0); }
		public TerminalNode SEALED() { return getToken(CSharpParser.SEALED, 0); }
		public TerminalNode OVERRIDE() { return getToken(CSharpParser.OVERRIDE, 0); }
		public TerminalNode ABSTRACT() { return getToken(CSharpParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public TerminalNode EXTERN() { return getToken(CSharpParser.EXTERN, 0); }
		public Partial_contextual_keywordContext partial_contextual_keyword() {
			return getRuleContext(Partial_contextual_keywordContext.class,0);
		}
		public All_member_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_member_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterAll_member_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitAll_member_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitAll_member_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_member_modifierContext all_member_modifier() throws RecognitionException {
		All_member_modifierContext _localctx = new All_member_modifierContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_all_member_modifier);
		try {
			setState(815);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				match(NEW);
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(803);
				match(PROTECTED);
				}
				break;
			case INTERNAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(804);
				match(INTERNAL);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(805);
				match(PRIVATE);
				}
				break;
			case READONLY:
				enterOuterAlt(_localctx, 6);
				{
				setState(806);
				match(READONLY);
				}
				break;
			case VIRTUAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(807);
				match(VIRTUAL);
				}
				break;
			case SEALED:
				enterOuterAlt(_localctx, 8);
				{
				setState(808);
				match(SEALED);
				}
				break;
			case OVERRIDE:
				enterOuterAlt(_localctx, 9);
				{
				setState(809);
				match(OVERRIDE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 10);
				{
				setState(810);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 11);
				{
				setState(811);
				match(STATIC);
				}
				break;
			case UNSAFE:
				enterOuterAlt(_localctx, 12);
				{
				setState(812);
				match(UNSAFE);
				}
				break;
			case EXTERN:
				enterOuterAlt(_localctx, 13);
				{
				setState(813);
				match(EXTERN);
				}
				break;
			case PARTIAL:
				enterOuterAlt(_localctx, 14);
				{
				setState(814);
				partial_contextual_keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_definitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CSharpParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Class_baseContext class_base() {
			return getRuleContext(Class_baseContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterClass_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitClass_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitClass_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(CLASS);
			setState(818);
			identifier();
			setState(820);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(819);
				type_parameter_list();
				}
			}

			setState(823);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(822);
				class_base();
				}
			}

			setState(825);
			class_body();
			setState(827);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(826);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_baseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public Class_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterClass_base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitClass_base(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitClass_base(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_baseContext class_base() throws RecognitionException {
		Class_baseContext _localctx = new Class_baseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_class_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(COLON);
			setState(830);
			class_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Class_member_declarationsContext class_member_declarations() {
			return getRuleContext(Class_member_declarationsContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(OPEN_BRACE);
			setState(834);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EXTERN) | (1L << FLOAT) | (1L << FROM) | (1L << INT) | (1L << INTERNAL) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NEW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OBJECT - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARTIAL - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (SBYTE - 64)) | (1L << (SEALED - 64)) | (1L << (SHORT - 64)) | (1L << (STATIC - 64)) | (1L << (STRING - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNSAFE - 64)) | (1L << (USHORT - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOID - 64)) | (1L << (WHERE - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0) || _la==IDENTIFIER) {
				{
				setState(833);
				class_member_declarations();
				}
			}

			setState(836);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_member_declarationsContext extends ParserRuleContext {
		public List<Class_member_declarationContext> class_member_declaration() {
			return getRuleContexts(Class_member_declarationContext.class);
		}
		public Class_member_declarationContext class_member_declaration(int i) {
			return getRuleContext(Class_member_declarationContext.class,i);
		}
		public Class_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterClass_member_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitClass_member_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitClass_member_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_member_declarationsContext class_member_declarations() throws RecognitionException {
		Class_member_declarationsContext _localctx = new Class_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_class_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(838);
				class_member_declaration();
				}
				}
				setState(841); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EXTERN) | (1L << FLOAT) | (1L << FROM) | (1L << INT) | (1L << INTERNAL) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NEW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OBJECT - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARTIAL - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (SBYTE - 64)) | (1L << (SEALED - 64)) | (1L << (SHORT - 64)) | (1L << (STATIC - 64)) | (1L << (STRING - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNSAFE - 64)) | (1L << (USHORT - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOID - 64)) | (1L << (WHERE - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0) || _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_member_declarationContext extends ParserRuleContext {
		public Common_member_declarationContext common_member_declaration() {
			return getRuleContext(Common_member_declarationContext.class,0);
		}
		public Attribute_sectionsContext attribute_sections() {
			return getRuleContext(Attribute_sectionsContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public List<Variable_statementContext> variable_statement() {
			return getRuleContexts(Variable_statementContext.class);
		}
		public Variable_statementContext variable_statement(int i) {
			return getRuleContext(Variable_statementContext.class,i);
		}
		public Class_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterClass_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitClass_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitClass_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_member_declarationContext class_member_declaration() throws RecognitionException {
		Class_member_declarationContext _localctx = new Class_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_class_member_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(843);
				attribute_sections();
				}
			}

			setState(847);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(846);
				all_member_modifiers();
				}
				break;
			}
			setState(852);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(849);
					variable_statement();
					}
					} 
				}
				setState(854);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			setState(855);
			common_member_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_member_declarationContext extends ParserRuleContext {
		public Constructor_declarationContext constructor_declaration() {
			return getRuleContext(Constructor_declarationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public All_member_modifierContext all_member_modifier() {
			return getRuleContext(All_member_modifierContext.class,0);
		}
		public Common_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterCommon_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitCommon_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitCommon_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_member_declarationContext common_member_declaration() throws RecognitionException {
		Common_member_declarationContext _localctx = new Common_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_common_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << EXTERN) | (1L << INTERNAL) | (1L << NEW))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (OVERRIDE - 69)) | (1L << (PARTIAL - 69)) | (1L << (PRIVATE - 69)) | (1L << (PROTECTED - 69)) | (1L << (PUBLIC - 69)) | (1L << (READONLY - 69)) | (1L << (SEALED - 69)) | (1L << (STATIC - 69)) | (1L << (UNSAFE - 69)) | (1L << (VIRTUAL - 69)))) != 0)) {
				{
				setState(857);
				all_member_modifier();
				}
			}

			setState(864);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(860);
				constructor_declaration();
				}
				break;
			case 2:
				{
				setState(861);
				type();
				setState(862);
				method_declaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Fixed_parametersContext fixed_parameters() {
			return getRuleContext(Fixed_parametersContext.class,0);
		}
		public Constructor_initializerContext constructor_initializer() {
			return getRuleContext(Constructor_initializerContext.class,0);
		}
		public Constructor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterConstructor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitConstructor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitConstructor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_declarationContext constructor_declaration() throws RecognitionException {
		Constructor_declarationContext _localctx = new Constructor_declarationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_constructor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			identifier();
			setState(867);
			match(OPEN_PARENS);
			setState(869);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARGLIST) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << FLOAT) | (1L << FROM) | (1L << INT) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OBJECT - 64)) | (1L << (SBYTE - 64)) | (1L << (SHORT - 64)) | (1L << (STRING - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (USHORT - 64)) | (1L << (VOID - 64)) | (1L << (WHERE - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0) || _la==IDENTIFIER) {
				{
				setState(868);
				fixed_parameters();
				}
			}

			setState(871);
			match(CLOSE_PARENS);
			setState(873);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(872);
				constructor_initializer();
				}
			}

			setState(875);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declarationContext extends ParserRuleContext {
		public Method_member_nameContext method_member_name() {
			return getRuleContext(Method_member_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Fixed_parametersContext fixed_parameters() {
			return getRuleContext(Fixed_parametersContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitMethod_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitMethod_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			method_member_name();
			setState(879);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(878);
				type_parameter_list();
				}
			}

			setState(881);
			match(OPEN_PARENS);
			setState(883);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARGLIST) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << FLOAT) | (1L << FROM) | (1L << INT) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OBJECT - 64)) | (1L << (SBYTE - 64)) | (1L << (SHORT - 64)) | (1L << (STRING - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (USHORT - 64)) | (1L << (VOID - 64)) | (1L << (WHERE - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0) || _la==IDENTIFIER) {
				{
				setState(882);
				fixed_parameters();
				}
			}

			setState(885);
			match(CLOSE_PARENS);
			setState(886);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_member_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(CSharpParser.DOUBLE_COLON, 0); }
		public List<Type_argument_listContext> type_argument_list() {
			return getRuleContexts(Type_argument_listContext.class);
		}
		public Type_argument_listContext type_argument_list(int i) {
			return getRuleContext(Type_argument_listContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(CSharpParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CSharpParser.DOT, i);
		}
		public Method_member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_member_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterMethod_member_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitMethod_member_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitMethod_member_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_member_nameContext method_member_name() throws RecognitionException {
		Method_member_nameContext _localctx = new Method_member_nameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_method_member_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(888);
				identifier();
				}
				break;
			case 2:
				{
				setState(889);
				identifier();
				setState(890);
				match(DOUBLE_COLON);
				setState(891);
				identifier();
				}
				break;
			}
			setState(901);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(895);
					type_argument_list();
					setState(896);
					match(DOT);
					setState(897);
					identifier();
					}
					} 
				}
				setState(903);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_body);
		try {
			setState(906);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(904);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_parametersContext extends ParserRuleContext {
		public List<Fixed_parameterContext> fixed_parameter() {
			return getRuleContexts(Fixed_parameterContext.class);
		}
		public Fixed_parameterContext fixed_parameter(int i) {
			return getRuleContext(Fixed_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Fixed_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterFixed_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitFixed_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitFixed_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_parametersContext fixed_parameters() throws RecognitionException {
		Fixed_parametersContext _localctx = new Fixed_parametersContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_fixed_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			fixed_parameter();
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(909);
				match(COMMA);
				setState(910);
				fixed_parameter();
				}
				}
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_parameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Attribute_sectionsContext attribute_sections() {
			return getRuleContext(Attribute_sectionsContext.class,0);
		}
		public Default_argumentContext default_argument() {
			return getRuleContext(Default_argumentContext.class,0);
		}
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public Fixed_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterFixed_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitFixed_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitFixed_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_parameterContext fixed_parameter() throws RecognitionException {
		Fixed_parameterContext _localctx = new Fixed_parameterContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_fixed_parameter);
		int _la;
		try {
			setState(925);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case DYNAMIC:
			case FLOAT:
			case FROM:
			case INT:
			case JOIN:
			case LET:
			case LONG:
			case OBJECT:
			case SBYTE:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case USHORT:
			case VOID:
			case WHERE:
			case OPEN_BRACKET:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(916);
					attribute_sections();
					}
				}

				setState(919);
				type();
				setState(920);
				identifier();
				setState(922);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(921);
					default_argument();
					}
				}

				}
				break;
			case ARGLIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(924);
				arglist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_argumentContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Default_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterDefault_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitDefault_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitDefault_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_argumentContext default_argument() throws RecognitionException {
		Default_argumentContext _localctx = new Default_argumentContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_default_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(ASSIGNMENT);
			setState(928);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_initializerContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public TerminalNode BASE() { return getToken(CSharpParser.BASE, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public Constructor_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterConstructor_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitConstructor_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitConstructor_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_initializerContext constructor_initializer() throws RecognitionException {
		Constructor_initializerContext _localctx = new Constructor_initializerContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_constructor_initializer);
		int _la;
		try {
			setState(944);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(930);
				match(COLON);
				setState(931);
				match(BASE);
				setState(932);
				match(OPEN_PARENS);
				setState(934);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASE) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << INT) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NEW) | (1L << NULL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OBJECT - 64)) | (1L << (SBYTE - 64)) | (1L << (SHORT - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (USHORT - 64)) | (1L << (WHERE - 64)) | (1L << (OPEN_PARENS - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OP_INC - 133)) | (1L << (OP_DEC - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (INTEGER_LITERAL - 133)) | (1L << (REAL_LITERAL - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (STRING_LITERAL - 133)))) != 0)) {
					{
					setState(933);
					argument_list();
					}
				}

				setState(936);
				match(CLOSE_PARENS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(937);
				match(COLON);
				setState(938);
				match(THIS);
				setState(939);
				match(OPEN_PARENS);
				setState(941);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASE) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << INT) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NEW) | (1L << NULL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OBJECT - 64)) | (1L << (SBYTE - 64)) | (1L << (SHORT - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (USHORT - 64)) | (1L << (WHERE - 64)) | (1L << (OPEN_PARENS - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OP_INC - 133)) | (1L << (OP_DEC - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (INTEGER_LITERAL - 133)) | (1L << (REAL_LITERAL - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (STRING_LITERAL - 133)))) != 0)) {
					{
					setState(940);
					argument_list();
					}
				}

				setState(943);
				match(CLOSE_PARENS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_sectionsContext extends ParserRuleContext {
		public List<Attribute_sectionContext> attribute_section() {
			return getRuleContexts(Attribute_sectionContext.class);
		}
		public Attribute_sectionContext attribute_section(int i) {
			return getRuleContext(Attribute_sectionContext.class,i);
		}
		public Attribute_sectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_sections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterAttribute_sections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitAttribute_sections(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitAttribute_sections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_sectionsContext attribute_sections() throws RecognitionException {
		Attribute_sectionsContext _localctx = new Attribute_sectionsContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_attribute_sections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(946);
				attribute_section();
				}
				}
				setState(949); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_BRACKET );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_sectionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public Attribute_target_specifierContext attribute_target_specifier() {
			return getRuleContext(Attribute_target_specifierContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CSharpParser.COMMA, 0); }
		public Attribute_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterAttribute_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitAttribute_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitAttribute_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_sectionContext attribute_section() throws RecognitionException {
		Attribute_sectionContext _localctx = new Attribute_sectionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_attribute_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			match(OPEN_BRACKET);
			setState(953);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(952);
				attribute_target_specifier();
				}
				break;
			}
			setState(955);
			attribute_list();
			setState(957);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(956);
				match(COMMA);
				}
			}

			setState(959);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_target_specifierContext extends ParserRuleContext {
		public Attribute_targetContext attribute_target() {
			return getRuleContext(Attribute_targetContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Attribute_target_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_target_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterAttribute_target_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitAttribute_target_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitAttribute_target_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_target_specifierContext attribute_target_specifier() throws RecognitionException {
		Attribute_target_specifierContext _localctx = new Attribute_target_specifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_attribute_target_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			attribute_target();
			setState(962);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_targetContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Attribute_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterAttribute_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitAttribute_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitAttribute_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_targetContext attribute_target() throws RecognitionException {
		Attribute_targetContext _localctx = new Attribute_targetContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_attribute_target);
		try {
			setState(966);
			switch (_input.LA(1)) {
			case BREAK:
			case CASE:
			case CATCH:
			case CLASS:
			case CONTINUE:
			case DEFAULT:
			case DO:
			case ELSE:
			case FINALLY:
			case FOR:
			case FOREACH:
			case IF:
			case INTERFACE:
			case NAMESPACE:
			case NEW:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case RETURN:
			case SHORT:
			case STATIC:
			case STRING:
			case SWITCH:
			case THIS:
			case THROW:
			case TRY:
			case USING:
			case VOID:
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				keyword();
				}
				break;
			case FROM:
			case JOIN:
			case LET:
			case WHERE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_listContext extends ParserRuleContext {
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterAttribute_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitAttribute_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitAttribute_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_attribute_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			namespace_or_type_name();
			setState(973);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(969);
					match(COMMA);
					setState(970);
					namespace_or_type_name();
					}
					} 
				}
				setState(975);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partial_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode PARTIAL() { return getToken(CSharpParser.PARTIAL, 0); }
		public Partial_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partial_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterPartial_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitPartial_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitPartial_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partial_contextual_keywordContext partial_contextual_keyword() throws RecognitionException {
		Partial_contextual_keywordContext _localctx = new Partial_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_partial_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(PARTIAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Yield_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode YIELD() { return getToken(CSharpParser.YIELD, 0); }
		public Yield_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterYield_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitYield_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitYield_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yield_contextual_keywordContext yield_contextual_keyword() throws RecognitionException {
		Yield_contextual_keywordContext _localctx = new Yield_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_yield_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(YIELD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dynamic_contextual_keywordContext extends ParserRuleContext {
		public TerminalNode DYNAMIC() { return getToken(CSharpParser.DYNAMIC, 0); }
		public Dynamic_contextual_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_contextual_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterDynamic_contextual_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitDynamic_contextual_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitDynamic_contextual_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dynamic_contextual_keywordContext dynamic_contextual_keyword() throws RecognitionException {
		Dynamic_contextual_keywordContext _localctx = new Dynamic_contextual_keywordContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_dynamic_contextual_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			match(DYNAMIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArglistContext extends ParserRuleContext {
		public TerminalNode ARGLIST() { return getToken(CSharpParser.ARGLIST, 0); }
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_arglist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			match(ARGLIST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_shiftContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public List<TerminalNode> GT() { return getTokens(CSharpParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CSharpParser.GT, i);
		}
		public Right_shiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_shift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterRight_shift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitRight_shift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitRight_shift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_shiftContext right_shift() throws RecognitionException {
		Right_shiftContext _localctx = new Right_shiftContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_right_shift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			((Right_shiftContext)_localctx).first = match(GT);
			setState(985);
			((Right_shiftContext)_localctx).second = match(GT);
			setState(986);
			if (!((((Right_shiftContext)_localctx).first!=null?((Right_shiftContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shiftContext)_localctx).second!=null?((Right_shiftContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(CSharpParser.INTEGER_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(CSharpParser.REAL_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(CSharpParser.CHARACTER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CSharpParser.STRING_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(CSharpParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_literal);
		try {
			setState(994);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(988);
				boolean_literal();
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(989);
				match(INTEGER_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(990);
				match(REAL_LITERAL);
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(991);
				match(CHARACTER_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(992);
				match(STRING_LITERAL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(993);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CSharpParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CSharpParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CSharpParser.BREAK, 0); }
		public TerminalNode CASE() { return getToken(CSharpParser.CASE, 0); }
		public TerminalNode CATCH() { return getToken(CSharpParser.CATCH, 0); }
		public TerminalNode CLASS() { return getToken(CSharpParser.CLASS, 0); }
		public TerminalNode CONTINUE() { return getToken(CSharpParser.CONTINUE, 0); }
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public TerminalNode DO() { return getToken(CSharpParser.DO, 0); }
		public TerminalNode ELSE() { return getToken(CSharpParser.ELSE, 0); }
		public TerminalNode FINALLY() { return getToken(CSharpParser.FINALLY, 0); }
		public TerminalNode FOR() { return getToken(CSharpParser.FOR, 0); }
		public TerminalNode FOREACH() { return getToken(CSharpParser.FOREACH, 0); }
		public TerminalNode IF() { return getToken(CSharpParser.IF, 0); }
		public TerminalNode INTERFACE() { return getToken(CSharpParser.INTERFACE, 0); }
		public TerminalNode NAMESPACE() { return getToken(CSharpParser.NAMESPACE, 0); }
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode PRIVATE() { return getToken(CSharpParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(CSharpParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(CSharpParser.PUBLIC, 0); }
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public List<TerminalNode> STRING() { return getTokens(CSharpParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CSharpParser.STRING, i);
		}
		public TerminalNode SWITCH() { return getToken(CSharpParser.SWITCH, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public TerminalNode THROW() { return getToken(CSharpParser.THROW, 0); }
		public TerminalNode TRY() { return getToken(CSharpParser.TRY, 0); }
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public TerminalNode WHILE() { return getToken(CSharpParser.WHILE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CASE) | (1L << CATCH) | (1L << CLASS) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << ELSE) | (1L << FINALLY) | (1L << FOR) | (1L << FOREACH) | (1L << IF) | (1L << INTERFACE) | (1L << NAMESPACE) | (1L << NEW))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (PRIVATE - 72)) | (1L << (PROTECTED - 72)) | (1L << (PUBLIC - 72)) | (1L << (RETURN - 72)) | (1L << (SHORT - 72)) | (1L << (STATIC - 72)) | (1L << (STRING - 72)) | (1L << (SWITCH - 72)) | (1L << (THIS - 72)) | (1L << (THROW - 72)) | (1L << (TRY - 72)) | (1L << (USING - 72)) | (1L << (VOID - 72)) | (1L << (WHILE - 72)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_accessContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(CSharpParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public Member_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterMember_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitMember_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitMember_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_accessContext member_access() throws RecognitionException {
		Member_accessContext _localctx = new Member_accessContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_member_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(DOT);
			setState(1001);
			identifier();
			setState(1003);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1002);
				type_argument_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_invocationContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Method_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterMethod_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitMethod_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpVisitor ) return ((CSharpVisitor<? extends T>)visitor).visitMethod_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_invocationContext method_invocation() throws RecognitionException {
		Method_invocationContext _localctx = new Method_invocationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_method_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			match(OPEN_PARENS);
			setState(1007);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASE) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << INT) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NEW) | (1L << NULL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OBJECT - 64)) | (1L << (SBYTE - 64)) | (1L << (SHORT - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (USHORT - 64)) | (1L << (WHERE - 64)) | (1L << (OPEN_PARENS - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OP_INC - 133)) | (1L << (OP_DEC - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (INTEGER_LITERAL - 133)) | (1L << (REAL_LITERAL - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (STRING_LITERAL - 133)))) != 0)) {
				{
				setState(1006);
				argument_list();
				}
			}

			setState(1009);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 109:
			return right_shift_sempred((Right_shiftContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean right_shift_sempred(Right_shiftContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return (((Right_shiftContext)_localctx).first!=null?((Right_shiftContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shiftContext)_localctx).second!=null?((Right_shiftContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00a4\u03f6\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\7\3\u00f2\n\3\f\3\16\3\u00f5\13\3\3\4\3\4\5\4\u00f9"+
		"\n\4\3\5\3\5\3\5\5\5\u00fe\n\5\3\6\3\6\5\6\u0102\n\6\3\7\3\7\3\7\5\7\u0107"+
		"\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0111\n\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\7\f\u011a\n\f\f\f\16\f\u011d\13\f\3\r\3\r\3\r\7\r\u0122\n"+
		"\r\f\r\16\r\u0125\13\r\3\16\5\16\u0128\n\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\7\20\u0131\n\20\f\20\16\20\u0134\13\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u013c\n\20\3\20\7\20\u013f\n\20\f\20\16\20\u0142\13\20\7"+
		"\20\u0144\n\20\f\20\16\20\u0147\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u0154\n\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\7\26\u0166\n\26\f\26"+
		"\16\26\u0169\13\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u0177\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u017e\n\31\3\31"+
		"\3\31\5\31\u0182\n\31\3\32\3\32\3\32\7\32\u0187\n\32\f\32\16\32\u018a"+
		"\13\32\3\33\3\33\3\33\3\33\3\34\3\34\5\34\u0192\n\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01a0\n\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\7!\u01b4\n!\f"+
		"!\16!\u01b7\13!\3\"\3\"\3\"\3\"\3\"\7\"\u01be\n\"\f\"\16\"\u01c1\13\""+
		"\3#\3#\3#\3#\3#\3#\7#\u01c9\n#\f#\16#\u01cc\13#\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\7$\u01d7\n$\f$\16$\u01da\13$\3%\3%\3%\3%\3%\7%\u01e1\n%\f%\16%\u01e4"+
		"\13%\3&\3&\3&\7&\u01e9\n&\f&\16&\u01ec\13&\3\'\3\'\3\'\7\'\u01f1\n\'\f"+
		"\'\16\'\u01f4\13\'\3(\3(\3(\7(\u01f9\n(\f(\16(\u01fc\13(\3)\3)\3)\7)\u0201"+
		"\n)\f)\16)\u0204\13)\3*\3*\3*\7*\u0209\n*\f*\16*\u020c\13*\3+\3+\3+\5"+
		"+\u0211\n+\3,\3,\3,\3,\3,\3,\5,\u0219\n,\3-\3-\3-\3-\3.\3.\3/\3/\5/\u0223"+
		"\n/\3\60\3\60\5\60\u0227\n\60\3\61\3\61\5\61\u022b\n\61\3\61\3\61\3\62"+
		"\6\62\u0230\n\62\r\62\16\62\u0231\3\63\3\63\5\63\u0236\n\63\3\64\3\64"+
		"\3\64\3\65\5\65\u023c\n\65\3\65\3\65\3\66\3\66\3\66\7\66\u0243\n\66\f"+
		"\66\16\66\u0246\13\66\3\67\3\67\3\67\5\67\u024b\n\67\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\58\u0259\n8\39\39\59\u025d\n9\3:\3:\3:\3:\3:\3:\3"+
		":\5:\u0266\n:\3;\3;\3;\3;\3;\3;\3<\3<\5<\u0270\n<\3<\3<\3=\3=\7=\u0276"+
		"\n=\f=\16=\u0279\13=\3>\3>\3>\3?\3?\7?\u0280\n?\f?\16?\u0283\13?\3@\3"+
		"@\3@\3@\3@\3@\5@\u028b\n@\3A\3A\3A\3A\3A\3A\3B\3B\3B\5B\u0296\nB\3B\3"+
		"B\5B\u029a\nB\3B\3B\5B\u029e\nB\3B\3B\3B\3C\3C\5C\u02a5\nC\3D\3D\3D\7"+
		"D\u02aa\nD\fD\16D\u02ad\13D\3E\3E\5E\u02b1\nE\3E\3E\3F\3F\5F\u02b7\nF"+
		"\3F\3F\3G\3G\3G\5G\u02be\nG\3G\5G\u02c1\nG\3H\3H\3H\3I\3I\3I\3J\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\5J\u02d2\nJ\3K\5K\u02d5\nK\3K\5K\u02d8\nK\3K\5K\u02db"+
		"\nK\3K\3K\3L\6L\u02e0\nL\rL\16L\u02e1\3M\3M\3M\3M\3N\3N\3N\7N\u02eb\n"+
		"N\fN\16N\u02ee\13N\3O\6O\u02f1\nO\rO\16O\u02f2\3P\3P\5P\u02f7\nP\3Q\3"+
		"Q\3Q\3Q\5Q\u02fd\nQ\3R\3R\5R\u0301\nR\3R\3R\3S\5S\u0306\nS\3S\5S\u0309"+
		"\nS\3S\3S\3T\3T\3T\3T\3U\5U\u0312\nU\3U\3U\3U\5U\u0317\nU\3U\7U\u031a"+
		"\nU\fU\16U\u031d\13U\3V\6V\u0320\nV\rV\16V\u0321\3W\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\5W\u0332\nW\3X\3X\3X\5X\u0337\nX\3X\5X\u033a\nX"+
		"\3X\3X\5X\u033e\nX\3Y\3Y\3Y\3Z\3Z\5Z\u0345\nZ\3Z\3Z\3[\6[\u034a\n[\r["+
		"\16[\u034b\3\\\5\\\u034f\n\\\3\\\5\\\u0352\n\\\3\\\7\\\u0355\n\\\f\\\16"+
		"\\\u0358\13\\\3\\\3\\\3]\5]\u035d\n]\3]\3]\3]\3]\5]\u0363\n]\3^\3^\3^"+
		"\5^\u0368\n^\3^\3^\5^\u036c\n^\3^\3^\3_\3_\5_\u0372\n_\3_\3_\5_\u0376"+
		"\n_\3_\3_\3_\3`\3`\3`\3`\3`\5`\u0380\n`\3`\3`\3`\3`\7`\u0386\n`\f`\16"+
		"`\u0389\13`\3a\3a\5a\u038d\na\3b\3b\3b\7b\u0392\nb\fb\16b\u0395\13b\3"+
		"c\5c\u0398\nc\3c\3c\3c\5c\u039d\nc\3c\5c\u03a0\nc\3d\3d\3d\3e\3e\3e\3"+
		"e\5e\u03a9\ne\3e\3e\3e\3e\3e\5e\u03b0\ne\3e\5e\u03b3\ne\3f\6f\u03b6\n"+
		"f\rf\16f\u03b7\3g\3g\5g\u03bc\ng\3g\3g\5g\u03c0\ng\3g\3g\3h\3h\3h\3i\3"+
		"i\5i\u03c9\ni\3j\3j\3j\7j\u03ce\nj\fj\16j\u03d1\13j\3k\3k\3l\3l\3m\3m"+
		"\3n\3n\3o\3o\3o\3o\3p\3p\3p\3p\3p\3p\5p\u03e5\np\3q\3q\3r\3r\3s\3s\3s"+
		"\5s\u03ee\ns\3t\3t\5t\u03f2\nt\3t\3t\3t\2\2u\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\2\t\6\2//;<jj\u009f\u009f\n\2\24\24\27\27\66"+
		"\66>>QQUUabee\4\2!!,,\20\2\21\21\24\24\27\27\34\34!!,,\66\66>>BBQQUUY"+
		"Yabee\5\2\u0081\u0081\u0090\u0097\u0099\u0099\4\2))^^\27\2\22\22\25\26"+
		"\31\31\33\33\35\35  ##**-.\63\63\67\67?@JLPPUUXY[]__ffhhkk\u041f\2\u00e8"+
		"\3\2\2\2\4\u00ea\3\2\2\2\6\u00f8\3\2\2\2\b\u00fd\3\2\2\2\n\u0101\3\2\2"+
		"\2\f\u0106\3\2\2\2\16\u0108\3\2\2\2\20\u010a\3\2\2\2\22\u0110\3\2\2\2"+
		"\24\u0112\3\2\2\2\26\u0116\3\2\2\2\30\u011e\3\2\2\2\32\u0127\3\2\2\2\34"+
		"\u012b\3\2\2\2\36\u012e\3\2\2\2 \u0153\3\2\2\2\"\u0155\3\2\2\2$\u0159"+
		"\3\2\2\2&\u015c\3\2\2\2(\u0160\3\2\2\2*\u0162\3\2\2\2,\u016a\3\2\2\2."+
		"\u0176\3\2\2\2\60\u0181\3\2\2\2\62\u0183\3\2\2\2\64\u018b\3\2\2\2\66\u0191"+
		"\3\2\2\28\u019f\3\2\2\2:\u01a1\3\2\2\2<\u01a4\3\2\2\2>\u01a7\3\2\2\2@"+
		"\u01ac\3\2\2\2B\u01b8\3\2\2\2D\u01c2\3\2\2\2F\u01cd\3\2\2\2H\u01db\3\2"+
		"\2\2J\u01e5\3\2\2\2L\u01ed\3\2\2\2N\u01f5\3\2\2\2P\u01fd\3\2\2\2R\u0205"+
		"\3\2\2\2T\u020d\3\2\2\2V\u0212\3\2\2\2X\u021a\3\2\2\2Z\u021e\3\2\2\2\\"+
		"\u0222\3\2\2\2^\u0226\3\2\2\2`\u0228\3\2\2\2b\u022f\3\2\2\2d\u0235\3\2"+
		"\2\2f\u0237\3\2\2\2h\u023b\3\2\2\2j\u023f\3\2\2\2l\u0247\3\2\2\2n\u0258"+
		"\3\2\2\2p\u025c\3\2\2\2r\u025e\3\2\2\2t\u0267\3\2\2\2v\u026d\3\2\2\2x"+
		"\u0273\3\2\2\2z\u027a\3\2\2\2|\u027d\3\2\2\2~\u028a\3\2\2\2\u0080\u028c"+
		"\3\2\2\2\u0082\u0292\3\2\2\2\u0084\u02a4\3\2\2\2\u0086\u02a6\3\2\2\2\u0088"+
		"\u02ae\3\2\2\2\u008a\u02b4\3\2\2\2\u008c\u02ba\3\2\2\2\u008e\u02c2\3\2"+
		"\2\2\u0090\u02c5\3\2\2\2\u0092\u02d1\3\2\2\2\u0094\u02d4\3\2\2\2\u0096"+
		"\u02df\3\2\2\2\u0098\u02e3\3\2\2\2\u009a\u02e7\3\2\2\2\u009c\u02f0\3\2"+
		"\2\2\u009e\u02f6\3\2\2\2\u00a0\u02f8\3\2\2\2\u00a2\u02fe\3\2\2\2\u00a4"+
		"\u0305\3\2\2\2\u00a6\u030c\3\2\2\2\u00a8\u0311\3\2\2\2\u00aa\u031f\3\2"+
		"\2\2\u00ac\u0331\3\2\2\2\u00ae\u0333\3\2\2\2\u00b0\u033f\3\2\2\2\u00b2"+
		"\u0342\3\2\2\2\u00b4\u0349\3\2\2\2\u00b6\u034e\3\2\2\2\u00b8\u035c\3\2"+
		"\2\2\u00ba\u0364\3\2\2\2\u00bc\u036f\3\2\2\2\u00be\u037f\3\2\2\2\u00c0"+
		"\u038c\3\2\2\2\u00c2\u038e\3\2\2\2\u00c4\u039f\3\2\2\2\u00c6\u03a1\3\2"+
		"\2\2\u00c8\u03b2\3\2\2\2\u00ca\u03b5\3\2\2\2\u00cc\u03b9\3\2\2\2\u00ce"+
		"\u03c3\3\2\2\2\u00d0\u03c8\3\2\2\2\u00d2\u03ca\3\2\2\2\u00d4\u03d2\3\2"+
		"\2\2\u00d6\u03d4\3\2\2\2\u00d8\u03d6\3\2\2\2\u00da\u03d8\3\2\2\2\u00dc"+
		"\u03da\3\2\2\2\u00de\u03e4\3\2\2\2\u00e0\u03e6\3\2\2\2\u00e2\u03e8\3\2"+
		"\2\2\u00e4\u03ea\3\2\2\2\u00e6\u03ef\3\2\2\2\u00e8\u00e9\t\2\2\2\u00e9"+
		"\3\3\2\2\2\u00ea\u00eb\5\2\2\2\u00eb\u00ec\5\24\13\2\u00ec\u00f3\3\2\2"+
		"\2\u00ed\u00ee\7s\2\2\u00ee\u00ef\5\2\2\2\u00ef\u00f0\5\24\13\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9"+
		"\5\b\5\2\u00f7\u00f9\5\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\7\3\2\2\2\u00fa\u00fe\5\n\6\2\u00fb\u00fe\5\22\n\2\u00fc\u00fe\7h\2\2"+
		"\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\t\3"+
		"\2\2\2\u00ff\u0102\5\f\7\2\u0100\u0102\7\21\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0100\3\2\2\2\u0102\13\3\2\2\2\u0103\u0107\5\16\b\2\u0104\u0107\5\20"+
		"\t\2\u0105\u0107\7\34\2\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0105\3\2\2\2\u0107\r\3\2\2\2\u0108\u0109\t\3\2\2\u0109\17\3\2\2\2\u010a"+
		"\u010b\t\4\2\2\u010b\21\3\2\2\2\u010c\u0111\5\4\3\2\u010d\u0111\7B\2\2"+
		"\u010e\u0111\5\u00d8m\2\u010f\u0111\7Y\2\2\u0110\u010c\3\2\2\2\u0110\u010d"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\23\3\2\2\2\u0112"+
		"\u0113\7\u0082\2\2\u0113\u0114\5\26\f\2\u0114\u0115\7\u0083\2\2\u0115"+
		"\25\3\2\2\2\u0116\u011b\5\6\4\2\u0117\u0118\7t\2\2\u0118\u011a\5\6\4\2"+
		"\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\27\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0123\5\32\16\2\u011f"+
		"\u0120\7t\2\2\u0120\u0122\5\32\16\2\u0121\u011f\3\2\2\2\u0122\u0125\3"+
		"\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\31\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0126\u0128\5\34\17\2\u0127\u0126\3\2\2\2\u0127\u0128\3"+
		"\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\5\\/\2\u012a\33\3\2\2\2\u012b\u012c"+
		"\5\2\2\2\u012c\u012d\7u\2\2\u012d\35\3\2\2\2\u012e\u0132\5 \21\2\u012f"+
		"\u0131\5\"\22\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3"+
		"\2\2\2\u0132\u0133\3\2\2\2\u0133\u0145\3\2\2\2\u0134\u0132\3\2\2\2\u0135"+
		"\u013c\5\u00e4s\2\u0136\u013c\5\u00e6t\2\u0137\u013c\7\u0087\2\2\u0138"+
		"\u013c\7\u0088\2\2\u0139\u013a\7\u008b\2\2\u013a\u013c\5\2\2\2\u013b\u0135"+
		"\3\2\2\2\u013b\u0136\3\2\2\2\u013b\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013c\u0140\3\2\2\2\u013d\u013f\5\"\22\2\u013e\u013d\3"+
		"\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u013b\3\2\2\2\u0144\u0147\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\37\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0148\u0154\5\u00dep\2\u0149\u0154\5$\23\2\u014a\u0154\5&\24"+
		"\2\u014b\u0154\5(\25\2\u014c\u0154\5,\27\2\u014d\u0154\5.\30\2\u014e\u014f"+
		"\7@\2\2\u014f\u0150\5\6\4\2\u0150\u0151\5\u00e6t\2\u0151\u0154\3\2\2\2"+
		"\u0152\u0154\5\2\2\2\u0153\u0148\3\2\2\2\u0153\u0149\3\2\2\2\u0153\u014a"+
		"\3\2\2\2\u0153\u014b\3\2\2\2\u0153\u014c\3\2\2\2\u0153\u014d\3\2\2\2\u0153"+
		"\u014e\3\2\2\2\u0153\u0152\3\2\2\2\u0154!\3\2\2\2\u0155\u0156\7o\2\2\u0156"+
		"\u0157\5*\26\2\u0157\u0158\7p\2\2\u0158#\3\2\2\2\u0159\u015a\5\2\2\2\u015a"+
		"\u015b\5\24\13\2\u015b%\3\2\2\2\u015c\u015d\7q\2\2\u015d\u015e\5\\/\2"+
		"\u015e\u015f\7r\2\2\u015f\'\3\2\2\2\u0160\u0161\t\5\2\2\u0161)\3\2\2\2"+
		"\u0162\u0167\5\\/\2\u0163\u0164\7t\2\2\u0164\u0166\5\\/\2\u0165\u0163"+
		"\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"+\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7\\\2\2\u016b-\3\2\2\2\u016c"+
		"\u016d\7\20\2\2\u016d\u016e\7s\2\2\u016e\u016f\5\2\2\2\u016f\u0170\5\24"+
		"\13\2\u0170\u0177\3\2\2\2\u0171\u0172\7\20\2\2\u0172\u0173\7o\2\2\u0173"+
		"\u0174\5*\26\2\u0174\u0175\7p\2\2\u0175\u0177\3\2\2\2\u0176\u016c\3\2"+
		"\2\2\u0176\u0171\3\2\2\2\u0177/\3\2\2\2\u0178\u0179\7m\2\2\u0179\u0182"+
		"\7n\2\2\u017a\u017b\7m\2\2\u017b\u017d\5\62\32\2\u017c\u017e\7t\2\2\u017d"+
		"\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\7n"+
		"\2\2\u0180\u0182\3\2\2\2\u0181\u0178\3\2\2\2\u0181\u017a\3\2\2\2\u0182"+
		"\61\3\2\2\2\u0183\u0188\5\64\33\2\u0184\u0185\7t\2\2\u0185\u0187\5\64"+
		"\33\2\u0186\u0184\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\63\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\5\2\2"+
		"\2\u018c\u018d\7\u0081\2\2\u018d\u018e\5\66\34\2\u018e\65\3\2\2\2\u018f"+
		"\u0192\5\\/\2\u0190\u0192\5\60\31\2\u0191\u018f\3\2\2\2\u0191\u0190\3"+
		"\2\2\2\u0192\67\3\2\2\2\u0193\u01a0\5> \2\u0194\u01a0\5\36\20\2\u0195"+
		"\u0196\7w\2\2\u0196\u01a0\58\35\2\u0197\u0198\7x\2\2\u0198\u01a0\58\35"+
		"\2\u0199\u019a\7\177\2\2\u019a\u01a0\58\35\2\u019b\u019c\7\u0080\2\2\u019c"+
		"\u01a0\58\35\2\u019d\u01a0\5:\36\2\u019e\u01a0\5<\37\2\u019f\u0193\3\2"+
		"\2\2\u019f\u0194\3\2\2\2\u019f\u0195\3\2\2\2\u019f\u0197\3\2\2\2\u019f"+
		"\u0199\3\2\2\2\u019f\u019b\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u019e\3\2"+
		"\2\2\u01a09\3\2\2\2\u01a1\u01a2\7\u0087\2\2\u01a2\u01a3\58\35\2\u01a3"+
		";\3\2\2\2\u01a4\u01a5\7\u0088\2\2\u01a5\u01a6\58\35\2\u01a6=\3\2\2\2\u01a7"+
		"\u01a8\7q\2\2\u01a8\u01a9\5\6\4\2\u01a9\u01aa\7r\2\2\u01aa\u01ab\58\35"+
		"\2\u01ab?\3\2\2\2\u01ac\u01b5\58\35\2\u01ad\u01ae\7y\2\2\u01ae\u01b4\5"+
		"8\35\2\u01af\u01b0\7z\2\2\u01b0\u01b4\58\35\2\u01b1\u01b2\7{\2\2\u01b2"+
		"\u01b4\58\35\2\u01b3\u01ad\3\2\2\2\u01b3\u01af\3\2\2\2\u01b3\u01b1\3\2"+
		"\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"A\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01bf\5@!\2\u01b9\u01ba\7w\2\2\u01ba"+
		"\u01be\5@!\2\u01bb\u01bc\7x\2\2\u01bc\u01be\5@!\2\u01bd\u01b9\3\2\2\2"+
		"\u01bd\u01bb\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0"+
		"\3\2\2\2\u01c0C\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01ca\5B\"\2\u01c3\u01c4"+
		"\7\u0098\2\2\u01c4\u01c9\5B\"\2\u01c5\u01c6\5\u00dco\2\u01c6\u01c7\5B"+
		"\"\2\u01c7\u01c9\3\2\2\2\u01c8\u01c3\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c9"+
		"\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cbE\3\2\2\2"+
		"\u01cc\u01ca\3\2\2\2\u01cd\u01d8\5D#\2\u01ce\u01cf\7\u0082\2\2\u01cf\u01d7"+
		"\5D#\2\u01d0\u01d1\7\u0083\2\2\u01d1\u01d7\5D#\2\u01d2\u01d3\7\u008e\2"+
		"\2\u01d3\u01d7\5D#\2\u01d4\u01d5\7\u008f\2\2\u01d5\u01d7\5D#\2\u01d6\u01ce"+
		"\3\2\2\2\u01d6\u01d0\3\2\2\2\u01d6\u01d2\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7"+
		"\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9G\3\2\2\2"+
		"\u01da\u01d8\3\2\2\2\u01db\u01e2\5F$\2\u01dc\u01dd\7\u008c\2\2\u01dd\u01e1"+
		"\5F$\2\u01de\u01df\7\u008d\2\2\u01df\u01e1\5F$\2\u01e0\u01dc\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2"+
		"\2\2\u01e3I\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01ea\5H%\2\u01e6\u01e7"+
		"\7|\2\2\u01e7\u01e9\5H%\2\u01e8\u01e6\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea"+
		"\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01ebK\3\2\2\2\u01ec\u01ea\3\2\2\2"+
		"\u01ed\u01f2\5J&\2\u01ee\u01ef\7~\2\2\u01ef\u01f1\5J&\2\u01f0\u01ee\3"+
		"\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"M\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01fa\5L\'\2\u01f6\u01f7\7}\2\2\u01f7"+
		"\u01f9\5L\'\2\u01f8\u01f6\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2"+
		"\2\2\u01fa\u01fb\3\2\2\2\u01fbO\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u0202"+
		"\5N(\2\u01fe\u01ff\7\u0089\2\2\u01ff\u0201\5N(\2\u0200\u01fe\3\2\2\2\u0201"+
		"\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203Q\3\2\2\2"+
		"\u0204\u0202\3\2\2\2\u0205\u020a\5P)\2\u0206\u0207\7\u008a\2\2\u0207\u0209"+
		"\5P)\2\u0208\u0206\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a"+
		"\u020b\3\2\2\2\u020bS\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u0210\5R*\2\u020e"+
		"\u020f\7\u0086\2\2\u020f\u0211\5T+\2\u0210\u020e\3\2\2\2\u0210\u0211\3"+
		"\2\2\2\u0211U\3\2\2\2\u0212\u0218\5T+\2\u0213\u0214\7\u0084\2\2\u0214"+
		"\u0215\5\\/\2\u0215\u0216\7u\2\2\u0216\u0217\5\\/\2\u0217\u0219\3\2\2"+
		"\2\u0218\u0213\3\2\2\2\u0218\u0219\3\2\2\2\u0219W\3\2\2\2\u021a\u021b"+
		"\58\35\2\u021b\u021c\5Z.\2\u021c\u021d\5\\/\2\u021dY\3\2\2\2\u021e\u021f"+
		"\t\6\2\2\u021f[\3\2\2\2\u0220\u0223\5X-\2\u0221\u0223\5V,\2\u0222\u0220"+
		"\3\2\2\2\u0222\u0221\3\2\2\2\u0223]\3\2\2\2\u0224\u0227\5`\61\2\u0225"+
		"\u0227\5n8\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227_\3\2\2\2\u0228"+
		"\u022a\7m\2\2\u0229\u022b\5b\62\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2"+
		"\2\2\u022b\u022c\3\2\2\2\u022c\u022d\7n\2\2\u022da\3\2\2\2\u022e\u0230"+
		"\5d\63\2\u022f\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u022f\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232c\3\2\2\2\u0233\u0236\5f\64\2\u0234\u0236\5^\60\2"+
		"\u0235\u0233\3\2\2\2\u0235\u0234\3\2\2\2\u0236e\3\2\2\2\u0237\u0238\5"+
		"h\65\2\u0238\u0239\7v\2\2\u0239g\3\2\2\2\u023a\u023c\5\6\4\2\u023b\u023a"+
		"\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\5j\66\2\u023e"+
		"i\3\2\2\2\u023f\u0244\5l\67\2\u0240\u0241\7t\2\2\u0241\u0243\5l\67\2\u0242"+
		"\u0240\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2"+
		"\2\2\u0245k\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u024a\5\2\2\2\u0248\u0249"+
		"\7\u0081\2\2\u0249\u024b\5\\/\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2"+
		"\2\u024bm\3\2\2\2\u024c\u0259\7v\2\2\u024d\u024e\5\\/\2\u024e\u024f\7"+
		"v\2\2\u024f\u0259\3\2\2\2\u0250\u0259\5r:\2\u0251\u0259\5t;\2\u0252\u0259"+
		"\5\u0080A\2\u0253\u0259\5\u0082B\2\u0254\u0259\5\u0088E\2\u0255\u0259"+
		"\5\u008aF\2\u0256\u0259\5\u008cG\2\u0257\u0259\5\u0092J\2\u0258\u024c"+
		"\3\2\2\2\u0258\u024d\3\2\2\2\u0258\u0250\3\2\2\2\u0258\u0251\3\2\2\2\u0258"+
		"\u0252\3\2\2\2\u0258\u0253\3\2\2\2\u0258\u0254\3\2\2\2\u0258\u0255\3\2"+
		"\2\2\u0258\u0256\3\2\2\2\u0258\u0257\3\2\2\2\u0259o\3\2\2\2\u025a\u025d"+
		"\5`\61\2\u025b\u025d\5n8\2\u025c\u025a\3\2\2\2\u025c\u025b\3\2\2\2\u025d"+
		"q\3\2\2\2\u025e\u025f\7\63\2\2\u025f\u0260\7q\2\2\u0260\u0261\5\\/\2\u0261"+
		"\u0262\7r\2\2\u0262\u0265\5p9\2\u0263\u0264\7#\2\2\u0264\u0266\5p9\2\u0265"+
		"\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266s\3\2\2\2\u0267\u0268\7[\2\2\u0268"+
		"\u0269\7q\2\2\u0269\u026a\5\\/\2\u026a\u026b\7r\2\2\u026b\u026c\5v<\2"+
		"\u026cu\3\2\2\2\u026d\u026f\7m\2\2\u026e\u0270\5x=\2\u026f\u026e\3\2\2"+
		"\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\7n\2\2\u0272w\3"+
		"\2\2\2\u0273\u0277\5z>\2\u0274\u0276\5z>\2\u0275\u0274\3\2\2\2\u0276\u0279"+
		"\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278y\3\2\2\2\u0279"+
		"\u0277\3\2\2\2\u027a\u027b\5|?\2\u027b\u027c\5b\62\2\u027c{\3\2\2\2\u027d"+
		"\u0281\5~@\2\u027e\u0280\5~@\2\u027f\u027e\3\2\2\2\u0280\u0283\3\2\2\2"+
		"\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282}\3\2\2\2\u0283\u0281\3"+
		"\2\2\2\u0284\u0285\7\25\2\2\u0285\u0286\5\\/\2\u0286\u0287\7u\2\2\u0287"+
		"\u028b\3\2\2\2\u0288\u0289\7\35\2\2\u0289\u028b\7u\2\2\u028a\u0284\3\2"+
		"\2\2\u028a\u0288\3\2\2\2\u028b\177\3\2\2\2\u028c\u028d\7k\2\2\u028d\u028e"+
		"\7q\2\2\u028e\u028f\5\\/\2\u028f\u0290\7r\2\2\u0290\u0291\5^\60\2\u0291"+
		"\u0081\3\2\2\2\u0292\u0293\7-\2\2\u0293\u0295\7q\2\2\u0294\u0296\5\u0084"+
		"C\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297"+
		"\u0299\7v\2\2\u0298\u029a\5\\/\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2"+
		"\2\u029a\u029b\3\2\2\2\u029b\u029d\7v\2\2\u029c\u029e\5\u0086D\2\u029d"+
		"\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\7r"+
		"\2\2\u02a0\u02a1\5^\60\2\u02a1\u0083\3\2\2\2\u02a2\u02a5\5h\65\2\u02a3"+
		"\u02a5\5\u0086D\2\u02a4\u02a2\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5\u0085"+
		"\3\2\2\2\u02a6\u02ab\5\\/\2\u02a7\u02a8\7t\2\2\u02a8\u02aa\5\\/\2\u02a9"+
		"\u02a7\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2"+
		"\2\2\u02ac\u0087\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02b0\7P\2\2\u02af"+
		"\u02b1\5\\/\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2"+
		"\2\2\u02b2\u02b3\7v\2\2\u02b3\u0089\3\2\2\2\u02b4\u02b6\7]\2\2\u02b5\u02b7"+
		"\5\\/\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8"+
		"\u02b9\7v\2\2\u02b9\u008b\3\2\2\2\u02ba\u02bb\7_\2\2\u02bb\u02bd\5`\61"+
		"\2\u02bc\u02be\5\u008eH\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02c0\3\2\2\2\u02bf\u02c1\5\u0090I\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1"+
		"\3\2\2\2\u02c1\u008d\3\2\2\2\u02c2\u02c3\7\26\2\2\u02c3\u02c4\5`\61\2"+
		"\u02c4\u008f\3\2\2\2\u02c5\u02c6\7*\2\2\u02c6\u02c7\5`\61\2\u02c7\u0091"+
		"\3\2\2\2\u02c8\u02c9\5\u00d6l\2\u02c9\u02ca\7P\2\2\u02ca\u02cb\5\\/\2"+
		"\u02cb\u02cc\7v\2\2\u02cc\u02d2\3\2\2\2\u02cd\u02ce\5\u00d6l\2\u02ce\u02cf"+
		"\7\22\2\2\u02cf\u02d0\7v\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02c8\3\2\2\2\u02d1"+
		"\u02cd\3\2\2\2\u02d2\u0093\3\2\2\2\u02d3\u02d5\7\3\2\2\u02d4\u02d3\3\2"+
		"\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d8\5\u0096L\2\u02d7"+
		"\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9\u02db\5\u009c"+
		"O\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u02dd\7\2\2\3\u02dd\u0095\3\2\2\2\u02de\u02e0\5\u0098M\2\u02df\u02de"+
		"\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2"+
		"\u0097\3\2\2\2\u02e3\u02e4\7f\2\2\u02e4\u02e5\5\4\3\2\u02e5\u02e6\7v\2"+
		"\2\u02e6\u0099\3\2\2\2\u02e7\u02ec\5\2\2\2\u02e8\u02e9\7s\2\2\u02e9\u02eb"+
		"\5\2\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec"+
		"\u02ed\3\2\2\2\u02ed\u009b\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ef\u02f1\5\u009e"+
		"P\2\u02f0\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2"+
		"\u02f3\3\2\2\2\u02f3\u009d\3\2\2\2\u02f4\u02f7\5\u00a0Q\2\u02f5\u02f7"+
		"\5\u00a4S\2\u02f6\u02f4\3\2\2\2\u02f6\u02f5\3\2\2\2\u02f7\u009f\3\2\2"+
		"\2\u02f8\u02f9\7?\2\2\u02f9\u02fa\5\u009aN\2\u02fa\u02fc\5\u00a2R\2\u02fb"+
		"\u02fd\7v\2\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u00a1\3\2"+
		"\2\2\u02fe\u0300\7m\2\2\u02ff\u0301\5\u009cO\2\u0300\u02ff\3\2\2\2\u0300"+
		"\u0301\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\7n\2\2\u0303\u00a3\3\2"+
		"\2\2\u0304\u0306\5\u00caf\2\u0305\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306"+
		"\u0308\3\2\2\2\u0307\u0309\5\u00aaV\2\u0308\u0307\3\2\2\2\u0308\u0309"+
		"\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\5\u00aeX\2\u030b\u00a5\3\2\2"+
		"\2\u030c\u030d\7\u0082\2\2\u030d\u030e\5\u00a8U\2\u030e\u030f\7\u0083"+
		"\2\2\u030f\u00a7\3\2\2\2\u0310\u0312\5\u00caf\2\u0311\u0310\3\2\2\2\u0311"+
		"\u0312\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u031b\5\2\2\2\u0314\u0316\7t"+
		"\2\2\u0315\u0317\5\u00caf\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317"+
		"\u0318\3\2\2\2\u0318\u031a\5\2\2\2\u0319\u0314\3\2\2\2\u031a\u031d\3\2"+
		"\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u00a9\3\2\2\2\u031d"+
		"\u031b\3\2\2\2\u031e\u0320\5\u00acW\2\u031f\u031e\3\2\2\2\u0320\u0321"+
		"\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u00ab\3\2\2\2\u0323"+
		"\u0332\7@\2\2\u0324\u0332\7L\2\2\u0325\u0332\7K\2\2\u0326\u0332\78\2\2"+
		"\u0327\u0332\7J\2\2\u0328\u0332\7M\2\2\u0329\u0332\7g\2\2\u032a\u0332"+
		"\7R\2\2\u032b\u0332\7G\2\2\u032c\u0332\7\n\2\2\u032d\u0332\7X\2\2\u032e"+
		"\u0332\7d\2\2\u032f\u0332\7(\2\2\u0330\u0332\5\u00d4k\2\u0331\u0323\3"+
		"\2\2\2\u0331\u0324\3\2\2\2\u0331\u0325\3\2\2\2\u0331\u0326\3\2\2\2\u0331"+
		"\u0327\3\2\2\2\u0331\u0328\3\2\2\2\u0331\u0329\3\2\2\2\u0331\u032a\3\2"+
		"\2\2\u0331\u032b\3\2\2\2\u0331\u032c\3\2\2\2\u0331\u032d\3\2\2\2\u0331"+
		"\u032e\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0330\3\2\2\2\u0332\u00ad\3\2"+
		"\2\2\u0333\u0334\7\31\2\2\u0334\u0336\5\2\2\2\u0335\u0337\5\u00a6T\2\u0336"+
		"\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u033a\5\u00b0"+
		"Y\2\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b"+
		"\u033d\5\u00b2Z\2\u033c\u033e\7v\2\2\u033d\u033c\3\2\2\2\u033d\u033e\3"+
		"\2\2\2\u033e\u00af\3\2\2\2\u033f\u0340\7u\2\2\u0340\u0341\5\22\n\2\u0341"+
		"\u00b1\3\2\2\2\u0342\u0344\7m\2\2\u0343\u0345\5\u00b4[\2\u0344\u0343\3"+
		"\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\7n\2\2\u0347"+
		"\u00b3\3\2\2\2\u0348\u034a\5\u00b6\\\2\u0349\u0348\3\2\2\2\u034a\u034b"+
		"\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u00b5\3\2\2\2\u034d"+
		"\u034f\5\u00caf\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351"+
		"\3\2\2\2\u0350\u0352\5\u00aaV\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2"+
		"\2\u0352\u0356\3\2\2\2\u0353\u0355\5f\64\2\u0354\u0353\3\2\2\2\u0355\u0358"+
		"\3\2\2\2\u0356\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0359\3\2\2\2\u0358"+
		"\u0356\3\2\2\2\u0359\u035a\5\u00b8]\2\u035a\u00b7\3\2\2\2\u035b\u035d"+
		"\5\u00acW\2\u035c\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0362\3\2\2"+
		"\2\u035e\u0363\5\u00ba^\2\u035f\u0360\5\6\4\2\u0360\u0361\5\u00bc_\2\u0361"+
		"\u0363\3\2\2\2\u0362\u035e\3\2\2\2\u0362\u035f\3\2\2\2\u0363\u00b9\3\2"+
		"\2\2\u0364\u0365\5\2\2\2\u0365\u0367\7q\2\2\u0366\u0368\5\u00c2b\2\u0367"+
		"\u0366\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036b\7r"+
		"\2\2\u036a\u036c\5\u00c8e\2\u036b\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c"+
		"\u036d\3\2\2\2\u036d\u036e\5\u00c0a\2\u036e\u00bb\3\2\2\2\u036f\u0371"+
		"\5\u00be`\2\u0370\u0372\5\u00a6T\2\u0371\u0370\3\2\2\2\u0371\u0372\3\2"+
		"\2\2\u0372\u0373\3\2\2\2\u0373\u0375\7q\2\2\u0374\u0376\5\u00c2b\2\u0375"+
		"\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\7r"+
		"\2\2\u0378\u0379\5\u00c0a\2\u0379\u00bd\3\2\2\2\u037a\u0380\5\2\2\2\u037b"+
		"\u037c\5\2\2\2\u037c\u037d\7\u0085\2\2\u037d\u037e\5\2\2\2\u037e\u0380"+
		"\3\2\2\2\u037f\u037a\3\2\2\2\u037f\u037b\3\2\2\2\u0380\u0387\3\2\2\2\u0381"+
		"\u0382\5\24\13\2\u0382\u0383\7s\2\2\u0383\u0384\5\2\2\2\u0384\u0386\3"+
		"\2\2\2\u0385\u0381\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0387"+
		"\u0388\3\2\2\2\u0388\u00bf\3\2\2\2\u0389\u0387\3\2\2\2\u038a\u038d\5`"+
		"\61\2\u038b\u038d\7v\2\2\u038c\u038a\3\2\2\2\u038c\u038b\3\2\2\2\u038d"+
		"\u00c1\3\2\2\2\u038e\u0393\5\u00c4c\2\u038f\u0390\7t\2\2\u0390\u0392\5"+
		"\u00c4c\2\u0391\u038f\3\2\2\2\u0392\u0395\3\2\2\2\u0393\u0391\3\2\2\2"+
		"\u0393\u0394\3\2\2\2\u0394\u00c3\3\2\2\2\u0395\u0393\3\2\2\2\u0396\u0398"+
		"\5\u00caf\2\u0397\u0396\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\3\2\2"+
		"\2\u0399\u039a\5\6\4\2\u039a\u039c\5\2\2\2\u039b\u039d\5\u00c6d\2\u039c"+
		"\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u03a0\3\2\2\2\u039e\u03a0\5\u00da"+
		"n\2\u039f\u0397\3\2\2\2\u039f\u039e\3\2\2\2\u03a0\u00c5\3\2\2\2\u03a1"+
		"\u03a2\7\u0081\2\2\u03a2\u03a3\5\\/\2\u03a3\u00c7\3\2\2\2\u03a4\u03a5"+
		"\7u\2\2\u03a5\u03a6\7\20\2\2\u03a6\u03a8\7q\2\2\u03a7\u03a9\5\30\r\2\u03a8"+
		"\u03a7\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03b3\7r"+
		"\2\2\u03ab\u03ac\7u\2\2\u03ac\u03ad\7\\\2\2\u03ad\u03af\7q\2\2\u03ae\u03b0"+
		"\5\30\r\2\u03af\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\3\2\2\2"+
		"\u03b1\u03b3\7r\2\2\u03b2\u03a4\3\2\2\2\u03b2\u03ab\3\2\2\2\u03b3\u00c9"+
		"\3\2\2\2\u03b4\u03b6\5\u00ccg\2\u03b5\u03b4\3\2\2\2\u03b6\u03b7\3\2\2"+
		"\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u00cb\3\2\2\2\u03b9\u03bb"+
		"\7o\2\2\u03ba\u03bc\5\u00ceh\2\u03bb\u03ba\3\2\2\2\u03bb\u03bc\3\2\2\2"+
		"\u03bc\u03bd\3\2\2\2\u03bd\u03bf\5\u00d2j\2\u03be\u03c0\7t\2\2\u03bf\u03be"+
		"\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\7p\2\2\u03c2"+
		"\u00cd\3\2\2\2\u03c3\u03c4\5\u00d0i\2\u03c4\u03c5\7u\2\2\u03c5\u00cf\3"+
		"\2\2\2\u03c6\u03c9\5\u00e2r\2\u03c7\u03c9\5\2\2\2\u03c8\u03c6\3\2\2\2"+
		"\u03c8\u03c7\3\2\2\2\u03c9\u00d1\3\2\2\2\u03ca\u03cf\5\4\3\2\u03cb\u03cc"+
		"\7t\2\2\u03cc\u03ce\5\4\3\2\u03cd\u03cb\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf"+
		"\u03cd\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u00d3\3\2\2\2\u03d1\u03cf\3\2"+
		"\2\2\u03d2\u03d3\7I\2\2\u03d3\u00d5\3\2\2\2\u03d4\u03d5\7l\2\2\u03d5\u00d7"+
		"\3\2\2\2\u03d6\u03d7\7\"\2\2\u03d7\u00d9\3\2\2\2\u03d8\u03d9\7\r\2\2\u03d9"+
		"\u00db\3\2\2\2\u03da\u03db\7\u0083\2\2\u03db\u03dc\7\u0083\2\2\u03dc\u03dd"+
		"\6o\2\3\u03dd\u00dd\3\2\2\2\u03de\u03e5\5\u00e0q\2\u03df\u03e5\7\u00a0"+
		"\2\2\u03e0\u03e5\7\u00a2\2\2\u03e1\u03e5\7\u00a3\2\2\u03e2\u03e5\7\u00a4"+
		"\2\2\u03e3\u03e5\7A\2\2\u03e4\u03de\3\2\2\2\u03e4\u03df\3\2\2\2\u03e4"+
		"\u03e0\3\2\2\2\u03e4\u03e1\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e3\3\2"+
		"\2\2\u03e5\u00df\3\2\2\2\u03e6\u03e7\t\7\2\2\u03e7\u00e1\3\2\2\2\u03e8"+
		"\u03e9\t\b\2\2\u03e9\u00e3\3\2\2\2\u03ea\u03eb\7s\2\2\u03eb\u03ed\5\2"+
		"\2\2\u03ec\u03ee\5\24\13\2\u03ed\u03ec\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee"+
		"\u00e5\3\2\2\2\u03ef\u03f1\7q\2\2\u03f0\u03f2\5\30\r\2\u03f1\u03f0\3\2"+
		"\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\7r\2\2\u03f4"+
		"\u00e7\3\2\2\2q\u00f3\u00f8\u00fd\u0101\u0106\u0110\u011b\u0123\u0127"+
		"\u0132\u013b\u0140\u0145\u0153\u0167\u0176\u017d\u0181\u0188\u0191\u019f"+
		"\u01b3\u01b5\u01bd\u01bf\u01c8\u01ca\u01d6\u01d8\u01e0\u01e2\u01ea\u01f2"+
		"\u01fa\u0202\u020a\u0210\u0218\u0222\u0226\u022a\u0231\u0235\u023b\u0244"+
		"\u024a\u0258\u025c\u0265\u026f\u0277\u0281\u028a\u0295\u0299\u029d\u02a4"+
		"\u02ab\u02b0\u02b6\u02bd\u02c0\u02d1\u02d4\u02d7\u02da\u02e1\u02ec\u02f2"+
		"\u02f6\u02fc\u0300\u0305\u0308\u0311\u0316\u031b\u0321\u0331\u0336\u0339"+
		"\u033d\u0344\u034b\u034e\u0351\u0356\u035c\u0362\u0367\u036b\u0371\u0375"+
		"\u037f\u0387\u038c\u0393\u0397\u039c\u039f\u03a8\u03af\u03b2\u03b7\u03bb"+
		"\u03bf\u03c8\u03cf\u03e4\u03ed\u03f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}