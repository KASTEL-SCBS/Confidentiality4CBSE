/**
 */
package edu.kit.kastel.scbs.confidentiality.repository;

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
 * @see edu.kit.kastel.scbs.confidentiality.repository.RepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface RepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "repository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.kastel.scbs.confidentiality.repository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edu.kit.kastel.scbs.confidentiality.repository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepositoryPackage eINSTANCE = edu.kit.kastel.scbs.confidentiality.repository.impl.RepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.repository.impl.ParametersAndDataPairImpl <em>Parameters And Data Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.repository.impl.ParametersAndDataPairImpl
	 * @see edu.kit.kastel.scbs.confidentiality.repository.impl.RepositoryPackageImpl#getParametersAndDataPair()
	 * @generated
	 */
	int PARAMETERS_AND_DATA_PAIR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_AND_DATA_PAIR__ID = ConfidentialityPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_AND_DATA_PAIR__NAME = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_AND_DATA_PAIR__PARAMETER_SOURCES = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_AND_DATA_PAIR__DATA_TARGETS = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameters And Data Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_AND_DATA_PAIR_FEATURE_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Parameters And Data Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_AND_DATA_PAIR_OPERATION_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.confidentiality.repository.impl.AddedFunctionalParameterImpl <em>Added Functional Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.confidentiality.repository.impl.AddedFunctionalParameterImpl
	 * @see edu.kit.kastel.scbs.confidentiality.repository.impl.RepositoryPackageImpl#getAddedFunctionalParameter()
	 * @generated
	 */
	int ADDED_FUNCTIONAL_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDED_FUNCTIONAL_PARAMETER__ID = ConfidentialityPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDED_FUNCTIONAL_PARAMETER__NAME = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Added Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDED_FUNCTIONAL_PARAMETER_FEATURE_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Added Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDED_FUNCTIONAL_PARAMETER_OPERATION_COUNT = ConfidentialityPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair <em>Parameters And Data Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters And Data Pair</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair
	 * @generated
	 */
	EClass getParametersAndDataPair();

	/**
	 * Returns the meta object for the attribute list '{@link edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair#getParameterSources <em>Parameter Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter Sources</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair#getParameterSources()
	 * @see #getParametersAndDataPair()
	 * @generated
	 */
	EAttribute getParametersAndDataPair_ParameterSources();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair#getDataTargets <em>Data Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Targets</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair#getDataTargets()
	 * @see #getParametersAndDataPair()
	 * @generated
	 */
	EReference getParametersAndDataPair_DataTargets();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.confidentiality.repository.AddedFunctionalParameter <em>Added Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Added Functional Parameter</em>'.
	 * @see edu.kit.kastel.scbs.confidentiality.repository.AddedFunctionalParameter
	 * @generated
	 */
	EClass getAddedFunctionalParameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepositoryFactory getRepositoryFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.repository.impl.ParametersAndDataPairImpl <em>Parameters And Data Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.repository.impl.ParametersAndDataPairImpl
		 * @see edu.kit.kastel.scbs.confidentiality.repository.impl.RepositoryPackageImpl#getParametersAndDataPair()
		 * @generated
		 */
		EClass PARAMETERS_AND_DATA_PAIR = eINSTANCE.getParametersAndDataPair();

		/**
		 * The meta object literal for the '<em><b>Parameter Sources</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS_AND_DATA_PAIR__PARAMETER_SOURCES = eINSTANCE.getParametersAndDataPair_ParameterSources();

		/**
		 * The meta object literal for the '<em><b>Data Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERS_AND_DATA_PAIR__DATA_TARGETS = eINSTANCE.getParametersAndDataPair_DataTargets();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.confidentiality.repository.impl.AddedFunctionalParameterImpl <em>Added Functional Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.confidentiality.repository.impl.AddedFunctionalParameterImpl
		 * @see edu.kit.kastel.scbs.confidentiality.repository.impl.RepositoryPackageImpl#getAddedFunctionalParameter()
		 * @generated
		 */
		EClass ADDED_FUNCTIONAL_PARAMETER = eINSTANCE.getAddedFunctionalParameter();

	}

} //RepositoryPackage
