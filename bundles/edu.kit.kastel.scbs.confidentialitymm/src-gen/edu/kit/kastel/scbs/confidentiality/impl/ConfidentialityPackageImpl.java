/**
 */
package edu.kit.kastel.scbs.confidentiality.impl;

import edu.kit.kastel.scbs.confidentiality.ConfidentialityFactory;
import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;
import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.IdentifiedElement;
import edu.kit.kastel.scbs.confidentiality.NamedElement;

import edu.kit.kastel.scbs.confidentiality.adversary.AdversaryPackage;

import edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversaryPackageImpl;

import edu.kit.kastel.scbs.confidentiality.data.DataPackage;

import edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl;

import edu.kit.kastel.scbs.confidentiality.repository.RepositoryPackage;

import edu.kit.kastel.scbs.confidentiality.repository.impl.RepositoryPackageImpl;

import edu.kit.kastel.scbs.confidentiality.resources.ResourcesPackage;

import edu.kit.kastel.scbs.confidentiality.resources.impl.ResourcesPackageImpl;

import edu.kit.kastel.scbs.confidentiality.system.SystemPackage;

import edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfidentialityPackageImpl extends EPackageImpl implements ConfidentialityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confidentialitySpecificationEClass = null;

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
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfidentialityPackageImpl() {
		super(eNS_URI, ConfidentialityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConfidentialityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfidentialityPackage init() {
		if (isInited) return (ConfidentialityPackage)EPackage.Registry.INSTANCE.getEPackage(ConfidentialityPackage.eNS_URI);

		// Obtain or create and register package
		ConfidentialityPackageImpl theConfidentialityPackage = (ConfidentialityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfidentialityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfidentialityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) instanceof RepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) : RepositoryPackage.eINSTANCE);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) instanceof SystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) : SystemPackage.eINSTANCE);
		ResourcesPackageImpl theResourcesPackage = (ResourcesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) instanceof ResourcesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) : ResourcesPackage.eINSTANCE);
		AdversaryPackageImpl theAdversaryPackage = (AdversaryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdversaryPackage.eNS_URI) instanceof AdversaryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdversaryPackage.eNS_URI) : AdversaryPackage.eINSTANCE);

		// Create package meta-data objects
		theConfidentialityPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theResourcesPackage.createPackageContents();
		theAdversaryPackage.createPackageContents();

		// Initialize created meta-data
		theConfidentialityPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theResourcesPackage.initializePackageContents();
		theAdversaryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfidentialityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfidentialityPackage.eNS_URI, theConfidentialityPackage);
		return theConfidentialityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiedElement() {
		return identifiedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Id() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfidentialitySpecification() {
		return confidentialitySpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfidentialitySpecification_DataIdentifier() {
		return (EReference)confidentialitySpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfidentialitySpecification_DataSetMaps() {
		return (EReference)confidentialitySpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfidentialitySpecification_ParametersAndDataPairs() {
		return (EReference)confidentialitySpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfidentialitySpecification_AddedServiceParameters() {
		return (EReference)confidentialitySpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfidentialitySpecification_SpecificationParameterAssignments() {
		return (EReference)confidentialitySpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfidentialitySpecification_SpecificationParameterEquations() {
		return (EReference)confidentialitySpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfidentialitySpecification_Locations() {
		return (EReference)confidentialitySpecificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfidentialitySpecification_TamperProtections() {
		return (EReference)confidentialitySpecificationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfidentialitySpecification_LocationsAndTamperProtectionsPairs() {
		return (EReference)confidentialitySpecificationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialityFactory getConfidentialityFactory() {
		return (ConfidentialityFactory)getEFactoryInstance();
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
		identifiedElementEClass = createEClass(IDENTIFIED_ELEMENT);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__ID);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		confidentialitySpecificationEClass = createEClass(CONFIDENTIALITY_SPECIFICATION);
		createEReference(confidentialitySpecificationEClass, CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER);
		createEReference(confidentialitySpecificationEClass, CONFIDENTIALITY_SPECIFICATION__DATA_SET_MAPS);
		createEReference(confidentialitySpecificationEClass, CONFIDENTIALITY_SPECIFICATION__PARAMETERS_AND_DATA_PAIRS);
		createEReference(confidentialitySpecificationEClass, CONFIDENTIALITY_SPECIFICATION__ADDED_SERVICE_PARAMETERS);
		createEReference(confidentialitySpecificationEClass, CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_ASSIGNMENTS);
		createEReference(confidentialitySpecificationEClass, CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_EQUATIONS);
		createEReference(confidentialitySpecificationEClass, CONFIDENTIALITY_SPECIFICATION__LOCATIONS);
		createEReference(confidentialitySpecificationEClass, CONFIDENTIALITY_SPECIFICATION__TAMPER_PROTECTIONS);
		createEReference(confidentialitySpecificationEClass, CONFIDENTIALITY_SPECIFICATION__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS);
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
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		ResourcesPackage theResourcesPackage = (ResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);
		AdversaryPackage theAdversaryPackage = (AdversaryPackage)EPackage.Registry.INSTANCE.getEPackage(AdversaryPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDataPackage);
		getESubpackages().add(theRepositoryPackage);
		getESubpackages().add(theSystemPackage);
		getESubpackages().add(theResourcesPackage);
		getESubpackages().add(theAdversaryPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		confidentialitySpecificationEClass.getESuperTypes().add(this.getIdentifiedElement());
		confidentialitySpecificationEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(identifiedElementEClass, IdentifiedElement.class, "IdentifiedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(confidentialitySpecificationEClass, ConfidentialitySpecification.class, "ConfidentialitySpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfidentialitySpecification_DataIdentifier(), theDataPackage.getDataIdentifying(), null, "dataIdentifier", null, 1, -1, ConfidentialitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfidentialitySpecification_DataSetMaps(), theDataPackage.getDataSetMap(), theDataPackage.getDataSetMap_SpecificationContainer(), "dataSetMaps", null, 0, -1, ConfidentialitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfidentialitySpecification_ParametersAndDataPairs(), theRepositoryPackage.getParametersAndDataPair(), null, "parametersAndDataPairs", null, 1, -1, ConfidentialitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfidentialitySpecification_AddedServiceParameters(), theRepositoryPackage.getAddedServiceParameter(), null, "addedServiceParameters", null, 0, -1, ConfidentialitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfidentialitySpecification_SpecificationParameterAssignments(), theSystemPackage.getAbstractSpecificationParameterAssignment(), null, "specificationParameterAssignments", null, 0, -1, ConfidentialitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfidentialitySpecification_SpecificationParameterEquations(), theSystemPackage.getSpecificationParameterEquation(), null, "specificationParameterEquations", null, 0, -1, ConfidentialitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfidentialitySpecification_Locations(), theResourcesPackage.getLocation(), null, "locations", null, 1, -1, ConfidentialitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfidentialitySpecification_TamperProtections(), theResourcesPackage.getTamperProtection(), null, "tamperProtections", null, 0, -1, ConfidentialitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfidentialitySpecification_LocationsAndTamperProtectionsPairs(), theResourcesPackage.getLocationsAndTamperProtectionsPair(), null, "locationsAndTamperProtectionsPairs", null, 1, -1, ConfidentialitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
	}

} //ConfidentialityPackageImpl
