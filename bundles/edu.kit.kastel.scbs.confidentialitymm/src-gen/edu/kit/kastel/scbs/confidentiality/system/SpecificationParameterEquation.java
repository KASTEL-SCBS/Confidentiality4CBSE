/**
 */
package edu.kit.kastel.scbs.confidentiality.system;

import edu.kit.kastel.scbs.confidentiality.IdentifiedElement;

import edu.kit.kastel.scbs.confidentiality.data.SpecificationParameter;
import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.repository.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification Parameter Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getLeftSpecificationParameter <em>Left Specification Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getRightSpecificationParameter <em>Right Specification Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getLeftInterfaces <em>Left Interfaces</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getRightInterfaces <em>Right Interfaces</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getSpecificationParameterEquation()
 * @model
 * @generated
 */
public interface SpecificationParameterEquation extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Left Specification Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Specification Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Specification Parameter</em>' reference.
	 * @see #setLeftSpecificationParameter(SpecificationParameter)
	 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getSpecificationParameterEquation_LeftSpecificationParameter()
	 * @model required="true"
	 * @generated
	 */
	SpecificationParameter getLeftSpecificationParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getLeftSpecificationParameter <em>Left Specification Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Specification Parameter</em>' reference.
	 * @see #getLeftSpecificationParameter()
	 * @generated
	 */
	void setLeftSpecificationParameter(SpecificationParameter value);

	/**
	 * Returns the value of the '<em><b>Right Specification Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Specification Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Specification Parameter</em>' reference.
	 * @see #setRightSpecificationParameter(SpecificationParameter)
	 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getSpecificationParameterEquation_RightSpecificationParameter()
	 * @model required="true"
	 * @generated
	 */
	SpecificationParameter getRightSpecificationParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation#getRightSpecificationParameter <em>Right Specification Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Specification Parameter</em>' reference.
	 * @see #getRightSpecificationParameter()
	 * @generated
	 */
	void setRightSpecificationParameter(SpecificationParameter value);

	/**
	 * Returns the value of the '<em><b>Left Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Interfaces</em>' reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getSpecificationParameterEquation_LeftInterfaces()
	 * @model required="true"
	 * @generated
	 */
	EList<Interface> getLeftInterfaces();

	/**
	 * Returns the value of the '<em><b>Right Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Interfaces</em>' reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage#getSpecificationParameterEquation_RightInterfaces()
	 * @model required="true"
	 * @generated
	 */
	EList<Interface> getRightInterfaces();

} // SpecificationParameterEquation
