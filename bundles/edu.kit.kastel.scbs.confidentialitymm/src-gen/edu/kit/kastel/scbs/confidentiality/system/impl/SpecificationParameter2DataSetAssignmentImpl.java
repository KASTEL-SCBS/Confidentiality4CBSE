/**
 */
package edu.kit.kastel.scbs.confidentiality.system.impl;

import edu.kit.kastel.scbs.confidentiality.data.DataSet;

import edu.kit.kastel.scbs.confidentiality.system.SpecificationParameter2DataSetAssignment;
import edu.kit.kastel.scbs.confidentiality.system.SystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification Parameter2 Data Set Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.system.impl.SpecificationParameter2DataSetAssignmentImpl#getAssignedDataSet <em>Assigned Data Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationParameter2DataSetAssignmentImpl extends AbstractSpecificationParameterAssignmentImpl implements SpecificationParameter2DataSetAssignment {
	/**
	 * The cached value of the '{@link #getAssignedDataSet() <em>Assigned Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedDataSet()
	 * @generated
	 * @ordered
	 */
	protected DataSet assignedDataSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationParameter2DataSetAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet getAssignedDataSet() {
		if (assignedDataSet != null && assignedDataSet.eIsProxy()) {
			InternalEObject oldAssignedDataSet = (InternalEObject)assignedDataSet;
			assignedDataSet = (DataSet)eResolveProxy(oldAssignedDataSet);
			if (assignedDataSet != oldAssignedDataSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT__ASSIGNED_DATA_SET, oldAssignedDataSet, assignedDataSet));
			}
		}
		return assignedDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet basicGetAssignedDataSet() {
		return assignedDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedDataSet(DataSet newAssignedDataSet) {
		DataSet oldAssignedDataSet = assignedDataSet;
		assignedDataSet = newAssignedDataSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT__ASSIGNED_DATA_SET, oldAssignedDataSet, assignedDataSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT__ASSIGNED_DATA_SET:
				if (resolve) return getAssignedDataSet();
				return basicGetAssignedDataSet();
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
			case SystemPackage.SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT__ASSIGNED_DATA_SET:
				setAssignedDataSet((DataSet)newValue);
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
			case SystemPackage.SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT__ASSIGNED_DATA_SET:
				setAssignedDataSet((DataSet)null);
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
			case SystemPackage.SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT__ASSIGNED_DATA_SET:
				return assignedDataSet != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecificationParameter2DataSetAssignmentImpl
