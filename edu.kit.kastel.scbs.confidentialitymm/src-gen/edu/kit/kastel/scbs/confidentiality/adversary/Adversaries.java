/**
 */
package edu.kit.kastel.scbs.confidentiality.adversary;

import edu.kit.kastel.scbs.confidentiality.IdentifiedElement;
import edu.kit.kastel.scbs.confidentiality.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adversaries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.adversary.Adversaries#getAdversaries <em>Adversaries</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.adversary.AdversaryPackage#getAdversaries()
 * @model
 * @generated
 */
public interface Adversaries extends IdentifiedElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Adversaries</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.adversary.Adversary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adversaries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adversaries</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.adversary.AdversaryPackage#getAdversaries_Adversaries()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Adversary> getAdversaries();

} // Adversaries
