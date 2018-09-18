/**
 */
package edu.kit.ipd.sdq.mmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.mmm.InternalAction#getInternalActionId <em>Internal Action Id</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.mmm.InternalAction#getExecutionTime <em>Execution Time</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.mmm.MmmPackage#getInternalAction()
 * @model
 * @generated
 */
public interface InternalAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Action Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Action Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Action Id</em>' attribute.
	 * @see #setInternalActionId(String)
	 * @see edu.kit.ipd.sdq.mmm.MmmPackage#getInternalAction_InternalActionId()
	 * @model
	 * @generated
	 */
	String getInternalActionId();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.mmm.InternalAction#getInternalActionId <em>Internal Action Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Action Id</em>' attribute.
	 * @see #getInternalActionId()
	 * @generated
	 */
	void setInternalActionId(String value);

	/**
	 * Returns the value of the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Time</em>' attribute.
	 * @see #setExecutionTime(long)
	 * @see edu.kit.ipd.sdq.mmm.MmmPackage#getInternalAction_ExecutionTime()
	 * @model
	 * @generated
	 */
	long getExecutionTime();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.mmm.InternalAction#getExecutionTime <em>Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Time</em>' attribute.
	 * @see #getExecutionTime()
	 * @generated
	 */
	void setExecutionTime(long value);

} // InternalAction
