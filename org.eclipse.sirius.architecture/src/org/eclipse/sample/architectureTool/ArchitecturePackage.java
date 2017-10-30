/**
 */
package org.eclipse.sample.architectureTool;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sample.architectureTool.ArchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "architectureTool";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/architecture";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "architectureTool";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitecturePackage eINSTANCE = org.eclipse.sample.architectureTool.impl.ArchitecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sample.architectureTool.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sample.architectureTool.impl.ComponentImpl
	 * @see org.eclipse.sample.architectureTool.impl.ArchitecturePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Port Of Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORT_OF_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Realize Provide Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REALIZE_PROVIDE_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Dependance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DEPENDANCE = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CLASS = 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sample.architectureTool.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sample.architectureTool.impl.ClassImpl
	 * @see org.eclipse.sample.architectureTool.impl.ArchitecturePackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ASSOCIATION = 1;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sample.architectureTool.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sample.architectureTool.impl.SystemImpl
	 * @see org.eclipse.sample.architectureTool.impl.ArchitecturePackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Sub System</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUB_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Component Of System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__COMPONENT_OF_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 2;

	/**
	 * The feature id for the '<em><b>Port Of System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PORT_OF_SYSTEM = 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sample.architectureTool.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sample.architectureTool.impl.PortImpl
	 * @see org.eclipse.sample.architectureTool.impl.ArchitecturePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The feature id for the '<em><b>Realize Provide Port Of Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sample.architectureTool.impl.InterFaceImpl <em>Inter Face</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sample.architectureTool.impl.InterFaceImpl
	 * @see org.eclipse.sample.architectureTool.impl.ArchitecturePackageImpl#getInterFace()
	 * @generated
	 */
	int INTER_FACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_FACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Realize Need Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_FACE__REALIZE_NEED_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_FACE__PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_FACE__OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Realize Required Port Of Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_FACE__REALIZE_REQUIRED_PORT_OF_INTERFACE = 4;

	/**
	 * The number of structural features of the '<em>Inter Face</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_FACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Inter Face</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_FACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sample.architectureTool.impl.inPortImpl <em>in Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sample.architectureTool.impl.inPortImpl
	 * @see org.eclipse.sample.architectureTool.impl.ArchitecturePackageImpl#getinPort()
	 * @generated
	 */
	int IN_PORT = 5;

	/**
	 * The feature id for the '<em><b>Realize Provide Port Of Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE = PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE;

	/**
	 * The feature id for the '<em><b>Realize Required Port Of Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__REALIZE_REQUIRED_PORT_OF_INTERFACE = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realize Required Port Of Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__REALIZE_REQUIRED_PORT_OF_CLASS = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>in Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>in Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sample.architectureTool.impl.outPortImpl <em>out Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sample.architectureTool.impl.outPortImpl
	 * @see org.eclipse.sample.architectureTool.impl.ArchitecturePackageImpl#getoutPort()
	 * @generated
	 */
	int OUT_PORT = 6;

	/**
	 * The feature id for the '<em><b>Realize Provide Port Of Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	

	/**
	 * The feature id for the '<em><b>Realize Provide Port Of Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realize Provide Port Of Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__REALIZE_PROVIDE_PORT_OF_CLASS = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.sample.architectureTool.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.sample.architectureTool.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sample.architectureTool.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sample.architectureTool.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sample.architectureTool.Component#getPortOfComponent <em>Port Of Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Of Component</em>'.
	 * @see org.eclipse.sample.architectureTool.Component#getPortOfComponent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_PortOfComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sample.architectureTool.Component#getRealizeProvideComponent <em>Realize Provide Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realize Provide Component</em>'.
	 * @see org.eclipse.sample.architectureTool.Component#getRealizeProvideComponent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_RealizeProvideComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sample.architectureTool.Component#getDependance <em>Dependance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependance</em>'.
	 * @see org.eclipse.sample.architectureTool.Component#getDependance()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Dependance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sample.architectureTool.Component#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see org.eclipse.sample.architectureTool.Component#getClass_()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sample.architectureTool.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.eclipse.sample.architectureTool.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sample.architectureTool.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sample.architectureTool.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sample.architectureTool.Class#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association</em>'.
	 * @see org.eclipse.sample.architectureTool.Class#getAssociation()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Association();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sample.architectureTool.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.eclipse.sample.architectureTool.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sample.architectureTool.System#getSubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub System</em>'.
	 * @see org.eclipse.sample.architectureTool.System#getSubSystem()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_SubSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sample.architectureTool.System#getComponentOfSystem <em>Component Of System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Of System</em>'.
	 * @see org.eclipse.sample.architectureTool.System#getComponentOfSystem()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ComponentOfSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sample.architectureTool.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sample.architectureTool.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sample.architectureTool.System#getPortOfSystem <em>Port Of System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Of System</em>'.
	 * @see org.eclipse.sample.architectureTool.System#getPortOfSystem()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_PortOfSystem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sample.architectureTool.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.eclipse.sample.architectureTool.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sample.architectureTool.Port#getRealizeProvidePortOfInterface <em>Realize Provide Port Of Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realize Provide Port Of Interface</em>'.
	 * @see org.eclipse.sample.architectureTool.Port#getRealizeProvidePortOfInterface()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_RealizeProvidePortOfInterface();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sample.architectureTool.InterFace <em>Inter Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Face</em>'.
	 * @see org.eclipse.sample.architectureTool.InterFace
	 * @generated
	 */
	EClass getInterFace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sample.architectureTool.InterFace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sample.architectureTool.InterFace#getName()
	 * @see #getInterFace()
	 * @generated
	 */
	EAttribute getInterFace_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sample.architectureTool.InterFace#getRealizeNeedComponent <em>Realize Need Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realize Need Component</em>'.
	 * @see org.eclipse.sample.architectureTool.InterFace#getRealizeNeedComponent()
	 * @see #getInterFace()
	 * @generated
	 */
	EReference getInterFace_RealizeNeedComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sample.architectureTool.InterFace#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.eclipse.sample.architectureTool.InterFace#getProperty()
	 * @see #getInterFace()
	 * @generated
	 */
	EAttribute getInterFace_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sample.architectureTool.InterFace#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.eclipse.sample.architectureTool.InterFace#getOperation()
	 * @see #getInterFace()
	 * @generated
	 */
	EAttribute getInterFace_Operation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sample.architectureTool.InterFace#getRealizeRequiredPortOfInterface <em>Realize Required Port Of Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realize Required Port Of Interface</em>'.
	 * @see org.eclipse.sample.architectureTool.InterFace#getRealizeRequiredPortOfInterface()
	 * @see #getInterFace()
	 * @generated
	 */
	EReference getInterFace_RealizeRequiredPortOfInterface();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sample.architectureTool.inPort <em>in Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>in Port</em>'.
	 * @see org.eclipse.sample.architectureTool.inPort
	 * @generated
	 */
	EClass getinPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sample.architectureTool.inPort#getRealizeRequiredPortOfInterface <em>Realize Required Port Of Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realize Required Port Of Interface</em>'.
	 * @see org.eclipse.sample.architectureTool.inPort#getRealizeRequiredPortOfInterface()
	 * @see #getinPort()
	 * @generated
	 */
	EReference getinPort_RealizeRequiredPortOfInterface();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sample.architectureTool.inPort#getRealizeRequiredPortOfClass <em>Realize Required Port Of Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realize Required Port Of Class</em>'.
	 * @see org.eclipse.sample.architectureTool.inPort#getRealizeRequiredPortOfClass()
	 * @see #getinPort()
	 * @generated
	 */
	EReference getinPort_RealizeRequiredPortOfClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sample.architectureTool.outPort <em>out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>out Port</em>'.
	 * @see org.eclipse.sample.architectureTool.outPort
	 * @generated
	 */
	EClass getoutPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sample.architectureTool.outPort#getRealizeProvidePortOfInterface <em>Realize Provide Port Of Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realize Provide Port Of Interface</em>'.
	 * @see org.eclipse.sample.architectureTool.outPort#getRealizeProvidePortOfInterface()
	 * @see #getoutPort()
	 * @generated
	 */
	EReference getoutPort_RealizeProvidePortOfInterface();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sample.architectureTool.outPort#getRealizeProvidePortOfClass <em>Realize Provide Port Of Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realize Provide Port Of Class</em>'.
	 * @see org.eclipse.sample.architectureTool.outPort#getRealizeProvidePortOfClass()
	 * @see #getoutPort()
	 * @generated
	 */
	EReference getoutPort_RealizeProvidePortOfClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArchitectureFactory getArchitectureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sample.architectureTool.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sample.architectureTool.impl.ComponentImpl
		 * @see org.eclipse.sample.architectureTool.impl.ArchitecturePackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Port Of Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PORT_OF_COMPONENT = eINSTANCE.getComponent_PortOfComponent();

		/**
		 * The meta object literal for the '<em><b>Realize Provide Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REALIZE_PROVIDE_COMPONENT = eINSTANCE.getComponent_RealizeProvideComponent();

		/**
		 * The meta object literal for the '<em><b>Dependance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DEPENDANCE = eINSTANCE.getComponent_Dependance();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CLASS = eINSTANCE.getComponent_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.sample.architectureTool.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sample.architectureTool.impl.ClassImpl
		 * @see org.eclipse.sample.architectureTool.impl.ArchitecturePackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ASSOCIATION = eINSTANCE.getClass_Association();

		/**
		 * The meta object literal for the '{@link org.eclipse.sample.architectureTool.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sample.architectureTool.impl.SystemImpl
		 * @see org.eclipse.sample.architectureTool.impl.ArchitecturePackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Sub System</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SUB_SYSTEM = eINSTANCE.getSystem_SubSystem();

		/**
		 * The meta object literal for the '<em><b>Component Of System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__COMPONENT_OF_SYSTEM = eINSTANCE.getSystem_ComponentOfSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Port Of System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PORT_OF_SYSTEM = eINSTANCE.getSystem_PortOfSystem();

		/**
		 * The meta object literal for the '{@link org.eclipse.sample.architectureTool.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sample.architectureTool.impl.PortImpl
		 * @see org.eclipse.sample.architectureTool.impl.ArchitecturePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Realize Provide Port Of Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE = eINSTANCE.getPort_RealizeProvidePortOfInterface();

		/**
		 * The meta object literal for the '{@link org.eclipse.sample.architectureTool.impl.InterFaceImpl <em>Inter Face</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sample.architectureTool.impl.InterFaceImpl
		 * @see org.eclipse.sample.architectureTool.impl.ArchitecturePackageImpl#getInterFace()
		 * @generated
		 */
		EClass INTER_FACE = eINSTANCE.getInterFace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTER_FACE__NAME = eINSTANCE.getInterFace_Name();

		/**
		 * The meta object literal for the '<em><b>Realize Need Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_FACE__REALIZE_NEED_COMPONENT = eINSTANCE.getInterFace_RealizeNeedComponent();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTER_FACE__PROPERTY = eINSTANCE.getInterFace_Property();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTER_FACE__OPERATION = eINSTANCE.getInterFace_Operation();

		/**
		 * The meta object literal for the '<em><b>Realize Required Port Of Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_FACE__REALIZE_REQUIRED_PORT_OF_INTERFACE = eINSTANCE.getInterFace_RealizeRequiredPortOfInterface();

		/**
		 * The meta object literal for the '{@link org.eclipse.sample.architectureTool.impl.inPortImpl <em>in Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sample.architectureTool.impl.inPortImpl
		 * @see org.eclipse.sample.architectureTool.impl.ArchitecturePackageImpl#getinPort()
		 * @generated
		 */
		EClass IN_PORT = eINSTANCE.getinPort();

		/**
		 * The meta object literal for the '<em><b>Realize Required Port Of Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PORT__REALIZE_REQUIRED_PORT_OF_INTERFACE = eINSTANCE.getinPort_RealizeRequiredPortOfInterface();

		/**
		 * The meta object literal for the '<em><b>Realize Required Port Of Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PORT__REALIZE_REQUIRED_PORT_OF_CLASS = eINSTANCE.getinPort_RealizeRequiredPortOfClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.sample.architectureTool.impl.outPortImpl <em>out Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sample.architectureTool.impl.outPortImpl
		 * @see org.eclipse.sample.architectureTool.impl.ArchitecturePackageImpl#getoutPort()
		 * @generated
		 */
		EClass OUT_PORT = eINSTANCE.getoutPort();

		/**
		 * The meta object literal for the '<em><b>Realize Provide Port Of Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PORT__REALIZE_PROVIDE_PORT_OF_INTERFACE = eINSTANCE.getoutPort_RealizeProvidePortOfInterface();

		/**
		 * The meta object literal for the '<em><b>Realize Provide Port Of Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PORT__REALIZE_PROVIDE_PORT_OF_CLASS = eINSTANCE.getoutPort_RealizeProvidePortOfClass();

	}

} //ArchitecturePackage
