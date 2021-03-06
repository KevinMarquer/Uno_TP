/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.unotext.unoText.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.unotext.unoText.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnoTextFactoryImpl extends EFactoryImpl implements UnoTextFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UnoTextFactory init()
  {
    try
    {
      UnoTextFactory theUnoTextFactory = (UnoTextFactory)EPackage.Registry.INSTANCE.getEFactory(UnoTextPackage.eNS_URI);
      if (theUnoTextFactory != null)
      {
        return theUnoTextFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UnoTextFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnoTextFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UnoTextPackage.UNO: return createUno();
      case UnoTextPackage.UNO_RULE: return createUno_Rule();
      case UnoTextPackage.UNO_CLASSIC: return createUno_Classic();
      case UnoTextPackage.CARTE_IDENTIQUE: return createCarteIdentique();
      case UnoTextPackage.CUMUL_AJOUT: return createCumulAjout();
      case UnoTextPackage.UNO_OLYPIQUE: return createUnoOlypique();
      case UnoTextPackage.UNO_WIZZ: return createUnoWizz();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Uno createUno()
  {
    UnoImpl uno = new UnoImpl();
    return uno;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Uno_Rule createUno_Rule()
  {
    Uno_RuleImpl uno_Rule = new Uno_RuleImpl();
    return uno_Rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Uno_Classic createUno_Classic()
  {
    Uno_ClassicImpl uno_Classic = new Uno_ClassicImpl();
    return uno_Classic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CarteIdentique createCarteIdentique()
  {
    CarteIdentiqueImpl carteIdentique = new CarteIdentiqueImpl();
    return carteIdentique;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CumulAjout createCumulAjout()
  {
    CumulAjoutImpl cumulAjout = new CumulAjoutImpl();
    return cumulAjout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnoOlypique createUnoOlypique()
  {
    UnoOlypiqueImpl unoOlypique = new UnoOlypiqueImpl();
    return unoOlypique;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnoWizz createUnoWizz()
  {
    UnoWizzImpl unoWizz = new UnoWizzImpl();
    return unoWizz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnoTextPackage getUnoTextPackage()
  {
    return (UnoTextPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UnoTextPackage getPackage()
  {
    return UnoTextPackage.eINSTANCE;
  }

} //UnoTextFactoryImpl
