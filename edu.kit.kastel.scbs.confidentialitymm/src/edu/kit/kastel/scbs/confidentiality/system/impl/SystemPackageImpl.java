/**
 */
package edu.kit.kastel.scbs.confidentiality.system.impl;

import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;

import edu.kit.kastel.scbs.confidentiality.adversary.AdversaryPackage;

import edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversaryPackageImpl;

import edu.kit.kastel.scbs.confidentiality.data.DataPackage;

import edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl;

import edu.kit.kastel.scbs.confidentiality.impl.ConfidentialityPackageImpl;

import edu.kit.kastel.scbs.confidentiality.repository.RepositoryPackage;

import edu.kit.kastel.scbs.confidentiality.repository.impl.RepositoryPackageImpl;

import edu.kit.kastel.scbs.confidentiality.resources.ResourcesPackage;

import edu.kit.kastel.scbs.confidentiality.resources.impl.ResourcesPackageImpl;

import edu.kit.kastel.scbs.confidentiality.system.AbstractDataParameterSubstitution;
import edu.kit.kastel.scbs.confidentiality.system.DataParameter2DataSetSubstitution;
import edu.kit.kastel.scbs.confidentiality.system.DataParameterUsage;
import edu.kit.kastel.scbs.confidentiality.system.DataSetMapParameter2KeySubstitution;
import edu.kit.kastel.scbs.confidentiality.system.SystemFactory;
import edu.kit.kastel.scbs.confidentiality.system.SystemPackage;

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
public class SystemPackageImpl extends EPackageImpl implements SystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDataParameterSubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataParameter2DataSetSubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetMapParameter2KeySubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataParameterUsageEClass = null;

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
	 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SystemPackageImpl() {
		super(eNS_URI, SystemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SystemPackage init() {
		if (isInited) return (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);

		// Obtain or create and register package
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SystemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SystemPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ConfidentialityPackageImpl theConfidentialityPackage = (ConfidentialityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfidentialityPackage.eNS_URI) instanceof ConfidentialityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfidentialityPackage.eNS_URI) : ConfidentialityPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) instanceof RepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) : RepositoryPackage.eINSTANCE);
		ResourcesPackageImpl theResourcesPackage = (ResourcesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) instanceof ResourcesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) : ResourcesPackage.eINSTANCE);
		AdversaryPackageImpl theAdversaryPackage = (AdversaryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdversaryPackage.eNS_URI) instanceof AdversaryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdversaryPackage.eNS_URI) : AdversaryPackage.eINSTANCE);

		// Create package meta-data objects
		theSystemPackage.createPackageContents();
		theConfidentialityPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theResourcesPackage.createPackageContents();
		theAdversaryPackage.createPackageContents();

		// Initialize created meta-data
		theSystemPackage.initializePackageContents();
		theConfidentialityPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theResourcesPackage.initializePackageContents();
		theAdversaryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSystemPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SystemPackage.eNS_URI, theSystemPackage);
		return theSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDataParameterSubstitution() {
		return abstractDataParameterSubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractDataParameterSubstitution_DataParametersToReplace() {
		return (EReference)abstractDataParameterSubstitutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataParameter2DataSetSubstitution() {
		return dataParameter2DataSetSubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataParameter2DataSetSubstitution_ReplacingDataSet() {
		return (EReference)dataParameter2DataSetSubstitutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSetMapParameter2KeySubstitution() {
		return dataSetMapParameter2KeySubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetMapParameter2KeySubstitution_ReplacingKey() {
		return (EAttribute)dataSetMapParameter2KeySubstitutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataParameterUsage() {
		return dataParameterUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataParameterUsage_RequiredDataParameter() {
		return (EReference)dataParameterUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataParameterUsage_ProvidedDataParameter() {
		return (EReference)dataParameterUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFactory getSystemFactory() {
		return (SystemFactory)getEFactoryInstance();
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
		abstractDataParameterSubstitutionEClass = createEClass(ABSTRACT_DATA_PARAMETER_SUBSTITUTION);
		createEReference(abstractDataParameterSubstitutionEClass, ABSTRACT_DATA_PARAMETER_SUBSTITUTION__DATA_PARAMETERS_TO_REPLACE);

		dataParameter2DataSetSubstitutionEClass = createEClass(DATA_PARAMETER2_DATA_SET_SUBSTITUTION);
		createEReference(dataParameter2DataSetSubstitutionEClass, DATA_PARAMETER2_DATA_SET_SUBSTITUTION__REPLACING_DATA_SET);

		dataSetMapParameter2KeySubstitutionEClass = createEClass(DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION);
		createEAttribute(dataSetMapParameter2KeySubstitutionEClass, DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION__REPLACING_KEY);

		dataParameterUsageEClass = createEClass(DATA_PARAMETER_USAGE);
		createEReference(dataParameterUsageEClass, DATA_PARAMETER_USAGE__REQUIRED_DATA_PARAMETER);
		createEReference(dataParameterUsageEClass, DATA_PARAMETER_USAGE__PROVIDED_DATA_PARAMETER);
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
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractDataParameterSubstitutionEClass.getESuperTypes().add(theConfidentialityPackage.getIdentifiedElement());
		dataParameter2DataSetSubstitutionEClass.getESuperTypes().add(this.getAbstractDataParameterSubstitution());
		dataSetMapParameter2KeySubstitutionEClass.getESuperTypes().add(this.getAbstractDataParameterSubstitution());
		dataParameterUsageEClass.getESuperTypes().add(theConfidentialityPackage.getIdentifiedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractDataParameterSubstitutionEClass, AbstractDataParameterSubstitution.class, "AbstractDataParameterSubstitution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractDataParameterSubstitution_DataParametersToReplace(), theDataPackage.getDataParameter(), null, "dataParametersToReplace", null, 1, -1, AbstractDataParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataParameter2DataSetSubstitutionEClass, DataParameter2DataSetSubstitution.class, "DataParameter2DataSetSubstitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataParameter2DataSetSubstitution_ReplacingDataSet(), theDataPackage.getDataSet(), null, "replacingDataSet", null, 1, 1, DataParameter2DataSetSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSetMapParameter2KeySubstitutionEClass, DataSetMapParameter2KeySubstitution.class, "DataSetMapParameter2KeySubstitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSetMapParameter2KeySubstitution_ReplacingKey(), ecorePackage.getEString(), "replacingKey", null, 1, 1, DataSetMapParameter2KeySubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataParameterUsageEClass, DataParameterUsage.class, "DataParameterUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataParameterUsage_RequiredDataParameter(), theDataPackage.getDataParameter(), null, "requiredDataParameter", null, 1, 1, DataParameterUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataParameterUsage_ProvidedDataParameter(), theDataPackage.getDataParameter(), null, "providedDataParameter", null, 1, 1, DataParameterUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SystemPackageImpl
