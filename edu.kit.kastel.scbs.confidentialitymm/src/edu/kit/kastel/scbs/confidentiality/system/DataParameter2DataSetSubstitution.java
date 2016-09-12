/**
 */
package edu.kit.kastel.scbs.confidentiality.system;

import edu.kit.kastel.scbs.confidentiality.data.DataSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Parameter2 Data Set Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.DataParameter2DataSetSubstitution#getReplacingDataSet <em>Replacing Data Set</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getDataParameter2DataSetSubstitution()
 * @model
 * @generated
 */
public interface DataParameter2DataSetSubstitution extends AbstractDataParameterSubstitution {
	/**
	 * Returns the value of the '<em><b>Replacing Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replacing Data Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacing Data Set</em>' reference.
	 * @see #setReplacingDataSet(DataSet)
	 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getDataParameter2DataSetSubstitution_ReplacingDataSet()
	 * @model required="true"
	 * @generated
	 */
	DataSet getReplacingDataSet();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.confidentiality.system.DataParameter2DataSetSubstitution#getReplacingDataSet <em>Replacing Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacing Data Set</em>' reference.
	 * @see #getReplacingDataSet()
	 * @generated
	 */
	void setReplacingDataSet(DataSet value);

} // DataParameter2DataSetSubstitution
