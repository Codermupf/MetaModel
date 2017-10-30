/**
 */
package org.eclipse.sample.architectureTool.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sample.architectureTool.ArchitecturePackage;
import org.eclipse.sample.architectureTool.InterFace;
import org.eclipse.sample.architectureTool.inPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>in Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.inPortImpl#getRealizeRequiredPortOfInterface <em>Realize Required Port Of Interface</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.impl.inPortImpl#getRealizeRequiredPortOfClass <em>Realize Required Port Of Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class inPortImpl extends PortImpl implements inPort {
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
	 * The cached value of the '{@link #getRealizeRequiredPortOfClass() <em>Realize Required Port Of Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizeRequiredPortOfClass()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.sample.architectureTool.Class realizeRequiredPortOfClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected inPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.IN_PORT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.IN_PORT__REALIZE_REQUIRED_PORT_OF_INTERFACE, oldRealizeRequiredPortOfInterface, realizeRequiredPortOfInterface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.IN_PORT__REALIZE_REQUIRED_PORT_OF_INTERFACE, oldRealizeRequiredPortOfInterface, realizeRequiredPortOfInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.sample.architectureTool.Class getRealizeRequiredPortOfClass() {
		if (realizeRequiredPortOfClass != null && realizeRequiredPortOfClass.eIsProxy()) {
			InternalEObject oldRealizeRequiredPortOfClass = (InternalEObject)realizeRequiredPortOfClass;
			realizeRequiredPortOfClass = (org.eclipse.sample.architectureTool.Class)eResolveProxy(oldRealizeRequiredPortOfClass);
			if (realizeRequiredPortOfClass != oldRealizeRequiredPortOfClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.IN_PORT__REALIZE_REQUIRED_PORT_OF_CLASS, oldRealizeRequiredPortOfClass, realizeRequiredPortOfClass));
			}
		}
		return realizeRequiredPortOfClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.sample.architectureTool.Class basicGetRealizeRequiredPortOfClass() {
		return realizeRequiredPortOfClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizeRequiredPortOfClass(org.eclipse.sample.architectureTool.Class newRealizeRequiredPortOfClass) {
		org.eclipse.sample.architectureTool.Class oldRealizeRequiredPortOfClass = realizeRequiredPortOfClass;
		realizeRequiredPortOfClass = newRealizeRequiredPortOfClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.IN_PORT__REALIZE_REQUIRED_PORT_OF_CLASS, oldRealizeRequiredPortOfClass, realizeRequiredPortOfClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.IN_PORT__REALIZE_REQUIRED_PORT_OF_INTERFACE:
				if (resolve) return getRealizeRequiredPortOfInterface();
				return basicGetRealizeRequiredPortOfInterface();
			case ArchitecturePackage.IN_PORT__REALIZE_REQUIRED_PORT_OF_CLASS:
				if (resolve) return getRealizeRequiredPortOfClass();
				return basicGetRealizeRequiredPortOfClass();
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
			case ArchitecturePackage.IN_PORT__REALIZE_REQUIRED_PORT_OF_INTERFACE:
				setRealizeRequiredPortOfInterface((InterFace)newValue);
				return;
			case ArchitecturePackage.IN_PORT__REALIZE_REQUIRED_PORT_OF_CLASS:
				setRealizeRequiredPortOfClass((org.eclipse.sample.architectureTool.Class)newValue);
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
			case ArchitecturePackage.IN_PORT__REALIZE_REQUIRED_PORT_OF_INTERFACE:
				setRealizeRequiredPortOfInterface((InterFace)null);
				return;
			case ArchitecturePackage.IN_PORT__REALIZE_REQUIRED_PORT_OF_CLASS:
				setRealizeRequiredPortOfClass((org.eclipse.sample.architectureTool.Class)null);
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
			case ArchitecturePackage.IN_PORT__REALIZE_REQUIRED_PORT_OF_INTERFACE:
				return realizeRequiredPortOfInterface != null;
			case ArchitecturePackage.IN_PORT__REALIZE_REQUIRED_PORT_OF_CLASS:
				return realizeRequiredPortOfClass != null;
		}
		return super.eIsSet(featureID);
	}

} //inPortImpl
