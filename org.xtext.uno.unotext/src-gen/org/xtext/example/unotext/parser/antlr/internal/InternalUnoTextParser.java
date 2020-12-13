package org.xtext.example.unotext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.unotext.services.UnoTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUnoTextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Nombre de joueur : '", "'Trois'", "'Quatre'", "'Cinq'", "'Six'", "'Sept'", "'Huit'", "'Deux : Inverser/Passer_Tour'", "'Uno Classic : '", "'UnoChallenge'", "'Carte0_7'", "'Pioche'", "'More4'", "'tempsLimite'", "'mauvaiseCarte'", "'equipe'", "'CarteVisibles'", "'ThreeHands'", "'ThreePiles'", "'SpecialCard : '", "'Roulette'", "'Showdown'", "'Classique'", "'GameOver : '", "'Avoir500'", "'NePasAvoir500'", "'nombredeManchesGagn\\u00E9s'", "'FinManche : '", "'Reste1Carte'", "'Aumoins4CartesMemeChiffre'", "'CarteIdentiQUE'", "'AvecCouleur'", "'CumulAjout'", "'PLus2'", "'PLus4'", "'Suite : '", "'Simple'", "'Royale'", "'UnoOlympique : '", "'TribunalPopulaire'", "'DistributionAleatoire'", "'SensDefini'", "'ChangementDonneur'", "'VueDesCartesApres1erPose'", "'DonneurPremierose'", "'JeuRapide'", "'Interception'", "'DeuxCartesIdentiques'", "'DecisionCarte'", "'Surenchere'", "'Carte0'", "'Carte7'", "'Carte2'", "'ValeurCarte'", "'UnoWizz : '", "'presquUno,'", "'chiffreMoins,'", "'couleurMoins,'", "'carteRouge'", "'carteBleue'", "'echange'", "'mainVisible'", "'unoWizz'", "'War'", "'UnoRapido'", "'Confusion'", "'Defense'", "'Rapido'", "'CarteUno'"
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

        public InternalUnoTextParser(TokenStream input, UnoTextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Uno";
       	}

       	@Override
       	protected UnoTextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUno"
    // InternalUnoText.g:64:1: entryRuleUno returns [EObject current=null] : iv_ruleUno= ruleUno EOF ;
    public final EObject entryRuleUno() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUno = null;


        try {
            // InternalUnoText.g:64:44: (iv_ruleUno= ruleUno EOF )
            // InternalUnoText.g:65:2: iv_ruleUno= ruleUno EOF
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
    // InternalUnoText.g:71:1: ruleUno returns [EObject current=null] : ( ( (lv_uno_0_0= ruleUno_Rule ) ) ( (lv_nombreJoueur_1_0= ruleNombreJoueurs ) ) ) ;
    public final EObject ruleUno() throws RecognitionException {
        EObject current = null;

        EObject lv_uno_0_0 = null;

        AntlrDatatypeRuleToken lv_nombreJoueur_1_0 = null;



        	enterRule();

        try {
            // InternalUnoText.g:77:2: ( ( ( (lv_uno_0_0= ruleUno_Rule ) ) ( (lv_nombreJoueur_1_0= ruleNombreJoueurs ) ) ) )
            // InternalUnoText.g:78:2: ( ( (lv_uno_0_0= ruleUno_Rule ) ) ( (lv_nombreJoueur_1_0= ruleNombreJoueurs ) ) )
            {
            // InternalUnoText.g:78:2: ( ( (lv_uno_0_0= ruleUno_Rule ) ) ( (lv_nombreJoueur_1_0= ruleNombreJoueurs ) ) )
            // InternalUnoText.g:79:3: ( (lv_uno_0_0= ruleUno_Rule ) ) ( (lv_nombreJoueur_1_0= ruleNombreJoueurs ) )
            {
            // InternalUnoText.g:79:3: ( (lv_uno_0_0= ruleUno_Rule ) )
            // InternalUnoText.g:80:4: (lv_uno_0_0= ruleUno_Rule )
            {
            // InternalUnoText.g:80:4: (lv_uno_0_0= ruleUno_Rule )
            // InternalUnoText.g:81:5: lv_uno_0_0= ruleUno_Rule
            {

            					newCompositeNode(grammarAccess.getUnoAccess().getUnoUno_RuleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_uno_0_0=ruleUno_Rule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnoRule());
            					}
            					add(
            						current,
            						"uno",
            						lv_uno_0_0,
            						"org.xtext.example.unotext.UnoText.Uno_Rule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUnoText.g:98:3: ( (lv_nombreJoueur_1_0= ruleNombreJoueurs ) )
            // InternalUnoText.g:99:4: (lv_nombreJoueur_1_0= ruleNombreJoueurs )
            {
            // InternalUnoText.g:99:4: (lv_nombreJoueur_1_0= ruleNombreJoueurs )
            // InternalUnoText.g:100:5: lv_nombreJoueur_1_0= ruleNombreJoueurs
            {

            					newCompositeNode(grammarAccess.getUnoAccess().getNombreJoueurNombreJoueursParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_nombreJoueur_1_0=ruleNombreJoueurs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnoRule());
            					}
            					add(
            						current,
            						"nombreJoueur",
            						lv_nombreJoueur_1_0,
            						"org.xtext.example.unotext.UnoText.NombreJoueurs");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleUno"


    // $ANTLR start "entryRuleUno_Rule"
    // InternalUnoText.g:121:1: entryRuleUno_Rule returns [EObject current=null] : iv_ruleUno_Rule= ruleUno_Rule EOF ;
    public final EObject entryRuleUno_Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUno_Rule = null;


        try {
            // InternalUnoText.g:121:49: (iv_ruleUno_Rule= ruleUno_Rule EOF )
            // InternalUnoText.g:122:2: iv_ruleUno_Rule= ruleUno_Rule EOF
            {
             newCompositeNode(grammarAccess.getUno_RuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUno_Rule=ruleUno_Rule();

            state._fsp--;

             current =iv_ruleUno_Rule; 
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
    // $ANTLR end "entryRuleUno_Rule"


    // $ANTLR start "ruleUno_Rule"
    // InternalUnoText.g:128:1: ruleUno_Rule returns [EObject current=null] : (this_Uno_Classic_0= ruleUno_Classic | this_UnoOlypique_1= ruleUnoOlypique | this_UnoWizz_2= ruleUnoWizz | ruleUnoRapido ) ;
    public final EObject ruleUno_Rule() throws RecognitionException {
        EObject current = null;

        EObject this_Uno_Classic_0 = null;

        EObject this_UnoOlypique_1 = null;

        EObject this_UnoWizz_2 = null;



        	enterRule();

        try {
            // InternalUnoText.g:134:2: ( (this_Uno_Classic_0= ruleUno_Classic | this_UnoOlypique_1= ruleUnoOlypique | this_UnoWizz_2= ruleUnoWizz | ruleUnoRapido ) )
            // InternalUnoText.g:135:2: (this_Uno_Classic_0= ruleUno_Classic | this_UnoOlypique_1= ruleUnoOlypique | this_UnoWizz_2= ruleUnoWizz | ruleUnoRapido )
            {
            // InternalUnoText.g:135:2: (this_Uno_Classic_0= ruleUno_Classic | this_UnoOlypique_1= ruleUnoOlypique | this_UnoWizz_2= ruleUnoWizz | ruleUnoRapido )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 49:
                {
                alt1=2;
                }
                break;
            case 65:
                {
                alt1=3;
                }
                break;
            case 75:
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
                    // InternalUnoText.g:136:3: this_Uno_Classic_0= ruleUno_Classic
                    {

                    			newCompositeNode(grammarAccess.getUno_RuleAccess().getUno_ClassicParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Uno_Classic_0=ruleUno_Classic();

                    state._fsp--;


                    			current = this_Uno_Classic_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUnoText.g:145:3: this_UnoOlypique_1= ruleUnoOlypique
                    {

                    			newCompositeNode(grammarAccess.getUno_RuleAccess().getUnoOlypiqueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnoOlypique_1=ruleUnoOlypique();

                    state._fsp--;


                    			current = this_UnoOlypique_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUnoText.g:154:3: this_UnoWizz_2= ruleUnoWizz
                    {

                    			newCompositeNode(grammarAccess.getUno_RuleAccess().getUnoWizzParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnoWizz_2=ruleUnoWizz();

                    state._fsp--;


                    			current = this_UnoWizz_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUnoText.g:163:3: ruleUnoRapido
                    {

                    			newCompositeNode(grammarAccess.getUno_RuleAccess().getUnoRapidoParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    ruleUnoRapido();

                    state._fsp--;


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
    // $ANTLR end "ruleUno_Rule"


    // $ANTLR start "entryRuleNombreJoueurs"
    // InternalUnoText.g:174:1: entryRuleNombreJoueurs returns [String current=null] : iv_ruleNombreJoueurs= ruleNombreJoueurs EOF ;
    public final String entryRuleNombreJoueurs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNombreJoueurs = null;


        try {
            // InternalUnoText.g:174:53: (iv_ruleNombreJoueurs= ruleNombreJoueurs EOF )
            // InternalUnoText.g:175:2: iv_ruleNombreJoueurs= ruleNombreJoueurs EOF
            {
             newCompositeNode(grammarAccess.getNombreJoueursRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNombreJoueurs=ruleNombreJoueurs();

            state._fsp--;

             current =iv_ruleNombreJoueurs.getText(); 
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
    // $ANTLR end "entryRuleNombreJoueurs"


    // $ANTLR start "ruleNombreJoueurs"
    // InternalUnoText.g:181:1: ruleNombreJoueurs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'Nombre de joueur : ' )+ (this_Deux_1= ruleDeux | kw= 'Trois' | kw= 'Quatre' | kw= 'Cinq' | kw= 'Six' | kw= 'Sept' | kw= 'Huit' ) ) ;
    public final AntlrDatatypeRuleToken ruleNombreJoueurs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Deux_1 = null;



        	enterRule();

        try {
            // InternalUnoText.g:187:2: ( ( (kw= 'Nombre de joueur : ' )+ (this_Deux_1= ruleDeux | kw= 'Trois' | kw= 'Quatre' | kw= 'Cinq' | kw= 'Six' | kw= 'Sept' | kw= 'Huit' ) ) )
            // InternalUnoText.g:188:2: ( (kw= 'Nombre de joueur : ' )+ (this_Deux_1= ruleDeux | kw= 'Trois' | kw= 'Quatre' | kw= 'Cinq' | kw= 'Six' | kw= 'Sept' | kw= 'Huit' ) )
            {
            // InternalUnoText.g:188:2: ( (kw= 'Nombre de joueur : ' )+ (this_Deux_1= ruleDeux | kw= 'Trois' | kw= 'Quatre' | kw= 'Cinq' | kw= 'Six' | kw= 'Sept' | kw= 'Huit' ) )
            // InternalUnoText.g:189:3: (kw= 'Nombre de joueur : ' )+ (this_Deux_1= ruleDeux | kw= 'Trois' | kw= 'Quatre' | kw= 'Cinq' | kw= 'Six' | kw= 'Sept' | kw= 'Huit' )
            {
            // InternalUnoText.g:189:3: (kw= 'Nombre de joueur : ' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUnoText.g:190:4: kw= 'Nombre de joueur : '
            	    {
            	    kw=(Token)match(input,11,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getNombreJoueursAccess().getNombreDeJoueurKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalUnoText.g:196:3: (this_Deux_1= ruleDeux | kw= 'Trois' | kw= 'Quatre' | kw= 'Cinq' | kw= 'Six' | kw= 'Sept' | kw= 'Huit' )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalUnoText.g:197:4: this_Deux_1= ruleDeux
                    {

                    				newCompositeNode(grammarAccess.getNombreJoueursAccess().getDeuxParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Deux_1=ruleDeux();

                    state._fsp--;


                    				current.merge(this_Deux_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalUnoText.g:208:4: kw= 'Trois'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNombreJoueursAccess().getTroisKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUnoText.g:214:4: kw= 'Quatre'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNombreJoueursAccess().getQuatreKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalUnoText.g:220:4: kw= 'Cinq'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNombreJoueursAccess().getCinqKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalUnoText.g:226:4: kw= 'Six'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNombreJoueursAccess().getSixKeyword_1_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalUnoText.g:232:4: kw= 'Sept'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNombreJoueursAccess().getSeptKeyword_1_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalUnoText.g:238:4: kw= 'Huit'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNombreJoueursAccess().getHuitKeyword_1_6());
                    			

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
    // $ANTLR end "ruleNombreJoueurs"


    // $ANTLR start "entryRuleDeux"
    // InternalUnoText.g:248:1: entryRuleDeux returns [String current=null] : iv_ruleDeux= ruleDeux EOF ;
    public final String entryRuleDeux() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeux = null;


        try {
            // InternalUnoText.g:248:44: (iv_ruleDeux= ruleDeux EOF )
            // InternalUnoText.g:249:2: iv_ruleDeux= ruleDeux EOF
            {
             newCompositeNode(grammarAccess.getDeuxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeux=ruleDeux();

            state._fsp--;

             current =iv_ruleDeux.getText(); 
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
    // $ANTLR end "entryRuleDeux"


    // $ANTLR start "ruleDeux"
    // InternalUnoText.g:255:1: ruleDeux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Deux : Inverser/Passer_Tour' ;
    public final AntlrDatatypeRuleToken ruleDeux() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUnoText.g:261:2: (kw= 'Deux : Inverser/Passer_Tour' )
            // InternalUnoText.g:262:2: kw= 'Deux : Inverser/Passer_Tour'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDeuxAccess().getDeuxInverserPasser_TourKeyword());
            	

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
    // $ANTLR end "ruleDeux"


    // $ANTLR start "entryRuleUno_Classic"
    // InternalUnoText.g:270:1: entryRuleUno_Classic returns [EObject current=null] : iv_ruleUno_Classic= ruleUno_Classic EOF ;
    public final EObject entryRuleUno_Classic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUno_Classic = null;


        try {
            // InternalUnoText.g:270:52: (iv_ruleUno_Classic= ruleUno_Classic EOF )
            // InternalUnoText.g:271:2: iv_ruleUno_Classic= ruleUno_Classic EOF
            {
             newCompositeNode(grammarAccess.getUno_ClassicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUno_Classic=ruleUno_Classic();

            state._fsp--;

             current =iv_ruleUno_Classic; 
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
    // $ANTLR end "entryRuleUno_Classic"


    // $ANTLR start "ruleUno_Classic"
    // InternalUnoText.g:277:1: ruleUno_Classic returns [EObject current=null] : ( (otherlv_0= 'Uno Classic : ' )+ ( (lv_unoChallenge_1_0= 'UnoChallenge' ) )* ( (lv_carte0_7_2_0= 'Carte0_7' ) )* ( (lv_carteIdentique_3_0= ruleCarteIdentique ) )* ( (lv_cumulAjout_4_0= ruleCumulAjout ) )+ ( (lv_suite_5_0= ruleSuite ) )* ( (lv_pioche_6_0= 'Pioche' ) )* ( (lv_more4_7_0= 'More4' ) )* ( (lv_tempsLimite_8_0= 'tempsLimite' ) )* ( (lv_mauvaiseCarte_9_0= 'mauvaiseCarte' ) )* ( (lv_equipe_10_0= 'equipe' ) )* ( (lv_carteVisibles_11_0= 'CarteVisibles' ) )+ ( (lv_finManche_12_0= ruleFinManche ) )* ( (lv_threeHands_13_0= 'ThreeHands' ) )* ( (lv_threePiles_14_0= 'ThreePiles' ) )* ( (lv_specialCard_15_0= ruleSpecialCard ) )* ( (lv_gameOver_16_0= ruleGameOver ) ) ) ;
    public final EObject ruleUno_Classic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_unoChallenge_1_0=null;
        Token lv_carte0_7_2_0=null;
        Token lv_pioche_6_0=null;
        Token lv_more4_7_0=null;
        Token lv_tempsLimite_8_0=null;
        Token lv_mauvaiseCarte_9_0=null;
        Token lv_equipe_10_0=null;
        Token lv_carteVisibles_11_0=null;
        Token lv_threeHands_13_0=null;
        Token lv_threePiles_14_0=null;
        EObject lv_carteIdentique_3_0 = null;

        EObject lv_cumulAjout_4_0 = null;

        AntlrDatatypeRuleToken lv_suite_5_0 = null;

        AntlrDatatypeRuleToken lv_finManche_12_0 = null;

        AntlrDatatypeRuleToken lv_specialCard_15_0 = null;

        AntlrDatatypeRuleToken lv_gameOver_16_0 = null;



        	enterRule();

        try {
            // InternalUnoText.g:283:2: ( ( (otherlv_0= 'Uno Classic : ' )+ ( (lv_unoChallenge_1_0= 'UnoChallenge' ) )* ( (lv_carte0_7_2_0= 'Carte0_7' ) )* ( (lv_carteIdentique_3_0= ruleCarteIdentique ) )* ( (lv_cumulAjout_4_0= ruleCumulAjout ) )+ ( (lv_suite_5_0= ruleSuite ) )* ( (lv_pioche_6_0= 'Pioche' ) )* ( (lv_more4_7_0= 'More4' ) )* ( (lv_tempsLimite_8_0= 'tempsLimite' ) )* ( (lv_mauvaiseCarte_9_0= 'mauvaiseCarte' ) )* ( (lv_equipe_10_0= 'equipe' ) )* ( (lv_carteVisibles_11_0= 'CarteVisibles' ) )+ ( (lv_finManche_12_0= ruleFinManche ) )* ( (lv_threeHands_13_0= 'ThreeHands' ) )* ( (lv_threePiles_14_0= 'ThreePiles' ) )* ( (lv_specialCard_15_0= ruleSpecialCard ) )* ( (lv_gameOver_16_0= ruleGameOver ) ) ) )
            // InternalUnoText.g:284:2: ( (otherlv_0= 'Uno Classic : ' )+ ( (lv_unoChallenge_1_0= 'UnoChallenge' ) )* ( (lv_carte0_7_2_0= 'Carte0_7' ) )* ( (lv_carteIdentique_3_0= ruleCarteIdentique ) )* ( (lv_cumulAjout_4_0= ruleCumulAjout ) )+ ( (lv_suite_5_0= ruleSuite ) )* ( (lv_pioche_6_0= 'Pioche' ) )* ( (lv_more4_7_0= 'More4' ) )* ( (lv_tempsLimite_8_0= 'tempsLimite' ) )* ( (lv_mauvaiseCarte_9_0= 'mauvaiseCarte' ) )* ( (lv_equipe_10_0= 'equipe' ) )* ( (lv_carteVisibles_11_0= 'CarteVisibles' ) )+ ( (lv_finManche_12_0= ruleFinManche ) )* ( (lv_threeHands_13_0= 'ThreeHands' ) )* ( (lv_threePiles_14_0= 'ThreePiles' ) )* ( (lv_specialCard_15_0= ruleSpecialCard ) )* ( (lv_gameOver_16_0= ruleGameOver ) ) )
            {
            // InternalUnoText.g:284:2: ( (otherlv_0= 'Uno Classic : ' )+ ( (lv_unoChallenge_1_0= 'UnoChallenge' ) )* ( (lv_carte0_7_2_0= 'Carte0_7' ) )* ( (lv_carteIdentique_3_0= ruleCarteIdentique ) )* ( (lv_cumulAjout_4_0= ruleCumulAjout ) )+ ( (lv_suite_5_0= ruleSuite ) )* ( (lv_pioche_6_0= 'Pioche' ) )* ( (lv_more4_7_0= 'More4' ) )* ( (lv_tempsLimite_8_0= 'tempsLimite' ) )* ( (lv_mauvaiseCarte_9_0= 'mauvaiseCarte' ) )* ( (lv_equipe_10_0= 'equipe' ) )* ( (lv_carteVisibles_11_0= 'CarteVisibles' ) )+ ( (lv_finManche_12_0= ruleFinManche ) )* ( (lv_threeHands_13_0= 'ThreeHands' ) )* ( (lv_threePiles_14_0= 'ThreePiles' ) )* ( (lv_specialCard_15_0= ruleSpecialCard ) )* ( (lv_gameOver_16_0= ruleGameOver ) ) )
            // InternalUnoText.g:285:3: (otherlv_0= 'Uno Classic : ' )+ ( (lv_unoChallenge_1_0= 'UnoChallenge' ) )* ( (lv_carte0_7_2_0= 'Carte0_7' ) )* ( (lv_carteIdentique_3_0= ruleCarteIdentique ) )* ( (lv_cumulAjout_4_0= ruleCumulAjout ) )+ ( (lv_suite_5_0= ruleSuite ) )* ( (lv_pioche_6_0= 'Pioche' ) )* ( (lv_more4_7_0= 'More4' ) )* ( (lv_tempsLimite_8_0= 'tempsLimite' ) )* ( (lv_mauvaiseCarte_9_0= 'mauvaiseCarte' ) )* ( (lv_equipe_10_0= 'equipe' ) )* ( (lv_carteVisibles_11_0= 'CarteVisibles' ) )+ ( (lv_finManche_12_0= ruleFinManche ) )* ( (lv_threeHands_13_0= 'ThreeHands' ) )* ( (lv_threePiles_14_0= 'ThreePiles' ) )* ( (lv_specialCard_15_0= ruleSpecialCard ) )* ( (lv_gameOver_16_0= ruleGameOver ) )
            {
            // InternalUnoText.g:285:3: (otherlv_0= 'Uno Classic : ' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUnoText.g:286:4: otherlv_0= 'Uno Classic : '
            	    {
            	    otherlv_0=(Token)match(input,19,FOLLOW_5); 

            	    				newLeafNode(otherlv_0, grammarAccess.getUno_ClassicAccess().getUnoClassicKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalUnoText.g:291:3: ( (lv_unoChallenge_1_0= 'UnoChallenge' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalUnoText.g:292:4: (lv_unoChallenge_1_0= 'UnoChallenge' )
            	    {
            	    // InternalUnoText.g:292:4: (lv_unoChallenge_1_0= 'UnoChallenge' )
            	    // InternalUnoText.g:293:5: lv_unoChallenge_1_0= 'UnoChallenge'
            	    {
            	    lv_unoChallenge_1_0=(Token)match(input,20,FOLLOW_6); 

            	    					newLeafNode(lv_unoChallenge_1_0, grammarAccess.getUno_ClassicAccess().getUnoChallengeUnoChallengeKeyword_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUno_ClassicRule());
            	    					}
            	    					setWithLastConsumed(current, "unoChallenge", lv_unoChallenge_1_0 != null, "UnoChallenge");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalUnoText.g:305:3: ( (lv_carte0_7_2_0= 'Carte0_7' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUnoText.g:306:4: (lv_carte0_7_2_0= 'Carte0_7' )
            	    {
            	    // InternalUnoText.g:306:4: (lv_carte0_7_2_0= 'Carte0_7' )
            	    // InternalUnoText.g:307:5: lv_carte0_7_2_0= 'Carte0_7'
            	    {
            	    lv_carte0_7_2_0=(Token)match(input,21,FOLLOW_6); 

            	    					newLeafNode(lv_carte0_7_2_0, grammarAccess.getUno_ClassicAccess().getCarte0_7Carte0_7Keyword_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUno_ClassicRule());
            	    					}
            	    					setWithLastConsumed(current, "carte0_7", lv_carte0_7_2_0 != null, "Carte0_7");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalUnoText.g:319:3: ( (lv_carteIdentique_3_0= ruleCarteIdentique ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==41) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUnoText.g:320:4: (lv_carteIdentique_3_0= ruleCarteIdentique )
            	    {
            	    // InternalUnoText.g:320:4: (lv_carteIdentique_3_0= ruleCarteIdentique )
            	    // InternalUnoText.g:321:5: lv_carteIdentique_3_0= ruleCarteIdentique
            	    {

            	    					newCompositeNode(grammarAccess.getUno_ClassicAccess().getCarteIdentiqueCarteIdentiqueParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_carteIdentique_3_0=ruleCarteIdentique();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUno_ClassicRule());
            	    					}
            	    					set(
            	    						current,
            	    						"carteIdentique",
            	    						lv_carteIdentique_3_0 != null,
            	    						"org.xtext.example.unotext.UnoText.CarteIdentique");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalUnoText.g:338:3: ( (lv_cumulAjout_4_0= ruleCumulAjout ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==43) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUnoText.g:339:4: (lv_cumulAjout_4_0= ruleCumulAjout )
            	    {
            	    // InternalUnoText.g:339:4: (lv_cumulAjout_4_0= ruleCumulAjout )
            	    // InternalUnoText.g:340:5: lv_cumulAjout_4_0= ruleCumulAjout
            	    {

            	    					newCompositeNode(grammarAccess.getUno_ClassicAccess().getCumulAjoutCumulAjoutParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_cumulAjout_4_0=ruleCumulAjout();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUno_ClassicRule());
            	    					}
            	    					set(
            	    						current,
            	    						"cumulAjout",
            	    						lv_cumulAjout_4_0 != null,
            	    						"org.xtext.example.unotext.UnoText.CumulAjout");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalUnoText.g:357:3: ( (lv_suite_5_0= ruleSuite ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==46||LA9_0==48) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUnoText.g:358:4: (lv_suite_5_0= ruleSuite )
            	    {
            	    // InternalUnoText.g:358:4: (lv_suite_5_0= ruleSuite )
            	    // InternalUnoText.g:359:5: lv_suite_5_0= ruleSuite
            	    {

            	    					newCompositeNode(grammarAccess.getUno_ClassicAccess().getSuiteSuiteParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_suite_5_0=ruleSuite();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUno_ClassicRule());
            	    					}
            	    					set(
            	    						current,
            	    						"suite",
            	    						lv_suite_5_0 != null,
            	    						"org.xtext.example.unotext.UnoText.Suite");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalUnoText.g:376:3: ( (lv_pioche_6_0= 'Pioche' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUnoText.g:377:4: (lv_pioche_6_0= 'Pioche' )
            	    {
            	    // InternalUnoText.g:377:4: (lv_pioche_6_0= 'Pioche' )
            	    // InternalUnoText.g:378:5: lv_pioche_6_0= 'Pioche'
            	    {
            	    lv_pioche_6_0=(Token)match(input,22,FOLLOW_9); 

            	    					newLeafNode(lv_pioche_6_0, grammarAccess.getUno_ClassicAccess().getPiochePiocheKeyword_6_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUno_ClassicRule());
            	    					}
            	    					setWithLastConsumed(current, "pioche", lv_pioche_6_0 != null, "Pioche");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalUnoText.g:390:3: ( (lv_more4_7_0= 'More4' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUnoText.g:391:4: (lv_more4_7_0= 'More4' )
            	    {
            	    // InternalUnoText.g:391:4: (lv_more4_7_0= 'More4' )
            	    // InternalUnoText.g:392:5: lv_more4_7_0= 'More4'
            	    {
            	    lv_more4_7_0=(Token)match(input,23,FOLLOW_10); 

            	    					newLeafNode(lv_more4_7_0, grammarAccess.getUno_ClassicAccess().getMore4More4Keyword_7_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUno_ClassicRule());
            	    					}
            	    					setWithLastConsumed(current, "more4", lv_more4_7_0 != null, "More4");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalUnoText.g:404:3: ( (lv_tempsLimite_8_0= 'tempsLimite' ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUnoText.g:405:4: (lv_tempsLimite_8_0= 'tempsLimite' )
            	    {
            	    // InternalUnoText.g:405:4: (lv_tempsLimite_8_0= 'tempsLimite' )
            	    // InternalUnoText.g:406:5: lv_tempsLimite_8_0= 'tempsLimite'
            	    {
            	    lv_tempsLimite_8_0=(Token)match(input,24,FOLLOW_11); 

            	    					newLeafNode(lv_tempsLimite_8_0, grammarAccess.getUno_ClassicAccess().getTempsLimiteTempsLimiteKeyword_8_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUno_ClassicRule());
            	    					}
            	    					setWithLastConsumed(current, "tempsLimite", lv_tempsLimite_8_0 != null, "tempsLimite");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalUnoText.g:418:3: ( (lv_mauvaiseCarte_9_0= 'mauvaiseCarte' ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUnoText.g:419:4: (lv_mauvaiseCarte_9_0= 'mauvaiseCarte' )
            	    {
            	    // InternalUnoText.g:419:4: (lv_mauvaiseCarte_9_0= 'mauvaiseCarte' )
            	    // InternalUnoText.g:420:5: lv_mauvaiseCarte_9_0= 'mauvaiseCarte'
            	    {
            	    lv_mauvaiseCarte_9_0=(Token)match(input,25,FOLLOW_12); 

            	    					newLeafNode(lv_mauvaiseCarte_9_0, grammarAccess.getUno_ClassicAccess().getMauvaiseCarteMauvaiseCarteKeyword_9_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUno_ClassicRule());
            	    					}
            	    					setWithLastConsumed(current, "mauvaiseCarte", lv_mauvaiseCarte_9_0 != null, "mauvaiseCarte");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalUnoText.g:432:3: ( (lv_equipe_10_0= 'equipe' ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUnoText.g:433:4: (lv_equipe_10_0= 'equipe' )
            	    {
            	    // InternalUnoText.g:433:4: (lv_equipe_10_0= 'equipe' )
            	    // InternalUnoText.g:434:5: lv_equipe_10_0= 'equipe'
            	    {
            	    lv_equipe_10_0=(Token)match(input,26,FOLLOW_13); 

            	    					newLeafNode(lv_equipe_10_0, grammarAccess.getUno_ClassicAccess().getEquipeEquipeKeyword_10_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUno_ClassicRule());
            	    					}
            	    					setWithLastConsumed(current, "equipe", lv_equipe_10_0 != null, "equipe");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalUnoText.g:446:3: ( (lv_carteVisibles_11_0= 'CarteVisibles' ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUnoText.g:447:4: (lv_carteVisibles_11_0= 'CarteVisibles' )
            	    {
            	    // InternalUnoText.g:447:4: (lv_carteVisibles_11_0= 'CarteVisibles' )
            	    // InternalUnoText.g:448:5: lv_carteVisibles_11_0= 'CarteVisibles'
            	    {
            	    lv_carteVisibles_11_0=(Token)match(input,27,FOLLOW_14); 

            	    					newLeafNode(lv_carteVisibles_11_0, grammarAccess.getUno_ClassicAccess().getCarteVisiblesCarteVisiblesKeyword_11_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUno_ClassicRule());
            	    					}
            	    					setWithLastConsumed(current, "carteVisibles", lv_carteVisibles_11_0 != null, "CarteVisibles");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // InternalUnoText.g:460:3: ( (lv_finManche_12_0= ruleFinManche ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==38) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUnoText.g:461:4: (lv_finManche_12_0= ruleFinManche )
            	    {
            	    // InternalUnoText.g:461:4: (lv_finManche_12_0= ruleFinManche )
            	    // InternalUnoText.g:462:5: lv_finManche_12_0= ruleFinManche
            	    {

            	    					newCompositeNode(grammarAccess.getUno_ClassicAccess().getFinMancheFinMancheParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_finManche_12_0=ruleFinManche();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUno_ClassicRule());
            	    					}
            	    					set(
            	    						current,
            	    						"finManche",
            	    						lv_finManche_12_0 != null,
            	    						"org.xtext.example.unotext.UnoText.FinManche");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalUnoText.g:479:3: ( (lv_threeHands_13_0= 'ThreeHands' ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUnoText.g:480:4: (lv_threeHands_13_0= 'ThreeHands' )
            	    {
            	    // InternalUnoText.g:480:4: (lv_threeHands_13_0= 'ThreeHands' )
            	    // InternalUnoText.g:481:5: lv_threeHands_13_0= 'ThreeHands'
            	    {
            	    lv_threeHands_13_0=(Token)match(input,28,FOLLOW_15); 

            	    					newLeafNode(lv_threeHands_13_0, grammarAccess.getUno_ClassicAccess().getThreeHandsThreeHandsKeyword_13_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUno_ClassicRule());
            	    					}
            	    					setWithLastConsumed(current, "threeHands", lv_threeHands_13_0 != null, "ThreeHands");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalUnoText.g:493:3: ( (lv_threePiles_14_0= 'ThreePiles' ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUnoText.g:494:4: (lv_threePiles_14_0= 'ThreePiles' )
            	    {
            	    // InternalUnoText.g:494:4: (lv_threePiles_14_0= 'ThreePiles' )
            	    // InternalUnoText.g:495:5: lv_threePiles_14_0= 'ThreePiles'
            	    {
            	    lv_threePiles_14_0=(Token)match(input,29,FOLLOW_15); 

            	    					newLeafNode(lv_threePiles_14_0, grammarAccess.getUno_ClassicAccess().getThreePilesThreePilesKeyword_14_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUno_ClassicRule());
            	    					}
            	    					setWithLastConsumed(current, "threePiles", lv_threePiles_14_0 != null, "ThreePiles");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalUnoText.g:507:3: ( (lv_specialCard_15_0= ruleSpecialCard ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUnoText.g:508:4: (lv_specialCard_15_0= ruleSpecialCard )
            	    {
            	    // InternalUnoText.g:508:4: (lv_specialCard_15_0= ruleSpecialCard )
            	    // InternalUnoText.g:509:5: lv_specialCard_15_0= ruleSpecialCard
            	    {

            	    					newCompositeNode(grammarAccess.getUno_ClassicAccess().getSpecialCardSpecialCardParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_specialCard_15_0=ruleSpecialCard();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUno_ClassicRule());
            	    					}
            	    					set(
            	    						current,
            	    						"specialCard",
            	    						lv_specialCard_15_0 != null,
            	    						"org.xtext.example.unotext.UnoText.SpecialCard");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalUnoText.g:526:3: ( (lv_gameOver_16_0= ruleGameOver ) )
            // InternalUnoText.g:527:4: (lv_gameOver_16_0= ruleGameOver )
            {
            // InternalUnoText.g:527:4: (lv_gameOver_16_0= ruleGameOver )
            // InternalUnoText.g:528:5: lv_gameOver_16_0= ruleGameOver
            {

            					newCompositeNode(grammarAccess.getUno_ClassicAccess().getGameOverGameOverParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_2);
            lv_gameOver_16_0=ruleGameOver();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUno_ClassicRule());
            					}
            					set(
            						current,
            						"gameOver",
            						lv_gameOver_16_0,
            						"org.xtext.example.unotext.UnoText.GameOver");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleUno_Classic"


    // $ANTLR start "entryRuleSpecialCard"
    // InternalUnoText.g:549:1: entryRuleSpecialCard returns [String current=null] : iv_ruleSpecialCard= ruleSpecialCard EOF ;
    public final String entryRuleSpecialCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpecialCard = null;


        try {
            // InternalUnoText.g:549:51: (iv_ruleSpecialCard= ruleSpecialCard EOF )
            // InternalUnoText.g:550:2: iv_ruleSpecialCard= ruleSpecialCard EOF
            {
             newCompositeNode(grammarAccess.getSpecialCardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecialCard=ruleSpecialCard();

            state._fsp--;

             current =iv_ruleSpecialCard.getText(); 
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
    // $ANTLR end "entryRuleSpecialCard"


    // $ANTLR start "ruleSpecialCard"
    // InternalUnoText.g:556:1: ruleSpecialCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'SpecialCard : ' )+ (kw= 'Roulette' | kw= 'Showdown' | kw= 'Classique' ) ) ;
    public final AntlrDatatypeRuleToken ruleSpecialCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUnoText.g:562:2: ( ( (kw= 'SpecialCard : ' )+ (kw= 'Roulette' | kw= 'Showdown' | kw= 'Classique' ) ) )
            // InternalUnoText.g:563:2: ( (kw= 'SpecialCard : ' )+ (kw= 'Roulette' | kw= 'Showdown' | kw= 'Classique' ) )
            {
            // InternalUnoText.g:563:2: ( (kw= 'SpecialCard : ' )+ (kw= 'Roulette' | kw= 'Showdown' | kw= 'Classique' ) )
            // InternalUnoText.g:564:3: (kw= 'SpecialCard : ' )+ (kw= 'Roulette' | kw= 'Showdown' | kw= 'Classique' )
            {
            // InternalUnoText.g:564:3: (kw= 'SpecialCard : ' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUnoText.g:565:4: kw= 'SpecialCard : '
            	    {
            	    kw=(Token)match(input,30,FOLLOW_16); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getSpecialCardAccess().getSpecialCardKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            // InternalUnoText.g:571:3: (kw= 'Roulette' | kw= 'Showdown' | kw= 'Classique' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt21=1;
                }
                break;
            case 32:
                {
                alt21=2;
                }
                break;
            case 33:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalUnoText.g:572:4: kw= 'Roulette'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSpecialCardAccess().getRouletteKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUnoText.g:578:4: kw= 'Showdown'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSpecialCardAccess().getShowdownKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUnoText.g:584:4: kw= 'Classique'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSpecialCardAccess().getClassiqueKeyword_1_2());
                    			

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
    // $ANTLR end "ruleSpecialCard"


    // $ANTLR start "entryRuleGameOver"
    // InternalUnoText.g:594:1: entryRuleGameOver returns [String current=null] : iv_ruleGameOver= ruleGameOver EOF ;
    public final String entryRuleGameOver() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGameOver = null;


        try {
            // InternalUnoText.g:594:48: (iv_ruleGameOver= ruleGameOver EOF )
            // InternalUnoText.g:595:2: iv_ruleGameOver= ruleGameOver EOF
            {
             newCompositeNode(grammarAccess.getGameOverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGameOver=ruleGameOver();

            state._fsp--;

             current =iv_ruleGameOver.getText(); 
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
    // $ANTLR end "entryRuleGameOver"


    // $ANTLR start "ruleGameOver"
    // InternalUnoText.g:601:1: ruleGameOver returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'GameOver : ' )+ (kw= 'Avoir500' | kw= 'NePasAvoir500' | kw= 'nombredeManchesGagn\\u00E9s' ) ) ;
    public final AntlrDatatypeRuleToken ruleGameOver() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUnoText.g:607:2: ( ( (kw= 'GameOver : ' )+ (kw= 'Avoir500' | kw= 'NePasAvoir500' | kw= 'nombredeManchesGagn\\u00E9s' ) ) )
            // InternalUnoText.g:608:2: ( (kw= 'GameOver : ' )+ (kw= 'Avoir500' | kw= 'NePasAvoir500' | kw= 'nombredeManchesGagn\\u00E9s' ) )
            {
            // InternalUnoText.g:608:2: ( (kw= 'GameOver : ' )+ (kw= 'Avoir500' | kw= 'NePasAvoir500' | kw= 'nombredeManchesGagn\\u00E9s' ) )
            // InternalUnoText.g:609:3: (kw= 'GameOver : ' )+ (kw= 'Avoir500' | kw= 'NePasAvoir500' | kw= 'nombredeManchesGagn\\u00E9s' )
            {
            // InternalUnoText.g:609:3: (kw= 'GameOver : ' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==34) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalUnoText.g:610:4: kw= 'GameOver : '
            	    {
            	    kw=(Token)match(input,34,FOLLOW_17); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getGameOverAccess().getGameOverKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            // InternalUnoText.g:616:3: (kw= 'Avoir500' | kw= 'NePasAvoir500' | kw= 'nombredeManchesGagn\\u00E9s' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt23=1;
                }
                break;
            case 36:
                {
                alt23=2;
                }
                break;
            case 37:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalUnoText.g:617:4: kw= 'Avoir500'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getGameOverAccess().getAvoir500Keyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUnoText.g:623:4: kw= 'NePasAvoir500'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getGameOverAccess().getNePasAvoir500Keyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUnoText.g:629:4: kw= 'nombredeManchesGagn\\u00E9s'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getGameOverAccess().getNombredeManchesGagnSKeyword_1_2());
                    			

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
    // $ANTLR end "ruleGameOver"


    // $ANTLR start "entryRuleFinManche"
    // InternalUnoText.g:639:1: entryRuleFinManche returns [String current=null] : iv_ruleFinManche= ruleFinManche EOF ;
    public final String entryRuleFinManche() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFinManche = null;


        try {
            // InternalUnoText.g:639:49: (iv_ruleFinManche= ruleFinManche EOF )
            // InternalUnoText.g:640:2: iv_ruleFinManche= ruleFinManche EOF
            {
             newCompositeNode(grammarAccess.getFinMancheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinManche=ruleFinManche();

            state._fsp--;

             current =iv_ruleFinManche.getText(); 
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
    // $ANTLR end "entryRuleFinManche"


    // $ANTLR start "ruleFinManche"
    // InternalUnoText.g:646:1: ruleFinManche returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'FinManche : ' )+ (kw= 'Reste1Carte' | kw= 'Aumoins4CartesMemeChiffre' ) ) ;
    public final AntlrDatatypeRuleToken ruleFinManche() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUnoText.g:652:2: ( ( (kw= 'FinManche : ' )+ (kw= 'Reste1Carte' | kw= 'Aumoins4CartesMemeChiffre' ) ) )
            // InternalUnoText.g:653:2: ( (kw= 'FinManche : ' )+ (kw= 'Reste1Carte' | kw= 'Aumoins4CartesMemeChiffre' ) )
            {
            // InternalUnoText.g:653:2: ( (kw= 'FinManche : ' )+ (kw= 'Reste1Carte' | kw= 'Aumoins4CartesMemeChiffre' ) )
            // InternalUnoText.g:654:3: (kw= 'FinManche : ' )+ (kw= 'Reste1Carte' | kw= 'Aumoins4CartesMemeChiffre' )
            {
            // InternalUnoText.g:654:3: (kw= 'FinManche : ' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalUnoText.g:655:4: kw= 'FinManche : '
            	    {
            	    kw=(Token)match(input,38,FOLLOW_18); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFinMancheAccess().getFinMancheKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            // InternalUnoText.g:661:3: (kw= 'Reste1Carte' | kw= 'Aumoins4CartesMemeChiffre' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            else if ( (LA25_0==40) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalUnoText.g:662:4: kw= 'Reste1Carte'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFinMancheAccess().getReste1CarteKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUnoText.g:668:4: kw= 'Aumoins4CartesMemeChiffre'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFinMancheAccess().getAumoins4CartesMemeChiffreKeyword_1_1());
                    			

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
    // $ANTLR end "ruleFinManche"


    // $ANTLR start "entryRuleCarteIdentique"
    // InternalUnoText.g:678:1: entryRuleCarteIdentique returns [EObject current=null] : iv_ruleCarteIdentique= ruleCarteIdentique EOF ;
    public final EObject entryRuleCarteIdentique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarteIdentique = null;


        try {
            // InternalUnoText.g:678:55: (iv_ruleCarteIdentique= ruleCarteIdentique EOF )
            // InternalUnoText.g:679:2: iv_ruleCarteIdentique= ruleCarteIdentique EOF
            {
             newCompositeNode(grammarAccess.getCarteIdentiqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCarteIdentique=ruleCarteIdentique();

            state._fsp--;

             current =iv_ruleCarteIdentique; 
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
    // $ANTLR end "entryRuleCarteIdentique"


    // $ANTLR start "ruleCarteIdentique"
    // InternalUnoText.g:685:1: ruleCarteIdentique returns [EObject current=null] : ( (otherlv_0= 'CarteIdentiQUE' )+ ( (lv_AvecCouleur_1_0= 'AvecCouleur' ) )? ) ;
    public final EObject ruleCarteIdentique() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_AvecCouleur_1_0=null;


        	enterRule();

        try {
            // InternalUnoText.g:691:2: ( ( (otherlv_0= 'CarteIdentiQUE' )+ ( (lv_AvecCouleur_1_0= 'AvecCouleur' ) )? ) )
            // InternalUnoText.g:692:2: ( (otherlv_0= 'CarteIdentiQUE' )+ ( (lv_AvecCouleur_1_0= 'AvecCouleur' ) )? )
            {
            // InternalUnoText.g:692:2: ( (otherlv_0= 'CarteIdentiQUE' )+ ( (lv_AvecCouleur_1_0= 'AvecCouleur' ) )? )
            // InternalUnoText.g:693:3: (otherlv_0= 'CarteIdentiQUE' )+ ( (lv_AvecCouleur_1_0= 'AvecCouleur' ) )?
            {
            // InternalUnoText.g:693:3: (otherlv_0= 'CarteIdentiQUE' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==41) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUnoText.g:694:4: otherlv_0= 'CarteIdentiQUE'
            	    {
            	    otherlv_0=(Token)match(input,41,FOLLOW_19); 

            	    				newLeafNode(otherlv_0, grammarAccess.getCarteIdentiqueAccess().getCarteIdentiQUEKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            // InternalUnoText.g:699:3: ( (lv_AvecCouleur_1_0= 'AvecCouleur' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUnoText.g:700:4: (lv_AvecCouleur_1_0= 'AvecCouleur' )
                    {
                    // InternalUnoText.g:700:4: (lv_AvecCouleur_1_0= 'AvecCouleur' )
                    // InternalUnoText.g:701:5: lv_AvecCouleur_1_0= 'AvecCouleur'
                    {
                    lv_AvecCouleur_1_0=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_AvecCouleur_1_0, grammarAccess.getCarteIdentiqueAccess().getAvecCouleurAvecCouleurKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCarteIdentiqueRule());
                    					}
                    					setWithLastConsumed(current, "AvecCouleur", lv_AvecCouleur_1_0 != null, "AvecCouleur");
                    				

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
    // $ANTLR end "ruleCarteIdentique"


    // $ANTLR start "entryRuleCumulAjout"
    // InternalUnoText.g:717:1: entryRuleCumulAjout returns [EObject current=null] : iv_ruleCumulAjout= ruleCumulAjout EOF ;
    public final EObject entryRuleCumulAjout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCumulAjout = null;


        try {
            // InternalUnoText.g:717:51: (iv_ruleCumulAjout= ruleCumulAjout EOF )
            // InternalUnoText.g:718:2: iv_ruleCumulAjout= ruleCumulAjout EOF
            {
             newCompositeNode(grammarAccess.getCumulAjoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCumulAjout=ruleCumulAjout();

            state._fsp--;

             current =iv_ruleCumulAjout; 
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
    // $ANTLR end "entryRuleCumulAjout"


    // $ANTLR start "ruleCumulAjout"
    // InternalUnoText.g:724:1: ruleCumulAjout returns [EObject current=null] : ( (otherlv_0= 'CumulAjout' )+ ( (lv_plus2_1_0= 'PLus2' ) )* ( (lv_plus4_2_0= 'PLus4' ) )? ) ;
    public final EObject ruleCumulAjout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_plus2_1_0=null;
        Token lv_plus4_2_0=null;


        	enterRule();

        try {
            // InternalUnoText.g:730:2: ( ( (otherlv_0= 'CumulAjout' )+ ( (lv_plus2_1_0= 'PLus2' ) )* ( (lv_plus4_2_0= 'PLus4' ) )? ) )
            // InternalUnoText.g:731:2: ( (otherlv_0= 'CumulAjout' )+ ( (lv_plus2_1_0= 'PLus2' ) )* ( (lv_plus4_2_0= 'PLus4' ) )? )
            {
            // InternalUnoText.g:731:2: ( (otherlv_0= 'CumulAjout' )+ ( (lv_plus2_1_0= 'PLus2' ) )* ( (lv_plus4_2_0= 'PLus4' ) )? )
            // InternalUnoText.g:732:3: (otherlv_0= 'CumulAjout' )+ ( (lv_plus2_1_0= 'PLus2' ) )* ( (lv_plus4_2_0= 'PLus4' ) )?
            {
            // InternalUnoText.g:732:3: (otherlv_0= 'CumulAjout' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==43) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUnoText.g:733:4: otherlv_0= 'CumulAjout'
            	    {
            	    otherlv_0=(Token)match(input,43,FOLLOW_20); 

            	    				newLeafNode(otherlv_0, grammarAccess.getCumulAjoutAccess().getCumulAjoutKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            // InternalUnoText.g:738:3: ( (lv_plus2_1_0= 'PLus2' ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==44) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalUnoText.g:739:4: (lv_plus2_1_0= 'PLus2' )
            	    {
            	    // InternalUnoText.g:739:4: (lv_plus2_1_0= 'PLus2' )
            	    // InternalUnoText.g:740:5: lv_plus2_1_0= 'PLus2'
            	    {
            	    lv_plus2_1_0=(Token)match(input,44,FOLLOW_21); 

            	    					newLeafNode(lv_plus2_1_0, grammarAccess.getCumulAjoutAccess().getPlus2PLus2Keyword_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCumulAjoutRule());
            	    					}
            	    					setWithLastConsumed(current, "plus2", lv_plus2_1_0 != null, "PLus2");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalUnoText.g:752:3: ( (lv_plus4_2_0= 'PLus4' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==45) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUnoText.g:753:4: (lv_plus4_2_0= 'PLus4' )
                    {
                    // InternalUnoText.g:753:4: (lv_plus4_2_0= 'PLus4' )
                    // InternalUnoText.g:754:5: lv_plus4_2_0= 'PLus4'
                    {
                    lv_plus4_2_0=(Token)match(input,45,FOLLOW_2); 

                    					newLeafNode(lv_plus4_2_0, grammarAccess.getCumulAjoutAccess().getPlus4PLus4Keyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCumulAjoutRule());
                    					}
                    					setWithLastConsumed(current, "plus4", lv_plus4_2_0 != null, "PLus4");
                    				

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
    // $ANTLR end "ruleCumulAjout"


    // $ANTLR start "entryRuleSuite"
    // InternalUnoText.g:770:1: entryRuleSuite returns [String current=null] : iv_ruleSuite= ruleSuite EOF ;
    public final String entryRuleSuite() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSuite = null;


        try {
            // InternalUnoText.g:770:45: (iv_ruleSuite= ruleSuite EOF )
            // InternalUnoText.g:771:2: iv_ruleSuite= ruleSuite EOF
            {
             newCompositeNode(grammarAccess.getSuiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuite=ruleSuite();

            state._fsp--;

             current =iv_ruleSuite.getText(); 
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
    // $ANTLR end "entryRuleSuite"


    // $ANTLR start "ruleSuite"
    // InternalUnoText.g:777:1: ruleSuite returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'Suite : ' )+ kw= 'Simple' ) | kw= 'Royale' ) ;
    public final AntlrDatatypeRuleToken ruleSuite() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUnoText.g:783:2: ( ( ( (kw= 'Suite : ' )+ kw= 'Simple' ) | kw= 'Royale' ) )
            // InternalUnoText.g:784:2: ( ( (kw= 'Suite : ' )+ kw= 'Simple' ) | kw= 'Royale' )
            {
            // InternalUnoText.g:784:2: ( ( (kw= 'Suite : ' )+ kw= 'Simple' ) | kw= 'Royale' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            else if ( (LA32_0==48) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalUnoText.g:785:3: ( (kw= 'Suite : ' )+ kw= 'Simple' )
                    {
                    // InternalUnoText.g:785:3: ( (kw= 'Suite : ' )+ kw= 'Simple' )
                    // InternalUnoText.g:786:4: (kw= 'Suite : ' )+ kw= 'Simple'
                    {
                    // InternalUnoText.g:786:4: (kw= 'Suite : ' )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==46) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalUnoText.g:787:5: kw= 'Suite : '
                    	    {
                    	    kw=(Token)match(input,46,FOLLOW_22); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getSuiteAccess().getSuiteKeyword_0_0());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    kw=(Token)match(input,47,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSuiteAccess().getSimpleKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoText.g:800:3: kw= 'Royale'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSuiteAccess().getRoyaleKeyword_1());
                    		

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
    // $ANTLR end "ruleSuite"


    // $ANTLR start "entryRuleUnoOlypique"
    // InternalUnoText.g:809:1: entryRuleUnoOlypique returns [EObject current=null] : iv_ruleUnoOlypique= ruleUnoOlypique EOF ;
    public final EObject entryRuleUnoOlypique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnoOlypique = null;


        try {
            // InternalUnoText.g:809:52: (iv_ruleUnoOlypique= ruleUnoOlypique EOF )
            // InternalUnoText.g:810:2: iv_ruleUnoOlypique= ruleUnoOlypique EOF
            {
             newCompositeNode(grammarAccess.getUnoOlypiqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnoOlypique=ruleUnoOlypique();

            state._fsp--;

             current =iv_ruleUnoOlypique; 
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
    // $ANTLR end "entryRuleUnoOlypique"


    // $ANTLR start "ruleUnoOlypique"
    // InternalUnoText.g:816:1: ruleUnoOlypique returns [EObject current=null] : ( (otherlv_0= 'UnoOlympique : ' )+ ( (lv_TribunalPopulaire_1_0= 'TribunalPopulaire' ) )+ ( (lv_DistributionAleatoire_2_0= 'DistributionAleatoire' ) )+ ( (lv_SensDefini_3_0= 'SensDefini' ) )+ ( (lv_ChangementDonneur_4_0= 'ChangementDonneur' ) )+ ( (lv_VueDesCartesApres1erPose_5_0= 'VueDesCartesApres1erPose' ) )+ ( (lv_DonneurPremierose_6_0= 'DonneurPremierose' ) )+ ( (lv_JeuRapide_7_0= 'JeuRapide' ) )+ ( (lv_Interception_8_0= 'Interception' ) )+ ( (lv_DeuxCartesIdentiques_9_0= 'DeuxCartesIdentiques' ) )+ ( (lv_DecisionCarte_10_0= 'DecisionCarte' ) )+ ( (lv_Surenchere_11_0= 'Surenchere' ) )+ ( (lv_cartezero_12_0= 'Carte0' ) )* ( (lv_CarteSept_13_0= 'Carte7' ) )* ( (lv_Carte2_14_0= 'Carte2' ) )+ ( (lv_ValeurCarte_15_0= 'ValeurCarte' ) ) ) ;
    public final EObject ruleUnoOlypique() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_TribunalPopulaire_1_0=null;
        Token lv_DistributionAleatoire_2_0=null;
        Token lv_SensDefini_3_0=null;
        Token lv_ChangementDonneur_4_0=null;
        Token lv_VueDesCartesApres1erPose_5_0=null;
        Token lv_DonneurPremierose_6_0=null;
        Token lv_JeuRapide_7_0=null;
        Token lv_Interception_8_0=null;
        Token lv_DeuxCartesIdentiques_9_0=null;
        Token lv_DecisionCarte_10_0=null;
        Token lv_Surenchere_11_0=null;
        Token lv_cartezero_12_0=null;
        Token lv_CarteSept_13_0=null;
        Token lv_Carte2_14_0=null;
        Token lv_ValeurCarte_15_0=null;


        	enterRule();

        try {
            // InternalUnoText.g:822:2: ( ( (otherlv_0= 'UnoOlympique : ' )+ ( (lv_TribunalPopulaire_1_0= 'TribunalPopulaire' ) )+ ( (lv_DistributionAleatoire_2_0= 'DistributionAleatoire' ) )+ ( (lv_SensDefini_3_0= 'SensDefini' ) )+ ( (lv_ChangementDonneur_4_0= 'ChangementDonneur' ) )+ ( (lv_VueDesCartesApres1erPose_5_0= 'VueDesCartesApres1erPose' ) )+ ( (lv_DonneurPremierose_6_0= 'DonneurPremierose' ) )+ ( (lv_JeuRapide_7_0= 'JeuRapide' ) )+ ( (lv_Interception_8_0= 'Interception' ) )+ ( (lv_DeuxCartesIdentiques_9_0= 'DeuxCartesIdentiques' ) )+ ( (lv_DecisionCarte_10_0= 'DecisionCarte' ) )+ ( (lv_Surenchere_11_0= 'Surenchere' ) )+ ( (lv_cartezero_12_0= 'Carte0' ) )* ( (lv_CarteSept_13_0= 'Carte7' ) )* ( (lv_Carte2_14_0= 'Carte2' ) )+ ( (lv_ValeurCarte_15_0= 'ValeurCarte' ) ) ) )
            // InternalUnoText.g:823:2: ( (otherlv_0= 'UnoOlympique : ' )+ ( (lv_TribunalPopulaire_1_0= 'TribunalPopulaire' ) )+ ( (lv_DistributionAleatoire_2_0= 'DistributionAleatoire' ) )+ ( (lv_SensDefini_3_0= 'SensDefini' ) )+ ( (lv_ChangementDonneur_4_0= 'ChangementDonneur' ) )+ ( (lv_VueDesCartesApres1erPose_5_0= 'VueDesCartesApres1erPose' ) )+ ( (lv_DonneurPremierose_6_0= 'DonneurPremierose' ) )+ ( (lv_JeuRapide_7_0= 'JeuRapide' ) )+ ( (lv_Interception_8_0= 'Interception' ) )+ ( (lv_DeuxCartesIdentiques_9_0= 'DeuxCartesIdentiques' ) )+ ( (lv_DecisionCarte_10_0= 'DecisionCarte' ) )+ ( (lv_Surenchere_11_0= 'Surenchere' ) )+ ( (lv_cartezero_12_0= 'Carte0' ) )* ( (lv_CarteSept_13_0= 'Carte7' ) )* ( (lv_Carte2_14_0= 'Carte2' ) )+ ( (lv_ValeurCarte_15_0= 'ValeurCarte' ) ) )
            {
            // InternalUnoText.g:823:2: ( (otherlv_0= 'UnoOlympique : ' )+ ( (lv_TribunalPopulaire_1_0= 'TribunalPopulaire' ) )+ ( (lv_DistributionAleatoire_2_0= 'DistributionAleatoire' ) )+ ( (lv_SensDefini_3_0= 'SensDefini' ) )+ ( (lv_ChangementDonneur_4_0= 'ChangementDonneur' ) )+ ( (lv_VueDesCartesApres1erPose_5_0= 'VueDesCartesApres1erPose' ) )+ ( (lv_DonneurPremierose_6_0= 'DonneurPremierose' ) )+ ( (lv_JeuRapide_7_0= 'JeuRapide' ) )+ ( (lv_Interception_8_0= 'Interception' ) )+ ( (lv_DeuxCartesIdentiques_9_0= 'DeuxCartesIdentiques' ) )+ ( (lv_DecisionCarte_10_0= 'DecisionCarte' ) )+ ( (lv_Surenchere_11_0= 'Surenchere' ) )+ ( (lv_cartezero_12_0= 'Carte0' ) )* ( (lv_CarteSept_13_0= 'Carte7' ) )* ( (lv_Carte2_14_0= 'Carte2' ) )+ ( (lv_ValeurCarte_15_0= 'ValeurCarte' ) ) )
            // InternalUnoText.g:824:3: (otherlv_0= 'UnoOlympique : ' )+ ( (lv_TribunalPopulaire_1_0= 'TribunalPopulaire' ) )+ ( (lv_DistributionAleatoire_2_0= 'DistributionAleatoire' ) )+ ( (lv_SensDefini_3_0= 'SensDefini' ) )+ ( (lv_ChangementDonneur_4_0= 'ChangementDonneur' ) )+ ( (lv_VueDesCartesApres1erPose_5_0= 'VueDesCartesApres1erPose' ) )+ ( (lv_DonneurPremierose_6_0= 'DonneurPremierose' ) )+ ( (lv_JeuRapide_7_0= 'JeuRapide' ) )+ ( (lv_Interception_8_0= 'Interception' ) )+ ( (lv_DeuxCartesIdentiques_9_0= 'DeuxCartesIdentiques' ) )+ ( (lv_DecisionCarte_10_0= 'DecisionCarte' ) )+ ( (lv_Surenchere_11_0= 'Surenchere' ) )+ ( (lv_cartezero_12_0= 'Carte0' ) )* ( (lv_CarteSept_13_0= 'Carte7' ) )* ( (lv_Carte2_14_0= 'Carte2' ) )+ ( (lv_ValeurCarte_15_0= 'ValeurCarte' ) )
            {
            // InternalUnoText.g:824:3: (otherlv_0= 'UnoOlympique : ' )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==49) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalUnoText.g:825:4: otherlv_0= 'UnoOlympique : '
            	    {
            	    otherlv_0=(Token)match(input,49,FOLLOW_23); 

            	    				newLeafNode(otherlv_0, grammarAccess.getUnoOlypiqueAccess().getUnoOlympiqueKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            // InternalUnoText.g:830:3: ( (lv_TribunalPopulaire_1_0= 'TribunalPopulaire' ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==50) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalUnoText.g:831:4: (lv_TribunalPopulaire_1_0= 'TribunalPopulaire' )
            	    {
            	    // InternalUnoText.g:831:4: (lv_TribunalPopulaire_1_0= 'TribunalPopulaire' )
            	    // InternalUnoText.g:832:5: lv_TribunalPopulaire_1_0= 'TribunalPopulaire'
            	    {
            	    lv_TribunalPopulaire_1_0=(Token)match(input,50,FOLLOW_24); 

            	    					newLeafNode(lv_TribunalPopulaire_1_0, grammarAccess.getUnoOlypiqueAccess().getTribunalPopulaireTribunalPopulaireKeyword_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoOlypiqueRule());
            	    					}
            	    					setWithLastConsumed(current, "TribunalPopulaire", lv_TribunalPopulaire_1_0, "TribunalPopulaire");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            // InternalUnoText.g:844:3: ( (lv_DistributionAleatoire_2_0= 'DistributionAleatoire' ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==51) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalUnoText.g:845:4: (lv_DistributionAleatoire_2_0= 'DistributionAleatoire' )
            	    {
            	    // InternalUnoText.g:845:4: (lv_DistributionAleatoire_2_0= 'DistributionAleatoire' )
            	    // InternalUnoText.g:846:5: lv_DistributionAleatoire_2_0= 'DistributionAleatoire'
            	    {
            	    lv_DistributionAleatoire_2_0=(Token)match(input,51,FOLLOW_25); 

            	    					newLeafNode(lv_DistributionAleatoire_2_0, grammarAccess.getUnoOlypiqueAccess().getDistributionAleatoireDistributionAleatoireKeyword_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoOlypiqueRule());
            	    					}
            	    					setWithLastConsumed(current, "DistributionAleatoire", lv_DistributionAleatoire_2_0, "DistributionAleatoire");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            // InternalUnoText.g:858:3: ( (lv_SensDefini_3_0= 'SensDefini' ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==52) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalUnoText.g:859:4: (lv_SensDefini_3_0= 'SensDefini' )
            	    {
            	    // InternalUnoText.g:859:4: (lv_SensDefini_3_0= 'SensDefini' )
            	    // InternalUnoText.g:860:5: lv_SensDefini_3_0= 'SensDefini'
            	    {
            	    lv_SensDefini_3_0=(Token)match(input,52,FOLLOW_26); 

            	    					newLeafNode(lv_SensDefini_3_0, grammarAccess.getUnoOlypiqueAccess().getSensDefiniSensDefiniKeyword_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoOlypiqueRule());
            	    					}
            	    					setWithLastConsumed(current, "SensDefini", lv_SensDefini_3_0, "SensDefini");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            // InternalUnoText.g:872:3: ( (lv_ChangementDonneur_4_0= 'ChangementDonneur' ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==53) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalUnoText.g:873:4: (lv_ChangementDonneur_4_0= 'ChangementDonneur' )
            	    {
            	    // InternalUnoText.g:873:4: (lv_ChangementDonneur_4_0= 'ChangementDonneur' )
            	    // InternalUnoText.g:874:5: lv_ChangementDonneur_4_0= 'ChangementDonneur'
            	    {
            	    lv_ChangementDonneur_4_0=(Token)match(input,53,FOLLOW_27); 

            	    					newLeafNode(lv_ChangementDonneur_4_0, grammarAccess.getUnoOlypiqueAccess().getChangementDonneurChangementDonneurKeyword_4_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoOlypiqueRule());
            	    					}
            	    					setWithLastConsumed(current, "ChangementDonneur", lv_ChangementDonneur_4_0, "ChangementDonneur");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            // InternalUnoText.g:886:3: ( (lv_VueDesCartesApres1erPose_5_0= 'VueDesCartesApres1erPose' ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==54) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalUnoText.g:887:4: (lv_VueDesCartesApres1erPose_5_0= 'VueDesCartesApres1erPose' )
            	    {
            	    // InternalUnoText.g:887:4: (lv_VueDesCartesApres1erPose_5_0= 'VueDesCartesApres1erPose' )
            	    // InternalUnoText.g:888:5: lv_VueDesCartesApres1erPose_5_0= 'VueDesCartesApres1erPose'
            	    {
            	    lv_VueDesCartesApres1erPose_5_0=(Token)match(input,54,FOLLOW_28); 

            	    					newLeafNode(lv_VueDesCartesApres1erPose_5_0, grammarAccess.getUnoOlypiqueAccess().getVueDesCartesApres1erPoseVueDesCartesApres1erPoseKeyword_5_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoOlypiqueRule());
            	    					}
            	    					setWithLastConsumed(current, "VueDesCartesApres1erPose", lv_VueDesCartesApres1erPose_5_0, "VueDesCartesApres1erPose");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            // InternalUnoText.g:900:3: ( (lv_DonneurPremierose_6_0= 'DonneurPremierose' ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==55) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalUnoText.g:901:4: (lv_DonneurPremierose_6_0= 'DonneurPremierose' )
            	    {
            	    // InternalUnoText.g:901:4: (lv_DonneurPremierose_6_0= 'DonneurPremierose' )
            	    // InternalUnoText.g:902:5: lv_DonneurPremierose_6_0= 'DonneurPremierose'
            	    {
            	    lv_DonneurPremierose_6_0=(Token)match(input,55,FOLLOW_29); 

            	    					newLeafNode(lv_DonneurPremierose_6_0, grammarAccess.getUnoOlypiqueAccess().getDonneurPremieroseDonneurPremieroseKeyword_6_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoOlypiqueRule());
            	    					}
            	    					setWithLastConsumed(current, "DonneurPremierose", lv_DonneurPremierose_6_0, "DonneurPremierose");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            // InternalUnoText.g:914:3: ( (lv_JeuRapide_7_0= 'JeuRapide' ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==56) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalUnoText.g:915:4: (lv_JeuRapide_7_0= 'JeuRapide' )
            	    {
            	    // InternalUnoText.g:915:4: (lv_JeuRapide_7_0= 'JeuRapide' )
            	    // InternalUnoText.g:916:5: lv_JeuRapide_7_0= 'JeuRapide'
            	    {
            	    lv_JeuRapide_7_0=(Token)match(input,56,FOLLOW_30); 

            	    					newLeafNode(lv_JeuRapide_7_0, grammarAccess.getUnoOlypiqueAccess().getJeuRapideJeuRapideKeyword_7_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoOlypiqueRule());
            	    					}
            	    					setWithLastConsumed(current, "JeuRapide", lv_JeuRapide_7_0, "JeuRapide");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            // InternalUnoText.g:928:3: ( (lv_Interception_8_0= 'Interception' ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==57) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalUnoText.g:929:4: (lv_Interception_8_0= 'Interception' )
            	    {
            	    // InternalUnoText.g:929:4: (lv_Interception_8_0= 'Interception' )
            	    // InternalUnoText.g:930:5: lv_Interception_8_0= 'Interception'
            	    {
            	    lv_Interception_8_0=(Token)match(input,57,FOLLOW_31); 

            	    					newLeafNode(lv_Interception_8_0, grammarAccess.getUnoOlypiqueAccess().getInterceptionInterceptionKeyword_8_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoOlypiqueRule());
            	    					}
            	    					setWithLastConsumed(current, "Interception", lv_Interception_8_0, "Interception");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            // InternalUnoText.g:942:3: ( (lv_DeuxCartesIdentiques_9_0= 'DeuxCartesIdentiques' ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==58) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalUnoText.g:943:4: (lv_DeuxCartesIdentiques_9_0= 'DeuxCartesIdentiques' )
            	    {
            	    // InternalUnoText.g:943:4: (lv_DeuxCartesIdentiques_9_0= 'DeuxCartesIdentiques' )
            	    // InternalUnoText.g:944:5: lv_DeuxCartesIdentiques_9_0= 'DeuxCartesIdentiques'
            	    {
            	    lv_DeuxCartesIdentiques_9_0=(Token)match(input,58,FOLLOW_32); 

            	    					newLeafNode(lv_DeuxCartesIdentiques_9_0, grammarAccess.getUnoOlypiqueAccess().getDeuxCartesIdentiquesDeuxCartesIdentiquesKeyword_9_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoOlypiqueRule());
            	    					}
            	    					setWithLastConsumed(current, "DeuxCartesIdentiques", lv_DeuxCartesIdentiques_9_0, "DeuxCartesIdentiques");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            // InternalUnoText.g:956:3: ( (lv_DecisionCarte_10_0= 'DecisionCarte' ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==59) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalUnoText.g:957:4: (lv_DecisionCarte_10_0= 'DecisionCarte' )
            	    {
            	    // InternalUnoText.g:957:4: (lv_DecisionCarte_10_0= 'DecisionCarte' )
            	    // InternalUnoText.g:958:5: lv_DecisionCarte_10_0= 'DecisionCarte'
            	    {
            	    lv_DecisionCarte_10_0=(Token)match(input,59,FOLLOW_33); 

            	    					newLeafNode(lv_DecisionCarte_10_0, grammarAccess.getUnoOlypiqueAccess().getDecisionCarteDecisionCarteKeyword_10_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoOlypiqueRule());
            	    					}
            	    					setWithLastConsumed(current, "DecisionCarte", lv_DecisionCarte_10_0, "DecisionCarte");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            // InternalUnoText.g:970:3: ( (lv_Surenchere_11_0= 'Surenchere' ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==60) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalUnoText.g:971:4: (lv_Surenchere_11_0= 'Surenchere' )
            	    {
            	    // InternalUnoText.g:971:4: (lv_Surenchere_11_0= 'Surenchere' )
            	    // InternalUnoText.g:972:5: lv_Surenchere_11_0= 'Surenchere'
            	    {
            	    lv_Surenchere_11_0=(Token)match(input,60,FOLLOW_34); 

            	    					newLeafNode(lv_Surenchere_11_0, grammarAccess.getUnoOlypiqueAccess().getSurenchereSurenchereKeyword_11_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoOlypiqueRule());
            	    					}
            	    					setWithLastConsumed(current, "Surenchere", lv_Surenchere_11_0, "Surenchere");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            // InternalUnoText.g:984:3: ( (lv_cartezero_12_0= 'Carte0' ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==61) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalUnoText.g:985:4: (lv_cartezero_12_0= 'Carte0' )
            	    {
            	    // InternalUnoText.g:985:4: (lv_cartezero_12_0= 'Carte0' )
            	    // InternalUnoText.g:986:5: lv_cartezero_12_0= 'Carte0'
            	    {
            	    lv_cartezero_12_0=(Token)match(input,61,FOLLOW_35); 

            	    					newLeafNode(lv_cartezero_12_0, grammarAccess.getUnoOlypiqueAccess().getCartezeroCarte0Keyword_12_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoOlypiqueRule());
            	    					}
            	    					setWithLastConsumed(current, "cartezero", lv_cartezero_12_0 != null, "Carte0");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // InternalUnoText.g:998:3: ( (lv_CarteSept_13_0= 'Carte7' ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==62) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalUnoText.g:999:4: (lv_CarteSept_13_0= 'Carte7' )
            	    {
            	    // InternalUnoText.g:999:4: (lv_CarteSept_13_0= 'Carte7' )
            	    // InternalUnoText.g:1000:5: lv_CarteSept_13_0= 'Carte7'
            	    {
            	    lv_CarteSept_13_0=(Token)match(input,62,FOLLOW_36); 

            	    					newLeafNode(lv_CarteSept_13_0, grammarAccess.getUnoOlypiqueAccess().getCarteSeptCarte7Keyword_13_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoOlypiqueRule());
            	    					}
            	    					setWithLastConsumed(current, "CarteSept", lv_CarteSept_13_0 != null, "Carte7");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // InternalUnoText.g:1012:3: ( (lv_Carte2_14_0= 'Carte2' ) )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==63) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalUnoText.g:1013:4: (lv_Carte2_14_0= 'Carte2' )
            	    {
            	    // InternalUnoText.g:1013:4: (lv_Carte2_14_0= 'Carte2' )
            	    // InternalUnoText.g:1014:5: lv_Carte2_14_0= 'Carte2'
            	    {
            	    lv_Carte2_14_0=(Token)match(input,63,FOLLOW_37); 

            	    					newLeafNode(lv_Carte2_14_0, grammarAccess.getUnoOlypiqueAccess().getCarte2Carte2Keyword_14_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoOlypiqueRule());
            	    					}
            	    					setWithLastConsumed(current, "Carte2", lv_Carte2_14_0, "Carte2");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);

            // InternalUnoText.g:1026:3: ( (lv_ValeurCarte_15_0= 'ValeurCarte' ) )
            // InternalUnoText.g:1027:4: (lv_ValeurCarte_15_0= 'ValeurCarte' )
            {
            // InternalUnoText.g:1027:4: (lv_ValeurCarte_15_0= 'ValeurCarte' )
            // InternalUnoText.g:1028:5: lv_ValeurCarte_15_0= 'ValeurCarte'
            {
            lv_ValeurCarte_15_0=(Token)match(input,64,FOLLOW_2); 

            					newLeafNode(lv_ValeurCarte_15_0, grammarAccess.getUnoOlypiqueAccess().getValeurCarteValeurCarteKeyword_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnoOlypiqueRule());
            					}
            					setWithLastConsumed(current, "ValeurCarte", lv_ValeurCarte_15_0, "ValeurCarte");
            				

            }


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
    // $ANTLR end "ruleUnoOlypique"


    // $ANTLR start "entryRuleUnoWizz"
    // InternalUnoText.g:1044:1: entryRuleUnoWizz returns [EObject current=null] : iv_ruleUnoWizz= ruleUnoWizz EOF ;
    public final EObject entryRuleUnoWizz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnoWizz = null;


        try {
            // InternalUnoText.g:1044:48: (iv_ruleUnoWizz= ruleUnoWizz EOF )
            // InternalUnoText.g:1045:2: iv_ruleUnoWizz= ruleUnoWizz EOF
            {
             newCompositeNode(grammarAccess.getUnoWizzRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnoWizz=ruleUnoWizz();

            state._fsp--;

             current =iv_ruleUnoWizz; 
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
    // $ANTLR end "entryRuleUnoWizz"


    // $ANTLR start "ruleUnoWizz"
    // InternalUnoText.g:1051:1: ruleUnoWizz returns [EObject current=null] : ( (otherlv_0= 'UnoWizz : ' )+ ( (lv_presquUno_1_0= 'presquUno,' ) )+ ( (lv_chiffreMoins_2_0= 'chiffreMoins,' ) )+ ( (lv_couleurMoins_3_0= 'couleurMoins,' ) )+ ( (lv_carteRouge_4_0= 'carteRouge' ) )+ (otherlv_5= 'carteBleue' )+ (otherlv_6= 'echange' )+ (otherlv_7= 'mainVisible' )+ (otherlv_8= 'unoWizz' )+ otherlv_9= 'War' ) ;
    public final EObject ruleUnoWizz() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_presquUno_1_0=null;
        Token lv_chiffreMoins_2_0=null;
        Token lv_couleurMoins_3_0=null;
        Token lv_carteRouge_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalUnoText.g:1057:2: ( ( (otherlv_0= 'UnoWizz : ' )+ ( (lv_presquUno_1_0= 'presquUno,' ) )+ ( (lv_chiffreMoins_2_0= 'chiffreMoins,' ) )+ ( (lv_couleurMoins_3_0= 'couleurMoins,' ) )+ ( (lv_carteRouge_4_0= 'carteRouge' ) )+ (otherlv_5= 'carteBleue' )+ (otherlv_6= 'echange' )+ (otherlv_7= 'mainVisible' )+ (otherlv_8= 'unoWizz' )+ otherlv_9= 'War' ) )
            // InternalUnoText.g:1058:2: ( (otherlv_0= 'UnoWizz : ' )+ ( (lv_presquUno_1_0= 'presquUno,' ) )+ ( (lv_chiffreMoins_2_0= 'chiffreMoins,' ) )+ ( (lv_couleurMoins_3_0= 'couleurMoins,' ) )+ ( (lv_carteRouge_4_0= 'carteRouge' ) )+ (otherlv_5= 'carteBleue' )+ (otherlv_6= 'echange' )+ (otherlv_7= 'mainVisible' )+ (otherlv_8= 'unoWizz' )+ otherlv_9= 'War' )
            {
            // InternalUnoText.g:1058:2: ( (otherlv_0= 'UnoWizz : ' )+ ( (lv_presquUno_1_0= 'presquUno,' ) )+ ( (lv_chiffreMoins_2_0= 'chiffreMoins,' ) )+ ( (lv_couleurMoins_3_0= 'couleurMoins,' ) )+ ( (lv_carteRouge_4_0= 'carteRouge' ) )+ (otherlv_5= 'carteBleue' )+ (otherlv_6= 'echange' )+ (otherlv_7= 'mainVisible' )+ (otherlv_8= 'unoWizz' )+ otherlv_9= 'War' )
            // InternalUnoText.g:1059:3: (otherlv_0= 'UnoWizz : ' )+ ( (lv_presquUno_1_0= 'presquUno,' ) )+ ( (lv_chiffreMoins_2_0= 'chiffreMoins,' ) )+ ( (lv_couleurMoins_3_0= 'couleurMoins,' ) )+ ( (lv_carteRouge_4_0= 'carteRouge' ) )+ (otherlv_5= 'carteBleue' )+ (otherlv_6= 'echange' )+ (otherlv_7= 'mainVisible' )+ (otherlv_8= 'unoWizz' )+ otherlv_9= 'War'
            {
            // InternalUnoText.g:1059:3: (otherlv_0= 'UnoWizz : ' )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==65) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalUnoText.g:1060:4: otherlv_0= 'UnoWizz : '
            	    {
            	    otherlv_0=(Token)match(input,65,FOLLOW_38); 

            	    				newLeafNode(otherlv_0, grammarAccess.getUnoWizzAccess().getUnoWizzKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            // InternalUnoText.g:1065:3: ( (lv_presquUno_1_0= 'presquUno,' ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==66) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalUnoText.g:1066:4: (lv_presquUno_1_0= 'presquUno,' )
            	    {
            	    // InternalUnoText.g:1066:4: (lv_presquUno_1_0= 'presquUno,' )
            	    // InternalUnoText.g:1067:5: lv_presquUno_1_0= 'presquUno,'
            	    {
            	    lv_presquUno_1_0=(Token)match(input,66,FOLLOW_39); 

            	    					newLeafNode(lv_presquUno_1_0, grammarAccess.getUnoWizzAccess().getPresquUnoPresquUnoKeyword_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoWizzRule());
            	    					}
            	    					setWithLastConsumed(current, "presquUno", lv_presquUno_1_0, "presquUno,");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            // InternalUnoText.g:1079:3: ( (lv_chiffreMoins_2_0= 'chiffreMoins,' ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==67) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalUnoText.g:1080:4: (lv_chiffreMoins_2_0= 'chiffreMoins,' )
            	    {
            	    // InternalUnoText.g:1080:4: (lv_chiffreMoins_2_0= 'chiffreMoins,' )
            	    // InternalUnoText.g:1081:5: lv_chiffreMoins_2_0= 'chiffreMoins,'
            	    {
            	    lv_chiffreMoins_2_0=(Token)match(input,67,FOLLOW_40); 

            	    					newLeafNode(lv_chiffreMoins_2_0, grammarAccess.getUnoWizzAccess().getChiffreMoinsChiffreMoinsKeyword_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoWizzRule());
            	    					}
            	    					setWithLastConsumed(current, "chiffreMoins", lv_chiffreMoins_2_0, "chiffreMoins,");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            // InternalUnoText.g:1093:3: ( (lv_couleurMoins_3_0= 'couleurMoins,' ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==68) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalUnoText.g:1094:4: (lv_couleurMoins_3_0= 'couleurMoins,' )
            	    {
            	    // InternalUnoText.g:1094:4: (lv_couleurMoins_3_0= 'couleurMoins,' )
            	    // InternalUnoText.g:1095:5: lv_couleurMoins_3_0= 'couleurMoins,'
            	    {
            	    lv_couleurMoins_3_0=(Token)match(input,68,FOLLOW_41); 

            	    					newLeafNode(lv_couleurMoins_3_0, grammarAccess.getUnoWizzAccess().getCouleurMoinsCouleurMoinsKeyword_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoWizzRule());
            	    					}
            	    					setWithLastConsumed(current, "couleurMoins", lv_couleurMoins_3_0, "couleurMoins,");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);

            // InternalUnoText.g:1107:3: ( (lv_carteRouge_4_0= 'carteRouge' ) )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==69) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalUnoText.g:1108:4: (lv_carteRouge_4_0= 'carteRouge' )
            	    {
            	    // InternalUnoText.g:1108:4: (lv_carteRouge_4_0= 'carteRouge' )
            	    // InternalUnoText.g:1109:5: lv_carteRouge_4_0= 'carteRouge'
            	    {
            	    lv_carteRouge_4_0=(Token)match(input,69,FOLLOW_42); 

            	    					newLeafNode(lv_carteRouge_4_0, grammarAccess.getUnoWizzAccess().getCarteRougeCarteRougeKeyword_4_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUnoWizzRule());
            	    					}
            	    					setWithLastConsumed(current, "carteRouge", lv_carteRouge_4_0, "carteRouge");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);

            // InternalUnoText.g:1121:3: (otherlv_5= 'carteBleue' )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==70) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalUnoText.g:1122:4: otherlv_5= 'carteBleue'
            	    {
            	    otherlv_5=(Token)match(input,70,FOLLOW_43); 

            	    				newLeafNode(otherlv_5, grammarAccess.getUnoWizzAccess().getCarteBleueKeyword_5());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);

            // InternalUnoText.g:1127:3: (otherlv_6= 'echange' )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==71) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalUnoText.g:1128:4: otherlv_6= 'echange'
            	    {
            	    otherlv_6=(Token)match(input,71,FOLLOW_44); 

            	    				newLeafNode(otherlv_6, grammarAccess.getUnoWizzAccess().getEchangeKeyword_6());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            // InternalUnoText.g:1133:3: (otherlv_7= 'mainVisible' )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==72) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalUnoText.g:1134:4: otherlv_7= 'mainVisible'
            	    {
            	    otherlv_7=(Token)match(input,72,FOLLOW_45); 

            	    				newLeafNode(otherlv_7, grammarAccess.getUnoWizzAccess().getMainVisibleKeyword_7());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);

            // InternalUnoText.g:1139:3: (otherlv_8= 'unoWizz' )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==73) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalUnoText.g:1140:4: otherlv_8= 'unoWizz'
            	    {
            	    otherlv_8=(Token)match(input,73,FOLLOW_46); 

            	    				newLeafNode(otherlv_8, grammarAccess.getUnoWizzAccess().getUnoWizzKeyword_8());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
            } while (true);

            otherlv_9=(Token)match(input,74,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getUnoWizzAccess().getWarKeyword_9());
            		

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
    // $ANTLR end "ruleUnoWizz"


    // $ANTLR start "entryRuleUnoRapido"
    // InternalUnoText.g:1153:1: entryRuleUnoRapido returns [String current=null] : iv_ruleUnoRapido= ruleUnoRapido EOF ;
    public final String entryRuleUnoRapido() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnoRapido = null;


        try {
            // InternalUnoText.g:1153:49: (iv_ruleUnoRapido= ruleUnoRapido EOF )
            // InternalUnoText.g:1154:2: iv_ruleUnoRapido= ruleUnoRapido EOF
            {
             newCompositeNode(grammarAccess.getUnoRapidoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnoRapido=ruleUnoRapido();

            state._fsp--;

             current =iv_ruleUnoRapido.getText(); 
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
    // $ANTLR end "entryRuleUnoRapido"


    // $ANTLR start "ruleUnoRapido"
    // InternalUnoText.g:1160:1: ruleUnoRapido returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'UnoRapido' )+ (kw= 'Pioche' )+ (kw= 'Confusion' )+ (kw= 'Defense' )+ (kw= 'Rapido' )+ kw= 'CarteUno' ) ;
    public final AntlrDatatypeRuleToken ruleUnoRapido() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUnoText.g:1166:2: ( ( (kw= 'UnoRapido' )+ (kw= 'Pioche' )+ (kw= 'Confusion' )+ (kw= 'Defense' )+ (kw= 'Rapido' )+ kw= 'CarteUno' ) )
            // InternalUnoText.g:1167:2: ( (kw= 'UnoRapido' )+ (kw= 'Pioche' )+ (kw= 'Confusion' )+ (kw= 'Defense' )+ (kw= 'Rapido' )+ kw= 'CarteUno' )
            {
            // InternalUnoText.g:1167:2: ( (kw= 'UnoRapido' )+ (kw= 'Pioche' )+ (kw= 'Confusion' )+ (kw= 'Defense' )+ (kw= 'Rapido' )+ kw= 'CarteUno' )
            // InternalUnoText.g:1168:3: (kw= 'UnoRapido' )+ (kw= 'Pioche' )+ (kw= 'Confusion' )+ (kw= 'Defense' )+ (kw= 'Rapido' )+ kw= 'CarteUno'
            {
            // InternalUnoText.g:1168:3: (kw= 'UnoRapido' )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==75) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalUnoText.g:1169:4: kw= 'UnoRapido'
            	    {
            	    kw=(Token)match(input,75,FOLLOW_47); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getUnoRapidoAccess().getUnoRapidoKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);

            // InternalUnoText.g:1175:3: (kw= 'Pioche' )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==22) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalUnoText.g:1176:4: kw= 'Pioche'
            	    {
            	    kw=(Token)match(input,22,FOLLOW_48); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getUnoRapidoAccess().getPiocheKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            // InternalUnoText.g:1182:3: (kw= 'Confusion' )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==76) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalUnoText.g:1183:4: kw= 'Confusion'
            	    {
            	    kw=(Token)match(input,76,FOLLOW_49); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getUnoRapidoAccess().getConfusionKeyword_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);

            // InternalUnoText.g:1189:3: (kw= 'Defense' )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==77) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalUnoText.g:1190:4: kw= 'Defense'
            	    {
            	    kw=(Token)match(input,77,FOLLOW_50); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getUnoRapidoAccess().getDefenseKeyword_3());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
            } while (true);

            // InternalUnoText.g:1196:3: (kw= 'Rapido' )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==78) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalUnoText.g:1197:4: kw= 'Rapido'
            	    {
            	    kw=(Token)match(input,78,FOLLOW_51); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getUnoRapidoAccess().getRapidoKeyword_4());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            kw=(Token)match(input,79,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getUnoRapidoAccess().getCarteUnoKeyword_5());
            		

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
    // $ANTLR end "ruleUnoRapido"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000A0000380000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000A0000300000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00014A000FF00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000140000FC00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004478000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004470000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xF000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000800L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000400000L,0x0000000000001000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});

}