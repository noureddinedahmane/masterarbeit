/**
 */
package edu.kit.ipd.sdq.mmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.mmm.OperationParam#getParamValue <em>Param Value</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.mmm.MmmPackage#getOperationParam()
 * @model
 * @generated
 */
public interface OperationParam extends EObject {
	/**
	 * Returns the value of the '<em><b>Param Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Value</em>' attribute.
	 * @see #setParamValue(Object)
	 * @see edu.kit.ipd.sdq.mmm.MmmPackage#getOperationParam_ParamValue()
	 * @model
	 * @generated
	 */
	Object getParamValue();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.mmm.OperationParam#getParamValue <em>Param Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Value</em>' attribute.
	 * @see #getParamValue()
	 * @generated
	 */
	void setParamValue(Object value);

} // OperationParam
