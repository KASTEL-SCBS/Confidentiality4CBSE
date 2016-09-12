/**
 */
package edu.kit.kastel.scbs.confidentiality.data.util;

import edu.kit.kastel.scbs.confidentiality.IdentifiedElement;
import edu.kit.kastel.scbs.confidentiality.NamedElement;

import edu.kit.kastel.scbs.confidentiality.data.*;

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
 * @see edu.kit.kastel.scbs.confidentiality.data.DataPackage
 * @generated
 */
public class DataSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSwitch() {
		if (modelPackage == null) {
			modelPackage = DataPackage.eINSTANCE;
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
			case DataPackage.DATA_IDENTIFYING: {
				DataIdentifying dataIdentifying = (DataIdentifying)theEObject;
				T result = caseDataIdentifying(dataIdentifying);
				if (result == null) result = caseIdentifiedElement(dataIdentifying);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.UNPARAMETERIZED_DATA_IDENTIFYING: {
				UnparameterizedDataIdentifying unparameterizedDataIdentifying = (UnparameterizedDataIdentifying)theEObject;
				T result = caseUnparameterizedDataIdentifying(unparameterizedDataIdentifying);
				if (result == null) result = caseDataIdentifying(unparameterizedDataIdentifying);
				if (result == null) result = caseIdentifiedElement(unparameterizedDataIdentifying);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_SET: {
				DataSet dataSet = (DataSet)theEObject;
				T result = caseDataSet(dataSet);
				if (result == null) result = caseUnparameterizedDataIdentifying(dataSet);
				if (result == null) result = caseNamedElement(dataSet);
				if (result == null) result = caseDataIdentifying(dataSet);
				if (result == null) result = caseIdentifiedElement(dataSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_SET_MAP: {
				DataSetMap dataSetMap = (DataSetMap)theEObject;
				T result = caseDataSetMap(dataSetMap);
				if (result == null) result = caseIdentifiedElement(dataSetMap);
				if (result == null) result = caseNamedElement(dataSetMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_PARAMETER: {
				DataParameter dataParameter = (DataParameter)theEObject;
				T result = caseDataParameter(dataParameter);
				if (result == null) result = caseDataIdentifying(dataParameter);
				if (result == null) result = caseNamedElement(dataParameter);
				if (result == null) result = caseIdentifiedElement(dataParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.ABSTRACT_DATA_SET_MAP_ENTRY: {
				AbstractDataSetMapEntry abstractDataSetMapEntry = (AbstractDataSetMapEntry)theEObject;
				T result = caseAbstractDataSetMapEntry(abstractDataSetMapEntry);
				if (result == null) result = caseDataIdentifying(abstractDataSetMapEntry);
				if (result == null) result = caseIdentifiedElement(abstractDataSetMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_SET_MAP_ENTRY: {
				DataSetMapEntry dataSetMapEntry = (DataSetMapEntry)theEObject;
				T result = caseDataSetMapEntry(dataSetMapEntry);
				if (result == null) result = caseAbstractDataSetMapEntry(dataSetMapEntry);
				if (result == null) result = caseUnparameterizedDataIdentifying(dataSetMapEntry);
				if (result == null) result = caseNamedElement(dataSetMapEntry);
				if (result == null) result = caseDataIdentifying(dataSetMapEntry);
				if (result == null) result = caseIdentifiedElement(dataSetMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.PARAMETERIZED_DATA_SET_MAP_ENTRY: {
				ParameterizedDataSetMapEntry parameterizedDataSetMapEntry = (ParameterizedDataSetMapEntry)theEObject;
				T result = caseParameterizedDataSetMapEntry(parameterizedDataSetMapEntry);
				if (result == null) result = caseAbstractDataSetMapEntry(parameterizedDataSetMapEntry);
				if (result == null) result = caseDataIdentifying(parameterizedDataSetMapEntry);
				if (result == null) result = caseIdentifiedElement(parameterizedDataSetMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifying</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifying</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataIdentifying(DataIdentifying object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unparameterized Data Identifying</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unparameterized Data Identifying</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnparameterizedDataIdentifying(UnparameterizedDataIdentifying object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSet(DataSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSetMap(DataSetMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataParameter(DataParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Data Set Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Data Set Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDataSetMapEntry(AbstractDataSetMapEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSetMapEntry(DataSetMapEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Data Set Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Data Set Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedDataSetMapEntry(ParameterizedDataSetMapEntry object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
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

} //DataSwitch
