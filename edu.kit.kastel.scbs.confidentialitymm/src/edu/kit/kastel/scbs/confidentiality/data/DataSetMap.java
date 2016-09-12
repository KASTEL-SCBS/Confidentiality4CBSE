/**
 */
package edu.kit.kastel.scbs.confidentiality.data;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.IdentifiedElement;
import edu.kit.kastel.scbs.confidentiality.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.data.DataSetMap#getSpecificationContainer <em>Specification Container</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.data.DataPackage#getDataSetMap()
 * @model
 * @generated
 */
public interface DataSetMap extends IdentifiedElement, NamedElement {

	/**
	 * Returns the value of the '<em><b>Specification Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getDataSetMaps <em>Data Set Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Container</em>' container reference.
	 * @see #setSpecificationContainer(ConfidentialitySpecification)
	 * @see edu.kit.kastel.scbs.confidentiality.data.DataPackage#getDataSetMap_SpecificationContainer()
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getDataSetMaps
	 * @model opposite="dataSetMaps" required="true" transient="false"
	 * @generated
	 */
	ConfidentialitySpecification getSpecificationContainer();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.confidentiality.data.DataSetMap#getSpecificationContainer <em>Specification Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Container</em>' container reference.
	 * @see #getSpecificationContainer()
	 * @generated
	 */
	void setSpecificationContainer(ConfidentialitySpecification value);
} // DataSetMap
