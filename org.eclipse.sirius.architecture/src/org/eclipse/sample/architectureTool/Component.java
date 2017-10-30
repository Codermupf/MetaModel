/**
 */
package org.eclipse.sample.architectureTool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.architectureTool.Component#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.Component#getPortOfComponent <em>Port Of Component</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.Component#getRealizeProvideComponent <em>Realize Provide Component</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.Component#getDependance <em>Dependance</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.Component#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
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
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sample.architectureTool.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port Of Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sample.architectureTool.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Of Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Of Component</em>' containment reference list.
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getComponent_PortOfComponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPortOfComponent();

	/**
	 * Returns the value of the '<em><b>Realize Provide Component</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sample.architectureTool.InterFace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realize Provide Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realize Provide Component</em>' reference list.
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getComponent_RealizeProvideComponent()
	 * @model
	 * @generated
	 */
	EList<InterFace> getRealizeProvideComponent();

	/**
	 * Returns the value of the '<em><b>Dependance</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sample.architectureTool.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependance</em>' reference list.
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getComponent_Dependance()
	 * @model
	 * @generated
	 */
	EList<Component> getDependance();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sample.architectureTool.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getComponent_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.eclipse.sample.architectureTool.Class> getClass_();

} // Component
