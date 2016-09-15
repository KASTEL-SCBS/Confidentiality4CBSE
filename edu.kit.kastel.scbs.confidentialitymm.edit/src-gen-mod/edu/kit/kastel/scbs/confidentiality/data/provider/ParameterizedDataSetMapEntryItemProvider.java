/**
 */
package edu.kit.kastel.scbs.confidentiality.data.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import edu.kit.kastel.scbs.confidentiality.data.DataPackage;
import edu.kit.kastel.scbs.confidentiality.data.SpecificationParameter;
import edu.kit.kastel.scbs.confidentiality.data.DataSetMap;
import edu.kit.kastel.scbs.confidentiality.data.ParameterizedDataSetMapEntry;

/**
 * This is the item provider adapter for a {@link edu.kit.kastel.scbs.confidentiality.data.ParameterizedDataSetMapEntry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterizedDataSetMapEntryItemProvider extends AbstractDataSetMapEntryItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterizedDataSetMapEntryItemProvider(AdapterFactory adapterFactory) {
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

			addParameterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParameterizedDataSetMapEntry_parameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParameterizedDataSetMapEntry_parameter_feature", "_UI_ParameterizedDataSetMapEntry_type"),
				 DataPackage.Literals.PARAMETERIZED_DATA_SET_MAP_ENTRY__PARAMETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ParameterizedDataSetMapEntry.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ParameterizedDataSetMapEntry"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = getLabel(((ParameterizedDataSetMapEntry)object));
		return label == null || label.length() == 0 ?
			getString("_UI_ParameterizedDataSetMapEntry_type") :
			getString("_UI_ParameterizedDataSetMapEntry_type") + " " + label;
	}
	
	/**
	 * @generated NOT
	 */
	private String getLabel(ParameterizedDataSetMapEntry pdsme) {
		DataSetMap map = pdsme.getMap();
		String mapName = "";
		if (map != null) {
			mapName = map.getName();
		}
		SpecificationParameter parameter = pdsme.getParameter();
		String keyParameterName = "";
		if (parameter != null) {
			keyParameterName = parameter.getName();
		}
		return mapName + "[" + keyParameterName + "]";
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

}
