/**
 */
package org.eclipse.sample.architecture.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.sample.architecture.ArchitectureFactory;
import org.eclipse.sample.architecture.architectureGraph;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>architecture Graph</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class architectureGraphTest extends TestCase {

	/**
	 * The fixture for this architecture Graph test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected architectureGraph fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(architectureGraphTest.class);
	}

	/**
	 * Constructs a new architecture Graph test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public architectureGraphTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this architecture Graph test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(architectureGraph fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this architecture Graph test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected architectureGraph getFixture() {
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
		setFixture(ArchitectureFactory.eINSTANCE.createarchitectureGraph());
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

} //architectureGraphTest
