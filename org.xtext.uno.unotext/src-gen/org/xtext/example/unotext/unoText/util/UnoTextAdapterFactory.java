/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.unotext.unoText.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.unotext.unoText.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.unotext.unoText.UnoTextPackage
 * @generated
 */
public class UnoTextAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UnoTextPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnoTextAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = UnoTextPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnoTextSwitch<Adapter> modelSwitch =
    new UnoTextSwitch<Adapter>()
    {
      @Override
      public Adapter caseUno(Uno object)
      {
        return createUnoAdapter();
      }
      @Override
      public Adapter caseUno_Rule(Uno_Rule object)
      {
        return createUno_RuleAdapter();
      }
      @Override
      public Adapter caseUno_Classic(Uno_Classic object)
      {
        return createUno_ClassicAdapter();
      }
      @Override
      public Adapter caseCarteIdentique(CarteIdentique object)
      {
        return createCarteIdentiqueAdapter();
      }
      @Override
      public Adapter caseCumulAjout(CumulAjout object)
      {
        return createCumulAjoutAdapter();
      }
      @Override
      public Adapter caseUnoOlypique(UnoOlypique object)
      {
        return createUnoOlypiqueAdapter();
      }
      @Override
      public Adapter caseUnoWizz(UnoWizz object)
      {
        return createUnoWizzAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.unotext.unoText.Uno <em>Uno</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.unotext.unoText.Uno
   * @generated
   */
  public Adapter createUnoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.unotext.unoText.Uno_Rule <em>Uno Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.unotext.unoText.Uno_Rule
   * @generated
   */
  public Adapter createUno_RuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.unotext.unoText.Uno_Classic <em>Uno Classic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.unotext.unoText.Uno_Classic
   * @generated
   */
  public Adapter createUno_ClassicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.unotext.unoText.CarteIdentique <em>Carte Identique</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.unotext.unoText.CarteIdentique
   * @generated
   */
  public Adapter createCarteIdentiqueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.unotext.unoText.CumulAjout <em>Cumul Ajout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.unotext.unoText.CumulAjout
   * @generated
   */
  public Adapter createCumulAjoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.unotext.unoText.UnoOlypique <em>Uno Olypique</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.unotext.unoText.UnoOlypique
   * @generated
   */
  public Adapter createUnoOlypiqueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.unotext.unoText.UnoWizz <em>Uno Wizz</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.unotext.unoText.UnoWizz
   * @generated
   */
  public Adapter createUnoWizzAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //UnoTextAdapterFactory