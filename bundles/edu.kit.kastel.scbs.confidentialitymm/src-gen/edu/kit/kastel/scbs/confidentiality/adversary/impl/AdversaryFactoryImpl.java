/**
 */
package edu.kit.kastel.scbs.confidentiality.adversary.impl;

import edu.kit.kastel.scbs.confidentiality.adversary.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdversaryFactoryImpl extends EFactoryImpl implements AdversaryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdversaryFactory init() {
		try {
			AdversaryFactory theAdversaryFactory = (AdversaryFactory)EPackage.Registry.INSTANCE.getEFactory(AdversaryPackage.eNS_URI);
			if (theAdversaryFactory != null) {
				return theAdversaryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdversaryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdversaryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AdversaryPackage.ADVERSARIES: return createAdversaries();
			case AdversaryPackage.ADVERSARY: return createAdversary();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adversaries createAdversaries() {
		AdversariesImpl adversaries = new AdversariesImpl();
		return adversaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adversary createAdversary() {
		AdversaryImpl adversary = new AdversaryImpl();
		return adversary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdversaryPackage getAdversaryPackage() {
		return (AdversaryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdversaryPackage getPackage() {
		return AdversaryPackage.eINSTANCE;
	}

} //AdversaryFactoryImpl
