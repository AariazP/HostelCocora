/**
 */
package hostal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hostal.hostalFactory
 * @model kind="package"
 * @generated
 */
public interface hostalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hostal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///hostal.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hostal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	hostalPackage eINSTANCE = hostal.impl.hostalPackageImpl.init();

	/**
	 * The meta object id for the '{@link hostal.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hostal.impl.ModelFactoryImpl
	 * @see hostal.impl.hostalPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>The Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__THE_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__THE_UI = 1;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see hostal.impl.hostalPackageImpl#getString()
	 * @generated
	 */
	int STRING = 1;

	/**
	 * The meta object id for the '<em>EBoolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see hostal.impl.hostalPackageImpl#getEBooleanObject()
	 * @generated
	 */
	int EBOOLEAN_OBJECT = 2;

	/**
	 * The meta object id for the '<em>EDouble Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see hostal.impl.hostalPackageImpl#getEDoubleObject()
	 * @generated
	 */
	int EDOUBLE_OBJECT = 3;

	/**
	 * The meta object id for the '<em>EInteger Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see hostal.impl.hostalPackageImpl#getEIntegerObject()
	 * @generated
	 */
	int EINTEGER_OBJECT = 4;

	/**
	 * The meta object id for the '<em>EList</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.EList
	 * @see hostal.impl.hostalPackageImpl#getEList()
	 * @generated
	 */
	int ELIST = 5;

	/**
	 * The meta object id for the '<em>EChar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hostal.impl.hostalPackageImpl#getEChar()
	 * @generated
	 */
	int ECHAR = 6;

	/**
	 * The meta object id for the '<em>Array List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.ArrayList
	 * @see hostal.impl.hostalPackageImpl#getArrayList()
	 * @generated
	 */
	int ARRAY_LIST = 7;


	/**
	 * Returns the meta object for class '{@link hostal.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see hostal.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the containment reference '{@link hostal.ModelFactory#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Domain</em>'.
	 * @see hostal.ModelFactory#getTheDomain()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_TheDomain();

	/**
	 * Returns the meta object for the containment reference '{@link hostal.ModelFactory#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The UI</em>'.
	 * @see hostal.ModelFactory#getTheUI()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_TheUI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>EBoolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBoolean Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getEBooleanObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>EDouble Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDouble Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getEDoubleObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>EInteger Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInteger Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getEIntegerObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.EList <em>EList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EList</em>'.
	 * @see org.eclipse.emf.common.util.EList
	 * @model instanceClass="org.eclipse.emf.common.util.EList"
	 * @generated
	 */
	EDataType getEList();

	/**
	 * Returns the meta object for data type '<em>EChar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EChar</em>'.
	 * @model instanceClass="char"
	 * @generated
	 */
	EDataType getEChar();

	/**
	 * Returns the meta object for data type '{@link java.util.ArrayList <em>Array List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Array List</em>'.
	 * @see java.util.ArrayList
	 * @model instanceClass="java.util.ArrayList"
	 * @generated
	 */
	EDataType getArrayList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	hostalFactory gethostalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hostal.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hostal.impl.ModelFactoryImpl
		 * @see hostal.impl.hostalPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>The Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__THE_DOMAIN = eINSTANCE.getModelFactory_TheDomain();

		/**
		 * The meta object literal for the '<em><b>The UI</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__THE_UI = eINSTANCE.getModelFactory_TheUI();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see hostal.impl.hostalPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>EBoolean Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see hostal.impl.hostalPackageImpl#getEBooleanObject()
		 * @generated
		 */
		EDataType EBOOLEAN_OBJECT = eINSTANCE.getEBooleanObject();

		/**
		 * The meta object literal for the '<em>EDouble Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see hostal.impl.hostalPackageImpl#getEDoubleObject()
		 * @generated
		 */
		EDataType EDOUBLE_OBJECT = eINSTANCE.getEDoubleObject();

		/**
		 * The meta object literal for the '<em>EInteger Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see hostal.impl.hostalPackageImpl#getEIntegerObject()
		 * @generated
		 */
		EDataType EINTEGER_OBJECT = eINSTANCE.getEIntegerObject();

		/**
		 * The meta object literal for the '<em>EList</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.EList
		 * @see hostal.impl.hostalPackageImpl#getEList()
		 * @generated
		 */
		EDataType ELIST = eINSTANCE.getEList();

		/**
		 * The meta object literal for the '<em>EChar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hostal.impl.hostalPackageImpl#getEChar()
		 * @generated
		 */
		EDataType ECHAR = eINSTANCE.getEChar();

		/**
		 * The meta object literal for the '<em>Array List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.ArrayList
		 * @see hostal.impl.hostalPackageImpl#getArrayList()
		 * @generated
		 */
		EDataType ARRAY_LIST = eINSTANCE.getArrayList();

	}

} //hostalPackage
