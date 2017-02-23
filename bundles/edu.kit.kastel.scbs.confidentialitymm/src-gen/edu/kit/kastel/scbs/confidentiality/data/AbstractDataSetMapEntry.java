/**
 */
package edu.kit.kastel.scbs.confidentiality.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Data Set Map Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.data.AbstractDataSetMapEntry#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.data.DataPackage#getAbstractDataSetMapEntry()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDataSetMapEntry extends DataIdentifying {
	/**
	 * Returns the value of the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' reference.
	 * @see #setMap(DataSetMap)
	 * @see edu.kit.kastel.scbs.confidentiality.data.DataPackage#getAbstractDataSetMapEntry_Map()
	 * @model required="true"
	 * @generated
	 */
	DataSetMap getMap();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.confidentiality.data.AbstractDataSetMapEntry#getMap <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(DataSetMap value);

} // AbstractDataSetMapEntry
