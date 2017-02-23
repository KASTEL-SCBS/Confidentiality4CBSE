/**
 */
package edu.kit.kastel.scbs.confidentiality.data.impl;

import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;

import edu.kit.kastel.scbs.confidentiality.adversary.AdversaryPackage;

import edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversaryPackageImpl;

import edu.kit.kastel.scbs.confidentiality.data.AbstractDataSetMapEntry;
import edu.kit.kastel.scbs.confidentiality.data.DataFactory;
import edu.kit.kastel.scbs.confidentiality.data.DataIdentifying;
import edu.kit.kastel.scbs.confidentiality.data.DataPackage;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.data.DataSetMap;
import edu.kit.kastel.scbs.confidentiality.data.DataSetMapEntry;
import edu.kit.kastel.scbs.confidentiality.data.ParameterizedDataSetMapEntry;
import edu.kit.kastel.scbs.confidentiality.data.SpecificationParameter;
import edu.kit.kastel.scbs.confidentiality.data.UnparameterizedDataIdentifying;

import edu.kit.kastel.scbs.confidentiality.impl.ConfidentialityPackageImpl;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataPackageImpl extends EPackageImpl implements DataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataIdentifyingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unparameterizedDataIdentifyingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDataSetMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedDataSetMapEntryEClass = null;

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
	 * @see edu.kit.kastel.scbs.confidentiality.data.DataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataPackageImpl() {
		super(eNS_URI, DataFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataPackage init() {
		if (isInited) return (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Obtain or create and register package
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ConfidentialityPackageImpl theConfidentialityPackage = (ConfidentialityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfidentialityPackage.eNS_URI) instanceof ConfidentialityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfidentialityPackage.eNS_URI) : ConfidentialityPackage.eINSTANCE);
		RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) instanceof RepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) : RepositoryPackage.eINSTANCE);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) instanceof SystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) : SystemPackage.eINSTANCE);
		ResourcesPackageImpl theResourcesPackage = (ResourcesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) instanceof ResourcesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) : ResourcesPackage.eINSTANCE);
		AdversaryPackageImpl theAdversaryPackage = (AdversaryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdversaryPackage.eNS_URI) instanceof AdversaryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdversaryPackage.eNS_URI) : AdversaryPackage.eINSTANCE);

		// Create package meta-data objects
		theDataPackage.createPackageContents();
		theConfidentialityPackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theResourcesPackage.createPackageContents();
		theAdversaryPackage.createPackageContents();

		// Initialize created meta-data
		theDataPackage.initializePackageContents();
		theConfidentialityPackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theResourcesPackage.initializePackageContents();
		theAdversaryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataPackage.eNS_URI, theDataPackage);
		return theDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataIdentifying() {
		return dataIdentifyingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnparameterizedDataIdentifying() {
		return unparameterizedDataIdentifyingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSet() {
		return dataSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSetMap() {
		return dataSetMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSetMap_SpecificationContainer() {
		return (EReference)dataSetMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificationParameter() {
		return specificationParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificationParameter_DefiningServiceParameter() {
		return (EAttribute)specificationParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDataSetMapEntry() {
		return abstractDataSetMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractDataSetMapEntry_Map() {
		return (EReference)abstractDataSetMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSetMapEntry() {
		return dataSetMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterizedDataSetMapEntry() {
		return parameterizedDataSetMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterizedDataSetMapEntry_Parameter() {
		return (EReference)parameterizedDataSetMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFactory getDataFactory() {
		return (DataFactory)getEFactoryInstance();
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
		dataIdentifyingEClass = createEClass(DATA_IDENTIFYING);

		unparameterizedDataIdentifyingEClass = createEClass(UNPARAMETERIZED_DATA_IDENTIFYING);

		dataSetEClass = createEClass(DATA_SET);

		dataSetMapEClass = createEClass(DATA_SET_MAP);
		createEReference(dataSetMapEClass, DATA_SET_MAP__SPECIFICATION_CONTAINER);

		specificationParameterEClass = createEClass(SPECIFICATION_PARAMETER);
		createEAttribute(specificationParameterEClass, SPECIFICATION_PARAMETER__DEFINING_SERVICE_PARAMETER);

		abstractDataSetMapEntryEClass = createEClass(ABSTRACT_DATA_SET_MAP_ENTRY);
		createEReference(abstractDataSetMapEntryEClass, ABSTRACT_DATA_SET_MAP_ENTRY__MAP);

		dataSetMapEntryEClass = createEClass(DATA_SET_MAP_ENTRY);

		parameterizedDataSetMapEntryEClass = createEClass(PARAMETERIZED_DATA_SET_MAP_ENTRY);
		createEReference(parameterizedDataSetMapEntryEClass, PARAMETERIZED_DATA_SET_MAP_ENTRY__PARAMETER);
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
		dataIdentifyingEClass.getESuperTypes().add(theConfidentialityPackage.getIdentifiedElement());
		unparameterizedDataIdentifyingEClass.getESuperTypes().add(this.getDataIdentifying());
		dataSetEClass.getESuperTypes().add(this.getUnparameterizedDataIdentifying());
		dataSetEClass.getESuperTypes().add(theConfidentialityPackage.getNamedElement());
		dataSetMapEClass.getESuperTypes().add(theConfidentialityPackage.getIdentifiedElement());
		dataSetMapEClass.getESuperTypes().add(theConfidentialityPackage.getNamedElement());
		specificationParameterEClass.getESuperTypes().add(this.getDataIdentifying());
		specificationParameterEClass.getESuperTypes().add(theConfidentialityPackage.getNamedElement());
		abstractDataSetMapEntryEClass.getESuperTypes().add(this.getDataIdentifying());
		dataSetMapEntryEClass.getESuperTypes().add(this.getAbstractDataSetMapEntry());
		dataSetMapEntryEClass.getESuperTypes().add(this.getUnparameterizedDataIdentifying());
		dataSetMapEntryEClass.getESuperTypes().add(theConfidentialityPackage.getNamedElement());
		parameterizedDataSetMapEntryEClass.getESuperTypes().add(this.getAbstractDataSetMapEntry());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataIdentifyingEClass, DataIdentifying.class, "DataIdentifying", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unparameterizedDataIdentifyingEClass, UnparameterizedDataIdentifying.class, "UnparameterizedDataIdentifying", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataSetEClass, DataSet.class, "DataSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataSetMapEClass, DataSetMap.class, "DataSetMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSetMap_SpecificationContainer(), theConfidentialityPackage.getConfidentialitySpecification(), theConfidentialityPackage.getConfidentialitySpecification_DataSetMaps(), "specificationContainer", null, 1, 1, DataSetMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationParameterEClass, SpecificationParameter.class, "SpecificationParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecificationParameter_DefiningServiceParameter(), ecorePackage.getEString(), "definingServiceParameter", null, 0, 1, SpecificationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractDataSetMapEntryEClass, AbstractDataSetMapEntry.class, "AbstractDataSetMapEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractDataSetMapEntry_Map(), this.getDataSetMap(), null, "map", null, 1, 1, AbstractDataSetMapEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSetMapEntryEClass, DataSetMapEntry.class, "DataSetMapEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterizedDataSetMapEntryEClass, ParameterizedDataSetMapEntry.class, "ParameterizedDataSetMapEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterizedDataSetMapEntry_Parameter(), this.getSpecificationParameter(), null, "parameter", null, 1, 1, ParameterizedDataSetMapEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DataPackageImpl
