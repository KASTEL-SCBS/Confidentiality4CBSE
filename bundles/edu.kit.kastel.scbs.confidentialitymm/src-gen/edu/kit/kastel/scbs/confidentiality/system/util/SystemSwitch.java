/**
 */
package edu.kit.kastel.scbs.confidentiality.system.util;

import edu.kit.kastel.scbs.confidentiality.IdentifiedElement;

import edu.kit.kastel.scbs.confidentiality.system.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage
 * @generated
 */
public class SystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSwitch() {
		if (modelPackage == null) {
			modelPackage = SystemPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SystemPackage.ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT: {
				AbstractSpecificationParameterAssignment abstractSpecificationParameterAssignment = (AbstractSpecificationParameterAssignment)theEObject;
				T result = caseAbstractSpecificationParameterAssignment(abstractSpecificationParameterAssignment);
				if (result == null) result = caseIdentifiedElement(abstractSpecificationParameterAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT: {
				SpecificationParameter2DataSetAssignment specificationParameter2DataSetAssignment = (SpecificationParameter2DataSetAssignment)theEObject;
				T result = caseSpecificationParameter2DataSetAssignment(specificationParameter2DataSetAssignment);
				if (result == null) result = caseAbstractSpecificationParameterAssignment(specificationParameter2DataSetAssignment);
				if (result == null) result = caseIdentifiedElement(specificationParameter2DataSetAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT: {
				DataSetMapParameter2KeyAssignment dataSetMapParameter2KeyAssignment = (DataSetMapParameter2KeyAssignment)theEObject;
				T result = caseDataSetMapParameter2KeyAssignment(dataSetMapParameter2KeyAssignment);
				if (result == null) result = caseAbstractSpecificationParameterAssignment(dataSetMapParameter2KeyAssignment);
				if (result == null) result = caseIdentifiedElement(dataSetMapParameter2KeyAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION: {
				SpecificationParameterEquation specificationParameterEquation = (SpecificationParameterEquation)theEObject;
				T result = caseSpecificationParameterEquation(specificationParameterEquation);
				if (result == null) result = caseIdentifiedElement(specificationParameterEquation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Specification Parameter Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Specification Parameter Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSpecificationParameterAssignment(AbstractSpecificationParameterAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification Parameter2 Data Set Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification Parameter2 Data Set Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificationParameter2DataSetAssignment(SpecificationParameter2DataSetAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Set Map Parameter2 Key Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Set Map Parameter2 Key Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSetMapParameter2KeyAssignment(DataSetMapParameter2KeyAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification Parameter Equation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification Parameter Equation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificationParameterEquation(SpecificationParameterEquation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedElement(IdentifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SystemSwitch
