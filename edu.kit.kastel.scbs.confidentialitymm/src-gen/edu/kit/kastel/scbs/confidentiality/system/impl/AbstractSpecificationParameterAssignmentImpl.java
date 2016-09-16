/**
 */
package edu.kit.kastel.scbs.confidentiality.system.impl;

import edu.kit.kastel.scbs.confidentiality.data.SpecificationParameter;

import edu.kit.kastel.scbs.confidentiality.impl.IdentifiedElementImpl;

import edu.kit.kastel.scbs.confidentiality.system.AbstractSpecificationParameterAssignment;
import edu.kit.kastel.scbs.confidentiality.system.SystemPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Specification Parameter Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.impl.AbstractSpecificationParameterAssignmentImpl#getSpecificationParametersToReplace <em>Specification Parameters To Replace</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractSpecificationParameterAssignmentImpl extends IdentifiedElementImpl implements AbstractSpecificationParameterAssignment {
	/**
	 * The cached value of the '{@link #getSpecificationParametersToReplace() <em>Specification Parameters To Replace</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationParametersToReplace()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificationParameter> specificationParametersToReplace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSpecificationParameterAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificationParameter> getSpecificationParametersToReplace() {
		if (specificationParametersToReplace == null) {
			specificationParametersToReplace = new EObjectResolvingEList<SpecificationParameter>(SpecificationParameter.class, this, SystemPackage.ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT__SPECIFICATION_PARAMETERS_TO_REPLACE);
		}
		return specificationParametersToReplace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT__SPECIFICATION_PARAMETERS_TO_REPLACE:
				return getSpecificationParametersToReplace();
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
			case SystemPackage.ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT__SPECIFICATION_PARAMETERS_TO_REPLACE:
				getSpecificationParametersToReplace().clear();
				getSpecificationParametersToReplace().addAll((Collection<? extends SpecificationParameter>)newValue);
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
			case SystemPackage.ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT__SPECIFICATION_PARAMETERS_TO_REPLACE:
				getSpecificationParametersToReplace().clear();
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
			case SystemPackage.ABSTRACT_SPECIFICATION_PARAMETER_ASSIGNMENT__SPECIFICATION_PARAMETERS_TO_REPLACE:
				return specificationParametersToReplace != null && !specificationParametersToReplace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractSpecificationParameterAssignmentImpl
