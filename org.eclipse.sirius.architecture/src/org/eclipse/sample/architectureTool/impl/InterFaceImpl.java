/**
 */
package org.eclipse.sample.architectureTool.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.sample.architectureTool.ArchitecturePackage;
import org.eclipse.sample.architectureTool.Component;
import org.eclipse.sample.architectureTool.InterFace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inter Face</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.InterFaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.InterFaceImpl#getRealizeNeedComponent <em>Realize Need Component</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.InterFaceImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.InterFaceImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.InterFaceImpl#getRealizeRequiredPortOfInterface <em>Realize Required Port Of Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterFaceImpl extends MinimalEObjectImpl.Container implements InterFace {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRealizeNeedComponent() <em>Realize Need Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizeNeedComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> realizeNeedComponent;

	/**
	 * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected String property = PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected String operation = OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRealizeRequiredPortOfInterface() <em>Realize Required Port Of Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizeRequiredPortOfInterface()
	 * @generated
	 * @ordered
	 */
	protected InterFace realizeRequiredPortOfInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterFaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.INTER_FACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.INTER_FACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getRealizeNeedComponent() {
		if (realizeNeedComponent == null) {
			realizeNeedComponent = new EObjectResolvingEList<Component>(Component.class, this, ArchitecturePackage.INTER_FACE__REALIZE_NEED_COMPONENT);
		}
		return realizeNeedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(String newProperty) {
		String oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.INTER_FACE__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(String newOperation) {
		String oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.INTER_FACE__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterFace getRealizeRequiredPortOfInterface() {
		if (realizeRequiredPortOfInterface != null && realizeRequiredPortOfInterface.eIsProxy()) {
			InternalEObject oldRealizeRequiredPortOfInterface = (InternalEObject)realizeRequiredPortOfInterface;
			realizeRequiredPortOfInterface = (InterFace)eResolveProxy(oldRealizeRequiredPortOfInterface);
			if (realizeRequiredPortOfInterface != oldRealizeRequiredPortOfInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.INTER_FACE__REALIZE_REQUIRED_PORT_OF_INTERFACE, oldRealizeRequiredPortOfInterface, realizeRequiredPortOfInterface));
			}
		}
		return realizeRequiredPortOfInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterFace basicGetRealizeRequiredPortOfInterface() {
		return realizeRequiredPortOfInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizeRequiredPortOfInterface(InterFace newRealizeRequiredPortOfInterface) {
		InterFace oldRealizeRequiredPortOfInterface = realizeRequiredPortOfInterface;
		realizeRequiredPortOfInterface = newRealizeRequiredPortOfInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.INTER_FACE__REALIZE_REQUIRED_PORT_OF_INTERFACE, oldRealizeRequiredPortOfInterface, realizeRequiredPortOfInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.INTER_FACE__NAME:
				return getName();
			case ArchitecturePackage.INTER_FACE__REALIZE_NEED_COMPONENT:
				return getRealizeNeedComponent();
			case ArchitecturePackage.INTER_FACE__PROPERTY:
				return getProperty();
			case ArchitecturePackage.INTER_FACE__OPERATION:
				return getOperation();
			case ArchitecturePackage.INTER_FACE__REALIZE_REQUIRED_PORT_OF_INTERFACE:
				if (resolve) return getRealizeRequiredPortOfInterface();
				return basicGetRealizeRequiredPortOfInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArchitecturePackage.INTER_FACE__NAME:
				setName((String)newValue);
				return;
			case ArchitecturePackage.INTER_FACE__REALIZE_NEED_COMPONENT:
				getRealizeNeedComponent().clear();
				getRealizeNeedComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case ArchitecturePackage.INTER_FACE__PROPERTY:
				setProperty((String)newValue);
				return;
			case ArchitecturePackage.INTER_FACE__OPERATION:
				setOperation((String)newValue);
				return;
			case ArchitecturePackage.INTER_FACE__REALIZE_REQUIRED_PORT_OF_INTERFACE:
				setRealizeRequiredPortOfInterface((InterFace)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArchitecturePackage.INTER_FACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArchitecturePackage.INTER_FACE__REALIZE_NEED_COMPONENT:
				getRealizeNeedComponent().clear();
				return;
			case ArchitecturePackage.INTER_FACE__PROPERTY:
				setProperty(PROPERTY_EDEFAULT);
				return;
			case ArchitecturePackage.INTER_FACE__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case ArchitecturePackage.INTER_FACE__REALIZE_REQUIRED_PORT_OF_INTERFACE:
				setRealizeRequiredPortOfInterface((InterFace)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArchitecturePackage.INTER_FACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArchitecturePackage.INTER_FACE__REALIZE_NEED_COMPONENT:
				return realizeNeedComponent != null && !realizeNeedComponent.isEmpty();
			case ArchitecturePackage.INTER_FACE__PROPERTY:
				return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
			case ArchitecturePackage.INTER_FACE__OPERATION:
				return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
			case ArchitecturePackage.INTER_FACE__REALIZE_REQUIRED_PORT_OF_INTERFACE:
				return realizeRequiredPortOfInterface != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", Property: ");
		result.append(property);
		result.append(", operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

} //InterFaceImpl
