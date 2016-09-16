/**
 */
package edu.kit.kastel.scbs.confidentiality.system.impl;

import edu.kit.kastel.scbs.confidentiality.data.SpecificationParameter;

import edu.kit.kastel.scbs.confidentiality.impl.IdentifiedElementImpl;

import edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation;
import edu.kit.kastel.scbs.confidentiality.system.SystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification Parameter Equation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.impl.SpecificationParameterEquationImpl#getRequiredSpecificationParameter <em>Required Specification Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.impl.SpecificationParameterEquationImpl#getProvidedSpecificationParameter <em>Provided Specification Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationParameterEquationImpl extends IdentifiedElementImpl implements SpecificationParameterEquation {
	/**
	 * The cached value of the '{@link #getRequiredSpecificationParameter() <em>Required Specification Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredSpecificationParameter()
	 * @generated
	 * @ordered
	 */
	protected SpecificationParameter requiredSpecificationParameter;

	/**
	 * The cached value of the '{@link #getProvidedSpecificationParameter() <em>Provided Specification Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedSpecificationParameter()
	 * @generated
	 * @ordered
	 */
	protected SpecificationParameter providedSpecificationParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationParameterEquationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.SPECIFICATION_PARAMETER_EQUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationParameter getRequiredSpecificationParameter() {
		if (requiredSpecificationParameter != null && requiredSpecificationParameter.eIsProxy()) {
			InternalEObject oldRequiredSpecificationParameter = (InternalEObject)requiredSpecificationParameter;
			requiredSpecificationParameter = (SpecificationParameter)eResolveProxy(oldRequiredSpecificationParameter);
			if (requiredSpecificationParameter != oldRequiredSpecificationParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.SPECIFICATION_PARAMETER_EQUATION__REQUIRED_SPECIFICATION_PARAMETER, oldRequiredSpecificationParameter, requiredSpecificationParameter));
			}
		}
		return requiredSpecificationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationParameter basicGetRequiredSpecificationParameter() {
		return requiredSpecificationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredSpecificationParameter(SpecificationParameter newRequiredSpecificationParameter) {
		SpecificationParameter oldRequiredSpecificationParameter = requiredSpecificationParameter;
		requiredSpecificationParameter = newRequiredSpecificationParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.SPECIFICATION_PARAMETER_EQUATION__REQUIRED_SPECIFICATION_PARAMETER, oldRequiredSpecificationParameter, requiredSpecificationParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationParameter getProvidedSpecificationParameter() {
		if (providedSpecificationParameter != null && providedSpecificationParameter.eIsProxy()) {
			InternalEObject oldProvidedSpecificationParameter = (InternalEObject)providedSpecificationParameter;
			providedSpecificationParameter = (SpecificationParameter)eResolveProxy(oldProvidedSpecificationParameter);
			if (providedSpecificationParameter != oldProvidedSpecificationParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.SPECIFICATION_PARAMETER_EQUATION__PROVIDED_SPECIFICATION_PARAMETER, oldProvidedSpecificationParameter, providedSpecificationParameter));
			}
		}
		return providedSpecificationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationParameter basicGetProvidedSpecificationParameter() {
		return providedSpecificationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedSpecificationParameter(SpecificationParameter newProvidedSpecificationParameter) {
		SpecificationParameter oldProvidedSpecificationParameter = providedSpecificationParameter;
		providedSpecificationParameter = newProvidedSpecificationParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.SPECIFICATION_PARAMETER_EQUATION__PROVIDED_SPECIFICATION_PARAMETER, oldProvidedSpecificationParameter, providedSpecificationParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__REQUIRED_SPECIFICATION_PARAMETER:
				if (resolve) return getRequiredSpecificationParameter();
				return basicGetRequiredSpecificationParameter();
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__PROVIDED_SPECIFICATION_PARAMETER:
				if (resolve) return getProvidedSpecificationParameter();
				return basicGetProvidedSpecificationParameter();
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
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__REQUIRED_SPECIFICATION_PARAMETER:
				setRequiredSpecificationParameter((SpecificationParameter)newValue);
				return;
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__PROVIDED_SPECIFICATION_PARAMETER:
				setProvidedSpecificationParameter((SpecificationParameter)newValue);
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
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__REQUIRED_SPECIFICATION_PARAMETER:
				setRequiredSpecificationParameter((SpecificationParameter)null);
				return;
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__PROVIDED_SPECIFICATION_PARAMETER:
				setProvidedSpecificationParameter((SpecificationParameter)null);
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
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__REQUIRED_SPECIFICATION_PARAMETER:
				return requiredSpecificationParameter != null;
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__PROVIDED_SPECIFICATION_PARAMETER:
				return providedSpecificationParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecificationParameterEquationImpl
