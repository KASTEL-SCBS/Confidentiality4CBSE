/**
 */
package edu.kit.kastel.scbs.confidentiality.resources;

import edu.kit.kastel.scbs.confidentiality.IdentifiedElement;
import edu.kit.kastel.scbs.confidentiality.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locations And Tamper Protections Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.resources.LocationsAndTamperProtectionsPair#getLocations <em>Locations</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.resources.LocationsAndTamperProtectionsPair#getTamperProtections <em>Tamper Protections</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.resources.ResourcesPackage#getLocationsAndTamperProtectionsPair()
 * @model
 * @generated
 */
public interface LocationsAndTamperProtectionsPair extends IdentifiedElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.resources.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.resources.ResourcesPackage#getLocationsAndTamperProtectionsPair_Locations()
	 * @model required="true"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Tamper Protections</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.resources.TamperProtection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tamper Protections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tamper Protections</em>' reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.resources.ResourcesPackage#getLocationsAndTamperProtectionsPair_TamperProtections()
	 * @model
	 * @generated
	 */
	EList<TamperProtection> getTamperProtections();

} // LocationsAndTamperProtectionsPair
