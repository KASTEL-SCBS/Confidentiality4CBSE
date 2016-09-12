/**
 */
package edu.kit.kastel.scbs.confidentiality.system;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.scbs.confidentiality.system.SystemPackage
 * @generated
 */
public interface SystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemFactory eINSTANCE = edu.kit.kastel.scbs.confidentiality.system.impl.SystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Parameter2 Data Set Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Parameter2 Data Set Substitution</em>'.
	 * @generated
	 */
	DataParameter2DataSetSubstitution createDataParameter2DataSetSubstitution();

	/**
	 * Returns a new object of class '<em>Data Set Map Parameter2 Key Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Set Map Parameter2 Key Substitution</em>'.
	 * @generated
	 */
	DataSetMapParameter2KeySubstitution createDataSetMapParameter2KeySubstitution();

	/**
	 * Returns a new object of class '<em>Data Parameter Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Parameter Usage</em>'.
	 * @generated
	 */
	DataParameterUsage createDataParameterUsage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SystemPackage getSystemPackage();

} //SystemFactory
