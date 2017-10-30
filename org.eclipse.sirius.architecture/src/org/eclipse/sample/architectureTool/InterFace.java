/**
 */
package org.eclipse.sample.architectureTool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inter Face</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.architectureTool.InterFace#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.InterFace#getRealizeNeedComponent <em>Realize Need Component</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.InterFace#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.InterFace#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.InterFace#getRealizeRequiredPortOfInterface <em>Realize Required Port Of Interface</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getInterFace()
 * @model
 * @generated
 */
public interface InterFace extends EObject {
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
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getInterFace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sample.architectureTool.InterFace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Realize Need Component</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sample.architectureTool.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realize Need Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realize Need Component</em>' reference list.
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getInterFace_RealizeNeedComponent()
	 * @model
	 * @generated
	 */
	EList<Component> getRealizeNeedComponent();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getInterFace_Property()
	 * @model
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.sample.architectureTool.InterFace#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see #setOperation(String)
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getInterFace_Operation()
	 * @model
	 * @generated
	 */
	String getOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.sample.architectureTool.InterFace#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(String value);

	/**
	 * Returns the value of the '<em><b>Realize Required Port Of Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realize Required Port Of Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realize Required Port Of Interface</em>' reference.
	 * @see #setRealizeRequiredPortOfInterface(InterFace)
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getInterFace_RealizeRequiredPortOfInterface()
	 * @model
	 * @generated
	 */
	InterFace getRealizeRequiredPortOfInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.sample.architectureTool.InterFace#getRealizeRequiredPortOfInterface <em>Realize Required Port Of Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realize Required Port Of Interface</em>' reference.
	 * @see #getRealizeRequiredPortOfInterface()
	 * @generated
	 */
	void setRealizeRequiredPortOfInterface(InterFace value);

} // InterFace
