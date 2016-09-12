/**
 */
package edu.kit.kastel.scbs.confidentiality.system;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set Map Parameter2 Key Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.DataSetMapParameter2KeySubstitution#getReplacingKey <em>Replacing Key</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getDataSetMapParameter2KeySubstitution()
 * @model
 * @generated
 */
public interface DataSetMapParameter2KeySubstitution extends AbstractDataParameterSubstitution {
	/**
	 * Returns the value of the '<em><b>Replacing Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replacing Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacing Key</em>' attribute.
	 * @see #setReplacingKey(String)
	 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getDataSetMapParameter2KeySubstitution_ReplacingKey()
	 * @model required="true"
	 * @generated
	 */
	String getReplacingKey();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.confidentiality.system.DataSetMapParameter2KeySubstitution#getReplacingKey <em>Replacing Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacing Key</em>' attribute.
	 * @see #getReplacingKey()
	 * @generated
	 */
	void setReplacingKey(String value);

} // DataSetMapParameter2KeySubstitution
