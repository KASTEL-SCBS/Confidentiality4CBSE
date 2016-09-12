/**
 */
package edu.kit.kastel.scbs.confidentiality.data;

import edu.kit.kastel.scbs.confidentiality.NamedElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.data.DataParameter#getDefiningFunctionalParameter <em>Defining Functional Parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.data.DataPackage#getDataParameter()
 * @model
 * @generated
 */
public interface DataParameter extends DataIdentifying, NamedElement {
	/**
	 * Returns the value of the '<em><b>Defining Functional Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining Functional Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining Functional Parameter</em>' attribute.
	 * @see #setDefiningFunctionalParameter(String)
	 * @see edu.kit.kastel.scbs.confidentiality.data.DataPackage#getDataParameter_DefiningFunctionalParameter()
	 * @model
	 * @generated
	 */
	String getDefiningFunctionalParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.confidentiality.data.DataParameter#getDefiningFunctionalParameter <em>Defining Functional Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Functional Parameter</em>' attribute.
	 * @see #getDefiningFunctionalParameter()
	 * @generated
	 */
	void setDefiningFunctionalParameter(String value);

} // DataParameter
