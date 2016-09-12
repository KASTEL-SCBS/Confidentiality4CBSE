/**
 */
package edu.kit.kastel.scbs.confidentiality.system.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

import tools.vitruv.framework.util.bridges.CollectionBridge;
import edu.kit.kastel.scbs.confidentiality.NamedElement;
import edu.kit.kastel.scbs.confidentiality.provider.ConfidentialityEditPlugin;
import edu.kit.kastel.scbs.confidentiality.provider.IdentifiedElementItemProvider;
import edu.kit.kastel.scbs.confidentiality.system.AbstractDataParameterSubstitution;
import edu.kit.kastel.scbs.confidentiality.system.SystemPackage;

/**
 * This is the item provider adapter for a {@link edu.kit.kastel.scbs.confidentiality.system.AbstractDataParameterSubstitution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractDataParameterSubstitutionItemProvider extends IdentifiedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractDataParameterSubstitutionItemProvider(AdapterFactory adapterFactory) {
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

			addDataParametersToReplacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data Parameters To Replace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataParametersToReplacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractDataParameterSubstitution_dataParametersToReplace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractDataParameterSubstitution_dataParametersToReplace_feature", "_UI_AbstractDataParameterSubstitution_type"),
				 SystemPackage.Literals.ABSTRACT_DATA_PARAMETER_SUBSTITUTION__DATA_PARAMETERS_TO_REPLACE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractDataParameterSubstitution)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractDataParameterSubstitution_type") :
			getString("_UI_AbstractDataParameterSubstitution_type") + " " + label;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected String getAbstractLabel(AbstractDataParameterSubstitution adps) {
		Function1<NamedElement, String> toName = new Function1<NamedElement, String>() {
			@Override
			public String apply(NamedElement n) {
				return n.getName();
			}
		};
		String label = "";
		label += CollectionBridge.toStringWithSeparator(adps.getDataParametersToReplace(), ", ", toName);
		label += " <- ";
		return label;
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ConfidentialityEditPlugin.INSTANCE;
	}

}
