/**
 */
package edu.kit.kastel.scbs.confidentiality.resources.impl;

import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;
import edu.kit.kastel.scbs.confidentiality.NamedElement;

import edu.kit.kastel.scbs.confidentiality.impl.IdentifiedElementImpl;

import edu.kit.kastel.scbs.confidentiality.resources.Location;
import edu.kit.kastel.scbs.confidentiality.resources.LocationsAndTamperProtectionsPair;
import edu.kit.kastel.scbs.confidentiality.resources.ResourcesPackage;
import edu.kit.kastel.scbs.confidentiality.resources.TamperProtection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Locations And Tamper Protections Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.resources.impl.LocationsAndTamperProtectionsPairImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.resources.impl.LocationsAndTamperProtectionsPairImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.resources.impl.LocationsAndTamperProtectionsPairImpl#getTamperProtections <em>Tamper Protections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationsAndTamperProtectionsPairImpl extends IdentifiedElementImpl implements LocationsAndTamperProtectionsPair {
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
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getTamperProtections() <em>Tamper Protections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamperProtections()
	 * @generated
	 * @ordered
	 */
	protected EList<TamperProtection> tamperProtections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationsAndTamperProtectionsPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.Literals.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if (this.name == null || this.name.equals("")) {
			Function1<NamedElement, String> toName = new Function1<NamedElement, String>() {
				@Override
				public String apply(NamedElement n) {
					return n.getName();
				}
			};
			String label = "l=[";
			label += IterableExtensions.join(getLocations(), ", ", toName);
			label += "] - t=[";
			label += IterableExtensions.join(getTamperProtections(), ", ", toName);
			label += "]";
			return label;
		}
		return this.name;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectResolvingEList<Location>(Location.class, this, ResourcesPackage.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TamperProtection> getTamperProtections() {
		if (tamperProtections == null) {
			tamperProtections = new EObjectResolvingEList<TamperProtection>(TamperProtection.class, this, ResourcesPackage.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__TAMPER_PROTECTIONS);
		}
		return tamperProtections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__NAME:
				return getName();
			case ResourcesPackage.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__LOCATIONS:
				return getLocations();
			case ResourcesPackage.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__TAMPER_PROTECTIONS:
				return getTamperProtections();
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
			case ResourcesPackage.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__NAME:
				setName((String)newValue);
				return;
			case ResourcesPackage.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case ResourcesPackage.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__TAMPER_PROTECTIONS:
				getTamperProtections().clear();
				getTamperProtections().addAll((Collection<? extends TamperProtection>)newValue);
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
			case ResourcesPackage.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResourcesPackage.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__LOCATIONS:
				getLocations().clear();
				return;
			case ResourcesPackage.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__TAMPER_PROTECTIONS:
				getTamperProtections().clear();
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
			case ResourcesPackage.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResourcesPackage.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case ResourcesPackage.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__TAMPER_PROTECTIONS:
				return tamperProtections != null && !tamperProtections.isEmpty();
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
				case ResourcesPackage.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__NAME: return ConfidentialityPackage.NAMED_ELEMENT__NAME;
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
				case ConfidentialityPackage.NAMED_ELEMENT__NAME: return ResourcesPackage.LOCATIONS_AND_TAMPER_PROTECTIONS_PAIR__NAME;
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

} //LocationsAndTamperProtectionsPairImpl
