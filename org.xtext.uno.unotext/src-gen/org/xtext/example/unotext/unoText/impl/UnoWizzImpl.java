/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.unotext.unoText.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.unotext.unoText.UnoTextPackage;
import org.xtext.example.unotext.unoText.UnoWizz;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uno Wizz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.unotext.unoText.impl.UnoWizzImpl#getPresquUno <em>Presqu Uno</em>}</li>
 *   <li>{@link org.xtext.example.unotext.unoText.impl.UnoWizzImpl#getChiffreMoins <em>Chiffre Moins</em>}</li>
 *   <li>{@link org.xtext.example.unotext.unoText.impl.UnoWizzImpl#getCouleurMoins <em>Couleur Moins</em>}</li>
 *   <li>{@link org.xtext.example.unotext.unoText.impl.UnoWizzImpl#getCarteRouge <em>Carte Rouge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnoWizzImpl extends Uno_RuleImpl implements UnoWizz
{
  /**
   * The default value of the '{@link #getPresquUno() <em>Presqu Uno</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresquUno()
   * @generated
   * @ordered
   */
  protected static final String PRESQU_UNO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPresquUno() <em>Presqu Uno</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresquUno()
   * @generated
   * @ordered
   */
  protected String presquUno = PRESQU_UNO_EDEFAULT;

  /**
   * The default value of the '{@link #getChiffreMoins() <em>Chiffre Moins</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChiffreMoins()
   * @generated
   * @ordered
   */
  protected static final String CHIFFRE_MOINS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getChiffreMoins() <em>Chiffre Moins</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChiffreMoins()
   * @generated
   * @ordered
   */
  protected String chiffreMoins = CHIFFRE_MOINS_EDEFAULT;

  /**
   * The default value of the '{@link #getCouleurMoins() <em>Couleur Moins</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCouleurMoins()
   * @generated
   * @ordered
   */
  protected static final String COULEUR_MOINS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCouleurMoins() <em>Couleur Moins</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCouleurMoins()
   * @generated
   * @ordered
   */
  protected String couleurMoins = COULEUR_MOINS_EDEFAULT;

  /**
   * The default value of the '{@link #getCarteRouge() <em>Carte Rouge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCarteRouge()
   * @generated
   * @ordered
   */
  protected static final String CARTE_ROUGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCarteRouge() <em>Carte Rouge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCarteRouge()
   * @generated
   * @ordered
   */
  protected String carteRouge = CARTE_ROUGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnoWizzImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UnoTextPackage.Literals.UNO_WIZZ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPresquUno()
  {
    return presquUno;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPresquUno(String newPresquUno)
  {
    String oldPresquUno = presquUno;
    presquUno = newPresquUno;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoTextPackage.UNO_WIZZ__PRESQU_UNO, oldPresquUno, presquUno));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getChiffreMoins()
  {
    return chiffreMoins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setChiffreMoins(String newChiffreMoins)
  {
    String oldChiffreMoins = chiffreMoins;
    chiffreMoins = newChiffreMoins;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoTextPackage.UNO_WIZZ__CHIFFRE_MOINS, oldChiffreMoins, chiffreMoins));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCouleurMoins()
  {
    return couleurMoins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCouleurMoins(String newCouleurMoins)
  {
    String oldCouleurMoins = couleurMoins;
    couleurMoins = newCouleurMoins;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoTextPackage.UNO_WIZZ__COULEUR_MOINS, oldCouleurMoins, couleurMoins));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCarteRouge()
  {
    return carteRouge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCarteRouge(String newCarteRouge)
  {
    String oldCarteRouge = carteRouge;
    carteRouge = newCarteRouge;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoTextPackage.UNO_WIZZ__CARTE_ROUGE, oldCarteRouge, carteRouge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UnoTextPackage.UNO_WIZZ__PRESQU_UNO:
        return getPresquUno();
      case UnoTextPackage.UNO_WIZZ__CHIFFRE_MOINS:
        return getChiffreMoins();
      case UnoTextPackage.UNO_WIZZ__COULEUR_MOINS:
        return getCouleurMoins();
      case UnoTextPackage.UNO_WIZZ__CARTE_ROUGE:
        return getCarteRouge();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UnoTextPackage.UNO_WIZZ__PRESQU_UNO:
        setPresquUno((String)newValue);
        return;
      case UnoTextPackage.UNO_WIZZ__CHIFFRE_MOINS:
        setChiffreMoins((String)newValue);
        return;
      case UnoTextPackage.UNO_WIZZ__COULEUR_MOINS:
        setCouleurMoins((String)newValue);
        return;
      case UnoTextPackage.UNO_WIZZ__CARTE_ROUGE:
        setCarteRouge((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UnoTextPackage.UNO_WIZZ__PRESQU_UNO:
        setPresquUno(PRESQU_UNO_EDEFAULT);
        return;
      case UnoTextPackage.UNO_WIZZ__CHIFFRE_MOINS:
        setChiffreMoins(CHIFFRE_MOINS_EDEFAULT);
        return;
      case UnoTextPackage.UNO_WIZZ__COULEUR_MOINS:
        setCouleurMoins(COULEUR_MOINS_EDEFAULT);
        return;
      case UnoTextPackage.UNO_WIZZ__CARTE_ROUGE:
        setCarteRouge(CARTE_ROUGE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UnoTextPackage.UNO_WIZZ__PRESQU_UNO:
        return PRESQU_UNO_EDEFAULT == null ? presquUno != null : !PRESQU_UNO_EDEFAULT.equals(presquUno);
      case UnoTextPackage.UNO_WIZZ__CHIFFRE_MOINS:
        return CHIFFRE_MOINS_EDEFAULT == null ? chiffreMoins != null : !CHIFFRE_MOINS_EDEFAULT.equals(chiffreMoins);
      case UnoTextPackage.UNO_WIZZ__COULEUR_MOINS:
        return COULEUR_MOINS_EDEFAULT == null ? couleurMoins != null : !COULEUR_MOINS_EDEFAULT.equals(couleurMoins);
      case UnoTextPackage.UNO_WIZZ__CARTE_ROUGE:
        return CARTE_ROUGE_EDEFAULT == null ? carteRouge != null : !CARTE_ROUGE_EDEFAULT.equals(carteRouge);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (presquUno: ");
    result.append(presquUno);
    result.append(", chiffreMoins: ");
    result.append(chiffreMoins);
    result.append(", couleurMoins: ");
    result.append(couleurMoins);
    result.append(", carteRouge: ");
    result.append(carteRouge);
    result.append(')');
    return result.toString();
  }

} //UnoWizzImpl
