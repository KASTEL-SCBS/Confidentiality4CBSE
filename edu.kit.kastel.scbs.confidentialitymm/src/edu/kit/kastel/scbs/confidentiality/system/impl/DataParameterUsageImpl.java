/**
 */
package edu.kit.kastel.scbs.confidentiality.system.impl;

import edu.kit.kastel.scbs.confidentiality.data.DataParameter;

import edu.kit.kastel.scbs.confidentiality.impl.IdentifiedElementImpl;

import edu.kit.kastel.scbs.confidentiality.system.DataParameterUsage;
import edu.kit.kastel.scbs.confidentiality.system.SystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Parameter Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.impl.DataParameterUsageImpl#getRequiredDataParameter <em>Required Data Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.impl.DataParameterUsageImpl#getProvidedDataParameter <em>Provided Data Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataParameterUsageImpl extends IdentifiedElementImpl implements DataParameterUsage {
	/**
	 * The cached value of the '{@link #getRequiredDataParameter() <em>Required Data Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredDataParameter()
	 * @generated
	 * @ordered
	 */
	protected DataParameter requiredDataParameter;

	/**
	 * The cached value of the '{@link #getProvidedDataParameter() <em>Provided Data Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedDataParameter()
	 * @generated
	 * @ordered
	 */
	protected DataParameter providedDataParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataParameterUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.DATA_PARAMETER_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataParameter getRequiredDataParameter() {
		if (requiredDataParameter != null && requiredDataParameter.eIsProxy()) {
			InternalEObject oldRequiredDataParameter = (InternalEObject)requiredDataParameter;
			requiredDataParameter = (DataParameter)eResolveProxy(oldRequiredDataParameter);
			if (requiredDataParameter != oldRequiredDataParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.DATA_PARAMETER_USAGE__REQUIRED_DATA_PARAMETER, oldRequiredDataParameter, requiredDataParameter));
			}
		}
		return requiredDataParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataParameter basicGetRequiredDataParameter() {
		return requiredDataParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredDataParameter(DataParameter newRequiredDataParameter) {
		DataParameter oldRequiredDataParameter = requiredDataParameter;
		requiredDataParameter = newRequiredDataParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.DATA_PARAMETER_USAGE__REQUIRED_DATA_PARAMETER, oldRequiredDataParameter, requiredDataParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataParameter getProvidedDataParameter() {
		if (providedDataParameter != null && providedDataParameter.eIsProxy()) {
			InternalEObject oldProvidedDataParameter = (InternalEObject)providedDataParameter;
			providedDataParameter = (DataParameter)eResolveProxy(oldProvidedDataParameter);
			if (providedDataParameter != oldProvidedDataParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.DATA_PARAMETER_USAGE__PROVIDED_DATA_PARAMETER, oldProvidedDataParameter, providedDataParameter));
			}
		}
		return providedDataParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataParameter basicGetProvidedDataParameter() {
		return providedDataParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedDataParameter(DataParameter newProvidedDataParameter) {
		DataParameter oldProvidedDataParameter = providedDataParameter;
		providedDataParameter = newProvidedDataParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.DATA_PARAMETER_USAGE__PROVIDED_DATA_PARAMETER, oldProvidedDataParameter, providedDataParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.DATA_PARAMETER_USAGE__REQUIRED_DATA_PARAMETER:
				if (resolve) return getRequiredDataParameter();
				return basicGetRequiredDataParameter();
			case SystemPackage.DATA_PARAMETER_USAGE__PROVIDED_DATA_PARAMETER:
				if (resolve) return getProvidedDataParameter();
				return basicGetProvidedDataParameter();
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
			case SystemPackage.DATA_PARAMETER_USAGE__REQUIRED_DATA_PARAMETER:
				setRequiredDataParameter((DataParameter)newValue);
				return;
			case SystemPackage.DATA_PARAMETER_USAGE__PROVIDED_DATA_PARAMETER:
				setProvidedDataParameter((DataParameter)newValue);
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
			case SystemPackage.DATA_PARAMETER_USAGE__REQUIRED_DATA_PARAMETER:
				setRequiredDataParameter((DataParameter)null);
				return;
			case SystemPackage.DATA_PARAMETER_USAGE__PROVIDED_DATA_PARAMETER:
				setProvidedDataParameter((DataParameter)null);
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
			case SystemPackage.DATA_PARAMETER_USAGE__REQUIRED_DATA_PARAMETER:
				return requiredDataParameter != null;
			case SystemPackage.DATA_PARAMETER_USAGE__PROVIDED_DATA_PARAMETER:
				return providedDataParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //DataParameterUsageImpl
