/**
 */
package edu.kit.ipd.sdq.mmm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see edu.kit.ipd.sdq.mmm.MmmFactory
 * @model kind="package"
 * @generated
 */
public interface MmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "operationId";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mmm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "operationId";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MmmPackage eINSTANCE = edu.kit.ipd.sdq.mmm.impl.MmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.mmm.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.mmm.impl.OperationImpl
	 * @see edu.kit.ipd.sdq.mmm.impl.MmmPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Operation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION_ID = 0;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EXECUTION_TIME = 1;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Operationparam</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATIONPARAM = 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.mmm.impl.InternalActionImpl <em>Internal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.mmm.impl.InternalActionImpl
	 * @see edu.kit.ipd.sdq.mmm.impl.MmmPackageImpl#getInternalAction()
	 * @generated
	 */
	int INTERNAL_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Internal Action Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__INTERNAL_ACTION_ID = 0;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__EXECUTION_TIME = 1;

	/**
	 * The number of structural features of the '<em>Internal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Internal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.mmm.impl.LoopActionImpl <em>Loop Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.mmm.impl.LoopActionImpl
	 * @see edu.kit.ipd.sdq.mmm.impl.MmmPackageImpl#getLoopAction()
	 * @generated
	 */
	int LOOP_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Loop Action Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__LOOP_ACTION_ID = 0;

	/**
	 * The feature id for the '<em><b>Execution Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__EXECUTION_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Loop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Loop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.mmm.impl.BranchActionImpl <em>Branch Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.mmm.impl.BranchActionImpl
	 * @see edu.kit.ipd.sdq.mmm.impl.MmmPackageImpl#getBranchAction()
	 * @generated
	 */
	int BRANCH_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Branch Action Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION__BRANCH_ACTION_ID = 0;

	/**
	 * The number of structural features of the '<em>Branch Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Branch Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.mmm.impl.OperationParamImpl <em>Operation Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.mmm.impl.OperationParamImpl
	 * @see edu.kit.ipd.sdq.mmm.impl.MmmPackageImpl#getOperationParam()
	 * @generated
	 */
	int OPERATION_PARAM = 4;

	/**
	 * The feature id for the '<em><b>Param Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAM__PARAM_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Operation Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operation Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAM_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.mmm.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see edu.kit.ipd.sdq.mmm.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.mmm.Operation#getOperationId <em>Operation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Id</em>'.
	 * @see edu.kit.ipd.sdq.mmm.Operation#getOperationId()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_OperationId();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.mmm.Operation#getExecutionTime <em>Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Time</em>'.
	 * @see edu.kit.ipd.sdq.mmm.Operation#getExecutionTime()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ExecutionTime();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.mmm.Operation#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Value</em>'.
	 * @see edu.kit.ipd.sdq.mmm.Operation#getReturnValue()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ReturnValue();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.mmm.Operation#getOperationparam <em>Operationparam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operationparam</em>'.
	 * @see edu.kit.ipd.sdq.mmm.Operation#getOperationparam()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Operationparam();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.mmm.InternalAction <em>Internal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Action</em>'.
	 * @see edu.kit.ipd.sdq.mmm.InternalAction
	 * @generated
	 */
	EClass getInternalAction();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.mmm.InternalAction#getInternalActionId <em>Internal Action Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Action Id</em>'.
	 * @see edu.kit.ipd.sdq.mmm.InternalAction#getInternalActionId()
	 * @see #getInternalAction()
	 * @generated
	 */
	EAttribute getInternalAction_InternalActionId();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.mmm.InternalAction#getExecutionTime <em>Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Time</em>'.
	 * @see edu.kit.ipd.sdq.mmm.InternalAction#getExecutionTime()
	 * @see #getInternalAction()
	 * @generated
	 */
	EAttribute getInternalAction_ExecutionTime();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.mmm.LoopAction <em>Loop Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Action</em>'.
	 * @see edu.kit.ipd.sdq.mmm.LoopAction
	 * @generated
	 */
	EClass getLoopAction();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.mmm.LoopAction#getLoopActionId <em>Loop Action Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Action Id</em>'.
	 * @see edu.kit.ipd.sdq.mmm.LoopAction#getLoopActionId()
	 * @see #getLoopAction()
	 * @generated
	 */
	EAttribute getLoopAction_LoopActionId();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.mmm.LoopAction#getExecutionNumber <em>Execution Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Number</em>'.
	 * @see edu.kit.ipd.sdq.mmm.LoopAction#getExecutionNumber()
	 * @see #getLoopAction()
	 * @generated
	 */
	EAttribute getLoopAction_ExecutionNumber();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.mmm.BranchAction <em>Branch Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Action</em>'.
	 * @see edu.kit.ipd.sdq.mmm.BranchAction
	 * @generated
	 */
	EClass getBranchAction();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.mmm.BranchAction#getBranchActionId <em>Branch Action Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch Action Id</em>'.
	 * @see edu.kit.ipd.sdq.mmm.BranchAction#getBranchActionId()
	 * @see #getBranchAction()
	 * @generated
	 */
	EAttribute getBranchAction_BranchActionId();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.mmm.OperationParam <em>Operation Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Param</em>'.
	 * @see edu.kit.ipd.sdq.mmm.OperationParam
	 * @generated
	 */
	EClass getOperationParam();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.mmm.OperationParam#getParamValue <em>Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Value</em>'.
	 * @see edu.kit.ipd.sdq.mmm.OperationParam#getParamValue()
	 * @see #getOperationParam()
	 * @generated
	 */
	EAttribute getOperationParam_ParamValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MmmFactory getMmmFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.mmm.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.mmm.impl.OperationImpl
		 * @see edu.kit.ipd.sdq.mmm.impl.MmmPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Operation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__OPERATION_ID = eINSTANCE.getOperation_OperationId();

		/**
		 * The meta object literal for the '<em><b>Execution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__EXECUTION_TIME = eINSTANCE.getOperation_ExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__RETURN_VALUE = eINSTANCE.getOperation_ReturnValue();

		/**
		 * The meta object literal for the '<em><b>Operationparam</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OPERATIONPARAM = eINSTANCE.getOperation_Operationparam();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.mmm.impl.InternalActionImpl <em>Internal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.mmm.impl.InternalActionImpl
		 * @see edu.kit.ipd.sdq.mmm.impl.MmmPackageImpl#getInternalAction()
		 * @generated
		 */
		EClass INTERNAL_ACTION = eINSTANCE.getInternalAction();

		/**
		 * The meta object literal for the '<em><b>Internal Action Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ACTION__INTERNAL_ACTION_ID = eINSTANCE.getInternalAction_InternalActionId();

		/**
		 * The meta object literal for the '<em><b>Execution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ACTION__EXECUTION_TIME = eINSTANCE.getInternalAction_ExecutionTime();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.mmm.impl.LoopActionImpl <em>Loop Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.mmm.impl.LoopActionImpl
		 * @see edu.kit.ipd.sdq.mmm.impl.MmmPackageImpl#getLoopAction()
		 * @generated
		 */
		EClass LOOP_ACTION = eINSTANCE.getLoopAction();

		/**
		 * The meta object literal for the '<em><b>Loop Action Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_ACTION__LOOP_ACTION_ID = eINSTANCE.getLoopAction_LoopActionId();

		/**
		 * The meta object literal for the '<em><b>Execution Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_ACTION__EXECUTION_NUMBER = eINSTANCE.getLoopAction_ExecutionNumber();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.mmm.impl.BranchActionImpl <em>Branch Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.mmm.impl.BranchActionImpl
		 * @see edu.kit.ipd.sdq.mmm.impl.MmmPackageImpl#getBranchAction()
		 * @generated
		 */
		EClass BRANCH_ACTION = eINSTANCE.getBranchAction();

		/**
		 * The meta object literal for the '<em><b>Branch Action Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_ACTION__BRANCH_ACTION_ID = eINSTANCE.getBranchAction_BranchActionId();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.mmm.impl.OperationParamImpl <em>Operation Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.mmm.impl.OperationParamImpl
		 * @see edu.kit.ipd.sdq.mmm.impl.MmmPackageImpl#getOperationParam()
		 * @generated
		 */
		EClass OPERATION_PARAM = eINSTANCE.getOperationParam();

		/**
		 * The meta object literal for the '<em><b>Param Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_PARAM__PARAM_VALUE = eINSTANCE.getOperationParam_ParamValue();

	}

} //MmmPackage
