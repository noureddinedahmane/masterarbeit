/**
 */
package edu.kit.ipd.sdq.mmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.mmm.LoopAction#getLoopActionId <em>Loop Action Id</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.mmm.LoopAction#getExecutionNumber <em>Execution Number</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.mmm.MmmPackage#getLoopAction()
 * @model
 * @generated
 */
public interface LoopAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Loop Action Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Action Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Action Id</em>' attribute.
	 * @see #setLoopActionId(String)
	 * @see edu.kit.ipd.sdq.mmm.MmmPackage#getLoopAction_LoopActionId()
	 * @model
	 * @generated
	 */
	String getLoopActionId();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.mmm.LoopAction#getLoopActionId <em>Loop Action Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Action Id</em>' attribute.
	 * @see #getLoopActionId()
	 * @generated
	 */
	void setLoopActionId(String value);

	/**
	 * Returns the value of the '<em><b>Execution Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Number</em>' attribute.
	 * @see #setExecutionNumber(long)
	 * @see edu.kit.ipd.sdq.mmm.MmmPackage#getLoopAction_ExecutionNumber()
	 * @model
	 * @generated
	 */
	long getExecutionNumber();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.mmm.LoopAction#getExecutionNumber <em>Execution Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Number</em>' attribute.
	 * @see #getExecutionNumber()
	 * @generated
	 */
	void setExecutionNumber(long value);

} // LoopAction
