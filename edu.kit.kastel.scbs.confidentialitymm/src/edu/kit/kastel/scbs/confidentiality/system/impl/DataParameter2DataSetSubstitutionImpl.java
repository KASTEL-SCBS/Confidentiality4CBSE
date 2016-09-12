/**
 */
package edu.kit.kastel.scbs.confidentiality.system.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.system.DataParameter2DataSetSubstitution;
import edu.kit.kastel.scbs.confidentiality.system.SystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Parameter2 Data Set Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.impl.DataParameter2DataSetSubstitutionImpl#getReplacingDataSet <em>Replacing Data Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataParameter2DataSetSubstitutionImpl extends AbstractDataParameterSubstitutionImpl implements DataParameter2DataSetSubstitution {
	/**
	 * The cached value of the '{@link #getReplacingDataSet() <em>Replacing Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacingDataSet()
	 * @generated
	 * @ordered
	 */
	protected DataSet replacingDataSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataParameter2DataSetSubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.DATA_PARAMETER2_DATA_SET_SUBSTITUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet getReplacingDataSet() {
		if (replacingDataSet != null && replacingDataSet.eIsProxy()) {
			InternalEObject oldReplacingDataSet = (InternalEObject)replacingDataSet;
			replacingDataSet = (DataSet)eResolveProxy(oldReplacingDataSet);
			if (replacingDataSet != oldReplacingDataSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.DATA_PARAMETER2_DATA_SET_SUBSTITUTION__REPLACING_DATA_SET, oldReplacingDataSet, replacingDataSet));
			}
		}
		return replacingDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet basicGetReplacingDataSet() {
		return replacingDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacingDataSet(DataSet newReplacingDataSet) {
		DataSet oldReplacingDataSet = replacingDataSet;
		replacingDataSet = newReplacingDataSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.DATA_PARAMETER2_DATA_SET_SUBSTITUTION__REPLACING_DATA_SET, oldReplacingDataSet, replacingDataSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.DATA_PARAMETER2_DATA_SET_SUBSTITUTION__REPLACING_DATA_SET:
				if (resolve) return getReplacingDataSet();
				return basicGetReplacingDataSet();
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
			case SystemPackage.DATA_PARAMETER2_DATA_SET_SUBSTITUTION__REPLACING_DATA_SET:
				setReplacingDataSet((DataSet)newValue);
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
			case SystemPackage.DATA_PARAMETER2_DATA_SET_SUBSTITUTION__REPLACING_DATA_SET:
				setReplacingDataSet((DataSet)null);
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
			case SystemPackage.DATA_PARAMETER2_DATA_SET_SUBSTITUTION__REPLACING_DATA_SET:
				return replacingDataSet != null;
		}
		return super.eIsSet(featureID);
	}
	
} //DataParameter2DataSetSubstitutionImpl
