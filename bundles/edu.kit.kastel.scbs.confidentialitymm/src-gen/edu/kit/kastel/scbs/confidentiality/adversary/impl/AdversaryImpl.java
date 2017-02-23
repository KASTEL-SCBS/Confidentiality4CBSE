/**
 */
package edu.kit.kastel.scbs.confidentiality.adversary.impl;

import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;
import edu.kit.kastel.scbs.confidentiality.NamedElement;

import edu.kit.kastel.scbs.confidentiality.adversary.Adversary;
import edu.kit.kastel.scbs.confidentiality.adversary.AdversaryPackage;

import edu.kit.kastel.scbs.confidentiality.data.UnparameterizedDataIdentifying;

import edu.kit.kastel.scbs.confidentiality.impl.IdentifiedElementImpl;

import edu.kit.kastel.scbs.confidentiality.resources.LocationsAndTamperProtectionsPair;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adversary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversaryImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversaryImpl#getMayKnowData <em>May Know Data</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.adversary.impl.AdversaryImpl#getLocationsAndTamperProtectionsPairs <em>Locations And Tamper Protections Pairs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdversaryImpl extends IdentifiedElementImpl implements Adversary {
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
	 * The cached value of the '{@link #getMayKnowData() <em>May Know Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMayKnowData()
	 * @generated
	 * @ordered
	 */
	protected EList<UnparameterizedDataIdentifying> mayKnowData;

	/**
	 * The cached value of the '{@link #getLocationsAndTamperProtectionsPairs() <em>Locations And Tamper Protections Pairs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationsAndTamperProtectionsPairs()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationsAndTamperProtectionsPair> locationsAndTamperProtectionsPairs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdversaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdversaryPackage.Literals.ADVERSARY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdversaryPackage.ADVERSARY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnparameterizedDataIdentifying> getMayKnowData() {
		if (mayKnowData == null) {
			mayKnowData = new EObjectResolvingEList<UnparameterizedDataIdentifying>(UnparameterizedDataIdentifying.class, this, AdversaryPackage.ADVERSARY__MAY_KNOW_DATA);
		}
		return mayKnowData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationsAndTamperProtectionsPair> getLocationsAndTamperProtectionsPairs() {
		if (locationsAndTamperProtectionsPairs == null) {
			locationsAndTamperProtectionsPairs = new EObjectResolvingEList<LocationsAndTamperProtectionsPair>(LocationsAndTamperProtectionsPair.class, this, AdversaryPackage.ADVERSARY__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS);
		}
		return locationsAndTamperProtectionsPairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdversaryPackage.ADVERSARY__NAME:
				return getName();
			case AdversaryPackage.ADVERSARY__MAY_KNOW_DATA:
				return getMayKnowData();
			case AdversaryPackage.ADVERSARY__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS:
				return getLocationsAndTamperProtectionsPairs();
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
			case AdversaryPackage.ADVERSARY__NAME:
				setName((String)newValue);
				return;
			case AdversaryPackage.ADVERSARY__MAY_KNOW_DATA:
				getMayKnowData().clear();
				getMayKnowData().addAll((Collection<? extends UnparameterizedDataIdentifying>)newValue);
				return;
			case AdversaryPackage.ADVERSARY__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS:
				getLocationsAndTamperProtectionsPairs().clear();
				getLocationsAndTamperProtectionsPairs().addAll((Collection<? extends LocationsAndTamperProtectionsPair>)newValue);
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
			case AdversaryPackage.ADVERSARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AdversaryPackage.ADVERSARY__MAY_KNOW_DATA:
				getMayKnowData().clear();
				return;
			case AdversaryPackage.ADVERSARY__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS:
				getLocationsAndTamperProtectionsPairs().clear();
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
			case AdversaryPackage.ADVERSARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AdversaryPackage.ADVERSARY__MAY_KNOW_DATA:
				return mayKnowData != null && !mayKnowData.isEmpty();
			case AdversaryPackage.ADVERSARY__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS:
				return locationsAndTamperProtectionsPairs != null && !locationsAndTamperProtectionsPairs.isEmpty();
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
				case AdversaryPackage.ADVERSARY__NAME: return ConfidentialityPackage.NAMED_ELEMENT__NAME;
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
				case ConfidentialityPackage.NAMED_ELEMENT__NAME: return AdversaryPackage.ADVERSARY__NAME;
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
		result.append(')');
		return result.toString();
	}

} //AdversaryImpl
