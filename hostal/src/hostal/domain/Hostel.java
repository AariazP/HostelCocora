/**
 */
package hostal.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hostel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.Hostel#getListaCama <em>Lista Cama</em>}</li>
 *   <li>{@link hostal.domain.Hostel#getListaClientes <em>Lista Clientes</em>}</li>
 *   <li>{@link hostal.domain.Hostel#getNombre <em>Nombre</em>}</li>
 *   <li>{@link hostal.domain.Hostel#getLstDomain <em>Lst Domain</em>}</li>
 *   <li>{@link hostal.domain.Hostel#getListaHabitaciones <em>Lista Habitaciones</em>}</li>
 * </ul>
 *
 * @see hostal.domain.DomainPackage#getHostel()
 * @model
 * @generated
 */
public interface Hostel extends EObject {
	/**
	 * Returns the value of the '<em><b>Lista Cama</b></em>' containment reference list.
	 * The list contents are of type {@link hostal.domain.Cama}.
	 * It is bidirectional and its opposite is '{@link hostal.domain.Cama#getHostel <em>Hostel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Cama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Cama</em>' containment reference list.
	 * @see hostal.domain.DomainPackage#getHostel_ListaCama()
	 * @see hostal.domain.Cama#getHostel
	 * @model opposite="hostel" containment="true"
	 * @generated
	 */
	EList<Cama> getListaCama();

	/**
	 * Returns the value of the '<em><b>Lista Clientes</b></em>' containment reference list.
	 * The list contents are of type {@link hostal.domain.Cliente}.
	 * It is bidirectional and its opposite is '{@link hostal.domain.Cliente#getHostel <em>Hostel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Clientes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Clientes</em>' containment reference list.
	 * @see hostal.domain.DomainPackage#getHostel_ListaClientes()
	 * @see hostal.domain.Cliente#getHostel
	 * @model opposite="hostel" containment="true"
	 * @generated
	 */
	EList<Cliente> getListaClientes();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see hostal.domain.DomainPackage#getHostel_Nombre()
	 * @model dataType="hostal.String"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link hostal.domain.Hostel#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Lst Domain</b></em>' reference list.
	 * The list contents are of type {@link hostal.domain.Domain}.
	 * It is bidirectional and its opposite is '{@link hostal.domain.Domain#getLstHostel <em>Lst Hostel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Domain</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Domain</em>' reference list.
	 * @see hostal.domain.DomainPackage#getHostel_LstDomain()
	 * @see hostal.domain.Domain#getLstHostel
	 * @model opposite="lstHostel"
	 * @generated
	 */
	EList<Domain> getLstDomain();

	/**
	 * Returns the value of the '<em><b>Lista Habitaciones</b></em>' containment reference list.
	 * The list contents are of type {@link hostal.domain.Habitacion}.
	 * It is bidirectional and its opposite is '{@link hostal.domain.Habitacion#getHostel <em>Hostel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Habitaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Habitaciones</em>' containment reference list.
	 * @see hostal.domain.DomainPackage#getHostel_ListaHabitaciones()
	 * @see hostal.domain.Habitacion#getHostel
	 * @model opposite="hostel" containment="true"
	 * @generated
	 */
	EList<Habitacion> getListaHabitaciones();

} // Hostel
