/**
 */
package edu.kit.ipd.sdq.mmm.impl;

import edu.kit.ipd.sdq.mmm.InternalAction;
import edu.kit.ipd.sdq.mmm.MmmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.mmm.impl.InternalActionImpl#getInternalActionId <em>Internal Action Id</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.mmm.impl.InternalActionImpl#getExecutionTime <em>Execution Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalActionImpl extends MinimalEObjectImpl.Container implements InternalAction {
	/**
	 * The default value of the '{@link #getInternalActionId() <em>Internal Action Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalActionId()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNAL_ACTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalActionId() <em>Internal Action Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalActionId()
	 * @generated
	 * @ordered
	 */
	protected String internalActionId = INTERNAL_ACTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionTime() <em>Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected static final long EXECUTION_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExecutionTime() <em>Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected long executionTime = EXECUTION_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmmPackage.Literals.INTERNAL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternalActionId() {
		return internalActionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalActionId(String newInternalActionId) {
		String oldInternalActionId = internalActionId;
		internalActionId = newInternalActionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmmPackage.INTERNAL_ACTION__INTERNAL_ACTION_ID,
					oldInternalActionId, internalActionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getExecutionTime() {
		return executionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionTime(long newExecutionTime) {
		long oldExecutionTime = executionTime;
		executionTime = newExecutionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmmPackage.INTERNAL_ACTION__EXECUTION_TIME,
					oldExecutionTime, executionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmmPackage.INTERNAL_ACTION__INTERNAL_ACTION_ID:
			return getInternalActionId();
		case MmmPackage.INTERNAL_ACTION__EXECUTION_TIME:
			return getExecutionTime();
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
		case MmmPackage.INTERNAL_ACTION__INTERNAL_ACTION_ID:
			setInternalActionId((String) newValue);
			return;
		case MmmPackage.INTERNAL_ACTION__EXECUTION_TIME:
			setExecutionTime((Long) newValue);
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
		case MmmPackage.INTERNAL_ACTION__INTERNAL_ACTION_ID:
			setInternalActionId(INTERNAL_ACTION_ID_EDEFAULT);
			return;
		case MmmPackage.INTERNAL_ACTION__EXECUTION_TIME:
			setExecutionTime(EXECUTION_TIME_EDEFAULT);
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
		case MmmPackage.INTERNAL_ACTION__INTERNAL_ACTION_ID:
			return INTERNAL_ACTION_ID_EDEFAULT == null ? internalActionId != null
					: !INTERNAL_ACTION_ID_EDEFAULT.equals(internalActionId);
		case MmmPackage.INTERNAL_ACTION__EXECUTION_TIME:
			return executionTime != EXECUTION_TIME_EDEFAULT;
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
		result.append(" (internalActionId: ");
		result.append(internalActionId);
		result.append(", executionTime: ");
		result.append(executionTime);
		result.append(')');
		return result.toString();
	}

} //InternalActionImpl
