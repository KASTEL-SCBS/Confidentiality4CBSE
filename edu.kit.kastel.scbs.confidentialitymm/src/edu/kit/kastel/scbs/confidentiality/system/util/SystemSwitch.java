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
			case SystemPackage.ABSTRACT_DATA_PARAMETER_SUBSTITUTION: {
				AbstractDataParameterSubstitution abstractDataParameterSubstitution = (AbstractDataParameterSubstitution)theEObject;
				T result = caseAbstractDataParameterSubstitution(abstractDataParameterSubstitution);
				if (result == null) result = caseIdentifiedElement(abstractDataParameterSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.DATA_PARAMETER2_DATA_SET_SUBSTITUTION: {
				DataParameter2DataSetSubstitution dataParameter2DataSetSubstitution = (DataParameter2DataSetSubstitution)theEObject;
				T result = caseDataParameter2DataSetSubstitution(dataParameter2DataSetSubstitution);
				if (result == null) result = caseAbstractDataParameterSubstitution(dataParameter2DataSetSubstitution);
				if (result == null) result = caseIdentifiedElement(dataParameter2DataSetSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION: {
				DataSetMapParameter2KeySubstitution dataSetMapParameter2KeySubstitution = (DataSetMapParameter2KeySubstitution)theEObject;
				T result = caseDataSetMapParameter2KeySubstitution(dataSetMapParameter2KeySubstitution);
				if (result == null) result = caseAbstractDataParameterSubstitution(dataSetMapParameter2KeySubstitution);
				if (result == null) result = caseIdentifiedElement(dataSetMapParameter2KeySubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.DATA_PARAMETER_USAGE: {
				DataParameterUsage dataParameterUsage = (DataParameterUsage)theEObject;
				T result = caseDataParameterUsage(dataParameterUsage);
				if (result == null) result = caseIdentifiedElement(dataParameterUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Data Parameter Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Data Parameter Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDataParameterSubstitution(AbstractDataParameterSubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Parameter2 Data Set Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Parameter2 Data Set Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataParameter2DataSetSubstitution(DataParameter2DataSetSubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Set Map Parameter2 Key Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Set Map Parameter2 Key Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSetMapParameter2KeySubstitution(DataSetMapParameter2KeySubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Parameter Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Parameter Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataParameterUsage(DataParameterUsage object) {
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
