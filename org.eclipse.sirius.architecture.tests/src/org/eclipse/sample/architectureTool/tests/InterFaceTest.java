/**
 */
package org.eclipse.sample.architectureTool.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.sample.architectureTool.ArchitectureFactory;
import org.eclipse.sample.architectureTool.InterFace;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Inter Face</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterFaceTest extends TestCase {

	/**
	 * The fixture for this Inter Face test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterFace fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InterFaceTest.class);
	}

	/**
	 * Constructs a new Inter Face test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterFaceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Inter Face test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InterFace fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Inter Face test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterFace getFixture() {
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
		setFixture(ArchitectureFactory.eINSTANCE.createInterFace());
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

} //InterFaceTest
