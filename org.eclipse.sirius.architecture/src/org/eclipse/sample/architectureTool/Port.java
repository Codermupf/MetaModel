/**
 */
package org.eclipse.sample.architectureTool;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.architectureTool.Port#getRealizeProvidePortOfInterface <em>Realize Provide Port Of Interface</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Realize Provide Port Of Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realize Provide Port Of Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realize Provide Port Of Interface</em>' reference.
	 * @see #setRealizeProvidePortOfInterface(InterFace)
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getPort_RealizeProvidePortOfInterface()
	 * @model
	 * @generated
	 */
	InterFace getRealizeProvidePortOfInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.sample.architectureTool.Port#getRealizeProvidePortOfInterface <em>Realize Provide Port Of Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realize Provide Port Of Interface</em>' reference.
	 * @see #getRealizeProvidePortOfInterface()
	 * @generated
	 */
	void setRealizeProvidePortOfInterface(InterFace value);

} // Port
