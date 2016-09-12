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
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.system.impl.AbstractDataParameterSubstitutionImpl <em>Abstract Data Parameter Substitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.system.impl.AbstractDataParameterSubstitutionImpl
	 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl#getAbstractDataParameterSubstitution()
	 * @generated
	 */
	int ABSTRACT_DATA_PARAMETER_SUBSTITUTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_PARAMETER_SUBSTITUTION__ID = ConfidentialityPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Data Parameters To Replace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_PARAMETER_SUBSTITUTION__DATA_PARAMETERS_TO_REPLACE = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Data Parameter Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_PARAMETER_SUBSTITUTION_FEATURE_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Data Parameter Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_PARAMETER_SUBSTITUTION_OPERATION_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.system.impl.DataParameter2DataSetSubstitutionImpl <em>Data Parameter2 Data Set Substitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.system.impl.DataParameter2DataSetSubstitutionImpl
	 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl#getDataParameter2DataSetSubstitution()
	 * @generated
	 */
	int DATA_PARAMETER2_DATA_SET_SUBSTITUTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER2_DATA_SET_SUBSTITUTION__ID = ABSTRACT_DATA_PARAMETER_SUBSTITUTION__ID;

	/**
	 * The feature id for the '<em><b>Data Parameters To Replace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER2_DATA_SET_SUBSTITUTION__DATA_PARAMETERS_TO_REPLACE = ABSTRACT_DATA_PARAMETER_SUBSTITUTION__DATA_PARAMETERS_TO_REPLACE;

	/**
	 * The feature id for the '<em><b>Replacing Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER2_DATA_SET_SUBSTITUTION__REPLACING_DATA_SET = ABSTRACT_DATA_PARAMETER_SUBSTITUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Parameter2 Data Set Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER2_DATA_SET_SUBSTITUTION_FEATURE_COUNT = ABSTRACT_DATA_PARAMETER_SUBSTITUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Parameter2 Data Set Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER2_DATA_SET_SUBSTITUTION_OPERATION_COUNT = ABSTRACT_DATA_PARAMETER_SUBSTITUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.system.impl.DataSetMapParameter2KeySubstitutionImpl <em>Data Set Map Parameter2 Key Substitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.system.impl.DataSetMapParameter2KeySubstitutionImpl
	 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl#getDataSetMapParameter2KeySubstitution()
	 * @generated
	 */
	int DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION__ID = ABSTRACT_DATA_PARAMETER_SUBSTITUTION__ID;

	/**
	 * The feature id for the '<em><b>Data Parameters To Replace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION__DATA_PARAMETERS_TO_REPLACE = ABSTRACT_DATA_PARAMETER_SUBSTITUTION__DATA_PARAMETERS_TO_REPLACE;

	/**
	 * The feature id for the '<em><b>Replacing Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION__REPLACING_KEY = ABSTRACT_DATA_PARAMETER_SUBSTITUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Set Map Parameter2 Key Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION_FEATURE_COUNT = ABSTRACT_DATA_PARAMETER_SUBSTITUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Set Map Parameter2 Key Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION_OPERATION_COUNT = ABSTRACT_DATA_PARAMETER_SUBSTITUTION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.system.impl.DataParameterUsageImpl <em>Data Parameter Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.system.impl.DataParameterUsageImpl
	 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl#getDataParameterUsage()
	 * @generated
	 */
	int DATA_PARAMETER_USAGE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER_USAGE__ID = ConfidentialityPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Required Data Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER_USAGE__REQUIRED_DATA_PARAMETER = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Data Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER_USAGE__PROVIDED_DATA_PARAMETER = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Parameter Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER_USAGE_FEATURE_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Parameter Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER_USAGE_OPERATION_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.system.AbstractDataParameterSubstitution <em>Abstract Data Parameter Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Data Parameter Substitution</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.AbstractDataParameterSubstitution
	 * @generated
	 */
	EClass getAbstractDataParameterSubstitution();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.scbs.confidentiality.system.AbstractDataParameterSubstitution#getDataParametersToReplace <em>Data Parameters To Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Parameters To Replace</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.AbstractDataParameterSubstitution#getDataParametersToReplace()
	 * @see #getAbstractDataParameterSubstitution()
	 * @generated
	 */
	EReference getAbstractDataParameterSubstitution_DataParametersToReplace();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.system.DataParameter2DataSetSubstitution <em>Data Parameter2 Data Set Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Parameter2 Data Set Substitution</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.DataParameter2DataSetSubstitution
	 * @generated
	 */
	EClass getDataParameter2DataSetSubstitution();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.confidentiality.system.DataParameter2DataSetSubstitution#getReplacingDataSet <em>Replacing Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Replacing Data Set</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.DataParameter2DataSetSubstitution#getReplacingDataSet()
	 * @see #getDataParameter2DataSetSubstitution()
	 * @generated
	 */
	EReference getDataParameter2DataSetSubstitution_ReplacingDataSet();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.system.DataSetMapParameter2KeySubstitution <em>Data Set Map Parameter2 Key Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set Map Parameter2 Key Substitution</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.DataSetMapParameter2KeySubstitution
	 * @generated
	 */
	EClass getDataSetMapParameter2KeySubstitution();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.scbs.confidentiality.system.DataSetMapParameter2KeySubstitution#getReplacingKey <em>Replacing Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replacing Key</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.DataSetMapParameter2KeySubstitution#getReplacingKey()
	 * @see #getDataSetMapParameter2KeySubstitution()
	 * @generated
	 */
	EAttribute getDataSetMapParameter2KeySubstitution_ReplacingKey();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.system.DataParameterUsage <em>Data Parameter Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Parameter Usage</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.DataParameterUsage
	 * @generated
	 */
	EClass getDataParameterUsage();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.confidentiality.system.DataParameterUsage#getRequiredDataParameter <em>Required Data Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Data Parameter</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.DataParameterUsage#getRequiredDataParameter()
	 * @see #getDataParameterUsage()
	 * @generated
	 */
	EReference getDataParameterUsage_RequiredDataParameter();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.confidentiality.system.DataParameterUsage#getProvidedDataParameter <em>Provided Data Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Data Parameter</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.system.DataParameterUsage#getProvidedDataParameter()
	 * @see #getDataParameterUsage()
	 * @generated
	 */
	EReference getDataParameterUsage_ProvidedDataParameter();

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
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.system.impl.AbstractDataParameterSubstitutionImpl <em>Abstract Data Parameter Substitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.system.impl.AbstractDataParameterSubstitutionImpl
		 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl#getAbstractDataParameterSubstitution()
		 * @generated
		 */
		EClass ABSTRACT_DATA_PARAMETER_SUBSTITUTION = eINSTANCE.getAbstractDataParameterSubstitution();

		/**
		 * The meta object literal for the '<em><b>Data Parameters To Replace</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_DATA_PARAMETER_SUBSTITUTION__DATA_PARAMETERS_TO_REPLACE = eINSTANCE.getAbstractDataParameterSubstitution_DataParametersToReplace();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.system.impl.DataParameter2DataSetSubstitutionImpl <em>Data Parameter2 Data Set Substitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.system.impl.DataParameter2DataSetSubstitutionImpl
		 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl#getDataParameter2DataSetSubstitution()
		 * @generated
		 */
		EClass DATA_PARAMETER2_DATA_SET_SUBSTITUTION = eINSTANCE.getDataParameter2DataSetSubstitution();

		/**
		 * The meta object literal for the '<em><b>Replacing Data Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PARAMETER2_DATA_SET_SUBSTITUTION__REPLACING_DATA_SET = eINSTANCE.getDataParameter2DataSetSubstitution_ReplacingDataSet();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.system.impl.DataSetMapParameter2KeySubstitutionImpl <em>Data Set Map Parameter2 Key Substitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.system.impl.DataSetMapParameter2KeySubstitutionImpl
		 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl#getDataSetMapParameter2KeySubstitution()
		 * @generated
		 */
		EClass DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION = eINSTANCE.getDataSetMapParameter2KeySubstitution();

		/**
		 * The meta object literal for the '<em><b>Replacing Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION__REPLACING_KEY = eINSTANCE.getDataSetMapParameter2KeySubstitution_ReplacingKey();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.system.impl.DataParameterUsageImpl <em>Data Parameter Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.system.impl.DataParameterUsageImpl
		 * @see edu.kit.kastel.scbs.confidentiality.system.impl.SystemPackageImpl#getDataParameterUsage()
		 * @generated
		 */
		EClass DATA_PARAMETER_USAGE = eINSTANCE.getDataParameterUsage();

		/**
		 * The meta object literal for the '<em><b>Required Data Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PARAMETER_USAGE__REQUIRED_DATA_PARAMETER = eINSTANCE.getDataParameterUsage_RequiredDataParameter();

		/**
		 * The meta object literal for the '<em><b>Provided Data Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PARAMETER_USAGE__PROVIDED_DATA_PARAMETER = eINSTANCE.getDataParameterUsage_ProvidedDataParameter();

	}

} //SystemPackage
