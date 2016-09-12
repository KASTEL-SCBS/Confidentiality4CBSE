/**
 */
package edu.kit.kastel.scbs.confidentiality.system.provider;


import edu.kit.kastel.scbs.confidentiality.data.DataParameter;
import edu.kit.kastel.scbs.confidentiality.provider.ConfidentialityEditPlugin;
import edu.kit.kastel.scbs.confidentiality.provider.IdentifiedElementItemProvider;
import edu.kit.kastel.scbs.confidentiality.system.DataParameterUsage;
import edu.kit.kastel.scbs.confidentiality.system.SystemPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link edu.kit.kastel.scbs.confidentiality.system.DataParameterUsage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataParameterUsageItemProvider extends IdentifiedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataParameterUsageItemProvider(AdapterFactory adapterFactory) {
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

			addRequiredDataParameterPropertyDescriptor(object);
			addProvidedDataParameterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Required Data Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredDataParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataParameterUsage_requiredDataParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataParameterUsage_requiredDataParameter_feature", "_UI_DataParameterUsage_type"),
				 SystemPackage.Literals.DATA_PARAMETER_USAGE__REQUIRED_DATA_PARAMETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provided Data Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidedDataParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataParameterUsage_providedDataParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataParameterUsage_providedDataParameter_feature", "_UI_DataParameterUsage_type"),
				 SystemPackage.Literals.DATA_PARAMETER_USAGE__PROVIDED_DATA_PARAMETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns DataParameterUsage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataParameterUsage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = getLabel(((DataParameterUsage)object));
		return label == null || label.length() == 0 ?
			getString("_UI_DataParameterUsage_type") :
			getString("_UI_DataParameterUsage_type") + " " + label;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private String getLabel(DataParameterUsage dpu) {
		DataParameter pdp = dpu.getProvidedDataParameter();
		String pdps = "";
		if (pdp != null) {
			pdps = pdp.getName();
		}
		DataParameter rdp = dpu.getRequiredDataParameter();
		String rdps = "";
		if (rdp != null) {
			rdps = rdp.getName();
		}
		return pdps + " -> " + rdps;
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
