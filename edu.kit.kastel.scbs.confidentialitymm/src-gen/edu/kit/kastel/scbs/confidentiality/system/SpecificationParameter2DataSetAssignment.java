/**
 */
package edu.kit.kastel.scbs.confidentiality.system;

import edu.kit.kastel.scbs.confidentiality.data.DataSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification Parameter2 Data Set Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameter2DataSetAssignment#getAssignedDataSet <em>Assigned Data Set</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getSpecificationParameter2DataSetAssignment()
 * @model
 * @generated
 */
public interface SpecificationParameter2DataSetAssignment extends AbstractSpecificationParameterAssignment {
	/**
	 * Returns the value of the '<em><b>Assigned Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Data Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Data Set</em>' reference.
	 * @see #setAssignedDataSet(DataSet)
	 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getSpecificationParameter2DataSetAssignment_AssignedDataSet()
	 * @model required="true"
	 * @generated
	 */
	DataSet getAssignedDataSet();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameter2DataSetAssignment#getAssignedDataSet <em>Assigned Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Data Set</em>' reference.
	 * @see #getAssignedDataSet()
	 * @generated
	 */
	void setAssignedDataSet(DataSet value);

} // SpecificationParameter2DataSetAssignment
