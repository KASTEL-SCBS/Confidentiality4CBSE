/**
 */
package edu.kit.kastel.scbs.confidentiality;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ConfidentialityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "confidentiality";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.kastel.scbs.confidentiality";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edu.kit.kastel.scbs.confidentiality";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfidentialityPackage eINSTANCE = edu.kit.kastel.scbs.confidentiality.impl.ConfidentialityPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.impl.IdentifiedElementImpl
	 * @see edu.kit.kastel.scbs.confidentiality.impl.ConfidentialityPackageImpl#getIdentifiedElement()
	 * @generated
	 */
	int IDENTIFIED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.impl.NamedElementImpl
	 * @see edu.kit.kastel.scbs.confidentiality.impl.ConfidentialityPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.impl.ConfidentialitySpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.impl.ConfidentialitySpecificationImpl
	 * @see edu.kit.kastel.scbs.confidentiality.impl.ConfidentialityPackageImpl#getConfidentialitySpecification()
	 * @generated
	 */
	int CONFIDENTIALITY_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_SPECIFICATION__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_SPECIFICATION__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Set Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_SPECIFICATION__DATA_SET_MAPS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters And Data Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_SPECIFICATION__PARAMETERS_AND_DATA_PAIRS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Added Service Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_SPECIFICATION__ADDED_SERVICE_PARAMETERS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Specification Parameter Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_ASSIGNMENTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Specification Parameter Equations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_EQUATIONS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_SPECIFICATION__LOCATIONS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tamper Protections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_SPECIFICATION__TAMPER_PROTECTIONS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Locations And Tamper Protections Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_SPECIFICATION__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_SPECIFICATION_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_SPECIFICATION_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Element</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.IdentifiedElement
	 * @generated
	 */
	EClass getIdentifiedElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.scbs.confidentiality.IdentifiedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.IdentifiedElement#getId()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Id();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.scbs.confidentiality.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification
	 * @generated
	 */
	EClass getConfidentialitySpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getDataIdentifier <em>Data Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Identifier</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getDataIdentifier()
	 * @see #getConfidentialitySpecification()
	 * @generated
	 */
	EReference getConfidentialitySpecification_DataIdentifier();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getDataSetMaps <em>Data Set Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Set Maps</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getDataSetMaps()
	 * @see #getConfidentialitySpecification()
	 * @generated
	 */
	EReference getConfidentialitySpecification_DataSetMaps();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getParametersAndDataPairs <em>Parameters And Data Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters And Data Pairs</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getParametersAndDataPairs()
	 * @see #getConfidentialitySpecification()
	 * @generated
	 */
	EReference getConfidentialitySpecification_ParametersAndDataPairs();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getAddedServiceParameters <em>Added Service Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Added Service Parameters</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getAddedServiceParameters()
	 * @see #getConfidentialitySpecification()
	 * @generated
	 */
	EReference getConfidentialitySpecification_AddedServiceParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getSpecificationParameterAssignments <em>Specification Parameter Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification Parameter Assignments</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getSpecificationParameterAssignments()
	 * @see #getConfidentialitySpecification()
	 * @generated
	 */
	EReference getConfidentialitySpecification_SpecificationParameterAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getSpecificationParameterEquations <em>Specification Parameter Equations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification Parameter Equations</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getSpecificationParameterEquations()
	 * @see #getConfidentialitySpecification()
	 * @generated
	 */
	EReference getConfidentialitySpecification_SpecificationParameterEquations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getLocations()
	 * @see #getConfidentialitySpecification()
	 * @generated
	 */
	EReference getConfidentialitySpecification_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getTamperProtections <em>Tamper Protections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tamper Protections</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getTamperProtections()
	 * @see #getConfidentialitySpecification()
	 * @generated
	 */
	EReference getConfidentialitySpecification_TamperProtections();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getLocationsAndTamperProtectionsPairs <em>Locations And Tamper Protections Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations And Tamper Protections Pairs</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getLocationsAndTamperProtectionsPairs()
	 * @see #getConfidentialitySpecification()
	 * @generated
	 */
	EReference getConfidentialitySpecification_LocationsAndTamperProtectionsPairs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfidentialityFactory getConfidentialityFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.impl.IdentifiedElementImpl
		 * @see edu.kit.kastel.scbs.confidentiality.impl.ConfidentialityPackageImpl#getIdentifiedElement()
		 * @generated
		 */
		EClass IDENTIFIED_ELEMENT = eINSTANCE.getIdentifiedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__ID = eINSTANCE.getIdentifiedElement_Id();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.impl.NamedElementImpl
		 * @see edu.kit.kastel.scbs.confidentiality.impl.ConfidentialityPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.impl.ConfidentialitySpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.impl.ConfidentialitySpecificationImpl
		 * @see edu.kit.kastel.scbs.confidentiality.impl.ConfidentialityPackageImpl#getConfidentialitySpecification()
		 * @generated
		 */
		EClass CONFIDENTIALITY_SPECIFICATION = eINSTANCE.getConfidentialitySpecification();

		/**
		 * The meta object literal for the '<em><b>Data Identifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER = eINSTANCE.getConfidentialitySpecification_DataIdentifier();

		/**
		 * The meta object literal for the '<em><b>Data Set Maps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIALITY_SPECIFICATION__DATA_SET_MAPS = eINSTANCE.getConfidentialitySpecification_DataSetMaps();

		/**
		 * The meta object literal for the '<em><b>Parameters And Data Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIALITY_SPECIFICATION__PARAMETERS_AND_DATA_PAIRS = eINSTANCE.getConfidentialitySpecification_ParametersAndDataPairs();

		/**
		 * The meta object literal for the '<em><b>Added Service Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIALITY_SPECIFICATION__ADDED_SERVICE_PARAMETERS = eINSTANCE.getConfidentialitySpecification_AddedServiceParameters();

		/**
		 * The meta object literal for the '<em><b>Specification Parameter Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_ASSIGNMENTS = eINSTANCE.getConfidentialitySpecification_SpecificationParameterAssignments();

		/**
		 * The meta object literal for the '<em><b>Specification Parameter Equations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_EQUATIONS = eINSTANCE.getConfidentialitySpecification_SpecificationParameterEquations();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIALITY_SPECIFICATION__LOCATIONS = eINSTANCE.getConfidentialitySpecification_Locations();

		/**
		 * The meta object literal for the '<em><b>Tamper Protections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIALITY_SPECIFICATION__TAMPER_PROTECTIONS = eINSTANCE.getConfidentialitySpecification_TamperProtections();

		/**
		 * The meta object literal for the '<em><b>Locations And Tamper Protections Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIALITY_SPECIFICATION__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS = eINSTANCE.getConfidentialitySpecification_LocationsAndTamperProtectionsPairs();

	}

} //ConfidentialityPackage
