/**
 */
package org.eclipse.sample.architectureTool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>in Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sample.architectureTool.inPort#getRealizeRequiredPortOfInterface <em>Realize Required Port Of Interface</em>}</li>
 *   <li>{@link org.eclipse.sample.architectureTool.inPort#getRealizeRequiredPortOfClass <em>Realize Required Port Of Class</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getinPort()
 * @model
 * @generated
 */
public interface inPort extends Port {
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
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getinPort_RealizeRequiredPortOfInterface()
	 * @model
	 * @generated
	 */
	InterFace getRealizeRequiredPortOfInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.sample.architectureTool.inPort#getRealizeRequiredPortOfInterface <em>Realize Required Port Of Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realize Required Port Of Interface</em>' reference.
	 * @see #getRealizeRequiredPortOfInterface()
	 * @generated
	 */
	void setRealizeRequiredPortOfInterface(InterFace value);

	/**
	 * Returns the value of the '<em><b>Realize Required Port Of Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realize Required Port Of Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realize Required Port Of Class</em>' reference.
	 * @see #setRealizeRequiredPortOfClass(org.eclipse.sample.architectureTool.Class)
	 * @see org.eclipse.sample.architectureTool.ArchitecturePackage#getinPort_RealizeRequiredPortOfClass()
	 * @model
	 * @generated
	 */
	org.eclipse.sample.architectureTool.Class getRealizeRequiredPortOfClass();

	/**
	 * Sets the value of the '{@link org.eclipse.sample.architectureTool.inPort#getRealizeRequiredPortOfClass <em>Realize Required Port Of Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realize Required Port Of Class</em>' reference.
	 * @see #getRealizeRequiredPortOfClass()
	 * @generated
	 */
	void setRealizeRequiredPortOfClass(org.eclipse.sample.architectureTool.Class value);

} // inPort
