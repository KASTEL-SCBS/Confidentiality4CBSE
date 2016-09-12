/**
 */
package edu.kit.kastel.scbs.confidentiality.impl;

import edu.kit.kastel.scbs.confidentiality.*;

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
public class ConfidentialityFactoryImpl extends EFactoryImpl implements ConfidentialityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfidentialityFactory init() {
		try {
			ConfidentialityFactory theConfidentialityFactory = (ConfidentialityFactory)EPackage.Registry.INSTANCE.getEFactory(ConfidentialityPackage.eNS_URI);
			if (theConfidentialityFactory != null) {
				return theConfidentialityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfidentialityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialityFactoryImpl() {
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
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION: return createConfidentialitySpecification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialitySpecification createConfidentialitySpecification() {
		ConfidentialitySpecificationImpl confidentialitySpecification = new ConfidentialitySpecificationImpl();
		return confidentialitySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialityPackage getConfidentialityPackage() {
		return (ConfidentialityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfidentialityPackage getPackage() {
		return ConfidentialityPackage.eINSTANCE;
	}

} //ConfidentialityFactoryImpl
