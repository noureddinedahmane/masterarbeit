/**
 */
package edu.kit.ipd.sdq.mmm.impl;

import edu.kit.ipd.sdq.mmm.BranchAction;
import edu.kit.ipd.sdq.mmm.MmmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.mmm.impl.BranchActionImpl#getBranchActionId <em>Branch Action Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchActionImpl extends MinimalEObjectImpl.Container implements BranchAction {
	/**
	 * The default value of the '{@link #getBranchActionId() <em>Branch Action Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchActionId()
	 * @generated
	 * @ordered
	 */
	protected static final String BRANCH_ACTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBranchActionId() <em>Branch Action Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchActionId()
	 * @generated
	 * @ordered
	 */
	protected String branchActionId = BRANCH_ACTION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmmPackage.Literals.BRANCH_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBranchActionId() {
		return branchActionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranchActionId(String newBranchActionId) {
		String oldBranchActionId = branchActionId;
		branchActionId = newBranchActionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmmPackage.BRANCH_ACTION__BRANCH_ACTION_ID,
					oldBranchActionId, branchActionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmmPackage.BRANCH_ACTION__BRANCH_ACTION_ID:
			return getBranchActionId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MmmPackage.BRANCH_ACTION__BRANCH_ACTION_ID:
			setBranchActionId((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MmmPackage.BRANCH_ACTION__BRANCH_ACTION_ID:
			setBranchActionId(BRANCH_ACTION_ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MmmPackage.BRANCH_ACTION__BRANCH_ACTION_ID:
			return BRANCH_ACTION_ID_EDEFAULT == null ? branchActionId != null
					: !BRANCH_ACTION_ID_EDEFAULT.equals(branchActionId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (branchActionId: ");
		result.append(branchActionId);
		result.append(')');
		return result.toString();
	}

} //BranchActionImpl
