/**
 */
package hostal.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.Cliente#getCedula <em>Cedula</em>}</li>
 *   <li>{@link hostal.domain.Cliente#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link hostal.domain.Cliente#getMovil <em>Movil</em>}</li>
 *   <li>{@link hostal.domain.Cliente#getEmail <em>Email</em>}</li>
 *   <li>{@link hostal.domain.Cliente#getHostel <em>Hostel</em>}</li>
 *   <li>{@link hostal.domain.Cliente#getListaHabitaciones <em>Lista Habitaciones</em>}</li>
 * </ul>
 *
 * @see hostal.domain.DomainPackage#getCliente()
 * @model abstract="true"
 * @generated
 */
public interface Cliente extends EObject {
	/**
	 * Returns the value of the '<em><b>Cedula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cedula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cedula</em>' attribute.
	 * @see #setCedula(String)
	 * @see hostal.domain.DomainPackage#getCliente_Cedula()
	 * @model dataType="hostal.String"
	 * @generated
	 */
	String getCedula();

	/**
	 * Sets the value of the '{@link hostal.domain.Cliente#getCedula <em>Cedula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cedula</em>' attribute.
	 * @see #getCedula()
	 * @generated
	 */
	void setCedula(String value);

	/**
	 * Returns the value of the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telefono</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefono</em>' attribute.
	 * @see #setTelefono(String)
	 * @see hostal.domain.DomainPackage#getCliente_Telefono()
	 * @model dataType="hostal.String"
	 * @generated
	 */
	String getTelefono();

	/**
	 * Sets the value of the '{@link hostal.domain.Cliente#getTelefono <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefono</em>' attribute.
	 * @see #getTelefono()
	 * @generated
	 */
	void setTelefono(String value);

	/**
	 * Returns the value of the '<em><b>Movil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movil</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movil</em>' attribute.
	 * @see #setMovil(String)
	 * @see hostal.domain.DomainPackage#getCliente_Movil()
	 * @model dataType="hostal.String"
	 * @generated
	 */
	String getMovil();

	/**
	 * Sets the value of the '{@link hostal.domain.Cliente#getMovil <em>Movil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movil</em>' attribute.
	 * @see #getMovil()
	 * @generated
	 */
	void setMovil(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see hostal.domain.DomainPackage#getCliente_Email()
	 * @model dataType="hostal.String"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link hostal.domain.Cliente#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Hostel</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hostal.domain.Hostel#getListaClientes <em>Lista Clientes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hostel</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostel</em>' container reference.
	 * @see #setHostel(Hostel)
	 * @see hostal.domain.DomainPackage#getCliente_Hostel()
	 * @see hostal.domain.Hostel#getListaClientes
	 * @model opposite="listaClientes" transient="false"
	 * @generated
	 */
	Hostel getHostel();

	/**
	 * Sets the value of the '{@link hostal.domain.Cliente#getHostel <em>Hostel</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostel</em>' container reference.
	 * @see #getHostel()
	 * @generated
	 */
	void setHostel(Hostel value);

	/**
	 * Returns the value of the '<em><b>Lista Habitaciones</b></em>' reference list.
	 * The list contents are of type {@link hostal.domain.Habitacion}.
	 * It is bidirectional and its opposite is '{@link hostal.domain.Habitacion#getCliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Habitaciones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Habitaciones</em>' reference list.
	 * @see hostal.domain.DomainPackage#getCliente_ListaHabitaciones()
	 * @see hostal.domain.Habitacion#getCliente
	 * @model opposite="cliente"
	 * @generated
	 */
	EList<Habitacion> getListaHabitaciones();

} // Cliente
