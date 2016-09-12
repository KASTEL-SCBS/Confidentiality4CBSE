/**
 */
package edu.kit.kastel.scbs.confidentiality.system;

import edu.kit.kastel.scbs.confidentiality.IdentifiedElement;

import edu.kit.kastel.scbs.confidentiality.data.DataParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Parameter Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.DataParameterUsage#getRequiredDataParameter <em>Required Data Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.DataParameterUsage#getProvidedDataParameter <em>Provided Data Parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getDataParameterUsage()
 * @model
 * @generated
 */
public interface DataParameterUsage extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Required Data Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Data Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Data Parameter</em>' reference.
	 * @see #setRequiredDataParameter(DataParameter)
	 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getDataParameterUsage_RequiredDataParameter()
	 * @model required="true"
	 * @generated
	 */
	DataParameter getRequiredDataParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.confidentiality.system.DataParameterUsage#getRequiredDataParameter <em>Required Data Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Data Parameter</em>' reference.
	 * @see #getRequiredDataParameter()
	 * @generated
	 */
	void setRequiredDataParameter(DataParameter value);

	/**
	 * Returns the value of the '<em><b>Provided Data Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Data Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Data Parameter</em>' reference.
	 * @see #setProvidedDataParameter(DataParameter)
	 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getDataParameterUsage_ProvidedDataParameter()
	 * @model required="true"
	 * @generated
	 */
	DataParameter getProvidedDataParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.confidentiality.system.DataParameterUsage#getProvidedDataParameter <em>Provided Data Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Data Parameter</em>' reference.
	 * @see #getProvidedDataParameter()
	 * @generated
	 */
	void setProvidedDataParameter(DataParameter value);

} // DataParameterUsage
