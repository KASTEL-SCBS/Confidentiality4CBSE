/**
 */
package edu.kit.kastel.scbs.confidentiality.data;

import edu.kit.kastel.scbs.confidentiality.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.data.SpecificationParameter#getDefiningServiceParameter <em>Defining Service Parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.data.DataPackage#getSpecificationParameter()
 * @model
 * @generated
 */
public interface SpecificationParameter extends DataIdentifying, NamedElement {
	/**
	 * Returns the value of the '<em><b>Defining Service Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining Service Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining Service Parameter</em>' attribute.
	 * @see #setDefiningServiceParameter(String)
	 * @see edu.kit.kastel.scbs.confidentiality.data.DataPackage#getSpecificationParameter_DefiningServiceParameter()
	 * @model
	 * @generated
	 */
	String getDefiningServiceParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.confidentiality.data.SpecificationParameter#getDefiningServiceParameter <em>Defining Service Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Service Parameter</em>' attribute.
	 * @see #getDefiningServiceParameter()
	 * @generated
	 */
	void setDefiningServiceParameter(String value);

} // SpecificationParameter
