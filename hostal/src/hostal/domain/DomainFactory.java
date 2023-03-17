/**
 */
package hostal.domain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hostal.domain.DomainPackage
 * @generated
 */
public interface DomainFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainFactory eINSTANCE = hostal.domain.impl.DomainFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cama Doble</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cama Doble</em>'.
	 * @generated
	 */
	CamaDoble createCamaDoble();

	/**
	 * Returns a new object of class '<em>Cama Sencilla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cama Sencilla</em>'.
	 * @generated
	 */
	CamaSencilla createCamaSencilla();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>Estado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estado</em>'.
	 * @generated
	 */
	Estado createEstado();

	/**
	 * Returns a new object of class '<em>Habitacion Doble</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Habitacion Doble</em>'.
	 * @generated
	 */
	HabitacionDoble createHabitacionDoble();

	/**
	 * Returns a new object of class '<em>Habitacion Sencilla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Habitacion Sencilla</em>'.
	 * @generated
	 */
	HabitacionSencilla createHabitacionSencilla();

	/**
	 * Returns a new object of class '<em>Hostel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostel</em>'.
	 * @generated
	 */
	Hostel createHostel();

	/**
	 * Returns a new object of class '<em>Tipo Estado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tipo Estado</em>'.
	 * @generated
	 */
	TipoEstado createTipoEstado();

	/**
	 * Returns a new object of class '<em>Tipo Cobija</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tipo Cobija</em>'.
	 * @generated
	 */
	TipoCobija createTipoCobija();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DomainPackage getDomainPackage();

} //DomainFactory
