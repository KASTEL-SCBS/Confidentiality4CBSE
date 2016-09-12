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
			case SystemPackage.DATA_PARAMETER2_DATA_SET_SUBSTITUTION: return createDataParameter2DataSetSubstitution();
			case SystemPackage.DATA_SET_MAP_PARAMETER2_KEY_SUBSTITUTION: return createDataSetMapParameter2KeySubstitution();
			case SystemPackage.DATA_PARAMETER_USAGE: return createDataParameterUsage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataParameter2DataSetSubstitution createDataParameter2DataSetSubstitution() {
		DataParameter2DataSetSubstitutionImpl dataParameter2DataSetSubstitution = new DataParameter2DataSetSubstitutionImpl();
		return dataParameter2DataSetSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSetMapParameter2KeySubstitution createDataSetMapParameter2KeySubstitution() {
		DataSetMapParameter2KeySubstitutionImpl dataSetMapParameter2KeySubstitution = new DataSetMapParameter2KeySubstitutionImpl();
		return dataSetMapParameter2KeySubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataParameterUsage createDataParameterUsage() {
		DataParameterUsageImpl dataParameterUsage = new DataParameterUsageImpl();
		return dataParameterUsage;
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
