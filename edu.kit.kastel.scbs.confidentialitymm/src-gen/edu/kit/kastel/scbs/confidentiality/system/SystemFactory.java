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
	 * Returns a new object of class '<em>Specification Parameter2 Data Set Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification Parameter2 Data Set Assignment</em>'.
	 * @generated
	 */
	SpecificationParameter2DataSetAssignment createSpecificationParameter2DataSetAssignment();

	/**
	 * Returns a new object of class '<em>Data Set Map Parameter2 Key Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Set Map Parameter2 Key Assignment</em>'.
	 * @generated
	 */
	DataSetMapParameter2KeyAssignment createDataSetMapParameter2KeyAssignment();

	/**
	 * Returns a new object of class '<em>Specification Parameter Equation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification Parameter Equation</em>'.
	 * @generated
	 */
	SpecificationParameterEquation createSpecificationParameterEquation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SystemPackage getSystemPackage();

} //SystemFactory
