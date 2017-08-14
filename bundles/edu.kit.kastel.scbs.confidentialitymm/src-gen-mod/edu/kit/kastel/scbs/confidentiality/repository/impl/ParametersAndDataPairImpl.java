/**
 */
package edu.kit.kastel.scbs.confidentiality.repository.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;


import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;
import edu.kit.kastel.scbs.confidentiality.NamedElement;
import edu.kit.kastel.scbs.confidentiality.data.DataIdentifying;
import edu.kit.kastel.scbs.confidentiality.data.ParameterizedDataSetMapEntry;
import edu.kit.kastel.scbs.confidentiality.impl.IdentifiedElementImpl;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.scbs.confidentiality.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters And Data Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.repository.impl.ParametersAndDataPairImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.repository.impl.ParametersAndDataPairImpl#getParameterSources <em>Parameter Sources</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.repository.impl.ParametersAndDataPairImpl#getDataTargets <em>Data Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParametersAndDataPairImpl extends IdentifiedElementImpl implements ParametersAndDataPair {
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
	 * The cached value of the '{@link #getParameterSources() <em>Parameter Sources</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterSources()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameterSources;

	/**
	 * The cached value of the '{@link #getDataTargets() <em>Data Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<DataIdentifying> dataTargets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametersAndDataPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.PARAMETERS_AND_DATA_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if (this.name == null || this.name.equals("")) {
			Function1<DataIdentifying, String> toName = new Function1<DataIdentifying, String>() {
				@Override
				public String apply(DataIdentifying d) {
					if (d instanceof NamedElement) {
						return ((NamedElement) d).getName();
					} else if (d instanceof ParameterizedDataSetMapEntry) {
						ParameterizedDataSetMapEntry pdsmE = ((ParameterizedDataSetMapEntry) d);
						return pdsmE.getMap().getName() + "[" + pdsmE.getParameter().getName() + "]";
					} else {
						return "";
					}
				}
			};
			String label = "";
			for (String parameterSource : getParameterSources()) {
				if (parameterSource.length() > 0) {
					switch (parameterSource.charAt(0)) {
					case '\\':	String substringOne = "";
								String substringTwo = "";
								boolean pastPoint = false;
								for (int i = 1; i < parameterSource.length(); i++) {
									char c = parameterSource.charAt(i);
									if (c == '.') pastPoint = true;
									if (pastPoint) substringTwo += c;
									else substringOne += c;
								}
								label += substringOne.toUpperCase() + substringTwo.toLowerCase();
								break;
					case '*': label += "STAR";
							  break;
					default: label += parameterSource.substring(0, 1).toUpperCase() + parameterSource.substring(1).toLowerCase();

					}
				}
			}
			label += "2";
			for (DataIdentifying dataTarget : getDataTargets()) {
				String dataTargetName = getName(dataTarget);
				if (dataTargetName.length() > 0) {
					label += dataTargetName.substring(0, 1).toUpperCase() + dataTargetName.substring(1).toLowerCase();
				}
			}
			return label.replace(".", "").replace("[*]", "ALL");
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
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.PARAMETERS_AND_DATA_PAIR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParameterSources() {
		if (parameterSources == null) {
			parameterSources = new EDataTypeUniqueEList<String>(String.class, this, RepositoryPackage.PARAMETERS_AND_DATA_PAIR__PARAMETER_SOURCES);
		}
		return parameterSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataIdentifying> getDataTargets() {
		if (dataTargets == null) {
			dataTargets = new EObjectResolvingEList<DataIdentifying>(DataIdentifying.class, this, RepositoryPackage.PARAMETERS_AND_DATA_PAIR__DATA_TARGETS);
		}
		return dataTargets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepositoryPackage.PARAMETERS_AND_DATA_PAIR__NAME:
				return getName();
			case RepositoryPackage.PARAMETERS_AND_DATA_PAIR__PARAMETER_SOURCES:
				return getParameterSources();
			case RepositoryPackage.PARAMETERS_AND_DATA_PAIR__DATA_TARGETS:
				return getDataTargets();
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
			case RepositoryPackage.PARAMETERS_AND_DATA_PAIR__NAME:
				setName((String)newValue);
				return;
			case RepositoryPackage.PARAMETERS_AND_DATA_PAIR__PARAMETER_SOURCES:
				getParameterSources().clear();
				getParameterSources().addAll((Collection<? extends String>)newValue);
				return;
			case RepositoryPackage.PARAMETERS_AND_DATA_PAIR__DATA_TARGETS:
				getDataTargets().clear();
				getDataTargets().addAll((Collection<? extends DataIdentifying>)newValue);
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
			case RepositoryPackage.PARAMETERS_AND_DATA_PAIR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RepositoryPackage.PARAMETERS_AND_DATA_PAIR__PARAMETER_SOURCES:
				getParameterSources().clear();
				return;
			case RepositoryPackage.PARAMETERS_AND_DATA_PAIR__DATA_TARGETS:
				getDataTargets().clear();
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
			case RepositoryPackage.PARAMETERS_AND_DATA_PAIR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RepositoryPackage.PARAMETERS_AND_DATA_PAIR__PARAMETER_SOURCES:
				return parameterSources != null && !parameterSources.isEmpty();
			case RepositoryPackage.PARAMETERS_AND_DATA_PAIR__DATA_TARGETS:
				return dataTargets != null && !dataTargets.isEmpty();
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
				case RepositoryPackage.PARAMETERS_AND_DATA_PAIR__NAME: return ConfidentialityPackage.NAMED_ELEMENT__NAME;
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
				case ConfidentialityPackage.NAMED_ELEMENT__NAME: return RepositoryPackage.PARAMETERS_AND_DATA_PAIR__NAME;
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
		result.append(", parameterSources: ");
		result.append(parameterSources);
		result.append(')');
		return result.toString();
	}
	
	public String getName(DataIdentifying dataIdentifying) {
		if (dataIdentifying instanceof NamedElement) {
			return ((NamedElement) dataIdentifying).getName();
		} else if (dataIdentifying instanceof ParameterizedDataSetMapEntry) {
			ParameterizedDataSetMapEntry pdsmE = ((ParameterizedDataSetMapEntry) dataIdentifying);
			return 	StringExtensions.toFirstUpper(pdsmE.getMap().getName().toLowerCase()) + StringExtensions.toFirstUpper(pdsmE.getParameter().getName().toLowerCase());
		} else {
			return "";
		}
	}
	

} //ParametersAndDataPairImpl
