/**
 */
package edu.kit.kastel.scbs.confidentiality.adversary;

import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.scbs.confidentiality.adversary.AdversaryFactory
 * @model kind="package"
 * @generated
 */
public interface AdversaryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adversary";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.kastel.scbs.confidentiality/adversary";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edu.kit.kastel.scbs.confidentiality.adversary";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdversaryPackage eINSTANCE = edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversaryPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversariesImpl <em>Adversaries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversariesImpl
	 * @see edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversaryPackageImpl#getAdversaries()
	 * @generated
	 */
	int ADVERSARIES = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERSARIES__ID = ConfidentialityPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERSARIES__NAME = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Adversaries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERSARIES__ADVERSARIES = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Adversaries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERSARIES_FEATURE_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Adversaries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERSARIES_OPERATION_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversaryImpl <em>Adversary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversaryImpl
	 * @see edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversaryPackageImpl#getAdversary()
	 * @generated
	 */
	int ADVERSARY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERSARY__ID = ConfidentialityPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERSARY__NAME = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>May Know Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERSARY__MAY_KNOW_DATA = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Locations And Tamper Protections Pairs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERSARY__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Adversary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERSARY_FEATURE_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Adversary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERSARY_OPERATION_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.adversary.Adversaries <em>Adversaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adversaries</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.adversary.Adversaries
	 * @generated
	 */
	EClass getAdversaries();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.confidentiality.adversary.Adversaries#getAdversaries <em>Adversaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adversaries</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.adversary.Adversaries#getAdversaries()
	 * @see #getAdversaries()
	 * @generated
	 */
	EReference getAdversaries_Adversaries();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.adversary.Adversary <em>Adversary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adversary</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.adversary.Adversary
	 * @generated
	 */
	EClass getAdversary();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.scbs.confidentiality.adversary.Adversary#getMayKnowData <em>May Know Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>May Know Data</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.adversary.Adversary#getMayKnowData()
	 * @see #getAdversary()
	 * @generated
	 */
	EReference getAdversary_MayKnowData();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.scbs.confidentiality.adversary.Adversary#getLocationsAndTamperProtectionsPairs <em>Locations And Tamper Protections Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations And Tamper Protections Pairs</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.adversary.Adversary#getLocationsAndTamperProtectionsPairs()
	 * @see #getAdversary()
	 * @generated
	 */
	EReference getAdversary_LocationsAndTamperProtectionsPairs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdversaryFactory getAdversaryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversariesImpl <em>Adversaries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversariesImpl
		 * @see edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversaryPackageImpl#getAdversaries()
		 * @generated
		 */
		EClass ADVERSARIES = eINSTANCE.getAdversaries();

		/**
		 * The meta object literal for the '<em><b>Adversaries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVERSARIES__ADVERSARIES = eINSTANCE.getAdversaries_Adversaries();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversaryImpl <em>Adversary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversaryImpl
		 * @see edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversaryPackageImpl#getAdversary()
		 * @generated
		 */
		EClass ADVERSARY = eINSTANCE.getAdversary();

		/**
		 * The meta object literal for the '<em><b>May Know Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVERSARY__MAY_KNOW_DATA = eINSTANCE.getAdversary_MayKnowData();

		/**
		 * The meta object literal for the '<em><b>Locations And Tamper Protections Pairs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVERSARY__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS = eINSTANCE.getAdversary_LocationsAndTamperProtectionsPairs();

	}

} //AdversaryPackage
