/*
 * generated by Xtext 2.23.0
 */
grammar InternalUnoText;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.unotext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleUno
entryRuleUno returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnoRule()); }
	iv_ruleUno=ruleUno
	{ $current=$iv_ruleUno.current; }
	EOF;

// Rule Uno
ruleUno returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getUnoAccess().getUnoUno_RuleParserRuleCall_0_0());
				}
				lv_uno_0_0=ruleUno_Rule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUnoRule());
					}
					add(
						$current,
						"uno",
						lv_uno_0_0,
						"org.xtext.example.unotext.UnoText.Uno_Rule");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getUnoAccess().getNombreJoueurNombreJoueursParserRuleCall_1_0());
				}
				lv_nombreJoueur_1_0=ruleNombreJoueurs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUnoRule());
					}
					add(
						$current,
						"nombreJoueur",
						lv_nombreJoueur_1_0,
						"org.xtext.example.unotext.UnoText.NombreJoueurs");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleUno_Rule
entryRuleUno_Rule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUno_RuleRule()); }
	iv_ruleUno_Rule=ruleUno_Rule
	{ $current=$iv_ruleUno_Rule.current; }
	EOF;

// Rule Uno_Rule
ruleUno_Rule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getUno_RuleAccess().getUno_ClassicParserRuleCall_0());
		}
		this_Uno_Classic_0=ruleUno_Classic
		{
			$current = $this_Uno_Classic_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getUno_RuleAccess().getUnoOlypiqueParserRuleCall_1());
		}
		this_UnoOlypique_1=ruleUnoOlypique
		{
			$current = $this_UnoOlypique_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getUno_RuleAccess().getUnoWizzParserRuleCall_2());
		}
		this_UnoWizz_2=ruleUnoWizz
		{
			$current = $this_UnoWizz_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getUno_RuleAccess().getUnoRapidoParserRuleCall_3());
		}
		ruleUnoRapido
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNombreJoueurs
entryRuleNombreJoueurs returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNombreJoueursRule()); }
	iv_ruleNombreJoueurs=ruleNombreJoueurs
	{ $current=$iv_ruleNombreJoueurs.current.getText(); }
	EOF;

// Rule NombreJoueurs
ruleNombreJoueurs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='Nombre de joueur : '
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getNombreJoueursAccess().getNombreDeJoueurKeyword_0());
			}
		)+
		(
			{
				newCompositeNode(grammarAccess.getNombreJoueursAccess().getDeuxParserRuleCall_1_0());
			}
			this_Deux_1=ruleDeux
			{
				$current.merge(this_Deux_1);
			}
			{
				afterParserOrEnumRuleCall();
			}
			    |
			kw='Trois'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getNombreJoueursAccess().getTroisKeyword_1_1());
			}
			    |
			kw='Quatre'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getNombreJoueursAccess().getQuatreKeyword_1_2());
			}
			    |
			kw='Cinq'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getNombreJoueursAccess().getCinqKeyword_1_3());
			}
			    |
			kw='Six'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getNombreJoueursAccess().getSixKeyword_1_4());
			}
			    |
			kw='Sept'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getNombreJoueursAccess().getSeptKeyword_1_5());
			}
			    |
			kw='Huit'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getNombreJoueursAccess().getHuitKeyword_1_6());
			}
		)
	)
;

// Entry rule entryRuleDeux
entryRuleDeux returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDeuxRule()); }
	iv_ruleDeux=ruleDeux
	{ $current=$iv_ruleDeux.current.getText(); }
	EOF;

// Rule Deux
ruleDeux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='Deux : Inverser/Passer_Tour'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getDeuxAccess().getDeuxInverserPasser_TourKeyword());
	}
;

// Entry rule entryRuleUno_Classic
entryRuleUno_Classic returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUno_ClassicRule()); }
	iv_ruleUno_Classic=ruleUno_Classic
	{ $current=$iv_ruleUno_Classic.current; }
	EOF;

// Rule Uno_Classic
ruleUno_Classic returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Uno Classic : '
			{
				newLeafNode(otherlv_0, grammarAccess.getUno_ClassicAccess().getUnoClassicKeyword_0());
			}
		)+
		(
			(
				lv_unoChallenge_1_0='UnoChallenge'
				{
					newLeafNode(lv_unoChallenge_1_0, grammarAccess.getUno_ClassicAccess().getUnoChallengeUnoChallengeKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUno_ClassicRule());
					}
					setWithLastConsumed($current, "unoChallenge", lv_unoChallenge_1_0 != null, "UnoChallenge");
				}
			)
		)*
		(
			(
				lv_carte0_7_2_0='Carte0_7'
				{
					newLeafNode(lv_carte0_7_2_0, grammarAccess.getUno_ClassicAccess().getCarte0_7Carte0_7Keyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUno_ClassicRule());
					}
					setWithLastConsumed($current, "carte0_7", lv_carte0_7_2_0 != null, "Carte0_7");
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getUno_ClassicAccess().getCarteIdentiqueCarteIdentiqueParserRuleCall_3_0());
				}
				lv_carteIdentique_3_0=ruleCarteIdentique
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUno_ClassicRule());
					}
					set(
						$current,
						"carteIdentique",
						lv_carteIdentique_3_0 != null,
						"org.xtext.example.unotext.UnoText.CarteIdentique");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getUno_ClassicAccess().getCumulAjoutCumulAjoutParserRuleCall_4_0());
				}
				lv_cumulAjout_4_0=ruleCumulAjout
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUno_ClassicRule());
					}
					set(
						$current,
						"cumulAjout",
						lv_cumulAjout_4_0 != null,
						"org.xtext.example.unotext.UnoText.CumulAjout");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getUno_ClassicAccess().getSuiteSuiteParserRuleCall_5_0());
				}
				lv_suite_5_0=ruleSuite
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUno_ClassicRule());
					}
					set(
						$current,
						"suite",
						lv_suite_5_0 != null,
						"org.xtext.example.unotext.UnoText.Suite");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_pioche_6_0='Pioche'
				{
					newLeafNode(lv_pioche_6_0, grammarAccess.getUno_ClassicAccess().getPiochePiocheKeyword_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUno_ClassicRule());
					}
					setWithLastConsumed($current, "pioche", lv_pioche_6_0 != null, "Pioche");
				}
			)
		)*
		(
			(
				lv_more4_7_0='More4'
				{
					newLeafNode(lv_more4_7_0, grammarAccess.getUno_ClassicAccess().getMore4More4Keyword_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUno_ClassicRule());
					}
					setWithLastConsumed($current, "more4", lv_more4_7_0 != null, "More4");
				}
			)
		)*
		(
			(
				lv_tempsLimite_8_0='tempsLimite'
				{
					newLeafNode(lv_tempsLimite_8_0, grammarAccess.getUno_ClassicAccess().getTempsLimiteTempsLimiteKeyword_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUno_ClassicRule());
					}
					setWithLastConsumed($current, "tempsLimite", lv_tempsLimite_8_0 != null, "tempsLimite");
				}
			)
		)*
		(
			(
				lv_mauvaiseCarte_9_0='mauvaiseCarte'
				{
					newLeafNode(lv_mauvaiseCarte_9_0, grammarAccess.getUno_ClassicAccess().getMauvaiseCarteMauvaiseCarteKeyword_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUno_ClassicRule());
					}
					setWithLastConsumed($current, "mauvaiseCarte", lv_mauvaiseCarte_9_0 != null, "mauvaiseCarte");
				}
			)
		)*
		(
			(
				lv_equipe_10_0='equipe'
				{
					newLeafNode(lv_equipe_10_0, grammarAccess.getUno_ClassicAccess().getEquipeEquipeKeyword_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUno_ClassicRule());
					}
					setWithLastConsumed($current, "equipe", lv_equipe_10_0 != null, "equipe");
				}
			)
		)*
		(
			(
				lv_carteVisibles_11_0='CarteVisibles'
				{
					newLeafNode(lv_carteVisibles_11_0, grammarAccess.getUno_ClassicAccess().getCarteVisiblesCarteVisiblesKeyword_11_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUno_ClassicRule());
					}
					setWithLastConsumed($current, "carteVisibles", lv_carteVisibles_11_0 != null, "CarteVisibles");
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getUno_ClassicAccess().getFinMancheFinMancheParserRuleCall_12_0());
				}
				lv_finManche_12_0=ruleFinManche
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUno_ClassicRule());
					}
					set(
						$current,
						"finManche",
						lv_finManche_12_0 != null,
						"org.xtext.example.unotext.UnoText.FinManche");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_threeHands_13_0='ThreeHands'
				{
					newLeafNode(lv_threeHands_13_0, grammarAccess.getUno_ClassicAccess().getThreeHandsThreeHandsKeyword_13_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUno_ClassicRule());
					}
					setWithLastConsumed($current, "threeHands", lv_threeHands_13_0 != null, "ThreeHands");
				}
			)
		)*
		(
			(
				lv_threePiles_14_0='ThreePiles'
				{
					newLeafNode(lv_threePiles_14_0, grammarAccess.getUno_ClassicAccess().getThreePilesThreePilesKeyword_14_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUno_ClassicRule());
					}
					setWithLastConsumed($current, "threePiles", lv_threePiles_14_0 != null, "ThreePiles");
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getUno_ClassicAccess().getSpecialCardSpecialCardParserRuleCall_15_0());
				}
				lv_specialCard_15_0=ruleSpecialCard
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUno_ClassicRule());
					}
					set(
						$current,
						"specialCard",
						lv_specialCard_15_0 != null,
						"org.xtext.example.unotext.UnoText.SpecialCard");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getUno_ClassicAccess().getGameOverGameOverParserRuleCall_16_0());
				}
				lv_gameOver_16_0=ruleGameOver
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUno_ClassicRule());
					}
					set(
						$current,
						"gameOver",
						lv_gameOver_16_0,
						"org.xtext.example.unotext.UnoText.GameOver");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSpecialCard
entryRuleSpecialCard returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSpecialCardRule()); }
	iv_ruleSpecialCard=ruleSpecialCard
	{ $current=$iv_ruleSpecialCard.current.getText(); }
	EOF;

// Rule SpecialCard
ruleSpecialCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='SpecialCard : '
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getSpecialCardAccess().getSpecialCardKeyword_0());
			}
		)+
		(
			kw='Roulette'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getSpecialCardAccess().getRouletteKeyword_1_0());
			}
			    |
			kw='Showdown'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getSpecialCardAccess().getShowdownKeyword_1_1());
			}
			    |
			kw='Classique'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getSpecialCardAccess().getClassiqueKeyword_1_2());
			}
		)
	)
;

// Entry rule entryRuleGameOver
entryRuleGameOver returns [String current=null]:
	{ newCompositeNode(grammarAccess.getGameOverRule()); }
	iv_ruleGameOver=ruleGameOver
	{ $current=$iv_ruleGameOver.current.getText(); }
	EOF;

// Rule GameOver
ruleGameOver returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='GameOver : '
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getGameOverAccess().getGameOverKeyword_0());
			}
		)+
		(
			kw='Avoir500'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getGameOverAccess().getAvoir500Keyword_1_0());
			}
			    |
			kw='NePasAvoir500'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getGameOverAccess().getNePasAvoir500Keyword_1_1());
			}
			    |
			kw='nombredeManchesGagn\u00E9s'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getGameOverAccess().getNombredeManchesGagnSKeyword_1_2());
			}
		)
	)
;

// Entry rule entryRuleFinManche
entryRuleFinManche returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFinMancheRule()); }
	iv_ruleFinManche=ruleFinManche
	{ $current=$iv_ruleFinManche.current.getText(); }
	EOF;

// Rule FinManche
ruleFinManche returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='FinManche : '
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFinMancheAccess().getFinMancheKeyword_0());
			}
		)+
		(
			kw='Reste1Carte'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFinMancheAccess().getReste1CarteKeyword_1_0());
			}
			    |
			kw='Aumoins4CartesMemeChiffre'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFinMancheAccess().getAumoins4CartesMemeChiffreKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleCarteIdentique
entryRuleCarteIdentique returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCarteIdentiqueRule()); }
	iv_ruleCarteIdentique=ruleCarteIdentique
	{ $current=$iv_ruleCarteIdentique.current; }
	EOF;

// Rule CarteIdentique
ruleCarteIdentique returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='CarteIdentiQUE'
			{
				newLeafNode(otherlv_0, grammarAccess.getCarteIdentiqueAccess().getCarteIdentiQUEKeyword_0());
			}
		)+
		(
			(
				lv_AvecCouleur_1_0='AvecCouleur'
				{
					newLeafNode(lv_AvecCouleur_1_0, grammarAccess.getCarteIdentiqueAccess().getAvecCouleurAvecCouleurKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCarteIdentiqueRule());
					}
					setWithLastConsumed($current, "AvecCouleur", lv_AvecCouleur_1_0 != null, "AvecCouleur");
				}
			)
		)?
	)
;

// Entry rule entryRuleCumulAjout
entryRuleCumulAjout returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCumulAjoutRule()); }
	iv_ruleCumulAjout=ruleCumulAjout
	{ $current=$iv_ruleCumulAjout.current; }
	EOF;

// Rule CumulAjout
ruleCumulAjout returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='CumulAjout'
			{
				newLeafNode(otherlv_0, grammarAccess.getCumulAjoutAccess().getCumulAjoutKeyword_0());
			}
		)+
		(
			(
				lv_plus2_1_0='PLus2'
				{
					newLeafNode(lv_plus2_1_0, grammarAccess.getCumulAjoutAccess().getPlus2PLus2Keyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCumulAjoutRule());
					}
					setWithLastConsumed($current, "plus2", lv_plus2_1_0 != null, "PLus2");
				}
			)
		)*
		(
			(
				lv_plus4_2_0='PLus4'
				{
					newLeafNode(lv_plus4_2_0, grammarAccess.getCumulAjoutAccess().getPlus4PLus4Keyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCumulAjoutRule());
					}
					setWithLastConsumed($current, "plus4", lv_plus4_2_0 != null, "PLus4");
				}
			)
		)?
	)
;

// Entry rule entryRuleSuite
entryRuleSuite returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSuiteRule()); }
	iv_ruleSuite=ruleSuite
	{ $current=$iv_ruleSuite.current.getText(); }
	EOF;

// Rule Suite
ruleSuite returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				kw='Suite : '
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getSuiteAccess().getSuiteKeyword_0_0());
				}
			)+
			kw='Simple'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getSuiteAccess().getSimpleKeyword_0_1());
			}
		)
		    |
		kw='Royale'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSuiteAccess().getRoyaleKeyword_1());
		}
	)
;

// Entry rule entryRuleUnoOlypique
entryRuleUnoOlypique returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnoOlypiqueRule()); }
	iv_ruleUnoOlypique=ruleUnoOlypique
	{ $current=$iv_ruleUnoOlypique.current; }
	EOF;

// Rule UnoOlypique
ruleUnoOlypique returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='UnoOlympique : '
			{
				newLeafNode(otherlv_0, grammarAccess.getUnoOlypiqueAccess().getUnoOlympiqueKeyword_0());
			}
		)+
		(
			(
				lv_TribunalPopulaire_1_0='TribunalPopulaire'
				{
					newLeafNode(lv_TribunalPopulaire_1_0, grammarAccess.getUnoOlypiqueAccess().getTribunalPopulaireTribunalPopulaireKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoOlypiqueRule());
					}
					setWithLastConsumed($current, "TribunalPopulaire", lv_TribunalPopulaire_1_0, "TribunalPopulaire");
				}
			)
		)+
		(
			(
				lv_DistributionAleatoire_2_0='DistributionAleatoire'
				{
					newLeafNode(lv_DistributionAleatoire_2_0, grammarAccess.getUnoOlypiqueAccess().getDistributionAleatoireDistributionAleatoireKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoOlypiqueRule());
					}
					setWithLastConsumed($current, "DistributionAleatoire", lv_DistributionAleatoire_2_0, "DistributionAleatoire");
				}
			)
		)+
		(
			(
				lv_SensDefini_3_0='SensDefini'
				{
					newLeafNode(lv_SensDefini_3_0, grammarAccess.getUnoOlypiqueAccess().getSensDefiniSensDefiniKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoOlypiqueRule());
					}
					setWithLastConsumed($current, "SensDefini", lv_SensDefini_3_0, "SensDefini");
				}
			)
		)+
		(
			(
				lv_ChangementDonneur_4_0='ChangementDonneur'
				{
					newLeafNode(lv_ChangementDonneur_4_0, grammarAccess.getUnoOlypiqueAccess().getChangementDonneurChangementDonneurKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoOlypiqueRule());
					}
					setWithLastConsumed($current, "ChangementDonneur", lv_ChangementDonneur_4_0, "ChangementDonneur");
				}
			)
		)+
		(
			(
				lv_VueDesCartesApres1erPose_5_0='VueDesCartesApres1erPose'
				{
					newLeafNode(lv_VueDesCartesApres1erPose_5_0, grammarAccess.getUnoOlypiqueAccess().getVueDesCartesApres1erPoseVueDesCartesApres1erPoseKeyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoOlypiqueRule());
					}
					setWithLastConsumed($current, "VueDesCartesApres1erPose", lv_VueDesCartesApres1erPose_5_0, "VueDesCartesApres1erPose");
				}
			)
		)+
		(
			(
				lv_DonneurPremierose_6_0='DonneurPremierose'
				{
					newLeafNode(lv_DonneurPremierose_6_0, grammarAccess.getUnoOlypiqueAccess().getDonneurPremieroseDonneurPremieroseKeyword_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoOlypiqueRule());
					}
					setWithLastConsumed($current, "DonneurPremierose", lv_DonneurPremierose_6_0, "DonneurPremierose");
				}
			)
		)+
		(
			(
				lv_JeuRapide_7_0='JeuRapide'
				{
					newLeafNode(lv_JeuRapide_7_0, grammarAccess.getUnoOlypiqueAccess().getJeuRapideJeuRapideKeyword_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoOlypiqueRule());
					}
					setWithLastConsumed($current, "JeuRapide", lv_JeuRapide_7_0, "JeuRapide");
				}
			)
		)+
		(
			(
				lv_Interception_8_0='Interception'
				{
					newLeafNode(lv_Interception_8_0, grammarAccess.getUnoOlypiqueAccess().getInterceptionInterceptionKeyword_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoOlypiqueRule());
					}
					setWithLastConsumed($current, "Interception", lv_Interception_8_0, "Interception");
				}
			)
		)+
		(
			(
				lv_DeuxCartesIdentiques_9_0='DeuxCartesIdentiques'
				{
					newLeafNode(lv_DeuxCartesIdentiques_9_0, grammarAccess.getUnoOlypiqueAccess().getDeuxCartesIdentiquesDeuxCartesIdentiquesKeyword_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoOlypiqueRule());
					}
					setWithLastConsumed($current, "DeuxCartesIdentiques", lv_DeuxCartesIdentiques_9_0, "DeuxCartesIdentiques");
				}
			)
		)+
		(
			(
				lv_DecisionCarte_10_0='DecisionCarte'
				{
					newLeafNode(lv_DecisionCarte_10_0, grammarAccess.getUnoOlypiqueAccess().getDecisionCarteDecisionCarteKeyword_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoOlypiqueRule());
					}
					setWithLastConsumed($current, "DecisionCarte", lv_DecisionCarte_10_0, "DecisionCarte");
				}
			)
		)+
		(
			(
				lv_Surenchere_11_0='Surenchere'
				{
					newLeafNode(lv_Surenchere_11_0, grammarAccess.getUnoOlypiqueAccess().getSurenchereSurenchereKeyword_11_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoOlypiqueRule());
					}
					setWithLastConsumed($current, "Surenchere", lv_Surenchere_11_0, "Surenchere");
				}
			)
		)+
		(
			(
				lv_cartezero_12_0='Carte0'
				{
					newLeafNode(lv_cartezero_12_0, grammarAccess.getUnoOlypiqueAccess().getCartezeroCarte0Keyword_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoOlypiqueRule());
					}
					setWithLastConsumed($current, "cartezero", lv_cartezero_12_0 != null, "Carte0");
				}
			)
		)*
		(
			(
				lv_CarteSept_13_0='Carte7'
				{
					newLeafNode(lv_CarteSept_13_0, grammarAccess.getUnoOlypiqueAccess().getCarteSeptCarte7Keyword_13_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoOlypiqueRule());
					}
					setWithLastConsumed($current, "CarteSept", lv_CarteSept_13_0 != null, "Carte7");
				}
			)
		)*
		(
			(
				lv_Carte2_14_0='Carte2'
				{
					newLeafNode(lv_Carte2_14_0, grammarAccess.getUnoOlypiqueAccess().getCarte2Carte2Keyword_14_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoOlypiqueRule());
					}
					setWithLastConsumed($current, "Carte2", lv_Carte2_14_0, "Carte2");
				}
			)
		)+
		(
			(
				lv_ValeurCarte_15_0='ValeurCarte'
				{
					newLeafNode(lv_ValeurCarte_15_0, grammarAccess.getUnoOlypiqueAccess().getValeurCarteValeurCarteKeyword_15_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoOlypiqueRule());
					}
					setWithLastConsumed($current, "ValeurCarte", lv_ValeurCarte_15_0, "ValeurCarte");
				}
			)
		)
	)
;

// Entry rule entryRuleUnoWizz
entryRuleUnoWizz returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnoWizzRule()); }
	iv_ruleUnoWizz=ruleUnoWizz
	{ $current=$iv_ruleUnoWizz.current; }
	EOF;

// Rule UnoWizz
ruleUnoWizz returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='UnoWizz : '
			{
				newLeafNode(otherlv_0, grammarAccess.getUnoWizzAccess().getUnoWizzKeyword_0());
			}
		)+
		(
			(
				lv_presquUno_1_0='presquUno,'
				{
					newLeafNode(lv_presquUno_1_0, grammarAccess.getUnoWizzAccess().getPresquUnoPresquUnoKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoWizzRule());
					}
					setWithLastConsumed($current, "presquUno", lv_presquUno_1_0, "presquUno,");
				}
			)
		)+
		(
			(
				lv_chiffreMoins_2_0='chiffreMoins,'
				{
					newLeafNode(lv_chiffreMoins_2_0, grammarAccess.getUnoWizzAccess().getChiffreMoinsChiffreMoinsKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoWizzRule());
					}
					setWithLastConsumed($current, "chiffreMoins", lv_chiffreMoins_2_0, "chiffreMoins,");
				}
			)
		)+
		(
			(
				lv_couleurMoins_3_0='couleurMoins,'
				{
					newLeafNode(lv_couleurMoins_3_0, grammarAccess.getUnoWizzAccess().getCouleurMoinsCouleurMoinsKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoWizzRule());
					}
					setWithLastConsumed($current, "couleurMoins", lv_couleurMoins_3_0, "couleurMoins,");
				}
			)
		)+
		(
			(
				lv_carteRouge_4_0='carteRouge'
				{
					newLeafNode(lv_carteRouge_4_0, grammarAccess.getUnoWizzAccess().getCarteRougeCarteRougeKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnoWizzRule());
					}
					setWithLastConsumed($current, "carteRouge", lv_carteRouge_4_0, "carteRouge");
				}
			)
		)+
		(
			otherlv_5='carteBleue'
			{
				newLeafNode(otherlv_5, grammarAccess.getUnoWizzAccess().getCarteBleueKeyword_5());
			}
		)+
		(
			otherlv_6='echange'
			{
				newLeafNode(otherlv_6, grammarAccess.getUnoWizzAccess().getEchangeKeyword_6());
			}
		)+
		(
			otherlv_7='mainVisible'
			{
				newLeafNode(otherlv_7, grammarAccess.getUnoWizzAccess().getMainVisibleKeyword_7());
			}
		)+
		(
			otherlv_8='unoWizz'
			{
				newLeafNode(otherlv_8, grammarAccess.getUnoWizzAccess().getUnoWizzKeyword_8());
			}
		)+
		otherlv_9='War'
		{
			newLeafNode(otherlv_9, grammarAccess.getUnoWizzAccess().getWarKeyword_9());
		}
	)
;

// Entry rule entryRuleUnoRapido
entryRuleUnoRapido returns [String current=null]:
	{ newCompositeNode(grammarAccess.getUnoRapidoRule()); }
	iv_ruleUnoRapido=ruleUnoRapido
	{ $current=$iv_ruleUnoRapido.current.getText(); }
	EOF;

// Rule UnoRapido
ruleUnoRapido returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='UnoRapido'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnoRapidoAccess().getUnoRapidoKeyword_0());
			}
		)+
		(
			kw='Pioche'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnoRapidoAccess().getPiocheKeyword_1());
			}
		)+
		(
			kw='Confusion'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnoRapidoAccess().getConfusionKeyword_2());
			}
		)+
		(
			kw='Defense'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnoRapidoAccess().getDefenseKeyword_3());
			}
		)+
		(
			kw='Rapido'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnoRapidoAccess().getRapidoKeyword_4());
			}
		)+
		kw='CarteUno'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUnoRapidoAccess().getCarteUnoKeyword_5());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;