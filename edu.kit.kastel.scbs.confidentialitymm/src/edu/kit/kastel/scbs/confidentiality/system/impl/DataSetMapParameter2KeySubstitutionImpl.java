/**
 */
package edu.kit.kastel.scbs.confidentiality.system.impl;

import edu.kit.kastel.scbs.confidentiality.system.DataSetMapParameter2KeySubstitution;
import edu.kit.kastel.scbs.confidentiality.system.SystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set Map Parameter2 Key Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.impl.DataSetMapParameter2KeySubstitutionImpl#getReplacingKey <em>Replacing Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSetMapParameter2KeySubstitutionImpl extends AbstractDataParameterSubstitutionImpl implements DataSetMapParameter2KeySubstitution {
	/**
	 * The default value of the '{@link #getReplacingKey() <em>Replacing Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacingKey()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLACING_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplacingKey() <em>Replacing Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacingKey()
	 * @generated
	 * @ordered
	 */
	protected String replacingKey = REPLACING_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSetMapParameter2KeySubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplacingKey() {
		return replacingKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacingKey(String newReplacingKey) {
		String oldReplacingKey = replacingKey;
		replacingKey = newReplacingKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION__REPLACING_KEY, oldReplacingKey, replacingKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION__REPLACING_KEY:
				return getReplacingKey();
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
			case SystemPackage.DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION__REPLACING_KEY:
				setReplacingKey((String)newValue);
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
			case SystemPackage.DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION__REPLACING_KEY:
				setReplacingKey(REPLACING_KEY_EDEFAULT);
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
			case SystemPackage.DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION__REPLACING_KEY:
				return REPLACING_KEY_EDEFAULT == null ? replacingKey != null : !REPLACING_KEY_EDEFAULT.equals(replacingKey);
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
		result.append(" (replacingKey: ");
		result.append(replacingKey);
		result.append(')');
		return result.toString();
	}

} //DataSetMapParameter2KeySubstitutionImpl
