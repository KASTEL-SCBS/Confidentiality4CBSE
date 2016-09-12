/**
 */
package edu.kit.kastel.scbs.confidentiality.repository;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.scbs.confidentiality.repository.RepositoryPackage
 * @generated
 */
public interface RepositoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepositoryFactory eINSTANCE = edu.kit.kastel.scbs.confidentiality.repository.impl.RepositoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Parameters And Data Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameters And Data Pair</em>'.
	 * @generated
	 */
	ParametersAndDataPair createParametersAndDataPair();

	/**
	 * Returns a new object of class '<em>Added Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Added Functional Parameter</em>'.
	 * @generated
	 */
	AddedFunctionalParameter createAddedFunctionalParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RepositoryPackage getRepositoryPackage();

} //RepositoryFactory
