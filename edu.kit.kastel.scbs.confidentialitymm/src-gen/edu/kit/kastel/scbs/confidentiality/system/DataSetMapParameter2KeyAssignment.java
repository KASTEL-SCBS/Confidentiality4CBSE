/**
 */
package edu.kit.kastel.scbs.confidentiality.system;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set Map Parameter2 Key Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.DataSetMapParameter2KeyAssignment#getAssignedKey <em>Assigned Key</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getDataSetMapParameter2KeyAssignment()
 * @model
 * @generated
 */
public interface DataSetMapParameter2KeyAssignment extends AbstractSpecificationParameterAssignment {
	/**
	 * Returns the value of the '<em><b>Assigned Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Key</em>' attribute.
	 * @see #setAssignedKey(String)
	 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getDataSetMapParameter2KeyAssignment_AssignedKey()
	 * @model required="true"
	 * @generated
	 */
	String getAssignedKey();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.confidentiality.system.DataSetMapParameter2KeyAssignment#getAssignedKey <em>Assigned Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Key</em>' attribute.
	 * @see #getAssignedKey()
	 * @generated
	 */
	void setAssignedKey(String value);

} // DataSetMapParameter2KeyAssignment
