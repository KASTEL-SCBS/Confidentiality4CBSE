/**
 */
package edu.kit.kastel.scbs.confidentiality.system.impl;

import edu.kit.kastel.scbs.confidentiality.system.DataSetMapParameter2KeyAssignment;
import edu.kit.kastel.scbs.confidentiality.system.SystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set Map Parameter2 Key Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.impl.DataSetMapParameter2KeyAssignmentImpl#getAssignedKey <em>Assigned Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSetMapParameter2KeyAssignmentImpl extends AbstractSpecificationParameterAssignmentImpl implements DataSetMapParameter2KeyAssignment {
	/**
	 * The default value of the '{@link #getAssignedKey() <em>Assigned Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedKey()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNED_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignedKey() <em>Assigned Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedKey()
	 * @generated
	 * @ordered
	 */
	protected String assignedKey = ASSIGNED_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSetMapParameter2KeyAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssignedKey() {
		return assignedKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedKey(String newAssignedKey) {
		String oldAssignedKey = assignedKey;
		assignedKey = newAssignedKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT__ASSIGNED_KEY, oldAssignedKey, assignedKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT__ASSIGNED_KEY:
				return getAssignedKey();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SystemPackage.DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT__ASSIGNED_KEY:
				setAssignedKey((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SystemPackage.DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT__ASSIGNED_KEY:
				setAssignedKey(ASSIGNED_KEY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SystemPackage.DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT__ASSIGNED_KEY:
				return ASSIGNED_KEY_EDEFAULT == null ? assignedKey != null : !ASSIGNED_KEY_EDEFAULT.equals(assignedKey);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (assignedKey: ");
		result.append(assignedKey);
		result.append(')');
		return result.toString();
	}

} //DataSetMapParameter2KeyAssignmentImpl
