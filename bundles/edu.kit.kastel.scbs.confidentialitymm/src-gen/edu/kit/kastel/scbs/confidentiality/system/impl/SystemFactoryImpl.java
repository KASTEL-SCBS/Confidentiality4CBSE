/**
 */
package edu.kit.kastel.scbs.confidentiality.system.impl;

import edu.kit.kastel.scbs.confidentiality.system.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemFactoryImpl extends EFactoryImpl implements SystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemFactory init() {
		try {
			SystemFactory theSystemFactory = (SystemFactory)EPackage.Registry.INSTANCE.getEFactory(SystemPackage.eNS_URI);
			if (theSystemFactory != null) {
				return theSystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SystemPackage.SPECIFICATION_PARAMETER2_DATA_SET_ASSIGNMENT: return createSpecificationParameter2DataSetAssignment();
			case SystemPackage.DATA_SET_MAP_PARAMETER2_KEY_ASSIGNMENT: return createDataSetMapParameter2KeyAssignment();
			case SystemPackage.SPECIFICATION_PARAMETER_EQUATION: return createSpecificationParameterEquation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationParameter2DataSetAssignment createSpecificationParameter2DataSetAssignment() {
		SpecificationParameter2DataSetAssignmentImpl specificationParameter2DataSetAssignment = new SpecificationParameter2DataSetAssignmentImpl();
		return specificationParameter2DataSetAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetMapParameter2KeyAssignment createDataSetMapParameter2KeyAssignment() {
		DataSetMapParameter2KeyAssignmentImpl dataSetMapParameter2KeyAssignment = new DataSetMapParameter2KeyAssignmentImpl();
		return dataSetMapParameter2KeyAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationParameterEquation createSpecificationParameterEquation() {
		SpecificationParameterEquationImpl specificationParameterEquation = new SpecificationParameterEquationImpl();
		return specificationParameterEquation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemPackage getSystemPackage() {
		return (SystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SystemPackage getPackage() {
		return SystemPackage.eINSTANCE;
	}

} //SystemFactoryImpl
