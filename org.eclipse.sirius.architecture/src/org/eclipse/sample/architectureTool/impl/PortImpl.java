/**
 */
package org.eclipse.sample.architectureTool.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sample.architectureTool.ArchitecturePackage;
import org.eclipse.sample.architectureTool.InterFace;
import org.eclipse.sample.architectureTool.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.PortImpl#getRealizeProvidePortOfInterface <em>Realize Provide Port Of Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PortImpl extends MinimalEObjectImpl.Container implements Port {
	/**
	 * The cached value of the '{@link #getRealizeProvidePortOfInterface() <em>Realize Provide Port Of Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizeProvidePortOfInterface()
	 * @generated
	 * @ordered
	 */
	protected InterFace realizeProvidePortOfInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterFace getRealizeProvidePortOfInterface() {
		if (realizeProvidePortOfInterface != null && realizeProvidePortOfInterface.eIsProxy()) {
			InternalEObject oldRealizeProvidePortOfInterface = (InternalEObject)realizeProvidePortOfInterface;
			realizeProvidePortOfInterface = (InterFace)eResolveProxy(oldRealizeProvidePortOfInterface);
			if (realizeProvidePortOfInterface != oldRealizeProvidePortOfInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE, oldRealizeProvidePortOfInterface, realizeProvidePortOfInterface));
			}
		}
		return realizeProvidePortOfInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterFace basicGetRealizeProvidePortOfInterface() {
		return realizeProvidePortOfInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizeProvidePortOfInterface(InterFace newRealizeProvidePortOfInterface) {
		InterFace oldRealizeProvidePortOfInterface = realizeProvidePortOfInterface;
		realizeProvidePortOfInterface = newRealizeProvidePortOfInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE, oldRealizeProvidePortOfInterface, realizeProvidePortOfInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE:
				if (resolve) return getRealizeProvidePortOfInterface();
				return basicGetRealizeProvidePortOfInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArchitecturePackage.PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE:
				setRealizeProvidePortOfInterface((InterFace)newValue);
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
			case ArchitecturePackage.PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE:
				setRealizeProvidePortOfInterface((InterFace)null);
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
			case ArchitecturePackage.PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE:
				return realizeProvidePortOfInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //PortImpl
