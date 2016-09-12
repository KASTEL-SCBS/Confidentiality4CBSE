/**
 */
package edu.kit.kastel.scbs.confidentiality.system;

import edu.kit.kastel.scbs.confidentiality.IdentifiedElement;
import edu.kit.kastel.scbs.confidentiality.data.DataParameter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Data Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.AbstractDataParameterSubstitution#getDataParametersToReplace <em>Data Parameters To Replace</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getAbstractDataParameterSubstitution()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDataParameterSubstitution extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Data Parameters To Replace</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.data.DataParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Parameters To Replace</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Parameters To Replace</em>' reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getAbstractDataParameterSubstitution_DataParametersToReplace()
	 * @model required="true"
	 * @generated
	 */
	EList<DataParameter> getDataParametersToReplace();

} // AbstractDataParameterSubstitution
