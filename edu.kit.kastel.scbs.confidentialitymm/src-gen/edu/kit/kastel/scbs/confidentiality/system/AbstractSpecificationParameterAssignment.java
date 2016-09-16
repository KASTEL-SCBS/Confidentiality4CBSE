/**
 */
package edu.kit.kastel.scbs.confidentiality.system;

import edu.kit.kastel.scbs.confidentiality.IdentifiedElement;

import edu.kit.kastel.scbs.confidentiality.data.SpecificationParameter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Specification Parameter Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.AbstractSpecificationParameterAssignment#getSpecificationParametersToReplace <em>Specification Parameters To Replace</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getAbstractSpecificationParameterAssignment()
 * @model abstract="true"
 * @generated
 */
public interface AbstractSpecificationParameterAssignment extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Specification Parameters To Replace</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.data.SpecificationParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Parameters To Replace</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Parameters To Replace</em>' reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getAbstractSpecificationParameterAssignment_SpecificationParametersToReplace()
	 * @model required="true"
	 * @generated
	 */
	EList<SpecificationParameter> getSpecificationParametersToReplace();

} // AbstractSpecificationParameterAssignment
