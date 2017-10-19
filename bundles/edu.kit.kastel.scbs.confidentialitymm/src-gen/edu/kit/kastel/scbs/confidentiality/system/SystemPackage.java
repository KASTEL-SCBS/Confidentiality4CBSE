/**
 */
package edu.kit.kastel.scbs.confidentiality.system;

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
 * @see edu.kit.kastel.scbs.confidentiality.system.SystemFactory
 * @model kind="package"
 * @generated
 */
public interface SystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "system";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.kastel.scbs.confidentiality.system";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edu.kit.kastel.scbs.confidentiality.system";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemPackage eINSTANCE = edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.system.impl.AbstractSpecificationParameterAssignmentImpl <em>Abstract Specification Parameter Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.system.impl.AbstractSpecificationParameterAssignmentImpl
	 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl#getAbstractSpecificationParameterAssignment()
	 * @generated
	 */
	int ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT__ID = ConfidentialityPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Specification Parameters To Replace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT__SPECIFICATION_PARAMETERS_TO_REPLACE = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Specification Parameter Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT_FEATURE_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Specification Parameter Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT_OPERATION_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.system.impl.SpecificationParameter2DataSetAssignmentImpl <em>Specification Parameter2 Data Set Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SpecificationParameter2DataSetAssignmentImpl
	 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl#getSpecificationParameter2DataSetAssignment()
	 * @generated
	 */
	int SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT__ID = ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT__ID;

	/**
	 * The feature id for the '<em><b>Specification Parameters To Replace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT__SPECIFICATION_PARAMETERS_TO_REPLACE = ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT__SPECIFICATION_PARAMETERS_TO_REPLACE;

	/**
	 * The feature id for the '<em><b>Assigned Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT__ASSIGNED_DATA_SET = ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specification Parameter2 Data Set Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT_FEATURE_COUNT = ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Specification Parameter2 Data Set Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT_OPERATION_COUNT = ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.system.impl.DataSetMapParameter2KeyAssignmentImpl <em>Data Set Map Parameter2 Key Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.system.impl.DataSetMapParameter2KeyAssignmentImpl
	 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl#getDataSetMapParameter2KeyAssignment()
	 * @generated
	 */
	int DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT__ID = ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT__ID;

	/**
	 * The feature id for the '<em><b>Specification Parameters To Replace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT__SPECIFICATION_PARAMETERS_TO_REPLACE = ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT__SPECIFICATION_PARAMETERS_TO_REPLACE;

	/**
	 * The feature id for the '<em><b>Assigned Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT__ASSIGNED_KEY = ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Set Map Parameter2 Key Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT_FEATURE_COUNT = ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Set Map Parameter2 Key Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT_OPERATION_COUNT = ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.system.impl.SpecificationParameterEquationImpl <em>Specification Parameter Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SpecificationParameterEquationImpl
	 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl#getSpecificationParameterEquation()
	 * @generated
	 */
	int SPECIFICATION_PARAMETER_EQUATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PARAMETER_EQUATION__ID = ConfidentialityPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Left Specification Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PARAMETER_EQUATION__LEFT_SPECIFICATION_PARAMETER = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Specification Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PARAMETER_EQUATION__RIGHT_SPECIFICATION_PARAMETER = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PARAMETER_EQUATION__LEFT_INTERFACES = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Right Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PARAMETER_EQUATION__RIGHT_INTERFACES = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Specification Parameter Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PARAMETER_EQUATION_FEATURE_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Specification Parameter Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PARAMETER_EQUATION_OPERATION_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.system.AbstractSpecificationParameterAssignment <em>Abstract Specification Parameter Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Specification Parameter Assignment</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.AbstractSpecificationParameterAssignment
	 * @generated
	 */
	EClass getAbstractSpecificationParameterAssignment();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.scbs.confidentiality.system.AbstractSpecificationParameterAssignment#getSpecificationParametersToReplace <em>Specification Parameters To Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specification Parameters To Replace</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.AbstractSpecificationParameterAssignment#getSpecificationParametersToReplace()
	 * @see #getAbstractSpecificationParameterAssignment()
	 * @generated
	 */
	EReference getAbstractSpecificationParameterAssignment_SpecificationParametersToReplace();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameter2DataSetAssignment <em>Specification Parameter2 Data Set Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification Parameter2 Data Set Assignment</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.SpecificationParameter2DataSetAssignment
	 * @generated
	 */
	EClass getSpecificationParameter2DataSetAssignment();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameter2DataSetAssignment#getAssignedDataSet <em>Assigned Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned Data Set</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.SpecificationParameter2DataSetAssignment#getAssignedDataSet()
	 * @see #getSpecificationParameter2DataSetAssignment()
	 * @generated
	 */
	EReference getSpecificationParameter2DataSetAssignment_AssignedDataSet();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.system.DataSetMapParameter2KeyAssignment <em>Data Set Map Parameter2 Key Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set Map Parameter2 Key Assignment</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.DataSetMapParameter2KeyAssignment
	 * @generated
	 */
	EClass getDataSetMapParameter2KeyAssignment();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.scbs.confidentiality.system.DataSetMapParameter2KeyAssignment#getAssignedKey <em>Assigned Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigned Key</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.DataSetMapParameter2KeyAssignment#getAssignedKey()
	 * @see #getDataSetMapParameter2KeyAssignment()
	 * @generated
	 */
	EAttribute getDataSetMapParameter2KeyAssignment_AssignedKey();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation <em>Specification Parameter Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification Parameter Equation</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation
	 * @generated
	 */
	EClass getSpecificationParameterEquation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getLeftSpecificationParameter <em>Left Specification Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Specification Parameter</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getLeftSpecificationParameter()
	 * @see #getSpecificationParameterEquation()
	 * @generated
	 */
	EReference getSpecificationParameterEquation_LeftSpecificationParameter();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getRightSpecificationParameter <em>Right Specification Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Specification Parameter</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getRightSpecificationParameter()
	 * @see #getSpecificationParameterEquation()
	 * @generated
	 */
	EReference getSpecificationParameterEquation_RightSpecificationParameter();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getLeftInterfaces <em>Left Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Left Interfaces</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getLeftInterfaces()
	 * @see #getSpecificationParameterEquation()
	 * @generated
	 */
	EReference getSpecificationParameterEquation_LeftInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getRightInterfaces <em>Right Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Right Interfaces</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getRightInterfaces()
	 * @see #getSpecificationParameterEquation()
	 * @generated
	 */
	EReference getSpecificationParameterEquation_RightInterfaces();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemFactory getSystemFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.system.impl.AbstractSpecificationParameterAssignmentImpl <em>Abstract Specification Parameter Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.system.impl.AbstractSpecificationParameterAssignmentImpl
		 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl#getAbstractSpecificationParameterAssignment()
		 * @generated
		 */
		EClass ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT = eINSTANCE.getAbstractSpecificationParameterAssignment();

		/**
		 * The meta object literal for the '<em><b>Specification Parameters To Replace</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT__SPECIFICATION_PARAMETERS_TO_REPLACE = eINSTANCE.getAbstractSpecificationParameterAssignment_SpecificationParametersToReplace();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.system.impl.SpecificationParameter2DataSetAssignmentImpl <em>Specification Parameter2 Data Set Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SpecificationParameter2DataSetAssignmentImpl
		 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl#getSpecificationParameter2DataSetAssignment()
		 * @generated
		 */
		EClass SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT = eINSTANCE.getSpecificationParameter2DataSetAssignment();

		/**
		 * The meta object literal for the '<em><b>Assigned Data Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT__ASSIGNED_DATA_SET = eINSTANCE.getSpecificationParameter2DataSetAssignment_AssignedDataSet();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.system.impl.DataSetMapParameter2KeyAssignmentImpl <em>Data Set Map Parameter2 Key Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.system.impl.DataSetMapParameter2KeyAssignmentImpl
		 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl#getDataSetMapParameter2KeyAssignment()
		 * @generated
		 */
		EClass DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT = eINSTANCE.getDataSetMapParameter2KeyAssignment();

		/**
		 * The meta object literal for the '<em><b>Assigned Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT__ASSIGNED_KEY = eINSTANCE.getDataSetMapParameter2KeyAssignment_AssignedKey();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.system.impl.SpecificationParameterEquationImpl <em>Specification Parameter Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SpecificationParameterEquationImpl
		 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl#getSpecificationParameterEquation()
		 * @generated
		 */
		EClass SPECIFICATION_PARAMETER_EQUATION = eINSTANCE.getSpecificationParameterEquation();

		/**
		 * The meta object literal for the '<em><b>Left Specification Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_PARAMETER_EQUATION__LEFT_SPECIFICATION_PARAMETER = eINSTANCE.getSpecificationParameterEquation_LeftSpecificationParameter();

		/**
		 * The meta object literal for the '<em><b>Right Specification Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_PARAMETER_EQUATION__RIGHT_SPECIFICATION_PARAMETER = eINSTANCE.getSpecificationParameterEquation_RightSpecificationParameter();

		/**
		 * The meta object literal for the '<em><b>Left Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_PARAMETER_EQUATION__LEFT_INTERFACES = eINSTANCE.getSpecificationParameterEquation_LeftInterfaces();

		/**
		 * The meta object literal for the '<em><b>Right Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_PARAMETER_EQUATION__RIGHT_INTERFACES = eINSTANCE.getSpecificationParameterEquation_RightInterfaces();

	}

} //SystemPackage
