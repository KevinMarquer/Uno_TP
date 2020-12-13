package org.xtext.example.unotext.ide.contentassist.antlr.internal;

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
import org.xtext.example.unotext.services.UnoTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUnoTextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Deux : Inverser/Passer_Tour'", "'Trois'", "'Quatre'", "'Cinq'", "'Six'", "'Sept'", "'Huit'", "'Roulette'", "'Showdown'", "'Classique'", "'Avoir500'", "'NePasAvoir500'", "'nombredeManchesGagn\\u00E9s'", "'Reste1Carte'", "'Aumoins4CartesMemeChiffre'", "'Royale'", "'Nombre de joueur : '", "'Uno Classic : '", "'SpecialCard : '", "'GameOver : '", "'FinManche : '", "'CarteIdentiQUE'", "'CumulAjout'", "'Suite : '", "'Simple'", "'UnoOlympique : '", "'UnoWizz : '", "'carteBleue'", "'echange'", "'mainVisible'", "'unoWizz'", "'War'", "'UnoRapido'", "'Pioche'", "'Confusion'", "'Defense'", "'Rapido'", "'CarteUno'", "'UnoChallenge'", "'Carte0_7'", "'More4'", "'tempsLimite'", "'mauvaiseCarte'", "'equipe'", "'CarteVisibles'", "'ThreeHands'", "'ThreePiles'", "'AvecCouleur'", "'PLus2'", "'PLus4'", "'TribunalPopulaire'", "'DistributionAleatoire'", "'SensDefini'", "'ChangementDonneur'", "'VueDesCartesApres1erPose'", "'DonneurPremierose'", "'JeuRapide'", "'Interception'", "'DeuxCartesIdentiques'", "'DecisionCarte'", "'Surenchere'", "'Carte0'", "'Carte7'", "'Carte2'", "'ValeurCarte'", "'presquUno,'", "'chiffreMoins,'", "'couleurMoins,'", "'carteRouge'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalUnoTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUnoTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUnoTextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUnoText.g"; }


    	private UnoTextGrammarAccess grammarAccess;

    	public void setGrammarAccess(UnoTextGrammarAccess grammarAccess) {
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
    // InternalUnoText.g:53:1: entryRuleUno : ruleUno EOF ;
    public final void entryRuleUno() throws RecognitionException {
        try {
            // InternalUnoText.g:54:1: ( ruleUno EOF )
            // InternalUnoText.g:55:1: ruleUno EOF
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
    // InternalUnoText.g:62:1: ruleUno : ( ( rule__Uno__Group__0 ) ) ;
    public final void ruleUno() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:66:2: ( ( ( rule__Uno__Group__0 ) ) )
            // InternalUnoText.g:67:2: ( ( rule__Uno__Group__0 ) )
            {
            // InternalUnoText.g:67:2: ( ( rule__Uno__Group__0 ) )
            // InternalUnoText.g:68:3: ( rule__Uno__Group__0 )
            {
             before(grammarAccess.getUnoAccess().getGroup()); 
            // InternalUnoText.g:69:3: ( rule__Uno__Group__0 )
            // InternalUnoText.g:69:4: rule__Uno__Group__0
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


    // $ANTLR start "entryRuleUno_Rule"
    // InternalUnoText.g:78:1: entryRuleUno_Rule : ruleUno_Rule EOF ;
    public final void entryRuleUno_Rule() throws RecognitionException {
        try {
            // InternalUnoText.g:79:1: ( ruleUno_Rule EOF )
            // InternalUnoText.g:80:1: ruleUno_Rule EOF
            {
             before(grammarAccess.getUno_RuleRule()); 
            pushFollow(FOLLOW_1);
            ruleUno_Rule();

            state._fsp--;

             after(grammarAccess.getUno_RuleRule()); 
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
    // $ANTLR end "entryRuleUno_Rule"


    // $ANTLR start "ruleUno_Rule"
    // InternalUnoText.g:87:1: ruleUno_Rule : ( ( rule__Uno_Rule__Alternatives ) ) ;
    public final void ruleUno_Rule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:91:2: ( ( ( rule__Uno_Rule__Alternatives ) ) )
            // InternalUnoText.g:92:2: ( ( rule__Uno_Rule__Alternatives ) )
            {
            // InternalUnoText.g:92:2: ( ( rule__Uno_Rule__Alternatives ) )
            // InternalUnoText.g:93:3: ( rule__Uno_Rule__Alternatives )
            {
             before(grammarAccess.getUno_RuleAccess().getAlternatives()); 
            // InternalUnoText.g:94:3: ( rule__Uno_Rule__Alternatives )
            // InternalUnoText.g:94:4: rule__Uno_Rule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Uno_Rule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUno_RuleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUno_Rule"


    // $ANTLR start "entryRuleNombreJoueurs"
    // InternalUnoText.g:103:1: entryRuleNombreJoueurs : ruleNombreJoueurs EOF ;
    public final void entryRuleNombreJoueurs() throws RecognitionException {
        try {
            // InternalUnoText.g:104:1: ( ruleNombreJoueurs EOF )
            // InternalUnoText.g:105:1: ruleNombreJoueurs EOF
            {
             before(grammarAccess.getNombreJoueursRule()); 
            pushFollow(FOLLOW_1);
            ruleNombreJoueurs();

            state._fsp--;

             after(grammarAccess.getNombreJoueursRule()); 
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
    // $ANTLR end "entryRuleNombreJoueurs"


    // $ANTLR start "ruleNombreJoueurs"
    // InternalUnoText.g:112:1: ruleNombreJoueurs : ( ( rule__NombreJoueurs__Group__0 ) ) ;
    public final void ruleNombreJoueurs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:116:2: ( ( ( rule__NombreJoueurs__Group__0 ) ) )
            // InternalUnoText.g:117:2: ( ( rule__NombreJoueurs__Group__0 ) )
            {
            // InternalUnoText.g:117:2: ( ( rule__NombreJoueurs__Group__0 ) )
            // InternalUnoText.g:118:3: ( rule__NombreJoueurs__Group__0 )
            {
             before(grammarAccess.getNombreJoueursAccess().getGroup()); 
            // InternalUnoText.g:119:3: ( rule__NombreJoueurs__Group__0 )
            // InternalUnoText.g:119:4: rule__NombreJoueurs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NombreJoueurs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNombreJoueursAccess().getGroup()); 

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
    // $ANTLR end "ruleNombreJoueurs"


    // $ANTLR start "entryRuleDeux"
    // InternalUnoText.g:128:1: entryRuleDeux : ruleDeux EOF ;
    public final void entryRuleDeux() throws RecognitionException {
        try {
            // InternalUnoText.g:129:1: ( ruleDeux EOF )
            // InternalUnoText.g:130:1: ruleDeux EOF
            {
             before(grammarAccess.getDeuxRule()); 
            pushFollow(FOLLOW_1);
            ruleDeux();

            state._fsp--;

             after(grammarAccess.getDeuxRule()); 
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
    // $ANTLR end "entryRuleDeux"


    // $ANTLR start "ruleDeux"
    // InternalUnoText.g:137:1: ruleDeux : ( 'Deux : Inverser/Passer_Tour' ) ;
    public final void ruleDeux() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:141:2: ( ( 'Deux : Inverser/Passer_Tour' ) )
            // InternalUnoText.g:142:2: ( 'Deux : Inverser/Passer_Tour' )
            {
            // InternalUnoText.g:142:2: ( 'Deux : Inverser/Passer_Tour' )
            // InternalUnoText.g:143:3: 'Deux : Inverser/Passer_Tour'
            {
             before(grammarAccess.getDeuxAccess().getDeuxInverserPasser_TourKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDeuxAccess().getDeuxInverserPasser_TourKeyword()); 

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
    // $ANTLR end "ruleDeux"


    // $ANTLR start "entryRuleUno_Classic"
    // InternalUnoText.g:153:1: entryRuleUno_Classic : ruleUno_Classic EOF ;
    public final void entryRuleUno_Classic() throws RecognitionException {
        try {
            // InternalUnoText.g:154:1: ( ruleUno_Classic EOF )
            // InternalUnoText.g:155:1: ruleUno_Classic EOF
            {
             before(grammarAccess.getUno_ClassicRule()); 
            pushFollow(FOLLOW_1);
            ruleUno_Classic();

            state._fsp--;

             after(grammarAccess.getUno_ClassicRule()); 
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
    // $ANTLR end "entryRuleUno_Classic"


    // $ANTLR start "ruleUno_Classic"
    // InternalUnoText.g:162:1: ruleUno_Classic : ( ( rule__Uno_Classic__Group__0 ) ) ;
    public final void ruleUno_Classic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:166:2: ( ( ( rule__Uno_Classic__Group__0 ) ) )
            // InternalUnoText.g:167:2: ( ( rule__Uno_Classic__Group__0 ) )
            {
            // InternalUnoText.g:167:2: ( ( rule__Uno_Classic__Group__0 ) )
            // InternalUnoText.g:168:3: ( rule__Uno_Classic__Group__0 )
            {
             before(grammarAccess.getUno_ClassicAccess().getGroup()); 
            // InternalUnoText.g:169:3: ( rule__Uno_Classic__Group__0 )
            // InternalUnoText.g:169:4: rule__Uno_Classic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUno_ClassicAccess().getGroup()); 

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
    // $ANTLR end "ruleUno_Classic"


    // $ANTLR start "entryRuleSpecialCard"
    // InternalUnoText.g:178:1: entryRuleSpecialCard : ruleSpecialCard EOF ;
    public final void entryRuleSpecialCard() throws RecognitionException {
        try {
            // InternalUnoText.g:179:1: ( ruleSpecialCard EOF )
            // InternalUnoText.g:180:1: ruleSpecialCard EOF
            {
             before(grammarAccess.getSpecialCardRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecialCard();

            state._fsp--;

             after(grammarAccess.getSpecialCardRule()); 
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
    // $ANTLR end "entryRuleSpecialCard"


    // $ANTLR start "ruleSpecialCard"
    // InternalUnoText.g:187:1: ruleSpecialCard : ( ( rule__SpecialCard__Group__0 ) ) ;
    public final void ruleSpecialCard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:191:2: ( ( ( rule__SpecialCard__Group__0 ) ) )
            // InternalUnoText.g:192:2: ( ( rule__SpecialCard__Group__0 ) )
            {
            // InternalUnoText.g:192:2: ( ( rule__SpecialCard__Group__0 ) )
            // InternalUnoText.g:193:3: ( rule__SpecialCard__Group__0 )
            {
             before(grammarAccess.getSpecialCardAccess().getGroup()); 
            // InternalUnoText.g:194:3: ( rule__SpecialCard__Group__0 )
            // InternalUnoText.g:194:4: rule__SpecialCard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpecialCard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecialCardAccess().getGroup()); 

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
    // $ANTLR end "ruleSpecialCard"


    // $ANTLR start "entryRuleGameOver"
    // InternalUnoText.g:203:1: entryRuleGameOver : ruleGameOver EOF ;
    public final void entryRuleGameOver() throws RecognitionException {
        try {
            // InternalUnoText.g:204:1: ( ruleGameOver EOF )
            // InternalUnoText.g:205:1: ruleGameOver EOF
            {
             before(grammarAccess.getGameOverRule()); 
            pushFollow(FOLLOW_1);
            ruleGameOver();

            state._fsp--;

             after(grammarAccess.getGameOverRule()); 
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
    // $ANTLR end "entryRuleGameOver"


    // $ANTLR start "ruleGameOver"
    // InternalUnoText.g:212:1: ruleGameOver : ( ( rule__GameOver__Group__0 ) ) ;
    public final void ruleGameOver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:216:2: ( ( ( rule__GameOver__Group__0 ) ) )
            // InternalUnoText.g:217:2: ( ( rule__GameOver__Group__0 ) )
            {
            // InternalUnoText.g:217:2: ( ( rule__GameOver__Group__0 ) )
            // InternalUnoText.g:218:3: ( rule__GameOver__Group__0 )
            {
             before(grammarAccess.getGameOverAccess().getGroup()); 
            // InternalUnoText.g:219:3: ( rule__GameOver__Group__0 )
            // InternalUnoText.g:219:4: rule__GameOver__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GameOver__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameOverAccess().getGroup()); 

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
    // $ANTLR end "ruleGameOver"


    // $ANTLR start "entryRuleFinManche"
    // InternalUnoText.g:228:1: entryRuleFinManche : ruleFinManche EOF ;
    public final void entryRuleFinManche() throws RecognitionException {
        try {
            // InternalUnoText.g:229:1: ( ruleFinManche EOF )
            // InternalUnoText.g:230:1: ruleFinManche EOF
            {
             before(grammarAccess.getFinMancheRule()); 
            pushFollow(FOLLOW_1);
            ruleFinManche();

            state._fsp--;

             after(grammarAccess.getFinMancheRule()); 
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
    // $ANTLR end "entryRuleFinManche"


    // $ANTLR start "ruleFinManche"
    // InternalUnoText.g:237:1: ruleFinManche : ( ( rule__FinManche__Group__0 ) ) ;
    public final void ruleFinManche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:241:2: ( ( ( rule__FinManche__Group__0 ) ) )
            // InternalUnoText.g:242:2: ( ( rule__FinManche__Group__0 ) )
            {
            // InternalUnoText.g:242:2: ( ( rule__FinManche__Group__0 ) )
            // InternalUnoText.g:243:3: ( rule__FinManche__Group__0 )
            {
             before(grammarAccess.getFinMancheAccess().getGroup()); 
            // InternalUnoText.g:244:3: ( rule__FinManche__Group__0 )
            // InternalUnoText.g:244:4: rule__FinManche__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FinManche__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFinMancheAccess().getGroup()); 

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
    // $ANTLR end "ruleFinManche"


    // $ANTLR start "entryRuleCarteIdentique"
    // InternalUnoText.g:253:1: entryRuleCarteIdentique : ruleCarteIdentique EOF ;
    public final void entryRuleCarteIdentique() throws RecognitionException {
        try {
            // InternalUnoText.g:254:1: ( ruleCarteIdentique EOF )
            // InternalUnoText.g:255:1: ruleCarteIdentique EOF
            {
             before(grammarAccess.getCarteIdentiqueRule()); 
            pushFollow(FOLLOW_1);
            ruleCarteIdentique();

            state._fsp--;

             after(grammarAccess.getCarteIdentiqueRule()); 
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
    // $ANTLR end "entryRuleCarteIdentique"


    // $ANTLR start "ruleCarteIdentique"
    // InternalUnoText.g:262:1: ruleCarteIdentique : ( ( rule__CarteIdentique__Group__0 ) ) ;
    public final void ruleCarteIdentique() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:266:2: ( ( ( rule__CarteIdentique__Group__0 ) ) )
            // InternalUnoText.g:267:2: ( ( rule__CarteIdentique__Group__0 ) )
            {
            // InternalUnoText.g:267:2: ( ( rule__CarteIdentique__Group__0 ) )
            // InternalUnoText.g:268:3: ( rule__CarteIdentique__Group__0 )
            {
             before(grammarAccess.getCarteIdentiqueAccess().getGroup()); 
            // InternalUnoText.g:269:3: ( rule__CarteIdentique__Group__0 )
            // InternalUnoText.g:269:4: rule__CarteIdentique__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CarteIdentique__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCarteIdentiqueAccess().getGroup()); 

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
    // $ANTLR end "ruleCarteIdentique"


    // $ANTLR start "entryRuleCumulAjout"
    // InternalUnoText.g:278:1: entryRuleCumulAjout : ruleCumulAjout EOF ;
    public final void entryRuleCumulAjout() throws RecognitionException {
        try {
            // InternalUnoText.g:279:1: ( ruleCumulAjout EOF )
            // InternalUnoText.g:280:1: ruleCumulAjout EOF
            {
             before(grammarAccess.getCumulAjoutRule()); 
            pushFollow(FOLLOW_1);
            ruleCumulAjout();

            state._fsp--;

             after(grammarAccess.getCumulAjoutRule()); 
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
    // $ANTLR end "entryRuleCumulAjout"


    // $ANTLR start "ruleCumulAjout"
    // InternalUnoText.g:287:1: ruleCumulAjout : ( ( rule__CumulAjout__Group__0 ) ) ;
    public final void ruleCumulAjout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:291:2: ( ( ( rule__CumulAjout__Group__0 ) ) )
            // InternalUnoText.g:292:2: ( ( rule__CumulAjout__Group__0 ) )
            {
            // InternalUnoText.g:292:2: ( ( rule__CumulAjout__Group__0 ) )
            // InternalUnoText.g:293:3: ( rule__CumulAjout__Group__0 )
            {
             before(grammarAccess.getCumulAjoutAccess().getGroup()); 
            // InternalUnoText.g:294:3: ( rule__CumulAjout__Group__0 )
            // InternalUnoText.g:294:4: rule__CumulAjout__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CumulAjout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCumulAjoutAccess().getGroup()); 

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
    // $ANTLR end "ruleCumulAjout"


    // $ANTLR start "entryRuleSuite"
    // InternalUnoText.g:303:1: entryRuleSuite : ruleSuite EOF ;
    public final void entryRuleSuite() throws RecognitionException {
        try {
            // InternalUnoText.g:304:1: ( ruleSuite EOF )
            // InternalUnoText.g:305:1: ruleSuite EOF
            {
             before(grammarAccess.getSuiteRule()); 
            pushFollow(FOLLOW_1);
            ruleSuite();

            state._fsp--;

             after(grammarAccess.getSuiteRule()); 
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
    // $ANTLR end "entryRuleSuite"


    // $ANTLR start "ruleSuite"
    // InternalUnoText.g:312:1: ruleSuite : ( ( rule__Suite__Alternatives ) ) ;
    public final void ruleSuite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:316:2: ( ( ( rule__Suite__Alternatives ) ) )
            // InternalUnoText.g:317:2: ( ( rule__Suite__Alternatives ) )
            {
            // InternalUnoText.g:317:2: ( ( rule__Suite__Alternatives ) )
            // InternalUnoText.g:318:3: ( rule__Suite__Alternatives )
            {
             before(grammarAccess.getSuiteAccess().getAlternatives()); 
            // InternalUnoText.g:319:3: ( rule__Suite__Alternatives )
            // InternalUnoText.g:319:4: rule__Suite__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Suite__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSuiteAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSuite"


    // $ANTLR start "entryRuleUnoOlypique"
    // InternalUnoText.g:328:1: entryRuleUnoOlypique : ruleUnoOlypique EOF ;
    public final void entryRuleUnoOlypique() throws RecognitionException {
        try {
            // InternalUnoText.g:329:1: ( ruleUnoOlypique EOF )
            // InternalUnoText.g:330:1: ruleUnoOlypique EOF
            {
             before(grammarAccess.getUnoOlypiqueRule()); 
            pushFollow(FOLLOW_1);
            ruleUnoOlypique();

            state._fsp--;

             after(grammarAccess.getUnoOlypiqueRule()); 
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
    // $ANTLR end "entryRuleUnoOlypique"


    // $ANTLR start "ruleUnoOlypique"
    // InternalUnoText.g:337:1: ruleUnoOlypique : ( ( rule__UnoOlypique__Group__0 ) ) ;
    public final void ruleUnoOlypique() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:341:2: ( ( ( rule__UnoOlypique__Group__0 ) ) )
            // InternalUnoText.g:342:2: ( ( rule__UnoOlypique__Group__0 ) )
            {
            // InternalUnoText.g:342:2: ( ( rule__UnoOlypique__Group__0 ) )
            // InternalUnoText.g:343:3: ( rule__UnoOlypique__Group__0 )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getGroup()); 
            // InternalUnoText.g:344:3: ( rule__UnoOlypique__Group__0 )
            // InternalUnoText.g:344:4: rule__UnoOlypique__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnoOlypique__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnoOlypiqueAccess().getGroup()); 

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
    // $ANTLR end "ruleUnoOlypique"


    // $ANTLR start "entryRuleUnoWizz"
    // InternalUnoText.g:353:1: entryRuleUnoWizz : ruleUnoWizz EOF ;
    public final void entryRuleUnoWizz() throws RecognitionException {
        try {
            // InternalUnoText.g:354:1: ( ruleUnoWizz EOF )
            // InternalUnoText.g:355:1: ruleUnoWizz EOF
            {
             before(grammarAccess.getUnoWizzRule()); 
            pushFollow(FOLLOW_1);
            ruleUnoWizz();

            state._fsp--;

             after(grammarAccess.getUnoWizzRule()); 
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
    // $ANTLR end "entryRuleUnoWizz"


    // $ANTLR start "ruleUnoWizz"
    // InternalUnoText.g:362:1: ruleUnoWizz : ( ( rule__UnoWizz__Group__0 ) ) ;
    public final void ruleUnoWizz() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:366:2: ( ( ( rule__UnoWizz__Group__0 ) ) )
            // InternalUnoText.g:367:2: ( ( rule__UnoWizz__Group__0 ) )
            {
            // InternalUnoText.g:367:2: ( ( rule__UnoWizz__Group__0 ) )
            // InternalUnoText.g:368:3: ( rule__UnoWizz__Group__0 )
            {
             before(grammarAccess.getUnoWizzAccess().getGroup()); 
            // InternalUnoText.g:369:3: ( rule__UnoWizz__Group__0 )
            // InternalUnoText.g:369:4: rule__UnoWizz__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnoWizz__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnoWizzAccess().getGroup()); 

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
    // $ANTLR end "ruleUnoWizz"


    // $ANTLR start "entryRuleUnoRapido"
    // InternalUnoText.g:378:1: entryRuleUnoRapido : ruleUnoRapido EOF ;
    public final void entryRuleUnoRapido() throws RecognitionException {
        try {
            // InternalUnoText.g:379:1: ( ruleUnoRapido EOF )
            // InternalUnoText.g:380:1: ruleUnoRapido EOF
            {
             before(grammarAccess.getUnoRapidoRule()); 
            pushFollow(FOLLOW_1);
            ruleUnoRapido();

            state._fsp--;

             after(grammarAccess.getUnoRapidoRule()); 
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
    // $ANTLR end "entryRuleUnoRapido"


    // $ANTLR start "ruleUnoRapido"
    // InternalUnoText.g:387:1: ruleUnoRapido : ( ( rule__UnoRapido__Group__0 ) ) ;
    public final void ruleUnoRapido() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:391:2: ( ( ( rule__UnoRapido__Group__0 ) ) )
            // InternalUnoText.g:392:2: ( ( rule__UnoRapido__Group__0 ) )
            {
            // InternalUnoText.g:392:2: ( ( rule__UnoRapido__Group__0 ) )
            // InternalUnoText.g:393:3: ( rule__UnoRapido__Group__0 )
            {
             before(grammarAccess.getUnoRapidoAccess().getGroup()); 
            // InternalUnoText.g:394:3: ( rule__UnoRapido__Group__0 )
            // InternalUnoText.g:394:4: rule__UnoRapido__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnoRapido__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnoRapidoAccess().getGroup()); 

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
    // $ANTLR end "ruleUnoRapido"


    // $ANTLR start "rule__Uno_Rule__Alternatives"
    // InternalUnoText.g:402:1: rule__Uno_Rule__Alternatives : ( ( ruleUno_Classic ) | ( ruleUnoOlypique ) | ( ruleUnoWizz ) | ( ruleUnoRapido ) );
    public final void rule__Uno_Rule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:406:1: ( ( ruleUno_Classic ) | ( ruleUnoOlypique ) | ( ruleUnoWizz ) | ( ruleUnoRapido ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt1=1;
                }
                break;
            case 36:
                {
                alt1=2;
                }
                break;
            case 37:
                {
                alt1=3;
                }
                break;
            case 43:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalUnoText.g:407:2: ( ruleUno_Classic )
                    {
                    // InternalUnoText.g:407:2: ( ruleUno_Classic )
                    // InternalUnoText.g:408:3: ruleUno_Classic
                    {
                     before(grammarAccess.getUno_RuleAccess().getUno_ClassicParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUno_Classic();

                    state._fsp--;

                     after(grammarAccess.getUno_RuleAccess().getUno_ClassicParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoText.g:413:2: ( ruleUnoOlypique )
                    {
                    // InternalUnoText.g:413:2: ( ruleUnoOlypique )
                    // InternalUnoText.g:414:3: ruleUnoOlypique
                    {
                     before(grammarAccess.getUno_RuleAccess().getUnoOlypiqueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnoOlypique();

                    state._fsp--;

                     after(grammarAccess.getUno_RuleAccess().getUnoOlypiqueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUnoText.g:419:2: ( ruleUnoWizz )
                    {
                    // InternalUnoText.g:419:2: ( ruleUnoWizz )
                    // InternalUnoText.g:420:3: ruleUnoWizz
                    {
                     before(grammarAccess.getUno_RuleAccess().getUnoWizzParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUnoWizz();

                    state._fsp--;

                     after(grammarAccess.getUno_RuleAccess().getUnoWizzParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUnoText.g:425:2: ( ruleUnoRapido )
                    {
                    // InternalUnoText.g:425:2: ( ruleUnoRapido )
                    // InternalUnoText.g:426:3: ruleUnoRapido
                    {
                     before(grammarAccess.getUno_RuleAccess().getUnoRapidoParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleUnoRapido();

                    state._fsp--;

                     after(grammarAccess.getUno_RuleAccess().getUnoRapidoParserRuleCall_3()); 

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
    // $ANTLR end "rule__Uno_Rule__Alternatives"


    // $ANTLR start "rule__NombreJoueurs__Alternatives_1"
    // InternalUnoText.g:435:1: rule__NombreJoueurs__Alternatives_1 : ( ( ruleDeux ) | ( 'Trois' ) | ( 'Quatre' ) | ( 'Cinq' ) | ( 'Six' ) | ( 'Sept' ) | ( 'Huit' ) );
    public final void rule__NombreJoueurs__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:439:1: ( ( ruleDeux ) | ( 'Trois' ) | ( 'Quatre' ) | ( 'Cinq' ) | ( 'Six' ) | ( 'Sept' ) | ( 'Huit' ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalUnoText.g:440:2: ( ruleDeux )
                    {
                    // InternalUnoText.g:440:2: ( ruleDeux )
                    // InternalUnoText.g:441:3: ruleDeux
                    {
                     before(grammarAccess.getNombreJoueursAccess().getDeuxParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDeux();

                    state._fsp--;

                     after(grammarAccess.getNombreJoueursAccess().getDeuxParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoText.g:446:2: ( 'Trois' )
                    {
                    // InternalUnoText.g:446:2: ( 'Trois' )
                    // InternalUnoText.g:447:3: 'Trois'
                    {
                     before(grammarAccess.getNombreJoueursAccess().getTroisKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNombreJoueursAccess().getTroisKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUnoText.g:452:2: ( 'Quatre' )
                    {
                    // InternalUnoText.g:452:2: ( 'Quatre' )
                    // InternalUnoText.g:453:3: 'Quatre'
                    {
                     before(grammarAccess.getNombreJoueursAccess().getQuatreKeyword_1_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNombreJoueursAccess().getQuatreKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUnoText.g:458:2: ( 'Cinq' )
                    {
                    // InternalUnoText.g:458:2: ( 'Cinq' )
                    // InternalUnoText.g:459:3: 'Cinq'
                    {
                     before(grammarAccess.getNombreJoueursAccess().getCinqKeyword_1_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNombreJoueursAccess().getCinqKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUnoText.g:464:2: ( 'Six' )
                    {
                    // InternalUnoText.g:464:2: ( 'Six' )
                    // InternalUnoText.g:465:3: 'Six'
                    {
                     before(grammarAccess.getNombreJoueursAccess().getSixKeyword_1_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNombreJoueursAccess().getSixKeyword_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUnoText.g:470:2: ( 'Sept' )
                    {
                    // InternalUnoText.g:470:2: ( 'Sept' )
                    // InternalUnoText.g:471:3: 'Sept'
                    {
                     before(grammarAccess.getNombreJoueursAccess().getSeptKeyword_1_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getNombreJoueursAccess().getSeptKeyword_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUnoText.g:476:2: ( 'Huit' )
                    {
                    // InternalUnoText.g:476:2: ( 'Huit' )
                    // InternalUnoText.g:477:3: 'Huit'
                    {
                     before(grammarAccess.getNombreJoueursAccess().getHuitKeyword_1_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getNombreJoueursAccess().getHuitKeyword_1_6()); 

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
    // $ANTLR end "rule__NombreJoueurs__Alternatives_1"


    // $ANTLR start "rule__SpecialCard__Alternatives_1"
    // InternalUnoText.g:486:1: rule__SpecialCard__Alternatives_1 : ( ( 'Roulette' ) | ( 'Showdown' ) | ( 'Classique' ) );
    public final void rule__SpecialCard__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:490:1: ( ( 'Roulette' ) | ( 'Showdown' ) | ( 'Classique' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalUnoText.g:491:2: ( 'Roulette' )
                    {
                    // InternalUnoText.g:491:2: ( 'Roulette' )
                    // InternalUnoText.g:492:3: 'Roulette'
                    {
                     before(grammarAccess.getSpecialCardAccess().getRouletteKeyword_1_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSpecialCardAccess().getRouletteKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoText.g:497:2: ( 'Showdown' )
                    {
                    // InternalUnoText.g:497:2: ( 'Showdown' )
                    // InternalUnoText.g:498:3: 'Showdown'
                    {
                     before(grammarAccess.getSpecialCardAccess().getShowdownKeyword_1_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSpecialCardAccess().getShowdownKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUnoText.g:503:2: ( 'Classique' )
                    {
                    // InternalUnoText.g:503:2: ( 'Classique' )
                    // InternalUnoText.g:504:3: 'Classique'
                    {
                     before(grammarAccess.getSpecialCardAccess().getClassiqueKeyword_1_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getSpecialCardAccess().getClassiqueKeyword_1_2()); 

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
    // $ANTLR end "rule__SpecialCard__Alternatives_1"


    // $ANTLR start "rule__GameOver__Alternatives_1"
    // InternalUnoText.g:513:1: rule__GameOver__Alternatives_1 : ( ( 'Avoir500' ) | ( 'NePasAvoir500' ) | ( 'nombredeManchesGagn\\u00E9s' ) );
    public final void rule__GameOver__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:517:1: ( ( 'Avoir500' ) | ( 'NePasAvoir500' ) | ( 'nombredeManchesGagn\\u00E9s' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalUnoText.g:518:2: ( 'Avoir500' )
                    {
                    // InternalUnoText.g:518:2: ( 'Avoir500' )
                    // InternalUnoText.g:519:3: 'Avoir500'
                    {
                     before(grammarAccess.getGameOverAccess().getAvoir500Keyword_1_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getGameOverAccess().getAvoir500Keyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoText.g:524:2: ( 'NePasAvoir500' )
                    {
                    // InternalUnoText.g:524:2: ( 'NePasAvoir500' )
                    // InternalUnoText.g:525:3: 'NePasAvoir500'
                    {
                     before(grammarAccess.getGameOverAccess().getNePasAvoir500Keyword_1_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getGameOverAccess().getNePasAvoir500Keyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUnoText.g:530:2: ( 'nombredeManchesGagn\\u00E9s' )
                    {
                    // InternalUnoText.g:530:2: ( 'nombredeManchesGagn\\u00E9s' )
                    // InternalUnoText.g:531:3: 'nombredeManchesGagn\\u00E9s'
                    {
                     before(grammarAccess.getGameOverAccess().getNombredeManchesGagnSKeyword_1_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getGameOverAccess().getNombredeManchesGagnSKeyword_1_2()); 

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
    // $ANTLR end "rule__GameOver__Alternatives_1"


    // $ANTLR start "rule__FinManche__Alternatives_1"
    // InternalUnoText.g:540:1: rule__FinManche__Alternatives_1 : ( ( 'Reste1Carte' ) | ( 'Aumoins4CartesMemeChiffre' ) );
    public final void rule__FinManche__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:544:1: ( ( 'Reste1Carte' ) | ( 'Aumoins4CartesMemeChiffre' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUnoText.g:545:2: ( 'Reste1Carte' )
                    {
                    // InternalUnoText.g:545:2: ( 'Reste1Carte' )
                    // InternalUnoText.g:546:3: 'Reste1Carte'
                    {
                     before(grammarAccess.getFinMancheAccess().getReste1CarteKeyword_1_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getFinMancheAccess().getReste1CarteKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoText.g:551:2: ( 'Aumoins4CartesMemeChiffre' )
                    {
                    // InternalUnoText.g:551:2: ( 'Aumoins4CartesMemeChiffre' )
                    // InternalUnoText.g:552:3: 'Aumoins4CartesMemeChiffre'
                    {
                     before(grammarAccess.getFinMancheAccess().getAumoins4CartesMemeChiffreKeyword_1_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getFinMancheAccess().getAumoins4CartesMemeChiffreKeyword_1_1()); 

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
    // $ANTLR end "rule__FinManche__Alternatives_1"


    // $ANTLR start "rule__Suite__Alternatives"
    // InternalUnoText.g:561:1: rule__Suite__Alternatives : ( ( ( rule__Suite__Group_0__0 ) ) | ( 'Royale' ) );
    public final void rule__Suite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:565:1: ( ( ( rule__Suite__Group_0__0 ) ) | ( 'Royale' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34) ) {
                alt6=1;
            }
            else if ( (LA6_0==26) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUnoText.g:566:2: ( ( rule__Suite__Group_0__0 ) )
                    {
                    // InternalUnoText.g:566:2: ( ( rule__Suite__Group_0__0 ) )
                    // InternalUnoText.g:567:3: ( rule__Suite__Group_0__0 )
                    {
                     before(grammarAccess.getSuiteAccess().getGroup_0()); 
                    // InternalUnoText.g:568:3: ( rule__Suite__Group_0__0 )
                    // InternalUnoText.g:568:4: rule__Suite__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Suite__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSuiteAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoText.g:572:2: ( 'Royale' )
                    {
                    // InternalUnoText.g:572:2: ( 'Royale' )
                    // InternalUnoText.g:573:3: 'Royale'
                    {
                     before(grammarAccess.getSuiteAccess().getRoyaleKeyword_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getSuiteAccess().getRoyaleKeyword_1()); 

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
    // $ANTLR end "rule__Suite__Alternatives"


    // $ANTLR start "rule__Uno__Group__0"
    // InternalUnoText.g:582:1: rule__Uno__Group__0 : rule__Uno__Group__0__Impl rule__Uno__Group__1 ;
    public final void rule__Uno__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:586:1: ( rule__Uno__Group__0__Impl rule__Uno__Group__1 )
            // InternalUnoText.g:587:2: rule__Uno__Group__0__Impl rule__Uno__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalUnoText.g:594:1: rule__Uno__Group__0__Impl : ( ( rule__Uno__UnoAssignment_0 ) ) ;
    public final void rule__Uno__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:598:1: ( ( ( rule__Uno__UnoAssignment_0 ) ) )
            // InternalUnoText.g:599:1: ( ( rule__Uno__UnoAssignment_0 ) )
            {
            // InternalUnoText.g:599:1: ( ( rule__Uno__UnoAssignment_0 ) )
            // InternalUnoText.g:600:2: ( rule__Uno__UnoAssignment_0 )
            {
             before(grammarAccess.getUnoAccess().getUnoAssignment_0()); 
            // InternalUnoText.g:601:2: ( rule__Uno__UnoAssignment_0 )
            // InternalUnoText.g:601:3: rule__Uno__UnoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Uno__UnoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUnoAccess().getUnoAssignment_0()); 

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
    // InternalUnoText.g:609:1: rule__Uno__Group__1 : rule__Uno__Group__1__Impl ;
    public final void rule__Uno__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:613:1: ( rule__Uno__Group__1__Impl )
            // InternalUnoText.g:614:2: rule__Uno__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uno__Group__1__Impl();

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
    // InternalUnoText.g:620:1: rule__Uno__Group__1__Impl : ( ( rule__Uno__NombreJoueurAssignment_1 ) ) ;
    public final void rule__Uno__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:624:1: ( ( ( rule__Uno__NombreJoueurAssignment_1 ) ) )
            // InternalUnoText.g:625:1: ( ( rule__Uno__NombreJoueurAssignment_1 ) )
            {
            // InternalUnoText.g:625:1: ( ( rule__Uno__NombreJoueurAssignment_1 ) )
            // InternalUnoText.g:626:2: ( rule__Uno__NombreJoueurAssignment_1 )
            {
             before(grammarAccess.getUnoAccess().getNombreJoueurAssignment_1()); 
            // InternalUnoText.g:627:2: ( rule__Uno__NombreJoueurAssignment_1 )
            // InternalUnoText.g:627:3: rule__Uno__NombreJoueurAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Uno__NombreJoueurAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnoAccess().getNombreJoueurAssignment_1()); 

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


    // $ANTLR start "rule__NombreJoueurs__Group__0"
    // InternalUnoText.g:636:1: rule__NombreJoueurs__Group__0 : rule__NombreJoueurs__Group__0__Impl rule__NombreJoueurs__Group__1 ;
    public final void rule__NombreJoueurs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:640:1: ( rule__NombreJoueurs__Group__0__Impl rule__NombreJoueurs__Group__1 )
            // InternalUnoText.g:641:2: rule__NombreJoueurs__Group__0__Impl rule__NombreJoueurs__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__NombreJoueurs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NombreJoueurs__Group__1();

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
    // $ANTLR end "rule__NombreJoueurs__Group__0"


    // $ANTLR start "rule__NombreJoueurs__Group__0__Impl"
    // InternalUnoText.g:648:1: rule__NombreJoueurs__Group__0__Impl : ( ( ( 'Nombre de joueur : ' ) ) ( ( 'Nombre de joueur : ' )* ) ) ;
    public final void rule__NombreJoueurs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:652:1: ( ( ( ( 'Nombre de joueur : ' ) ) ( ( 'Nombre de joueur : ' )* ) ) )
            // InternalUnoText.g:653:1: ( ( ( 'Nombre de joueur : ' ) ) ( ( 'Nombre de joueur : ' )* ) )
            {
            // InternalUnoText.g:653:1: ( ( ( 'Nombre de joueur : ' ) ) ( ( 'Nombre de joueur : ' )* ) )
            // InternalUnoText.g:654:2: ( ( 'Nombre de joueur : ' ) ) ( ( 'Nombre de joueur : ' )* )
            {
            // InternalUnoText.g:654:2: ( ( 'Nombre de joueur : ' ) )
            // InternalUnoText.g:655:3: ( 'Nombre de joueur : ' )
            {
             before(grammarAccess.getNombreJoueursAccess().getNombreDeJoueurKeyword_0()); 
            // InternalUnoText.g:656:3: ( 'Nombre de joueur : ' )
            // InternalUnoText.g:656:4: 'Nombre de joueur : '
            {
            match(input,27,FOLLOW_5); 

            }

             after(grammarAccess.getNombreJoueursAccess().getNombreDeJoueurKeyword_0()); 

            }

            // InternalUnoText.g:659:2: ( ( 'Nombre de joueur : ' )* )
            // InternalUnoText.g:660:3: ( 'Nombre de joueur : ' )*
            {
             before(grammarAccess.getNombreJoueursAccess().getNombreDeJoueurKeyword_0()); 
            // InternalUnoText.g:661:3: ( 'Nombre de joueur : ' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUnoText.g:661:4: 'Nombre de joueur : '
            	    {
            	    match(input,27,FOLLOW_5); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getNombreJoueursAccess().getNombreDeJoueurKeyword_0()); 

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
    // $ANTLR end "rule__NombreJoueurs__Group__0__Impl"


    // $ANTLR start "rule__NombreJoueurs__Group__1"
    // InternalUnoText.g:670:1: rule__NombreJoueurs__Group__1 : rule__NombreJoueurs__Group__1__Impl ;
    public final void rule__NombreJoueurs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:674:1: ( rule__NombreJoueurs__Group__1__Impl )
            // InternalUnoText.g:675:2: rule__NombreJoueurs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NombreJoueurs__Group__1__Impl();

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
    // $ANTLR end "rule__NombreJoueurs__Group__1"


    // $ANTLR start "rule__NombreJoueurs__Group__1__Impl"
    // InternalUnoText.g:681:1: rule__NombreJoueurs__Group__1__Impl : ( ( rule__NombreJoueurs__Alternatives_1 ) ) ;
    public final void rule__NombreJoueurs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:685:1: ( ( ( rule__NombreJoueurs__Alternatives_1 ) ) )
            // InternalUnoText.g:686:1: ( ( rule__NombreJoueurs__Alternatives_1 ) )
            {
            // InternalUnoText.g:686:1: ( ( rule__NombreJoueurs__Alternatives_1 ) )
            // InternalUnoText.g:687:2: ( rule__NombreJoueurs__Alternatives_1 )
            {
             before(grammarAccess.getNombreJoueursAccess().getAlternatives_1()); 
            // InternalUnoText.g:688:2: ( rule__NombreJoueurs__Alternatives_1 )
            // InternalUnoText.g:688:3: rule__NombreJoueurs__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__NombreJoueurs__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getNombreJoueursAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__NombreJoueurs__Group__1__Impl"


    // $ANTLR start "rule__Uno_Classic__Group__0"
    // InternalUnoText.g:697:1: rule__Uno_Classic__Group__0 : rule__Uno_Classic__Group__0__Impl rule__Uno_Classic__Group__1 ;
    public final void rule__Uno_Classic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:701:1: ( rule__Uno_Classic__Group__0__Impl rule__Uno_Classic__Group__1 )
            // InternalUnoText.g:702:2: rule__Uno_Classic__Group__0__Impl rule__Uno_Classic__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Uno_Classic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__1();

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
    // $ANTLR end "rule__Uno_Classic__Group__0"


    // $ANTLR start "rule__Uno_Classic__Group__0__Impl"
    // InternalUnoText.g:709:1: rule__Uno_Classic__Group__0__Impl : ( ( ( 'Uno Classic : ' ) ) ( ( 'Uno Classic : ' )* ) ) ;
    public final void rule__Uno_Classic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:713:1: ( ( ( ( 'Uno Classic : ' ) ) ( ( 'Uno Classic : ' )* ) ) )
            // InternalUnoText.g:714:1: ( ( ( 'Uno Classic : ' ) ) ( ( 'Uno Classic : ' )* ) )
            {
            // InternalUnoText.g:714:1: ( ( ( 'Uno Classic : ' ) ) ( ( 'Uno Classic : ' )* ) )
            // InternalUnoText.g:715:2: ( ( 'Uno Classic : ' ) ) ( ( 'Uno Classic : ' )* )
            {
            // InternalUnoText.g:715:2: ( ( 'Uno Classic : ' ) )
            // InternalUnoText.g:716:3: ( 'Uno Classic : ' )
            {
             before(grammarAccess.getUno_ClassicAccess().getUnoClassicKeyword_0()); 
            // InternalUnoText.g:717:3: ( 'Uno Classic : ' )
            // InternalUnoText.g:717:4: 'Uno Classic : '
            {
            match(input,28,FOLLOW_7); 

            }

             after(grammarAccess.getUno_ClassicAccess().getUnoClassicKeyword_0()); 

            }

            // InternalUnoText.g:720:2: ( ( 'Uno Classic : ' )* )
            // InternalUnoText.g:721:3: ( 'Uno Classic : ' )*
            {
             before(grammarAccess.getUno_ClassicAccess().getUnoClassicKeyword_0()); 
            // InternalUnoText.g:722:3: ( 'Uno Classic : ' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUnoText.g:722:4: 'Uno Classic : '
            	    {
            	    match(input,28,FOLLOW_7); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getUno_ClassicAccess().getUnoClassicKeyword_0()); 

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
    // $ANTLR end "rule__Uno_Classic__Group__0__Impl"


    // $ANTLR start "rule__Uno_Classic__Group__1"
    // InternalUnoText.g:731:1: rule__Uno_Classic__Group__1 : rule__Uno_Classic__Group__1__Impl rule__Uno_Classic__Group__2 ;
    public final void rule__Uno_Classic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:735:1: ( rule__Uno_Classic__Group__1__Impl rule__Uno_Classic__Group__2 )
            // InternalUnoText.g:736:2: rule__Uno_Classic__Group__1__Impl rule__Uno_Classic__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Uno_Classic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__2();

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
    // $ANTLR end "rule__Uno_Classic__Group__1"


    // $ANTLR start "rule__Uno_Classic__Group__1__Impl"
    // InternalUnoText.g:743:1: rule__Uno_Classic__Group__1__Impl : ( ( rule__Uno_Classic__UnoChallengeAssignment_1 )* ) ;
    public final void rule__Uno_Classic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:747:1: ( ( ( rule__Uno_Classic__UnoChallengeAssignment_1 )* ) )
            // InternalUnoText.g:748:1: ( ( rule__Uno_Classic__UnoChallengeAssignment_1 )* )
            {
            // InternalUnoText.g:748:1: ( ( rule__Uno_Classic__UnoChallengeAssignment_1 )* )
            // InternalUnoText.g:749:2: ( rule__Uno_Classic__UnoChallengeAssignment_1 )*
            {
             before(grammarAccess.getUno_ClassicAccess().getUnoChallengeAssignment_1()); 
            // InternalUnoText.g:750:2: ( rule__Uno_Classic__UnoChallengeAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==49) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUnoText.g:750:3: rule__Uno_Classic__UnoChallengeAssignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Uno_Classic__UnoChallengeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getUno_ClassicAccess().getUnoChallengeAssignment_1()); 

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
    // $ANTLR end "rule__Uno_Classic__Group__1__Impl"


    // $ANTLR start "rule__Uno_Classic__Group__2"
    // InternalUnoText.g:758:1: rule__Uno_Classic__Group__2 : rule__Uno_Classic__Group__2__Impl rule__Uno_Classic__Group__3 ;
    public final void rule__Uno_Classic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:762:1: ( rule__Uno_Classic__Group__2__Impl rule__Uno_Classic__Group__3 )
            // InternalUnoText.g:763:2: rule__Uno_Classic__Group__2__Impl rule__Uno_Classic__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Uno_Classic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__3();

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
    // $ANTLR end "rule__Uno_Classic__Group__2"


    // $ANTLR start "rule__Uno_Classic__Group__2__Impl"
    // InternalUnoText.g:770:1: rule__Uno_Classic__Group__2__Impl : ( ( rule__Uno_Classic__Carte0_7Assignment_2 )* ) ;
    public final void rule__Uno_Classic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:774:1: ( ( ( rule__Uno_Classic__Carte0_7Assignment_2 )* ) )
            // InternalUnoText.g:775:1: ( ( rule__Uno_Classic__Carte0_7Assignment_2 )* )
            {
            // InternalUnoText.g:775:1: ( ( rule__Uno_Classic__Carte0_7Assignment_2 )* )
            // InternalUnoText.g:776:2: ( rule__Uno_Classic__Carte0_7Assignment_2 )*
            {
             before(grammarAccess.getUno_ClassicAccess().getCarte0_7Assignment_2()); 
            // InternalUnoText.g:777:2: ( rule__Uno_Classic__Carte0_7Assignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==50) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUnoText.g:777:3: rule__Uno_Classic__Carte0_7Assignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Uno_Classic__Carte0_7Assignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getUno_ClassicAccess().getCarte0_7Assignment_2()); 

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
    // $ANTLR end "rule__Uno_Classic__Group__2__Impl"


    // $ANTLR start "rule__Uno_Classic__Group__3"
    // InternalUnoText.g:785:1: rule__Uno_Classic__Group__3 : rule__Uno_Classic__Group__3__Impl rule__Uno_Classic__Group__4 ;
    public final void rule__Uno_Classic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:789:1: ( rule__Uno_Classic__Group__3__Impl rule__Uno_Classic__Group__4 )
            // InternalUnoText.g:790:2: rule__Uno_Classic__Group__3__Impl rule__Uno_Classic__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Uno_Classic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__4();

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
    // $ANTLR end "rule__Uno_Classic__Group__3"


    // $ANTLR start "rule__Uno_Classic__Group__3__Impl"
    // InternalUnoText.g:797:1: rule__Uno_Classic__Group__3__Impl : ( ( rule__Uno_Classic__CarteIdentiqueAssignment_3 )* ) ;
    public final void rule__Uno_Classic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:801:1: ( ( ( rule__Uno_Classic__CarteIdentiqueAssignment_3 )* ) )
            // InternalUnoText.g:802:1: ( ( rule__Uno_Classic__CarteIdentiqueAssignment_3 )* )
            {
            // InternalUnoText.g:802:1: ( ( rule__Uno_Classic__CarteIdentiqueAssignment_3 )* )
            // InternalUnoText.g:803:2: ( rule__Uno_Classic__CarteIdentiqueAssignment_3 )*
            {
             before(grammarAccess.getUno_ClassicAccess().getCarteIdentiqueAssignment_3()); 
            // InternalUnoText.g:804:2: ( rule__Uno_Classic__CarteIdentiqueAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUnoText.g:804:3: rule__Uno_Classic__CarteIdentiqueAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Uno_Classic__CarteIdentiqueAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getUno_ClassicAccess().getCarteIdentiqueAssignment_3()); 

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
    // $ANTLR end "rule__Uno_Classic__Group__3__Impl"


    // $ANTLR start "rule__Uno_Classic__Group__4"
    // InternalUnoText.g:812:1: rule__Uno_Classic__Group__4 : rule__Uno_Classic__Group__4__Impl rule__Uno_Classic__Group__5 ;
    public final void rule__Uno_Classic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:816:1: ( rule__Uno_Classic__Group__4__Impl rule__Uno_Classic__Group__5 )
            // InternalUnoText.g:817:2: rule__Uno_Classic__Group__4__Impl rule__Uno_Classic__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Uno_Classic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__5();

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
    // $ANTLR end "rule__Uno_Classic__Group__4"


    // $ANTLR start "rule__Uno_Classic__Group__4__Impl"
    // InternalUnoText.g:824:1: rule__Uno_Classic__Group__4__Impl : ( ( ( rule__Uno_Classic__CumulAjoutAssignment_4 ) ) ( ( rule__Uno_Classic__CumulAjoutAssignment_4 )* ) ) ;
    public final void rule__Uno_Classic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:828:1: ( ( ( ( rule__Uno_Classic__CumulAjoutAssignment_4 ) ) ( ( rule__Uno_Classic__CumulAjoutAssignment_4 )* ) ) )
            // InternalUnoText.g:829:1: ( ( ( rule__Uno_Classic__CumulAjoutAssignment_4 ) ) ( ( rule__Uno_Classic__CumulAjoutAssignment_4 )* ) )
            {
            // InternalUnoText.g:829:1: ( ( ( rule__Uno_Classic__CumulAjoutAssignment_4 ) ) ( ( rule__Uno_Classic__CumulAjoutAssignment_4 )* ) )
            // InternalUnoText.g:830:2: ( ( rule__Uno_Classic__CumulAjoutAssignment_4 ) ) ( ( rule__Uno_Classic__CumulAjoutAssignment_4 )* )
            {
            // InternalUnoText.g:830:2: ( ( rule__Uno_Classic__CumulAjoutAssignment_4 ) )
            // InternalUnoText.g:831:3: ( rule__Uno_Classic__CumulAjoutAssignment_4 )
            {
             before(grammarAccess.getUno_ClassicAccess().getCumulAjoutAssignment_4()); 
            // InternalUnoText.g:832:3: ( rule__Uno_Classic__CumulAjoutAssignment_4 )
            // InternalUnoText.g:832:4: rule__Uno_Classic__CumulAjoutAssignment_4
            {
            pushFollow(FOLLOW_12);
            rule__Uno_Classic__CumulAjoutAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUno_ClassicAccess().getCumulAjoutAssignment_4()); 

            }

            // InternalUnoText.g:835:2: ( ( rule__Uno_Classic__CumulAjoutAssignment_4 )* )
            // InternalUnoText.g:836:3: ( rule__Uno_Classic__CumulAjoutAssignment_4 )*
            {
             before(grammarAccess.getUno_ClassicAccess().getCumulAjoutAssignment_4()); 
            // InternalUnoText.g:837:3: ( rule__Uno_Classic__CumulAjoutAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUnoText.g:837:4: rule__Uno_Classic__CumulAjoutAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Uno_Classic__CumulAjoutAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getUno_ClassicAccess().getCumulAjoutAssignment_4()); 

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
    // $ANTLR end "rule__Uno_Classic__Group__4__Impl"


    // $ANTLR start "rule__Uno_Classic__Group__5"
    // InternalUnoText.g:846:1: rule__Uno_Classic__Group__5 : rule__Uno_Classic__Group__5__Impl rule__Uno_Classic__Group__6 ;
    public final void rule__Uno_Classic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:850:1: ( rule__Uno_Classic__Group__5__Impl rule__Uno_Classic__Group__6 )
            // InternalUnoText.g:851:2: rule__Uno_Classic__Group__5__Impl rule__Uno_Classic__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Uno_Classic__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__6();

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
    // $ANTLR end "rule__Uno_Classic__Group__5"


    // $ANTLR start "rule__Uno_Classic__Group__5__Impl"
    // InternalUnoText.g:858:1: rule__Uno_Classic__Group__5__Impl : ( ( rule__Uno_Classic__SuiteAssignment_5 )* ) ;
    public final void rule__Uno_Classic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:862:1: ( ( ( rule__Uno_Classic__SuiteAssignment_5 )* ) )
            // InternalUnoText.g:863:1: ( ( rule__Uno_Classic__SuiteAssignment_5 )* )
            {
            // InternalUnoText.g:863:1: ( ( rule__Uno_Classic__SuiteAssignment_5 )* )
            // InternalUnoText.g:864:2: ( rule__Uno_Classic__SuiteAssignment_5 )*
            {
             before(grammarAccess.getUno_ClassicAccess().getSuiteAssignment_5()); 
            // InternalUnoText.g:865:2: ( rule__Uno_Classic__SuiteAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26||LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUnoText.g:865:3: rule__Uno_Classic__SuiteAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Uno_Classic__SuiteAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getUno_ClassicAccess().getSuiteAssignment_5()); 

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
    // $ANTLR end "rule__Uno_Classic__Group__5__Impl"


    // $ANTLR start "rule__Uno_Classic__Group__6"
    // InternalUnoText.g:873:1: rule__Uno_Classic__Group__6 : rule__Uno_Classic__Group__6__Impl rule__Uno_Classic__Group__7 ;
    public final void rule__Uno_Classic__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:877:1: ( rule__Uno_Classic__Group__6__Impl rule__Uno_Classic__Group__7 )
            // InternalUnoText.g:878:2: rule__Uno_Classic__Group__6__Impl rule__Uno_Classic__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Uno_Classic__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__7();

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
    // $ANTLR end "rule__Uno_Classic__Group__6"


    // $ANTLR start "rule__Uno_Classic__Group__6__Impl"
    // InternalUnoText.g:885:1: rule__Uno_Classic__Group__6__Impl : ( ( rule__Uno_Classic__PiocheAssignment_6 )* ) ;
    public final void rule__Uno_Classic__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:889:1: ( ( ( rule__Uno_Classic__PiocheAssignment_6 )* ) )
            // InternalUnoText.g:890:1: ( ( rule__Uno_Classic__PiocheAssignment_6 )* )
            {
            // InternalUnoText.g:890:1: ( ( rule__Uno_Classic__PiocheAssignment_6 )* )
            // InternalUnoText.g:891:2: ( rule__Uno_Classic__PiocheAssignment_6 )*
            {
             before(grammarAccess.getUno_ClassicAccess().getPiocheAssignment_6()); 
            // InternalUnoText.g:892:2: ( rule__Uno_Classic__PiocheAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==44) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUnoText.g:892:3: rule__Uno_Classic__PiocheAssignment_6
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Uno_Classic__PiocheAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getUno_ClassicAccess().getPiocheAssignment_6()); 

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
    // $ANTLR end "rule__Uno_Classic__Group__6__Impl"


    // $ANTLR start "rule__Uno_Classic__Group__7"
    // InternalUnoText.g:900:1: rule__Uno_Classic__Group__7 : rule__Uno_Classic__Group__7__Impl rule__Uno_Classic__Group__8 ;
    public final void rule__Uno_Classic__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:904:1: ( rule__Uno_Classic__Group__7__Impl rule__Uno_Classic__Group__8 )
            // InternalUnoText.g:905:2: rule__Uno_Classic__Group__7__Impl rule__Uno_Classic__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Uno_Classic__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__8();

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
    // $ANTLR end "rule__Uno_Classic__Group__7"


    // $ANTLR start "rule__Uno_Classic__Group__7__Impl"
    // InternalUnoText.g:912:1: rule__Uno_Classic__Group__7__Impl : ( ( rule__Uno_Classic__More4Assignment_7 )* ) ;
    public final void rule__Uno_Classic__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:916:1: ( ( ( rule__Uno_Classic__More4Assignment_7 )* ) )
            // InternalUnoText.g:917:1: ( ( rule__Uno_Classic__More4Assignment_7 )* )
            {
            // InternalUnoText.g:917:1: ( ( rule__Uno_Classic__More4Assignment_7 )* )
            // InternalUnoText.g:918:2: ( rule__Uno_Classic__More4Assignment_7 )*
            {
             before(grammarAccess.getUno_ClassicAccess().getMore4Assignment_7()); 
            // InternalUnoText.g:919:2: ( rule__Uno_Classic__More4Assignment_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==51) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUnoText.g:919:3: rule__Uno_Classic__More4Assignment_7
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Uno_Classic__More4Assignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getUno_ClassicAccess().getMore4Assignment_7()); 

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
    // $ANTLR end "rule__Uno_Classic__Group__7__Impl"


    // $ANTLR start "rule__Uno_Classic__Group__8"
    // InternalUnoText.g:927:1: rule__Uno_Classic__Group__8 : rule__Uno_Classic__Group__8__Impl rule__Uno_Classic__Group__9 ;
    public final void rule__Uno_Classic__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:931:1: ( rule__Uno_Classic__Group__8__Impl rule__Uno_Classic__Group__9 )
            // InternalUnoText.g:932:2: rule__Uno_Classic__Group__8__Impl rule__Uno_Classic__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Uno_Classic__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__9();

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
    // $ANTLR end "rule__Uno_Classic__Group__8"


    // $ANTLR start "rule__Uno_Classic__Group__8__Impl"
    // InternalUnoText.g:939:1: rule__Uno_Classic__Group__8__Impl : ( ( rule__Uno_Classic__TempsLimiteAssignment_8 )* ) ;
    public final void rule__Uno_Classic__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:943:1: ( ( ( rule__Uno_Classic__TempsLimiteAssignment_8 )* ) )
            // InternalUnoText.g:944:1: ( ( rule__Uno_Classic__TempsLimiteAssignment_8 )* )
            {
            // InternalUnoText.g:944:1: ( ( rule__Uno_Classic__TempsLimiteAssignment_8 )* )
            // InternalUnoText.g:945:2: ( rule__Uno_Classic__TempsLimiteAssignment_8 )*
            {
             before(grammarAccess.getUno_ClassicAccess().getTempsLimiteAssignment_8()); 
            // InternalUnoText.g:946:2: ( rule__Uno_Classic__TempsLimiteAssignment_8 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==52) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUnoText.g:946:3: rule__Uno_Classic__TempsLimiteAssignment_8
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Uno_Classic__TempsLimiteAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getUno_ClassicAccess().getTempsLimiteAssignment_8()); 

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
    // $ANTLR end "rule__Uno_Classic__Group__8__Impl"


    // $ANTLR start "rule__Uno_Classic__Group__9"
    // InternalUnoText.g:954:1: rule__Uno_Classic__Group__9 : rule__Uno_Classic__Group__9__Impl rule__Uno_Classic__Group__10 ;
    public final void rule__Uno_Classic__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:958:1: ( rule__Uno_Classic__Group__9__Impl rule__Uno_Classic__Group__10 )
            // InternalUnoText.g:959:2: rule__Uno_Classic__Group__9__Impl rule__Uno_Classic__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Uno_Classic__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__10();

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
    // $ANTLR end "rule__Uno_Classic__Group__9"


    // $ANTLR start "rule__Uno_Classic__Group__9__Impl"
    // InternalUnoText.g:966:1: rule__Uno_Classic__Group__9__Impl : ( ( rule__Uno_Classic__MauvaiseCarteAssignment_9 )* ) ;
    public final void rule__Uno_Classic__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:970:1: ( ( ( rule__Uno_Classic__MauvaiseCarteAssignment_9 )* ) )
            // InternalUnoText.g:971:1: ( ( rule__Uno_Classic__MauvaiseCarteAssignment_9 )* )
            {
            // InternalUnoText.g:971:1: ( ( rule__Uno_Classic__MauvaiseCarteAssignment_9 )* )
            // InternalUnoText.g:972:2: ( rule__Uno_Classic__MauvaiseCarteAssignment_9 )*
            {
             before(grammarAccess.getUno_ClassicAccess().getMauvaiseCarteAssignment_9()); 
            // InternalUnoText.g:973:2: ( rule__Uno_Classic__MauvaiseCarteAssignment_9 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==53) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUnoText.g:973:3: rule__Uno_Classic__MauvaiseCarteAssignment_9
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Uno_Classic__MauvaiseCarteAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getUno_ClassicAccess().getMauvaiseCarteAssignment_9()); 

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
    // $ANTLR end "rule__Uno_Classic__Group__9__Impl"


    // $ANTLR start "rule__Uno_Classic__Group__10"
    // InternalUnoText.g:981:1: rule__Uno_Classic__Group__10 : rule__Uno_Classic__Group__10__Impl rule__Uno_Classic__Group__11 ;
    public final void rule__Uno_Classic__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:985:1: ( rule__Uno_Classic__Group__10__Impl rule__Uno_Classic__Group__11 )
            // InternalUnoText.g:986:2: rule__Uno_Classic__Group__10__Impl rule__Uno_Classic__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Uno_Classic__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__11();

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
    // $ANTLR end "rule__Uno_Classic__Group__10"


    // $ANTLR start "rule__Uno_Classic__Group__10__Impl"
    // InternalUnoText.g:993:1: rule__Uno_Classic__Group__10__Impl : ( ( rule__Uno_Classic__EquipeAssignment_10 )* ) ;
    public final void rule__Uno_Classic__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:997:1: ( ( ( rule__Uno_Classic__EquipeAssignment_10 )* ) )
            // InternalUnoText.g:998:1: ( ( rule__Uno_Classic__EquipeAssignment_10 )* )
            {
            // InternalUnoText.g:998:1: ( ( rule__Uno_Classic__EquipeAssignment_10 )* )
            // InternalUnoText.g:999:2: ( rule__Uno_Classic__EquipeAssignment_10 )*
            {
             before(grammarAccess.getUno_ClassicAccess().getEquipeAssignment_10()); 
            // InternalUnoText.g:1000:2: ( rule__Uno_Classic__EquipeAssignment_10 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==54) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUnoText.g:1000:3: rule__Uno_Classic__EquipeAssignment_10
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Uno_Classic__EquipeAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getUno_ClassicAccess().getEquipeAssignment_10()); 

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
    // $ANTLR end "rule__Uno_Classic__Group__10__Impl"


    // $ANTLR start "rule__Uno_Classic__Group__11"
    // InternalUnoText.g:1008:1: rule__Uno_Classic__Group__11 : rule__Uno_Classic__Group__11__Impl rule__Uno_Classic__Group__12 ;
    public final void rule__Uno_Classic__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1012:1: ( rule__Uno_Classic__Group__11__Impl rule__Uno_Classic__Group__12 )
            // InternalUnoText.g:1013:2: rule__Uno_Classic__Group__11__Impl rule__Uno_Classic__Group__12
            {
            pushFollow(FOLLOW_19);
            rule__Uno_Classic__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__12();

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
    // $ANTLR end "rule__Uno_Classic__Group__11"


    // $ANTLR start "rule__Uno_Classic__Group__11__Impl"
    // InternalUnoText.g:1020:1: rule__Uno_Classic__Group__11__Impl : ( ( ( rule__Uno_Classic__CarteVisiblesAssignment_11 ) ) ( ( rule__Uno_Classic__CarteVisiblesAssignment_11 )* ) ) ;
    public final void rule__Uno_Classic__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1024:1: ( ( ( ( rule__Uno_Classic__CarteVisiblesAssignment_11 ) ) ( ( rule__Uno_Classic__CarteVisiblesAssignment_11 )* ) ) )
            // InternalUnoText.g:1025:1: ( ( ( rule__Uno_Classic__CarteVisiblesAssignment_11 ) ) ( ( rule__Uno_Classic__CarteVisiblesAssignment_11 )* ) )
            {
            // InternalUnoText.g:1025:1: ( ( ( rule__Uno_Classic__CarteVisiblesAssignment_11 ) ) ( ( rule__Uno_Classic__CarteVisiblesAssignment_11 )* ) )
            // InternalUnoText.g:1026:2: ( ( rule__Uno_Classic__CarteVisiblesAssignment_11 ) ) ( ( rule__Uno_Classic__CarteVisiblesAssignment_11 )* )
            {
            // InternalUnoText.g:1026:2: ( ( rule__Uno_Classic__CarteVisiblesAssignment_11 ) )
            // InternalUnoText.g:1027:3: ( rule__Uno_Classic__CarteVisiblesAssignment_11 )
            {
             before(grammarAccess.getUno_ClassicAccess().getCarteVisiblesAssignment_11()); 
            // InternalUnoText.g:1028:3: ( rule__Uno_Classic__CarteVisiblesAssignment_11 )
            // InternalUnoText.g:1028:4: rule__Uno_Classic__CarteVisiblesAssignment_11
            {
            pushFollow(FOLLOW_20);
            rule__Uno_Classic__CarteVisiblesAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getUno_ClassicAccess().getCarteVisiblesAssignment_11()); 

            }

            // InternalUnoText.g:1031:2: ( ( rule__Uno_Classic__CarteVisiblesAssignment_11 )* )
            // InternalUnoText.g:1032:3: ( rule__Uno_Classic__CarteVisiblesAssignment_11 )*
            {
             before(grammarAccess.getUno_ClassicAccess().getCarteVisiblesAssignment_11()); 
            // InternalUnoText.g:1033:3: ( rule__Uno_Classic__CarteVisiblesAssignment_11 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==55) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUnoText.g:1033:4: rule__Uno_Classic__CarteVisiblesAssignment_11
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Uno_Classic__CarteVisiblesAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getUno_ClassicAccess().getCarteVisiblesAssignment_11()); 

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
    // $ANTLR end "rule__Uno_Classic__Group__11__Impl"


    // $ANTLR start "rule__Uno_Classic__Group__12"
    // InternalUnoText.g:1042:1: rule__Uno_Classic__Group__12 : rule__Uno_Classic__Group__12__Impl rule__Uno_Classic__Group__13 ;
    public final void rule__Uno_Classic__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1046:1: ( rule__Uno_Classic__Group__12__Impl rule__Uno_Classic__Group__13 )
            // InternalUnoText.g:1047:2: rule__Uno_Classic__Group__12__Impl rule__Uno_Classic__Group__13
            {
            pushFollow(FOLLOW_19);
            rule__Uno_Classic__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__13();

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
    // $ANTLR end "rule__Uno_Classic__Group__12"


    // $ANTLR start "rule__Uno_Classic__Group__12__Impl"
    // InternalUnoText.g:1054:1: rule__Uno_Classic__Group__12__Impl : ( ( rule__Uno_Classic__FinMancheAssignment_12 )* ) ;
    public final void rule__Uno_Classic__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1058:1: ( ( ( rule__Uno_Classic__FinMancheAssignment_12 )* ) )
            // InternalUnoText.g:1059:1: ( ( rule__Uno_Classic__FinMancheAssignment_12 )* )
            {
            // InternalUnoText.g:1059:1: ( ( rule__Uno_Classic__FinMancheAssignment_12 )* )
            // InternalUnoText.g:1060:2: ( rule__Uno_Classic__FinMancheAssignment_12 )*
            {
             before(grammarAccess.getUno_ClassicAccess().getFinMancheAssignment_12()); 
            // InternalUnoText.g:1061:2: ( rule__Uno_Classic__FinMancheAssignment_12 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUnoText.g:1061:3: rule__Uno_Classic__FinMancheAssignment_12
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Uno_Classic__FinMancheAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getUno_ClassicAccess().getFinMancheAssignment_12()); 

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
    // $ANTLR end "rule__Uno_Classic__Group__12__Impl"


    // $ANTLR start "rule__Uno_Classic__Group__13"
    // InternalUnoText.g:1069:1: rule__Uno_Classic__Group__13 : rule__Uno_Classic__Group__13__Impl rule__Uno_Classic__Group__14 ;
    public final void rule__Uno_Classic__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1073:1: ( rule__Uno_Classic__Group__13__Impl rule__Uno_Classic__Group__14 )
            // InternalUnoText.g:1074:2: rule__Uno_Classic__Group__13__Impl rule__Uno_Classic__Group__14
            {
            pushFollow(FOLLOW_19);
            rule__Uno_Classic__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__14();

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
    // $ANTLR end "rule__Uno_Classic__Group__13"


    // $ANTLR start "rule__Uno_Classic__Group__13__Impl"
    // InternalUnoText.g:1081:1: rule__Uno_Classic__Group__13__Impl : ( ( rule__Uno_Classic__ThreeHandsAssignment_13 )* ) ;
    public final void rule__Uno_Classic__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1085:1: ( ( ( rule__Uno_Classic__ThreeHandsAssignment_13 )* ) )
            // InternalUnoText.g:1086:1: ( ( rule__Uno_Classic__ThreeHandsAssignment_13 )* )
            {
            // InternalUnoText.g:1086:1: ( ( rule__Uno_Classic__ThreeHandsAssignment_13 )* )
            // InternalUnoText.g:1087:2: ( rule__Uno_Classic__ThreeHandsAssignment_13 )*
            {
             before(grammarAccess.getUno_ClassicAccess().getThreeHandsAssignment_13()); 
            // InternalUnoText.g:1088:2: ( rule__Uno_Classic__ThreeHandsAssignment_13 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==56) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalUnoText.g:1088:3: rule__Uno_Classic__ThreeHandsAssignment_13
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Uno_Classic__ThreeHandsAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getUno_ClassicAccess().getThreeHandsAssignment_13()); 

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
    // $ANTLR end "rule__Uno_Classic__Group__13__Impl"


    // $ANTLR start "rule__Uno_Classic__Group__14"
    // InternalUnoText.g:1096:1: rule__Uno_Classic__Group__14 : rule__Uno_Classic__Group__14__Impl rule__Uno_Classic__Group__15 ;
    public final void rule__Uno_Classic__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1100:1: ( rule__Uno_Classic__Group__14__Impl rule__Uno_Classic__Group__15 )
            // InternalUnoText.g:1101:2: rule__Uno_Classic__Group__14__Impl rule__Uno_Classic__Group__15
            {
            pushFollow(FOLLOW_19);
            rule__Uno_Classic__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__15();

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
    // $ANTLR end "rule__Uno_Classic__Group__14"


    // $ANTLR start "rule__Uno_Classic__Group__14__Impl"
    // InternalUnoText.g:1108:1: rule__Uno_Classic__Group__14__Impl : ( ( rule__Uno_Classic__ThreePilesAssignment_14 )* ) ;
    public final void rule__Uno_Classic__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1112:1: ( ( ( rule__Uno_Classic__ThreePilesAssignment_14 )* ) )
            // InternalUnoText.g:1113:1: ( ( rule__Uno_Classic__ThreePilesAssignment_14 )* )
            {
            // InternalUnoText.g:1113:1: ( ( rule__Uno_Classic__ThreePilesAssignment_14 )* )
            // InternalUnoText.g:1114:2: ( rule__Uno_Classic__ThreePilesAssignment_14 )*
            {
             before(grammarAccess.getUno_ClassicAccess().getThreePilesAssignment_14()); 
            // InternalUnoText.g:1115:2: ( rule__Uno_Classic__ThreePilesAssignment_14 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==57) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalUnoText.g:1115:3: rule__Uno_Classic__ThreePilesAssignment_14
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Uno_Classic__ThreePilesAssignment_14();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getUno_ClassicAccess().getThreePilesAssignment_14()); 

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
    // $ANTLR end "rule__Uno_Classic__Group__14__Impl"


    // $ANTLR start "rule__Uno_Classic__Group__15"
    // InternalUnoText.g:1123:1: rule__Uno_Classic__Group__15 : rule__Uno_Classic__Group__15__Impl rule__Uno_Classic__Group__16 ;
    public final void rule__Uno_Classic__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1127:1: ( rule__Uno_Classic__Group__15__Impl rule__Uno_Classic__Group__16 )
            // InternalUnoText.g:1128:2: rule__Uno_Classic__Group__15__Impl rule__Uno_Classic__Group__16
            {
            pushFollow(FOLLOW_19);
            rule__Uno_Classic__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__16();

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
    // $ANTLR end "rule__Uno_Classic__Group__15"


    // $ANTLR start "rule__Uno_Classic__Group__15__Impl"
    // InternalUnoText.g:1135:1: rule__Uno_Classic__Group__15__Impl : ( ( rule__Uno_Classic__SpecialCardAssignment_15 )* ) ;
    public final void rule__Uno_Classic__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1139:1: ( ( ( rule__Uno_Classic__SpecialCardAssignment_15 )* ) )
            // InternalUnoText.g:1140:1: ( ( rule__Uno_Classic__SpecialCardAssignment_15 )* )
            {
            // InternalUnoText.g:1140:1: ( ( rule__Uno_Classic__SpecialCardAssignment_15 )* )
            // InternalUnoText.g:1141:2: ( rule__Uno_Classic__SpecialCardAssignment_15 )*
            {
             before(grammarAccess.getUno_ClassicAccess().getSpecialCardAssignment_15()); 
            // InternalUnoText.g:1142:2: ( rule__Uno_Classic__SpecialCardAssignment_15 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUnoText.g:1142:3: rule__Uno_Classic__SpecialCardAssignment_15
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Uno_Classic__SpecialCardAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getUno_ClassicAccess().getSpecialCardAssignment_15()); 

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
    // $ANTLR end "rule__Uno_Classic__Group__15__Impl"


    // $ANTLR start "rule__Uno_Classic__Group__16"
    // InternalUnoText.g:1150:1: rule__Uno_Classic__Group__16 : rule__Uno_Classic__Group__16__Impl ;
    public final void rule__Uno_Classic__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1154:1: ( rule__Uno_Classic__Group__16__Impl )
            // InternalUnoText.g:1155:2: rule__Uno_Classic__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uno_Classic__Group__16__Impl();

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
    // $ANTLR end "rule__Uno_Classic__Group__16"


    // $ANTLR start "rule__Uno_Classic__Group__16__Impl"
    // InternalUnoText.g:1161:1: rule__Uno_Classic__Group__16__Impl : ( ( rule__Uno_Classic__GameOverAssignment_16 ) ) ;
    public final void rule__Uno_Classic__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1165:1: ( ( ( rule__Uno_Classic__GameOverAssignment_16 ) ) )
            // InternalUnoText.g:1166:1: ( ( rule__Uno_Classic__GameOverAssignment_16 ) )
            {
            // InternalUnoText.g:1166:1: ( ( rule__Uno_Classic__GameOverAssignment_16 ) )
            // InternalUnoText.g:1167:2: ( rule__Uno_Classic__GameOverAssignment_16 )
            {
             before(grammarAccess.getUno_ClassicAccess().getGameOverAssignment_16()); 
            // InternalUnoText.g:1168:2: ( rule__Uno_Classic__GameOverAssignment_16 )
            // InternalUnoText.g:1168:3: rule__Uno_Classic__GameOverAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Uno_Classic__GameOverAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getUno_ClassicAccess().getGameOverAssignment_16()); 

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
    // $ANTLR end "rule__Uno_Classic__Group__16__Impl"


    // $ANTLR start "rule__SpecialCard__Group__0"
    // InternalUnoText.g:1177:1: rule__SpecialCard__Group__0 : rule__SpecialCard__Group__0__Impl rule__SpecialCard__Group__1 ;
    public final void rule__SpecialCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1181:1: ( rule__SpecialCard__Group__0__Impl rule__SpecialCard__Group__1 )
            // InternalUnoText.g:1182:2: rule__SpecialCard__Group__0__Impl rule__SpecialCard__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__SpecialCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecialCard__Group__1();

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
    // $ANTLR end "rule__SpecialCard__Group__0"


    // $ANTLR start "rule__SpecialCard__Group__0__Impl"
    // InternalUnoText.g:1189:1: rule__SpecialCard__Group__0__Impl : ( ( ( 'SpecialCard : ' ) ) ( ( 'SpecialCard : ' )* ) ) ;
    public final void rule__SpecialCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1193:1: ( ( ( ( 'SpecialCard : ' ) ) ( ( 'SpecialCard : ' )* ) ) )
            // InternalUnoText.g:1194:1: ( ( ( 'SpecialCard : ' ) ) ( ( 'SpecialCard : ' )* ) )
            {
            // InternalUnoText.g:1194:1: ( ( ( 'SpecialCard : ' ) ) ( ( 'SpecialCard : ' )* ) )
            // InternalUnoText.g:1195:2: ( ( 'SpecialCard : ' ) ) ( ( 'SpecialCard : ' )* )
            {
            // InternalUnoText.g:1195:2: ( ( 'SpecialCard : ' ) )
            // InternalUnoText.g:1196:3: ( 'SpecialCard : ' )
            {
             before(grammarAccess.getSpecialCardAccess().getSpecialCardKeyword_0()); 
            // InternalUnoText.g:1197:3: ( 'SpecialCard : ' )
            // InternalUnoText.g:1197:4: 'SpecialCard : '
            {
            match(input,29,FOLLOW_24); 

            }

             after(grammarAccess.getSpecialCardAccess().getSpecialCardKeyword_0()); 

            }

            // InternalUnoText.g:1200:2: ( ( 'SpecialCard : ' )* )
            // InternalUnoText.g:1201:3: ( 'SpecialCard : ' )*
            {
             before(grammarAccess.getSpecialCardAccess().getSpecialCardKeyword_0()); 
            // InternalUnoText.g:1202:3: ( 'SpecialCard : ' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalUnoText.g:1202:4: 'SpecialCard : '
            	    {
            	    match(input,29,FOLLOW_24); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getSpecialCardAccess().getSpecialCardKeyword_0()); 

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
    // $ANTLR end "rule__SpecialCard__Group__0__Impl"


    // $ANTLR start "rule__SpecialCard__Group__1"
    // InternalUnoText.g:1211:1: rule__SpecialCard__Group__1 : rule__SpecialCard__Group__1__Impl ;
    public final void rule__SpecialCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1215:1: ( rule__SpecialCard__Group__1__Impl )
            // InternalUnoText.g:1216:2: rule__SpecialCard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecialCard__Group__1__Impl();

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
    // $ANTLR end "rule__SpecialCard__Group__1"


    // $ANTLR start "rule__SpecialCard__Group__1__Impl"
    // InternalUnoText.g:1222:1: rule__SpecialCard__Group__1__Impl : ( ( rule__SpecialCard__Alternatives_1 ) ) ;
    public final void rule__SpecialCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1226:1: ( ( ( rule__SpecialCard__Alternatives_1 ) ) )
            // InternalUnoText.g:1227:1: ( ( rule__SpecialCard__Alternatives_1 ) )
            {
            // InternalUnoText.g:1227:1: ( ( rule__SpecialCard__Alternatives_1 ) )
            // InternalUnoText.g:1228:2: ( rule__SpecialCard__Alternatives_1 )
            {
             before(grammarAccess.getSpecialCardAccess().getAlternatives_1()); 
            // InternalUnoText.g:1229:2: ( rule__SpecialCard__Alternatives_1 )
            // InternalUnoText.g:1229:3: rule__SpecialCard__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SpecialCard__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecialCardAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__SpecialCard__Group__1__Impl"


    // $ANTLR start "rule__GameOver__Group__0"
    // InternalUnoText.g:1238:1: rule__GameOver__Group__0 : rule__GameOver__Group__0__Impl rule__GameOver__Group__1 ;
    public final void rule__GameOver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1242:1: ( rule__GameOver__Group__0__Impl rule__GameOver__Group__1 )
            // InternalUnoText.g:1243:2: rule__GameOver__Group__0__Impl rule__GameOver__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__GameOver__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameOver__Group__1();

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
    // $ANTLR end "rule__GameOver__Group__0"


    // $ANTLR start "rule__GameOver__Group__0__Impl"
    // InternalUnoText.g:1250:1: rule__GameOver__Group__0__Impl : ( ( ( 'GameOver : ' ) ) ( ( 'GameOver : ' )* ) ) ;
    public final void rule__GameOver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1254:1: ( ( ( ( 'GameOver : ' ) ) ( ( 'GameOver : ' )* ) ) )
            // InternalUnoText.g:1255:1: ( ( ( 'GameOver : ' ) ) ( ( 'GameOver : ' )* ) )
            {
            // InternalUnoText.g:1255:1: ( ( ( 'GameOver : ' ) ) ( ( 'GameOver : ' )* ) )
            // InternalUnoText.g:1256:2: ( ( 'GameOver : ' ) ) ( ( 'GameOver : ' )* )
            {
            // InternalUnoText.g:1256:2: ( ( 'GameOver : ' ) )
            // InternalUnoText.g:1257:3: ( 'GameOver : ' )
            {
             before(grammarAccess.getGameOverAccess().getGameOverKeyword_0()); 
            // InternalUnoText.g:1258:3: ( 'GameOver : ' )
            // InternalUnoText.g:1258:4: 'GameOver : '
            {
            match(input,30,FOLLOW_27); 

            }

             after(grammarAccess.getGameOverAccess().getGameOverKeyword_0()); 

            }

            // InternalUnoText.g:1261:2: ( ( 'GameOver : ' )* )
            // InternalUnoText.g:1262:3: ( 'GameOver : ' )*
            {
             before(grammarAccess.getGameOverAccess().getGameOverKeyword_0()); 
            // InternalUnoText.g:1263:3: ( 'GameOver : ' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==30) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalUnoText.g:1263:4: 'GameOver : '
            	    {
            	    match(input,30,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getGameOverAccess().getGameOverKeyword_0()); 

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
    // $ANTLR end "rule__GameOver__Group__0__Impl"


    // $ANTLR start "rule__GameOver__Group__1"
    // InternalUnoText.g:1272:1: rule__GameOver__Group__1 : rule__GameOver__Group__1__Impl ;
    public final void rule__GameOver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1276:1: ( rule__GameOver__Group__1__Impl )
            // InternalUnoText.g:1277:2: rule__GameOver__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameOver__Group__1__Impl();

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
    // $ANTLR end "rule__GameOver__Group__1"


    // $ANTLR start "rule__GameOver__Group__1__Impl"
    // InternalUnoText.g:1283:1: rule__GameOver__Group__1__Impl : ( ( rule__GameOver__Alternatives_1 ) ) ;
    public final void rule__GameOver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1287:1: ( ( ( rule__GameOver__Alternatives_1 ) ) )
            // InternalUnoText.g:1288:1: ( ( rule__GameOver__Alternatives_1 ) )
            {
            // InternalUnoText.g:1288:1: ( ( rule__GameOver__Alternatives_1 ) )
            // InternalUnoText.g:1289:2: ( rule__GameOver__Alternatives_1 )
            {
             before(grammarAccess.getGameOverAccess().getAlternatives_1()); 
            // InternalUnoText.g:1290:2: ( rule__GameOver__Alternatives_1 )
            // InternalUnoText.g:1290:3: rule__GameOver__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__GameOver__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getGameOverAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__GameOver__Group__1__Impl"


    // $ANTLR start "rule__FinManche__Group__0"
    // InternalUnoText.g:1299:1: rule__FinManche__Group__0 : rule__FinManche__Group__0__Impl rule__FinManche__Group__1 ;
    public final void rule__FinManche__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1303:1: ( rule__FinManche__Group__0__Impl rule__FinManche__Group__1 )
            // InternalUnoText.g:1304:2: rule__FinManche__Group__0__Impl rule__FinManche__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__FinManche__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinManche__Group__1();

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
    // $ANTLR end "rule__FinManche__Group__0"


    // $ANTLR start "rule__FinManche__Group__0__Impl"
    // InternalUnoText.g:1311:1: rule__FinManche__Group__0__Impl : ( ( ( 'FinManche : ' ) ) ( ( 'FinManche : ' )* ) ) ;
    public final void rule__FinManche__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1315:1: ( ( ( ( 'FinManche : ' ) ) ( ( 'FinManche : ' )* ) ) )
            // InternalUnoText.g:1316:1: ( ( ( 'FinManche : ' ) ) ( ( 'FinManche : ' )* ) )
            {
            // InternalUnoText.g:1316:1: ( ( ( 'FinManche : ' ) ) ( ( 'FinManche : ' )* ) )
            // InternalUnoText.g:1317:2: ( ( 'FinManche : ' ) ) ( ( 'FinManche : ' )* )
            {
            // InternalUnoText.g:1317:2: ( ( 'FinManche : ' ) )
            // InternalUnoText.g:1318:3: ( 'FinManche : ' )
            {
             before(grammarAccess.getFinMancheAccess().getFinMancheKeyword_0()); 
            // InternalUnoText.g:1319:3: ( 'FinManche : ' )
            // InternalUnoText.g:1319:4: 'FinManche : '
            {
            match(input,31,FOLLOW_21); 

            }

             after(grammarAccess.getFinMancheAccess().getFinMancheKeyword_0()); 

            }

            // InternalUnoText.g:1322:2: ( ( 'FinManche : ' )* )
            // InternalUnoText.g:1323:3: ( 'FinManche : ' )*
            {
             before(grammarAccess.getFinMancheAccess().getFinMancheKeyword_0()); 
            // InternalUnoText.g:1324:3: ( 'FinManche : ' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUnoText.g:1324:4: 'FinManche : '
            	    {
            	    match(input,31,FOLLOW_21); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getFinMancheAccess().getFinMancheKeyword_0()); 

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
    // $ANTLR end "rule__FinManche__Group__0__Impl"


    // $ANTLR start "rule__FinManche__Group__1"
    // InternalUnoText.g:1333:1: rule__FinManche__Group__1 : rule__FinManche__Group__1__Impl ;
    public final void rule__FinManche__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1337:1: ( rule__FinManche__Group__1__Impl )
            // InternalUnoText.g:1338:2: rule__FinManche__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinManche__Group__1__Impl();

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
    // $ANTLR end "rule__FinManche__Group__1"


    // $ANTLR start "rule__FinManche__Group__1__Impl"
    // InternalUnoText.g:1344:1: rule__FinManche__Group__1__Impl : ( ( rule__FinManche__Alternatives_1 ) ) ;
    public final void rule__FinManche__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1348:1: ( ( ( rule__FinManche__Alternatives_1 ) ) )
            // InternalUnoText.g:1349:1: ( ( rule__FinManche__Alternatives_1 ) )
            {
            // InternalUnoText.g:1349:1: ( ( rule__FinManche__Alternatives_1 ) )
            // InternalUnoText.g:1350:2: ( rule__FinManche__Alternatives_1 )
            {
             before(grammarAccess.getFinMancheAccess().getAlternatives_1()); 
            // InternalUnoText.g:1351:2: ( rule__FinManche__Alternatives_1 )
            // InternalUnoText.g:1351:3: rule__FinManche__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__FinManche__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFinMancheAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__FinManche__Group__1__Impl"


    // $ANTLR start "rule__CarteIdentique__Group__0"
    // InternalUnoText.g:1360:1: rule__CarteIdentique__Group__0 : rule__CarteIdentique__Group__0__Impl rule__CarteIdentique__Group__1 ;
    public final void rule__CarteIdentique__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1364:1: ( rule__CarteIdentique__Group__0__Impl rule__CarteIdentique__Group__1 )
            // InternalUnoText.g:1365:2: rule__CarteIdentique__Group__0__Impl rule__CarteIdentique__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__CarteIdentique__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CarteIdentique__Group__1();

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
    // $ANTLR end "rule__CarteIdentique__Group__0"


    // $ANTLR start "rule__CarteIdentique__Group__0__Impl"
    // InternalUnoText.g:1372:1: rule__CarteIdentique__Group__0__Impl : ( ( ( 'CarteIdentiQUE' ) ) ( ( 'CarteIdentiQUE' )* ) ) ;
    public final void rule__CarteIdentique__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1376:1: ( ( ( ( 'CarteIdentiQUE' ) ) ( ( 'CarteIdentiQUE' )* ) ) )
            // InternalUnoText.g:1377:1: ( ( ( 'CarteIdentiQUE' ) ) ( ( 'CarteIdentiQUE' )* ) )
            {
            // InternalUnoText.g:1377:1: ( ( ( 'CarteIdentiQUE' ) ) ( ( 'CarteIdentiQUE' )* ) )
            // InternalUnoText.g:1378:2: ( ( 'CarteIdentiQUE' ) ) ( ( 'CarteIdentiQUE' )* )
            {
            // InternalUnoText.g:1378:2: ( ( 'CarteIdentiQUE' ) )
            // InternalUnoText.g:1379:3: ( 'CarteIdentiQUE' )
            {
             before(grammarAccess.getCarteIdentiqueAccess().getCarteIdentiQUEKeyword_0()); 
            // InternalUnoText.g:1380:3: ( 'CarteIdentiQUE' )
            // InternalUnoText.g:1380:4: 'CarteIdentiQUE'
            {
            match(input,32,FOLLOW_10); 

            }

             after(grammarAccess.getCarteIdentiqueAccess().getCarteIdentiQUEKeyword_0()); 

            }

            // InternalUnoText.g:1383:2: ( ( 'CarteIdentiQUE' )* )
            // InternalUnoText.g:1384:3: ( 'CarteIdentiQUE' )*
            {
             before(grammarAccess.getCarteIdentiqueAccess().getCarteIdentiQUEKeyword_0()); 
            // InternalUnoText.g:1385:3: ( 'CarteIdentiQUE' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==32) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalUnoText.g:1385:4: 'CarteIdentiQUE'
            	    {
            	    match(input,32,FOLLOW_10); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getCarteIdentiqueAccess().getCarteIdentiQUEKeyword_0()); 

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
    // $ANTLR end "rule__CarteIdentique__Group__0__Impl"


    // $ANTLR start "rule__CarteIdentique__Group__1"
    // InternalUnoText.g:1394:1: rule__CarteIdentique__Group__1 : rule__CarteIdentique__Group__1__Impl ;
    public final void rule__CarteIdentique__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1398:1: ( rule__CarteIdentique__Group__1__Impl )
            // InternalUnoText.g:1399:2: rule__CarteIdentique__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CarteIdentique__Group__1__Impl();

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
    // $ANTLR end "rule__CarteIdentique__Group__1"


    // $ANTLR start "rule__CarteIdentique__Group__1__Impl"
    // InternalUnoText.g:1405:1: rule__CarteIdentique__Group__1__Impl : ( ( rule__CarteIdentique__AvecCouleurAssignment_1 )? ) ;
    public final void rule__CarteIdentique__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1409:1: ( ( ( rule__CarteIdentique__AvecCouleurAssignment_1 )? ) )
            // InternalUnoText.g:1410:1: ( ( rule__CarteIdentique__AvecCouleurAssignment_1 )? )
            {
            // InternalUnoText.g:1410:1: ( ( rule__CarteIdentique__AvecCouleurAssignment_1 )? )
            // InternalUnoText.g:1411:2: ( rule__CarteIdentique__AvecCouleurAssignment_1 )?
            {
             before(grammarAccess.getCarteIdentiqueAccess().getAvecCouleurAssignment_1()); 
            // InternalUnoText.g:1412:2: ( rule__CarteIdentique__AvecCouleurAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==58) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUnoText.g:1412:3: rule__CarteIdentique__AvecCouleurAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CarteIdentique__AvecCouleurAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCarteIdentiqueAccess().getAvecCouleurAssignment_1()); 

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
    // $ANTLR end "rule__CarteIdentique__Group__1__Impl"


    // $ANTLR start "rule__CumulAjout__Group__0"
    // InternalUnoText.g:1421:1: rule__CumulAjout__Group__0 : rule__CumulAjout__Group__0__Impl rule__CumulAjout__Group__1 ;
    public final void rule__CumulAjout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1425:1: ( rule__CumulAjout__Group__0__Impl rule__CumulAjout__Group__1 )
            // InternalUnoText.g:1426:2: rule__CumulAjout__Group__0__Impl rule__CumulAjout__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__CumulAjout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CumulAjout__Group__1();

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
    // $ANTLR end "rule__CumulAjout__Group__0"


    // $ANTLR start "rule__CumulAjout__Group__0__Impl"
    // InternalUnoText.g:1433:1: rule__CumulAjout__Group__0__Impl : ( ( ( 'CumulAjout' ) ) ( ( 'CumulAjout' )* ) ) ;
    public final void rule__CumulAjout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1437:1: ( ( ( ( 'CumulAjout' ) ) ( ( 'CumulAjout' )* ) ) )
            // InternalUnoText.g:1438:1: ( ( ( 'CumulAjout' ) ) ( ( 'CumulAjout' )* ) )
            {
            // InternalUnoText.g:1438:1: ( ( ( 'CumulAjout' ) ) ( ( 'CumulAjout' )* ) )
            // InternalUnoText.g:1439:2: ( ( 'CumulAjout' ) ) ( ( 'CumulAjout' )* )
            {
            // InternalUnoText.g:1439:2: ( ( 'CumulAjout' ) )
            // InternalUnoText.g:1440:3: ( 'CumulAjout' )
            {
             before(grammarAccess.getCumulAjoutAccess().getCumulAjoutKeyword_0()); 
            // InternalUnoText.g:1441:3: ( 'CumulAjout' )
            // InternalUnoText.g:1441:4: 'CumulAjout'
            {
            match(input,33,FOLLOW_31); 

            }

             after(grammarAccess.getCumulAjoutAccess().getCumulAjoutKeyword_0()); 

            }

            // InternalUnoText.g:1444:2: ( ( 'CumulAjout' )* )
            // InternalUnoText.g:1445:3: ( 'CumulAjout' )*
            {
             before(grammarAccess.getCumulAjoutAccess().getCumulAjoutKeyword_0()); 
            // InternalUnoText.g:1446:3: ( 'CumulAjout' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==33) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalUnoText.g:1446:4: 'CumulAjout'
            	    {
            	    match(input,33,FOLLOW_31); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getCumulAjoutAccess().getCumulAjoutKeyword_0()); 

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
    // $ANTLR end "rule__CumulAjout__Group__0__Impl"


    // $ANTLR start "rule__CumulAjout__Group__1"
    // InternalUnoText.g:1455:1: rule__CumulAjout__Group__1 : rule__CumulAjout__Group__1__Impl rule__CumulAjout__Group__2 ;
    public final void rule__CumulAjout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1459:1: ( rule__CumulAjout__Group__1__Impl rule__CumulAjout__Group__2 )
            // InternalUnoText.g:1460:2: rule__CumulAjout__Group__1__Impl rule__CumulAjout__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__CumulAjout__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CumulAjout__Group__2();

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
    // $ANTLR end "rule__CumulAjout__Group__1"


    // $ANTLR start "rule__CumulAjout__Group__1__Impl"
    // InternalUnoText.g:1467:1: rule__CumulAjout__Group__1__Impl : ( ( rule__CumulAjout__Plus2Assignment_1 )* ) ;
    public final void rule__CumulAjout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1471:1: ( ( ( rule__CumulAjout__Plus2Assignment_1 )* ) )
            // InternalUnoText.g:1472:1: ( ( rule__CumulAjout__Plus2Assignment_1 )* )
            {
            // InternalUnoText.g:1472:1: ( ( rule__CumulAjout__Plus2Assignment_1 )* )
            // InternalUnoText.g:1473:2: ( rule__CumulAjout__Plus2Assignment_1 )*
            {
             before(grammarAccess.getCumulAjoutAccess().getPlus2Assignment_1()); 
            // InternalUnoText.g:1474:2: ( rule__CumulAjout__Plus2Assignment_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==59) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalUnoText.g:1474:3: rule__CumulAjout__Plus2Assignment_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__CumulAjout__Plus2Assignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getCumulAjoutAccess().getPlus2Assignment_1()); 

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
    // $ANTLR end "rule__CumulAjout__Group__1__Impl"


    // $ANTLR start "rule__CumulAjout__Group__2"
    // InternalUnoText.g:1482:1: rule__CumulAjout__Group__2 : rule__CumulAjout__Group__2__Impl ;
    public final void rule__CumulAjout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1486:1: ( rule__CumulAjout__Group__2__Impl )
            // InternalUnoText.g:1487:2: rule__CumulAjout__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CumulAjout__Group__2__Impl();

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
    // $ANTLR end "rule__CumulAjout__Group__2"


    // $ANTLR start "rule__CumulAjout__Group__2__Impl"
    // InternalUnoText.g:1493:1: rule__CumulAjout__Group__2__Impl : ( ( rule__CumulAjout__Plus4Assignment_2 )? ) ;
    public final void rule__CumulAjout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1497:1: ( ( ( rule__CumulAjout__Plus4Assignment_2 )? ) )
            // InternalUnoText.g:1498:1: ( ( rule__CumulAjout__Plus4Assignment_2 )? )
            {
            // InternalUnoText.g:1498:1: ( ( rule__CumulAjout__Plus4Assignment_2 )? )
            // InternalUnoText.g:1499:2: ( rule__CumulAjout__Plus4Assignment_2 )?
            {
             before(grammarAccess.getCumulAjoutAccess().getPlus4Assignment_2()); 
            // InternalUnoText.g:1500:2: ( rule__CumulAjout__Plus4Assignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==60) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUnoText.g:1500:3: rule__CumulAjout__Plus4Assignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CumulAjout__Plus4Assignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCumulAjoutAccess().getPlus4Assignment_2()); 

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
    // $ANTLR end "rule__CumulAjout__Group__2__Impl"


    // $ANTLR start "rule__Suite__Group_0__0"
    // InternalUnoText.g:1509:1: rule__Suite__Group_0__0 : rule__Suite__Group_0__0__Impl rule__Suite__Group_0__1 ;
    public final void rule__Suite__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1513:1: ( rule__Suite__Group_0__0__Impl rule__Suite__Group_0__1 )
            // InternalUnoText.g:1514:2: rule__Suite__Group_0__0__Impl rule__Suite__Group_0__1
            {
            pushFollow(FOLLOW_33);
            rule__Suite__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Suite__Group_0__1();

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
    // $ANTLR end "rule__Suite__Group_0__0"


    // $ANTLR start "rule__Suite__Group_0__0__Impl"
    // InternalUnoText.g:1521:1: rule__Suite__Group_0__0__Impl : ( ( ( 'Suite : ' ) ) ( ( 'Suite : ' )* ) ) ;
    public final void rule__Suite__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1525:1: ( ( ( ( 'Suite : ' ) ) ( ( 'Suite : ' )* ) ) )
            // InternalUnoText.g:1526:1: ( ( ( 'Suite : ' ) ) ( ( 'Suite : ' )* ) )
            {
            // InternalUnoText.g:1526:1: ( ( ( 'Suite : ' ) ) ( ( 'Suite : ' )* ) )
            // InternalUnoText.g:1527:2: ( ( 'Suite : ' ) ) ( ( 'Suite : ' )* )
            {
            // InternalUnoText.g:1527:2: ( ( 'Suite : ' ) )
            // InternalUnoText.g:1528:3: ( 'Suite : ' )
            {
             before(grammarAccess.getSuiteAccess().getSuiteKeyword_0_0()); 
            // InternalUnoText.g:1529:3: ( 'Suite : ' )
            // InternalUnoText.g:1529:4: 'Suite : '
            {
            match(input,34,FOLLOW_34); 

            }

             after(grammarAccess.getSuiteAccess().getSuiteKeyword_0_0()); 

            }

            // InternalUnoText.g:1532:2: ( ( 'Suite : ' )* )
            // InternalUnoText.g:1533:3: ( 'Suite : ' )*
            {
             before(grammarAccess.getSuiteAccess().getSuiteKeyword_0_0()); 
            // InternalUnoText.g:1534:3: ( 'Suite : ' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==34) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUnoText.g:1534:4: 'Suite : '
            	    {
            	    match(input,34,FOLLOW_34); 

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getSuiteAccess().getSuiteKeyword_0_0()); 

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
    // $ANTLR end "rule__Suite__Group_0__0__Impl"


    // $ANTLR start "rule__Suite__Group_0__1"
    // InternalUnoText.g:1543:1: rule__Suite__Group_0__1 : rule__Suite__Group_0__1__Impl ;
    public final void rule__Suite__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1547:1: ( rule__Suite__Group_0__1__Impl )
            // InternalUnoText.g:1548:2: rule__Suite__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Suite__Group_0__1__Impl();

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
    // $ANTLR end "rule__Suite__Group_0__1"


    // $ANTLR start "rule__Suite__Group_0__1__Impl"
    // InternalUnoText.g:1554:1: rule__Suite__Group_0__1__Impl : ( 'Simple' ) ;
    public final void rule__Suite__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1558:1: ( ( 'Simple' ) )
            // InternalUnoText.g:1559:1: ( 'Simple' )
            {
            // InternalUnoText.g:1559:1: ( 'Simple' )
            // InternalUnoText.g:1560:2: 'Simple'
            {
             before(grammarAccess.getSuiteAccess().getSimpleKeyword_0_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSuiteAccess().getSimpleKeyword_0_1()); 

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
    // $ANTLR end "rule__Suite__Group_0__1__Impl"


    // $ANTLR start "rule__UnoOlypique__Group__0"
    // InternalUnoText.g:1570:1: rule__UnoOlypique__Group__0 : rule__UnoOlypique__Group__0__Impl rule__UnoOlypique__Group__1 ;
    public final void rule__UnoOlypique__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1574:1: ( rule__UnoOlypique__Group__0__Impl rule__UnoOlypique__Group__1 )
            // InternalUnoText.g:1575:2: rule__UnoOlypique__Group__0__Impl rule__UnoOlypique__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__UnoOlypique__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoOlypique__Group__1();

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
    // $ANTLR end "rule__UnoOlypique__Group__0"


    // $ANTLR start "rule__UnoOlypique__Group__0__Impl"
    // InternalUnoText.g:1582:1: rule__UnoOlypique__Group__0__Impl : ( ( ( 'UnoOlympique : ' ) ) ( ( 'UnoOlympique : ' )* ) ) ;
    public final void rule__UnoOlypique__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1586:1: ( ( ( ( 'UnoOlympique : ' ) ) ( ( 'UnoOlympique : ' )* ) ) )
            // InternalUnoText.g:1587:1: ( ( ( 'UnoOlympique : ' ) ) ( ( 'UnoOlympique : ' )* ) )
            {
            // InternalUnoText.g:1587:1: ( ( ( 'UnoOlympique : ' ) ) ( ( 'UnoOlympique : ' )* ) )
            // InternalUnoText.g:1588:2: ( ( 'UnoOlympique : ' ) ) ( ( 'UnoOlympique : ' )* )
            {
            // InternalUnoText.g:1588:2: ( ( 'UnoOlympique : ' ) )
            // InternalUnoText.g:1589:3: ( 'UnoOlympique : ' )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getUnoOlympiqueKeyword_0()); 
            // InternalUnoText.g:1590:3: ( 'UnoOlympique : ' )
            // InternalUnoText.g:1590:4: 'UnoOlympique : '
            {
            match(input,36,FOLLOW_36); 

            }

             after(grammarAccess.getUnoOlypiqueAccess().getUnoOlympiqueKeyword_0()); 

            }

            // InternalUnoText.g:1593:2: ( ( 'UnoOlympique : ' )* )
            // InternalUnoText.g:1594:3: ( 'UnoOlympique : ' )*
            {
             before(grammarAccess.getUnoOlypiqueAccess().getUnoOlympiqueKeyword_0()); 
            // InternalUnoText.g:1595:3: ( 'UnoOlympique : ' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==36) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalUnoText.g:1595:4: 'UnoOlympique : '
            	    {
            	    match(input,36,FOLLOW_36); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getUnoOlypiqueAccess().getUnoOlympiqueKeyword_0()); 

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
    // $ANTLR end "rule__UnoOlypique__Group__0__Impl"


    // $ANTLR start "rule__UnoOlypique__Group__1"
    // InternalUnoText.g:1604:1: rule__UnoOlypique__Group__1 : rule__UnoOlypique__Group__1__Impl rule__UnoOlypique__Group__2 ;
    public final void rule__UnoOlypique__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1608:1: ( rule__UnoOlypique__Group__1__Impl rule__UnoOlypique__Group__2 )
            // InternalUnoText.g:1609:2: rule__UnoOlypique__Group__1__Impl rule__UnoOlypique__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__UnoOlypique__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoOlypique__Group__2();

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
    // $ANTLR end "rule__UnoOlypique__Group__1"


    // $ANTLR start "rule__UnoOlypique__Group__1__Impl"
    // InternalUnoText.g:1616:1: rule__UnoOlypique__Group__1__Impl : ( ( ( rule__UnoOlypique__TribunalPopulaireAssignment_1 ) ) ( ( rule__UnoOlypique__TribunalPopulaireAssignment_1 )* ) ) ;
    public final void rule__UnoOlypique__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1620:1: ( ( ( ( rule__UnoOlypique__TribunalPopulaireAssignment_1 ) ) ( ( rule__UnoOlypique__TribunalPopulaireAssignment_1 )* ) ) )
            // InternalUnoText.g:1621:1: ( ( ( rule__UnoOlypique__TribunalPopulaireAssignment_1 ) ) ( ( rule__UnoOlypique__TribunalPopulaireAssignment_1 )* ) )
            {
            // InternalUnoText.g:1621:1: ( ( ( rule__UnoOlypique__TribunalPopulaireAssignment_1 ) ) ( ( rule__UnoOlypique__TribunalPopulaireAssignment_1 )* ) )
            // InternalUnoText.g:1622:2: ( ( rule__UnoOlypique__TribunalPopulaireAssignment_1 ) ) ( ( rule__UnoOlypique__TribunalPopulaireAssignment_1 )* )
            {
            // InternalUnoText.g:1622:2: ( ( rule__UnoOlypique__TribunalPopulaireAssignment_1 ) )
            // InternalUnoText.g:1623:3: ( rule__UnoOlypique__TribunalPopulaireAssignment_1 )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getTribunalPopulaireAssignment_1()); 
            // InternalUnoText.g:1624:3: ( rule__UnoOlypique__TribunalPopulaireAssignment_1 )
            // InternalUnoText.g:1624:4: rule__UnoOlypique__TribunalPopulaireAssignment_1
            {
            pushFollow(FOLLOW_38);
            rule__UnoOlypique__TribunalPopulaireAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnoOlypiqueAccess().getTribunalPopulaireAssignment_1()); 

            }

            // InternalUnoText.g:1627:2: ( ( rule__UnoOlypique__TribunalPopulaireAssignment_1 )* )
            // InternalUnoText.g:1628:3: ( rule__UnoOlypique__TribunalPopulaireAssignment_1 )*
            {
             before(grammarAccess.getUnoOlypiqueAccess().getTribunalPopulaireAssignment_1()); 
            // InternalUnoText.g:1629:3: ( rule__UnoOlypique__TribunalPopulaireAssignment_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==61) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalUnoText.g:1629:4: rule__UnoOlypique__TribunalPopulaireAssignment_1
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__UnoOlypique__TribunalPopulaireAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getUnoOlypiqueAccess().getTribunalPopulaireAssignment_1()); 

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
    // $ANTLR end "rule__UnoOlypique__Group__1__Impl"


    // $ANTLR start "rule__UnoOlypique__Group__2"
    // InternalUnoText.g:1638:1: rule__UnoOlypique__Group__2 : rule__UnoOlypique__Group__2__Impl rule__UnoOlypique__Group__3 ;
    public final void rule__UnoOlypique__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1642:1: ( rule__UnoOlypique__Group__2__Impl rule__UnoOlypique__Group__3 )
            // InternalUnoText.g:1643:2: rule__UnoOlypique__Group__2__Impl rule__UnoOlypique__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__UnoOlypique__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoOlypique__Group__3();

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
    // $ANTLR end "rule__UnoOlypique__Group__2"


    // $ANTLR start "rule__UnoOlypique__Group__2__Impl"
    // InternalUnoText.g:1650:1: rule__UnoOlypique__Group__2__Impl : ( ( ( rule__UnoOlypique__DistributionAleatoireAssignment_2 ) ) ( ( rule__UnoOlypique__DistributionAleatoireAssignment_2 )* ) ) ;
    public final void rule__UnoOlypique__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1654:1: ( ( ( ( rule__UnoOlypique__DistributionAleatoireAssignment_2 ) ) ( ( rule__UnoOlypique__DistributionAleatoireAssignment_2 )* ) ) )
            // InternalUnoText.g:1655:1: ( ( ( rule__UnoOlypique__DistributionAleatoireAssignment_2 ) ) ( ( rule__UnoOlypique__DistributionAleatoireAssignment_2 )* ) )
            {
            // InternalUnoText.g:1655:1: ( ( ( rule__UnoOlypique__DistributionAleatoireAssignment_2 ) ) ( ( rule__UnoOlypique__DistributionAleatoireAssignment_2 )* ) )
            // InternalUnoText.g:1656:2: ( ( rule__UnoOlypique__DistributionAleatoireAssignment_2 ) ) ( ( rule__UnoOlypique__DistributionAleatoireAssignment_2 )* )
            {
            // InternalUnoText.g:1656:2: ( ( rule__UnoOlypique__DistributionAleatoireAssignment_2 ) )
            // InternalUnoText.g:1657:3: ( rule__UnoOlypique__DistributionAleatoireAssignment_2 )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getDistributionAleatoireAssignment_2()); 
            // InternalUnoText.g:1658:3: ( rule__UnoOlypique__DistributionAleatoireAssignment_2 )
            // InternalUnoText.g:1658:4: rule__UnoOlypique__DistributionAleatoireAssignment_2
            {
            pushFollow(FOLLOW_40);
            rule__UnoOlypique__DistributionAleatoireAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnoOlypiqueAccess().getDistributionAleatoireAssignment_2()); 

            }

            // InternalUnoText.g:1661:2: ( ( rule__UnoOlypique__DistributionAleatoireAssignment_2 )* )
            // InternalUnoText.g:1662:3: ( rule__UnoOlypique__DistributionAleatoireAssignment_2 )*
            {
             before(grammarAccess.getUnoOlypiqueAccess().getDistributionAleatoireAssignment_2()); 
            // InternalUnoText.g:1663:3: ( rule__UnoOlypique__DistributionAleatoireAssignment_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==62) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalUnoText.g:1663:4: rule__UnoOlypique__DistributionAleatoireAssignment_2
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__UnoOlypique__DistributionAleatoireAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getUnoOlypiqueAccess().getDistributionAleatoireAssignment_2()); 

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
    // $ANTLR end "rule__UnoOlypique__Group__2__Impl"


    // $ANTLR start "rule__UnoOlypique__Group__3"
    // InternalUnoText.g:1672:1: rule__UnoOlypique__Group__3 : rule__UnoOlypique__Group__3__Impl rule__UnoOlypique__Group__4 ;
    public final void rule__UnoOlypique__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1676:1: ( rule__UnoOlypique__Group__3__Impl rule__UnoOlypique__Group__4 )
            // InternalUnoText.g:1677:2: rule__UnoOlypique__Group__3__Impl rule__UnoOlypique__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__UnoOlypique__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoOlypique__Group__4();

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
    // $ANTLR end "rule__UnoOlypique__Group__3"


    // $ANTLR start "rule__UnoOlypique__Group__3__Impl"
    // InternalUnoText.g:1684:1: rule__UnoOlypique__Group__3__Impl : ( ( ( rule__UnoOlypique__SensDefiniAssignment_3 ) ) ( ( rule__UnoOlypique__SensDefiniAssignment_3 )* ) ) ;
    public final void rule__UnoOlypique__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1688:1: ( ( ( ( rule__UnoOlypique__SensDefiniAssignment_3 ) ) ( ( rule__UnoOlypique__SensDefiniAssignment_3 )* ) ) )
            // InternalUnoText.g:1689:1: ( ( ( rule__UnoOlypique__SensDefiniAssignment_3 ) ) ( ( rule__UnoOlypique__SensDefiniAssignment_3 )* ) )
            {
            // InternalUnoText.g:1689:1: ( ( ( rule__UnoOlypique__SensDefiniAssignment_3 ) ) ( ( rule__UnoOlypique__SensDefiniAssignment_3 )* ) )
            // InternalUnoText.g:1690:2: ( ( rule__UnoOlypique__SensDefiniAssignment_3 ) ) ( ( rule__UnoOlypique__SensDefiniAssignment_3 )* )
            {
            // InternalUnoText.g:1690:2: ( ( rule__UnoOlypique__SensDefiniAssignment_3 ) )
            // InternalUnoText.g:1691:3: ( rule__UnoOlypique__SensDefiniAssignment_3 )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getSensDefiniAssignment_3()); 
            // InternalUnoText.g:1692:3: ( rule__UnoOlypique__SensDefiniAssignment_3 )
            // InternalUnoText.g:1692:4: rule__UnoOlypique__SensDefiniAssignment_3
            {
            pushFollow(FOLLOW_42);
            rule__UnoOlypique__SensDefiniAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUnoOlypiqueAccess().getSensDefiniAssignment_3()); 

            }

            // InternalUnoText.g:1695:2: ( ( rule__UnoOlypique__SensDefiniAssignment_3 )* )
            // InternalUnoText.g:1696:3: ( rule__UnoOlypique__SensDefiniAssignment_3 )*
            {
             before(grammarAccess.getUnoOlypiqueAccess().getSensDefiniAssignment_3()); 
            // InternalUnoText.g:1697:3: ( rule__UnoOlypique__SensDefiniAssignment_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==63) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalUnoText.g:1697:4: rule__UnoOlypique__SensDefiniAssignment_3
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__UnoOlypique__SensDefiniAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getUnoOlypiqueAccess().getSensDefiniAssignment_3()); 

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
    // $ANTLR end "rule__UnoOlypique__Group__3__Impl"


    // $ANTLR start "rule__UnoOlypique__Group__4"
    // InternalUnoText.g:1706:1: rule__UnoOlypique__Group__4 : rule__UnoOlypique__Group__4__Impl rule__UnoOlypique__Group__5 ;
    public final void rule__UnoOlypique__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1710:1: ( rule__UnoOlypique__Group__4__Impl rule__UnoOlypique__Group__5 )
            // InternalUnoText.g:1711:2: rule__UnoOlypique__Group__4__Impl rule__UnoOlypique__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__UnoOlypique__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoOlypique__Group__5();

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
    // $ANTLR end "rule__UnoOlypique__Group__4"


    // $ANTLR start "rule__UnoOlypique__Group__4__Impl"
    // InternalUnoText.g:1718:1: rule__UnoOlypique__Group__4__Impl : ( ( ( rule__UnoOlypique__ChangementDonneurAssignment_4 ) ) ( ( rule__UnoOlypique__ChangementDonneurAssignment_4 )* ) ) ;
    public final void rule__UnoOlypique__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1722:1: ( ( ( ( rule__UnoOlypique__ChangementDonneurAssignment_4 ) ) ( ( rule__UnoOlypique__ChangementDonneurAssignment_4 )* ) ) )
            // InternalUnoText.g:1723:1: ( ( ( rule__UnoOlypique__ChangementDonneurAssignment_4 ) ) ( ( rule__UnoOlypique__ChangementDonneurAssignment_4 )* ) )
            {
            // InternalUnoText.g:1723:1: ( ( ( rule__UnoOlypique__ChangementDonneurAssignment_4 ) ) ( ( rule__UnoOlypique__ChangementDonneurAssignment_4 )* ) )
            // InternalUnoText.g:1724:2: ( ( rule__UnoOlypique__ChangementDonneurAssignment_4 ) ) ( ( rule__UnoOlypique__ChangementDonneurAssignment_4 )* )
            {
            // InternalUnoText.g:1724:2: ( ( rule__UnoOlypique__ChangementDonneurAssignment_4 ) )
            // InternalUnoText.g:1725:3: ( rule__UnoOlypique__ChangementDonneurAssignment_4 )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getChangementDonneurAssignment_4()); 
            // InternalUnoText.g:1726:3: ( rule__UnoOlypique__ChangementDonneurAssignment_4 )
            // InternalUnoText.g:1726:4: rule__UnoOlypique__ChangementDonneurAssignment_4
            {
            pushFollow(FOLLOW_44);
            rule__UnoOlypique__ChangementDonneurAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUnoOlypiqueAccess().getChangementDonneurAssignment_4()); 

            }

            // InternalUnoText.g:1729:2: ( ( rule__UnoOlypique__ChangementDonneurAssignment_4 )* )
            // InternalUnoText.g:1730:3: ( rule__UnoOlypique__ChangementDonneurAssignment_4 )*
            {
             before(grammarAccess.getUnoOlypiqueAccess().getChangementDonneurAssignment_4()); 
            // InternalUnoText.g:1731:3: ( rule__UnoOlypique__ChangementDonneurAssignment_4 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==64) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalUnoText.g:1731:4: rule__UnoOlypique__ChangementDonneurAssignment_4
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__UnoOlypique__ChangementDonneurAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getUnoOlypiqueAccess().getChangementDonneurAssignment_4()); 

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
    // $ANTLR end "rule__UnoOlypique__Group__4__Impl"


    // $ANTLR start "rule__UnoOlypique__Group__5"
    // InternalUnoText.g:1740:1: rule__UnoOlypique__Group__5 : rule__UnoOlypique__Group__5__Impl rule__UnoOlypique__Group__6 ;
    public final void rule__UnoOlypique__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1744:1: ( rule__UnoOlypique__Group__5__Impl rule__UnoOlypique__Group__6 )
            // InternalUnoText.g:1745:2: rule__UnoOlypique__Group__5__Impl rule__UnoOlypique__Group__6
            {
            pushFollow(FOLLOW_45);
            rule__UnoOlypique__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoOlypique__Group__6();

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
    // $ANTLR end "rule__UnoOlypique__Group__5"


    // $ANTLR start "rule__UnoOlypique__Group__5__Impl"
    // InternalUnoText.g:1752:1: rule__UnoOlypique__Group__5__Impl : ( ( ( rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5 ) ) ( ( rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5 )* ) ) ;
    public final void rule__UnoOlypique__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1756:1: ( ( ( ( rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5 ) ) ( ( rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5 )* ) ) )
            // InternalUnoText.g:1757:1: ( ( ( rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5 ) ) ( ( rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5 )* ) )
            {
            // InternalUnoText.g:1757:1: ( ( ( rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5 ) ) ( ( rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5 )* ) )
            // InternalUnoText.g:1758:2: ( ( rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5 ) ) ( ( rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5 )* )
            {
            // InternalUnoText.g:1758:2: ( ( rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5 ) )
            // InternalUnoText.g:1759:3: ( rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5 )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getVueDesCartesApres1erPoseAssignment_5()); 
            // InternalUnoText.g:1760:3: ( rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5 )
            // InternalUnoText.g:1760:4: rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5
            {
            pushFollow(FOLLOW_46);
            rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUnoOlypiqueAccess().getVueDesCartesApres1erPoseAssignment_5()); 

            }

            // InternalUnoText.g:1763:2: ( ( rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5 )* )
            // InternalUnoText.g:1764:3: ( rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5 )*
            {
             before(grammarAccess.getUnoOlypiqueAccess().getVueDesCartesApres1erPoseAssignment_5()); 
            // InternalUnoText.g:1765:3: ( rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==65) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalUnoText.g:1765:4: rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getUnoOlypiqueAccess().getVueDesCartesApres1erPoseAssignment_5()); 

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
    // $ANTLR end "rule__UnoOlypique__Group__5__Impl"


    // $ANTLR start "rule__UnoOlypique__Group__6"
    // InternalUnoText.g:1774:1: rule__UnoOlypique__Group__6 : rule__UnoOlypique__Group__6__Impl rule__UnoOlypique__Group__7 ;
    public final void rule__UnoOlypique__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1778:1: ( rule__UnoOlypique__Group__6__Impl rule__UnoOlypique__Group__7 )
            // InternalUnoText.g:1779:2: rule__UnoOlypique__Group__6__Impl rule__UnoOlypique__Group__7
            {
            pushFollow(FOLLOW_47);
            rule__UnoOlypique__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoOlypique__Group__7();

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
    // $ANTLR end "rule__UnoOlypique__Group__6"


    // $ANTLR start "rule__UnoOlypique__Group__6__Impl"
    // InternalUnoText.g:1786:1: rule__UnoOlypique__Group__6__Impl : ( ( ( rule__UnoOlypique__DonneurPremieroseAssignment_6 ) ) ( ( rule__UnoOlypique__DonneurPremieroseAssignment_6 )* ) ) ;
    public final void rule__UnoOlypique__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1790:1: ( ( ( ( rule__UnoOlypique__DonneurPremieroseAssignment_6 ) ) ( ( rule__UnoOlypique__DonneurPremieroseAssignment_6 )* ) ) )
            // InternalUnoText.g:1791:1: ( ( ( rule__UnoOlypique__DonneurPremieroseAssignment_6 ) ) ( ( rule__UnoOlypique__DonneurPremieroseAssignment_6 )* ) )
            {
            // InternalUnoText.g:1791:1: ( ( ( rule__UnoOlypique__DonneurPremieroseAssignment_6 ) ) ( ( rule__UnoOlypique__DonneurPremieroseAssignment_6 )* ) )
            // InternalUnoText.g:1792:2: ( ( rule__UnoOlypique__DonneurPremieroseAssignment_6 ) ) ( ( rule__UnoOlypique__DonneurPremieroseAssignment_6 )* )
            {
            // InternalUnoText.g:1792:2: ( ( rule__UnoOlypique__DonneurPremieroseAssignment_6 ) )
            // InternalUnoText.g:1793:3: ( rule__UnoOlypique__DonneurPremieroseAssignment_6 )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getDonneurPremieroseAssignment_6()); 
            // InternalUnoText.g:1794:3: ( rule__UnoOlypique__DonneurPremieroseAssignment_6 )
            // InternalUnoText.g:1794:4: rule__UnoOlypique__DonneurPremieroseAssignment_6
            {
            pushFollow(FOLLOW_48);
            rule__UnoOlypique__DonneurPremieroseAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUnoOlypiqueAccess().getDonneurPremieroseAssignment_6()); 

            }

            // InternalUnoText.g:1797:2: ( ( rule__UnoOlypique__DonneurPremieroseAssignment_6 )* )
            // InternalUnoText.g:1798:3: ( rule__UnoOlypique__DonneurPremieroseAssignment_6 )*
            {
             before(grammarAccess.getUnoOlypiqueAccess().getDonneurPremieroseAssignment_6()); 
            // InternalUnoText.g:1799:3: ( rule__UnoOlypique__DonneurPremieroseAssignment_6 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==66) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalUnoText.g:1799:4: rule__UnoOlypique__DonneurPremieroseAssignment_6
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__UnoOlypique__DonneurPremieroseAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getUnoOlypiqueAccess().getDonneurPremieroseAssignment_6()); 

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
    // $ANTLR end "rule__UnoOlypique__Group__6__Impl"


    // $ANTLR start "rule__UnoOlypique__Group__7"
    // InternalUnoText.g:1808:1: rule__UnoOlypique__Group__7 : rule__UnoOlypique__Group__7__Impl rule__UnoOlypique__Group__8 ;
    public final void rule__UnoOlypique__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1812:1: ( rule__UnoOlypique__Group__7__Impl rule__UnoOlypique__Group__8 )
            // InternalUnoText.g:1813:2: rule__UnoOlypique__Group__7__Impl rule__UnoOlypique__Group__8
            {
            pushFollow(FOLLOW_49);
            rule__UnoOlypique__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoOlypique__Group__8();

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
    // $ANTLR end "rule__UnoOlypique__Group__7"


    // $ANTLR start "rule__UnoOlypique__Group__7__Impl"
    // InternalUnoText.g:1820:1: rule__UnoOlypique__Group__7__Impl : ( ( ( rule__UnoOlypique__JeuRapideAssignment_7 ) ) ( ( rule__UnoOlypique__JeuRapideAssignment_7 )* ) ) ;
    public final void rule__UnoOlypique__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1824:1: ( ( ( ( rule__UnoOlypique__JeuRapideAssignment_7 ) ) ( ( rule__UnoOlypique__JeuRapideAssignment_7 )* ) ) )
            // InternalUnoText.g:1825:1: ( ( ( rule__UnoOlypique__JeuRapideAssignment_7 ) ) ( ( rule__UnoOlypique__JeuRapideAssignment_7 )* ) )
            {
            // InternalUnoText.g:1825:1: ( ( ( rule__UnoOlypique__JeuRapideAssignment_7 ) ) ( ( rule__UnoOlypique__JeuRapideAssignment_7 )* ) )
            // InternalUnoText.g:1826:2: ( ( rule__UnoOlypique__JeuRapideAssignment_7 ) ) ( ( rule__UnoOlypique__JeuRapideAssignment_7 )* )
            {
            // InternalUnoText.g:1826:2: ( ( rule__UnoOlypique__JeuRapideAssignment_7 ) )
            // InternalUnoText.g:1827:3: ( rule__UnoOlypique__JeuRapideAssignment_7 )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getJeuRapideAssignment_7()); 
            // InternalUnoText.g:1828:3: ( rule__UnoOlypique__JeuRapideAssignment_7 )
            // InternalUnoText.g:1828:4: rule__UnoOlypique__JeuRapideAssignment_7
            {
            pushFollow(FOLLOW_50);
            rule__UnoOlypique__JeuRapideAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getUnoOlypiqueAccess().getJeuRapideAssignment_7()); 

            }

            // InternalUnoText.g:1831:2: ( ( rule__UnoOlypique__JeuRapideAssignment_7 )* )
            // InternalUnoText.g:1832:3: ( rule__UnoOlypique__JeuRapideAssignment_7 )*
            {
             before(grammarAccess.getUnoOlypiqueAccess().getJeuRapideAssignment_7()); 
            // InternalUnoText.g:1833:3: ( rule__UnoOlypique__JeuRapideAssignment_7 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==67) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalUnoText.g:1833:4: rule__UnoOlypique__JeuRapideAssignment_7
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__UnoOlypique__JeuRapideAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getUnoOlypiqueAccess().getJeuRapideAssignment_7()); 

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
    // $ANTLR end "rule__UnoOlypique__Group__7__Impl"


    // $ANTLR start "rule__UnoOlypique__Group__8"
    // InternalUnoText.g:1842:1: rule__UnoOlypique__Group__8 : rule__UnoOlypique__Group__8__Impl rule__UnoOlypique__Group__9 ;
    public final void rule__UnoOlypique__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1846:1: ( rule__UnoOlypique__Group__8__Impl rule__UnoOlypique__Group__9 )
            // InternalUnoText.g:1847:2: rule__UnoOlypique__Group__8__Impl rule__UnoOlypique__Group__9
            {
            pushFollow(FOLLOW_51);
            rule__UnoOlypique__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoOlypique__Group__9();

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
    // $ANTLR end "rule__UnoOlypique__Group__8"


    // $ANTLR start "rule__UnoOlypique__Group__8__Impl"
    // InternalUnoText.g:1854:1: rule__UnoOlypique__Group__8__Impl : ( ( ( rule__UnoOlypique__InterceptionAssignment_8 ) ) ( ( rule__UnoOlypique__InterceptionAssignment_8 )* ) ) ;
    public final void rule__UnoOlypique__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1858:1: ( ( ( ( rule__UnoOlypique__InterceptionAssignment_8 ) ) ( ( rule__UnoOlypique__InterceptionAssignment_8 )* ) ) )
            // InternalUnoText.g:1859:1: ( ( ( rule__UnoOlypique__InterceptionAssignment_8 ) ) ( ( rule__UnoOlypique__InterceptionAssignment_8 )* ) )
            {
            // InternalUnoText.g:1859:1: ( ( ( rule__UnoOlypique__InterceptionAssignment_8 ) ) ( ( rule__UnoOlypique__InterceptionAssignment_8 )* ) )
            // InternalUnoText.g:1860:2: ( ( rule__UnoOlypique__InterceptionAssignment_8 ) ) ( ( rule__UnoOlypique__InterceptionAssignment_8 )* )
            {
            // InternalUnoText.g:1860:2: ( ( rule__UnoOlypique__InterceptionAssignment_8 ) )
            // InternalUnoText.g:1861:3: ( rule__UnoOlypique__InterceptionAssignment_8 )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getInterceptionAssignment_8()); 
            // InternalUnoText.g:1862:3: ( rule__UnoOlypique__InterceptionAssignment_8 )
            // InternalUnoText.g:1862:4: rule__UnoOlypique__InterceptionAssignment_8
            {
            pushFollow(FOLLOW_52);
            rule__UnoOlypique__InterceptionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getUnoOlypiqueAccess().getInterceptionAssignment_8()); 

            }

            // InternalUnoText.g:1865:2: ( ( rule__UnoOlypique__InterceptionAssignment_8 )* )
            // InternalUnoText.g:1866:3: ( rule__UnoOlypique__InterceptionAssignment_8 )*
            {
             before(grammarAccess.getUnoOlypiqueAccess().getInterceptionAssignment_8()); 
            // InternalUnoText.g:1867:3: ( rule__UnoOlypique__InterceptionAssignment_8 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==68) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalUnoText.g:1867:4: rule__UnoOlypique__InterceptionAssignment_8
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__UnoOlypique__InterceptionAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getUnoOlypiqueAccess().getInterceptionAssignment_8()); 

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
    // $ANTLR end "rule__UnoOlypique__Group__8__Impl"


    // $ANTLR start "rule__UnoOlypique__Group__9"
    // InternalUnoText.g:1876:1: rule__UnoOlypique__Group__9 : rule__UnoOlypique__Group__9__Impl rule__UnoOlypique__Group__10 ;
    public final void rule__UnoOlypique__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1880:1: ( rule__UnoOlypique__Group__9__Impl rule__UnoOlypique__Group__10 )
            // InternalUnoText.g:1881:2: rule__UnoOlypique__Group__9__Impl rule__UnoOlypique__Group__10
            {
            pushFollow(FOLLOW_53);
            rule__UnoOlypique__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoOlypique__Group__10();

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
    // $ANTLR end "rule__UnoOlypique__Group__9"


    // $ANTLR start "rule__UnoOlypique__Group__9__Impl"
    // InternalUnoText.g:1888:1: rule__UnoOlypique__Group__9__Impl : ( ( ( rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9 ) ) ( ( rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9 )* ) ) ;
    public final void rule__UnoOlypique__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1892:1: ( ( ( ( rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9 ) ) ( ( rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9 )* ) ) )
            // InternalUnoText.g:1893:1: ( ( ( rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9 ) ) ( ( rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9 )* ) )
            {
            // InternalUnoText.g:1893:1: ( ( ( rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9 ) ) ( ( rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9 )* ) )
            // InternalUnoText.g:1894:2: ( ( rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9 ) ) ( ( rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9 )* )
            {
            // InternalUnoText.g:1894:2: ( ( rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9 ) )
            // InternalUnoText.g:1895:3: ( rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9 )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getDeuxCartesIdentiquesAssignment_9()); 
            // InternalUnoText.g:1896:3: ( rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9 )
            // InternalUnoText.g:1896:4: rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9
            {
            pushFollow(FOLLOW_54);
            rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getUnoOlypiqueAccess().getDeuxCartesIdentiquesAssignment_9()); 

            }

            // InternalUnoText.g:1899:2: ( ( rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9 )* )
            // InternalUnoText.g:1900:3: ( rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9 )*
            {
             before(grammarAccess.getUnoOlypiqueAccess().getDeuxCartesIdentiquesAssignment_9()); 
            // InternalUnoText.g:1901:3: ( rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==69) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalUnoText.g:1901:4: rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getUnoOlypiqueAccess().getDeuxCartesIdentiquesAssignment_9()); 

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
    // $ANTLR end "rule__UnoOlypique__Group__9__Impl"


    // $ANTLR start "rule__UnoOlypique__Group__10"
    // InternalUnoText.g:1910:1: rule__UnoOlypique__Group__10 : rule__UnoOlypique__Group__10__Impl rule__UnoOlypique__Group__11 ;
    public final void rule__UnoOlypique__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1914:1: ( rule__UnoOlypique__Group__10__Impl rule__UnoOlypique__Group__11 )
            // InternalUnoText.g:1915:2: rule__UnoOlypique__Group__10__Impl rule__UnoOlypique__Group__11
            {
            pushFollow(FOLLOW_55);
            rule__UnoOlypique__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoOlypique__Group__11();

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
    // $ANTLR end "rule__UnoOlypique__Group__10"


    // $ANTLR start "rule__UnoOlypique__Group__10__Impl"
    // InternalUnoText.g:1922:1: rule__UnoOlypique__Group__10__Impl : ( ( ( rule__UnoOlypique__DecisionCarteAssignment_10 ) ) ( ( rule__UnoOlypique__DecisionCarteAssignment_10 )* ) ) ;
    public final void rule__UnoOlypique__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1926:1: ( ( ( ( rule__UnoOlypique__DecisionCarteAssignment_10 ) ) ( ( rule__UnoOlypique__DecisionCarteAssignment_10 )* ) ) )
            // InternalUnoText.g:1927:1: ( ( ( rule__UnoOlypique__DecisionCarteAssignment_10 ) ) ( ( rule__UnoOlypique__DecisionCarteAssignment_10 )* ) )
            {
            // InternalUnoText.g:1927:1: ( ( ( rule__UnoOlypique__DecisionCarteAssignment_10 ) ) ( ( rule__UnoOlypique__DecisionCarteAssignment_10 )* ) )
            // InternalUnoText.g:1928:2: ( ( rule__UnoOlypique__DecisionCarteAssignment_10 ) ) ( ( rule__UnoOlypique__DecisionCarteAssignment_10 )* )
            {
            // InternalUnoText.g:1928:2: ( ( rule__UnoOlypique__DecisionCarteAssignment_10 ) )
            // InternalUnoText.g:1929:3: ( rule__UnoOlypique__DecisionCarteAssignment_10 )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getDecisionCarteAssignment_10()); 
            // InternalUnoText.g:1930:3: ( rule__UnoOlypique__DecisionCarteAssignment_10 )
            // InternalUnoText.g:1930:4: rule__UnoOlypique__DecisionCarteAssignment_10
            {
            pushFollow(FOLLOW_56);
            rule__UnoOlypique__DecisionCarteAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getUnoOlypiqueAccess().getDecisionCarteAssignment_10()); 

            }

            // InternalUnoText.g:1933:2: ( ( rule__UnoOlypique__DecisionCarteAssignment_10 )* )
            // InternalUnoText.g:1934:3: ( rule__UnoOlypique__DecisionCarteAssignment_10 )*
            {
             before(grammarAccess.getUnoOlypiqueAccess().getDecisionCarteAssignment_10()); 
            // InternalUnoText.g:1935:3: ( rule__UnoOlypique__DecisionCarteAssignment_10 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==70) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalUnoText.g:1935:4: rule__UnoOlypique__DecisionCarteAssignment_10
            	    {
            	    pushFollow(FOLLOW_56);
            	    rule__UnoOlypique__DecisionCarteAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getUnoOlypiqueAccess().getDecisionCarteAssignment_10()); 

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
    // $ANTLR end "rule__UnoOlypique__Group__10__Impl"


    // $ANTLR start "rule__UnoOlypique__Group__11"
    // InternalUnoText.g:1944:1: rule__UnoOlypique__Group__11 : rule__UnoOlypique__Group__11__Impl rule__UnoOlypique__Group__12 ;
    public final void rule__UnoOlypique__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1948:1: ( rule__UnoOlypique__Group__11__Impl rule__UnoOlypique__Group__12 )
            // InternalUnoText.g:1949:2: rule__UnoOlypique__Group__11__Impl rule__UnoOlypique__Group__12
            {
            pushFollow(FOLLOW_57);
            rule__UnoOlypique__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoOlypique__Group__12();

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
    // $ANTLR end "rule__UnoOlypique__Group__11"


    // $ANTLR start "rule__UnoOlypique__Group__11__Impl"
    // InternalUnoText.g:1956:1: rule__UnoOlypique__Group__11__Impl : ( ( ( rule__UnoOlypique__SurenchereAssignment_11 ) ) ( ( rule__UnoOlypique__SurenchereAssignment_11 )* ) ) ;
    public final void rule__UnoOlypique__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1960:1: ( ( ( ( rule__UnoOlypique__SurenchereAssignment_11 ) ) ( ( rule__UnoOlypique__SurenchereAssignment_11 )* ) ) )
            // InternalUnoText.g:1961:1: ( ( ( rule__UnoOlypique__SurenchereAssignment_11 ) ) ( ( rule__UnoOlypique__SurenchereAssignment_11 )* ) )
            {
            // InternalUnoText.g:1961:1: ( ( ( rule__UnoOlypique__SurenchereAssignment_11 ) ) ( ( rule__UnoOlypique__SurenchereAssignment_11 )* ) )
            // InternalUnoText.g:1962:2: ( ( rule__UnoOlypique__SurenchereAssignment_11 ) ) ( ( rule__UnoOlypique__SurenchereAssignment_11 )* )
            {
            // InternalUnoText.g:1962:2: ( ( rule__UnoOlypique__SurenchereAssignment_11 ) )
            // InternalUnoText.g:1963:3: ( rule__UnoOlypique__SurenchereAssignment_11 )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getSurenchereAssignment_11()); 
            // InternalUnoText.g:1964:3: ( rule__UnoOlypique__SurenchereAssignment_11 )
            // InternalUnoText.g:1964:4: rule__UnoOlypique__SurenchereAssignment_11
            {
            pushFollow(FOLLOW_58);
            rule__UnoOlypique__SurenchereAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getUnoOlypiqueAccess().getSurenchereAssignment_11()); 

            }

            // InternalUnoText.g:1967:2: ( ( rule__UnoOlypique__SurenchereAssignment_11 )* )
            // InternalUnoText.g:1968:3: ( rule__UnoOlypique__SurenchereAssignment_11 )*
            {
             before(grammarAccess.getUnoOlypiqueAccess().getSurenchereAssignment_11()); 
            // InternalUnoText.g:1969:3: ( rule__UnoOlypique__SurenchereAssignment_11 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==71) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalUnoText.g:1969:4: rule__UnoOlypique__SurenchereAssignment_11
            	    {
            	    pushFollow(FOLLOW_58);
            	    rule__UnoOlypique__SurenchereAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getUnoOlypiqueAccess().getSurenchereAssignment_11()); 

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
    // $ANTLR end "rule__UnoOlypique__Group__11__Impl"


    // $ANTLR start "rule__UnoOlypique__Group__12"
    // InternalUnoText.g:1978:1: rule__UnoOlypique__Group__12 : rule__UnoOlypique__Group__12__Impl rule__UnoOlypique__Group__13 ;
    public final void rule__UnoOlypique__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1982:1: ( rule__UnoOlypique__Group__12__Impl rule__UnoOlypique__Group__13 )
            // InternalUnoText.g:1983:2: rule__UnoOlypique__Group__12__Impl rule__UnoOlypique__Group__13
            {
            pushFollow(FOLLOW_57);
            rule__UnoOlypique__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoOlypique__Group__13();

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
    // $ANTLR end "rule__UnoOlypique__Group__12"


    // $ANTLR start "rule__UnoOlypique__Group__12__Impl"
    // InternalUnoText.g:1990:1: rule__UnoOlypique__Group__12__Impl : ( ( rule__UnoOlypique__CartezeroAssignment_12 )* ) ;
    public final void rule__UnoOlypique__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:1994:1: ( ( ( rule__UnoOlypique__CartezeroAssignment_12 )* ) )
            // InternalUnoText.g:1995:1: ( ( rule__UnoOlypique__CartezeroAssignment_12 )* )
            {
            // InternalUnoText.g:1995:1: ( ( rule__UnoOlypique__CartezeroAssignment_12 )* )
            // InternalUnoText.g:1996:2: ( rule__UnoOlypique__CartezeroAssignment_12 )*
            {
             before(grammarAccess.getUnoOlypiqueAccess().getCartezeroAssignment_12()); 
            // InternalUnoText.g:1997:2: ( rule__UnoOlypique__CartezeroAssignment_12 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==72) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalUnoText.g:1997:3: rule__UnoOlypique__CartezeroAssignment_12
            	    {
            	    pushFollow(FOLLOW_59);
            	    rule__UnoOlypique__CartezeroAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getUnoOlypiqueAccess().getCartezeroAssignment_12()); 

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
    // $ANTLR end "rule__UnoOlypique__Group__12__Impl"


    // $ANTLR start "rule__UnoOlypique__Group__13"
    // InternalUnoText.g:2005:1: rule__UnoOlypique__Group__13 : rule__UnoOlypique__Group__13__Impl rule__UnoOlypique__Group__14 ;
    public final void rule__UnoOlypique__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2009:1: ( rule__UnoOlypique__Group__13__Impl rule__UnoOlypique__Group__14 )
            // InternalUnoText.g:2010:2: rule__UnoOlypique__Group__13__Impl rule__UnoOlypique__Group__14
            {
            pushFollow(FOLLOW_57);
            rule__UnoOlypique__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoOlypique__Group__14();

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
    // $ANTLR end "rule__UnoOlypique__Group__13"


    // $ANTLR start "rule__UnoOlypique__Group__13__Impl"
    // InternalUnoText.g:2017:1: rule__UnoOlypique__Group__13__Impl : ( ( rule__UnoOlypique__CarteSeptAssignment_13 )* ) ;
    public final void rule__UnoOlypique__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2021:1: ( ( ( rule__UnoOlypique__CarteSeptAssignment_13 )* ) )
            // InternalUnoText.g:2022:1: ( ( rule__UnoOlypique__CarteSeptAssignment_13 )* )
            {
            // InternalUnoText.g:2022:1: ( ( rule__UnoOlypique__CarteSeptAssignment_13 )* )
            // InternalUnoText.g:2023:2: ( rule__UnoOlypique__CarteSeptAssignment_13 )*
            {
             before(grammarAccess.getUnoOlypiqueAccess().getCarteSeptAssignment_13()); 
            // InternalUnoText.g:2024:2: ( rule__UnoOlypique__CarteSeptAssignment_13 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==73) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalUnoText.g:2024:3: rule__UnoOlypique__CarteSeptAssignment_13
            	    {
            	    pushFollow(FOLLOW_60);
            	    rule__UnoOlypique__CarteSeptAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getUnoOlypiqueAccess().getCarteSeptAssignment_13()); 

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
    // $ANTLR end "rule__UnoOlypique__Group__13__Impl"


    // $ANTLR start "rule__UnoOlypique__Group__14"
    // InternalUnoText.g:2032:1: rule__UnoOlypique__Group__14 : rule__UnoOlypique__Group__14__Impl rule__UnoOlypique__Group__15 ;
    public final void rule__UnoOlypique__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2036:1: ( rule__UnoOlypique__Group__14__Impl rule__UnoOlypique__Group__15 )
            // InternalUnoText.g:2037:2: rule__UnoOlypique__Group__14__Impl rule__UnoOlypique__Group__15
            {
            pushFollow(FOLLOW_61);
            rule__UnoOlypique__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoOlypique__Group__15();

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
    // $ANTLR end "rule__UnoOlypique__Group__14"


    // $ANTLR start "rule__UnoOlypique__Group__14__Impl"
    // InternalUnoText.g:2044:1: rule__UnoOlypique__Group__14__Impl : ( ( ( rule__UnoOlypique__Carte2Assignment_14 ) ) ( ( rule__UnoOlypique__Carte2Assignment_14 )* ) ) ;
    public final void rule__UnoOlypique__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2048:1: ( ( ( ( rule__UnoOlypique__Carte2Assignment_14 ) ) ( ( rule__UnoOlypique__Carte2Assignment_14 )* ) ) )
            // InternalUnoText.g:2049:1: ( ( ( rule__UnoOlypique__Carte2Assignment_14 ) ) ( ( rule__UnoOlypique__Carte2Assignment_14 )* ) )
            {
            // InternalUnoText.g:2049:1: ( ( ( rule__UnoOlypique__Carte2Assignment_14 ) ) ( ( rule__UnoOlypique__Carte2Assignment_14 )* ) )
            // InternalUnoText.g:2050:2: ( ( rule__UnoOlypique__Carte2Assignment_14 ) ) ( ( rule__UnoOlypique__Carte2Assignment_14 )* )
            {
            // InternalUnoText.g:2050:2: ( ( rule__UnoOlypique__Carte2Assignment_14 ) )
            // InternalUnoText.g:2051:3: ( rule__UnoOlypique__Carte2Assignment_14 )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getCarte2Assignment_14()); 
            // InternalUnoText.g:2052:3: ( rule__UnoOlypique__Carte2Assignment_14 )
            // InternalUnoText.g:2052:4: rule__UnoOlypique__Carte2Assignment_14
            {
            pushFollow(FOLLOW_62);
            rule__UnoOlypique__Carte2Assignment_14();

            state._fsp--;


            }

             after(grammarAccess.getUnoOlypiqueAccess().getCarte2Assignment_14()); 

            }

            // InternalUnoText.g:2055:2: ( ( rule__UnoOlypique__Carte2Assignment_14 )* )
            // InternalUnoText.g:2056:3: ( rule__UnoOlypique__Carte2Assignment_14 )*
            {
             before(grammarAccess.getUnoOlypiqueAccess().getCarte2Assignment_14()); 
            // InternalUnoText.g:2057:3: ( rule__UnoOlypique__Carte2Assignment_14 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==74) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalUnoText.g:2057:4: rule__UnoOlypique__Carte2Assignment_14
            	    {
            	    pushFollow(FOLLOW_62);
            	    rule__UnoOlypique__Carte2Assignment_14();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getUnoOlypiqueAccess().getCarte2Assignment_14()); 

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
    // $ANTLR end "rule__UnoOlypique__Group__14__Impl"


    // $ANTLR start "rule__UnoOlypique__Group__15"
    // InternalUnoText.g:2066:1: rule__UnoOlypique__Group__15 : rule__UnoOlypique__Group__15__Impl ;
    public final void rule__UnoOlypique__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2070:1: ( rule__UnoOlypique__Group__15__Impl )
            // InternalUnoText.g:2071:2: rule__UnoOlypique__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnoOlypique__Group__15__Impl();

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
    // $ANTLR end "rule__UnoOlypique__Group__15"


    // $ANTLR start "rule__UnoOlypique__Group__15__Impl"
    // InternalUnoText.g:2077:1: rule__UnoOlypique__Group__15__Impl : ( ( rule__UnoOlypique__ValeurCarteAssignment_15 ) ) ;
    public final void rule__UnoOlypique__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2081:1: ( ( ( rule__UnoOlypique__ValeurCarteAssignment_15 ) ) )
            // InternalUnoText.g:2082:1: ( ( rule__UnoOlypique__ValeurCarteAssignment_15 ) )
            {
            // InternalUnoText.g:2082:1: ( ( rule__UnoOlypique__ValeurCarteAssignment_15 ) )
            // InternalUnoText.g:2083:2: ( rule__UnoOlypique__ValeurCarteAssignment_15 )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getValeurCarteAssignment_15()); 
            // InternalUnoText.g:2084:2: ( rule__UnoOlypique__ValeurCarteAssignment_15 )
            // InternalUnoText.g:2084:3: rule__UnoOlypique__ValeurCarteAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__UnoOlypique__ValeurCarteAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getUnoOlypiqueAccess().getValeurCarteAssignment_15()); 

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
    // $ANTLR end "rule__UnoOlypique__Group__15__Impl"


    // $ANTLR start "rule__UnoWizz__Group__0"
    // InternalUnoText.g:2093:1: rule__UnoWizz__Group__0 : rule__UnoWizz__Group__0__Impl rule__UnoWizz__Group__1 ;
    public final void rule__UnoWizz__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2097:1: ( rule__UnoWizz__Group__0__Impl rule__UnoWizz__Group__1 )
            // InternalUnoText.g:2098:2: rule__UnoWizz__Group__0__Impl rule__UnoWizz__Group__1
            {
            pushFollow(FOLLOW_63);
            rule__UnoWizz__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoWizz__Group__1();

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
    // $ANTLR end "rule__UnoWizz__Group__0"


    // $ANTLR start "rule__UnoWizz__Group__0__Impl"
    // InternalUnoText.g:2105:1: rule__UnoWizz__Group__0__Impl : ( ( ( 'UnoWizz : ' ) ) ( ( 'UnoWizz : ' )* ) ) ;
    public final void rule__UnoWizz__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2109:1: ( ( ( ( 'UnoWizz : ' ) ) ( ( 'UnoWizz : ' )* ) ) )
            // InternalUnoText.g:2110:1: ( ( ( 'UnoWizz : ' ) ) ( ( 'UnoWizz : ' )* ) )
            {
            // InternalUnoText.g:2110:1: ( ( ( 'UnoWizz : ' ) ) ( ( 'UnoWizz : ' )* ) )
            // InternalUnoText.g:2111:2: ( ( 'UnoWizz : ' ) ) ( ( 'UnoWizz : ' )* )
            {
            // InternalUnoText.g:2111:2: ( ( 'UnoWizz : ' ) )
            // InternalUnoText.g:2112:3: ( 'UnoWizz : ' )
            {
             before(grammarAccess.getUnoWizzAccess().getUnoWizzKeyword_0()); 
            // InternalUnoText.g:2113:3: ( 'UnoWizz : ' )
            // InternalUnoText.g:2113:4: 'UnoWizz : '
            {
            match(input,37,FOLLOW_64); 

            }

             after(grammarAccess.getUnoWizzAccess().getUnoWizzKeyword_0()); 

            }

            // InternalUnoText.g:2116:2: ( ( 'UnoWizz : ' )* )
            // InternalUnoText.g:2117:3: ( 'UnoWizz : ' )*
            {
             before(grammarAccess.getUnoWizzAccess().getUnoWizzKeyword_0()); 
            // InternalUnoText.g:2118:3: ( 'UnoWizz : ' )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==37) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalUnoText.g:2118:4: 'UnoWizz : '
            	    {
            	    match(input,37,FOLLOW_64); 

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getUnoWizzAccess().getUnoWizzKeyword_0()); 

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
    // $ANTLR end "rule__UnoWizz__Group__0__Impl"


    // $ANTLR start "rule__UnoWizz__Group__1"
    // InternalUnoText.g:2127:1: rule__UnoWizz__Group__1 : rule__UnoWizz__Group__1__Impl rule__UnoWizz__Group__2 ;
    public final void rule__UnoWizz__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2131:1: ( rule__UnoWizz__Group__1__Impl rule__UnoWizz__Group__2 )
            // InternalUnoText.g:2132:2: rule__UnoWizz__Group__1__Impl rule__UnoWizz__Group__2
            {
            pushFollow(FOLLOW_65);
            rule__UnoWizz__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoWizz__Group__2();

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
    // $ANTLR end "rule__UnoWizz__Group__1"


    // $ANTLR start "rule__UnoWizz__Group__1__Impl"
    // InternalUnoText.g:2139:1: rule__UnoWizz__Group__1__Impl : ( ( ( rule__UnoWizz__PresquUnoAssignment_1 ) ) ( ( rule__UnoWizz__PresquUnoAssignment_1 )* ) ) ;
    public final void rule__UnoWizz__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2143:1: ( ( ( ( rule__UnoWizz__PresquUnoAssignment_1 ) ) ( ( rule__UnoWizz__PresquUnoAssignment_1 )* ) ) )
            // InternalUnoText.g:2144:1: ( ( ( rule__UnoWizz__PresquUnoAssignment_1 ) ) ( ( rule__UnoWizz__PresquUnoAssignment_1 )* ) )
            {
            // InternalUnoText.g:2144:1: ( ( ( rule__UnoWizz__PresquUnoAssignment_1 ) ) ( ( rule__UnoWizz__PresquUnoAssignment_1 )* ) )
            // InternalUnoText.g:2145:2: ( ( rule__UnoWizz__PresquUnoAssignment_1 ) ) ( ( rule__UnoWizz__PresquUnoAssignment_1 )* )
            {
            // InternalUnoText.g:2145:2: ( ( rule__UnoWizz__PresquUnoAssignment_1 ) )
            // InternalUnoText.g:2146:3: ( rule__UnoWizz__PresquUnoAssignment_1 )
            {
             before(grammarAccess.getUnoWizzAccess().getPresquUnoAssignment_1()); 
            // InternalUnoText.g:2147:3: ( rule__UnoWizz__PresquUnoAssignment_1 )
            // InternalUnoText.g:2147:4: rule__UnoWizz__PresquUnoAssignment_1
            {
            pushFollow(FOLLOW_66);
            rule__UnoWizz__PresquUnoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnoWizzAccess().getPresquUnoAssignment_1()); 

            }

            // InternalUnoText.g:2150:2: ( ( rule__UnoWizz__PresquUnoAssignment_1 )* )
            // InternalUnoText.g:2151:3: ( rule__UnoWizz__PresquUnoAssignment_1 )*
            {
             before(grammarAccess.getUnoWizzAccess().getPresquUnoAssignment_1()); 
            // InternalUnoText.g:2152:3: ( rule__UnoWizz__PresquUnoAssignment_1 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==76) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalUnoText.g:2152:4: rule__UnoWizz__PresquUnoAssignment_1
            	    {
            	    pushFollow(FOLLOW_66);
            	    rule__UnoWizz__PresquUnoAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getUnoWizzAccess().getPresquUnoAssignment_1()); 

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
    // $ANTLR end "rule__UnoWizz__Group__1__Impl"


    // $ANTLR start "rule__UnoWizz__Group__2"
    // InternalUnoText.g:2161:1: rule__UnoWizz__Group__2 : rule__UnoWizz__Group__2__Impl rule__UnoWizz__Group__3 ;
    public final void rule__UnoWizz__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2165:1: ( rule__UnoWizz__Group__2__Impl rule__UnoWizz__Group__3 )
            // InternalUnoText.g:2166:2: rule__UnoWizz__Group__2__Impl rule__UnoWizz__Group__3
            {
            pushFollow(FOLLOW_67);
            rule__UnoWizz__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoWizz__Group__3();

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
    // $ANTLR end "rule__UnoWizz__Group__2"


    // $ANTLR start "rule__UnoWizz__Group__2__Impl"
    // InternalUnoText.g:2173:1: rule__UnoWizz__Group__2__Impl : ( ( ( rule__UnoWizz__ChiffreMoinsAssignment_2 ) ) ( ( rule__UnoWizz__ChiffreMoinsAssignment_2 )* ) ) ;
    public final void rule__UnoWizz__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2177:1: ( ( ( ( rule__UnoWizz__ChiffreMoinsAssignment_2 ) ) ( ( rule__UnoWizz__ChiffreMoinsAssignment_2 )* ) ) )
            // InternalUnoText.g:2178:1: ( ( ( rule__UnoWizz__ChiffreMoinsAssignment_2 ) ) ( ( rule__UnoWizz__ChiffreMoinsAssignment_2 )* ) )
            {
            // InternalUnoText.g:2178:1: ( ( ( rule__UnoWizz__ChiffreMoinsAssignment_2 ) ) ( ( rule__UnoWizz__ChiffreMoinsAssignment_2 )* ) )
            // InternalUnoText.g:2179:2: ( ( rule__UnoWizz__ChiffreMoinsAssignment_2 ) ) ( ( rule__UnoWizz__ChiffreMoinsAssignment_2 )* )
            {
            // InternalUnoText.g:2179:2: ( ( rule__UnoWizz__ChiffreMoinsAssignment_2 ) )
            // InternalUnoText.g:2180:3: ( rule__UnoWizz__ChiffreMoinsAssignment_2 )
            {
             before(grammarAccess.getUnoWizzAccess().getChiffreMoinsAssignment_2()); 
            // InternalUnoText.g:2181:3: ( rule__UnoWizz__ChiffreMoinsAssignment_2 )
            // InternalUnoText.g:2181:4: rule__UnoWizz__ChiffreMoinsAssignment_2
            {
            pushFollow(FOLLOW_68);
            rule__UnoWizz__ChiffreMoinsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnoWizzAccess().getChiffreMoinsAssignment_2()); 

            }

            // InternalUnoText.g:2184:2: ( ( rule__UnoWizz__ChiffreMoinsAssignment_2 )* )
            // InternalUnoText.g:2185:3: ( rule__UnoWizz__ChiffreMoinsAssignment_2 )*
            {
             before(grammarAccess.getUnoWizzAccess().getChiffreMoinsAssignment_2()); 
            // InternalUnoText.g:2186:3: ( rule__UnoWizz__ChiffreMoinsAssignment_2 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==77) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalUnoText.g:2186:4: rule__UnoWizz__ChiffreMoinsAssignment_2
            	    {
            	    pushFollow(FOLLOW_68);
            	    rule__UnoWizz__ChiffreMoinsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getUnoWizzAccess().getChiffreMoinsAssignment_2()); 

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
    // $ANTLR end "rule__UnoWizz__Group__2__Impl"


    // $ANTLR start "rule__UnoWizz__Group__3"
    // InternalUnoText.g:2195:1: rule__UnoWizz__Group__3 : rule__UnoWizz__Group__3__Impl rule__UnoWizz__Group__4 ;
    public final void rule__UnoWizz__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2199:1: ( rule__UnoWizz__Group__3__Impl rule__UnoWizz__Group__4 )
            // InternalUnoText.g:2200:2: rule__UnoWizz__Group__3__Impl rule__UnoWizz__Group__4
            {
            pushFollow(FOLLOW_69);
            rule__UnoWizz__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoWizz__Group__4();

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
    // $ANTLR end "rule__UnoWizz__Group__3"


    // $ANTLR start "rule__UnoWizz__Group__3__Impl"
    // InternalUnoText.g:2207:1: rule__UnoWizz__Group__3__Impl : ( ( ( rule__UnoWizz__CouleurMoinsAssignment_3 ) ) ( ( rule__UnoWizz__CouleurMoinsAssignment_3 )* ) ) ;
    public final void rule__UnoWizz__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2211:1: ( ( ( ( rule__UnoWizz__CouleurMoinsAssignment_3 ) ) ( ( rule__UnoWizz__CouleurMoinsAssignment_3 )* ) ) )
            // InternalUnoText.g:2212:1: ( ( ( rule__UnoWizz__CouleurMoinsAssignment_3 ) ) ( ( rule__UnoWizz__CouleurMoinsAssignment_3 )* ) )
            {
            // InternalUnoText.g:2212:1: ( ( ( rule__UnoWizz__CouleurMoinsAssignment_3 ) ) ( ( rule__UnoWizz__CouleurMoinsAssignment_3 )* ) )
            // InternalUnoText.g:2213:2: ( ( rule__UnoWizz__CouleurMoinsAssignment_3 ) ) ( ( rule__UnoWizz__CouleurMoinsAssignment_3 )* )
            {
            // InternalUnoText.g:2213:2: ( ( rule__UnoWizz__CouleurMoinsAssignment_3 ) )
            // InternalUnoText.g:2214:3: ( rule__UnoWizz__CouleurMoinsAssignment_3 )
            {
             before(grammarAccess.getUnoWizzAccess().getCouleurMoinsAssignment_3()); 
            // InternalUnoText.g:2215:3: ( rule__UnoWizz__CouleurMoinsAssignment_3 )
            // InternalUnoText.g:2215:4: rule__UnoWizz__CouleurMoinsAssignment_3
            {
            pushFollow(FOLLOW_70);
            rule__UnoWizz__CouleurMoinsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUnoWizzAccess().getCouleurMoinsAssignment_3()); 

            }

            // InternalUnoText.g:2218:2: ( ( rule__UnoWizz__CouleurMoinsAssignment_3 )* )
            // InternalUnoText.g:2219:3: ( rule__UnoWizz__CouleurMoinsAssignment_3 )*
            {
             before(grammarAccess.getUnoWizzAccess().getCouleurMoinsAssignment_3()); 
            // InternalUnoText.g:2220:3: ( rule__UnoWizz__CouleurMoinsAssignment_3 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==78) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalUnoText.g:2220:4: rule__UnoWizz__CouleurMoinsAssignment_3
            	    {
            	    pushFollow(FOLLOW_70);
            	    rule__UnoWizz__CouleurMoinsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getUnoWizzAccess().getCouleurMoinsAssignment_3()); 

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
    // $ANTLR end "rule__UnoWizz__Group__3__Impl"


    // $ANTLR start "rule__UnoWizz__Group__4"
    // InternalUnoText.g:2229:1: rule__UnoWizz__Group__4 : rule__UnoWizz__Group__4__Impl rule__UnoWizz__Group__5 ;
    public final void rule__UnoWizz__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2233:1: ( rule__UnoWizz__Group__4__Impl rule__UnoWizz__Group__5 )
            // InternalUnoText.g:2234:2: rule__UnoWizz__Group__4__Impl rule__UnoWizz__Group__5
            {
            pushFollow(FOLLOW_71);
            rule__UnoWizz__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoWizz__Group__5();

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
    // $ANTLR end "rule__UnoWizz__Group__4"


    // $ANTLR start "rule__UnoWizz__Group__4__Impl"
    // InternalUnoText.g:2241:1: rule__UnoWizz__Group__4__Impl : ( ( ( rule__UnoWizz__CarteRougeAssignment_4 ) ) ( ( rule__UnoWizz__CarteRougeAssignment_4 )* ) ) ;
    public final void rule__UnoWizz__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2245:1: ( ( ( ( rule__UnoWizz__CarteRougeAssignment_4 ) ) ( ( rule__UnoWizz__CarteRougeAssignment_4 )* ) ) )
            // InternalUnoText.g:2246:1: ( ( ( rule__UnoWizz__CarteRougeAssignment_4 ) ) ( ( rule__UnoWizz__CarteRougeAssignment_4 )* ) )
            {
            // InternalUnoText.g:2246:1: ( ( ( rule__UnoWizz__CarteRougeAssignment_4 ) ) ( ( rule__UnoWizz__CarteRougeAssignment_4 )* ) )
            // InternalUnoText.g:2247:2: ( ( rule__UnoWizz__CarteRougeAssignment_4 ) ) ( ( rule__UnoWizz__CarteRougeAssignment_4 )* )
            {
            // InternalUnoText.g:2247:2: ( ( rule__UnoWizz__CarteRougeAssignment_4 ) )
            // InternalUnoText.g:2248:3: ( rule__UnoWizz__CarteRougeAssignment_4 )
            {
             before(grammarAccess.getUnoWizzAccess().getCarteRougeAssignment_4()); 
            // InternalUnoText.g:2249:3: ( rule__UnoWizz__CarteRougeAssignment_4 )
            // InternalUnoText.g:2249:4: rule__UnoWizz__CarteRougeAssignment_4
            {
            pushFollow(FOLLOW_72);
            rule__UnoWizz__CarteRougeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUnoWizzAccess().getCarteRougeAssignment_4()); 

            }

            // InternalUnoText.g:2252:2: ( ( rule__UnoWizz__CarteRougeAssignment_4 )* )
            // InternalUnoText.g:2253:3: ( rule__UnoWizz__CarteRougeAssignment_4 )*
            {
             before(grammarAccess.getUnoWizzAccess().getCarteRougeAssignment_4()); 
            // InternalUnoText.g:2254:3: ( rule__UnoWizz__CarteRougeAssignment_4 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==79) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalUnoText.g:2254:4: rule__UnoWizz__CarteRougeAssignment_4
            	    {
            	    pushFollow(FOLLOW_72);
            	    rule__UnoWizz__CarteRougeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getUnoWizzAccess().getCarteRougeAssignment_4()); 

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
    // $ANTLR end "rule__UnoWizz__Group__4__Impl"


    // $ANTLR start "rule__UnoWizz__Group__5"
    // InternalUnoText.g:2263:1: rule__UnoWizz__Group__5 : rule__UnoWizz__Group__5__Impl rule__UnoWizz__Group__6 ;
    public final void rule__UnoWizz__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2267:1: ( rule__UnoWizz__Group__5__Impl rule__UnoWizz__Group__6 )
            // InternalUnoText.g:2268:2: rule__UnoWizz__Group__5__Impl rule__UnoWizz__Group__6
            {
            pushFollow(FOLLOW_73);
            rule__UnoWizz__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoWizz__Group__6();

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
    // $ANTLR end "rule__UnoWizz__Group__5"


    // $ANTLR start "rule__UnoWizz__Group__5__Impl"
    // InternalUnoText.g:2275:1: rule__UnoWizz__Group__5__Impl : ( ( ( 'carteBleue' ) ) ( ( 'carteBleue' )* ) ) ;
    public final void rule__UnoWizz__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2279:1: ( ( ( ( 'carteBleue' ) ) ( ( 'carteBleue' )* ) ) )
            // InternalUnoText.g:2280:1: ( ( ( 'carteBleue' ) ) ( ( 'carteBleue' )* ) )
            {
            // InternalUnoText.g:2280:1: ( ( ( 'carteBleue' ) ) ( ( 'carteBleue' )* ) )
            // InternalUnoText.g:2281:2: ( ( 'carteBleue' ) ) ( ( 'carteBleue' )* )
            {
            // InternalUnoText.g:2281:2: ( ( 'carteBleue' ) )
            // InternalUnoText.g:2282:3: ( 'carteBleue' )
            {
             before(grammarAccess.getUnoWizzAccess().getCarteBleueKeyword_5()); 
            // InternalUnoText.g:2283:3: ( 'carteBleue' )
            // InternalUnoText.g:2283:4: 'carteBleue'
            {
            match(input,38,FOLLOW_74); 

            }

             after(grammarAccess.getUnoWizzAccess().getCarteBleueKeyword_5()); 

            }

            // InternalUnoText.g:2286:2: ( ( 'carteBleue' )* )
            // InternalUnoText.g:2287:3: ( 'carteBleue' )*
            {
             before(grammarAccess.getUnoWizzAccess().getCarteBleueKeyword_5()); 
            // InternalUnoText.g:2288:3: ( 'carteBleue' )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==38) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalUnoText.g:2288:4: 'carteBleue'
            	    {
            	    match(input,38,FOLLOW_74); 

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getUnoWizzAccess().getCarteBleueKeyword_5()); 

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
    // $ANTLR end "rule__UnoWizz__Group__5__Impl"


    // $ANTLR start "rule__UnoWizz__Group__6"
    // InternalUnoText.g:2297:1: rule__UnoWizz__Group__6 : rule__UnoWizz__Group__6__Impl rule__UnoWizz__Group__7 ;
    public final void rule__UnoWizz__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2301:1: ( rule__UnoWizz__Group__6__Impl rule__UnoWizz__Group__7 )
            // InternalUnoText.g:2302:2: rule__UnoWizz__Group__6__Impl rule__UnoWizz__Group__7
            {
            pushFollow(FOLLOW_75);
            rule__UnoWizz__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoWizz__Group__7();

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
    // $ANTLR end "rule__UnoWizz__Group__6"


    // $ANTLR start "rule__UnoWizz__Group__6__Impl"
    // InternalUnoText.g:2309:1: rule__UnoWizz__Group__6__Impl : ( ( ( 'echange' ) ) ( ( 'echange' )* ) ) ;
    public final void rule__UnoWizz__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2313:1: ( ( ( ( 'echange' ) ) ( ( 'echange' )* ) ) )
            // InternalUnoText.g:2314:1: ( ( ( 'echange' ) ) ( ( 'echange' )* ) )
            {
            // InternalUnoText.g:2314:1: ( ( ( 'echange' ) ) ( ( 'echange' )* ) )
            // InternalUnoText.g:2315:2: ( ( 'echange' ) ) ( ( 'echange' )* )
            {
            // InternalUnoText.g:2315:2: ( ( 'echange' ) )
            // InternalUnoText.g:2316:3: ( 'echange' )
            {
             before(grammarAccess.getUnoWizzAccess().getEchangeKeyword_6()); 
            // InternalUnoText.g:2317:3: ( 'echange' )
            // InternalUnoText.g:2317:4: 'echange'
            {
            match(input,39,FOLLOW_76); 

            }

             after(grammarAccess.getUnoWizzAccess().getEchangeKeyword_6()); 

            }

            // InternalUnoText.g:2320:2: ( ( 'echange' )* )
            // InternalUnoText.g:2321:3: ( 'echange' )*
            {
             before(grammarAccess.getUnoWizzAccess().getEchangeKeyword_6()); 
            // InternalUnoText.g:2322:3: ( 'echange' )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==39) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalUnoText.g:2322:4: 'echange'
            	    {
            	    match(input,39,FOLLOW_76); 

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getUnoWizzAccess().getEchangeKeyword_6()); 

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
    // $ANTLR end "rule__UnoWizz__Group__6__Impl"


    // $ANTLR start "rule__UnoWizz__Group__7"
    // InternalUnoText.g:2331:1: rule__UnoWizz__Group__7 : rule__UnoWizz__Group__7__Impl rule__UnoWizz__Group__8 ;
    public final void rule__UnoWizz__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2335:1: ( rule__UnoWizz__Group__7__Impl rule__UnoWizz__Group__8 )
            // InternalUnoText.g:2336:2: rule__UnoWizz__Group__7__Impl rule__UnoWizz__Group__8
            {
            pushFollow(FOLLOW_77);
            rule__UnoWizz__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoWizz__Group__8();

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
    // $ANTLR end "rule__UnoWizz__Group__7"


    // $ANTLR start "rule__UnoWizz__Group__7__Impl"
    // InternalUnoText.g:2343:1: rule__UnoWizz__Group__7__Impl : ( ( ( 'mainVisible' ) ) ( ( 'mainVisible' )* ) ) ;
    public final void rule__UnoWizz__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2347:1: ( ( ( ( 'mainVisible' ) ) ( ( 'mainVisible' )* ) ) )
            // InternalUnoText.g:2348:1: ( ( ( 'mainVisible' ) ) ( ( 'mainVisible' )* ) )
            {
            // InternalUnoText.g:2348:1: ( ( ( 'mainVisible' ) ) ( ( 'mainVisible' )* ) )
            // InternalUnoText.g:2349:2: ( ( 'mainVisible' ) ) ( ( 'mainVisible' )* )
            {
            // InternalUnoText.g:2349:2: ( ( 'mainVisible' ) )
            // InternalUnoText.g:2350:3: ( 'mainVisible' )
            {
             before(grammarAccess.getUnoWizzAccess().getMainVisibleKeyword_7()); 
            // InternalUnoText.g:2351:3: ( 'mainVisible' )
            // InternalUnoText.g:2351:4: 'mainVisible'
            {
            match(input,40,FOLLOW_78); 

            }

             after(grammarAccess.getUnoWizzAccess().getMainVisibleKeyword_7()); 

            }

            // InternalUnoText.g:2354:2: ( ( 'mainVisible' )* )
            // InternalUnoText.g:2355:3: ( 'mainVisible' )*
            {
             before(grammarAccess.getUnoWizzAccess().getMainVisibleKeyword_7()); 
            // InternalUnoText.g:2356:3: ( 'mainVisible' )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==40) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalUnoText.g:2356:4: 'mainVisible'
            	    {
            	    match(input,40,FOLLOW_78); 

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getUnoWizzAccess().getMainVisibleKeyword_7()); 

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
    // $ANTLR end "rule__UnoWizz__Group__7__Impl"


    // $ANTLR start "rule__UnoWizz__Group__8"
    // InternalUnoText.g:2365:1: rule__UnoWizz__Group__8 : rule__UnoWizz__Group__8__Impl rule__UnoWizz__Group__9 ;
    public final void rule__UnoWizz__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2369:1: ( rule__UnoWizz__Group__8__Impl rule__UnoWizz__Group__9 )
            // InternalUnoText.g:2370:2: rule__UnoWizz__Group__8__Impl rule__UnoWizz__Group__9
            {
            pushFollow(FOLLOW_79);
            rule__UnoWizz__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoWizz__Group__9();

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
    // $ANTLR end "rule__UnoWizz__Group__8"


    // $ANTLR start "rule__UnoWizz__Group__8__Impl"
    // InternalUnoText.g:2377:1: rule__UnoWizz__Group__8__Impl : ( ( ( 'unoWizz' ) ) ( ( 'unoWizz' )* ) ) ;
    public final void rule__UnoWizz__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2381:1: ( ( ( ( 'unoWizz' ) ) ( ( 'unoWizz' )* ) ) )
            // InternalUnoText.g:2382:1: ( ( ( 'unoWizz' ) ) ( ( 'unoWizz' )* ) )
            {
            // InternalUnoText.g:2382:1: ( ( ( 'unoWizz' ) ) ( ( 'unoWizz' )* ) )
            // InternalUnoText.g:2383:2: ( ( 'unoWizz' ) ) ( ( 'unoWizz' )* )
            {
            // InternalUnoText.g:2383:2: ( ( 'unoWizz' ) )
            // InternalUnoText.g:2384:3: ( 'unoWizz' )
            {
             before(grammarAccess.getUnoWizzAccess().getUnoWizzKeyword_8()); 
            // InternalUnoText.g:2385:3: ( 'unoWizz' )
            // InternalUnoText.g:2385:4: 'unoWizz'
            {
            match(input,41,FOLLOW_80); 

            }

             after(grammarAccess.getUnoWizzAccess().getUnoWizzKeyword_8()); 

            }

            // InternalUnoText.g:2388:2: ( ( 'unoWizz' )* )
            // InternalUnoText.g:2389:3: ( 'unoWizz' )*
            {
             before(grammarAccess.getUnoWizzAccess().getUnoWizzKeyword_8()); 
            // InternalUnoText.g:2390:3: ( 'unoWizz' )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==41) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalUnoText.g:2390:4: 'unoWizz'
            	    {
            	    match(input,41,FOLLOW_80); 

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getUnoWizzAccess().getUnoWizzKeyword_8()); 

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
    // $ANTLR end "rule__UnoWizz__Group__8__Impl"


    // $ANTLR start "rule__UnoWizz__Group__9"
    // InternalUnoText.g:2399:1: rule__UnoWizz__Group__9 : rule__UnoWizz__Group__9__Impl ;
    public final void rule__UnoWizz__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2403:1: ( rule__UnoWizz__Group__9__Impl )
            // InternalUnoText.g:2404:2: rule__UnoWizz__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnoWizz__Group__9__Impl();

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
    // $ANTLR end "rule__UnoWizz__Group__9"


    // $ANTLR start "rule__UnoWizz__Group__9__Impl"
    // InternalUnoText.g:2410:1: rule__UnoWizz__Group__9__Impl : ( 'War' ) ;
    public final void rule__UnoWizz__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2414:1: ( ( 'War' ) )
            // InternalUnoText.g:2415:1: ( 'War' )
            {
            // InternalUnoText.g:2415:1: ( 'War' )
            // InternalUnoText.g:2416:2: 'War'
            {
             before(grammarAccess.getUnoWizzAccess().getWarKeyword_9()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getUnoWizzAccess().getWarKeyword_9()); 

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
    // $ANTLR end "rule__UnoWizz__Group__9__Impl"


    // $ANTLR start "rule__UnoRapido__Group__0"
    // InternalUnoText.g:2426:1: rule__UnoRapido__Group__0 : rule__UnoRapido__Group__0__Impl rule__UnoRapido__Group__1 ;
    public final void rule__UnoRapido__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2430:1: ( rule__UnoRapido__Group__0__Impl rule__UnoRapido__Group__1 )
            // InternalUnoText.g:2431:2: rule__UnoRapido__Group__0__Impl rule__UnoRapido__Group__1
            {
            pushFollow(FOLLOW_81);
            rule__UnoRapido__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoRapido__Group__1();

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
    // $ANTLR end "rule__UnoRapido__Group__0"


    // $ANTLR start "rule__UnoRapido__Group__0__Impl"
    // InternalUnoText.g:2438:1: rule__UnoRapido__Group__0__Impl : ( ( ( 'UnoRapido' ) ) ( ( 'UnoRapido' )* ) ) ;
    public final void rule__UnoRapido__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2442:1: ( ( ( ( 'UnoRapido' ) ) ( ( 'UnoRapido' )* ) ) )
            // InternalUnoText.g:2443:1: ( ( ( 'UnoRapido' ) ) ( ( 'UnoRapido' )* ) )
            {
            // InternalUnoText.g:2443:1: ( ( ( 'UnoRapido' ) ) ( ( 'UnoRapido' )* ) )
            // InternalUnoText.g:2444:2: ( ( 'UnoRapido' ) ) ( ( 'UnoRapido' )* )
            {
            // InternalUnoText.g:2444:2: ( ( 'UnoRapido' ) )
            // InternalUnoText.g:2445:3: ( 'UnoRapido' )
            {
             before(grammarAccess.getUnoRapidoAccess().getUnoRapidoKeyword_0()); 
            // InternalUnoText.g:2446:3: ( 'UnoRapido' )
            // InternalUnoText.g:2446:4: 'UnoRapido'
            {
            match(input,43,FOLLOW_82); 

            }

             after(grammarAccess.getUnoRapidoAccess().getUnoRapidoKeyword_0()); 

            }

            // InternalUnoText.g:2449:2: ( ( 'UnoRapido' )* )
            // InternalUnoText.g:2450:3: ( 'UnoRapido' )*
            {
             before(grammarAccess.getUnoRapidoAccess().getUnoRapidoKeyword_0()); 
            // InternalUnoText.g:2451:3: ( 'UnoRapido' )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==43) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalUnoText.g:2451:4: 'UnoRapido'
            	    {
            	    match(input,43,FOLLOW_82); 

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getUnoRapidoAccess().getUnoRapidoKeyword_0()); 

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
    // $ANTLR end "rule__UnoRapido__Group__0__Impl"


    // $ANTLR start "rule__UnoRapido__Group__1"
    // InternalUnoText.g:2460:1: rule__UnoRapido__Group__1 : rule__UnoRapido__Group__1__Impl rule__UnoRapido__Group__2 ;
    public final void rule__UnoRapido__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2464:1: ( rule__UnoRapido__Group__1__Impl rule__UnoRapido__Group__2 )
            // InternalUnoText.g:2465:2: rule__UnoRapido__Group__1__Impl rule__UnoRapido__Group__2
            {
            pushFollow(FOLLOW_83);
            rule__UnoRapido__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoRapido__Group__2();

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
    // $ANTLR end "rule__UnoRapido__Group__1"


    // $ANTLR start "rule__UnoRapido__Group__1__Impl"
    // InternalUnoText.g:2472:1: rule__UnoRapido__Group__1__Impl : ( ( ( 'Pioche' ) ) ( ( 'Pioche' )* ) ) ;
    public final void rule__UnoRapido__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2476:1: ( ( ( ( 'Pioche' ) ) ( ( 'Pioche' )* ) ) )
            // InternalUnoText.g:2477:1: ( ( ( 'Pioche' ) ) ( ( 'Pioche' )* ) )
            {
            // InternalUnoText.g:2477:1: ( ( ( 'Pioche' ) ) ( ( 'Pioche' )* ) )
            // InternalUnoText.g:2478:2: ( ( 'Pioche' ) ) ( ( 'Pioche' )* )
            {
            // InternalUnoText.g:2478:2: ( ( 'Pioche' ) )
            // InternalUnoText.g:2479:3: ( 'Pioche' )
            {
             before(grammarAccess.getUnoRapidoAccess().getPiocheKeyword_1()); 
            // InternalUnoText.g:2480:3: ( 'Pioche' )
            // InternalUnoText.g:2480:4: 'Pioche'
            {
            match(input,44,FOLLOW_14); 

            }

             after(grammarAccess.getUnoRapidoAccess().getPiocheKeyword_1()); 

            }

            // InternalUnoText.g:2483:2: ( ( 'Pioche' )* )
            // InternalUnoText.g:2484:3: ( 'Pioche' )*
            {
             before(grammarAccess.getUnoRapidoAccess().getPiocheKeyword_1()); 
            // InternalUnoText.g:2485:3: ( 'Pioche' )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==44) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalUnoText.g:2485:4: 'Pioche'
            	    {
            	    match(input,44,FOLLOW_14); 

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getUnoRapidoAccess().getPiocheKeyword_1()); 

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
    // $ANTLR end "rule__UnoRapido__Group__1__Impl"


    // $ANTLR start "rule__UnoRapido__Group__2"
    // InternalUnoText.g:2494:1: rule__UnoRapido__Group__2 : rule__UnoRapido__Group__2__Impl rule__UnoRapido__Group__3 ;
    public final void rule__UnoRapido__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2498:1: ( rule__UnoRapido__Group__2__Impl rule__UnoRapido__Group__3 )
            // InternalUnoText.g:2499:2: rule__UnoRapido__Group__2__Impl rule__UnoRapido__Group__3
            {
            pushFollow(FOLLOW_84);
            rule__UnoRapido__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoRapido__Group__3();

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
    // $ANTLR end "rule__UnoRapido__Group__2"


    // $ANTLR start "rule__UnoRapido__Group__2__Impl"
    // InternalUnoText.g:2506:1: rule__UnoRapido__Group__2__Impl : ( ( ( 'Confusion' ) ) ( ( 'Confusion' )* ) ) ;
    public final void rule__UnoRapido__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2510:1: ( ( ( ( 'Confusion' ) ) ( ( 'Confusion' )* ) ) )
            // InternalUnoText.g:2511:1: ( ( ( 'Confusion' ) ) ( ( 'Confusion' )* ) )
            {
            // InternalUnoText.g:2511:1: ( ( ( 'Confusion' ) ) ( ( 'Confusion' )* ) )
            // InternalUnoText.g:2512:2: ( ( 'Confusion' ) ) ( ( 'Confusion' )* )
            {
            // InternalUnoText.g:2512:2: ( ( 'Confusion' ) )
            // InternalUnoText.g:2513:3: ( 'Confusion' )
            {
             before(grammarAccess.getUnoRapidoAccess().getConfusionKeyword_2()); 
            // InternalUnoText.g:2514:3: ( 'Confusion' )
            // InternalUnoText.g:2514:4: 'Confusion'
            {
            match(input,45,FOLLOW_85); 

            }

             after(grammarAccess.getUnoRapidoAccess().getConfusionKeyword_2()); 

            }

            // InternalUnoText.g:2517:2: ( ( 'Confusion' )* )
            // InternalUnoText.g:2518:3: ( 'Confusion' )*
            {
             before(grammarAccess.getUnoRapidoAccess().getConfusionKeyword_2()); 
            // InternalUnoText.g:2519:3: ( 'Confusion' )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==45) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalUnoText.g:2519:4: 'Confusion'
            	    {
            	    match(input,45,FOLLOW_85); 

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getUnoRapidoAccess().getConfusionKeyword_2()); 

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
    // $ANTLR end "rule__UnoRapido__Group__2__Impl"


    // $ANTLR start "rule__UnoRapido__Group__3"
    // InternalUnoText.g:2528:1: rule__UnoRapido__Group__3 : rule__UnoRapido__Group__3__Impl rule__UnoRapido__Group__4 ;
    public final void rule__UnoRapido__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2532:1: ( rule__UnoRapido__Group__3__Impl rule__UnoRapido__Group__4 )
            // InternalUnoText.g:2533:2: rule__UnoRapido__Group__3__Impl rule__UnoRapido__Group__4
            {
            pushFollow(FOLLOW_86);
            rule__UnoRapido__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoRapido__Group__4();

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
    // $ANTLR end "rule__UnoRapido__Group__3"


    // $ANTLR start "rule__UnoRapido__Group__3__Impl"
    // InternalUnoText.g:2540:1: rule__UnoRapido__Group__3__Impl : ( ( ( 'Defense' ) ) ( ( 'Defense' )* ) ) ;
    public final void rule__UnoRapido__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2544:1: ( ( ( ( 'Defense' ) ) ( ( 'Defense' )* ) ) )
            // InternalUnoText.g:2545:1: ( ( ( 'Defense' ) ) ( ( 'Defense' )* ) )
            {
            // InternalUnoText.g:2545:1: ( ( ( 'Defense' ) ) ( ( 'Defense' )* ) )
            // InternalUnoText.g:2546:2: ( ( 'Defense' ) ) ( ( 'Defense' )* )
            {
            // InternalUnoText.g:2546:2: ( ( 'Defense' ) )
            // InternalUnoText.g:2547:3: ( 'Defense' )
            {
             before(grammarAccess.getUnoRapidoAccess().getDefenseKeyword_3()); 
            // InternalUnoText.g:2548:3: ( 'Defense' )
            // InternalUnoText.g:2548:4: 'Defense'
            {
            match(input,46,FOLLOW_87); 

            }

             after(grammarAccess.getUnoRapidoAccess().getDefenseKeyword_3()); 

            }

            // InternalUnoText.g:2551:2: ( ( 'Defense' )* )
            // InternalUnoText.g:2552:3: ( 'Defense' )*
            {
             before(grammarAccess.getUnoRapidoAccess().getDefenseKeyword_3()); 
            // InternalUnoText.g:2553:3: ( 'Defense' )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==46) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalUnoText.g:2553:4: 'Defense'
            	    {
            	    match(input,46,FOLLOW_87); 

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

             after(grammarAccess.getUnoRapidoAccess().getDefenseKeyword_3()); 

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
    // $ANTLR end "rule__UnoRapido__Group__3__Impl"


    // $ANTLR start "rule__UnoRapido__Group__4"
    // InternalUnoText.g:2562:1: rule__UnoRapido__Group__4 : rule__UnoRapido__Group__4__Impl rule__UnoRapido__Group__5 ;
    public final void rule__UnoRapido__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2566:1: ( rule__UnoRapido__Group__4__Impl rule__UnoRapido__Group__5 )
            // InternalUnoText.g:2567:2: rule__UnoRapido__Group__4__Impl rule__UnoRapido__Group__5
            {
            pushFollow(FOLLOW_88);
            rule__UnoRapido__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoRapido__Group__5();

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
    // $ANTLR end "rule__UnoRapido__Group__4"


    // $ANTLR start "rule__UnoRapido__Group__4__Impl"
    // InternalUnoText.g:2574:1: rule__UnoRapido__Group__4__Impl : ( ( ( 'Rapido' ) ) ( ( 'Rapido' )* ) ) ;
    public final void rule__UnoRapido__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2578:1: ( ( ( ( 'Rapido' ) ) ( ( 'Rapido' )* ) ) )
            // InternalUnoText.g:2579:1: ( ( ( 'Rapido' ) ) ( ( 'Rapido' )* ) )
            {
            // InternalUnoText.g:2579:1: ( ( ( 'Rapido' ) ) ( ( 'Rapido' )* ) )
            // InternalUnoText.g:2580:2: ( ( 'Rapido' ) ) ( ( 'Rapido' )* )
            {
            // InternalUnoText.g:2580:2: ( ( 'Rapido' ) )
            // InternalUnoText.g:2581:3: ( 'Rapido' )
            {
             before(grammarAccess.getUnoRapidoAccess().getRapidoKeyword_4()); 
            // InternalUnoText.g:2582:3: ( 'Rapido' )
            // InternalUnoText.g:2582:4: 'Rapido'
            {
            match(input,47,FOLLOW_89); 

            }

             after(grammarAccess.getUnoRapidoAccess().getRapidoKeyword_4()); 

            }

            // InternalUnoText.g:2585:2: ( ( 'Rapido' )* )
            // InternalUnoText.g:2586:3: ( 'Rapido' )*
            {
             before(grammarAccess.getUnoRapidoAccess().getRapidoKeyword_4()); 
            // InternalUnoText.g:2587:3: ( 'Rapido' )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==47) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalUnoText.g:2587:4: 'Rapido'
            	    {
            	    match(input,47,FOLLOW_89); 

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getUnoRapidoAccess().getRapidoKeyword_4()); 

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
    // $ANTLR end "rule__UnoRapido__Group__4__Impl"


    // $ANTLR start "rule__UnoRapido__Group__5"
    // InternalUnoText.g:2596:1: rule__UnoRapido__Group__5 : rule__UnoRapido__Group__5__Impl ;
    public final void rule__UnoRapido__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2600:1: ( rule__UnoRapido__Group__5__Impl )
            // InternalUnoText.g:2601:2: rule__UnoRapido__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnoRapido__Group__5__Impl();

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
    // $ANTLR end "rule__UnoRapido__Group__5"


    // $ANTLR start "rule__UnoRapido__Group__5__Impl"
    // InternalUnoText.g:2607:1: rule__UnoRapido__Group__5__Impl : ( 'CarteUno' ) ;
    public final void rule__UnoRapido__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2611:1: ( ( 'CarteUno' ) )
            // InternalUnoText.g:2612:1: ( 'CarteUno' )
            {
            // InternalUnoText.g:2612:1: ( 'CarteUno' )
            // InternalUnoText.g:2613:2: 'CarteUno'
            {
             before(grammarAccess.getUnoRapidoAccess().getCarteUnoKeyword_5()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getUnoRapidoAccess().getCarteUnoKeyword_5()); 

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
    // $ANTLR end "rule__UnoRapido__Group__5__Impl"


    // $ANTLR start "rule__Uno__UnoAssignment_0"
    // InternalUnoText.g:2623:1: rule__Uno__UnoAssignment_0 : ( ruleUno_Rule ) ;
    public final void rule__Uno__UnoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2627:1: ( ( ruleUno_Rule ) )
            // InternalUnoText.g:2628:2: ( ruleUno_Rule )
            {
            // InternalUnoText.g:2628:2: ( ruleUno_Rule )
            // InternalUnoText.g:2629:3: ruleUno_Rule
            {
             before(grammarAccess.getUnoAccess().getUnoUno_RuleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUno_Rule();

            state._fsp--;

             after(grammarAccess.getUnoAccess().getUnoUno_RuleParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Uno__UnoAssignment_0"


    // $ANTLR start "rule__Uno__NombreJoueurAssignment_1"
    // InternalUnoText.g:2638:1: rule__Uno__NombreJoueurAssignment_1 : ( ruleNombreJoueurs ) ;
    public final void rule__Uno__NombreJoueurAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2642:1: ( ( ruleNombreJoueurs ) )
            // InternalUnoText.g:2643:2: ( ruleNombreJoueurs )
            {
            // InternalUnoText.g:2643:2: ( ruleNombreJoueurs )
            // InternalUnoText.g:2644:3: ruleNombreJoueurs
            {
             before(grammarAccess.getUnoAccess().getNombreJoueurNombreJoueursParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNombreJoueurs();

            state._fsp--;

             after(grammarAccess.getUnoAccess().getNombreJoueurNombreJoueursParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Uno__NombreJoueurAssignment_1"


    // $ANTLR start "rule__Uno_Classic__UnoChallengeAssignment_1"
    // InternalUnoText.g:2653:1: rule__Uno_Classic__UnoChallengeAssignment_1 : ( ( 'UnoChallenge' ) ) ;
    public final void rule__Uno_Classic__UnoChallengeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2657:1: ( ( ( 'UnoChallenge' ) ) )
            // InternalUnoText.g:2658:2: ( ( 'UnoChallenge' ) )
            {
            // InternalUnoText.g:2658:2: ( ( 'UnoChallenge' ) )
            // InternalUnoText.g:2659:3: ( 'UnoChallenge' )
            {
             before(grammarAccess.getUno_ClassicAccess().getUnoChallengeUnoChallengeKeyword_1_0()); 
            // InternalUnoText.g:2660:3: ( 'UnoChallenge' )
            // InternalUnoText.g:2661:4: 'UnoChallenge'
            {
             before(grammarAccess.getUno_ClassicAccess().getUnoChallengeUnoChallengeKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getUno_ClassicAccess().getUnoChallengeUnoChallengeKeyword_1_0()); 

            }

             after(grammarAccess.getUno_ClassicAccess().getUnoChallengeUnoChallengeKeyword_1_0()); 

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
    // $ANTLR end "rule__Uno_Classic__UnoChallengeAssignment_1"


    // $ANTLR start "rule__Uno_Classic__Carte0_7Assignment_2"
    // InternalUnoText.g:2672:1: rule__Uno_Classic__Carte0_7Assignment_2 : ( ( 'Carte0_7' ) ) ;
    public final void rule__Uno_Classic__Carte0_7Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2676:1: ( ( ( 'Carte0_7' ) ) )
            // InternalUnoText.g:2677:2: ( ( 'Carte0_7' ) )
            {
            // InternalUnoText.g:2677:2: ( ( 'Carte0_7' ) )
            // InternalUnoText.g:2678:3: ( 'Carte0_7' )
            {
             before(grammarAccess.getUno_ClassicAccess().getCarte0_7Carte0_7Keyword_2_0()); 
            // InternalUnoText.g:2679:3: ( 'Carte0_7' )
            // InternalUnoText.g:2680:4: 'Carte0_7'
            {
             before(grammarAccess.getUno_ClassicAccess().getCarte0_7Carte0_7Keyword_2_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getUno_ClassicAccess().getCarte0_7Carte0_7Keyword_2_0()); 

            }

             after(grammarAccess.getUno_ClassicAccess().getCarte0_7Carte0_7Keyword_2_0()); 

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
    // $ANTLR end "rule__Uno_Classic__Carte0_7Assignment_2"


    // $ANTLR start "rule__Uno_Classic__CarteIdentiqueAssignment_3"
    // InternalUnoText.g:2691:1: rule__Uno_Classic__CarteIdentiqueAssignment_3 : ( ruleCarteIdentique ) ;
    public final void rule__Uno_Classic__CarteIdentiqueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2695:1: ( ( ruleCarteIdentique ) )
            // InternalUnoText.g:2696:2: ( ruleCarteIdentique )
            {
            // InternalUnoText.g:2696:2: ( ruleCarteIdentique )
            // InternalUnoText.g:2697:3: ruleCarteIdentique
            {
             before(grammarAccess.getUno_ClassicAccess().getCarteIdentiqueCarteIdentiqueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCarteIdentique();

            state._fsp--;

             after(grammarAccess.getUno_ClassicAccess().getCarteIdentiqueCarteIdentiqueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Uno_Classic__CarteIdentiqueAssignment_3"


    // $ANTLR start "rule__Uno_Classic__CumulAjoutAssignment_4"
    // InternalUnoText.g:2706:1: rule__Uno_Classic__CumulAjoutAssignment_4 : ( ruleCumulAjout ) ;
    public final void rule__Uno_Classic__CumulAjoutAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2710:1: ( ( ruleCumulAjout ) )
            // InternalUnoText.g:2711:2: ( ruleCumulAjout )
            {
            // InternalUnoText.g:2711:2: ( ruleCumulAjout )
            // InternalUnoText.g:2712:3: ruleCumulAjout
            {
             before(grammarAccess.getUno_ClassicAccess().getCumulAjoutCumulAjoutParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCumulAjout();

            state._fsp--;

             after(grammarAccess.getUno_ClassicAccess().getCumulAjoutCumulAjoutParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Uno_Classic__CumulAjoutAssignment_4"


    // $ANTLR start "rule__Uno_Classic__SuiteAssignment_5"
    // InternalUnoText.g:2721:1: rule__Uno_Classic__SuiteAssignment_5 : ( ruleSuite ) ;
    public final void rule__Uno_Classic__SuiteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2725:1: ( ( ruleSuite ) )
            // InternalUnoText.g:2726:2: ( ruleSuite )
            {
            // InternalUnoText.g:2726:2: ( ruleSuite )
            // InternalUnoText.g:2727:3: ruleSuite
            {
             before(grammarAccess.getUno_ClassicAccess().getSuiteSuiteParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSuite();

            state._fsp--;

             after(grammarAccess.getUno_ClassicAccess().getSuiteSuiteParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Uno_Classic__SuiteAssignment_5"


    // $ANTLR start "rule__Uno_Classic__PiocheAssignment_6"
    // InternalUnoText.g:2736:1: rule__Uno_Classic__PiocheAssignment_6 : ( ( 'Pioche' ) ) ;
    public final void rule__Uno_Classic__PiocheAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2740:1: ( ( ( 'Pioche' ) ) )
            // InternalUnoText.g:2741:2: ( ( 'Pioche' ) )
            {
            // InternalUnoText.g:2741:2: ( ( 'Pioche' ) )
            // InternalUnoText.g:2742:3: ( 'Pioche' )
            {
             before(grammarAccess.getUno_ClassicAccess().getPiochePiocheKeyword_6_0()); 
            // InternalUnoText.g:2743:3: ( 'Pioche' )
            // InternalUnoText.g:2744:4: 'Pioche'
            {
             before(grammarAccess.getUno_ClassicAccess().getPiochePiocheKeyword_6_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getUno_ClassicAccess().getPiochePiocheKeyword_6_0()); 

            }

             after(grammarAccess.getUno_ClassicAccess().getPiochePiocheKeyword_6_0()); 

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
    // $ANTLR end "rule__Uno_Classic__PiocheAssignment_6"


    // $ANTLR start "rule__Uno_Classic__More4Assignment_7"
    // InternalUnoText.g:2755:1: rule__Uno_Classic__More4Assignment_7 : ( ( 'More4' ) ) ;
    public final void rule__Uno_Classic__More4Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2759:1: ( ( ( 'More4' ) ) )
            // InternalUnoText.g:2760:2: ( ( 'More4' ) )
            {
            // InternalUnoText.g:2760:2: ( ( 'More4' ) )
            // InternalUnoText.g:2761:3: ( 'More4' )
            {
             before(grammarAccess.getUno_ClassicAccess().getMore4More4Keyword_7_0()); 
            // InternalUnoText.g:2762:3: ( 'More4' )
            // InternalUnoText.g:2763:4: 'More4'
            {
             before(grammarAccess.getUno_ClassicAccess().getMore4More4Keyword_7_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getUno_ClassicAccess().getMore4More4Keyword_7_0()); 

            }

             after(grammarAccess.getUno_ClassicAccess().getMore4More4Keyword_7_0()); 

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
    // $ANTLR end "rule__Uno_Classic__More4Assignment_7"


    // $ANTLR start "rule__Uno_Classic__TempsLimiteAssignment_8"
    // InternalUnoText.g:2774:1: rule__Uno_Classic__TempsLimiteAssignment_8 : ( ( 'tempsLimite' ) ) ;
    public final void rule__Uno_Classic__TempsLimiteAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2778:1: ( ( ( 'tempsLimite' ) ) )
            // InternalUnoText.g:2779:2: ( ( 'tempsLimite' ) )
            {
            // InternalUnoText.g:2779:2: ( ( 'tempsLimite' ) )
            // InternalUnoText.g:2780:3: ( 'tempsLimite' )
            {
             before(grammarAccess.getUno_ClassicAccess().getTempsLimiteTempsLimiteKeyword_8_0()); 
            // InternalUnoText.g:2781:3: ( 'tempsLimite' )
            // InternalUnoText.g:2782:4: 'tempsLimite'
            {
             before(grammarAccess.getUno_ClassicAccess().getTempsLimiteTempsLimiteKeyword_8_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getUno_ClassicAccess().getTempsLimiteTempsLimiteKeyword_8_0()); 

            }

             after(grammarAccess.getUno_ClassicAccess().getTempsLimiteTempsLimiteKeyword_8_0()); 

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
    // $ANTLR end "rule__Uno_Classic__TempsLimiteAssignment_8"


    // $ANTLR start "rule__Uno_Classic__MauvaiseCarteAssignment_9"
    // InternalUnoText.g:2793:1: rule__Uno_Classic__MauvaiseCarteAssignment_9 : ( ( 'mauvaiseCarte' ) ) ;
    public final void rule__Uno_Classic__MauvaiseCarteAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2797:1: ( ( ( 'mauvaiseCarte' ) ) )
            // InternalUnoText.g:2798:2: ( ( 'mauvaiseCarte' ) )
            {
            // InternalUnoText.g:2798:2: ( ( 'mauvaiseCarte' ) )
            // InternalUnoText.g:2799:3: ( 'mauvaiseCarte' )
            {
             before(grammarAccess.getUno_ClassicAccess().getMauvaiseCarteMauvaiseCarteKeyword_9_0()); 
            // InternalUnoText.g:2800:3: ( 'mauvaiseCarte' )
            // InternalUnoText.g:2801:4: 'mauvaiseCarte'
            {
             before(grammarAccess.getUno_ClassicAccess().getMauvaiseCarteMauvaiseCarteKeyword_9_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getUno_ClassicAccess().getMauvaiseCarteMauvaiseCarteKeyword_9_0()); 

            }

             after(grammarAccess.getUno_ClassicAccess().getMauvaiseCarteMauvaiseCarteKeyword_9_0()); 

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
    // $ANTLR end "rule__Uno_Classic__MauvaiseCarteAssignment_9"


    // $ANTLR start "rule__Uno_Classic__EquipeAssignment_10"
    // InternalUnoText.g:2812:1: rule__Uno_Classic__EquipeAssignment_10 : ( ( 'equipe' ) ) ;
    public final void rule__Uno_Classic__EquipeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2816:1: ( ( ( 'equipe' ) ) )
            // InternalUnoText.g:2817:2: ( ( 'equipe' ) )
            {
            // InternalUnoText.g:2817:2: ( ( 'equipe' ) )
            // InternalUnoText.g:2818:3: ( 'equipe' )
            {
             before(grammarAccess.getUno_ClassicAccess().getEquipeEquipeKeyword_10_0()); 
            // InternalUnoText.g:2819:3: ( 'equipe' )
            // InternalUnoText.g:2820:4: 'equipe'
            {
             before(grammarAccess.getUno_ClassicAccess().getEquipeEquipeKeyword_10_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getUno_ClassicAccess().getEquipeEquipeKeyword_10_0()); 

            }

             after(grammarAccess.getUno_ClassicAccess().getEquipeEquipeKeyword_10_0()); 

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
    // $ANTLR end "rule__Uno_Classic__EquipeAssignment_10"


    // $ANTLR start "rule__Uno_Classic__CarteVisiblesAssignment_11"
    // InternalUnoText.g:2831:1: rule__Uno_Classic__CarteVisiblesAssignment_11 : ( ( 'CarteVisibles' ) ) ;
    public final void rule__Uno_Classic__CarteVisiblesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2835:1: ( ( ( 'CarteVisibles' ) ) )
            // InternalUnoText.g:2836:2: ( ( 'CarteVisibles' ) )
            {
            // InternalUnoText.g:2836:2: ( ( 'CarteVisibles' ) )
            // InternalUnoText.g:2837:3: ( 'CarteVisibles' )
            {
             before(grammarAccess.getUno_ClassicAccess().getCarteVisiblesCarteVisiblesKeyword_11_0()); 
            // InternalUnoText.g:2838:3: ( 'CarteVisibles' )
            // InternalUnoText.g:2839:4: 'CarteVisibles'
            {
             before(grammarAccess.getUno_ClassicAccess().getCarteVisiblesCarteVisiblesKeyword_11_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getUno_ClassicAccess().getCarteVisiblesCarteVisiblesKeyword_11_0()); 

            }

             after(grammarAccess.getUno_ClassicAccess().getCarteVisiblesCarteVisiblesKeyword_11_0()); 

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
    // $ANTLR end "rule__Uno_Classic__CarteVisiblesAssignment_11"


    // $ANTLR start "rule__Uno_Classic__FinMancheAssignment_12"
    // InternalUnoText.g:2850:1: rule__Uno_Classic__FinMancheAssignment_12 : ( ruleFinManche ) ;
    public final void rule__Uno_Classic__FinMancheAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2854:1: ( ( ruleFinManche ) )
            // InternalUnoText.g:2855:2: ( ruleFinManche )
            {
            // InternalUnoText.g:2855:2: ( ruleFinManche )
            // InternalUnoText.g:2856:3: ruleFinManche
            {
             before(grammarAccess.getUno_ClassicAccess().getFinMancheFinMancheParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleFinManche();

            state._fsp--;

             after(grammarAccess.getUno_ClassicAccess().getFinMancheFinMancheParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Uno_Classic__FinMancheAssignment_12"


    // $ANTLR start "rule__Uno_Classic__ThreeHandsAssignment_13"
    // InternalUnoText.g:2865:1: rule__Uno_Classic__ThreeHandsAssignment_13 : ( ( 'ThreeHands' ) ) ;
    public final void rule__Uno_Classic__ThreeHandsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2869:1: ( ( ( 'ThreeHands' ) ) )
            // InternalUnoText.g:2870:2: ( ( 'ThreeHands' ) )
            {
            // InternalUnoText.g:2870:2: ( ( 'ThreeHands' ) )
            // InternalUnoText.g:2871:3: ( 'ThreeHands' )
            {
             before(grammarAccess.getUno_ClassicAccess().getThreeHandsThreeHandsKeyword_13_0()); 
            // InternalUnoText.g:2872:3: ( 'ThreeHands' )
            // InternalUnoText.g:2873:4: 'ThreeHands'
            {
             before(grammarAccess.getUno_ClassicAccess().getThreeHandsThreeHandsKeyword_13_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getUno_ClassicAccess().getThreeHandsThreeHandsKeyword_13_0()); 

            }

             after(grammarAccess.getUno_ClassicAccess().getThreeHandsThreeHandsKeyword_13_0()); 

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
    // $ANTLR end "rule__Uno_Classic__ThreeHandsAssignment_13"


    // $ANTLR start "rule__Uno_Classic__ThreePilesAssignment_14"
    // InternalUnoText.g:2884:1: rule__Uno_Classic__ThreePilesAssignment_14 : ( ( 'ThreePiles' ) ) ;
    public final void rule__Uno_Classic__ThreePilesAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2888:1: ( ( ( 'ThreePiles' ) ) )
            // InternalUnoText.g:2889:2: ( ( 'ThreePiles' ) )
            {
            // InternalUnoText.g:2889:2: ( ( 'ThreePiles' ) )
            // InternalUnoText.g:2890:3: ( 'ThreePiles' )
            {
             before(grammarAccess.getUno_ClassicAccess().getThreePilesThreePilesKeyword_14_0()); 
            // InternalUnoText.g:2891:3: ( 'ThreePiles' )
            // InternalUnoText.g:2892:4: 'ThreePiles'
            {
             before(grammarAccess.getUno_ClassicAccess().getThreePilesThreePilesKeyword_14_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getUno_ClassicAccess().getThreePilesThreePilesKeyword_14_0()); 

            }

             after(grammarAccess.getUno_ClassicAccess().getThreePilesThreePilesKeyword_14_0()); 

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
    // $ANTLR end "rule__Uno_Classic__ThreePilesAssignment_14"


    // $ANTLR start "rule__Uno_Classic__SpecialCardAssignment_15"
    // InternalUnoText.g:2903:1: rule__Uno_Classic__SpecialCardAssignment_15 : ( ruleSpecialCard ) ;
    public final void rule__Uno_Classic__SpecialCardAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2907:1: ( ( ruleSpecialCard ) )
            // InternalUnoText.g:2908:2: ( ruleSpecialCard )
            {
            // InternalUnoText.g:2908:2: ( ruleSpecialCard )
            // InternalUnoText.g:2909:3: ruleSpecialCard
            {
             before(grammarAccess.getUno_ClassicAccess().getSpecialCardSpecialCardParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecialCard();

            state._fsp--;

             after(grammarAccess.getUno_ClassicAccess().getSpecialCardSpecialCardParserRuleCall_15_0()); 

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
    // $ANTLR end "rule__Uno_Classic__SpecialCardAssignment_15"


    // $ANTLR start "rule__Uno_Classic__GameOverAssignment_16"
    // InternalUnoText.g:2918:1: rule__Uno_Classic__GameOverAssignment_16 : ( ruleGameOver ) ;
    public final void rule__Uno_Classic__GameOverAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2922:1: ( ( ruleGameOver ) )
            // InternalUnoText.g:2923:2: ( ruleGameOver )
            {
            // InternalUnoText.g:2923:2: ( ruleGameOver )
            // InternalUnoText.g:2924:3: ruleGameOver
            {
             before(grammarAccess.getUno_ClassicAccess().getGameOverGameOverParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleGameOver();

            state._fsp--;

             after(grammarAccess.getUno_ClassicAccess().getGameOverGameOverParserRuleCall_16_0()); 

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
    // $ANTLR end "rule__Uno_Classic__GameOverAssignment_16"


    // $ANTLR start "rule__CarteIdentique__AvecCouleurAssignment_1"
    // InternalUnoText.g:2933:1: rule__CarteIdentique__AvecCouleurAssignment_1 : ( ( 'AvecCouleur' ) ) ;
    public final void rule__CarteIdentique__AvecCouleurAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2937:1: ( ( ( 'AvecCouleur' ) ) )
            // InternalUnoText.g:2938:2: ( ( 'AvecCouleur' ) )
            {
            // InternalUnoText.g:2938:2: ( ( 'AvecCouleur' ) )
            // InternalUnoText.g:2939:3: ( 'AvecCouleur' )
            {
             before(grammarAccess.getCarteIdentiqueAccess().getAvecCouleurAvecCouleurKeyword_1_0()); 
            // InternalUnoText.g:2940:3: ( 'AvecCouleur' )
            // InternalUnoText.g:2941:4: 'AvecCouleur'
            {
             before(grammarAccess.getCarteIdentiqueAccess().getAvecCouleurAvecCouleurKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getCarteIdentiqueAccess().getAvecCouleurAvecCouleurKeyword_1_0()); 

            }

             after(grammarAccess.getCarteIdentiqueAccess().getAvecCouleurAvecCouleurKeyword_1_0()); 

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
    // $ANTLR end "rule__CarteIdentique__AvecCouleurAssignment_1"


    // $ANTLR start "rule__CumulAjout__Plus2Assignment_1"
    // InternalUnoText.g:2952:1: rule__CumulAjout__Plus2Assignment_1 : ( ( 'PLus2' ) ) ;
    public final void rule__CumulAjout__Plus2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2956:1: ( ( ( 'PLus2' ) ) )
            // InternalUnoText.g:2957:2: ( ( 'PLus2' ) )
            {
            // InternalUnoText.g:2957:2: ( ( 'PLus2' ) )
            // InternalUnoText.g:2958:3: ( 'PLus2' )
            {
             before(grammarAccess.getCumulAjoutAccess().getPlus2PLus2Keyword_1_0()); 
            // InternalUnoText.g:2959:3: ( 'PLus2' )
            // InternalUnoText.g:2960:4: 'PLus2'
            {
             before(grammarAccess.getCumulAjoutAccess().getPlus2PLus2Keyword_1_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getCumulAjoutAccess().getPlus2PLus2Keyword_1_0()); 

            }

             after(grammarAccess.getCumulAjoutAccess().getPlus2PLus2Keyword_1_0()); 

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
    // $ANTLR end "rule__CumulAjout__Plus2Assignment_1"


    // $ANTLR start "rule__CumulAjout__Plus4Assignment_2"
    // InternalUnoText.g:2971:1: rule__CumulAjout__Plus4Assignment_2 : ( ( 'PLus4' ) ) ;
    public final void rule__CumulAjout__Plus4Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2975:1: ( ( ( 'PLus4' ) ) )
            // InternalUnoText.g:2976:2: ( ( 'PLus4' ) )
            {
            // InternalUnoText.g:2976:2: ( ( 'PLus4' ) )
            // InternalUnoText.g:2977:3: ( 'PLus4' )
            {
             before(grammarAccess.getCumulAjoutAccess().getPlus4PLus4Keyword_2_0()); 
            // InternalUnoText.g:2978:3: ( 'PLus4' )
            // InternalUnoText.g:2979:4: 'PLus4'
            {
             before(grammarAccess.getCumulAjoutAccess().getPlus4PLus4Keyword_2_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getCumulAjoutAccess().getPlus4PLus4Keyword_2_0()); 

            }

             after(grammarAccess.getCumulAjoutAccess().getPlus4PLus4Keyword_2_0()); 

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
    // $ANTLR end "rule__CumulAjout__Plus4Assignment_2"


    // $ANTLR start "rule__UnoOlypique__TribunalPopulaireAssignment_1"
    // InternalUnoText.g:2990:1: rule__UnoOlypique__TribunalPopulaireAssignment_1 : ( ( 'TribunalPopulaire' ) ) ;
    public final void rule__UnoOlypique__TribunalPopulaireAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:2994:1: ( ( ( 'TribunalPopulaire' ) ) )
            // InternalUnoText.g:2995:2: ( ( 'TribunalPopulaire' ) )
            {
            // InternalUnoText.g:2995:2: ( ( 'TribunalPopulaire' ) )
            // InternalUnoText.g:2996:3: ( 'TribunalPopulaire' )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getTribunalPopulaireTribunalPopulaireKeyword_1_0()); 
            // InternalUnoText.g:2997:3: ( 'TribunalPopulaire' )
            // InternalUnoText.g:2998:4: 'TribunalPopulaire'
            {
             before(grammarAccess.getUnoOlypiqueAccess().getTribunalPopulaireTribunalPopulaireKeyword_1_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getUnoOlypiqueAccess().getTribunalPopulaireTribunalPopulaireKeyword_1_0()); 

            }

             after(grammarAccess.getUnoOlypiqueAccess().getTribunalPopulaireTribunalPopulaireKeyword_1_0()); 

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
    // $ANTLR end "rule__UnoOlypique__TribunalPopulaireAssignment_1"


    // $ANTLR start "rule__UnoOlypique__DistributionAleatoireAssignment_2"
    // InternalUnoText.g:3009:1: rule__UnoOlypique__DistributionAleatoireAssignment_2 : ( ( 'DistributionAleatoire' ) ) ;
    public final void rule__UnoOlypique__DistributionAleatoireAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3013:1: ( ( ( 'DistributionAleatoire' ) ) )
            // InternalUnoText.g:3014:2: ( ( 'DistributionAleatoire' ) )
            {
            // InternalUnoText.g:3014:2: ( ( 'DistributionAleatoire' ) )
            // InternalUnoText.g:3015:3: ( 'DistributionAleatoire' )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getDistributionAleatoireDistributionAleatoireKeyword_2_0()); 
            // InternalUnoText.g:3016:3: ( 'DistributionAleatoire' )
            // InternalUnoText.g:3017:4: 'DistributionAleatoire'
            {
             before(grammarAccess.getUnoOlypiqueAccess().getDistributionAleatoireDistributionAleatoireKeyword_2_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getUnoOlypiqueAccess().getDistributionAleatoireDistributionAleatoireKeyword_2_0()); 

            }

             after(grammarAccess.getUnoOlypiqueAccess().getDistributionAleatoireDistributionAleatoireKeyword_2_0()); 

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
    // $ANTLR end "rule__UnoOlypique__DistributionAleatoireAssignment_2"


    // $ANTLR start "rule__UnoOlypique__SensDefiniAssignment_3"
    // InternalUnoText.g:3028:1: rule__UnoOlypique__SensDefiniAssignment_3 : ( ( 'SensDefini' ) ) ;
    public final void rule__UnoOlypique__SensDefiniAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3032:1: ( ( ( 'SensDefini' ) ) )
            // InternalUnoText.g:3033:2: ( ( 'SensDefini' ) )
            {
            // InternalUnoText.g:3033:2: ( ( 'SensDefini' ) )
            // InternalUnoText.g:3034:3: ( 'SensDefini' )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getSensDefiniSensDefiniKeyword_3_0()); 
            // InternalUnoText.g:3035:3: ( 'SensDefini' )
            // InternalUnoText.g:3036:4: 'SensDefini'
            {
             before(grammarAccess.getUnoOlypiqueAccess().getSensDefiniSensDefiniKeyword_3_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getUnoOlypiqueAccess().getSensDefiniSensDefiniKeyword_3_0()); 

            }

             after(grammarAccess.getUnoOlypiqueAccess().getSensDefiniSensDefiniKeyword_3_0()); 

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
    // $ANTLR end "rule__UnoOlypique__SensDefiniAssignment_3"


    // $ANTLR start "rule__UnoOlypique__ChangementDonneurAssignment_4"
    // InternalUnoText.g:3047:1: rule__UnoOlypique__ChangementDonneurAssignment_4 : ( ( 'ChangementDonneur' ) ) ;
    public final void rule__UnoOlypique__ChangementDonneurAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3051:1: ( ( ( 'ChangementDonneur' ) ) )
            // InternalUnoText.g:3052:2: ( ( 'ChangementDonneur' ) )
            {
            // InternalUnoText.g:3052:2: ( ( 'ChangementDonneur' ) )
            // InternalUnoText.g:3053:3: ( 'ChangementDonneur' )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getChangementDonneurChangementDonneurKeyword_4_0()); 
            // InternalUnoText.g:3054:3: ( 'ChangementDonneur' )
            // InternalUnoText.g:3055:4: 'ChangementDonneur'
            {
             before(grammarAccess.getUnoOlypiqueAccess().getChangementDonneurChangementDonneurKeyword_4_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getUnoOlypiqueAccess().getChangementDonneurChangementDonneurKeyword_4_0()); 

            }

             after(grammarAccess.getUnoOlypiqueAccess().getChangementDonneurChangementDonneurKeyword_4_0()); 

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
    // $ANTLR end "rule__UnoOlypique__ChangementDonneurAssignment_4"


    // $ANTLR start "rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5"
    // InternalUnoText.g:3066:1: rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5 : ( ( 'VueDesCartesApres1erPose' ) ) ;
    public final void rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3070:1: ( ( ( 'VueDesCartesApres1erPose' ) ) )
            // InternalUnoText.g:3071:2: ( ( 'VueDesCartesApres1erPose' ) )
            {
            // InternalUnoText.g:3071:2: ( ( 'VueDesCartesApres1erPose' ) )
            // InternalUnoText.g:3072:3: ( 'VueDesCartesApres1erPose' )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getVueDesCartesApres1erPoseVueDesCartesApres1erPoseKeyword_5_0()); 
            // InternalUnoText.g:3073:3: ( 'VueDesCartesApres1erPose' )
            // InternalUnoText.g:3074:4: 'VueDesCartesApres1erPose'
            {
             before(grammarAccess.getUnoOlypiqueAccess().getVueDesCartesApres1erPoseVueDesCartesApres1erPoseKeyword_5_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getUnoOlypiqueAccess().getVueDesCartesApres1erPoseVueDesCartesApres1erPoseKeyword_5_0()); 

            }

             after(grammarAccess.getUnoOlypiqueAccess().getVueDesCartesApres1erPoseVueDesCartesApres1erPoseKeyword_5_0()); 

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
    // $ANTLR end "rule__UnoOlypique__VueDesCartesApres1erPoseAssignment_5"


    // $ANTLR start "rule__UnoOlypique__DonneurPremieroseAssignment_6"
    // InternalUnoText.g:3085:1: rule__UnoOlypique__DonneurPremieroseAssignment_6 : ( ( 'DonneurPremierose' ) ) ;
    public final void rule__UnoOlypique__DonneurPremieroseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3089:1: ( ( ( 'DonneurPremierose' ) ) )
            // InternalUnoText.g:3090:2: ( ( 'DonneurPremierose' ) )
            {
            // InternalUnoText.g:3090:2: ( ( 'DonneurPremierose' ) )
            // InternalUnoText.g:3091:3: ( 'DonneurPremierose' )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getDonneurPremieroseDonneurPremieroseKeyword_6_0()); 
            // InternalUnoText.g:3092:3: ( 'DonneurPremierose' )
            // InternalUnoText.g:3093:4: 'DonneurPremierose'
            {
             before(grammarAccess.getUnoOlypiqueAccess().getDonneurPremieroseDonneurPremieroseKeyword_6_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getUnoOlypiqueAccess().getDonneurPremieroseDonneurPremieroseKeyword_6_0()); 

            }

             after(grammarAccess.getUnoOlypiqueAccess().getDonneurPremieroseDonneurPremieroseKeyword_6_0()); 

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
    // $ANTLR end "rule__UnoOlypique__DonneurPremieroseAssignment_6"


    // $ANTLR start "rule__UnoOlypique__JeuRapideAssignment_7"
    // InternalUnoText.g:3104:1: rule__UnoOlypique__JeuRapideAssignment_7 : ( ( 'JeuRapide' ) ) ;
    public final void rule__UnoOlypique__JeuRapideAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3108:1: ( ( ( 'JeuRapide' ) ) )
            // InternalUnoText.g:3109:2: ( ( 'JeuRapide' ) )
            {
            // InternalUnoText.g:3109:2: ( ( 'JeuRapide' ) )
            // InternalUnoText.g:3110:3: ( 'JeuRapide' )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getJeuRapideJeuRapideKeyword_7_0()); 
            // InternalUnoText.g:3111:3: ( 'JeuRapide' )
            // InternalUnoText.g:3112:4: 'JeuRapide'
            {
             before(grammarAccess.getUnoOlypiqueAccess().getJeuRapideJeuRapideKeyword_7_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getUnoOlypiqueAccess().getJeuRapideJeuRapideKeyword_7_0()); 

            }

             after(grammarAccess.getUnoOlypiqueAccess().getJeuRapideJeuRapideKeyword_7_0()); 

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
    // $ANTLR end "rule__UnoOlypique__JeuRapideAssignment_7"


    // $ANTLR start "rule__UnoOlypique__InterceptionAssignment_8"
    // InternalUnoText.g:3123:1: rule__UnoOlypique__InterceptionAssignment_8 : ( ( 'Interception' ) ) ;
    public final void rule__UnoOlypique__InterceptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3127:1: ( ( ( 'Interception' ) ) )
            // InternalUnoText.g:3128:2: ( ( 'Interception' ) )
            {
            // InternalUnoText.g:3128:2: ( ( 'Interception' ) )
            // InternalUnoText.g:3129:3: ( 'Interception' )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getInterceptionInterceptionKeyword_8_0()); 
            // InternalUnoText.g:3130:3: ( 'Interception' )
            // InternalUnoText.g:3131:4: 'Interception'
            {
             before(grammarAccess.getUnoOlypiqueAccess().getInterceptionInterceptionKeyword_8_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getUnoOlypiqueAccess().getInterceptionInterceptionKeyword_8_0()); 

            }

             after(grammarAccess.getUnoOlypiqueAccess().getInterceptionInterceptionKeyword_8_0()); 

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
    // $ANTLR end "rule__UnoOlypique__InterceptionAssignment_8"


    // $ANTLR start "rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9"
    // InternalUnoText.g:3142:1: rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9 : ( ( 'DeuxCartesIdentiques' ) ) ;
    public final void rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3146:1: ( ( ( 'DeuxCartesIdentiques' ) ) )
            // InternalUnoText.g:3147:2: ( ( 'DeuxCartesIdentiques' ) )
            {
            // InternalUnoText.g:3147:2: ( ( 'DeuxCartesIdentiques' ) )
            // InternalUnoText.g:3148:3: ( 'DeuxCartesIdentiques' )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getDeuxCartesIdentiquesDeuxCartesIdentiquesKeyword_9_0()); 
            // InternalUnoText.g:3149:3: ( 'DeuxCartesIdentiques' )
            // InternalUnoText.g:3150:4: 'DeuxCartesIdentiques'
            {
             before(grammarAccess.getUnoOlypiqueAccess().getDeuxCartesIdentiquesDeuxCartesIdentiquesKeyword_9_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getUnoOlypiqueAccess().getDeuxCartesIdentiquesDeuxCartesIdentiquesKeyword_9_0()); 

            }

             after(grammarAccess.getUnoOlypiqueAccess().getDeuxCartesIdentiquesDeuxCartesIdentiquesKeyword_9_0()); 

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
    // $ANTLR end "rule__UnoOlypique__DeuxCartesIdentiquesAssignment_9"


    // $ANTLR start "rule__UnoOlypique__DecisionCarteAssignment_10"
    // InternalUnoText.g:3161:1: rule__UnoOlypique__DecisionCarteAssignment_10 : ( ( 'DecisionCarte' ) ) ;
    public final void rule__UnoOlypique__DecisionCarteAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3165:1: ( ( ( 'DecisionCarte' ) ) )
            // InternalUnoText.g:3166:2: ( ( 'DecisionCarte' ) )
            {
            // InternalUnoText.g:3166:2: ( ( 'DecisionCarte' ) )
            // InternalUnoText.g:3167:3: ( 'DecisionCarte' )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getDecisionCarteDecisionCarteKeyword_10_0()); 
            // InternalUnoText.g:3168:3: ( 'DecisionCarte' )
            // InternalUnoText.g:3169:4: 'DecisionCarte'
            {
             before(grammarAccess.getUnoOlypiqueAccess().getDecisionCarteDecisionCarteKeyword_10_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getUnoOlypiqueAccess().getDecisionCarteDecisionCarteKeyword_10_0()); 

            }

             after(grammarAccess.getUnoOlypiqueAccess().getDecisionCarteDecisionCarteKeyword_10_0()); 

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
    // $ANTLR end "rule__UnoOlypique__DecisionCarteAssignment_10"


    // $ANTLR start "rule__UnoOlypique__SurenchereAssignment_11"
    // InternalUnoText.g:3180:1: rule__UnoOlypique__SurenchereAssignment_11 : ( ( 'Surenchere' ) ) ;
    public final void rule__UnoOlypique__SurenchereAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3184:1: ( ( ( 'Surenchere' ) ) )
            // InternalUnoText.g:3185:2: ( ( 'Surenchere' ) )
            {
            // InternalUnoText.g:3185:2: ( ( 'Surenchere' ) )
            // InternalUnoText.g:3186:3: ( 'Surenchere' )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getSurenchereSurenchereKeyword_11_0()); 
            // InternalUnoText.g:3187:3: ( 'Surenchere' )
            // InternalUnoText.g:3188:4: 'Surenchere'
            {
             before(grammarAccess.getUnoOlypiqueAccess().getSurenchereSurenchereKeyword_11_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getUnoOlypiqueAccess().getSurenchereSurenchereKeyword_11_0()); 

            }

             after(grammarAccess.getUnoOlypiqueAccess().getSurenchereSurenchereKeyword_11_0()); 

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
    // $ANTLR end "rule__UnoOlypique__SurenchereAssignment_11"


    // $ANTLR start "rule__UnoOlypique__CartezeroAssignment_12"
    // InternalUnoText.g:3199:1: rule__UnoOlypique__CartezeroAssignment_12 : ( ( 'Carte0' ) ) ;
    public final void rule__UnoOlypique__CartezeroAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3203:1: ( ( ( 'Carte0' ) ) )
            // InternalUnoText.g:3204:2: ( ( 'Carte0' ) )
            {
            // InternalUnoText.g:3204:2: ( ( 'Carte0' ) )
            // InternalUnoText.g:3205:3: ( 'Carte0' )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getCartezeroCarte0Keyword_12_0()); 
            // InternalUnoText.g:3206:3: ( 'Carte0' )
            // InternalUnoText.g:3207:4: 'Carte0'
            {
             before(grammarAccess.getUnoOlypiqueAccess().getCartezeroCarte0Keyword_12_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getUnoOlypiqueAccess().getCartezeroCarte0Keyword_12_0()); 

            }

             after(grammarAccess.getUnoOlypiqueAccess().getCartezeroCarte0Keyword_12_0()); 

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
    // $ANTLR end "rule__UnoOlypique__CartezeroAssignment_12"


    // $ANTLR start "rule__UnoOlypique__CarteSeptAssignment_13"
    // InternalUnoText.g:3218:1: rule__UnoOlypique__CarteSeptAssignment_13 : ( ( 'Carte7' ) ) ;
    public final void rule__UnoOlypique__CarteSeptAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3222:1: ( ( ( 'Carte7' ) ) )
            // InternalUnoText.g:3223:2: ( ( 'Carte7' ) )
            {
            // InternalUnoText.g:3223:2: ( ( 'Carte7' ) )
            // InternalUnoText.g:3224:3: ( 'Carte7' )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getCarteSeptCarte7Keyword_13_0()); 
            // InternalUnoText.g:3225:3: ( 'Carte7' )
            // InternalUnoText.g:3226:4: 'Carte7'
            {
             before(grammarAccess.getUnoOlypiqueAccess().getCarteSeptCarte7Keyword_13_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getUnoOlypiqueAccess().getCarteSeptCarte7Keyword_13_0()); 

            }

             after(grammarAccess.getUnoOlypiqueAccess().getCarteSeptCarte7Keyword_13_0()); 

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
    // $ANTLR end "rule__UnoOlypique__CarteSeptAssignment_13"


    // $ANTLR start "rule__UnoOlypique__Carte2Assignment_14"
    // InternalUnoText.g:3237:1: rule__UnoOlypique__Carte2Assignment_14 : ( ( 'Carte2' ) ) ;
    public final void rule__UnoOlypique__Carte2Assignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3241:1: ( ( ( 'Carte2' ) ) )
            // InternalUnoText.g:3242:2: ( ( 'Carte2' ) )
            {
            // InternalUnoText.g:3242:2: ( ( 'Carte2' ) )
            // InternalUnoText.g:3243:3: ( 'Carte2' )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getCarte2Carte2Keyword_14_0()); 
            // InternalUnoText.g:3244:3: ( 'Carte2' )
            // InternalUnoText.g:3245:4: 'Carte2'
            {
             before(grammarAccess.getUnoOlypiqueAccess().getCarte2Carte2Keyword_14_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getUnoOlypiqueAccess().getCarte2Carte2Keyword_14_0()); 

            }

             after(grammarAccess.getUnoOlypiqueAccess().getCarte2Carte2Keyword_14_0()); 

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
    // $ANTLR end "rule__UnoOlypique__Carte2Assignment_14"


    // $ANTLR start "rule__UnoOlypique__ValeurCarteAssignment_15"
    // InternalUnoText.g:3256:1: rule__UnoOlypique__ValeurCarteAssignment_15 : ( ( 'ValeurCarte' ) ) ;
    public final void rule__UnoOlypique__ValeurCarteAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3260:1: ( ( ( 'ValeurCarte' ) ) )
            // InternalUnoText.g:3261:2: ( ( 'ValeurCarte' ) )
            {
            // InternalUnoText.g:3261:2: ( ( 'ValeurCarte' ) )
            // InternalUnoText.g:3262:3: ( 'ValeurCarte' )
            {
             before(grammarAccess.getUnoOlypiqueAccess().getValeurCarteValeurCarteKeyword_15_0()); 
            // InternalUnoText.g:3263:3: ( 'ValeurCarte' )
            // InternalUnoText.g:3264:4: 'ValeurCarte'
            {
             before(grammarAccess.getUnoOlypiqueAccess().getValeurCarteValeurCarteKeyword_15_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getUnoOlypiqueAccess().getValeurCarteValeurCarteKeyword_15_0()); 

            }

             after(grammarAccess.getUnoOlypiqueAccess().getValeurCarteValeurCarteKeyword_15_0()); 

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
    // $ANTLR end "rule__UnoOlypique__ValeurCarteAssignment_15"


    // $ANTLR start "rule__UnoWizz__PresquUnoAssignment_1"
    // InternalUnoText.g:3275:1: rule__UnoWizz__PresquUnoAssignment_1 : ( ( 'presquUno,' ) ) ;
    public final void rule__UnoWizz__PresquUnoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3279:1: ( ( ( 'presquUno,' ) ) )
            // InternalUnoText.g:3280:2: ( ( 'presquUno,' ) )
            {
            // InternalUnoText.g:3280:2: ( ( 'presquUno,' ) )
            // InternalUnoText.g:3281:3: ( 'presquUno,' )
            {
             before(grammarAccess.getUnoWizzAccess().getPresquUnoPresquUnoKeyword_1_0()); 
            // InternalUnoText.g:3282:3: ( 'presquUno,' )
            // InternalUnoText.g:3283:4: 'presquUno,'
            {
             before(grammarAccess.getUnoWizzAccess().getPresquUnoPresquUnoKeyword_1_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getUnoWizzAccess().getPresquUnoPresquUnoKeyword_1_0()); 

            }

             after(grammarAccess.getUnoWizzAccess().getPresquUnoPresquUnoKeyword_1_0()); 

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
    // $ANTLR end "rule__UnoWizz__PresquUnoAssignment_1"


    // $ANTLR start "rule__UnoWizz__ChiffreMoinsAssignment_2"
    // InternalUnoText.g:3294:1: rule__UnoWizz__ChiffreMoinsAssignment_2 : ( ( 'chiffreMoins,' ) ) ;
    public final void rule__UnoWizz__ChiffreMoinsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3298:1: ( ( ( 'chiffreMoins,' ) ) )
            // InternalUnoText.g:3299:2: ( ( 'chiffreMoins,' ) )
            {
            // InternalUnoText.g:3299:2: ( ( 'chiffreMoins,' ) )
            // InternalUnoText.g:3300:3: ( 'chiffreMoins,' )
            {
             before(grammarAccess.getUnoWizzAccess().getChiffreMoinsChiffreMoinsKeyword_2_0()); 
            // InternalUnoText.g:3301:3: ( 'chiffreMoins,' )
            // InternalUnoText.g:3302:4: 'chiffreMoins,'
            {
             before(grammarAccess.getUnoWizzAccess().getChiffreMoinsChiffreMoinsKeyword_2_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getUnoWizzAccess().getChiffreMoinsChiffreMoinsKeyword_2_0()); 

            }

             after(grammarAccess.getUnoWizzAccess().getChiffreMoinsChiffreMoinsKeyword_2_0()); 

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
    // $ANTLR end "rule__UnoWizz__ChiffreMoinsAssignment_2"


    // $ANTLR start "rule__UnoWizz__CouleurMoinsAssignment_3"
    // InternalUnoText.g:3313:1: rule__UnoWizz__CouleurMoinsAssignment_3 : ( ( 'couleurMoins,' ) ) ;
    public final void rule__UnoWizz__CouleurMoinsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3317:1: ( ( ( 'couleurMoins,' ) ) )
            // InternalUnoText.g:3318:2: ( ( 'couleurMoins,' ) )
            {
            // InternalUnoText.g:3318:2: ( ( 'couleurMoins,' ) )
            // InternalUnoText.g:3319:3: ( 'couleurMoins,' )
            {
             before(grammarAccess.getUnoWizzAccess().getCouleurMoinsCouleurMoinsKeyword_3_0()); 
            // InternalUnoText.g:3320:3: ( 'couleurMoins,' )
            // InternalUnoText.g:3321:4: 'couleurMoins,'
            {
             before(grammarAccess.getUnoWizzAccess().getCouleurMoinsCouleurMoinsKeyword_3_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getUnoWizzAccess().getCouleurMoinsCouleurMoinsKeyword_3_0()); 

            }

             after(grammarAccess.getUnoWizzAccess().getCouleurMoinsCouleurMoinsKeyword_3_0()); 

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
    // $ANTLR end "rule__UnoWizz__CouleurMoinsAssignment_3"


    // $ANTLR start "rule__UnoWizz__CarteRougeAssignment_4"
    // InternalUnoText.g:3332:1: rule__UnoWizz__CarteRougeAssignment_4 : ( ( 'carteRouge' ) ) ;
    public final void rule__UnoWizz__CarteRougeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoText.g:3336:1: ( ( ( 'carteRouge' ) ) )
            // InternalUnoText.g:3337:2: ( ( 'carteRouge' ) )
            {
            // InternalUnoText.g:3337:2: ( ( 'carteRouge' ) )
            // InternalUnoText.g:3338:3: ( 'carteRouge' )
            {
             before(grammarAccess.getUnoWizzAccess().getCarteRougeCarteRougeKeyword_4_0()); 
            // InternalUnoText.g:3339:3: ( 'carteRouge' )
            // InternalUnoText.g:3340:4: 'carteRouge'
            {
             before(grammarAccess.getUnoWizzAccess().getCarteRougeCarteRougeKeyword_4_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getUnoWizzAccess().getCarteRougeCarteRougeKeyword_4_0()); 

            }

             after(grammarAccess.getUnoWizzAccess().getCarteRougeCarteRougeKeyword_4_0()); 

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
    // $ANTLR end "rule__UnoWizz__CarteRougeAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0006000300000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00F8100404000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0006000300000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000404000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x03000000E0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00F8100404000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000700L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000800000000002L});

}