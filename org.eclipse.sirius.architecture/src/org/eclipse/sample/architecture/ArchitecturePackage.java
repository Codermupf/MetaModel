/**
 */
package org.eclipse.sample.architecture;

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
 * @see org.eclipse.sample.architecture.ArchitectureFactory
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
	String eNAME = "architecture";

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
	String eNS_PREFIX = "architecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitecturePackage eINSTANCE = org.eclipse.sample.architecture.impl.ArchitecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sample.architecture.impl.architectureGraphImpl <em>architecture Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sample.architecture.impl.architectureGraphImpl
	 * @see org.eclipse.sample.architecture.impl.ArchitecturePackageImpl#getarchitectureGraph()
	 * @generated
	 */
	int ARCHITECTURE_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_GRAPH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_GRAPH__COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>architecture Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_GRAPH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>architecture Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sample.architecture.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sample.architecture.impl.ComponentImpl
	 * @see org.eclipse.sample.architecture.impl.ArchitecturePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CLASS = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.eclipse.sample.architecture.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sample.architecture.impl.ClassImpl
	 * @see org.eclipse.sample.architecture.impl.ArchitecturePackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.sample.architecture.architectureGraph <em>architecture Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>architecture Graph</em>'.
	 * @see org.eclipse.sample.architecture.architectureGraph
	 * @generated
	 */
	EClass getarchitectureGraph();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sample.architecture.architectureGraph#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sample.architecture.architectureGraph#getName()
	 * @see #getarchitectureGraph()
	 * @generated
	 */
	EAttribute getarchitectureGraph_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sample.architecture.architectureGraph#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.eclipse.sample.architecture.architectureGraph#getComponent()
	 * @see #getarchitectureGraph()
	 * @generated
	 */
	EReference getarchitectureGraph_Component();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sample.architecture.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.sample.architecture.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sample.architecture.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sample.architecture.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sample.architecture.Component#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see org.eclipse.sample.architecture.Component#getClass_()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sample.architecture.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.eclipse.sample.architecture.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sample.architecture.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sample.architecture.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

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
		 * The meta object literal for the '{@link org.eclipse.sample.architecture.impl.architectureGraphImpl <em>architecture Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sample.architecture.impl.architectureGraphImpl
		 * @see org.eclipse.sample.architecture.impl.ArchitecturePackageImpl#getarchitectureGraph()
		 * @generated
		 */
		EClass ARCHITECTURE_GRAPH = eINSTANCE.getarchitectureGraph();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE_GRAPH__NAME = eINSTANCE.getarchitectureGraph_Name();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_GRAPH__COMPONENT = eINSTANCE.getarchitectureGraph_Component();

		/**
		 * The meta object literal for the '{@link org.eclipse.sample.architecture.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sample.architecture.impl.ComponentImpl
		 * @see org.eclipse.sample.architecture.impl.ArchitecturePackageImpl#getComponent()
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
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CLASS = eINSTANCE.getComponent_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.sample.architecture.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sample.architecture.impl.ClassImpl
		 * @see org.eclipse.sample.architecture.impl.ArchitecturePackageImpl#getClass_()
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

	}

} //ArchitecturePackage
