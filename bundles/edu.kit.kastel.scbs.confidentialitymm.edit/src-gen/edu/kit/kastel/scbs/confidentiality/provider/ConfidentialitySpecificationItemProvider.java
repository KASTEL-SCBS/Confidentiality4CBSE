/**
 */
package edu.kit.kastel.scbs.confidentiality.provider;


import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;
import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;

import edu.kit.kastel.scbs.confidentiality.data.DataFactory;

import edu.kit.kastel.scbs.confidentiality.repository.RepositoryFactory;

import edu.kit.kastel.scbs.confidentiality.resources.ResourcesFactory;

import edu.kit.kastel.scbs.confidentiality.system.SystemFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfidentialitySpecificationItemProvider extends IdentifiedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialitySpecificationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 ConfidentialityPackage.Literals.NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER);
			childrenFeatures.add(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__DATA_SET_MAPS);
			childrenFeatures.add(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__PARAMETERS_AND_DATA_PAIRS);
			childrenFeatures.add(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__ADDED_SERVICE_PARAMETERS);
			childrenFeatures.add(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_ASSIGNMENTS);
			childrenFeatures.add(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_EQUATIONS);
			childrenFeatures.add(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__LOCATIONS);
			childrenFeatures.add(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__TAMPER_PROTECTIONS);
			childrenFeatures.add(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ConfidentialitySpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConfidentialitySpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ConfidentialitySpecification)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ConfidentialitySpecification_type") :
			getString("_UI_ConfidentialitySpecification_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ConfidentialitySpecification.class)) {
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER:
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__DATA_SET_MAPS:
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__PARAMETERS_AND_DATA_PAIRS:
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__ADDED_SERVICE_PARAMETERS:
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_ASSIGNMENTS:
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_EQUATIONS:
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__LOCATIONS:
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__TAMPER_PROTECTIONS:
			case ConfidentialityPackage.CONFIDENTIALITY_SPECIFICATION__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER,
				 DataFactory.eINSTANCE.createDataSet()));

		newChildDescriptors.add
			(createChildParameter
				(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER,
				 DataFactory.eINSTANCE.createSpecificationParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER,
				 DataFactory.eINSTANCE.createDataSetMapEntry()));

		newChildDescriptors.add
			(createChildParameter
				(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER,
				 DataFactory.eINSTANCE.createParameterizedDataSetMapEntry()));

		newChildDescriptors.add
			(createChildParameter
				(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__DATA_SET_MAPS,
				 DataFactory.eINSTANCE.createDataSetMap()));

		newChildDescriptors.add
			(createChildParameter
				(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__PARAMETERS_AND_DATA_PAIRS,
				 RepositoryFactory.eINSTANCE.createParametersAndDataPair()));

		newChildDescriptors.add
			(createChildParameter
				(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__ADDED_SERVICE_PARAMETERS,
				 RepositoryFactory.eINSTANCE.createAddedServiceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_ASSIGNMENTS,
				 SystemFactory.eINSTANCE.createSpecificationParameter2DataSetAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_ASSIGNMENTS,
				 SystemFactory.eINSTANCE.createDataSetMapParameter2KeyAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_EQUATIONS,
				 SystemFactory.eINSTANCE.createSpecificationParameterEquation()));

		newChildDescriptors.add
			(createChildParameter
				(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__LOCATIONS,
				 ResourcesFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__TAMPER_PROTECTIONS,
				 ResourcesFactory.eINSTANCE.createTamperProtection()));

		newChildDescriptors.add
			(createChildParameter
				(ConfidentialityPackage.Literals.CONFIDENTIALITY_SPECIFICATION__LOCATIONS_AND_TAMPER_PROTECTIONS_PAIRS,
				 ResourcesFactory.eINSTANCE.createLocationsAndTamperProtectionsPair()));
	}

}
