/**
 */
package edu.kit.kastel.scbs.confidentiality.repository;

import edu.kit.kastel.scbs.confidentiality.IdentifiedElement;
import edu.kit.kastel.scbs.confidentiality.NamedElement;

import edu.kit.kastel.scbs.confidentiality.data.DataIdentifying;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters And Data Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair#getParameterSources <em>Parameter Sources</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair#getDataTargets <em>Data Targets</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.confidentiality.repository.RepositoryPackage#getParametersAndDataPair()
 * @model
 * @generated
 */
public interface ParametersAndDataPair extends IdentifiedElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameter Sources</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Sources</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Sources</em>' attribute list.
	 * @see edu.kit.kastel.scbs.confidentiality.repository.RepositoryPackage#getParametersAndDataPair_ParameterSources()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getParameterSources();

	/**
	 * Returns the value of the '<em><b>Data Targets</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.data.DataIdentifying}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Targets</em>' reference list.
	 * @see edu.kit.kastel.scbs.confidentiality.repository.RepositoryPackage#getParametersAndDataPair_DataTargets()
	 * @model required="true"
	 * @generated
	 */
	EList<DataIdentifying> getDataTargets();

} // ParametersAndDataPair
