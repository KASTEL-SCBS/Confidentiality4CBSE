/**
 */
package edu.kit.kastel.scbs.confidentiality.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Data Set Map Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.data.ParameterizedDataSetMapEntry#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.data.DataPackage#getParameterizedDataSetMapEntry()
 * @model
 * @generated
 */
public interface ParameterizedDataSetMapEntry extends AbstractDataSetMapEntry {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(SpecificationParameter)
	 * @see edu.kit.kastel.scbs.confidentiality.data.DataPackage#getParameterizedDataSetMapEntry_Parameter()
	 * @model required="true"
	 * @generated
	 */
	SpecificationParameter getParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.confidentiality.data.ParameterizedDataSetMapEntry#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(SpecificationParameter value);

} // ParameterizedDataSetMapEntry
