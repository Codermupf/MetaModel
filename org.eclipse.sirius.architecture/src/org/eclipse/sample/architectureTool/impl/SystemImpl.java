/**
 */
package org.eclipse.sample.architectureTool.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sample.architectureTool.ArchitecturePackage;
import org.eclipse.sample.architectureTool.Component;
import org.eclipse.sample.architectureTool.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.SystemImpl#getSubSystem <em>Sub System</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.SystemImpl#getComponentOfSystem <em>Component Of System</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.SystemImpl#getPortOfSystem <em>Port Of System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements org.eclipse.sample.architectureTool.System {
	/**
	 * The cached value of the '{@link #getSubSystem() <em>Sub System</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.sample.architectureTool.System> subSystem;

	/**
	 * The cached value of the '{@link #getComponentOfSystem() <em>Component Of System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentOfSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> componentOfSystem;

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
	 * The cached value of the '{@link #getPortOfSystem() <em>Port Of System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortOfSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> portOfSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.sample.architectureTool.System> getSubSystem() {
		if (subSystem == null) {
			subSystem = new EObjectResolvingEList<org.eclipse.sample.architectureTool.System>(org.eclipse.sample.architectureTool.System.class, this, ArchitecturePackage.SYSTEM__SUB_SYSTEM);
		}
		return subSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponentOfSystem() {
		if (componentOfSystem == null) {
			componentOfSystem = new EObjectContainmentEList<Component>(Component.class, this, ArchitecturePackage.SYSTEM__COMPONENT_OF_SYSTEM);
		}
		return componentOfSystem;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPortOfSystem() {
		if (portOfSystem == null) {
			portOfSystem = new EObjectContainmentEList<Port>(Port.class, this, ArchitecturePackage.SYSTEM__PORT_OF_SYSTEM);
		}
		return portOfSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.SYSTEM__COMPONENT_OF_SYSTEM:
				return ((InternalEList<?>)getComponentOfSystem()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.SYSTEM__PORT_OF_SYSTEM:
				return ((InternalEList<?>)getPortOfSystem()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.SYSTEM__SUB_SYSTEM:
				return getSubSystem();
			case ArchitecturePackage.SYSTEM__COMPONENT_OF_SYSTEM:
				return getComponentOfSystem();
			case ArchitecturePackage.SYSTEM__NAME:
				return getName();
			case ArchitecturePackage.SYSTEM__PORT_OF_SYSTEM:
				return getPortOfSystem();
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
			case ArchitecturePackage.SYSTEM__SUB_SYSTEM:
				getSubSystem().clear();
				getSubSystem().addAll((Collection<? extends org.eclipse.sample.architectureTool.System>)newValue);
				return;
			case ArchitecturePackage.SYSTEM__COMPONENT_OF_SYSTEM:
				getComponentOfSystem().clear();
				getComponentOfSystem().addAll((Collection<? extends Component>)newValue);
				return;
			case ArchitecturePackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case ArchitecturePackage.SYSTEM__PORT_OF_SYSTEM:
				getPortOfSystem().clear();
				getPortOfSystem().addAll((Collection<? extends Port>)newValue);
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
			case ArchitecturePackage.SYSTEM__SUB_SYSTEM:
				getSubSystem().clear();
				return;
			case ArchitecturePackage.SYSTEM__COMPONENT_OF_SYSTEM:
				getComponentOfSystem().clear();
				return;
			case ArchitecturePackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArchitecturePackage.SYSTEM__PORT_OF_SYSTEM:
				getPortOfSystem().clear();
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
			case ArchitecturePackage.SYSTEM__SUB_SYSTEM:
				return subSystem != null && !subSystem.isEmpty();
			case ArchitecturePackage.SYSTEM__COMPONENT_OF_SYSTEM:
				return componentOfSystem != null && !componentOfSystem.isEmpty();
			case ArchitecturePackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArchitecturePackage.SYSTEM__PORT_OF_SYSTEM:
				return portOfSystem != null && !portOfSystem.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SystemImpl
