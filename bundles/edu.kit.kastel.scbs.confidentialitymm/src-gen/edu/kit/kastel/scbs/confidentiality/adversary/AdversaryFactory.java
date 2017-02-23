/**
 */
package edu.kit.kastel.scbs.confidentiality.adversary;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.scbs.confidentiality.adversary.AdversaryPackage
 * @generated
 */
public interface AdversaryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdversaryFactory eINSTANCE = edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversaryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Adversaries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adversaries</em>'.
	 * @generated
	 */
	Adversaries createAdversaries();

	/**
	 * Returns a new object of class '<em>Adversary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adversary</em>'.
	 * @generated
	 */
	Adversary createAdversary();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdversaryPackage getAdversaryPackage();

} //AdversaryFactory
