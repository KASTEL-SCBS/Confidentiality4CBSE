/**
 */
package edu.kit.kastel.scbs.confidentiality;

import edu.kit.kastel.scbs.confidentiality.data.DataIdentifying;
import edu.kit.kastel.scbs.confidentiality.data.DataSetMap;

import edu.kit.kastel.scbs.confidentiality.repository.AddedFunctionalParameter;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;

import edu.kit.kastel.scbs.confidentiality.resources.Location;
import edu.kit.kastel.scbs.confidentiality.resources.LocationsAndTamperProtectionsPair;
import edu.kit.kastel.scbs.confidentiality.resources.TamperProtection;

import edu.kit.kastel.scbs.confidentiality.system.AbstractDataParameterSubstitution;

import edu.kit.kastel.scbs.confidentiality.system.DataParameterUsage;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getDataIdentifier <em>Data Identifier</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getDataSetMaps <em>Data Set Maps</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getParametersAndDataPairs <em>Parameters And Data Pairs</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getAddedFunctionalParameters <em>Added Functional Parameters</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getDataParameterSubstitutions <em>Data Parameter Substitutions</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getDataParameterUsages <em>Data Parameter Usages</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getLocations <em>Locations</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getTamperProtections <em>Tamper Protections</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification#getLocationsAndTamperProtectionsPairs <em>Locations And Tamper Protections Pairs</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage#getConfidentialitySpecification()
 * @model
 * @generated
 */
public interface ConfidentialitySpecification extends IdentifiedElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Data Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.data.DataIdentifying}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Identifier</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage#getConfidentialitySpecification_DataIdentifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataIdentifying> getDataIdentifier();

	/**
	 * Returns the value of the '<em><b>Data Set Maps</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.data.DataSetMap}.
	 * It is bidirectional and its opposite is '{@link edu.kit.kastel.scbs.confidentiality.data.DataSetMap#getSpecificationContainer <em>Specification Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Set Maps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Maps</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage#getConfidentialitySpecification_DataSetMaps()
	 * @see edu.kit.kastel.scbs.confidentiality.data.DataSetMap#getSpecificationContainer
	 * @model opposite="specificationContainer" containment="true"
	 * @generated
	 */
	EList<DataSetMap> getDataSetMaps();

	/**
	 * Returns the value of the '<em><b>Parameters And Data Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters And Data Pairs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters And Data Pairs</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage#getConfidentialitySpecification_ParametersAndDataPairs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ParametersAndDataPair> getParametersAndDataPairs();

	/**
	 * Returns the value of the '<em><b>Added Functional Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.repository.AddedFunctionalParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Added Functional Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Added Functional Parameters</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage#getConfidentialitySpecification_AddedFunctionalParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<AddedFunctionalParameter> getAddedFunctionalParameters();

	/**
	 * Returns the value of the '<em><b>Data Parameter Substitutions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.system.AbstractDataParameterSubstitution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Parameter Substitutions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Parameter Substitutions</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage#getConfidentialitySpecification_DataParameterSubstitutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractDataParameterSubstitution> getDataParameterSubstitutions();

	/**
	 * Returns the value of the '<em><b>Data Parameter Usages</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.system.DataParameterUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Parameter Usages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Parameter Usages</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage#getConfidentialitySpecification_DataParameterUsages()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataParameterUsage> getDataParameterUsages();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.resources.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage#getConfidentialitySpecification_Locations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Tamper Protections</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.resources.TamperProtection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tamper Protections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tamper Protections</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage#getConfidentialitySpecification_TamperProtections()
	 * @model containment="true"
	 * @generated
	 */
	EList<TamperProtection> getTamperProtections();

	/**
	 * Returns the value of the '<em><b>Locations And Tamper Protections Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.resources.LocationsAndTamperProtectionsPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations And Tamper Protections Pairs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations And Tamper Protections Pairs</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage#getConfidentialitySpecification_LocationsAndTamperProtectionsPairs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LocationsAndTamperProtectionsPair> getLocationsAndTamperProtectionsPairs();

} // ConfidentialitySpecification
