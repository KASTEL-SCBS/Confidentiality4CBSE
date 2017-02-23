/**
 */
package edu.kit.kastel.scbs.confidentiality.resources;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.scbs.confidentiality.resources.ResourcesPackage
 * @generated
 */
public interface ResourcesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcesFactory eINSTANCE = edu.kit.kastel.scbs.confidentiality.resources.impl.ResourcesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Tamper Protection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tamper Protection</em>'.
	 * @generated
	 */
	TamperProtection createTamperProtection();

	/**
	 * Returns a new object of class '<em>Locations And Tamper Protections Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Locations And Tamper Protections Pair</em>'.
	 * @generated
	 */
	LocationsAndTamperProtectionsPair createLocationsAndTamperProtectionsPair();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourcesPackage getResourcesPackage();

} //ResourcesFactory
