/**
 */
package edu.kit.kastel.scbs.confidentiality.system.impl;

import edu.kit.kastel.scbs.confidentiality.data.DataParameter;

import edu.kit.kastel.scbs.confidentiality.impl.IdentifiedElementImpl;

import edu.kit.kastel.scbs.confidentiality.system.AbstractDataParameterSubstitution;
import edu.kit.kastel.scbs.confidentiality.system.SystemPackage;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Data Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.impl.AbstractDataParameterSubstitutionImpl#getDataParametersToReplace <em>Data Parameters To Replace</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractDataParameterSubstitutionImpl extends IdentifiedElementImpl implements AbstractDataParameterSubstitution {
	/**
	 * The cached value of the '{@link #getDataParametersToReplace() <em>Data Parameters To Replace</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataParametersToReplace()
	 * @generated
	 * @ordered
	 */
	protected EList<DataParameter> dataParametersToReplace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractDataParameterSubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.ABSTRACT_DATA_PARAMETER_SUBSTITUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataParameter> getDataParametersToReplace() {
		if (dataParametersToReplace == null) {
			dataParametersToReplace = new EObjectResolvingEList<DataParameter>(DataParameter.class, this, SystemPackage.ABSTRACT_DATA_PARAMETER_SUBSTITUTION__DATA_PARAMETERS_TO_REPLACE);
		}
		return dataParametersToReplace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.ABSTRACT_DATA_PARAMETER_SUBSTITUTION__DATA_PARAMETERS_TO_REPLACE:
				return getDataParametersToReplace();
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
			case SystemPackage.ABSTRACT_DATA_PARAMETER_SUBSTITUTION__DATA_PARAMETERS_TO_REPLACE:
				getDataParametersToReplace().clear();
				getDataParametersToReplace().addAll((Collection<? extends DataParameter>)newValue);
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
			case SystemPackage.ABSTRACT_DATA_PARAMETER_SUBSTITUTION__DATA_PARAMETERS_TO_REPLACE:
				getDataParametersToReplace().clear();
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
			case SystemPackage.ABSTRACT_DATA_PARAMETER_SUBSTITUTION__DATA_PARAMETERS_TO_REPLACE:
				return dataParametersToReplace != null && !dataParametersToReplace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractDataParameterSubstitutionImpl
