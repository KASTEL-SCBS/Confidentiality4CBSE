/**
 */
package edu.kit.kastel.scbs.confidentiality.resources.impl;

import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;

import edu.kit.kastel.scbs.confidentiality.adversary.AdversaryPackage;

import edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversaryPackageImpl;

import edu.kit.kastel.scbs.confidentiality.data.DataPackage;

import edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl;

import edu.kit.kastel.scbs.confidentiality.impl.ConfidentialityPackageImpl;

import edu.kit.kastel.scbs.confidentiality.repository.RepositoryPackage;

import edu.kit.kastel.scbs.confidentiality.repository.impl.RepositoryPackageImpl;

import edu.kit.kastel.scbs.confidentiality.resources.ConnectionType;
import edu.kit.kastel.scbs.confidentiality.resources.Location;
import edu.kit.kastel.scbs.confidentiality.resources.LocationsAndTamperProtectionsPair;
import edu.kit.kastel.scbs.confidentiality.resources.ResourcesFactory;
import edu.kit.kastel.scbs.confidentiality.resources.ResourcesPackage;
import edu.kit.kastel.scbs.confidentiality.resources.SharingType;
import edu.kit.kastel.scbs.confidentiality.resources.TamperProtection;

import edu.kit.kastel.scbs.confidentiality.system.SystemPackage;

import edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcesPackageImpl extends EPackageImpl implements ResourcesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tamperProtectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationsAndTamperProtectionsPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sharingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.kastel.scbs.confidentiality.resources.ResourcesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResourcesPackageImpl() {
		super(eNS_URI, ResourcesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ResourcesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResourcesPackage init() {
		if (isInited) return (ResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);

		// Obtain or create and register package
		ResourcesPackageImpl theResourcesPackage = (ResourcesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResourcesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResourcesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ConfidentialityPackageImpl theConfidentialityPackage = (ConfidentialityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfidentialityPackage.eNS_URI) instanceof ConfidentialityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfidentialityPackage.eNS_URI) : ConfidentialityPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) instanceof RepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) : RepositoryPackage.eINSTANCE);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) instanceof SystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) : SystemPackage.eINSTANCE);
		AdversaryPackageImpl theAdversaryPackage = (AdversaryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdversaryPackage.eNS_URI) instanceof AdversaryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdversaryPackage.eNS_URI) : AdversaryPackage.eINSTANCE);

		// Create package meta-data objects
		theResourcesPackage.createPackageContents();
		theConfidentialityPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theAdversaryPackage.createPackageContents();

		// Initialize created meta-data
		theResourcesPackage.initializePackageContents();
		theConfidentialityPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theAdversaryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResourcesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResourcesPackage.eNS_URI, theResourcesPackage);
		return theResourcesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTamperProtection() {
		return tamperProtectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationsAndTamperProtectionsPair() {
		return locationsAndTamperProtectionsPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationsAndTamperProtectionsPair_Locations() {
		return (EReference)locationsAndTamperProtectionsPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationsAndTamperProtectionsPair_TamperProtections() {
		return (EReference)locationsAndTamperProtectionsPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSharingType() {
		return sharingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectionType() {
		return connectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesFactory getResourcesFactory() {
		return (ResourcesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		locationEClass = createEClass(LOCATION);

		tamperProtectionEClass = createEClass(TAMPER_PROTECTION);

		locationsAndTamperProtectionsPairEClass = createEClass(LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR);
		createEReference(locationsAndTamperProtectionsPairEClass, LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__LOCATIONS);
		createEReference(locationsAndTamperProtectionsPairEClass, LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__TAMPER_PROTECTIONS);

		// Create enums
		sharingTypeEEnum = createEEnum(SHARING_TYPE);
		connectionTypeEEnum = createEEnum(CONNECTION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ConfidentialityPackage theConfidentialityPackage = (ConfidentialityPackage)EPackage.Registry.INSTANCE.getEPackage(ConfidentialityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		locationEClass.getESuperTypes().add(theConfidentialityPackage.getIdentifiedElement());
		locationEClass.getESuperTypes().add(theConfidentialityPackage.getNamedElement());
		tamperProtectionEClass.getESuperTypes().add(theConfidentialityPackage.getIdentifiedElement());
		tamperProtectionEClass.getESuperTypes().add(theConfidentialityPackage.getNamedElement());
		locationsAndTamperProtectionsPairEClass.getESuperTypes().add(theConfidentialityPackage.getIdentifiedElement());
		locationsAndTamperProtectionsPairEClass.getESuperTypes().add(theConfidentialityPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tamperProtectionEClass, TamperProtection.class, "TamperProtection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationsAndTamperProtectionsPairEClass, LocationsAndTamperProtectionsPair.class, "LocationsAndTamperProtectionsPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationsAndTamperProtectionsPair_Locations(), this.getLocation(), null, "locations", null, 1, -1, LocationsAndTamperProtectionsPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationsAndTamperProtectionsPair_TamperProtections(), this.getTamperProtection(), null, "tamperProtections", null, 0, -1, LocationsAndTamperProtectionsPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sharingTypeEEnum, SharingType.class, "SharingType");
		addEEnumLiteral(sharingTypeEEnum, SharingType.SHARED);
		addEEnumLiteral(sharingTypeEEnum, SharingType.EXCLUSIVE);

		initEEnum(connectionTypeEEnum, ConnectionType.class, "ConnectionType");
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.EXISTING);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.POSSIBLE);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.COMPLETE);
	}

} //ResourcesPackageImpl
