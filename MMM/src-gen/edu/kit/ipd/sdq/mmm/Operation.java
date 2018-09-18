/**
 */
package edu.kit.ipd.sdq.mmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.mmm.Operation#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.mmm.Operation#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.mmm.Operation#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.mmm.Operation#getOperationparam <em>Operationparam</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.mmm.MmmPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Id</em>' attribute.
	 * @see #setOperationId(String)
	 * @see edu.kit.ipd.sdq.mmm.MmmPackage#getOperation_OperationId()
	 * @model
	 * @generated
	 */
	String getOperationId();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.mmm.Operation#getOperationId <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Id</em>' attribute.
	 * @see #getOperationId()
	 * @generated
	 */
	void setOperationId(String value);

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
	 * @see edu.kit.ipd.sdq.mmm.MmmPackage#getOperation_ExecutionTime()
	 * @model
	 * @generated
	 */
	long getExecutionTime();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.mmm.Operation#getExecutionTime <em>Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Time</em>' attribute.
	 * @see #getExecutionTime()
	 * @generated
	 */
	void setExecutionTime(long value);

	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value</em>' attribute.
	 * @see #setReturnValue(Object)
	 * @see edu.kit.ipd.sdq.mmm.MmmPackage#getOperation_ReturnValue()
	 * @model
	 * @generated
	 */
	Object getReturnValue();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.mmm.Operation#getReturnValue <em>Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' attribute.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(Object value);

	/**
	 * Returns the value of the '<em><b>Operationparam</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.mmm.OperationParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operationparam</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationparam</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.mmm.MmmPackage#getOperation_Operationparam()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationParam> getOperationparam();

} // Operation
