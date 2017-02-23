/**
 */
package edu.kit.kastel.scbs.confidentiality.adversary;

import edu.kit.kastel.scbs.confidentiality.IdentifiedElement;
import edu.kit.kastel.scbs.confidentiality.NamedElement;

import edu.kit.kastel.scbs.confidentiality.data.UnparameterizedDataIdentifying;

import edu.kit.kastel.scbs.confidentiality.resources.LocationsAndTamperProtectionsPair;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adversary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.adversary.Adversary#getMayKnowData <em>May Know Data</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.adversary.Adversary#getLocationsAndTamperProtectionsPairs <em>Locations And Tamper Protections Pairs</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.adversary.AdversaryPackage#getAdversary()
 * @model
 * @generated
 */
public interface Adversary extends IdentifiedElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>May Know Data</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.data.UnparameterizedDataIdentifying}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>May Know Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>May Know Data</em>' reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.adversary.AdversaryPackage#getAdversary_MayKnowData()
	 * @model
	 * @generated
	 */
	EList<UnparameterizedDataIdentifying> getMayKnowData();

	/**
	 * Returns the value of the '<em><b>Locations And Tamper Protections Pairs</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.resources.LocationsAndTamperProtectionsPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations And Tamper Protections Pairs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations And Tamper Protections Pairs</em>' reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.adversary.AdversaryPackage#getAdversary_LocationsAndTamperProtectionsPairs()
	 * @model
	 * @generated
	 */
	EList<LocationsAndTamperProtectionsPair> getLocationsAndTamperProtectionsPairs();

} // Adversary
