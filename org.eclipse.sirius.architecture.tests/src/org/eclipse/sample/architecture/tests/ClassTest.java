/**
 */
package org.eclipse.sample.architecture.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.sample.architecture.ArchitectureFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassTest extends TestCase {

	/**
	 * The fixture for this Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected org.eclipse.sample.architecture.Class fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClassTest.class);
	}

	/**
	 * Constructs a new Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(org.eclipse.sample.architecture.Class fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected org.eclipse.sample.architecture.Class getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArchitectureFactory.eINSTANCE.createClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ClassTest
