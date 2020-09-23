// Generated from /home/gustavo/ufsc/scanner/CCC20201.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CCC20201Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LESS=1, GREATER=2, LESSEQUAL=3, GREATEREQUAL=4, EQUALCOMP=5, DIFFERENT=6, 
		PLUS=7, MINUS=8, MULTIPLY=9, DIVIDE=10, MODULE=11, EQUAL=12, SEMICOLON=13, 
		COMMA=14, OPENPAR=15, CLOSEPAR=16, OPENBRACE=17, CLOSEBRACE=18, OPENBRACKET=19, 
		CLOSEBRACKET=20, DEF=21, NEW=22, IF=23, ELSE=24, FOR=25, RETURN=26, BREAK=27, 
		PRINT=28, READ=29, INT=30, FLOAT=31, STRING=32, NULL=33, IDENT=34, INT_CONSTANT=35, 
		STRING_CONSTANT=36, FLOAT_CONSTANT=37, WS=38;
	public static final int
		RULE_program = 0, RULE_funclist = 1, RULE_funcdef = 2, RULE_paramlist = 3, 
		RULE_statement = 4, RULE_vardecl = 5, RULE_vartype = 6, RULE_atribstat = 7, 
		RULE_funccall = 8, RULE_paramlistcall = 9, RULE_printstat = 10, RULE_readstat = 11, 
		RULE_returnstat = 12, RULE_ifstat = 13, RULE_forstat = 14, RULE_statelist = 15, 
		RULE_allocexpression = 16, RULE_expression = 17, RULE_comparator = 18, 
		RULE_numexpression = 19, RULE_term = 20, RULE_minorarith = 21, RULE_priorarith = 22, 
		RULE_unaryexpr = 23, RULE_factor = 24, RULE_lvalue = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "funclist", "funcdef", "paramlist", "statement", "vardecl", 
			"vartype", "atribstat", "funccall", "paramlistcall", "printstat", "readstat", 
			"returnstat", "ifstat", "forstat", "statelist", "allocexpression", "expression", 
			"comparator", "numexpression", "term", "minorarith", "priorarith", "unaryexpr", 
			"factor", "lvalue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'='", "';'", "','", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'def'", "'new'", "'if'", "'else'", "'for'", "'return'", "'break'", 
			"'print'", "'read'", "'int'", "'float'", "'string'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LESS", "GREATER", "LESSEQUAL", "GREATEREQUAL", "EQUALCOMP", "DIFFERENT", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULE", "EQUAL", "SEMICOLON", 
			"COMMA", "OPENPAR", "CLOSEPAR", "OPENBRACE", "CLOSEBRACE", "OPENBRACKET", 
			"CLOSEBRACKET", "DEF", "NEW", "IF", "ELSE", "FOR", "RETURN", "BREAK", 
			"PRINT", "READ", "INT", "FLOAT", "STRING", "NULL", "IDENT", "INT_CONSTANT", 
			"STRING_CONSTANT", "FLOAT_CONSTANT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "CCC20201.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CCC20201Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunclistContext funclist() {
			return getRuleContext(FunclistContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
			case OPENBRACE:
			case IF:
			case FOR:
			case RETURN:
			case BREAK:
			case PRINT:
			case READ:
			case INT:
			case FLOAT:
			case STRING:
			case IDENT:
				{
				setState(52);
				statement();
				}
				break;
			case DEF:
				{
				setState(53);
				funclist();
				}
				break;
			case EOF:
				break;
			default:
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

	public static class FunclistContext extends ParserRuleContext {
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public FunclistContext funclist() {
			return getRuleContext(FunclistContext.class,0);
		}
		public FunclistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funclist; }
	}

	public final FunclistContext funclist() throws RecognitionException {
		FunclistContext _localctx = new FunclistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funclist);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				funcdef();
				setState(57);
				funclist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				funcdef();
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

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(CCC20201Parser.DEF, 0); }
		public TerminalNode IDENT() { return getToken(CCC20201Parser.IDENT, 0); }
		public TerminalNode OPENPAR() { return getToken(CCC20201Parser.OPENPAR, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(CCC20201Parser.CLOSEPAR, 0); }
		public TerminalNode OPENBRACE() { return getToken(CCC20201Parser.OPENBRACE, 0); }
		public StatelistContext statelist() {
			return getRuleContext(StatelistContext.class,0);
		}
		public TerminalNode CLOSEBRACE() { return getToken(CCC20201Parser.CLOSEBRACE, 0); }
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(DEF);
			setState(63);
			match(IDENT);
			setState(64);
			match(OPENPAR);
			setState(65);
			paramlist();
			setState(66);
			match(CLOSEPAR);
			setState(67);
			match(OPENBRACE);
			setState(68);
			statelist();
			setState(69);
			match(CLOSEBRACE);
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

	public static class ParamlistContext extends ParserRuleContext {
		public VartypeContext vartype() {
			return getRuleContext(VartypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(CCC20201Parser.IDENT, 0); }
		public TerminalNode COMMA() { return getToken(CCC20201Parser.COMMA, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paramlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(71);
				vartype();
				setState(72);
				match(IDENT);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(73);
					match(COMMA);
					setState(74);
					paramlist();
					}
				}

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

	public static class StatementContext extends ParserRuleContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CCC20201Parser.SEMICOLON, 0); }
		public AtribstatContext atribstat() {
			return getRuleContext(AtribstatContext.class,0);
		}
		public PrintstatContext printstat() {
			return getRuleContext(PrintstatContext.class,0);
		}
		public ReadstatContext readstat() {
			return getRuleContext(ReadstatContext.class,0);
		}
		public ReturnstatContext returnstat() {
			return getRuleContext(ReturnstatContext.class,0);
		}
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public ForstatContext forstat() {
			return getRuleContext(ForstatContext.class,0);
		}
		public TerminalNode OPENBRACE() { return getToken(CCC20201Parser.OPENBRACE, 0); }
		public StatelistContext statelist() {
			return getRuleContext(StatelistContext.class,0);
		}
		public TerminalNode CLOSEBRACE() { return getToken(CCC20201Parser.CLOSEBRACE, 0); }
		public TerminalNode BREAK() { return getToken(CCC20201Parser.BREAK, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				vardecl();
				setState(80);
				match(SEMICOLON);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				atribstat();
				setState(83);
				match(SEMICOLON);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				printstat();
				setState(86);
				match(SEMICOLON);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				readstat();
				setState(89);
				match(SEMICOLON);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				returnstat();
				setState(92);
				match(SEMICOLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				ifstat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(95);
				forstat();
				}
				break;
			case OPENBRACE:
				enterOuterAlt(_localctx, 8);
				{
				setState(96);
				match(OPENBRACE);
				setState(97);
				statelist();
				setState(98);
				match(CLOSEBRACE);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 9);
				{
				setState(100);
				match(BREAK);
				setState(101);
				match(SEMICOLON);
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 10);
				{
				setState(102);
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

	public static class VardeclContext extends ParserRuleContext {
		public VartypeContext vartype() {
			return getRuleContext(VartypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(CCC20201Parser.IDENT, 0); }
		public List<TerminalNode> OPENBRACKET() { return getTokens(CCC20201Parser.OPENBRACKET); }
		public TerminalNode OPENBRACKET(int i) {
			return getToken(CCC20201Parser.OPENBRACKET, i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(CCC20201Parser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(CCC20201Parser.INT_CONSTANT, i);
		}
		public List<TerminalNode> CLOSEBRACKET() { return getTokens(CCC20201Parser.CLOSEBRACKET); }
		public TerminalNode CLOSEBRACKET(int i) {
			return getToken(CCC20201Parser.CLOSEBRACKET, i);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			vartype();
			setState(106);
			match(IDENT);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENBRACKET) {
				{
				{
				setState(107);
				match(OPENBRACKET);
				setState(108);
				match(INT_CONSTANT);
				setState(109);
				match(CLOSEBRACKET);
				}
				}
				setState(114);
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

	public static class VartypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CCC20201Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CCC20201Parser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(CCC20201Parser.STRING, 0); }
		public VartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vartype; }
	}

	public final VartypeContext vartype() throws RecognitionException {
		VartypeContext _localctx = new VartypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class AtribstatContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(CCC20201Parser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AllocexpressionContext allocexpression() {
			return getRuleContext(AllocexpressionContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public AtribstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribstat; }
	}

	public final AtribstatContext atribstat() throws RecognitionException {
		AtribstatContext _localctx = new AtribstatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atribstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			lvalue();
			setState(118);
			match(EQUAL);
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(119);
				expression();
				}
				break;
			case 2:
				{
				setState(120);
				allocexpression();
				}
				break;
			case 3:
				{
				setState(121);
				funccall();
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

	public static class FunccallContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CCC20201Parser.IDENT, 0); }
		public TerminalNode OPENPAR() { return getToken(CCC20201Parser.OPENPAR, 0); }
		public ParamlistcallContext paramlistcall() {
			return getRuleContext(ParamlistcallContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(CCC20201Parser.CLOSEPAR, 0); }
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IDENT);
			setState(125);
			match(OPENPAR);
			setState(126);
			paramlistcall();
			setState(127);
			match(CLOSEPAR);
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

	public static class ParamlistcallContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CCC20201Parser.IDENT, 0); }
		public TerminalNode COMMA() { return getToken(CCC20201Parser.COMMA, 0); }
		public ParamlistcallContext paramlistcall() {
			return getRuleContext(ParamlistcallContext.class,0);
		}
		public ParamlistcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlistcall; }
	}

	public final ParamlistcallContext paramlistcall() throws RecognitionException {
		ParamlistcallContext _localctx = new ParamlistcallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_paramlistcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(129);
				match(IDENT);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(130);
					match(COMMA);
					setState(131);
					paramlistcall();
					}
				}

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

	public static class PrintstatContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(CCC20201Parser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstat; }
	}

	public final PrintstatContext printstat() throws RecognitionException {
		PrintstatContext _localctx = new PrintstatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(PRINT);
			setState(137);
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

	public static class ReadstatContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(CCC20201Parser.READ, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ReadstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readstat; }
	}

	public final ReadstatContext readstat() throws RecognitionException {
		ReadstatContext _localctx = new ReadstatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_readstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(READ);
			setState(140);
			lvalue();
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

	public static class ReturnstatContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CCC20201Parser.RETURN, 0); }
		public ReturnstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstat; }
	}

	public final ReturnstatContext returnstat() throws RecognitionException {
		ReturnstatContext _localctx = new ReturnstatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(RETURN);
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

	public static class IfstatContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CCC20201Parser.IF, 0); }
		public TerminalNode OPENPAR() { return getToken(CCC20201Parser.OPENPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(CCC20201Parser.CLOSEPAR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CCC20201Parser.ELSE, 0); }
		public IfstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
	}

	public final IfstatContext ifstat() throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(IF);
			setState(145);
			match(OPENPAR);
			setState(146);
			expression();
			setState(147);
			match(CLOSEPAR);
			setState(148);
			statement();
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(149);
				match(ELSE);
				setState(150);
				statement();
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

	public static class ForstatContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CCC20201Parser.FOR, 0); }
		public TerminalNode OPENPAR() { return getToken(CCC20201Parser.OPENPAR, 0); }
		public List<AtribstatContext> atribstat() {
			return getRuleContexts(AtribstatContext.class);
		}
		public AtribstatContext atribstat(int i) {
			return getRuleContext(AtribstatContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CCC20201Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CCC20201Parser.SEMICOLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(CCC20201Parser.CLOSEPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstat; }
	}

	public final ForstatContext forstat() throws RecognitionException {
		ForstatContext _localctx = new ForstatContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(FOR);
			setState(154);
			match(OPENPAR);
			setState(155);
			atribstat();
			setState(156);
			match(SEMICOLON);
			setState(157);
			expression();
			setState(158);
			match(SEMICOLON);
			setState(159);
			atribstat();
			setState(160);
			match(CLOSEPAR);
			setState(161);
			statement();
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

	public static class StatelistContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatelistContext statelist() {
			return getRuleContext(StatelistContext.class,0);
		}
		public StatelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statelist; }
	}

	public final StatelistContext statelist() throws RecognitionException {
		StatelistContext _localctx = new StatelistContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			statement();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMICOLON) | (1L << OPENBRACE) | (1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << BREAK) | (1L << PRINT) | (1L << READ) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << IDENT))) != 0)) {
				{
				setState(164);
				statelist();
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

	public static class AllocexpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(CCC20201Parser.NEW, 0); }
		public VartypeContext vartype() {
			return getRuleContext(VartypeContext.class,0);
		}
		public List<TerminalNode> OPENBRACKET() { return getTokens(CCC20201Parser.OPENBRACKET); }
		public TerminalNode OPENBRACKET(int i) {
			return getToken(CCC20201Parser.OPENBRACKET, i);
		}
		public List<NumexpressionContext> numexpression() {
			return getRuleContexts(NumexpressionContext.class);
		}
		public NumexpressionContext numexpression(int i) {
			return getRuleContext(NumexpressionContext.class,i);
		}
		public List<TerminalNode> CLOSEBRACKET() { return getTokens(CCC20201Parser.CLOSEBRACKET); }
		public TerminalNode CLOSEBRACKET(int i) {
			return getToken(CCC20201Parser.CLOSEBRACKET, i);
		}
		public AllocexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocexpression; }
	}

	public final AllocexpressionContext allocexpression() throws RecognitionException {
		AllocexpressionContext _localctx = new AllocexpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_allocexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(NEW);
			setState(168);
			vartype();
			setState(173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				match(OPENBRACKET);
				setState(170);
				numexpression();
				setState(171);
				match(CLOSEBRACKET);
				}
				}
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPENBRACKET );
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
		public List<NumexpressionContext> numexpression() {
			return getRuleContexts(NumexpressionContext.class);
		}
		public NumexpressionContext numexpression(int i) {
			return getRuleContext(NumexpressionContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			numexpression();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GREATER) | (1L << LESSEQUAL) | (1L << GREATEREQUAL) | (1L << EQUALCOMP) | (1L << DIFFERENT))) != 0)) {
				{
				setState(178);
				comparator();
				setState(179);
				numexpression();
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

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(CCC20201Parser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(CCC20201Parser.GREATER, 0); }
		public TerminalNode LESSEQUAL() { return getToken(CCC20201Parser.LESSEQUAL, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(CCC20201Parser.GREATEREQUAL, 0); }
		public TerminalNode EQUALCOMP() { return getToken(CCC20201Parser.EQUALCOMP, 0); }
		public TerminalNode DIFFERENT() { return getToken(CCC20201Parser.DIFFERENT, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GREATER) | (1L << LESSEQUAL) | (1L << GREATEREQUAL) | (1L << EQUALCOMP) | (1L << DIFFERENT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class NumexpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<MinorarithContext> minorarith() {
			return getRuleContexts(MinorarithContext.class);
		}
		public MinorarithContext minorarith(int i) {
			return getRuleContext(MinorarithContext.class,i);
		}
		public NumexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexpression; }
	}

	public final NumexpressionContext numexpression() throws RecognitionException {
		NumexpressionContext _localctx = new NumexpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_numexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			term();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(186);
				minorarith();
				setState(187);
				term();
				}
				}
				setState(193);
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

	public static class TermContext extends ParserRuleContext {
		public List<UnaryexprContext> unaryexpr() {
			return getRuleContexts(UnaryexprContext.class);
		}
		public UnaryexprContext unaryexpr(int i) {
			return getRuleContext(UnaryexprContext.class,i);
		}
		public List<PriorarithContext> priorarith() {
			return getRuleContexts(PriorarithContext.class);
		}
		public PriorarithContext priorarith(int i) {
			return getRuleContext(PriorarithContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			unaryexpr();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULE))) != 0)) {
				{
				{
				setState(195);
				priorarith();
				setState(196);
				unaryexpr();
				}
				}
				setState(202);
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

	public static class MinorarithContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CCC20201Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CCC20201Parser.MINUS, 0); }
		public MinorarithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minorarith; }
	}

	public final MinorarithContext minorarith() throws RecognitionException {
		MinorarithContext _localctx = new MinorarithContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_minorarith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class PriorarithContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(CCC20201Parser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(CCC20201Parser.DIVIDE, 0); }
		public TerminalNode MODULE() { return getToken(CCC20201Parser.MODULE, 0); }
		public PriorarithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priorarith; }
	}

	public final PriorarithContext priorarith() throws RecognitionException {
		PriorarithContext _localctx = new PriorarithContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_priorarith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class UnaryexprContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public MinorarithContext minorarith() {
			return getRuleContext(MinorarithContext.class,0);
		}
		public UnaryexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpr; }
	}

	public final UnaryexprContext unaryexpr() throws RecognitionException {
		UnaryexprContext _localctx = new UnaryexprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unaryexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(207);
				minorarith();
				}
			}

			setState(210);
			factor();
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(CCC20201Parser.INT_CONSTANT, 0); }
		public TerminalNode FLOAT_CONSTANT() { return getToken(CCC20201Parser.FLOAT_CONSTANT, 0); }
		public TerminalNode STRING_CONSTANT() { return getToken(CCC20201Parser.STRING_CONSTANT, 0); }
		public TerminalNode NULL() { return getToken(CCC20201Parser.NULL, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode OPENPAR() { return getToken(CCC20201Parser.OPENPAR, 0); }
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(CCC20201Parser.CLOSEPAR, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_factor);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(INT_CONSTANT);
				}
				break;
			case FLOAT_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(FLOAT_CONSTANT);
				}
				break;
			case STRING_CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(STRING_CONSTANT);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(NULL);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				lvalue();
				}
				break;
			case OPENPAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				match(OPENPAR);
				setState(218);
				numexpression();
				setState(219);
				match(CLOSEPAR);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CCC20201Parser.IDENT, 0); }
		public List<TerminalNode> OPENBRACKET() { return getTokens(CCC20201Parser.OPENBRACKET); }
		public TerminalNode OPENBRACKET(int i) {
			return getToken(CCC20201Parser.OPENBRACKET, i);
		}
		public List<NumexpressionContext> numexpression() {
			return getRuleContexts(NumexpressionContext.class);
		}
		public NumexpressionContext numexpression(int i) {
			return getRuleContext(NumexpressionContext.class,i);
		}
		public List<TerminalNode> CLOSEBRACKET() { return getTokens(CCC20201Parser.CLOSEBRACKET); }
		public TerminalNode CLOSEBRACKET(int i) {
			return getToken(CCC20201Parser.CLOSEBRACKET, i);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(IDENT);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENBRACKET) {
				{
				{
				setState(224);
				match(OPENBRACKET);
				setState(225);
				numexpression();
				setState(226);
				match(CLOSEBRACKET);
				}
				}
				setState(232);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00ec\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\5\29\n\2\3\3\3\3\3\3\3\3\5\3?\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5N\n\5\5\5P\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6j\n\6\3\7\3\7\3\7\3\7\3\7\7\7q\n\7\f\7\16\7t\13"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\5\13\u0087\n\13\5\13\u0089\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009a\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00a8\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\6\22\u00b0\n\22\r\22\16\22\u00b1\3\23\3\23\3\23\3\23\5"+
		"\23\u00b8\n\23\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00c0\n\25\f\25\16\25"+
		"\u00c3\13\25\3\26\3\26\3\26\3\26\7\26\u00c9\n\26\f\26\16\26\u00cc\13\26"+
		"\3\27\3\27\3\30\3\30\3\31\5\31\u00d3\n\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u00e0\n\32\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u00e7\n\33\f\33\16\33\u00ea\13\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\2\6\3\2 \"\3\2\3\b\3\2\t\n\3\2\13\r"+
		"\2\u00f1\28\3\2\2\2\4>\3\2\2\2\6@\3\2\2\2\bO\3\2\2\2\ni\3\2\2\2\fk\3\2"+
		"\2\2\16u\3\2\2\2\20w\3\2\2\2\22~\3\2\2\2\24\u0088\3\2\2\2\26\u008a\3\2"+
		"\2\2\30\u008d\3\2\2\2\32\u0090\3\2\2\2\34\u0092\3\2\2\2\36\u009b\3\2\2"+
		"\2 \u00a5\3\2\2\2\"\u00a9\3\2\2\2$\u00b3\3\2\2\2&\u00b9\3\2\2\2(\u00bb"+
		"\3\2\2\2*\u00c4\3\2\2\2,\u00cd\3\2\2\2.\u00cf\3\2\2\2\60\u00d2\3\2\2\2"+
		"\62\u00df\3\2\2\2\64\u00e1\3\2\2\2\669\5\n\6\2\679\5\4\3\28\66\3\2\2\2"+
		"8\67\3\2\2\289\3\2\2\29\3\3\2\2\2:;\5\6\4\2;<\5\4\3\2<?\3\2\2\2=?\5\6"+
		"\4\2>:\3\2\2\2>=\3\2\2\2?\5\3\2\2\2@A\7\27\2\2AB\7$\2\2BC\7\21\2\2CD\5"+
		"\b\5\2DE\7\22\2\2EF\7\23\2\2FG\5 \21\2GH\7\24\2\2H\7\3\2\2\2IJ\5\16\b"+
		"\2JM\7$\2\2KL\7\20\2\2LN\5\b\5\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OI\3\2\2"+
		"\2OP\3\2\2\2P\t\3\2\2\2QR\5\f\7\2RS\7\17\2\2Sj\3\2\2\2TU\5\20\t\2UV\7"+
		"\17\2\2Vj\3\2\2\2WX\5\26\f\2XY\7\17\2\2Yj\3\2\2\2Z[\5\30\r\2[\\\7\17\2"+
		"\2\\j\3\2\2\2]^\5\32\16\2^_\7\17\2\2_j\3\2\2\2`j\5\34\17\2aj\5\36\20\2"+
		"bc\7\23\2\2cd\5 \21\2de\7\24\2\2ej\3\2\2\2fg\7\35\2\2gj\7\17\2\2hj\7\17"+
		"\2\2iQ\3\2\2\2iT\3\2\2\2iW\3\2\2\2iZ\3\2\2\2i]\3\2\2\2i`\3\2\2\2ia\3\2"+
		"\2\2ib\3\2\2\2if\3\2\2\2ih\3\2\2\2j\13\3\2\2\2kl\5\16\b\2lr\7$\2\2mn\7"+
		"\25\2\2no\7%\2\2oq\7\26\2\2pm\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\r"+
		"\3\2\2\2tr\3\2\2\2uv\t\2\2\2v\17\3\2\2\2wx\5\64\33\2x|\7\16\2\2y}\5$\23"+
		"\2z}\5\"\22\2{}\5\22\n\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\21\3\2\2\2~\177"+
		"\7$\2\2\177\u0080\7\21\2\2\u0080\u0081\5\24\13\2\u0081\u0082\7\22\2\2"+
		"\u0082\23\3\2\2\2\u0083\u0086\7$\2\2\u0084\u0085\7\20\2\2\u0085\u0087"+
		"\5\24\13\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2"+
		"\u0088\u0083\3\2\2\2\u0088\u0089\3\2\2\2\u0089\25\3\2\2\2\u008a\u008b"+
		"\7\36\2\2\u008b\u008c\5$\23\2\u008c\27\3\2\2\2\u008d\u008e\7\37\2\2\u008e"+
		"\u008f\5\64\33\2\u008f\31\3\2\2\2\u0090\u0091\7\34\2\2\u0091\33\3\2\2"+
		"\2\u0092\u0093\7\31\2\2\u0093\u0094\7\21\2\2\u0094\u0095\5$\23\2\u0095"+
		"\u0096\7\22\2\2\u0096\u0099\5\n\6\2\u0097\u0098\7\32\2\2\u0098\u009a\5"+
		"\n\6\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\35\3\2\2\2\u009b"+
		"\u009c\7\33\2\2\u009c\u009d\7\21\2\2\u009d\u009e\5\20\t\2\u009e\u009f"+
		"\7\17\2\2\u009f\u00a0\5$\23\2\u00a0\u00a1\7\17\2\2\u00a1\u00a2\5\20\t"+
		"\2\u00a2\u00a3\7\22\2\2\u00a3\u00a4\5\n\6\2\u00a4\37\3\2\2\2\u00a5\u00a7"+
		"\5\n\6\2\u00a6\u00a8\5 \21\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"!\3\2\2\2\u00a9\u00aa\7\30\2\2\u00aa\u00af\5\16\b\2\u00ab\u00ac\7\25\2"+
		"\2\u00ac\u00ad\5(\25\2\u00ad\u00ae\7\26\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00ab\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2#\3\2\2\2\u00b3\u00b7\5(\25\2\u00b4\u00b5\5&\24\2\u00b5\u00b6"+
		"\5(\25\2\u00b6\u00b8\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"%\3\2\2\2\u00b9\u00ba\t\3\2\2\u00ba\'\3\2\2\2\u00bb\u00c1\5*\26\2\u00bc"+
		"\u00bd\5,\27\2\u00bd\u00be\5*\26\2\u00be\u00c0\3\2\2\2\u00bf\u00bc\3\2"+
		"\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		")\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00ca\5\60\31\2\u00c5\u00c6\5.\30"+
		"\2\u00c6\u00c7\5\60\31\2\u00c7\u00c9\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb+\3\2\2\2"+
		"\u00cc\u00ca\3\2\2\2\u00cd\u00ce\t\4\2\2\u00ce-\3\2\2\2\u00cf\u00d0\t"+
		"\5\2\2\u00d0/\3\2\2\2\u00d1\u00d3\5,\27\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\5\62\32\2\u00d5\61\3\2\2\2\u00d6"+
		"\u00e0\7%\2\2\u00d7\u00e0\7\'\2\2\u00d8\u00e0\7&\2\2\u00d9\u00e0\7#\2"+
		"\2\u00da\u00e0\5\64\33\2\u00db\u00dc\7\21\2\2\u00dc\u00dd\5(\25\2\u00dd"+
		"\u00de\7\22\2\2\u00de\u00e0\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00d7\3"+
		"\2\2\2\u00df\u00d8\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00da\3\2\2\2\u00df"+
		"\u00db\3\2\2\2\u00e0\63\3\2\2\2\u00e1\u00e8\7$\2\2\u00e2\u00e3\7\25\2"+
		"\2\u00e3\u00e4\5(\25\2\u00e4\u00e5\7\26\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e2\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\65\3\2\2\2\u00ea\u00e8\3\2\2\2\248>MOir|\u0086\u0088\u0099"+
		"\u00a7\u00b1\u00b7\u00c1\u00ca\u00d2\u00df\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}