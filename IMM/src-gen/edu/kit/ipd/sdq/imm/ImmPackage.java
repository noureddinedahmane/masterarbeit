/**
 */
package edu.kit.ipd.sdq.imm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.imm.ImmFactory
 * @model kind="package"
 * @generated
 */
public interface ImmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "probeId";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/imm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "probeId";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImmPackage eINSTANCE = edu.kit.ipd.sdq.imm.impl.ImmPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.imm.impl.ProbeImpl <em>Probe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.imm.impl.ProbeImpl
	 * @see edu.kit.ipd.sdq.imm.impl.ImmPackageImpl#getProbe()
	 * @generated
	 */
	int PROBE = 0;

	/**
	 * The feature id for the '<em><b>Probe Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE__PROBE_ID = 0;

	/**
	 * The feature id for the '<em><b>Probe Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE__PROBE_STATUS = 1;

	/**
	 * The number of structural features of the '<em>Probe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Probe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.imm.Probe <em>Probe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probe</em>'.
	 * @see edu.kit.ipd.sdq.imm.Probe
	 * @generated
	 */
	EClass getProbe();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.imm.Probe#getProbeId <em>Probe Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probe Id</em>'.
	 * @see edu.kit.ipd.sdq.imm.Probe#getProbeId()
	 * @see #getProbe()
	 * @generated
	 */
	EAttribute getProbe_ProbeId();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.imm.Probe#isProbeStatus <em>Probe Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probe Status</em>'.
	 * @see edu.kit.ipd.sdq.imm.Probe#isProbeStatus()
	 * @see #getProbe()
	 * @generated
	 */
	EAttribute getProbe_ProbeStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImmFactory getImmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.imm.impl.ProbeImpl <em>Probe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.imm.impl.ProbeImpl
		 * @see edu.kit.ipd.sdq.imm.impl.ImmPackageImpl#getProbe()
		 * @generated
		 */
		EClass PROBE = eINSTANCE.getProbe();

		/**
		 * The meta object literal for the '<em><b>Probe Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBE__PROBE_ID = eINSTANCE.getProbe_ProbeId();

		/**
		 * The meta object literal for the '<em><b>Probe Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBE__PROBE_STATUS = eINSTANCE.getProbe_ProbeStatus();

	}

} //ImmPackage
