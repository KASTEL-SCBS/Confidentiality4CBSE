/**
 */
package edu.kit.kastel.scbs.confidentiality.system.impl;

import edu.kit.kastel.scbs.confidentiality.data.SpecificationParameter;

import edu.kit.kastel.scbs.confidentiality.impl.IdentifiedElementImpl;

import edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation;
import edu.kit.kastel.scbs.confidentiality.system.SystemPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.palladiosimulator.pcm.repository.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification Parameter Equation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.impl.SpecificationParameterEquationImpl#getLeftSpecificationParameter <em>Left Specification Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.impl.SpecificationParameterEquationImpl#getRightSpecificationParameter <em>Right Specification Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.impl.SpecificationParameterEquationImpl#getLeftInterfaces <em>Left Interfaces</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.impl.SpecificationParameterEquationImpl#getRightInterfaces <em>Right Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationParameterEquationImpl extends IdentifiedElementImpl implements SpecificationParameterEquation {
	/**
	 * The cached value of the '{@link #getLeftSpecificationParameter() <em>Left Specification Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSpecificationParameter()
	 * @generated
	 * @ordered
	 */
	protected SpecificationParameter leftSpecificationParameter;

	/**
	 * The cached value of the '{@link #getRightSpecificationParameter() <em>Right Specification Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSpecificationParameter()
	 * @generated
	 * @ordered
	 */
	protected SpecificationParameter rightSpecificationParameter;

	/**
	 * The cached value of the '{@link #getLeftInterfaces() <em>Left Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> leftInterfaces;

	/**
	 * The cached value of the '{@link #getRightInterfaces() <em>Right Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> rightInterfaces;

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
	public SpecificationParameter getLeftSpecificationParameter() {
		if (leftSpecificationParameter != null && leftSpecificationParameter.eIsProxy()) {
			InternalEObject oldLeftSpecificationParameter = (InternalEObject)leftSpecificationParameter;
			leftSpecificationParameter = (SpecificationParameter)eResolveProxy(oldLeftSpecificationParameter);
			if (leftSpecificationParameter != oldLeftSpecificationParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.SPECIFICATION_PARAMETER_EQUATION__LEFT_SPECIFICATION_PARAMETER, oldLeftSpecificationParameter, leftSpecificationParameter));
			}
		}
		return leftSpecificationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationParameter basicGetLeftSpecificationParameter() {
		return leftSpecificationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftSpecificationParameter(SpecificationParameter newLeftSpecificationParameter) {
		SpecificationParameter oldLeftSpecificationParameter = leftSpecificationParameter;
		leftSpecificationParameter = newLeftSpecificationParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.SPECIFICATION_PARAMETER_EQUATION__LEFT_SPECIFICATION_PARAMETER, oldLeftSpecificationParameter, leftSpecificationParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationParameter getRightSpecificationParameter() {
		if (rightSpecificationParameter != null && rightSpecificationParameter.eIsProxy()) {
			InternalEObject oldRightSpecificationParameter = (InternalEObject)rightSpecificationParameter;
			rightSpecificationParameter = (SpecificationParameter)eResolveProxy(oldRightSpecificationParameter);
			if (rightSpecificationParameter != oldRightSpecificationParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.SPECIFICATION_PARAMETER_EQUATION__RIGHT_SPECIFICATION_PARAMETER, oldRightSpecificationParameter, rightSpecificationParameter));
			}
		}
		return rightSpecificationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationParameter basicGetRightSpecificationParameter() {
		return rightSpecificationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightSpecificationParameter(SpecificationParameter newRightSpecificationParameter) {
		SpecificationParameter oldRightSpecificationParameter = rightSpecificationParameter;
		rightSpecificationParameter = newRightSpecificationParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.SPECIFICATION_PARAMETER_EQUATION__RIGHT_SPECIFICATION_PARAMETER, oldRightSpecificationParameter, rightSpecificationParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getLeftInterfaces() {
		if (leftInterfaces == null) {
			leftInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, SystemPackage.SPECIFICATION_PARAMETER_EQUATION__LEFT_INTERFACES);
		}
		return leftInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRightInterfaces() {
		if (rightInterfaces == null) {
			rightInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, SystemPackage.SPECIFICATION_PARAMETER_EQUATION__RIGHT_INTERFACES);
		}
		return rightInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__LEFT_SPECIFICATION_PARAMETER:
				if (resolve) return getLeftSpecificationParameter();
				return basicGetLeftSpecificationParameter();
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__RIGHT_SPECIFICATION_PARAMETER:
				if (resolve) return getRightSpecificationParameter();
				return basicGetRightSpecificationParameter();
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__LEFT_INTERFACES:
				return getLeftInterfaces();
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__RIGHT_INTERFACES:
				return getRightInterfaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__LEFT_SPECIFICATION_PARAMETER:
				setLeftSpecificationParameter((SpecificationParameter)newValue);
				return;
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__RIGHT_SPECIFICATION_PARAMETER:
				setRightSpecificationParameter((SpecificationParameter)newValue);
				return;
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__LEFT_INTERFACES:
				getLeftInterfaces().clear();
				getLeftInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__RIGHT_INTERFACES:
				getRightInterfaces().clear();
				getRightInterfaces().addAll((Collection<? extends Interface>)newValue);
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
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__LEFT_SPECIFICATION_PARAMETER:
				setLeftSpecificationParameter((SpecificationParameter)null);
				return;
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__RIGHT_SPECIFICATION_PARAMETER:
				setRightSpecificationParameter((SpecificationParameter)null);
				return;
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__LEFT_INTERFACES:
				getLeftInterfaces().clear();
				return;
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__RIGHT_INTERFACES:
				getRightInterfaces().clear();
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
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__LEFT_SPECIFICATION_PARAMETER:
				return leftSpecificationParameter != null;
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__RIGHT_SPECIFICATION_PARAMETER:
				return rightSpecificationParameter != null;
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__LEFT_INTERFACES:
				return leftInterfaces != null && !leftInterfaces.isEmpty();
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION__RIGHT_INTERFACES:
				return rightInterfaces != null && !rightInterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificationParameterEquationImpl
