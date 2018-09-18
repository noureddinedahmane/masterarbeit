/**
 */
package edu.kit.ipd.sdq.mmm.impl;

import edu.kit.ipd.sdq.mmm.MmmPackage;
import edu.kit.ipd.sdq.mmm.Operation;
import edu.kit.ipd.sdq.mmm.OperationParam;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.mmm.impl.OperationImpl#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.mmm.impl.OperationImpl#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.mmm.impl.OperationImpl#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.mmm.impl.OperationImpl#getOperationparam <em>Operationparam</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation {
	/**
	 * The default value of the '{@link #getOperationId() <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationId()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationId() <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationId()
	 * @generated
	 * @ordered
	 */
	protected String operationId = OPERATION_ID_EDEFAULT;

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
	 * The default value of the '{@link #getReturnValue() <em>Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object RETURN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected Object returnValue = RETURN_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperationparam() <em>Operationparam</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationparam()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationParam> operationparam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmmPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationId() {
		return operationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationId(String newOperationId) {
		String oldOperationId = operationId;
		operationId = newOperationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmmPackage.OPERATION__OPERATION_ID, oldOperationId,
					operationId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmmPackage.OPERATION__EXECUTION_TIME,
					oldExecutionTime, executionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getReturnValue() {
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnValue(Object newReturnValue) {
		Object oldReturnValue = returnValue;
		returnValue = newReturnValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmmPackage.OPERATION__RETURN_VALUE, oldReturnValue,
					returnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationParam> getOperationparam() {
		if (operationparam == null) {
			operationparam = new EObjectContainmentEList<OperationParam>(OperationParam.class, this,
					MmmPackage.OPERATION__OPERATIONPARAM);
		}
		return operationparam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MmmPackage.OPERATION__OPERATIONPARAM:
			return ((InternalEList<?>) getOperationparam()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmmPackage.OPERATION__OPERATION_ID:
			return getOperationId();
		case MmmPackage.OPERATION__EXECUTION_TIME:
			return getExecutionTime();
		case MmmPackage.OPERATION__RETURN_VALUE:
			return getReturnValue();
		case MmmPackage.OPERATION__OPERATIONPARAM:
			return getOperationparam();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MmmPackage.OPERATION__OPERATION_ID:
			setOperationId((String) newValue);
			return;
		case MmmPackage.OPERATION__EXECUTION_TIME:
			setExecutionTime((Long) newValue);
			return;
		case MmmPackage.OPERATION__RETURN_VALUE:
			setReturnValue(newValue);
			return;
		case MmmPackage.OPERATION__OPERATIONPARAM:
			getOperationparam().clear();
			getOperationparam().addAll((Collection<? extends OperationParam>) newValue);
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
		case MmmPackage.OPERATION__OPERATION_ID:
			setOperationId(OPERATION_ID_EDEFAULT);
			return;
		case MmmPackage.OPERATION__EXECUTION_TIME:
			setExecutionTime(EXECUTION_TIME_EDEFAULT);
			return;
		case MmmPackage.OPERATION__RETURN_VALUE:
			setReturnValue(RETURN_VALUE_EDEFAULT);
			return;
		case MmmPackage.OPERATION__OPERATIONPARAM:
			getOperationparam().clear();
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
		case MmmPackage.OPERATION__OPERATION_ID:
			return OPERATION_ID_EDEFAULT == null ? operationId != null : !OPERATION_ID_EDEFAULT.equals(operationId);
		case MmmPackage.OPERATION__EXECUTION_TIME:
			return executionTime != EXECUTION_TIME_EDEFAULT;
		case MmmPackage.OPERATION__RETURN_VALUE:
			return RETURN_VALUE_EDEFAULT == null ? returnValue != null : !RETURN_VALUE_EDEFAULT.equals(returnValue);
		case MmmPackage.OPERATION__OPERATIONPARAM:
			return operationparam != null && !operationparam.isEmpty();
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
		result.append(" (operationId: ");
		result.append(operationId);
		result.append(", executionTime: ");
		result.append(executionTime);
		result.append(", returnValue: ");
		result.append(returnValue);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
