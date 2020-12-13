package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UNO'", "'game'", "'{'", "'}'", "'Rules'", "'Original'", "'rules.'", "'Play'", "'!'", "'Challenge.'", "'Cards'", "'effects:'", "'card'", "'0.'", "'7.'", "'0'", "'and'", "'Interception.'", "'Cumulating'", "'malus:'", "'Only'", "'plus'", "'2.'", "'4.'", "'2'", "'Hands'", "'down.'", "'Without'", "'malus.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Uno";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUno"
    // InternalMyDsl.g:64:1: entryRuleUno returns [EObject current=null] : iv_ruleUno= ruleUno EOF ;
    public final EObject entryRuleUno() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUno = null;


        try {
            // InternalMyDsl.g:64:44: (iv_ruleUno= ruleUno EOF )
            // InternalMyDsl.g:65:2: iv_ruleUno= ruleUno EOF
            {
             newCompositeNode(grammarAccess.getUnoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUno=ruleUno();

            state._fsp--;

             current =iv_ruleUno; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUno"


    // $ANTLR start "ruleUno"
    // InternalMyDsl.g:71:1: ruleUno returns [EObject current=null] : (otherlv_0= 'UNO' otherlv_1= 'game' ( (lv_game_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleRule ) )+ otherlv_5= '}' ) ;
    public final EObject ruleUno() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_game_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_rules_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'UNO' otherlv_1= 'game' ( (lv_game_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleRule ) )+ otherlv_5= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'UNO' otherlv_1= 'game' ( (lv_game_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleRule ) )+ otherlv_5= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'UNO' otherlv_1= 'game' ( (lv_game_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleRule ) )+ otherlv_5= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'UNO' otherlv_1= 'game' ( (lv_game_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleRule ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUnoAccess().getUNOKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUnoAccess().getGameKeyword_1());
            		
            // InternalMyDsl.g:87:3: ( (lv_game_2_0= RULE_ID ) )
            // InternalMyDsl.g:88:4: (lv_game_2_0= RULE_ID )
            {
            // InternalMyDsl.g:88:4: (lv_game_2_0= RULE_ID )
            // InternalMyDsl.g:89:5: lv_game_2_0= RULE_ID
            {
            lv_game_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_game_2_0, grammarAccess.getUnoAccess().getGameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"game",
            						lv_game_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getUnoAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:109:3: ( (lv_rules_4_0= ruleRule ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:110:4: (lv_rules_4_0= ruleRule )
            	    {
            	    // InternalMyDsl.g:110:4: (lv_rules_4_0= ruleRule )
            	    // InternalMyDsl.g:111:5: lv_rules_4_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getUnoAccess().getRulesRuleParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_rules_4_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUnoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getUnoAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUno"


    // $ANTLR start "entryRuleRule"
    // InternalMyDsl.g:136:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalMyDsl.g:136:45: (iv_ruleRule= ruleRule EOF )
            // InternalMyDsl.g:137:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMyDsl.g:143:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Rules' otherlv_1= '{' ( ruleOriginal | ( (lv_variants_3_0= ruleVariant ) )* ) otherlv_4= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_variants_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:149:2: ( (otherlv_0= 'Rules' otherlv_1= '{' ( ruleOriginal | ( (lv_variants_3_0= ruleVariant ) )* ) otherlv_4= '}' ) )
            // InternalMyDsl.g:150:2: (otherlv_0= 'Rules' otherlv_1= '{' ( ruleOriginal | ( (lv_variants_3_0= ruleVariant ) )* ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:150:2: (otherlv_0= 'Rules' otherlv_1= '{' ( ruleOriginal | ( (lv_variants_3_0= ruleVariant ) )* ) otherlv_4= '}' )
            // InternalMyDsl.g:151:3: otherlv_0= 'Rules' otherlv_1= '{' ( ruleOriginal | ( (lv_variants_3_0= ruleVariant ) )* ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRulesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:159:3: ( ruleOriginal | ( (lv_variants_3_0= ruleVariant ) )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==14||(LA3_0>=20 && LA3_0<=21)||(LA3_0>=28 && LA3_0<=29)||LA3_0==36||LA3_0==38) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:160:4: ruleOriginal
                    {

                    				newCompositeNode(grammarAccess.getRuleAccess().getOriginalParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_9);
                    ruleOriginal();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:168:4: ( (lv_variants_3_0= ruleVariant ) )*
                    {
                    // InternalMyDsl.g:168:4: ( (lv_variants_3_0= ruleVariant ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=20 && LA2_0<=21)||(LA2_0>=28 && LA2_0<=29)||LA2_0==36||LA2_0==38) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:169:5: (lv_variants_3_0= ruleVariant )
                    	    {
                    	    // InternalMyDsl.g:169:5: (lv_variants_3_0= ruleVariant )
                    	    // InternalMyDsl.g:170:6: lv_variants_3_0= ruleVariant
                    	    {

                    	    						newCompositeNode(grammarAccess.getRuleAccess().getVariantsVariantParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_variants_3_0=ruleVariant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variants",
                    	    							lv_variants_3_0,
                    	    							"org.xtext.example.mydsl.MyDsl.Variant");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleOriginal"
    // InternalMyDsl.g:196:1: entryRuleOriginal returns [String current=null] : iv_ruleOriginal= ruleOriginal EOF ;
    public final String entryRuleOriginal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOriginal = null;


        try {
            // InternalMyDsl.g:196:48: (iv_ruleOriginal= ruleOriginal EOF )
            // InternalMyDsl.g:197:2: iv_ruleOriginal= ruleOriginal EOF
            {
             newCompositeNode(grammarAccess.getOriginalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOriginal=ruleOriginal();

            state._fsp--;

             current =iv_ruleOriginal.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOriginal"


    // $ANTLR start "ruleOriginal"
    // InternalMyDsl.g:203:1: ruleOriginal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Original' kw= 'rules.' kw= 'Play' kw= '!' ) ;
    public final AntlrDatatypeRuleToken ruleOriginal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:209:2: ( (kw= 'Original' kw= 'rules.' kw= 'Play' kw= '!' ) )
            // InternalMyDsl.g:210:2: (kw= 'Original' kw= 'rules.' kw= 'Play' kw= '!' )
            {
            // InternalMyDsl.g:210:2: (kw= 'Original' kw= 'rules.' kw= 'Play' kw= '!' )
            // InternalMyDsl.g:211:3: kw= 'Original' kw= 'rules.' kw= 'Play' kw= '!'
            {
            kw=(Token)match(input,16,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getOriginalAccess().getOriginalKeyword_0());
            		
            kw=(Token)match(input,17,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getOriginalAccess().getRulesKeyword_1());
            		
            kw=(Token)match(input,18,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getOriginalAccess().getPlayKeyword_2());
            		
            kw=(Token)match(input,19,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getOriginalAccess().getExclamationMarkKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOriginal"


    // $ANTLR start "entryRuleVariant"
    // InternalMyDsl.g:235:1: entryRuleVariant returns [String current=null] : iv_ruleVariant= ruleVariant EOF ;
    public final String entryRuleVariant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariant = null;


        try {
            // InternalMyDsl.g:235:47: (iv_ruleVariant= ruleVariant EOF )
            // InternalMyDsl.g:236:2: iv_ruleVariant= ruleVariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariant=ruleVariant();

            state._fsp--;

             current =iv_ruleVariant.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariant"


    // $ANTLR start "ruleVariant"
    // InternalMyDsl.g:242:1: ruleVariant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Challenge_0= ruleChallenge | this_CardsEffect_1= ruleCardsEffect | this_Interception_2= ruleInterception | this_CumulatingMalus_3= ruleCumulatingMalus | this_HandsDown_4= ruleHandsDown | this_WithoutMalus_5= ruleWithoutMalus ) ;
    public final AntlrDatatypeRuleToken ruleVariant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Challenge_0 = null;

        AntlrDatatypeRuleToken this_CardsEffect_1 = null;

        AntlrDatatypeRuleToken this_Interception_2 = null;

        AntlrDatatypeRuleToken this_CumulatingMalus_3 = null;

        AntlrDatatypeRuleToken this_HandsDown_4 = null;

        AntlrDatatypeRuleToken this_WithoutMalus_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:248:2: ( (this_Challenge_0= ruleChallenge | this_CardsEffect_1= ruleCardsEffect | this_Interception_2= ruleInterception | this_CumulatingMalus_3= ruleCumulatingMalus | this_HandsDown_4= ruleHandsDown | this_WithoutMalus_5= ruleWithoutMalus ) )
            // InternalMyDsl.g:249:2: (this_Challenge_0= ruleChallenge | this_CardsEffect_1= ruleCardsEffect | this_Interception_2= ruleInterception | this_CumulatingMalus_3= ruleCumulatingMalus | this_HandsDown_4= ruleHandsDown | this_WithoutMalus_5= ruleWithoutMalus )
            {
            // InternalMyDsl.g:249:2: (this_Challenge_0= ruleChallenge | this_CardsEffect_1= ruleCardsEffect | this_Interception_2= ruleInterception | this_CumulatingMalus_3= ruleCumulatingMalus | this_HandsDown_4= ruleHandsDown | this_WithoutMalus_5= ruleWithoutMalus )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 28:
                {
                alt4=3;
                }
                break;
            case 29:
                {
                alt4=4;
                }
                break;
            case 36:
                {
                alt4=5;
                }
                break;
            case 38:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:250:3: this_Challenge_0= ruleChallenge
                    {

                    			newCompositeNode(grammarAccess.getVariantAccess().getChallengeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Challenge_0=ruleChallenge();

                    state._fsp--;


                    			current.merge(this_Challenge_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:261:3: this_CardsEffect_1= ruleCardsEffect
                    {

                    			newCompositeNode(grammarAccess.getVariantAccess().getCardsEffectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CardsEffect_1=ruleCardsEffect();

                    state._fsp--;


                    			current.merge(this_CardsEffect_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:272:3: this_Interception_2= ruleInterception
                    {

                    			newCompositeNode(grammarAccess.getVariantAccess().getInterceptionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interception_2=ruleInterception();

                    state._fsp--;


                    			current.merge(this_Interception_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:283:3: this_CumulatingMalus_3= ruleCumulatingMalus
                    {

                    			newCompositeNode(grammarAccess.getVariantAccess().getCumulatingMalusParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CumulatingMalus_3=ruleCumulatingMalus();

                    state._fsp--;


                    			current.merge(this_CumulatingMalus_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:294:3: this_HandsDown_4= ruleHandsDown
                    {

                    			newCompositeNode(grammarAccess.getVariantAccess().getHandsDownParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_HandsDown_4=ruleHandsDown();

                    state._fsp--;


                    			current.merge(this_HandsDown_4);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:305:3: this_WithoutMalus_5= ruleWithoutMalus
                    {

                    			newCompositeNode(grammarAccess.getVariantAccess().getWithoutMalusParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_WithoutMalus_5=ruleWithoutMalus();

                    state._fsp--;


                    			current.merge(this_WithoutMalus_5);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariant"


    // $ANTLR start "entryRuleChallenge"
    // InternalMyDsl.g:319:1: entryRuleChallenge returns [String current=null] : iv_ruleChallenge= ruleChallenge EOF ;
    public final String entryRuleChallenge() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChallenge = null;


        try {
            // InternalMyDsl.g:319:49: (iv_ruleChallenge= ruleChallenge EOF )
            // InternalMyDsl.g:320:2: iv_ruleChallenge= ruleChallenge EOF
            {
             newCompositeNode(grammarAccess.getChallengeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChallenge=ruleChallenge();

            state._fsp--;

             current =iv_ruleChallenge.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChallenge"


    // $ANTLR start "ruleChallenge"
    // InternalMyDsl.g:326:1: ruleChallenge returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Challenge.' ;
    public final AntlrDatatypeRuleToken ruleChallenge() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:332:2: (kw= 'Challenge.' )
            // InternalMyDsl.g:333:2: kw= 'Challenge.'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getChallengeAccess().getChallengeKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChallenge"


    // $ANTLR start "entryRuleCardsEffect"
    // InternalMyDsl.g:341:1: entryRuleCardsEffect returns [String current=null] : iv_ruleCardsEffect= ruleCardsEffect EOF ;
    public final String entryRuleCardsEffect() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardsEffect = null;


        try {
            // InternalMyDsl.g:341:51: (iv_ruleCardsEffect= ruleCardsEffect EOF )
            // InternalMyDsl.g:342:2: iv_ruleCardsEffect= ruleCardsEffect EOF
            {
             newCompositeNode(grammarAccess.getCardsEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardsEffect=ruleCardsEffect();

            state._fsp--;

             current =iv_ruleCardsEffect.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardsEffect"


    // $ANTLR start "ruleCardsEffect"
    // InternalMyDsl.g:348:1: ruleCardsEffect returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Cards' (kw= 'effects:' )+ ( (kw= 'card' kw= '0.' ) | (kw= 'card' kw= '7.' ) | (kw= 'card' kw= '0' kw= 'and' kw= 'card' kw= '7.' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleCardsEffect() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:354:2: ( (kw= 'Cards' (kw= 'effects:' )+ ( (kw= 'card' kw= '0.' ) | (kw= 'card' kw= '7.' ) | (kw= 'card' kw= '0' kw= 'and' kw= 'card' kw= '7.' ) ) ) )
            // InternalMyDsl.g:355:2: (kw= 'Cards' (kw= 'effects:' )+ ( (kw= 'card' kw= '0.' ) | (kw= 'card' kw= '7.' ) | (kw= 'card' kw= '0' kw= 'and' kw= 'card' kw= '7.' ) ) )
            {
            // InternalMyDsl.g:355:2: (kw= 'Cards' (kw= 'effects:' )+ ( (kw= 'card' kw= '0.' ) | (kw= 'card' kw= '7.' ) | (kw= 'card' kw= '0' kw= 'and' kw= 'card' kw= '7.' ) ) )
            // InternalMyDsl.g:356:3: kw= 'Cards' (kw= 'effects:' )+ ( (kw= 'card' kw= '0.' ) | (kw= 'card' kw= '7.' ) | (kw= 'card' kw= '0' kw= 'and' kw= 'card' kw= '7.' ) )
            {
            kw=(Token)match(input,21,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCardsEffectAccess().getCardsKeyword_0());
            		
            // InternalMyDsl.g:361:3: (kw= 'effects:' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:362:4: kw= 'effects:'
            	    {
            	    kw=(Token)match(input,22,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getCardsEffectAccess().getEffectsKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // InternalMyDsl.g:368:3: ( (kw= 'card' kw= '0.' ) | (kw= 'card' kw= '7.' ) | (kw= 'card' kw= '0' kw= 'and' kw= 'card' kw= '7.' ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt6=1;
                    }
                    break;
                case 26:
                    {
                    alt6=3;
                    }
                    break;
                case 25:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:369:4: (kw= 'card' kw= '0.' )
                    {
                    // InternalMyDsl.g:369:4: (kw= 'card' kw= '0.' )
                    // InternalMyDsl.g:370:5: kw= 'card' kw= '0.'
                    {
                    kw=(Token)match(input,23,FOLLOW_16); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCardsEffectAccess().getCardKeyword_2_0_0());
                    				
                    kw=(Token)match(input,24,FOLLOW_2); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCardsEffectAccess().getDigitZeroFullStopKeyword_2_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:382:4: (kw= 'card' kw= '7.' )
                    {
                    // InternalMyDsl.g:382:4: (kw= 'card' kw= '7.' )
                    // InternalMyDsl.g:383:5: kw= 'card' kw= '7.'
                    {
                    kw=(Token)match(input,23,FOLLOW_17); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCardsEffectAccess().getCardKeyword_2_1_0());
                    				
                    kw=(Token)match(input,25,FOLLOW_2); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCardsEffectAccess().getDigitSevenFullStopKeyword_2_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:395:4: (kw= 'card' kw= '0' kw= 'and' kw= 'card' kw= '7.' )
                    {
                    // InternalMyDsl.g:395:4: (kw= 'card' kw= '0' kw= 'and' kw= 'card' kw= '7.' )
                    // InternalMyDsl.g:396:5: kw= 'card' kw= '0' kw= 'and' kw= 'card' kw= '7.'
                    {
                    kw=(Token)match(input,23,FOLLOW_18); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCardsEffectAccess().getCardKeyword_2_2_0());
                    				
                    kw=(Token)match(input,26,FOLLOW_19); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCardsEffectAccess().getDigitZeroKeyword_2_2_1());
                    				
                    kw=(Token)match(input,27,FOLLOW_20); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCardsEffectAccess().getAndKeyword_2_2_2());
                    				
                    kw=(Token)match(input,23,FOLLOW_17); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCardsEffectAccess().getCardKeyword_2_2_3());
                    				
                    kw=(Token)match(input,25,FOLLOW_2); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCardsEffectAccess().getDigitSevenFullStopKeyword_2_2_4());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardsEffect"


    // $ANTLR start "entryRuleInterception"
    // InternalMyDsl.g:427:1: entryRuleInterception returns [String current=null] : iv_ruleInterception= ruleInterception EOF ;
    public final String entryRuleInterception() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterception = null;


        try {
            // InternalMyDsl.g:427:52: (iv_ruleInterception= ruleInterception EOF )
            // InternalMyDsl.g:428:2: iv_ruleInterception= ruleInterception EOF
            {
             newCompositeNode(grammarAccess.getInterceptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterception=ruleInterception();

            state._fsp--;

             current =iv_ruleInterception.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterception"


    // $ANTLR start "ruleInterception"
    // InternalMyDsl.g:434:1: ruleInterception returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Interception.' ;
    public final AntlrDatatypeRuleToken ruleInterception() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:440:2: (kw= 'Interception.' )
            // InternalMyDsl.g:441:2: kw= 'Interception.'
            {
            kw=(Token)match(input,28,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getInterceptionAccess().getInterceptionKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterception"


    // $ANTLR start "entryRuleCumulatingMalus"
    // InternalMyDsl.g:449:1: entryRuleCumulatingMalus returns [String current=null] : iv_ruleCumulatingMalus= ruleCumulatingMalus EOF ;
    public final String entryRuleCumulatingMalus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCumulatingMalus = null;


        try {
            // InternalMyDsl.g:449:55: (iv_ruleCumulatingMalus= ruleCumulatingMalus EOF )
            // InternalMyDsl.g:450:2: iv_ruleCumulatingMalus= ruleCumulatingMalus EOF
            {
             newCompositeNode(grammarAccess.getCumulatingMalusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCumulatingMalus=ruleCumulatingMalus();

            state._fsp--;

             current =iv_ruleCumulatingMalus.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCumulatingMalus"


    // $ANTLR start "ruleCumulatingMalus"
    // InternalMyDsl.g:456:1: ruleCumulatingMalus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Cumulating' (kw= 'malus:' )+ ( (kw= 'Only' kw= 'plus' kw= '2.' ) | (kw= 'Only' kw= 'plus' kw= '4.' ) | (kw= 'plus' kw= '2' kw= 'and' kw= 'plus' kw= '4.' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleCumulatingMalus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:462:2: ( (kw= 'Cumulating' (kw= 'malus:' )+ ( (kw= 'Only' kw= 'plus' kw= '2.' ) | (kw= 'Only' kw= 'plus' kw= '4.' ) | (kw= 'plus' kw= '2' kw= 'and' kw= 'plus' kw= '4.' ) ) ) )
            // InternalMyDsl.g:463:2: (kw= 'Cumulating' (kw= 'malus:' )+ ( (kw= 'Only' kw= 'plus' kw= '2.' ) | (kw= 'Only' kw= 'plus' kw= '4.' ) | (kw= 'plus' kw= '2' kw= 'and' kw= 'plus' kw= '4.' ) ) )
            {
            // InternalMyDsl.g:463:2: (kw= 'Cumulating' (kw= 'malus:' )+ ( (kw= 'Only' kw= 'plus' kw= '2.' ) | (kw= 'Only' kw= 'plus' kw= '4.' ) | (kw= 'plus' kw= '2' kw= 'and' kw= 'plus' kw= '4.' ) ) )
            // InternalMyDsl.g:464:3: kw= 'Cumulating' (kw= 'malus:' )+ ( (kw= 'Only' kw= 'plus' kw= '2.' ) | (kw= 'Only' kw= 'plus' kw= '4.' ) | (kw= 'plus' kw= '2' kw= 'and' kw= 'plus' kw= '4.' ) )
            {
            kw=(Token)match(input,29,FOLLOW_21); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCumulatingMalusAccess().getCumulatingKeyword_0());
            		
            // InternalMyDsl.g:469:3: (kw= 'malus:' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:470:4: kw= 'malus:'
            	    {
            	    kw=(Token)match(input,30,FOLLOW_22); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getCumulatingMalusAccess().getMalusKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // InternalMyDsl.g:476:3: ( (kw= 'Only' kw= 'plus' kw= '2.' ) | (kw= 'Only' kw= 'plus' kw= '4.' ) | (kw= 'plus' kw= '2' kw= 'and' kw= 'plus' kw= '4.' ) )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==32) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==34) ) {
                        alt8=2;
                    }
                    else if ( (LA8_3==33) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==32) ) {
                alt8=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:477:4: (kw= 'Only' kw= 'plus' kw= '2.' )
                    {
                    // InternalMyDsl.g:477:4: (kw= 'Only' kw= 'plus' kw= '2.' )
                    // InternalMyDsl.g:478:5: kw= 'Only' kw= 'plus' kw= '2.'
                    {
                    kw=(Token)match(input,31,FOLLOW_23); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCumulatingMalusAccess().getOnlyKeyword_2_0_0());
                    				
                    kw=(Token)match(input,32,FOLLOW_24); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCumulatingMalusAccess().getPlusKeyword_2_0_1());
                    				
                    kw=(Token)match(input,33,FOLLOW_2); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCumulatingMalusAccess().getDigitTwoFullStopKeyword_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:495:4: (kw= 'Only' kw= 'plus' kw= '4.' )
                    {
                    // InternalMyDsl.g:495:4: (kw= 'Only' kw= 'plus' kw= '4.' )
                    // InternalMyDsl.g:496:5: kw= 'Only' kw= 'plus' kw= '4.'
                    {
                    kw=(Token)match(input,31,FOLLOW_23); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCumulatingMalusAccess().getOnlyKeyword_2_1_0());
                    				
                    kw=(Token)match(input,32,FOLLOW_25); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCumulatingMalusAccess().getPlusKeyword_2_1_1());
                    				
                    kw=(Token)match(input,34,FOLLOW_2); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCumulatingMalusAccess().getDigitFourFullStopKeyword_2_1_2());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:513:4: (kw= 'plus' kw= '2' kw= 'and' kw= 'plus' kw= '4.' )
                    {
                    // InternalMyDsl.g:513:4: (kw= 'plus' kw= '2' kw= 'and' kw= 'plus' kw= '4.' )
                    // InternalMyDsl.g:514:5: kw= 'plus' kw= '2' kw= 'and' kw= 'plus' kw= '4.'
                    {
                    kw=(Token)match(input,32,FOLLOW_26); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCumulatingMalusAccess().getPlusKeyword_2_2_0());
                    				
                    kw=(Token)match(input,35,FOLLOW_19); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCumulatingMalusAccess().getDigitTwoKeyword_2_2_1());
                    				
                    kw=(Token)match(input,27,FOLLOW_23); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCumulatingMalusAccess().getAndKeyword_2_2_2());
                    				
                    kw=(Token)match(input,32,FOLLOW_25); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCumulatingMalusAccess().getPlusKeyword_2_2_3());
                    				
                    kw=(Token)match(input,34,FOLLOW_2); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getCumulatingMalusAccess().getDigitFourFullStopKeyword_2_2_4());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCumulatingMalus"


    // $ANTLR start "entryRuleHandsDown"
    // InternalMyDsl.g:545:1: entryRuleHandsDown returns [String current=null] : iv_ruleHandsDown= ruleHandsDown EOF ;
    public final String entryRuleHandsDown() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHandsDown = null;


        try {
            // InternalMyDsl.g:545:49: (iv_ruleHandsDown= ruleHandsDown EOF )
            // InternalMyDsl.g:546:2: iv_ruleHandsDown= ruleHandsDown EOF
            {
             newCompositeNode(grammarAccess.getHandsDownRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHandsDown=ruleHandsDown();

            state._fsp--;

             current =iv_ruleHandsDown.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHandsDown"


    // $ANTLR start "ruleHandsDown"
    // InternalMyDsl.g:552:1: ruleHandsDown returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Hands' kw= 'down.' ) ;
    public final AntlrDatatypeRuleToken ruleHandsDown() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:558:2: ( (kw= 'Hands' kw= 'down.' ) )
            // InternalMyDsl.g:559:2: (kw= 'Hands' kw= 'down.' )
            {
            // InternalMyDsl.g:559:2: (kw= 'Hands' kw= 'down.' )
            // InternalMyDsl.g:560:3: kw= 'Hands' kw= 'down.'
            {
            kw=(Token)match(input,36,FOLLOW_27); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getHandsDownAccess().getHandsKeyword_0());
            		
            kw=(Token)match(input,37,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getHandsDownAccess().getDownKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHandsDown"


    // $ANTLR start "entryRuleWithoutMalus"
    // InternalMyDsl.g:574:1: entryRuleWithoutMalus returns [String current=null] : iv_ruleWithoutMalus= ruleWithoutMalus EOF ;
    public final String entryRuleWithoutMalus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWithoutMalus = null;


        try {
            // InternalMyDsl.g:574:52: (iv_ruleWithoutMalus= ruleWithoutMalus EOF )
            // InternalMyDsl.g:575:2: iv_ruleWithoutMalus= ruleWithoutMalus EOF
            {
             newCompositeNode(grammarAccess.getWithoutMalusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWithoutMalus=ruleWithoutMalus();

            state._fsp--;

             current =iv_ruleWithoutMalus.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWithoutMalus"


    // $ANTLR start "ruleWithoutMalus"
    // InternalMyDsl.g:581:1: ruleWithoutMalus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Without' kw= 'malus.' ) ;
    public final AntlrDatatypeRuleToken ruleWithoutMalus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:587:2: ( (kw= 'Without' kw= 'malus.' ) )
            // InternalMyDsl.g:588:2: (kw= 'Without' kw= 'malus.' )
            {
            // InternalMyDsl.g:588:2: (kw= 'Without' kw= 'malus.' )
            // InternalMyDsl.g:589:3: kw= 'Without' kw= 'malus.'
            {
            kw=(Token)match(input,38,FOLLOW_28); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getWithoutMalusAccess().getWithoutKeyword_0());
            		
            kw=(Token)match(input,39,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getWithoutMalusAccess().getMalusKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWithoutMalus"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000005030314000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000005030304000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});

}