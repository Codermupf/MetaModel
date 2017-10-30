/**
 */
package org.eclipse.sample.architectureTool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.architectureTool.System#getSubSystem <em>Sub System</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.System#getComponentOfSystem <em>Component Of System</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.System#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.System#getPortOfSystem <em>Port Of System</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub System</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sample.architectureTool.System}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub System</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub System</em>' reference list.
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getSystem_SubSystem()
	 * @model
	 * @generated
	 */
	EList<System> getSubSystem();

	/**
	 * Returns the value of the '<em><b>Component Of System</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sample.architectureTool.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Of System</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Of System</em>' containment reference list.
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getSystem_ComponentOfSystem()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponentOfSystem();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sample.architectureTool.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port Of System</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sample.architectureTool.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Of System</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Of System</em>' containment reference list.
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getSystem_PortOfSystem()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPortOfSystem();

} // System
