/**
 */
package edu.kit.ipd.sdq.imm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.imm.ImmPackage
 * @generated
 */
public interface ImmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImmFactory eINSTANCE = edu.kit.ipd.sdq.imm.impl.ImmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Probe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Probe</em>'.
	 * @generated
	 */
	Probe createProbe();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImmPackage getImmPackage();

} //ImmFactory
