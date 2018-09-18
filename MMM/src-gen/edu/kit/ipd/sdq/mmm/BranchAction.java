/**
 */
package edu.kit.ipd.sdq.mmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.mmm.BranchAction#getBranchActionId <em>Branch Action Id</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.mmm.MmmPackage#getBranchAction()
 * @model
 * @generated
 */
public interface BranchAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Branch Action Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Action Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Action Id</em>' attribute.
	 * @see #setBranchActionId(String)
	 * @see edu.kit.ipd.sdq.mmm.MmmPackage#getBranchAction_BranchActionId()
	 * @model
	 * @generated
	 */
	String getBranchActionId();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.mmm.BranchAction#getBranchActionId <em>Branch Action Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Action Id</em>' attribute.
	 * @see #getBranchActionId()
	 * @generated
	 */
	void setBranchActionId(String value);

} // BranchAction
