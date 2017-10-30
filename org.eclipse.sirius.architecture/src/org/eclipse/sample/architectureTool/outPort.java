/**
 */
package org.eclipse.sample.architectureTool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>out Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.architectureTool.outPort#getRealizeProvidePortOfInterface <em>Realize Provide Port Of Interface</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.outPort#getRealizeProvidePortOfClass <em>Realize Provide Port Of Class</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getoutPort()
 * @model
 * @generated
 */
public interface outPort extends Port {
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
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getoutPort_RealizeProvidePortOfInterface()
	 * @model
	 * @generated
	 */
	InterFace getRealizeProvidePortOfInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.sample.architectureTool.outPort#getRealizeProvidePortOfInterface <em>Realize Provide Port Of Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realize Provide Port Of Interface</em>' reference.
	 * @see #getRealizeProvidePortOfInterface()
	 * @generated
	 */
	void setRealizeProvidePortOfInterface(InterFace value);

	/**
	 * Returns the value of the '<em><b>Realize Provide Port Of Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realize Provide Port Of Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realize Provide Port Of Class</em>' reference.
	 * @see #setRealizeProvidePortOfClass(org.eclipse.sample.architectureTool.Class)
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getoutPort_RealizeProvidePortOfClass()
	 * @model
	 * @generated
	 */
	org.eclipse.sample.architectureTool.Class getRealizeProvidePortOfClass();

	/**
	 * Sets the value of the '{@link org.eclipse.sample.architectureTool.outPort#getRealizeProvidePortOfClass <em>Realize Provide Port Of Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realize Provide Port Of Class</em>' reference.
	 * @see #getRealizeProvidePortOfClass()
	 * @generated
	 */
	void setRealizeProvidePortOfClass(org.eclipse.sample.architectureTool.Class value);

} // outPort
