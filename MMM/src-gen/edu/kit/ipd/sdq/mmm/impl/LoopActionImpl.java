/**
 */
package edu.kit.ipd.sdq.mmm.impl;

import edu.kit.ipd.sdq.mmm.LoopAction;
import edu.kit.ipd.sdq.mmm.MmmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.mmm.impl.LoopActionImpl#getLoopActionId <em>Loop Action Id</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.mmm.impl.LoopActionImpl#getExecutionNumber <em>Execution Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopActionImpl extends MinimalEObjectImpl.Container implements LoopAction {
	/**
	 * The default value of the '{@link #getLoopActionId() <em>Loop Action Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopActionId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOOP_ACTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoopActionId() <em>Loop Action Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopActionId()
	 * @generated
	 * @ordered
	 */
	protected String loopActionId = LOOP_ACTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionNumber() <em>Execution Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long EXECUTION_NUMBER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExecutionNumber() <em>Execution Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionNumber()
	 * @generated
	 * @ordered
	 */
	protected long executionNumber = EXECUTION_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmmPackage.Literals.LOOP_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoopActionId() {
		return loopActionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopActionId(String newLoopActionId) {
		String oldLoopActionId = loopActionId;
		loopActionId = newLoopActionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmmPackage.LOOP_ACTION__LOOP_ACTION_ID,
					oldLoopActionId, loopActionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getExecutionNumber() {
		return executionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionNumber(long newExecutionNumber) {
		long oldExecutionNumber = executionNumber;
		executionNumber = newExecutionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmmPackage.LOOP_ACTION__EXECUTION_NUMBER,
					oldExecutionNumber, executionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmmPackage.LOOP_ACTION__LOOP_ACTION_ID:
			return getLoopActionId();
		case MmmPackage.LOOP_ACTION__EXECUTION_NUMBER:
			return getExecutionNumber();
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
		case MmmPackage.LOOP_ACTION__LOOP_ACTION_ID:
			setLoopActionId((String) newValue);
			return;
		case MmmPackage.LOOP_ACTION__EXECUTION_NUMBER:
			setExecutionNumber((Long) newValue);
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
		case MmmPackage.LOOP_ACTION__LOOP_ACTION_ID:
			setLoopActionId(LOOP_ACTION_ID_EDEFAULT);
			return;
		case MmmPackage.LOOP_ACTION__EXECUTION_NUMBER:
			setExecutionNumber(EXECUTION_NUMBER_EDEFAULT);
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
		case MmmPackage.LOOP_ACTION__LOOP_ACTION_ID:
			return LOOP_ACTION_ID_EDEFAULT == null ? loopActionId != null
					: !LOOP_ACTION_ID_EDEFAULT.equals(loopActionId);
		case MmmPackage.LOOP_ACTION__EXECUTION_NUMBER:
			return executionNumber != EXECUTION_NUMBER_EDEFAULT;
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
		result.append(" (loopActionId: ");
		result.append(loopActionId);
		result.append(", executionNumber: ");
		result.append(executionNumber);
		result.append(')');
		return result.toString();
	}

} //LoopActionImpl
