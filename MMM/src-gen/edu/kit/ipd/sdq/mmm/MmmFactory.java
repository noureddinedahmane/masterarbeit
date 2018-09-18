/**
 */
package edu.kit.ipd.sdq.mmm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.mmm.MmmPackage
 * @generated
 */
public interface MmmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MmmFactory eINSTANCE = edu.kit.ipd.sdq.mmm.impl.MmmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Internal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Action</em>'.
	 * @generated
	 */
	InternalAction createInternalAction();

	/**
	 * Returns a new object of class '<em>Loop Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Action</em>'.
	 * @generated
	 */
	LoopAction createLoopAction();

	/**
	 * Returns a new object of class '<em>Branch Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branch Action</em>'.
	 * @generated
	 */
	BranchAction createBranchAction();

	/**
	 * Returns a new object of class '<em>Operation Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Param</em>'.
	 * @generated
	 */
	OperationParam createOperationParam();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MmmPackage getMmmPackage();

} //MmmFactory
