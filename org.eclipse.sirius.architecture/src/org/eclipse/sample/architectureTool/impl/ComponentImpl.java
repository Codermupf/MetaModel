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
import org.eclipse.sample.architectureTool.InterFace;
import org.eclipse.sample.architectureTool.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.ComponentImpl#getPortOfComponent <em>Port Of Component</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.ComponentImpl#getRealizeProvideComponent <em>Realize Provide Component</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.ComponentImpl#getDependance <em>Dependance</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.ComponentImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
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
	 * The cached value of the '{@link #getPortOfComponent() <em>Port Of Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortOfComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> portOfComponent;

	/**
	 * The cached value of the '{@link #getRealizeProvideComponent() <em>Realize Provide Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizeProvideComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<InterFace> realizeProvideComponent;

	/**
	 * The cached value of the '{@link #getDependance() <em>Dependance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependance()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> dependance;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.sample.architectureTool.Class> class_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPortOfComponent() {
		if (portOfComponent == null) {
			portOfComponent = new EObjectContainmentEList<Port>(Port.class, this, ArchitecturePackage.COMPONENT__PORT_OF_COMPONENT);
		}
		return portOfComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterFace> getRealizeProvideComponent() {
		if (realizeProvideComponent == null) {
			realizeProvideComponent = new EObjectResolvingEList<InterFace>(InterFace.class, this, ArchitecturePackage.COMPONENT__REALIZE_PROVIDE_COMPONENT);
		}
		return realizeProvideComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getDependance() {
		if (dependance == null) {
			dependance = new EObjectResolvingEList<Component>(Component.class, this, ArchitecturePackage.COMPONENT__DEPENDANCE);
		}
		return dependance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.sample.architectureTool.Class> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<org.eclipse.sample.architectureTool.Class>(org.eclipse.sample.architectureTool.Class.class, this, ArchitecturePackage.COMPONENT__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.COMPONENT__PORT_OF_COMPONENT:
				return ((InternalEList<?>)getPortOfComponent()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.COMPONENT__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
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
			case ArchitecturePackage.COMPONENT__NAME:
				return getName();
			case ArchitecturePackage.COMPONENT__PORT_OF_COMPONENT:
				return getPortOfComponent();
			case ArchitecturePackage.COMPONENT__REALIZE_PROVIDE_COMPONENT:
				return getRealizeProvideComponent();
			case ArchitecturePackage.COMPONENT__DEPENDANCE:
				return getDependance();
			case ArchitecturePackage.COMPONENT__CLASS:
				return getClass_();
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
			case ArchitecturePackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case ArchitecturePackage.COMPONENT__PORT_OF_COMPONENT:
				getPortOfComponent().clear();
				getPortOfComponent().addAll((Collection<? extends Port>)newValue);
				return;
			case ArchitecturePackage.COMPONENT__REALIZE_PROVIDE_COMPONENT:
				getRealizeProvideComponent().clear();
				getRealizeProvideComponent().addAll((Collection<? extends InterFace>)newValue);
				return;
			case ArchitecturePackage.COMPONENT__DEPENDANCE:
				getDependance().clear();
				getDependance().addAll((Collection<? extends Component>)newValue);
				return;
			case ArchitecturePackage.COMPONENT__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends org.eclipse.sample.architectureTool.Class>)newValue);
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
			case ArchitecturePackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArchitecturePackage.COMPONENT__PORT_OF_COMPONENT:
				getPortOfComponent().clear();
				return;
			case ArchitecturePackage.COMPONENT__REALIZE_PROVIDE_COMPONENT:
				getRealizeProvideComponent().clear();
				return;
			case ArchitecturePackage.COMPONENT__DEPENDANCE:
				getDependance().clear();
				return;
			case ArchitecturePackage.COMPONENT__CLASS:
				getClass_().clear();
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
			case ArchitecturePackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArchitecturePackage.COMPONENT__PORT_OF_COMPONENT:
				return portOfComponent != null && !portOfComponent.isEmpty();
			case ArchitecturePackage.COMPONENT__REALIZE_PROVIDE_COMPONENT:
				return realizeProvideComponent != null && !realizeProvideComponent.isEmpty();
			case ArchitecturePackage.COMPONENT__DEPENDANCE:
				return dependance != null && !dependance.isEmpty();
			case ArchitecturePackage.COMPONENT__CLASS:
				return class_ != null && !class_.isEmpty();
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

} //ComponentImpl
