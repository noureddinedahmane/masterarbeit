/**
 */
package edu.kit.ipd.sdq.imm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.imm.Probe#getProbeId <em>Probe Id</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.imm.Probe#isProbeStatus <em>Probe Status</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.imm.ImmPackage#getProbe()
 * @model
 * @generated
 */
public interface Probe extends EObject {
	/**
	 * Returns the value of the '<em><b>Probe Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probe Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probe Id</em>' attribute.
	 * @see #setProbeId(String)
	 * @see edu.kit.ipd.sdq.imm.ImmPackage#getProbe_ProbeId()
	 * @model
	 * @generated
	 */
	String getProbeId();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.imm.Probe#getProbeId <em>Probe Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probe Id</em>' attribute.
	 * @see #getProbeId()
	 * @generated
	 */
	void setProbeId(String value);

	/**
	 * Returns the value of the '<em><b>Probe Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probe Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probe Status</em>' attribute.
	 * @see #setProbeStatus(boolean)
	 * @see edu.kit.ipd.sdq.imm.ImmPackage#getProbe_ProbeStatus()
	 * @model
	 * @generated
	 */
	boolean isProbeStatus();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.imm.Probe#isProbeStatus <em>Probe Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probe Status</em>' attribute.
	 * @see #isProbeStatus()
	 * @generated
	 */
	void setProbeStatus(boolean value);

} // Probe
