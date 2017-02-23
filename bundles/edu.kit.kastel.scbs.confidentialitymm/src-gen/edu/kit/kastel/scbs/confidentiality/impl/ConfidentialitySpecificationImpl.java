/**
 */
package edu.kit.kastel.scbs.confidentiality.impl;

import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;
import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.NamedElement;

import edu.kit.kastel.scbs.confidentiality.data.DataIdentifying;
import edu.kit.kastel.scbs.confidentiality.data.DataPackage;
import edu.kit.kastel.scbs.confidentiality.data.DataSetMap;

import edu.kit.kastel.scbs.confidentiality.repository.AddedServiceParameter;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;

import edu.kit.kastel.scbs.confidentiality.resources.Location;
import edu.kit.kastel.scbs.confidentiality.resources.LocationsAndTamperProtectionsPair;
import edu.kit.kastel.scbs.confidentiality.resources.TamperProtection;

import edu.kit.kastel.scbs.confidentiality.system.AbstractSpecificationParameterAssignment;
import edu.kit.kastel.scbs.confidentiality.system.SpecificationParameterEquation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.impl.ConfidentialitySpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.impl.ConfidentialitySpecificationImpl#getDataIdentifier <em>Data Identifier</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.impl.ConfidentialitySpecificationImpl#getDataSetMaps <em>Data Set Maps</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.impl.ConfidentialitySpecificationImpl#getParametersAndDataPairs <em>Parameters And Data Pairs</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.impl.ConfidentialitySpecificationImpl#getAddedServiceParameters <em>Added Service Parameters</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.impl.ConfidentialitySpecificationImpl#getSpecificationParameterAssignments <em>Specification Parameter Assignments</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.impl.ConfidentialitySpecificationImpl#getSpecificationParameterEquations <em>Specification Parameter Equations</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.impl.ConfidentialitySpecificationImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.impl.ConfidentialitySpecificationImpl#getTamperProtections <em>Tamper Protections</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.impl.ConfidentialitySpecificationImpl#getLocationsAndTamperProtectionsPairs <em>Locations And Tamper Protections Pairs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfidentialitySpecificationImpl extends IdentifiedElementImpl implements ConfidentialitySpecification {
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
	 * The cached value of the '{@link #getDataIdentifier() <em>Data Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<DataIdentifying> dataIdentifier;

	/**
	 * The cached value of the '{@link #getDataSetMaps() <em>Data Set Maps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetMaps()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSetMap> dataSetMaps;

	/**
	 * The cached value of the '{@link #getParametersAndDataPairs() <em>Parameters And Data Pairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametersAndDataPairs()
	 * @generated
	 * @ordered
	 */
	protected EList<ParametersAndDataPair> parametersAndDataPairs;

	/**
	 * The cached value of the '{@link #getAddedServiceParameters() <em>Added Service Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddedServiceParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<AddedServiceParameter> addedServiceParameters;

	/**
	 * The cached value of the '{@link #getSpecificationParameterAssignments() <em>Specification Parameter Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationParameterAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractSpecificationParameterAssignment> specificationParameterAssignments;

	/**
	 * The cached value of the '{@link #getSpecificationParameterEquations() <em>Specification Parameter Equations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationParameterEquations()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificationParameterEquation> specificationParameterEquations;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getTamperProtections() <em>Tamper Protections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamperProtections()
	 * @generated
	 * @ordered
	 */
	protected EList<TamperProtection> tamperProtections;

	/**
	 * The cached value of the '{@link #getLocationsAndTamperProtectionsPairs() <em>Locations And Tamper Protections Pairs</em>}' containment reference list.
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
	protected ConfidentialitySpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataIdentifying> getDataIdentifier() {
		if (dataIdentifier == null) {
			dataIdentifier = new EObjectContainmentEList<DataIdentifying>(DataIdentifying.class, this, ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER);
		}
		return dataIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSetMap> getDataSetMaps() {
		if (dataSetMaps == null) {
			dataSetMaps = new EObjectContainmentWithInverseEList<DataSetMap>(DataSetMap.class, this, ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__DATA_SET_MAPS, DataPackage.DATA_SET_MAP__SPECIFICATION_CONTAINER);
		}
		return dataSetMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParametersAndDataPair> getParametersAndDataPairs() {
		if (parametersAndDataPairs == null) {
			parametersAndDataPairs = new EObjectContainmentEList<ParametersAndDataPair>(ParametersAndDataPair.class, this, ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__PARAMETERS_AND_DATA_PAIRS);
		}
		return parametersAndDataPairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddedServiceParameter> getAddedServiceParameters() {
		if (addedServiceParameters == null) {
			addedServiceParameters = new EObjectContainmentEList<AddedServiceParameter>(AddedServiceParameter.class, this, ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__ADDED_SERVICE_PARAMETERS);
		}
		return addedServiceParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractSpecificationParameterAssignment> getSpecificationParameterAssignments() {
		if (specificationParameterAssignments == null) {
			specificationParameterAssignments = new EObjectContainmentEList<AbstractSpecificationParameterAssignment>(AbstractSpecificationParameterAssignment.class, this, ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_ASSIGNMENTS);
		}
		return specificationParameterAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificationParameterEquation> getSpecificationParameterEquations() {
		if (specificationParameterEquations == null) {
			specificationParameterEquations = new EObjectContainmentEList<SpecificationParameterEquation>(SpecificationParameterEquation.class, this, ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_EQUATIONS);
		}
		return specificationParameterEquations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this, ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__LOCATIONS);
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
			tamperProtections = new EObjectContainmentEList<TamperProtection>(TamperProtection.class, this, ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__TAMPER_PROTECTIONS);
		}
		return tamperProtections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationsAndTamperProtectionsPair> getLocationsAndTamperProtectionsPairs() {
		if (locationsAndTamperProtectionsPairs == null) {
			locationsAndTamperProtectionsPairs = new EObjectContainmentEList<LocationsAndTamperProtectionsPair>(LocationsAndTamperProtectionsPair.class, this, ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS);
		}
		return locationsAndTamperProtectionsPairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__DATA_SET_MAPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataSetMaps()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER:
				return ((InternalEList<?>)getDataIdentifier()).basicRemove(otherEnd, msgs);
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__DATA_SET_MAPS:
				return ((InternalEList<?>)getDataSetMaps()).basicRemove(otherEnd, msgs);
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__PARAMETERS_AND_DATA_PAIRS:
				return ((InternalEList<?>)getParametersAndDataPairs()).basicRemove(otherEnd, msgs);
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__ADDED_SERVICE_PARAMETERS:
				return ((InternalEList<?>)getAddedServiceParameters()).basicRemove(otherEnd, msgs);
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_ASSIGNMENTS:
				return ((InternalEList<?>)getSpecificationParameterAssignments()).basicRemove(otherEnd, msgs);
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_EQUATIONS:
				return ((InternalEList<?>)getSpecificationParameterEquations()).basicRemove(otherEnd, msgs);
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__TAMPER_PROTECTIONS:
				return ((InternalEList<?>)getTamperProtections()).basicRemove(otherEnd, msgs);
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS:
				return ((InternalEList<?>)getLocationsAndTamperProtectionsPairs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__NAME:
				return getName();
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER:
				return getDataIdentifier();
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__DATA_SET_MAPS:
				return getDataSetMaps();
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__PARAMETERS_AND_DATA_PAIRS:
				return getParametersAndDataPairs();
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__ADDED_SERVICE_PARAMETERS:
				return getAddedServiceParameters();
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_ASSIGNMENTS:
				return getSpecificationParameterAssignments();
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_EQUATIONS:
				return getSpecificationParameterEquations();
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__LOCATIONS:
				return getLocations();
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__TAMPER_PROTECTIONS:
				return getTamperProtections();
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS:
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
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER:
				getDataIdentifier().clear();
				getDataIdentifier().addAll((Collection<? extends DataIdentifying>)newValue);
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__DATA_SET_MAPS:
				getDataSetMaps().clear();
				getDataSetMaps().addAll((Collection<? extends DataSetMap>)newValue);
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__PARAMETERS_AND_DATA_PAIRS:
				getParametersAndDataPairs().clear();
				getParametersAndDataPairs().addAll((Collection<? extends ParametersAndDataPair>)newValue);
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__ADDED_SERVICE_PARAMETERS:
				getAddedServiceParameters().clear();
				getAddedServiceParameters().addAll((Collection<? extends AddedServiceParameter>)newValue);
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_ASSIGNMENTS:
				getSpecificationParameterAssignments().clear();
				getSpecificationParameterAssignments().addAll((Collection<? extends AbstractSpecificationParameterAssignment>)newValue);
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_EQUATIONS:
				getSpecificationParameterEquations().clear();
				getSpecificationParameterEquations().addAll((Collection<? extends SpecificationParameterEquation>)newValue);
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__TAMPER_PROTECTIONS:
				getTamperProtections().clear();
				getTamperProtections().addAll((Collection<? extends TamperProtection>)newValue);
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS:
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
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER:
				getDataIdentifier().clear();
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__DATA_SET_MAPS:
				getDataSetMaps().clear();
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__PARAMETERS_AND_DATA_PAIRS:
				getParametersAndDataPairs().clear();
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__ADDED_SERVICE_PARAMETERS:
				getAddedServiceParameters().clear();
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_ASSIGNMENTS:
				getSpecificationParameterAssignments().clear();
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_EQUATIONS:
				getSpecificationParameterEquations().clear();
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__LOCATIONS:
				getLocations().clear();
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__TAMPER_PROTECTIONS:
				getTamperProtections().clear();
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS:
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
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER:
				return dataIdentifier != null && !dataIdentifier.isEmpty();
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__DATA_SET_MAPS:
				return dataSetMaps != null && !dataSetMaps.isEmpty();
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__PARAMETERS_AND_DATA_PAIRS:
				return parametersAndDataPairs != null && !parametersAndDataPairs.isEmpty();
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__ADDED_SERVICE_PARAMETERS:
				return addedServiceParameters != null && !addedServiceParameters.isEmpty();
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_ASSIGNMENTS:
				return specificationParameterAssignments != null && !specificationParameterAssignments.isEmpty();
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_EQUATIONS:
				return specificationParameterEquations != null && !specificationParameterEquations.isEmpty();
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__TAMPER_PROTECTIONS:
				return tamperProtections != null && !tamperProtections.isEmpty();
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS:
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
				case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__NAME: return ConfidentialityPackage.NAMED_ELEMENT__NAME;
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
				case ConfidentialityPackage.NAMED_ELEMENT__NAME: return ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__NAME;
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

} //ConfidentialitySpecificationImpl
