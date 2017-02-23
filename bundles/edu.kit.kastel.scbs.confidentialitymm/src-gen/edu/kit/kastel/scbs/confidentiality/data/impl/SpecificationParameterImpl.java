/**
 */
package edu.kit.kastel.scbs.confidentiality.data.impl;

import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;
import edu.kit.kastel.scbs.confidentiality.NamedElement;

import edu.kit.kastel.scbs.confidentiality.data.DataPackage;
import edu.kit.kastel.scbs.confidentiality.data.SpecificationParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.data.impl.SpecificationParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.data.impl.SpecificationParameterImpl#getDefiningServiceParameter <em>Defining Service Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationParameterImpl extends DataIdentifyingImpl implements SpecificationParameter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefiningServiceParameter() <em>Defining Service Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningServiceParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINING_SERVICE_PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefiningServiceParameter() <em>Defining Service Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningServiceParameter()
	 * @generated
	 * @ordered
	 */
	protected String definingServiceParameter = DEFINING_SERVICE_PARAMETER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.SPECIFICATION_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SPECIFICATION_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefiningServiceParameter() {
		return definingServiceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningServiceParameter(String newDefiningServiceParameter) {
		String oldDefiningServiceParameter = definingServiceParameter;
		definingServiceParameter = newDefiningServiceParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SPECIFICATION_PARAMETER__DEFINING_SERVICE_PARAMETER, oldDefiningServiceParameter, definingServiceParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.SPECIFICATION_PARAMETER__NAME:
				return getName();
			case DataPackage.SPECIFICATION_PARAMETER__DEFINING_SERVICE_PARAMETER:
				return getDefiningServiceParameter();
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
			case DataPackage.SPECIFICATION_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case DataPackage.SPECIFICATION_PARAMETER__DEFINING_SERVICE_PARAMETER:
				setDefiningServiceParameter((String)newValue);
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
			case DataPackage.SPECIFICATION_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataPackage.SPECIFICATION_PARAMETER__DEFINING_SERVICE_PARAMETER:
				setDefiningServiceParameter(DEFINING_SERVICE_PARAMETER_EDEFAULT);
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
			case DataPackage.SPECIFICATION_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataPackage.SPECIFICATION_PARAMETER__DEFINING_SERVICE_PARAMETER:
				return DEFINING_SERVICE_PARAMETER_EDEFAULT == null ? definingServiceParameter != null : !DEFINING_SERVICE_PARAMETER_EDEFAULT.equals(definingServiceParameter);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case DataPackage.SPECIFICATION_PARAMETER__NAME: return ConfidentialityPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case ConfidentialityPackage.NAMED_ELEMENT__NAME: return DataPackage.SPECIFICATION_PARAMETER__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", definingServiceParameter: ");
		result.append(definingServiceParameter);
		result.append(')');
		return result.toString();
	}

} //SpecificationParameterImpl
