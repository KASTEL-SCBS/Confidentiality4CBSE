/**
 */
package edu.kit.kastel.scbs.confidentiality.resources;

import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see edu.kit.kastel.scbs.confidentiality.resources.ResourcesFactory
 * @model kind="package"
 * @generated
 */
public interface ResourcesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resources";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.kastel.scbs.confidentiality/resources";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edu.kit.kastel.scbs.confidentiality.resources";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcesPackage eINSTANCE = edu.kit.kastel.scbs.confidentiality.resources.impl.ResourcesPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.resources.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.resources.impl.LocationImpl
	 * @see edu.kit.kastel.scbs.confidentiality.resources.impl.ResourcesPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = ConfidentialityPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.resources.impl.TamperProtectionImpl <em>Tamper Protection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.resources.impl.TamperProtectionImpl
	 * @see edu.kit.kastel.scbs.confidentiality.resources.impl.ResourcesPackageImpl#getTamperProtection()
	 * @generated
	 */
	int TAMPER_PROTECTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAMPER_PROTECTION__ID = ConfidentialityPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAMPER_PROTECTION__NAME = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tamper Protection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAMPER_PROTECTION_FEATURE_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tamper Protection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAMPER_PROTECTION_OPERATION_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.resources.impl.LocationsAndTamperProtectionsPairImpl <em>Locations And Tamper Protections Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.resources.impl.LocationsAndTamperProtectionsPairImpl
	 * @see edu.kit.kastel.scbs.confidentiality.resources.impl.ResourcesPackageImpl#getLocationsAndTamperProtectionsPair()
	 * @generated
	 */
	int LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__ID = ConfidentialityPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__NAME = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__LOCATIONS = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tamper Protections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__TAMPER_PROTECTIONS = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Locations And Tamper Protections Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR_FEATURE_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Locations And Tamper Protections Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR_OPERATION_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.resources.SharingType <em>Sharing Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.resources.SharingType
	 * @see edu.kit.kastel.scbs.confidentiality.resources.impl.ResourcesPackageImpl#getSharingType()
	 * @generated
	 */
	int SHARING_TYPE = 3;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.resources.ConnectionType <em>Connection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.resources.ConnectionType
	 * @see edu.kit.kastel.scbs.confidentiality.resources.impl.ResourcesPackageImpl#getConnectionType()
	 * @generated
	 */
	int CONNECTION_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.resources.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.resources.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.resources.TamperProtection <em>Tamper Protection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tamper Protection</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.resources.TamperProtection
	 * @generated
	 */
	EClass getTamperProtection();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.resources.LocationsAndTamperProtectionsPair <em>Locations And Tamper Protections Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locations And Tamper Protections Pair</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.resources.LocationsAndTamperProtectionsPair
	 * @generated
	 */
	EClass getLocationsAndTamperProtectionsPair();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.scbs.confidentiality.resources.LocationsAndTamperProtectionsPair#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.resources.LocationsAndTamperProtectionsPair#getLocations()
	 * @see #getLocationsAndTamperProtectionsPair()
	 * @generated
	 */
	EReference getLocationsAndTamperProtectionsPair_Locations();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.scbs.confidentiality.resources.LocationsAndTamperProtectionsPair#getTamperProtections <em>Tamper Protections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tamper Protections</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.resources.LocationsAndTamperProtectionsPair#getTamperProtections()
	 * @see #getLocationsAndTamperProtectionsPair()
	 * @generated
	 */
	EReference getLocationsAndTamperProtectionsPair_TamperProtections();

	/**
	 * Returns the meta object for enum '{@link edu.kit.kastel.scbs.confidentiality.resources.SharingType <em>Sharing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sharing Type</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.resources.SharingType
	 * @generated
	 */
	EEnum getSharingType();

	/**
	 * Returns the meta object for enum '{@link edu.kit.kastel.scbs.confidentiality.resources.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Type</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.resources.ConnectionType
	 * @generated
	 */
	EEnum getConnectionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourcesFactory getResourcesFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.resources.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.resources.impl.LocationImpl
		 * @see edu.kit.kastel.scbs.confidentiality.resources.impl.ResourcesPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.resources.impl.TamperProtectionImpl <em>Tamper Protection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.resources.impl.TamperProtectionImpl
		 * @see edu.kit.kastel.scbs.confidentiality.resources.impl.ResourcesPackageImpl#getTamperProtection()
		 * @generated
		 */
		EClass TAMPER_PROTECTION = eINSTANCE.getTamperProtection();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.resources.impl.LocationsAndTamperProtectionsPairImpl <em>Locations And Tamper Protections Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.resources.impl.LocationsAndTamperProtectionsPairImpl
		 * @see edu.kit.kastel.scbs.confidentiality.resources.impl.ResourcesPackageImpl#getLocationsAndTamperProtectionsPair()
		 * @generated
		 */
		EClass LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR = eINSTANCE.getLocationsAndTamperProtectionsPair();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__LOCATIONS = eINSTANCE.getLocationsAndTamperProtectionsPair_Locations();

		/**
		 * The meta object literal for the '<em><b>Tamper Protections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__TAMPER_PROTECTIONS = eINSTANCE.getLocationsAndTamperProtectionsPair_TamperProtections();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.resources.SharingType <em>Sharing Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.resources.SharingType
		 * @see edu.kit.kastel.scbs.confidentiality.resources.impl.ResourcesPackageImpl#getSharingType()
		 * @generated
		 */
		EEnum SHARING_TYPE = eINSTANCE.getSharingType();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.resources.ConnectionType <em>Connection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.resources.ConnectionType
		 * @see edu.kit.kastel.scbs.confidentiality.resources.impl.ResourcesPackageImpl#getConnectionType()
		 * @generated
		 */
		EEnum CONNECTION_TYPE = eINSTANCE.getConnectionType();

	}

} //ResourcesPackage
