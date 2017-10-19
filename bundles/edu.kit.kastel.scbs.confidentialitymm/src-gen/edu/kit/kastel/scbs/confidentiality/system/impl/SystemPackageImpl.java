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

import edu.kit.kastel.scbs.confidentiality.system.AbstractSpecificationParameterAssignment;
import edu.kit.kastel.scbs.confidentiality.system.DataSetMapParameter2KeyAssignment;
import edu.kit.kastel.scbs.confidentiality.system.SpecificationParameter2DataSetAssignment;
import edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation;
import edu.kit.kastel.scbs.confidentiality.system.SystemFactory;
import edu.kit.kastel.scbs.confidentiality.system.SystemPackage;

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
public class SystemPackageImpl extends EPackageImpl implements SystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSpecificationParameterAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationParameter2DataSetAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetMapParameter2KeyAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationParameterEquationEClass = null;

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

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

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
	public EClass getAbstractSpecificationParameterAssignment() {
		return abstractSpecificationParameterAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSpecificationParameterAssignment_SpecificationParametersToReplace() {
		return (EReference)abstractSpecificationParameterAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificationParameter2DataSetAssignment() {
		return specificationParameter2DataSetAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationParameter2DataSetAssignment_AssignedDataSet() {
		return (EReference)specificationParameter2DataSetAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSetMapParameter2KeyAssignment() {
		return dataSetMapParameter2KeyAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetMapParameter2KeyAssignment_AssignedKey() {
		return (EAttribute)dataSetMapParameter2KeyAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificationParameterEquation() {
		return specificationParameterEquationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationParameterEquation_LeftSpecificationParameter() {
		return (EReference)specificationParameterEquationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationParameterEquation_RightSpecificationParameter() {
		return (EReference)specificationParameterEquationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationParameterEquation_LeftInterfaces() {
		return (EReference)specificationParameterEquationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationParameterEquation_RightInterfaces() {
		return (EReference)specificationParameterEquationEClass.getEStructuralFeatures().get(3);
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
		abstractSpecificationParameterAssignmentEClass = createEClass(ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT);
		createEReference(abstractSpecificationParameterAssignmentEClass, ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT__SPECIFICATION_PARAMETERS_TO_REPLACE);

		specificationParameter2DataSetAssignmentEClass = createEClass(SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT);
		createEReference(specificationParameter2DataSetAssignmentEClass, SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT__ASSIGNED_DATA_SET);

		dataSetMapParameter2KeyAssignmentEClass = createEClass(DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT);
		createEAttribute(dataSetMapParameter2KeyAssignmentEClass, DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT__ASSIGNED_KEY);

		specificationParameterEquationEClass = createEClass(SPECIFICATION_PARAMETER_EQUATION);
		createEReference(specificationParameterEquationEClass, SPECIFICATION_PARAMETER_EQUATION__LEFT_SPECIFICATION_PARAMETER);
		createEReference(specificationParameterEquationEClass, SPECIFICATION_PARAMETER_EQUATION__RIGHT_SPECIFICATION_PARAMETER);
		createEReference(specificationParameterEquationEClass, SPECIFICATION_PARAMETER_EQUATION__LEFT_INTERFACES);
		createEReference(specificationParameterEquationEClass, SPECIFICATION_PARAMETER_EQUATION__RIGHT_INTERFACES);
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
		org.palladiosimulator.pcm.repository.RepositoryPackage theRepositoryPackage_1 = (org.palladiosimulator.pcm.repository.RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(org.palladiosimulator.pcm.repository.RepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractSpecificationParameterAssignmentEClass.getESuperTypes().add(theConfidentialityPackage.getIdentifiedElement());
		specificationParameter2DataSetAssignmentEClass.getESuperTypes().add(this.getAbstractSpecificationParameterAssignment());
		dataSetMapParameter2KeyAssignmentEClass.getESuperTypes().add(this.getAbstractSpecificationParameterAssignment());
		specificationParameterEquationEClass.getESuperTypes().add(theConfidentialityPackage.getIdentifiedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractSpecificationParameterAssignmentEClass, AbstractSpecificationParameterAssignment.class, "AbstractSpecificationParameterAssignment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractSpecificationParameterAssignment_SpecificationParametersToReplace(), theDataPackage.getSpecificationParameter(), null, "specificationParametersToReplace", null, 1, -1, AbstractSpecificationParameterAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationParameter2DataSetAssignmentEClass, SpecificationParameter2DataSetAssignment.class, "SpecificationParameter2DataSetAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificationParameter2DataSetAssignment_AssignedDataSet(), theDataPackage.getDataSet(), null, "assignedDataSet", null, 1, 1, SpecificationParameter2DataSetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSetMapParameter2KeyAssignmentEClass, DataSetMapParameter2KeyAssignment.class, "DataSetMapParameter2KeyAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSetMapParameter2KeyAssignment_AssignedKey(), ecorePackage.getEString(), "assignedKey", null, 1, 1, DataSetMapParameter2KeyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationParameterEquationEClass, SpecificationParameterEquation.class, "SpecificationParameterEquation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificationParameterEquation_LeftSpecificationParameter(), theDataPackage.getSpecificationParameter(), null, "leftSpecificationParameter", null, 1, 1, SpecificationParameterEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationParameterEquation_RightSpecificationParameter(), theDataPackage.getSpecificationParameter(), null, "rightSpecificationParameter", null, 1, 1, SpecificationParameterEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationParameterEquation_LeftInterfaces(), theRepositoryPackage_1.getInterface(), null, "leftInterfaces", null, 1, -1, SpecificationParameterEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationParameterEquation_RightInterfaces(), theRepositoryPackage_1.getInterface(), null, "rightInterfaces", null, 1, -1, SpecificationParameterEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SystemPackageImpl
