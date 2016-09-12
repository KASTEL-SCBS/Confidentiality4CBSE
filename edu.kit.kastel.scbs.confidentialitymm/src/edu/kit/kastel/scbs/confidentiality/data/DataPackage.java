/**
 */
package edu.kit.kastel.scbs.confidentiality.data;

import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;

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
 * @see edu.kit.kastel.scbs.confidentiality.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.kastel.scbs.confidentiality/data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edu.kit.kastel.scbs.confidentiality.data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.data.impl.DataIdentifyingImpl <em>Identifying</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataIdentifyingImpl
	 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl#getDataIdentifying()
	 * @generated
	 */
	int DATA_IDENTIFYING = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IDENTIFYING__ID = ConfidentialityPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IDENTIFYING_FEATURE_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IDENTIFYING_OPERATION_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.data.impl.UnparameterizedDataIdentifyingImpl <em>Unparameterized Data Identifying</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.data.impl.UnparameterizedDataIdentifyingImpl
	 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl#getUnparameterizedDataIdentifying()
	 * @generated
	 */
	int UNPARAMETERIZED_DATA_IDENTIFYING = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARAMETERIZED_DATA_IDENTIFYING__ID = DATA_IDENTIFYING__ID;

	/**
	 * The number of structural features of the '<em>Unparameterized Data Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARAMETERIZED_DATA_IDENTIFYING_FEATURE_COUNT = DATA_IDENTIFYING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unparameterized Data Identifying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARAMETERIZED_DATA_IDENTIFYING_OPERATION_COUNT = DATA_IDENTIFYING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.data.impl.DataSetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataSetImpl
	 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl#getDataSet()
	 * @generated
	 */
	int DATA_SET = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__ID = UNPARAMETERIZED_DATA_IDENTIFYING__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__NAME = UNPARAMETERIZED_DATA_IDENTIFYING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_FEATURE_COUNT = UNPARAMETERIZED_DATA_IDENTIFYING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_OPERATION_COUNT = UNPARAMETERIZED_DATA_IDENTIFYING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.data.impl.DataSetMapImpl <em>Set Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataSetMapImpl
	 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl#getDataSetMap()
	 * @generated
	 */
	int DATA_SET_MAP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP__ID = ConfidentialityPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP__NAME = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP__SPECIFICATION_CONTAINER = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP_FEATURE_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP_OPERATION_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.data.impl.DataParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataParameterImpl
	 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl#getDataParameter()
	 * @generated
	 */
	int DATA_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER__ID = DATA_IDENTIFYING__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER__NAME = DATA_IDENTIFYING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Defining Functional Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER__DEFINING_FUNCTIONAL_PARAMETER = DATA_IDENTIFYING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER_FEATURE_COUNT = DATA_IDENTIFYING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER_OPERATION_COUNT = DATA_IDENTIFYING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.data.impl.AbstractDataSetMapEntryImpl <em>Abstract Data Set Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.data.impl.AbstractDataSetMapEntryImpl
	 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl#getAbstractDataSetMapEntry()
	 * @generated
	 */
	int ABSTRACT_DATA_SET_MAP_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_SET_MAP_ENTRY__ID = DATA_IDENTIFYING__ID;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_SET_MAP_ENTRY__MAP = DATA_IDENTIFYING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Data Set Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_SET_MAP_ENTRY_FEATURE_COUNT = DATA_IDENTIFYING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Data Set Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_SET_MAP_ENTRY_OPERATION_COUNT = DATA_IDENTIFYING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.data.impl.DataSetMapEntryImpl <em>Set Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataSetMapEntryImpl
	 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl#getDataSetMapEntry()
	 * @generated
	 */
	int DATA_SET_MAP_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP_ENTRY__ID = ABSTRACT_DATA_SET_MAP_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP_ENTRY__MAP = ABSTRACT_DATA_SET_MAP_ENTRY__MAP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP_ENTRY__NAME = ABSTRACT_DATA_SET_MAP_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP_ENTRY_FEATURE_COUNT = ABSTRACT_DATA_SET_MAP_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Set Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP_ENTRY_OPERATION_COUNT = ABSTRACT_DATA_SET_MAP_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.data.impl.ParameterizedDataSetMapEntryImpl <em>Parameterized Data Set Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.data.impl.ParameterizedDataSetMapEntryImpl
	 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl#getParameterizedDataSetMapEntry()
	 * @generated
	 */
	int PARAMETERIZED_DATA_SET_MAP_ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_DATA_SET_MAP_ENTRY__ID = ABSTRACT_DATA_SET_MAP_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_DATA_SET_MAP_ENTRY__MAP = ABSTRACT_DATA_SET_MAP_ENTRY__MAP;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_DATA_SET_MAP_ENTRY__PARAMETER = ABSTRACT_DATA_SET_MAP_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameterized Data Set Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_DATA_SET_MAP_ENTRY_FEATURE_COUNT = ABSTRACT_DATA_SET_MAP_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameterized Data Set Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_DATA_SET_MAP_ENTRY_OPERATION_COUNT = ABSTRACT_DATA_SET_MAP_ENTRY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.data.DataIdentifying <em>Identifying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifying</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.data.DataIdentifying
	 * @generated
	 */
	EClass getDataIdentifying();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.data.UnparameterizedDataIdentifying <em>Unparameterized Data Identifying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unparameterized Data Identifying</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.data.UnparameterizedDataIdentifying
	 * @generated
	 */
	EClass getUnparameterizedDataIdentifying();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.data.DataSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.data.DataSet
	 * @generated
	 */
	EClass getDataSet();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.data.DataSetMap <em>Set Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Map</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.data.DataSetMap
	 * @generated
	 */
	EClass getDataSetMap();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.kastel.scbs.confidentiality.data.DataSetMap#getSpecificationContainer <em>Specification Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specification Container</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.data.DataSetMap#getSpecificationContainer()
	 * @see #getDataSetMap()
	 * @generated
	 */
	EReference getDataSetMap_SpecificationContainer();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.data.DataParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.data.DataParameter
	 * @generated
	 */
	EClass getDataParameter();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.scbs.confidentiality.data.DataParameter#getDefiningFunctionalParameter <em>Defining Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defining Functional Parameter</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.data.DataParameter#getDefiningFunctionalParameter()
	 * @see #getDataParameter()
	 * @generated
	 */
	EAttribute getDataParameter_DefiningFunctionalParameter();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.data.AbstractDataSetMapEntry <em>Abstract Data Set Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Data Set Map Entry</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.data.AbstractDataSetMapEntry
	 * @generated
	 */
	EClass getAbstractDataSetMapEntry();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.confidentiality.data.AbstractDataSetMapEntry#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.data.AbstractDataSetMapEntry#getMap()
	 * @see #getAbstractDataSetMapEntry()
	 * @generated
	 */
	EReference getAbstractDataSetMapEntry_Map();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.data.DataSetMapEntry <em>Set Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Map Entry</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.data.DataSetMapEntry
	 * @generated
	 */
	EClass getDataSetMapEntry();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.data.ParameterizedDataSetMapEntry <em>Parameterized Data Set Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterized Data Set Map Entry</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.data.ParameterizedDataSetMapEntry
	 * @generated
	 */
	EClass getParameterizedDataSetMapEntry();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.confidentiality.data.ParameterizedDataSetMapEntry#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.data.ParameterizedDataSetMapEntry#getParameter()
	 * @see #getParameterizedDataSetMapEntry()
	 * @generated
	 */
	EReference getParameterizedDataSetMapEntry_Parameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.data.impl.DataIdentifyingImpl <em>Identifying</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataIdentifyingImpl
		 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl#getDataIdentifying()
		 * @generated
		 */
		EClass DATA_IDENTIFYING = eINSTANCE.getDataIdentifying();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.data.impl.UnparameterizedDataIdentifyingImpl <em>Unparameterized Data Identifying</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.data.impl.UnparameterizedDataIdentifyingImpl
		 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl#getUnparameterizedDataIdentifying()
		 * @generated
		 */
		EClass UNPARAMETERIZED_DATA_IDENTIFYING = eINSTANCE.getUnparameterizedDataIdentifying();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.data.impl.DataSetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataSetImpl
		 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl#getDataSet()
		 * @generated
		 */
		EClass DATA_SET = eINSTANCE.getDataSet();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.data.impl.DataSetMapImpl <em>Set Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataSetMapImpl
		 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl#getDataSetMap()
		 * @generated
		 */
		EClass DATA_SET_MAP = eINSTANCE.getDataSetMap();

		/**
		 * The meta object literal for the '<em><b>Specification Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET_MAP__SPECIFICATION_CONTAINER = eINSTANCE.getDataSetMap_SpecificationContainer();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.data.impl.DataParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataParameterImpl
		 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl#getDataParameter()
		 * @generated
		 */
		EClass DATA_PARAMETER = eINSTANCE.getDataParameter();

		/**
		 * The meta object literal for the '<em><b>Defining Functional Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PARAMETER__DEFINING_FUNCTIONAL_PARAMETER = eINSTANCE.getDataParameter_DefiningFunctionalParameter();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.data.impl.AbstractDataSetMapEntryImpl <em>Abstract Data Set Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.data.impl.AbstractDataSetMapEntryImpl
		 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl#getAbstractDataSetMapEntry()
		 * @generated
		 */
		EClass ABSTRACT_DATA_SET_MAP_ENTRY = eINSTANCE.getAbstractDataSetMapEntry();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_DATA_SET_MAP_ENTRY__MAP = eINSTANCE.getAbstractDataSetMapEntry_Map();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.data.impl.DataSetMapEntryImpl <em>Set Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataSetMapEntryImpl
		 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl#getDataSetMapEntry()
		 * @generated
		 */
		EClass DATA_SET_MAP_ENTRY = eINSTANCE.getDataSetMapEntry();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.data.impl.ParameterizedDataSetMapEntryImpl <em>Parameterized Data Set Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.data.impl.ParameterizedDataSetMapEntryImpl
		 * @see edu.kit.kastel.scbs.confidentiality.data.impl.DataPackageImpl#getParameterizedDataSetMapEntry()
		 * @generated
		 */
		EClass PARAMETERIZED_DATA_SET_MAP_ENTRY = eINSTANCE.getParameterizedDataSetMapEntry();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_DATA_SET_MAP_ENTRY__PARAMETER = eINSTANCE.getParameterizedDataSetMapEntry_Parameter();

	}

} //DataPackage
