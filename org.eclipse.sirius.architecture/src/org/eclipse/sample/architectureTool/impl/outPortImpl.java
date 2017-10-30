/**
 */
package org.eclipse.sample.architectureTool.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sample.architectureTool.ArchitecturePackage;
import org.eclipse.sample.architectureTool.InterFace;
import org.eclipse.sample.architectureTool.outPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>out Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.outPortImpl#getRealizeProvidePortOfInterface <em>Realize Provide Port Of Interface</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.outPortImpl#getRealizeProvidePortOfClass <em>Realize Provide Port Of Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class outPortImpl extends PortImpl implements outPort {
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
	 * The cached value of the '{@link #getRealizeProvidePortOfClass() <em>Realize Provide Port Of Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizeProvidePortOfClass()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.sample.architectureTool.Class realizeProvidePortOfClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected outPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.OUT_PORT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.OUT_PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE, oldRealizeProvidePortOfInterface, realizeProvidePortOfInterface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.OUT_PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE, oldRealizeProvidePortOfInterface, realizeProvidePortOfInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.sample.architectureTool.Class getRealizeProvidePortOfClass() {
		if (realizeProvidePortOfClass != null && realizeProvidePortOfClass.eIsProxy()) {
			InternalEObject oldRealizeProvidePortOfClass = (InternalEObject)realizeProvidePortOfClass;
			realizeProvidePortOfClass = (org.eclipse.sample.architectureTool.Class)eResolveProxy(oldRealizeProvidePortOfClass);
			if (realizeProvidePortOfClass != oldRealizeProvidePortOfClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.OUT_PORT__REALIZE_PROVIDE_PORT_OF_CLASS, oldRealizeProvidePortOfClass, realizeProvidePortOfClass));
			}
		}
		return realizeProvidePortOfClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.sample.architectureTool.Class basicGetRealizeProvidePortOfClass() {
		return realizeProvidePortOfClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizeProvidePortOfClass(org.eclipse.sample.architectureTool.Class newRealizeProvidePortOfClass) {
		org.eclipse.sample.architectureTool.Class oldRealizeProvidePortOfClass = realizeProvidePortOfClass;
		realizeProvidePortOfClass = newRealizeProvidePortOfClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.OUT_PORT__REALIZE_PROVIDE_PORT_OF_CLASS, oldRealizeProvidePortOfClass, realizeProvidePortOfClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.OUT_PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE:
				if (resolve) return getRealizeProvidePortOfInterface();
				return basicGetRealizeProvidePortOfInterface();
			case ArchitecturePackage.OUT_PORT__REALIZE_PROVIDE_PORT_OF_CLASS:
				if (resolve) return getRealizeProvidePortOfClass();
				return basicGetRealizeProvidePortOfClass();
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
			case ArchitecturePackage.OUT_PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE:
				setRealizeProvidePortOfInterface((InterFace)newValue);
				return;
			case ArchitecturePackage.OUT_PORT__REALIZE_PROVIDE_PORT_OF_CLASS:
				setRealizeProvidePortOfClass((org.eclipse.sample.architectureTool.Class)newValue);
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
			case ArchitecturePackage.OUT_PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE:
				setRealizeProvidePortOfInterface((InterFace)null);
				return;
			case ArchitecturePackage.OUT_PORT__REALIZE_PROVIDE_PORT_OF_CLASS:
				setRealizeProvidePortOfClass((org.eclipse.sample.architectureTool.Class)null);
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
			case ArchitecturePackage.OUT_PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE:
				return realizeProvidePortOfInterface != null;
			case ArchitecturePackage.OUT_PORT__REALIZE_PROVIDE_PORT_OF_CLASS:
				return realizeProvidePortOfClass != null;
		}
		return super.eIsSet(featureID);
	}

} //outPortImpl
