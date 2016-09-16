/**
 */
package edu.kit.kastel.scbs.confidentiality.data;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.scbs.confidentiality.data.DataPackage
 * @generated
 */
public interface DataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataFactory eINSTANCE = edu.kit.kastel.scbs.confidentiality.data.impl.DataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set</em>'.
	 * @generated
	 */
	DataSet createDataSet();

	/**
	 * Returns a new object of class '<em>Set Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Map</em>'.
	 * @generated
	 */
	DataSetMap createDataSetMap();

	/**
	 * Returns a new object of class '<em>Specification Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification Parameter</em>'.
	 * @generated
	 */
	SpecificationParameter createSpecificationParameter();

	/**
	 * Returns a new object of class '<em>Set Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Map Entry</em>'.
	 * @generated
	 */
	DataSetMapEntry createDataSetMapEntry();

	/**
	 * Returns a new object of class '<em>Parameterized Data Set Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameterized Data Set Map Entry</em>'.
	 * @generated
	 */
	ParameterizedDataSetMapEntry createParameterizedDataSetMapEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataPackage getDataPackage();

} //DataFactory
