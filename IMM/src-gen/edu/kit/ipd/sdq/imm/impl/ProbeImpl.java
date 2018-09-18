/**
 */
package edu.kit.ipd.sdq.imm.impl;

import edu.kit.ipd.sdq.imm.ImmPackage;
import edu.kit.ipd.sdq.imm.Probe;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.imm.impl.ProbeImpl#getProbeId <em>Probe Id</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.imm.impl.ProbeImpl#isProbeStatus <em>Probe Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProbeImpl extends MinimalEObjectImpl.Container implements Probe {
	/**
	 * The default value of the '{@link #getProbeId() <em>Probe Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROBE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProbeId() <em>Probe Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbeId()
	 * @generated
	 * @ordered
	 */
	protected String probeId = PROBE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isProbeStatus() <em>Probe Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProbeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROBE_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProbeStatus() <em>Probe Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProbeStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean probeStatus = PROBE_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImmPackage.Literals.PROBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProbeId() {
		return probeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbeId(String newProbeId) {
		String oldProbeId = probeId;
		probeId = newProbeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImmPackage.PROBE__PROBE_ID, oldProbeId, probeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProbeStatus() {
		return probeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbeStatus(boolean newProbeStatus) {
		boolean oldProbeStatus = probeStatus;
		probeStatus = newProbeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImmPackage.PROBE__PROBE_STATUS, oldProbeStatus,
					probeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ImmPackage.PROBE__PROBE_ID:
			return getProbeId();
		case ImmPackage.PROBE__PROBE_STATUS:
			return isProbeStatus();
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
		case ImmPackage.PROBE__PROBE_ID:
			setProbeId((String) newValue);
			return;
		case ImmPackage.PROBE__PROBE_STATUS:
			setProbeStatus((Boolean) newValue);
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
		case ImmPackage.PROBE__PROBE_ID:
			setProbeId(PROBE_ID_EDEFAULT);
			return;
		case ImmPackage.PROBE__PROBE_STATUS:
			setProbeStatus(PROBE_STATUS_EDEFAULT);
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
		case ImmPackage.PROBE__PROBE_ID:
			return PROBE_ID_EDEFAULT == null ? probeId != null : !PROBE_ID_EDEFAULT.equals(probeId);
		case ImmPackage.PROBE__PROBE_STATUS:
			return probeStatus != PROBE_STATUS_EDEFAULT;
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
		result.append(" (probeId: ");
		result.append(probeId);
		result.append(", probeStatus: ");
		result.append(probeStatus);
		result.append(')');
		return result.toString();
	}

} //ProbeImpl
