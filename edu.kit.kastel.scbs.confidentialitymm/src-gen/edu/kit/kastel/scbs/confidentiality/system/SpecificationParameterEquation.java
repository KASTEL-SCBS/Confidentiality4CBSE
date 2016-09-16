/**
 */
package edu.kit.kastel.scbs.confidentiality.system;

import edu.kit.kastel.scbs.confidentiality.IdentifiedElement;

import edu.kit.kastel.scbs.confidentiality.data.SpecificationParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification Parameter Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getRequiredSpecificationParameter <em>Required Specification Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getProvidedSpecificationParameter <em>Provided Specification Parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getSpecificationParameterEquation()
 * @model
 * @generated
 */
public interface SpecificationParameterEquation extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Required Specification Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Specification Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Specification Parameter</em>' reference.
	 * @see #setRequiredSpecificationParameter(SpecificationParameter)
	 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getSpecificationParameterEquation_RequiredSpecificationParameter()
	 * @model required="true"
	 * @generated
	 */
	SpecificationParameter getRequiredSpecificationParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getRequiredSpecificationParameter <em>Required Specification Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Specification Parameter</em>' reference.
	 * @see #getRequiredSpecificationParameter()
	 * @generated
	 */
	void setRequiredSpecificationParameter(SpecificationParameter value);

	/**
	 * Returns the value of the '<em><b>Provided Specification Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Specification Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Specification Parameter</em>' reference.
	 * @see #setProvidedSpecificationParameter(SpecificationParameter)
	 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getSpecificationParameterEquation_ProvidedSpecificationParameter()
	 * @model required="true"
	 * @generated
	 */
	SpecificationParameter getProvidedSpecificationParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getProvidedSpecificationParameter <em>Provided Specification Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Specification Parameter</em>' reference.
	 * @see #getProvidedSpecificationParameter()
	 * @generated
	 */
	void setProvidedSpecificationParameter(SpecificationParameter value);

} // SpecificationParameterEquation