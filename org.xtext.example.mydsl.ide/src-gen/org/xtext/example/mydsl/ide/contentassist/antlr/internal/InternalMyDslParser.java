package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Challenge.'", "'Interception.'", "'UNO'", "'game'", "'{'", "'}'", "'Rules'", "'Original'", "'rules.'", "'Play'", "'!'", "'Cards'", "'effects:'", "'card'", "'0.'", "'7.'", "'0'", "'and'", "'Cumulating'", "'malus:'", "'Only'", "'plus'", "'2.'", "'4.'", "'2'", "'Hands'", "'down.'", "'Without'", "'malus.'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleUno"
    // InternalMyDsl.g:53:1: entryRuleUno : ruleUno EOF ;
    public final void entryRuleUno() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleUno EOF )
            // InternalMyDsl.g:55:1: ruleUno EOF
            {
             before(grammarAccess.getUnoRule()); 
            pushFollow(FOLLOW_1);
            ruleUno();

            state._fsp--;

             after(grammarAccess.getUnoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUno"


    // $ANTLR start "ruleUno"
    // InternalMyDsl.g:62:1: ruleUno : ( ( rule__Uno__Group__0 ) ) ;
    public final void ruleUno() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Uno__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Uno__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Uno__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Uno__Group__0 )
            {
             before(grammarAccess.getUnoAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Uno__Group__0 )
            // InternalMyDsl.g:69:4: rule__Uno__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uno__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUno"


    // $ANTLR start "entryRuleRule"
    // InternalMyDsl.g:78:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleRule EOF )
            // InternalMyDsl.g:80:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMyDsl.g:87:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Rule__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Rule__Group__0 )
            // InternalMyDsl.g:94:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleOriginal"
    // InternalMyDsl.g:103:1: entryRuleOriginal : ruleOriginal EOF ;
    public final void entryRuleOriginal() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleOriginal EOF )
            // InternalMyDsl.g:105:1: ruleOriginal EOF
            {
             before(grammarAccess.getOriginalRule()); 
            pushFollow(FOLLOW_1);
            ruleOriginal();

            state._fsp--;

             after(grammarAccess.getOriginalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOriginal"


    // $ANTLR start "ruleOriginal"
    // InternalMyDsl.g:112:1: ruleOriginal : ( ( rule__Original__Group__0 ) ) ;
    public final void ruleOriginal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Original__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Original__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Original__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Original__Group__0 )
            {
             before(grammarAccess.getOriginalAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Original__Group__0 )
            // InternalMyDsl.g:119:4: rule__Original__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Original__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOriginalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOriginal"


    // $ANTLR start "entryRuleVariant"
    // InternalMyDsl.g:128:1: entryRuleVariant : ruleVariant EOF ;
    public final void entryRuleVariant() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleVariant EOF )
            // InternalMyDsl.g:130:1: ruleVariant EOF
            {
             before(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_1);
            ruleVariant();

            state._fsp--;

             after(grammarAccess.getVariantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariant"


    // $ANTLR start "ruleVariant"
    // InternalMyDsl.g:137:1: ruleVariant : ( ( rule__Variant__Alternatives ) ) ;
    public final void ruleVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Variant__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Variant__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Variant__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Variant__Alternatives )
            {
             before(grammarAccess.getVariantAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Variant__Alternatives )
            // InternalMyDsl.g:144:4: rule__Variant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Variant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariant"


    // $ANTLR start "entryRuleChallenge"
    // InternalMyDsl.g:153:1: entryRuleChallenge : ruleChallenge EOF ;
    public final void entryRuleChallenge() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleChallenge EOF )
            // InternalMyDsl.g:155:1: ruleChallenge EOF
            {
             before(grammarAccess.getChallengeRule()); 
            pushFollow(FOLLOW_1);
            ruleChallenge();

            state._fsp--;

             after(grammarAccess.getChallengeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChallenge"


    // $ANTLR start "ruleChallenge"
    // InternalMyDsl.g:162:1: ruleChallenge : ( 'Challenge.' ) ;
    public final void ruleChallenge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( 'Challenge.' ) )
            // InternalMyDsl.g:167:2: ( 'Challenge.' )
            {
            // InternalMyDsl.g:167:2: ( 'Challenge.' )
            // InternalMyDsl.g:168:3: 'Challenge.'
            {
             before(grammarAccess.getChallengeAccess().getChallengeKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getChallengeAccess().getChallengeKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChallenge"


    // $ANTLR start "entryRuleCardsEffect"
    // InternalMyDsl.g:178:1: entryRuleCardsEffect : ruleCardsEffect EOF ;
    public final void entryRuleCardsEffect() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleCardsEffect EOF )
            // InternalMyDsl.g:180:1: ruleCardsEffect EOF
            {
             before(grammarAccess.getCardsEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleCardsEffect();

            state._fsp--;

             after(grammarAccess.getCardsEffectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCardsEffect"


    // $ANTLR start "ruleCardsEffect"
    // InternalMyDsl.g:187:1: ruleCardsEffect : ( ( rule__CardsEffect__Group__0 ) ) ;
    public final void ruleCardsEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__CardsEffect__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__CardsEffect__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__CardsEffect__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__CardsEffect__Group__0 )
            {
             before(grammarAccess.getCardsEffectAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__CardsEffect__Group__0 )
            // InternalMyDsl.g:194:4: rule__CardsEffect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CardsEffect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardsEffectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardsEffect"


    // $ANTLR start "entryRuleInterception"
    // InternalMyDsl.g:203:1: entryRuleInterception : ruleInterception EOF ;
    public final void entryRuleInterception() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleInterception EOF )
            // InternalMyDsl.g:205:1: ruleInterception EOF
            {
             before(grammarAccess.getInterceptionRule()); 
            pushFollow(FOLLOW_1);
            ruleInterception();

            state._fsp--;

             after(grammarAccess.getInterceptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterception"


    // $ANTLR start "ruleInterception"
    // InternalMyDsl.g:212:1: ruleInterception : ( 'Interception.' ) ;
    public final void ruleInterception() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( 'Interception.' ) )
            // InternalMyDsl.g:217:2: ( 'Interception.' )
            {
            // InternalMyDsl.g:217:2: ( 'Interception.' )
            // InternalMyDsl.g:218:3: 'Interception.'
            {
             before(grammarAccess.getInterceptionAccess().getInterceptionKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getInterceptionAccess().getInterceptionKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterception"


    // $ANTLR start "entryRuleCumulatingMalus"
    // InternalMyDsl.g:228:1: entryRuleCumulatingMalus : ruleCumulatingMalus EOF ;
    public final void entryRuleCumulatingMalus() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleCumulatingMalus EOF )
            // InternalMyDsl.g:230:1: ruleCumulatingMalus EOF
            {
             before(grammarAccess.getCumulatingMalusRule()); 
            pushFollow(FOLLOW_1);
            ruleCumulatingMalus();

            state._fsp--;

             after(grammarAccess.getCumulatingMalusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCumulatingMalus"


    // $ANTLR start "ruleCumulatingMalus"
    // InternalMyDsl.g:237:1: ruleCumulatingMalus : ( ( rule__CumulatingMalus__Group__0 ) ) ;
    public final void ruleCumulatingMalus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__CumulatingMalus__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__CumulatingMalus__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__CumulatingMalus__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__CumulatingMalus__Group__0 )
            {
             before(grammarAccess.getCumulatingMalusAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__CumulatingMalus__Group__0 )
            // InternalMyDsl.g:244:4: rule__CumulatingMalus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CumulatingMalus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCumulatingMalusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCumulatingMalus"


    // $ANTLR start "entryRuleHandsDown"
    // InternalMyDsl.g:253:1: entryRuleHandsDown : ruleHandsDown EOF ;
    public final void entryRuleHandsDown() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleHandsDown EOF )
            // InternalMyDsl.g:255:1: ruleHandsDown EOF
            {
             before(grammarAccess.getHandsDownRule()); 
            pushFollow(FOLLOW_1);
            ruleHandsDown();

            state._fsp--;

             after(grammarAccess.getHandsDownRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHandsDown"


    // $ANTLR start "ruleHandsDown"
    // InternalMyDsl.g:262:1: ruleHandsDown : ( ( rule__HandsDown__Group__0 ) ) ;
    public final void ruleHandsDown() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__HandsDown__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__HandsDown__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__HandsDown__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__HandsDown__Group__0 )
            {
             before(grammarAccess.getHandsDownAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__HandsDown__Group__0 )
            // InternalMyDsl.g:269:4: rule__HandsDown__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HandsDown__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHandsDownAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHandsDown"


    // $ANTLR start "entryRuleWithoutMalus"
    // InternalMyDsl.g:278:1: entryRuleWithoutMalus : ruleWithoutMalus EOF ;
    public final void entryRuleWithoutMalus() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleWithoutMalus EOF )
            // InternalMyDsl.g:280:1: ruleWithoutMalus EOF
            {
             before(grammarAccess.getWithoutMalusRule()); 
            pushFollow(FOLLOW_1);
            ruleWithoutMalus();

            state._fsp--;

             after(grammarAccess.getWithoutMalusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWithoutMalus"


    // $ANTLR start "ruleWithoutMalus"
    // InternalMyDsl.g:287:1: ruleWithoutMalus : ( ( rule__WithoutMalus__Group__0 ) ) ;
    public final void ruleWithoutMalus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__WithoutMalus__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__WithoutMalus__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__WithoutMalus__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__WithoutMalus__Group__0 )
            {
             before(grammarAccess.getWithoutMalusAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__WithoutMalus__Group__0 )
            // InternalMyDsl.g:294:4: rule__WithoutMalus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WithoutMalus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWithoutMalusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWithoutMalus"


    // $ANTLR start "rule__Rule__Alternatives_2"
    // InternalMyDsl.g:302:1: rule__Rule__Alternatives_2 : ( ( ruleOriginal ) | ( ( rule__Rule__VariantsAssignment_2_1 )* ) );
    public final void rule__Rule__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:306:1: ( ( ruleOriginal ) | ( ( rule__Rule__VariantsAssignment_2_1 )* ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=11 && LA2_0<=12)||LA2_0==16||LA2_0==22||LA2_0==29||LA2_0==36||LA2_0==38) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:307:2: ( ruleOriginal )
                    {
                    // InternalMyDsl.g:307:2: ( ruleOriginal )
                    // InternalMyDsl.g:308:3: ruleOriginal
                    {
                     before(grammarAccess.getRuleAccess().getOriginalParserRuleCall_2_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOriginal();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getOriginalParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:313:2: ( ( rule__Rule__VariantsAssignment_2_1 )* )
                    {
                    // InternalMyDsl.g:313:2: ( ( rule__Rule__VariantsAssignment_2_1 )* )
                    // InternalMyDsl.g:314:3: ( rule__Rule__VariantsAssignment_2_1 )*
                    {
                     before(grammarAccess.getRuleAccess().getVariantsAssignment_2_1()); 
                    // InternalMyDsl.g:315:3: ( rule__Rule__VariantsAssignment_2_1 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==22||LA1_0==29||LA1_0==36||LA1_0==38) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:315:4: rule__Rule__VariantsAssignment_2_1
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__Rule__VariantsAssignment_2_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     after(grammarAccess.getRuleAccess().getVariantsAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Alternatives_2"


    // $ANTLR start "rule__Variant__Alternatives"
    // InternalMyDsl.g:323:1: rule__Variant__Alternatives : ( ( ruleChallenge ) | ( ruleCardsEffect ) | ( ruleInterception ) | ( ruleCumulatingMalus ) | ( ruleHandsDown ) | ( ruleWithoutMalus ) );
    public final void rule__Variant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:327:1: ( ( ruleChallenge ) | ( ruleCardsEffect ) | ( ruleInterception ) | ( ruleCumulatingMalus ) | ( ruleHandsDown ) | ( ruleWithoutMalus ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 12:
                {
                alt3=3;
                }
                break;
            case 29:
                {
                alt3=4;
                }
                break;
            case 36:
                {
                alt3=5;
                }
                break;
            case 38:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:328:2: ( ruleChallenge )
                    {
                    // InternalMyDsl.g:328:2: ( ruleChallenge )
                    // InternalMyDsl.g:329:3: ruleChallenge
                    {
                     before(grammarAccess.getVariantAccess().getChallengeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleChallenge();

                    state._fsp--;

                     after(grammarAccess.getVariantAccess().getChallengeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:334:2: ( ruleCardsEffect )
                    {
                    // InternalMyDsl.g:334:2: ( ruleCardsEffect )
                    // InternalMyDsl.g:335:3: ruleCardsEffect
                    {
                     before(grammarAccess.getVariantAccess().getCardsEffectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCardsEffect();

                    state._fsp--;

                     after(grammarAccess.getVariantAccess().getCardsEffectParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:340:2: ( ruleInterception )
                    {
                    // InternalMyDsl.g:340:2: ( ruleInterception )
                    // InternalMyDsl.g:341:3: ruleInterception
                    {
                     before(grammarAccess.getVariantAccess().getInterceptionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInterception();

                    state._fsp--;

                     after(grammarAccess.getVariantAccess().getInterceptionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:346:2: ( ruleCumulatingMalus )
                    {
                    // InternalMyDsl.g:346:2: ( ruleCumulatingMalus )
                    // InternalMyDsl.g:347:3: ruleCumulatingMalus
                    {
                     before(grammarAccess.getVariantAccess().getCumulatingMalusParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCumulatingMalus();

                    state._fsp--;

                     after(grammarAccess.getVariantAccess().getCumulatingMalusParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:352:2: ( ruleHandsDown )
                    {
                    // InternalMyDsl.g:352:2: ( ruleHandsDown )
                    // InternalMyDsl.g:353:3: ruleHandsDown
                    {
                     before(grammarAccess.getVariantAccess().getHandsDownParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleHandsDown();

                    state._fsp--;

                     after(grammarAccess.getVariantAccess().getHandsDownParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:358:2: ( ruleWithoutMalus )
                    {
                    // InternalMyDsl.g:358:2: ( ruleWithoutMalus )
                    // InternalMyDsl.g:359:3: ruleWithoutMalus
                    {
                     before(grammarAccess.getVariantAccess().getWithoutMalusParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleWithoutMalus();

                    state._fsp--;

                     after(grammarAccess.getVariantAccess().getWithoutMalusParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Alternatives"


    // $ANTLR start "rule__CardsEffect__Alternatives_2"
    // InternalMyDsl.g:368:1: rule__CardsEffect__Alternatives_2 : ( ( ( rule__CardsEffect__Group_2_0__0 ) ) | ( ( rule__CardsEffect__Group_2_1__0 ) ) | ( ( rule__CardsEffect__Group_2_2__0 ) ) );
    public final void rule__CardsEffect__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:372:1: ( ( ( rule__CardsEffect__Group_2_0__0 ) ) | ( ( rule__CardsEffect__Group_2_1__0 ) ) | ( ( rule__CardsEffect__Group_2_2__0 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt4=3;
                    }
                    break;
                case 26:
                    {
                    alt4=2;
                    }
                    break;
                case 25:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:373:2: ( ( rule__CardsEffect__Group_2_0__0 ) )
                    {
                    // InternalMyDsl.g:373:2: ( ( rule__CardsEffect__Group_2_0__0 ) )
                    // InternalMyDsl.g:374:3: ( rule__CardsEffect__Group_2_0__0 )
                    {
                     before(grammarAccess.getCardsEffectAccess().getGroup_2_0()); 
                    // InternalMyDsl.g:375:3: ( rule__CardsEffect__Group_2_0__0 )
                    // InternalMyDsl.g:375:4: rule__CardsEffect__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CardsEffect__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCardsEffectAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:379:2: ( ( rule__CardsEffect__Group_2_1__0 ) )
                    {
                    // InternalMyDsl.g:379:2: ( ( rule__CardsEffect__Group_2_1__0 ) )
                    // InternalMyDsl.g:380:3: ( rule__CardsEffect__Group_2_1__0 )
                    {
                     before(grammarAccess.getCardsEffectAccess().getGroup_2_1()); 
                    // InternalMyDsl.g:381:3: ( rule__CardsEffect__Group_2_1__0 )
                    // InternalMyDsl.g:381:4: rule__CardsEffect__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CardsEffect__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCardsEffectAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:385:2: ( ( rule__CardsEffect__Group_2_2__0 ) )
                    {
                    // InternalMyDsl.g:385:2: ( ( rule__CardsEffect__Group_2_2__0 ) )
                    // InternalMyDsl.g:386:3: ( rule__CardsEffect__Group_2_2__0 )
                    {
                     before(grammarAccess.getCardsEffectAccess().getGroup_2_2()); 
                    // InternalMyDsl.g:387:3: ( rule__CardsEffect__Group_2_2__0 )
                    // InternalMyDsl.g:387:4: rule__CardsEffect__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CardsEffect__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCardsEffectAccess().getGroup_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Alternatives_2"


    // $ANTLR start "rule__CumulatingMalus__Alternatives_2"
    // InternalMyDsl.g:395:1: rule__CumulatingMalus__Alternatives_2 : ( ( ( rule__CumulatingMalus__Group_2_0__0 ) ) | ( ( rule__CumulatingMalus__Group_2_1__0 ) ) | ( ( rule__CumulatingMalus__Group_2_2__0 ) ) );
    public final void rule__CumulatingMalus__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:399:1: ( ( ( rule__CumulatingMalus__Group_2_0__0 ) ) | ( ( rule__CumulatingMalus__Group_2_1__0 ) ) | ( ( rule__CumulatingMalus__Group_2_2__0 ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==32) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==34) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==33) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==32) ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:400:2: ( ( rule__CumulatingMalus__Group_2_0__0 ) )
                    {
                    // InternalMyDsl.g:400:2: ( ( rule__CumulatingMalus__Group_2_0__0 ) )
                    // InternalMyDsl.g:401:3: ( rule__CumulatingMalus__Group_2_0__0 )
                    {
                     before(grammarAccess.getCumulatingMalusAccess().getGroup_2_0()); 
                    // InternalMyDsl.g:402:3: ( rule__CumulatingMalus__Group_2_0__0 )
                    // InternalMyDsl.g:402:4: rule__CumulatingMalus__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CumulatingMalus__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCumulatingMalusAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:406:2: ( ( rule__CumulatingMalus__Group_2_1__0 ) )
                    {
                    // InternalMyDsl.g:406:2: ( ( rule__CumulatingMalus__Group_2_1__0 ) )
                    // InternalMyDsl.g:407:3: ( rule__CumulatingMalus__Group_2_1__0 )
                    {
                     before(grammarAccess.getCumulatingMalusAccess().getGroup_2_1()); 
                    // InternalMyDsl.g:408:3: ( rule__CumulatingMalus__Group_2_1__0 )
                    // InternalMyDsl.g:408:4: rule__CumulatingMalus__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CumulatingMalus__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCumulatingMalusAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:412:2: ( ( rule__CumulatingMalus__Group_2_2__0 ) )
                    {
                    // InternalMyDsl.g:412:2: ( ( rule__CumulatingMalus__Group_2_2__0 ) )
                    // InternalMyDsl.g:413:3: ( rule__CumulatingMalus__Group_2_2__0 )
                    {
                     before(grammarAccess.getCumulatingMalusAccess().getGroup_2_2()); 
                    // InternalMyDsl.g:414:3: ( rule__CumulatingMalus__Group_2_2__0 )
                    // InternalMyDsl.g:414:4: rule__CumulatingMalus__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CumulatingMalus__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCumulatingMalusAccess().getGroup_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Alternatives_2"


    // $ANTLR start "rule__Uno__Group__0"
    // InternalMyDsl.g:422:1: rule__Uno__Group__0 : rule__Uno__Group__0__Impl rule__Uno__Group__1 ;
    public final void rule__Uno__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:426:1: ( rule__Uno__Group__0__Impl rule__Uno__Group__1 )
            // InternalMyDsl.g:427:2: rule__Uno__Group__0__Impl rule__Uno__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Uno__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uno__Group__0"


    // $ANTLR start "rule__Uno__Group__0__Impl"
    // InternalMyDsl.g:434:1: rule__Uno__Group__0__Impl : ( 'UNO' ) ;
    public final void rule__Uno__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:438:1: ( ( 'UNO' ) )
            // InternalMyDsl.g:439:1: ( 'UNO' )
            {
            // InternalMyDsl.g:439:1: ( 'UNO' )
            // InternalMyDsl.g:440:2: 'UNO'
            {
             before(grammarAccess.getUnoAccess().getUNOKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUnoAccess().getUNOKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uno__Group__0__Impl"


    // $ANTLR start "rule__Uno__Group__1"
    // InternalMyDsl.g:449:1: rule__Uno__Group__1 : rule__Uno__Group__1__Impl rule__Uno__Group__2 ;
    public final void rule__Uno__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( rule__Uno__Group__1__Impl rule__Uno__Group__2 )
            // InternalMyDsl.g:454:2: rule__Uno__Group__1__Impl rule__Uno__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Uno__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uno__Group__1"


    // $ANTLR start "rule__Uno__Group__1__Impl"
    // InternalMyDsl.g:461:1: rule__Uno__Group__1__Impl : ( 'game' ) ;
    public final void rule__Uno__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:465:1: ( ( 'game' ) )
            // InternalMyDsl.g:466:1: ( 'game' )
            {
            // InternalMyDsl.g:466:1: ( 'game' )
            // InternalMyDsl.g:467:2: 'game'
            {
             before(grammarAccess.getUnoAccess().getGameKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getUnoAccess().getGameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uno__Group__1__Impl"


    // $ANTLR start "rule__Uno__Group__2"
    // InternalMyDsl.g:476:1: rule__Uno__Group__2 : rule__Uno__Group__2__Impl rule__Uno__Group__3 ;
    public final void rule__Uno__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( rule__Uno__Group__2__Impl rule__Uno__Group__3 )
            // InternalMyDsl.g:481:2: rule__Uno__Group__2__Impl rule__Uno__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Uno__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uno__Group__2"


    // $ANTLR start "rule__Uno__Group__2__Impl"
    // InternalMyDsl.g:488:1: rule__Uno__Group__2__Impl : ( ( rule__Uno__GameAssignment_2 ) ) ;
    public final void rule__Uno__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:492:1: ( ( ( rule__Uno__GameAssignment_2 ) ) )
            // InternalMyDsl.g:493:1: ( ( rule__Uno__GameAssignment_2 ) )
            {
            // InternalMyDsl.g:493:1: ( ( rule__Uno__GameAssignment_2 ) )
            // InternalMyDsl.g:494:2: ( rule__Uno__GameAssignment_2 )
            {
             before(grammarAccess.getUnoAccess().getGameAssignment_2()); 
            // InternalMyDsl.g:495:2: ( rule__Uno__GameAssignment_2 )
            // InternalMyDsl.g:495:3: rule__Uno__GameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Uno__GameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnoAccess().getGameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uno__Group__2__Impl"


    // $ANTLR start "rule__Uno__Group__3"
    // InternalMyDsl.g:503:1: rule__Uno__Group__3 : rule__Uno__Group__3__Impl rule__Uno__Group__4 ;
    public final void rule__Uno__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( rule__Uno__Group__3__Impl rule__Uno__Group__4 )
            // InternalMyDsl.g:508:2: rule__Uno__Group__3__Impl rule__Uno__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Uno__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uno__Group__3"


    // $ANTLR start "rule__Uno__Group__3__Impl"
    // InternalMyDsl.g:515:1: rule__Uno__Group__3__Impl : ( '{' ) ;
    public final void rule__Uno__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:519:1: ( ( '{' ) )
            // InternalMyDsl.g:520:1: ( '{' )
            {
            // InternalMyDsl.g:520:1: ( '{' )
            // InternalMyDsl.g:521:2: '{'
            {
             before(grammarAccess.getUnoAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUnoAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uno__Group__3__Impl"


    // $ANTLR start "rule__Uno__Group__4"
    // InternalMyDsl.g:530:1: rule__Uno__Group__4 : rule__Uno__Group__4__Impl rule__Uno__Group__5 ;
    public final void rule__Uno__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:534:1: ( rule__Uno__Group__4__Impl rule__Uno__Group__5 )
            // InternalMyDsl.g:535:2: rule__Uno__Group__4__Impl rule__Uno__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Uno__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uno__Group__4"


    // $ANTLR start "rule__Uno__Group__4__Impl"
    // InternalMyDsl.g:542:1: rule__Uno__Group__4__Impl : ( ( ( rule__Uno__RulesAssignment_4 ) ) ( ( rule__Uno__RulesAssignment_4 )* ) ) ;
    public final void rule__Uno__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:546:1: ( ( ( ( rule__Uno__RulesAssignment_4 ) ) ( ( rule__Uno__RulesAssignment_4 )* ) ) )
            // InternalMyDsl.g:547:1: ( ( ( rule__Uno__RulesAssignment_4 ) ) ( ( rule__Uno__RulesAssignment_4 )* ) )
            {
            // InternalMyDsl.g:547:1: ( ( ( rule__Uno__RulesAssignment_4 ) ) ( ( rule__Uno__RulesAssignment_4 )* ) )
            // InternalMyDsl.g:548:2: ( ( rule__Uno__RulesAssignment_4 ) ) ( ( rule__Uno__RulesAssignment_4 )* )
            {
            // InternalMyDsl.g:548:2: ( ( rule__Uno__RulesAssignment_4 ) )
            // InternalMyDsl.g:549:3: ( rule__Uno__RulesAssignment_4 )
            {
             before(grammarAccess.getUnoAccess().getRulesAssignment_4()); 
            // InternalMyDsl.g:550:3: ( rule__Uno__RulesAssignment_4 )
            // InternalMyDsl.g:550:4: rule__Uno__RulesAssignment_4
            {
            pushFollow(FOLLOW_9);
            rule__Uno__RulesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUnoAccess().getRulesAssignment_4()); 

            }

            // InternalMyDsl.g:553:2: ( ( rule__Uno__RulesAssignment_4 )* )
            // InternalMyDsl.g:554:3: ( rule__Uno__RulesAssignment_4 )*
            {
             before(grammarAccess.getUnoAccess().getRulesAssignment_4()); 
            // InternalMyDsl.g:555:3: ( rule__Uno__RulesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:555:4: rule__Uno__RulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Uno__RulesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getUnoAccess().getRulesAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uno__Group__4__Impl"


    // $ANTLR start "rule__Uno__Group__5"
    // InternalMyDsl.g:564:1: rule__Uno__Group__5 : rule__Uno__Group__5__Impl ;
    public final void rule__Uno__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:568:1: ( rule__Uno__Group__5__Impl )
            // InternalMyDsl.g:569:2: rule__Uno__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uno__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uno__Group__5"


    // $ANTLR start "rule__Uno__Group__5__Impl"
    // InternalMyDsl.g:575:1: rule__Uno__Group__5__Impl : ( '}' ) ;
    public final void rule__Uno__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:579:1: ( ( '}' ) )
            // InternalMyDsl.g:580:1: ( '}' )
            {
            // InternalMyDsl.g:580:1: ( '}' )
            // InternalMyDsl.g:581:2: '}'
            {
             before(grammarAccess.getUnoAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUnoAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uno__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalMyDsl.g:591:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:595:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalMyDsl.g:596:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalMyDsl.g:603:1: rule__Rule__Group__0__Impl : ( 'Rules' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:607:1: ( ( 'Rules' ) )
            // InternalMyDsl.g:608:1: ( 'Rules' )
            {
            // InternalMyDsl.g:608:1: ( 'Rules' )
            // InternalMyDsl.g:609:2: 'Rules'
            {
             before(grammarAccess.getRuleAccess().getRulesKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRulesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalMyDsl.g:618:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:622:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalMyDsl.g:623:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalMyDsl.g:630:1: rule__Rule__Group__1__Impl : ( '{' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:634:1: ( ( '{' ) )
            // InternalMyDsl.g:635:1: ( '{' )
            {
            // InternalMyDsl.g:635:1: ( '{' )
            // InternalMyDsl.g:636:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalMyDsl.g:645:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:649:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalMyDsl.g:650:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalMyDsl.g:657:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__Alternatives_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:661:1: ( ( ( rule__Rule__Alternatives_2 ) ) )
            // InternalMyDsl.g:662:1: ( ( rule__Rule__Alternatives_2 ) )
            {
            // InternalMyDsl.g:662:1: ( ( rule__Rule__Alternatives_2 ) )
            // InternalMyDsl.g:663:2: ( rule__Rule__Alternatives_2 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_2()); 
            // InternalMyDsl.g:664:2: ( rule__Rule__Alternatives_2 )
            // InternalMyDsl.g:664:3: rule__Rule__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalMyDsl.g:672:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:676:1: ( rule__Rule__Group__3__Impl )
            // InternalMyDsl.g:677:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalMyDsl.g:683:1: rule__Rule__Group__3__Impl : ( '}' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:687:1: ( ( '}' ) )
            // InternalMyDsl.g:688:1: ( '}' )
            {
            // InternalMyDsl.g:688:1: ( '}' )
            // InternalMyDsl.g:689:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Original__Group__0"
    // InternalMyDsl.g:699:1: rule__Original__Group__0 : rule__Original__Group__0__Impl rule__Original__Group__1 ;
    public final void rule__Original__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:703:1: ( rule__Original__Group__0__Impl rule__Original__Group__1 )
            // InternalMyDsl.g:704:2: rule__Original__Group__0__Impl rule__Original__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Original__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Original__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Original__Group__0"


    // $ANTLR start "rule__Original__Group__0__Impl"
    // InternalMyDsl.g:711:1: rule__Original__Group__0__Impl : ( 'Original' ) ;
    public final void rule__Original__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:715:1: ( ( 'Original' ) )
            // InternalMyDsl.g:716:1: ( 'Original' )
            {
            // InternalMyDsl.g:716:1: ( 'Original' )
            // InternalMyDsl.g:717:2: 'Original'
            {
             before(grammarAccess.getOriginalAccess().getOriginalKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOriginalAccess().getOriginalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Original__Group__0__Impl"


    // $ANTLR start "rule__Original__Group__1"
    // InternalMyDsl.g:726:1: rule__Original__Group__1 : rule__Original__Group__1__Impl rule__Original__Group__2 ;
    public final void rule__Original__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:730:1: ( rule__Original__Group__1__Impl rule__Original__Group__2 )
            // InternalMyDsl.g:731:2: rule__Original__Group__1__Impl rule__Original__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Original__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Original__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Original__Group__1"


    // $ANTLR start "rule__Original__Group__1__Impl"
    // InternalMyDsl.g:738:1: rule__Original__Group__1__Impl : ( 'rules.' ) ;
    public final void rule__Original__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:742:1: ( ( 'rules.' ) )
            // InternalMyDsl.g:743:1: ( 'rules.' )
            {
            // InternalMyDsl.g:743:1: ( 'rules.' )
            // InternalMyDsl.g:744:2: 'rules.'
            {
             before(grammarAccess.getOriginalAccess().getRulesKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOriginalAccess().getRulesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Original__Group__1__Impl"


    // $ANTLR start "rule__Original__Group__2"
    // InternalMyDsl.g:753:1: rule__Original__Group__2 : rule__Original__Group__2__Impl rule__Original__Group__3 ;
    public final void rule__Original__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:757:1: ( rule__Original__Group__2__Impl rule__Original__Group__3 )
            // InternalMyDsl.g:758:2: rule__Original__Group__2__Impl rule__Original__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Original__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Original__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Original__Group__2"


    // $ANTLR start "rule__Original__Group__2__Impl"
    // InternalMyDsl.g:765:1: rule__Original__Group__2__Impl : ( 'Play' ) ;
    public final void rule__Original__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:769:1: ( ( 'Play' ) )
            // InternalMyDsl.g:770:1: ( 'Play' )
            {
            // InternalMyDsl.g:770:1: ( 'Play' )
            // InternalMyDsl.g:771:2: 'Play'
            {
             before(grammarAccess.getOriginalAccess().getPlayKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getOriginalAccess().getPlayKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Original__Group__2__Impl"


    // $ANTLR start "rule__Original__Group__3"
    // InternalMyDsl.g:780:1: rule__Original__Group__3 : rule__Original__Group__3__Impl ;
    public final void rule__Original__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:784:1: ( rule__Original__Group__3__Impl )
            // InternalMyDsl.g:785:2: rule__Original__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Original__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Original__Group__3"


    // $ANTLR start "rule__Original__Group__3__Impl"
    // InternalMyDsl.g:791:1: rule__Original__Group__3__Impl : ( '!' ) ;
    public final void rule__Original__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:795:1: ( ( '!' ) )
            // InternalMyDsl.g:796:1: ( '!' )
            {
            // InternalMyDsl.g:796:1: ( '!' )
            // InternalMyDsl.g:797:2: '!'
            {
             before(grammarAccess.getOriginalAccess().getExclamationMarkKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOriginalAccess().getExclamationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Original__Group__3__Impl"


    // $ANTLR start "rule__CardsEffect__Group__0"
    // InternalMyDsl.g:807:1: rule__CardsEffect__Group__0 : rule__CardsEffect__Group__0__Impl rule__CardsEffect__Group__1 ;
    public final void rule__CardsEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:811:1: ( rule__CardsEffect__Group__0__Impl rule__CardsEffect__Group__1 )
            // InternalMyDsl.g:812:2: rule__CardsEffect__Group__0__Impl rule__CardsEffect__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__CardsEffect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardsEffect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group__0"


    // $ANTLR start "rule__CardsEffect__Group__0__Impl"
    // InternalMyDsl.g:819:1: rule__CardsEffect__Group__0__Impl : ( 'Cards' ) ;
    public final void rule__CardsEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:823:1: ( ( 'Cards' ) )
            // InternalMyDsl.g:824:1: ( 'Cards' )
            {
            // InternalMyDsl.g:824:1: ( 'Cards' )
            // InternalMyDsl.g:825:2: 'Cards'
            {
             before(grammarAccess.getCardsEffectAccess().getCardsKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCardsEffectAccess().getCardsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group__0__Impl"


    // $ANTLR start "rule__CardsEffect__Group__1"
    // InternalMyDsl.g:834:1: rule__CardsEffect__Group__1 : rule__CardsEffect__Group__1__Impl rule__CardsEffect__Group__2 ;
    public final void rule__CardsEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:838:1: ( rule__CardsEffect__Group__1__Impl rule__CardsEffect__Group__2 )
            // InternalMyDsl.g:839:2: rule__CardsEffect__Group__1__Impl rule__CardsEffect__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__CardsEffect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardsEffect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group__1"


    // $ANTLR start "rule__CardsEffect__Group__1__Impl"
    // InternalMyDsl.g:846:1: rule__CardsEffect__Group__1__Impl : ( ( ( 'effects:' ) ) ( ( 'effects:' )* ) ) ;
    public final void rule__CardsEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:850:1: ( ( ( ( 'effects:' ) ) ( ( 'effects:' )* ) ) )
            // InternalMyDsl.g:851:1: ( ( ( 'effects:' ) ) ( ( 'effects:' )* ) )
            {
            // InternalMyDsl.g:851:1: ( ( ( 'effects:' ) ) ( ( 'effects:' )* ) )
            // InternalMyDsl.g:852:2: ( ( 'effects:' ) ) ( ( 'effects:' )* )
            {
            // InternalMyDsl.g:852:2: ( ( 'effects:' ) )
            // InternalMyDsl.g:853:3: ( 'effects:' )
            {
             before(grammarAccess.getCardsEffectAccess().getEffectsKeyword_1()); 
            // InternalMyDsl.g:854:3: ( 'effects:' )
            // InternalMyDsl.g:854:4: 'effects:'
            {
            match(input,23,FOLLOW_16); 

            }

             after(grammarAccess.getCardsEffectAccess().getEffectsKeyword_1()); 

            }

            // InternalMyDsl.g:857:2: ( ( 'effects:' )* )
            // InternalMyDsl.g:858:3: ( 'effects:' )*
            {
             before(grammarAccess.getCardsEffectAccess().getEffectsKeyword_1()); 
            // InternalMyDsl.g:859:3: ( 'effects:' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:859:4: 'effects:'
            	    {
            	    match(input,23,FOLLOW_16); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getCardsEffectAccess().getEffectsKeyword_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group__1__Impl"


    // $ANTLR start "rule__CardsEffect__Group__2"
    // InternalMyDsl.g:868:1: rule__CardsEffect__Group__2 : rule__CardsEffect__Group__2__Impl ;
    public final void rule__CardsEffect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:872:1: ( rule__CardsEffect__Group__2__Impl )
            // InternalMyDsl.g:873:2: rule__CardsEffect__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CardsEffect__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group__2"


    // $ANTLR start "rule__CardsEffect__Group__2__Impl"
    // InternalMyDsl.g:879:1: rule__CardsEffect__Group__2__Impl : ( ( rule__CardsEffect__Alternatives_2 ) ) ;
    public final void rule__CardsEffect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:883:1: ( ( ( rule__CardsEffect__Alternatives_2 ) ) )
            // InternalMyDsl.g:884:1: ( ( rule__CardsEffect__Alternatives_2 ) )
            {
            // InternalMyDsl.g:884:1: ( ( rule__CardsEffect__Alternatives_2 ) )
            // InternalMyDsl.g:885:2: ( rule__CardsEffect__Alternatives_2 )
            {
             before(grammarAccess.getCardsEffectAccess().getAlternatives_2()); 
            // InternalMyDsl.g:886:2: ( rule__CardsEffect__Alternatives_2 )
            // InternalMyDsl.g:886:3: rule__CardsEffect__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__CardsEffect__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getCardsEffectAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group__2__Impl"


    // $ANTLR start "rule__CardsEffect__Group_2_0__0"
    // InternalMyDsl.g:895:1: rule__CardsEffect__Group_2_0__0 : rule__CardsEffect__Group_2_0__0__Impl rule__CardsEffect__Group_2_0__1 ;
    public final void rule__CardsEffect__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:899:1: ( rule__CardsEffect__Group_2_0__0__Impl rule__CardsEffect__Group_2_0__1 )
            // InternalMyDsl.g:900:2: rule__CardsEffect__Group_2_0__0__Impl rule__CardsEffect__Group_2_0__1
            {
            pushFollow(FOLLOW_17);
            rule__CardsEffect__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardsEffect__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_0__0"


    // $ANTLR start "rule__CardsEffect__Group_2_0__0__Impl"
    // InternalMyDsl.g:907:1: rule__CardsEffect__Group_2_0__0__Impl : ( 'card' ) ;
    public final void rule__CardsEffect__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:911:1: ( ( 'card' ) )
            // InternalMyDsl.g:912:1: ( 'card' )
            {
            // InternalMyDsl.g:912:1: ( 'card' )
            // InternalMyDsl.g:913:2: 'card'
            {
             before(grammarAccess.getCardsEffectAccess().getCardKeyword_2_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCardsEffectAccess().getCardKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_0__0__Impl"


    // $ANTLR start "rule__CardsEffect__Group_2_0__1"
    // InternalMyDsl.g:922:1: rule__CardsEffect__Group_2_0__1 : rule__CardsEffect__Group_2_0__1__Impl ;
    public final void rule__CardsEffect__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:926:1: ( rule__CardsEffect__Group_2_0__1__Impl )
            // InternalMyDsl.g:927:2: rule__CardsEffect__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CardsEffect__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_0__1"


    // $ANTLR start "rule__CardsEffect__Group_2_0__1__Impl"
    // InternalMyDsl.g:933:1: rule__CardsEffect__Group_2_0__1__Impl : ( '0.' ) ;
    public final void rule__CardsEffect__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:937:1: ( ( '0.' ) )
            // InternalMyDsl.g:938:1: ( '0.' )
            {
            // InternalMyDsl.g:938:1: ( '0.' )
            // InternalMyDsl.g:939:2: '0.'
            {
             before(grammarAccess.getCardsEffectAccess().getDigitZeroFullStopKeyword_2_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCardsEffectAccess().getDigitZeroFullStopKeyword_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_0__1__Impl"


    // $ANTLR start "rule__CardsEffect__Group_2_1__0"
    // InternalMyDsl.g:949:1: rule__CardsEffect__Group_2_1__0 : rule__CardsEffect__Group_2_1__0__Impl rule__CardsEffect__Group_2_1__1 ;
    public final void rule__CardsEffect__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:953:1: ( rule__CardsEffect__Group_2_1__0__Impl rule__CardsEffect__Group_2_1__1 )
            // InternalMyDsl.g:954:2: rule__CardsEffect__Group_2_1__0__Impl rule__CardsEffect__Group_2_1__1
            {
            pushFollow(FOLLOW_18);
            rule__CardsEffect__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardsEffect__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_1__0"


    // $ANTLR start "rule__CardsEffect__Group_2_1__0__Impl"
    // InternalMyDsl.g:961:1: rule__CardsEffect__Group_2_1__0__Impl : ( 'card' ) ;
    public final void rule__CardsEffect__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:965:1: ( ( 'card' ) )
            // InternalMyDsl.g:966:1: ( 'card' )
            {
            // InternalMyDsl.g:966:1: ( 'card' )
            // InternalMyDsl.g:967:2: 'card'
            {
             before(grammarAccess.getCardsEffectAccess().getCardKeyword_2_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCardsEffectAccess().getCardKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_1__0__Impl"


    // $ANTLR start "rule__CardsEffect__Group_2_1__1"
    // InternalMyDsl.g:976:1: rule__CardsEffect__Group_2_1__1 : rule__CardsEffect__Group_2_1__1__Impl ;
    public final void rule__CardsEffect__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:980:1: ( rule__CardsEffect__Group_2_1__1__Impl )
            // InternalMyDsl.g:981:2: rule__CardsEffect__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CardsEffect__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_1__1"


    // $ANTLR start "rule__CardsEffect__Group_2_1__1__Impl"
    // InternalMyDsl.g:987:1: rule__CardsEffect__Group_2_1__1__Impl : ( '7.' ) ;
    public final void rule__CardsEffect__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:1: ( ( '7.' ) )
            // InternalMyDsl.g:992:1: ( '7.' )
            {
            // InternalMyDsl.g:992:1: ( '7.' )
            // InternalMyDsl.g:993:2: '7.'
            {
             before(grammarAccess.getCardsEffectAccess().getDigitSevenFullStopKeyword_2_1_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCardsEffectAccess().getDigitSevenFullStopKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_1__1__Impl"


    // $ANTLR start "rule__CardsEffect__Group_2_2__0"
    // InternalMyDsl.g:1003:1: rule__CardsEffect__Group_2_2__0 : rule__CardsEffect__Group_2_2__0__Impl rule__CardsEffect__Group_2_2__1 ;
    public final void rule__CardsEffect__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1007:1: ( rule__CardsEffect__Group_2_2__0__Impl rule__CardsEffect__Group_2_2__1 )
            // InternalMyDsl.g:1008:2: rule__CardsEffect__Group_2_2__0__Impl rule__CardsEffect__Group_2_2__1
            {
            pushFollow(FOLLOW_19);
            rule__CardsEffect__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardsEffect__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_2__0"


    // $ANTLR start "rule__CardsEffect__Group_2_2__0__Impl"
    // InternalMyDsl.g:1015:1: rule__CardsEffect__Group_2_2__0__Impl : ( 'card' ) ;
    public final void rule__CardsEffect__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1019:1: ( ( 'card' ) )
            // InternalMyDsl.g:1020:1: ( 'card' )
            {
            // InternalMyDsl.g:1020:1: ( 'card' )
            // InternalMyDsl.g:1021:2: 'card'
            {
             before(grammarAccess.getCardsEffectAccess().getCardKeyword_2_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCardsEffectAccess().getCardKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_2__0__Impl"


    // $ANTLR start "rule__CardsEffect__Group_2_2__1"
    // InternalMyDsl.g:1030:1: rule__CardsEffect__Group_2_2__1 : rule__CardsEffect__Group_2_2__1__Impl rule__CardsEffect__Group_2_2__2 ;
    public final void rule__CardsEffect__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1034:1: ( rule__CardsEffect__Group_2_2__1__Impl rule__CardsEffect__Group_2_2__2 )
            // InternalMyDsl.g:1035:2: rule__CardsEffect__Group_2_2__1__Impl rule__CardsEffect__Group_2_2__2
            {
            pushFollow(FOLLOW_20);
            rule__CardsEffect__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardsEffect__Group_2_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_2__1"


    // $ANTLR start "rule__CardsEffect__Group_2_2__1__Impl"
    // InternalMyDsl.g:1042:1: rule__CardsEffect__Group_2_2__1__Impl : ( '0' ) ;
    public final void rule__CardsEffect__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1046:1: ( ( '0' ) )
            // InternalMyDsl.g:1047:1: ( '0' )
            {
            // InternalMyDsl.g:1047:1: ( '0' )
            // InternalMyDsl.g:1048:2: '0'
            {
             before(grammarAccess.getCardsEffectAccess().getDigitZeroKeyword_2_2_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCardsEffectAccess().getDigitZeroKeyword_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_2__1__Impl"


    // $ANTLR start "rule__CardsEffect__Group_2_2__2"
    // InternalMyDsl.g:1057:1: rule__CardsEffect__Group_2_2__2 : rule__CardsEffect__Group_2_2__2__Impl rule__CardsEffect__Group_2_2__3 ;
    public final void rule__CardsEffect__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1061:1: ( rule__CardsEffect__Group_2_2__2__Impl rule__CardsEffect__Group_2_2__3 )
            // InternalMyDsl.g:1062:2: rule__CardsEffect__Group_2_2__2__Impl rule__CardsEffect__Group_2_2__3
            {
            pushFollow(FOLLOW_15);
            rule__CardsEffect__Group_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardsEffect__Group_2_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_2__2"


    // $ANTLR start "rule__CardsEffect__Group_2_2__2__Impl"
    // InternalMyDsl.g:1069:1: rule__CardsEffect__Group_2_2__2__Impl : ( 'and' ) ;
    public final void rule__CardsEffect__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1073:1: ( ( 'and' ) )
            // InternalMyDsl.g:1074:1: ( 'and' )
            {
            // InternalMyDsl.g:1074:1: ( 'and' )
            // InternalMyDsl.g:1075:2: 'and'
            {
             before(grammarAccess.getCardsEffectAccess().getAndKeyword_2_2_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCardsEffectAccess().getAndKeyword_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_2__2__Impl"


    // $ANTLR start "rule__CardsEffect__Group_2_2__3"
    // InternalMyDsl.g:1084:1: rule__CardsEffect__Group_2_2__3 : rule__CardsEffect__Group_2_2__3__Impl rule__CardsEffect__Group_2_2__4 ;
    public final void rule__CardsEffect__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1088:1: ( rule__CardsEffect__Group_2_2__3__Impl rule__CardsEffect__Group_2_2__4 )
            // InternalMyDsl.g:1089:2: rule__CardsEffect__Group_2_2__3__Impl rule__CardsEffect__Group_2_2__4
            {
            pushFollow(FOLLOW_18);
            rule__CardsEffect__Group_2_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardsEffect__Group_2_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_2__3"


    // $ANTLR start "rule__CardsEffect__Group_2_2__3__Impl"
    // InternalMyDsl.g:1096:1: rule__CardsEffect__Group_2_2__3__Impl : ( 'card' ) ;
    public final void rule__CardsEffect__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1100:1: ( ( 'card' ) )
            // InternalMyDsl.g:1101:1: ( 'card' )
            {
            // InternalMyDsl.g:1101:1: ( 'card' )
            // InternalMyDsl.g:1102:2: 'card'
            {
             before(grammarAccess.getCardsEffectAccess().getCardKeyword_2_2_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCardsEffectAccess().getCardKeyword_2_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_2__3__Impl"


    // $ANTLR start "rule__CardsEffect__Group_2_2__4"
    // InternalMyDsl.g:1111:1: rule__CardsEffect__Group_2_2__4 : rule__CardsEffect__Group_2_2__4__Impl ;
    public final void rule__CardsEffect__Group_2_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( rule__CardsEffect__Group_2_2__4__Impl )
            // InternalMyDsl.g:1116:2: rule__CardsEffect__Group_2_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CardsEffect__Group_2_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_2__4"


    // $ANTLR start "rule__CardsEffect__Group_2_2__4__Impl"
    // InternalMyDsl.g:1122:1: rule__CardsEffect__Group_2_2__4__Impl : ( '7.' ) ;
    public final void rule__CardsEffect__Group_2_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1126:1: ( ( '7.' ) )
            // InternalMyDsl.g:1127:1: ( '7.' )
            {
            // InternalMyDsl.g:1127:1: ( '7.' )
            // InternalMyDsl.g:1128:2: '7.'
            {
             before(grammarAccess.getCardsEffectAccess().getDigitSevenFullStopKeyword_2_2_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCardsEffectAccess().getDigitSevenFullStopKeyword_2_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardsEffect__Group_2_2__4__Impl"


    // $ANTLR start "rule__CumulatingMalus__Group__0"
    // InternalMyDsl.g:1138:1: rule__CumulatingMalus__Group__0 : rule__CumulatingMalus__Group__0__Impl rule__CumulatingMalus__Group__1 ;
    public final void rule__CumulatingMalus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1142:1: ( rule__CumulatingMalus__Group__0__Impl rule__CumulatingMalus__Group__1 )
            // InternalMyDsl.g:1143:2: rule__CumulatingMalus__Group__0__Impl rule__CumulatingMalus__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__CumulatingMalus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CumulatingMalus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group__0"


    // $ANTLR start "rule__CumulatingMalus__Group__0__Impl"
    // InternalMyDsl.g:1150:1: rule__CumulatingMalus__Group__0__Impl : ( 'Cumulating' ) ;
    public final void rule__CumulatingMalus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1154:1: ( ( 'Cumulating' ) )
            // InternalMyDsl.g:1155:1: ( 'Cumulating' )
            {
            // InternalMyDsl.g:1155:1: ( 'Cumulating' )
            // InternalMyDsl.g:1156:2: 'Cumulating'
            {
             before(grammarAccess.getCumulatingMalusAccess().getCumulatingKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCumulatingMalusAccess().getCumulatingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group__0__Impl"


    // $ANTLR start "rule__CumulatingMalus__Group__1"
    // InternalMyDsl.g:1165:1: rule__CumulatingMalus__Group__1 : rule__CumulatingMalus__Group__1__Impl rule__CumulatingMalus__Group__2 ;
    public final void rule__CumulatingMalus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1169:1: ( rule__CumulatingMalus__Group__1__Impl rule__CumulatingMalus__Group__2 )
            // InternalMyDsl.g:1170:2: rule__CumulatingMalus__Group__1__Impl rule__CumulatingMalus__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__CumulatingMalus__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CumulatingMalus__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group__1"


    // $ANTLR start "rule__CumulatingMalus__Group__1__Impl"
    // InternalMyDsl.g:1177:1: rule__CumulatingMalus__Group__1__Impl : ( ( ( 'malus:' ) ) ( ( 'malus:' )* ) ) ;
    public final void rule__CumulatingMalus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1181:1: ( ( ( ( 'malus:' ) ) ( ( 'malus:' )* ) ) )
            // InternalMyDsl.g:1182:1: ( ( ( 'malus:' ) ) ( ( 'malus:' )* ) )
            {
            // InternalMyDsl.g:1182:1: ( ( ( 'malus:' ) ) ( ( 'malus:' )* ) )
            // InternalMyDsl.g:1183:2: ( ( 'malus:' ) ) ( ( 'malus:' )* )
            {
            // InternalMyDsl.g:1183:2: ( ( 'malus:' ) )
            // InternalMyDsl.g:1184:3: ( 'malus:' )
            {
             before(grammarAccess.getCumulatingMalusAccess().getMalusKeyword_1()); 
            // InternalMyDsl.g:1185:3: ( 'malus:' )
            // InternalMyDsl.g:1185:4: 'malus:'
            {
            match(input,30,FOLLOW_23); 

            }

             after(grammarAccess.getCumulatingMalusAccess().getMalusKeyword_1()); 

            }

            // InternalMyDsl.g:1188:2: ( ( 'malus:' )* )
            // InternalMyDsl.g:1189:3: ( 'malus:' )*
            {
             before(grammarAccess.getCumulatingMalusAccess().getMalusKeyword_1()); 
            // InternalMyDsl.g:1190:3: ( 'malus:' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1190:4: 'malus:'
            	    {
            	    match(input,30,FOLLOW_23); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCumulatingMalusAccess().getMalusKeyword_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group__1__Impl"


    // $ANTLR start "rule__CumulatingMalus__Group__2"
    // InternalMyDsl.g:1199:1: rule__CumulatingMalus__Group__2 : rule__CumulatingMalus__Group__2__Impl ;
    public final void rule__CumulatingMalus__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1203:1: ( rule__CumulatingMalus__Group__2__Impl )
            // InternalMyDsl.g:1204:2: rule__CumulatingMalus__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CumulatingMalus__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group__2"


    // $ANTLR start "rule__CumulatingMalus__Group__2__Impl"
    // InternalMyDsl.g:1210:1: rule__CumulatingMalus__Group__2__Impl : ( ( rule__CumulatingMalus__Alternatives_2 ) ) ;
    public final void rule__CumulatingMalus__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1214:1: ( ( ( rule__CumulatingMalus__Alternatives_2 ) ) )
            // InternalMyDsl.g:1215:1: ( ( rule__CumulatingMalus__Alternatives_2 ) )
            {
            // InternalMyDsl.g:1215:1: ( ( rule__CumulatingMalus__Alternatives_2 ) )
            // InternalMyDsl.g:1216:2: ( rule__CumulatingMalus__Alternatives_2 )
            {
             before(grammarAccess.getCumulatingMalusAccess().getAlternatives_2()); 
            // InternalMyDsl.g:1217:2: ( rule__CumulatingMalus__Alternatives_2 )
            // InternalMyDsl.g:1217:3: rule__CumulatingMalus__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__CumulatingMalus__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getCumulatingMalusAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group__2__Impl"


    // $ANTLR start "rule__CumulatingMalus__Group_2_0__0"
    // InternalMyDsl.g:1226:1: rule__CumulatingMalus__Group_2_0__0 : rule__CumulatingMalus__Group_2_0__0__Impl rule__CumulatingMalus__Group_2_0__1 ;
    public final void rule__CumulatingMalus__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1230:1: ( rule__CumulatingMalus__Group_2_0__0__Impl rule__CumulatingMalus__Group_2_0__1 )
            // InternalMyDsl.g:1231:2: rule__CumulatingMalus__Group_2_0__0__Impl rule__CumulatingMalus__Group_2_0__1
            {
            pushFollow(FOLLOW_24);
            rule__CumulatingMalus__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CumulatingMalus__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_0__0"


    // $ANTLR start "rule__CumulatingMalus__Group_2_0__0__Impl"
    // InternalMyDsl.g:1238:1: rule__CumulatingMalus__Group_2_0__0__Impl : ( 'Only' ) ;
    public final void rule__CumulatingMalus__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1242:1: ( ( 'Only' ) )
            // InternalMyDsl.g:1243:1: ( 'Only' )
            {
            // InternalMyDsl.g:1243:1: ( 'Only' )
            // InternalMyDsl.g:1244:2: 'Only'
            {
             before(grammarAccess.getCumulatingMalusAccess().getOnlyKeyword_2_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCumulatingMalusAccess().getOnlyKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_0__0__Impl"


    // $ANTLR start "rule__CumulatingMalus__Group_2_0__1"
    // InternalMyDsl.g:1253:1: rule__CumulatingMalus__Group_2_0__1 : rule__CumulatingMalus__Group_2_0__1__Impl rule__CumulatingMalus__Group_2_0__2 ;
    public final void rule__CumulatingMalus__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1257:1: ( rule__CumulatingMalus__Group_2_0__1__Impl rule__CumulatingMalus__Group_2_0__2 )
            // InternalMyDsl.g:1258:2: rule__CumulatingMalus__Group_2_0__1__Impl rule__CumulatingMalus__Group_2_0__2
            {
            pushFollow(FOLLOW_25);
            rule__CumulatingMalus__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CumulatingMalus__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_0__1"


    // $ANTLR start "rule__CumulatingMalus__Group_2_0__1__Impl"
    // InternalMyDsl.g:1265:1: rule__CumulatingMalus__Group_2_0__1__Impl : ( 'plus' ) ;
    public final void rule__CumulatingMalus__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1269:1: ( ( 'plus' ) )
            // InternalMyDsl.g:1270:1: ( 'plus' )
            {
            // InternalMyDsl.g:1270:1: ( 'plus' )
            // InternalMyDsl.g:1271:2: 'plus'
            {
             before(grammarAccess.getCumulatingMalusAccess().getPlusKeyword_2_0_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCumulatingMalusAccess().getPlusKeyword_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_0__1__Impl"


    // $ANTLR start "rule__CumulatingMalus__Group_2_0__2"
    // InternalMyDsl.g:1280:1: rule__CumulatingMalus__Group_2_0__2 : rule__CumulatingMalus__Group_2_0__2__Impl ;
    public final void rule__CumulatingMalus__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1284:1: ( rule__CumulatingMalus__Group_2_0__2__Impl )
            // InternalMyDsl.g:1285:2: rule__CumulatingMalus__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CumulatingMalus__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_0__2"


    // $ANTLR start "rule__CumulatingMalus__Group_2_0__2__Impl"
    // InternalMyDsl.g:1291:1: rule__CumulatingMalus__Group_2_0__2__Impl : ( '2.' ) ;
    public final void rule__CumulatingMalus__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1295:1: ( ( '2.' ) )
            // InternalMyDsl.g:1296:1: ( '2.' )
            {
            // InternalMyDsl.g:1296:1: ( '2.' )
            // InternalMyDsl.g:1297:2: '2.'
            {
             before(grammarAccess.getCumulatingMalusAccess().getDigitTwoFullStopKeyword_2_0_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCumulatingMalusAccess().getDigitTwoFullStopKeyword_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_0__2__Impl"


    // $ANTLR start "rule__CumulatingMalus__Group_2_1__0"
    // InternalMyDsl.g:1307:1: rule__CumulatingMalus__Group_2_1__0 : rule__CumulatingMalus__Group_2_1__0__Impl rule__CumulatingMalus__Group_2_1__1 ;
    public final void rule__CumulatingMalus__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1311:1: ( rule__CumulatingMalus__Group_2_1__0__Impl rule__CumulatingMalus__Group_2_1__1 )
            // InternalMyDsl.g:1312:2: rule__CumulatingMalus__Group_2_1__0__Impl rule__CumulatingMalus__Group_2_1__1
            {
            pushFollow(FOLLOW_24);
            rule__CumulatingMalus__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CumulatingMalus__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_1__0"


    // $ANTLR start "rule__CumulatingMalus__Group_2_1__0__Impl"
    // InternalMyDsl.g:1319:1: rule__CumulatingMalus__Group_2_1__0__Impl : ( 'Only' ) ;
    public final void rule__CumulatingMalus__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1323:1: ( ( 'Only' ) )
            // InternalMyDsl.g:1324:1: ( 'Only' )
            {
            // InternalMyDsl.g:1324:1: ( 'Only' )
            // InternalMyDsl.g:1325:2: 'Only'
            {
             before(grammarAccess.getCumulatingMalusAccess().getOnlyKeyword_2_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCumulatingMalusAccess().getOnlyKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_1__0__Impl"


    // $ANTLR start "rule__CumulatingMalus__Group_2_1__1"
    // InternalMyDsl.g:1334:1: rule__CumulatingMalus__Group_2_1__1 : rule__CumulatingMalus__Group_2_1__1__Impl rule__CumulatingMalus__Group_2_1__2 ;
    public final void rule__CumulatingMalus__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1338:1: ( rule__CumulatingMalus__Group_2_1__1__Impl rule__CumulatingMalus__Group_2_1__2 )
            // InternalMyDsl.g:1339:2: rule__CumulatingMalus__Group_2_1__1__Impl rule__CumulatingMalus__Group_2_1__2
            {
            pushFollow(FOLLOW_26);
            rule__CumulatingMalus__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CumulatingMalus__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_1__1"


    // $ANTLR start "rule__CumulatingMalus__Group_2_1__1__Impl"
    // InternalMyDsl.g:1346:1: rule__CumulatingMalus__Group_2_1__1__Impl : ( 'plus' ) ;
    public final void rule__CumulatingMalus__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1350:1: ( ( 'plus' ) )
            // InternalMyDsl.g:1351:1: ( 'plus' )
            {
            // InternalMyDsl.g:1351:1: ( 'plus' )
            // InternalMyDsl.g:1352:2: 'plus'
            {
             before(grammarAccess.getCumulatingMalusAccess().getPlusKeyword_2_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCumulatingMalusAccess().getPlusKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_1__1__Impl"


    // $ANTLR start "rule__CumulatingMalus__Group_2_1__2"
    // InternalMyDsl.g:1361:1: rule__CumulatingMalus__Group_2_1__2 : rule__CumulatingMalus__Group_2_1__2__Impl ;
    public final void rule__CumulatingMalus__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1365:1: ( rule__CumulatingMalus__Group_2_1__2__Impl )
            // InternalMyDsl.g:1366:2: rule__CumulatingMalus__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CumulatingMalus__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_1__2"


    // $ANTLR start "rule__CumulatingMalus__Group_2_1__2__Impl"
    // InternalMyDsl.g:1372:1: rule__CumulatingMalus__Group_2_1__2__Impl : ( '4.' ) ;
    public final void rule__CumulatingMalus__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1376:1: ( ( '4.' ) )
            // InternalMyDsl.g:1377:1: ( '4.' )
            {
            // InternalMyDsl.g:1377:1: ( '4.' )
            // InternalMyDsl.g:1378:2: '4.'
            {
             before(grammarAccess.getCumulatingMalusAccess().getDigitFourFullStopKeyword_2_1_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCumulatingMalusAccess().getDigitFourFullStopKeyword_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_1__2__Impl"


    // $ANTLR start "rule__CumulatingMalus__Group_2_2__0"
    // InternalMyDsl.g:1388:1: rule__CumulatingMalus__Group_2_2__0 : rule__CumulatingMalus__Group_2_2__0__Impl rule__CumulatingMalus__Group_2_2__1 ;
    public final void rule__CumulatingMalus__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1392:1: ( rule__CumulatingMalus__Group_2_2__0__Impl rule__CumulatingMalus__Group_2_2__1 )
            // InternalMyDsl.g:1393:2: rule__CumulatingMalus__Group_2_2__0__Impl rule__CumulatingMalus__Group_2_2__1
            {
            pushFollow(FOLLOW_27);
            rule__CumulatingMalus__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CumulatingMalus__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_2__0"


    // $ANTLR start "rule__CumulatingMalus__Group_2_2__0__Impl"
    // InternalMyDsl.g:1400:1: rule__CumulatingMalus__Group_2_2__0__Impl : ( 'plus' ) ;
    public final void rule__CumulatingMalus__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1404:1: ( ( 'plus' ) )
            // InternalMyDsl.g:1405:1: ( 'plus' )
            {
            // InternalMyDsl.g:1405:1: ( 'plus' )
            // InternalMyDsl.g:1406:2: 'plus'
            {
             before(grammarAccess.getCumulatingMalusAccess().getPlusKeyword_2_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCumulatingMalusAccess().getPlusKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_2__0__Impl"


    // $ANTLR start "rule__CumulatingMalus__Group_2_2__1"
    // InternalMyDsl.g:1415:1: rule__CumulatingMalus__Group_2_2__1 : rule__CumulatingMalus__Group_2_2__1__Impl rule__CumulatingMalus__Group_2_2__2 ;
    public final void rule__CumulatingMalus__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1419:1: ( rule__CumulatingMalus__Group_2_2__1__Impl rule__CumulatingMalus__Group_2_2__2 )
            // InternalMyDsl.g:1420:2: rule__CumulatingMalus__Group_2_2__1__Impl rule__CumulatingMalus__Group_2_2__2
            {
            pushFollow(FOLLOW_20);
            rule__CumulatingMalus__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CumulatingMalus__Group_2_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_2__1"


    // $ANTLR start "rule__CumulatingMalus__Group_2_2__1__Impl"
    // InternalMyDsl.g:1427:1: rule__CumulatingMalus__Group_2_2__1__Impl : ( '2' ) ;
    public final void rule__CumulatingMalus__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1431:1: ( ( '2' ) )
            // InternalMyDsl.g:1432:1: ( '2' )
            {
            // InternalMyDsl.g:1432:1: ( '2' )
            // InternalMyDsl.g:1433:2: '2'
            {
             before(grammarAccess.getCumulatingMalusAccess().getDigitTwoKeyword_2_2_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCumulatingMalusAccess().getDigitTwoKeyword_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_2__1__Impl"


    // $ANTLR start "rule__CumulatingMalus__Group_2_2__2"
    // InternalMyDsl.g:1442:1: rule__CumulatingMalus__Group_2_2__2 : rule__CumulatingMalus__Group_2_2__2__Impl rule__CumulatingMalus__Group_2_2__3 ;
    public final void rule__CumulatingMalus__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1446:1: ( rule__CumulatingMalus__Group_2_2__2__Impl rule__CumulatingMalus__Group_2_2__3 )
            // InternalMyDsl.g:1447:2: rule__CumulatingMalus__Group_2_2__2__Impl rule__CumulatingMalus__Group_2_2__3
            {
            pushFollow(FOLLOW_24);
            rule__CumulatingMalus__Group_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CumulatingMalus__Group_2_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_2__2"


    // $ANTLR start "rule__CumulatingMalus__Group_2_2__2__Impl"
    // InternalMyDsl.g:1454:1: rule__CumulatingMalus__Group_2_2__2__Impl : ( 'and' ) ;
    public final void rule__CumulatingMalus__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1458:1: ( ( 'and' ) )
            // InternalMyDsl.g:1459:1: ( 'and' )
            {
            // InternalMyDsl.g:1459:1: ( 'and' )
            // InternalMyDsl.g:1460:2: 'and'
            {
             before(grammarAccess.getCumulatingMalusAccess().getAndKeyword_2_2_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCumulatingMalusAccess().getAndKeyword_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_2__2__Impl"


    // $ANTLR start "rule__CumulatingMalus__Group_2_2__3"
    // InternalMyDsl.g:1469:1: rule__CumulatingMalus__Group_2_2__3 : rule__CumulatingMalus__Group_2_2__3__Impl rule__CumulatingMalus__Group_2_2__4 ;
    public final void rule__CumulatingMalus__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:1: ( rule__CumulatingMalus__Group_2_2__3__Impl rule__CumulatingMalus__Group_2_2__4 )
            // InternalMyDsl.g:1474:2: rule__CumulatingMalus__Group_2_2__3__Impl rule__CumulatingMalus__Group_2_2__4
            {
            pushFollow(FOLLOW_26);
            rule__CumulatingMalus__Group_2_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CumulatingMalus__Group_2_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_2__3"


    // $ANTLR start "rule__CumulatingMalus__Group_2_2__3__Impl"
    // InternalMyDsl.g:1481:1: rule__CumulatingMalus__Group_2_2__3__Impl : ( 'plus' ) ;
    public final void rule__CumulatingMalus__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1485:1: ( ( 'plus' ) )
            // InternalMyDsl.g:1486:1: ( 'plus' )
            {
            // InternalMyDsl.g:1486:1: ( 'plus' )
            // InternalMyDsl.g:1487:2: 'plus'
            {
             before(grammarAccess.getCumulatingMalusAccess().getPlusKeyword_2_2_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCumulatingMalusAccess().getPlusKeyword_2_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_2__3__Impl"


    // $ANTLR start "rule__CumulatingMalus__Group_2_2__4"
    // InternalMyDsl.g:1496:1: rule__CumulatingMalus__Group_2_2__4 : rule__CumulatingMalus__Group_2_2__4__Impl ;
    public final void rule__CumulatingMalus__Group_2_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1500:1: ( rule__CumulatingMalus__Group_2_2__4__Impl )
            // InternalMyDsl.g:1501:2: rule__CumulatingMalus__Group_2_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CumulatingMalus__Group_2_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_2__4"


    // $ANTLR start "rule__CumulatingMalus__Group_2_2__4__Impl"
    // InternalMyDsl.g:1507:1: rule__CumulatingMalus__Group_2_2__4__Impl : ( '4.' ) ;
    public final void rule__CumulatingMalus__Group_2_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1511:1: ( ( '4.' ) )
            // InternalMyDsl.g:1512:1: ( '4.' )
            {
            // InternalMyDsl.g:1512:1: ( '4.' )
            // InternalMyDsl.g:1513:2: '4.'
            {
             before(grammarAccess.getCumulatingMalusAccess().getDigitFourFullStopKeyword_2_2_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCumulatingMalusAccess().getDigitFourFullStopKeyword_2_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CumulatingMalus__Group_2_2__4__Impl"


    // $ANTLR start "rule__HandsDown__Group__0"
    // InternalMyDsl.g:1523:1: rule__HandsDown__Group__0 : rule__HandsDown__Group__0__Impl rule__HandsDown__Group__1 ;
    public final void rule__HandsDown__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1527:1: ( rule__HandsDown__Group__0__Impl rule__HandsDown__Group__1 )
            // InternalMyDsl.g:1528:2: rule__HandsDown__Group__0__Impl rule__HandsDown__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__HandsDown__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HandsDown__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandsDown__Group__0"


    // $ANTLR start "rule__HandsDown__Group__0__Impl"
    // InternalMyDsl.g:1535:1: rule__HandsDown__Group__0__Impl : ( 'Hands' ) ;
    public final void rule__HandsDown__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1539:1: ( ( 'Hands' ) )
            // InternalMyDsl.g:1540:1: ( 'Hands' )
            {
            // InternalMyDsl.g:1540:1: ( 'Hands' )
            // InternalMyDsl.g:1541:2: 'Hands'
            {
             before(grammarAccess.getHandsDownAccess().getHandsKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getHandsDownAccess().getHandsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandsDown__Group__0__Impl"


    // $ANTLR start "rule__HandsDown__Group__1"
    // InternalMyDsl.g:1550:1: rule__HandsDown__Group__1 : rule__HandsDown__Group__1__Impl ;
    public final void rule__HandsDown__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1554:1: ( rule__HandsDown__Group__1__Impl )
            // InternalMyDsl.g:1555:2: rule__HandsDown__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HandsDown__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandsDown__Group__1"


    // $ANTLR start "rule__HandsDown__Group__1__Impl"
    // InternalMyDsl.g:1561:1: rule__HandsDown__Group__1__Impl : ( 'down.' ) ;
    public final void rule__HandsDown__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1565:1: ( ( 'down.' ) )
            // InternalMyDsl.g:1566:1: ( 'down.' )
            {
            // InternalMyDsl.g:1566:1: ( 'down.' )
            // InternalMyDsl.g:1567:2: 'down.'
            {
             before(grammarAccess.getHandsDownAccess().getDownKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getHandsDownAccess().getDownKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandsDown__Group__1__Impl"


    // $ANTLR start "rule__WithoutMalus__Group__0"
    // InternalMyDsl.g:1577:1: rule__WithoutMalus__Group__0 : rule__WithoutMalus__Group__0__Impl rule__WithoutMalus__Group__1 ;
    public final void rule__WithoutMalus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1581:1: ( rule__WithoutMalus__Group__0__Impl rule__WithoutMalus__Group__1 )
            // InternalMyDsl.g:1582:2: rule__WithoutMalus__Group__0__Impl rule__WithoutMalus__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__WithoutMalus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WithoutMalus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithoutMalus__Group__0"


    // $ANTLR start "rule__WithoutMalus__Group__0__Impl"
    // InternalMyDsl.g:1589:1: rule__WithoutMalus__Group__0__Impl : ( 'Without' ) ;
    public final void rule__WithoutMalus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1593:1: ( ( 'Without' ) )
            // InternalMyDsl.g:1594:1: ( 'Without' )
            {
            // InternalMyDsl.g:1594:1: ( 'Without' )
            // InternalMyDsl.g:1595:2: 'Without'
            {
             before(grammarAccess.getWithoutMalusAccess().getWithoutKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getWithoutMalusAccess().getWithoutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithoutMalus__Group__0__Impl"


    // $ANTLR start "rule__WithoutMalus__Group__1"
    // InternalMyDsl.g:1604:1: rule__WithoutMalus__Group__1 : rule__WithoutMalus__Group__1__Impl ;
    public final void rule__WithoutMalus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1608:1: ( rule__WithoutMalus__Group__1__Impl )
            // InternalMyDsl.g:1609:2: rule__WithoutMalus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WithoutMalus__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithoutMalus__Group__1"


    // $ANTLR start "rule__WithoutMalus__Group__1__Impl"
    // InternalMyDsl.g:1615:1: rule__WithoutMalus__Group__1__Impl : ( 'malus.' ) ;
    public final void rule__WithoutMalus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1619:1: ( ( 'malus.' ) )
            // InternalMyDsl.g:1620:1: ( 'malus.' )
            {
            // InternalMyDsl.g:1620:1: ( 'malus.' )
            // InternalMyDsl.g:1621:2: 'malus.'
            {
             before(grammarAccess.getWithoutMalusAccess().getMalusKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getWithoutMalusAccess().getMalusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithoutMalus__Group__1__Impl"


    // $ANTLR start "rule__Uno__GameAssignment_2"
    // InternalMyDsl.g:1631:1: rule__Uno__GameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Uno__GameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1635:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1636:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1636:2: ( RULE_ID )
            // InternalMyDsl.g:1637:3: RULE_ID
            {
             before(grammarAccess.getUnoAccess().getGameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUnoAccess().getGameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uno__GameAssignment_2"


    // $ANTLR start "rule__Uno__RulesAssignment_4"
    // InternalMyDsl.g:1646:1: rule__Uno__RulesAssignment_4 : ( ruleRule ) ;
    public final void rule__Uno__RulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1650:1: ( ( ruleRule ) )
            // InternalMyDsl.g:1651:2: ( ruleRule )
            {
            // InternalMyDsl.g:1651:2: ( ruleRule )
            // InternalMyDsl.g:1652:3: ruleRule
            {
             before(grammarAccess.getUnoAccess().getRulesRuleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getUnoAccess().getRulesRuleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uno__RulesAssignment_4"


    // $ANTLR start "rule__Rule__VariantsAssignment_2_1"
    // InternalMyDsl.g:1661:1: rule__Rule__VariantsAssignment_2_1 : ( ruleVariant ) ;
    public final void rule__Rule__VariantsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1665:1: ( ( ruleVariant ) )
            // InternalMyDsl.g:1666:2: ( ruleVariant )
            {
            // InternalMyDsl.g:1666:2: ( ruleVariant )
            // InternalMyDsl.g:1667:3: ruleVariant
            {
             before(grammarAccess.getRuleAccess().getVariantsVariantParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariant();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getVariantsVariantParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__VariantsAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000005020401802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000005020441800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});

}