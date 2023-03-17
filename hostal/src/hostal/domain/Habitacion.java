/**
 */
package hostal.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Habitacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.Habitacion#getCliente <em>Cliente</em>}</li>
 *   <li>{@link hostal.domain.Habitacion#getEstado <em>Estado</em>}</li>
 *   <li>{@link hostal.domain.Habitacion#getBanio <em>Banio</em>}</li>
 *   <li>{@link hostal.domain.Habitacion#getInternet <em>Internet</em>}</li>
 *   <li>{@link hostal.domain.Habitacion#getNumHabitacion <em>Num Habitacion</em>}</li>
 *   <li>{@link hostal.domain.Habitacion#getParking <em>Parking</em>}</li>
 *   <li>{@link hostal.domain.Habitacion#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link hostal.domain.Habitacion#getCama <em>Cama</em>}</li>
 *   <li>{@link hostal.domain.Habitacion#getLstCamaSencilla <em>Lst Cama Sencilla</em>}</li>
 *   <li>{@link hostal.domain.Habitacion#getHostel <em>Hostel</em>}</li>
 * </ul>
 *
 * @see hostal.domain.DomainPackage#getHabitacion()
 * @model abstract="true"
 * @generated
 */
public interface Habitacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Cliente</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hostal.domain.Cliente#getListaHabitaciones <em>Lista Habitaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cliente</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cliente</em>' reference.
	 * @see #setCliente(Cliente)
	 * @see hostal.domain.DomainPackage#getHabitacion_Cliente()
	 * @see hostal.domain.Cliente#getListaHabitaciones
	 * @model opposite="listaHabitaciones"
	 * @generated
	 */
	Cliente getCliente();

	/**
	 * Sets the value of the '{@link hostal.domain.Habitacion#getCliente <em>Cliente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cliente</em>' reference.
	 * @see #getCliente()
	 * @generated
	 */
	void setCliente(Cliente value);

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link hostal.domain.Estado#getHabitacion <em>Habitacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' containment reference.
	 * @see #setEstado(Estado)
	 * @see hostal.domain.DomainPackage#getHabitacion_Estado()
	 * @see hostal.domain.Estado#getHabitacion
	 * @model opposite="habitacion" containment="true"
	 * @generated
	 */
	Estado getEstado();

	/**
	 * Sets the value of the '{@link hostal.domain.Habitacion#getEstado <em>Estado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' containment reference.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(Estado value);

	/**
	 * Returns the value of the '<em><b>Banio</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Banio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Banio</em>' attribute.
	 * @see #setBanio(Boolean)
	 * @see hostal.domain.DomainPackage#getHabitacion_Banio()
	 * @model default="false" dataType="hostal.EBooleanObject"
	 * @generated
	 */
	Boolean getBanio();

	/**
	 * Sets the value of the '{@link hostal.domain.Habitacion#getBanio <em>Banio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Banio</em>' attribute.
	 * @see #getBanio()
	 * @generated
	 */
	void setBanio(Boolean value);

	/**
	 * Returns the value of the '<em><b>Internet</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internet</em>' attribute.
	 * @see #setInternet(Boolean)
	 * @see hostal.domain.DomainPackage#getHabitacion_Internet()
	 * @model default="false" dataType="hostal.EBooleanObject"
	 * @generated
	 */
	Boolean getInternet();

	/**
	 * Sets the value of the '{@link hostal.domain.Habitacion#getInternet <em>Internet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internet</em>' attribute.
	 * @see #getInternet()
	 * @generated
	 */
	void setInternet(Boolean value);

	/**
	 * Returns the value of the '<em><b>Num Habitacion</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Habitacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Habitacion</em>' attribute.
	 * @see #setNumHabitacion(Integer)
	 * @see hostal.domain.DomainPackage#getHabitacion_NumHabitacion()
	 * @model default="0" dataType="hostal.EIntegerObject"
	 * @generated
	 */
	Integer getNumHabitacion();

	/**
	 * Sets the value of the '{@link hostal.domain.Habitacion#getNumHabitacion <em>Num Habitacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Habitacion</em>' attribute.
	 * @see #getNumHabitacion()
	 * @generated
	 */
	void setNumHabitacion(Integer value);

	/**
	 * Returns the value of the '<em><b>Parking</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parking</em>' attribute.
	 * @see #setParking(Boolean)
	 * @see hostal.domain.DomainPackage#getHabitacion_Parking()
	 * @model default="false" dataType="hostal.EBooleanObject"
	 * @generated
	 */
	Boolean getParking();

	/**
	 * Sets the value of the '{@link hostal.domain.Habitacion#getParking <em>Parking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parking</em>' attribute.
	 * @see #getParking()
	 * @generated
	 */
	void setParking(Boolean value);

	/**
	 * Returns the value of the '<em><b>Telefono</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telefono</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefono</em>' attribute.
	 * @see #setTelefono(Boolean)
	 * @see hostal.domain.DomainPackage#getHabitacion_Telefono()
	 * @model default="false" dataType="hostal.EBooleanObject"
	 * @generated
	 */
	Boolean getTelefono();

	/**
	 * Sets the value of the '{@link hostal.domain.Habitacion#getTelefono <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefono</em>' attribute.
	 * @see #getTelefono()
	 * @generated
	 */
	void setTelefono(Boolean value);

	/**
	 * Returns the value of the '<em><b>Cama</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hostal.domain.Cama#getHabitacion <em>Habitacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cama</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cama</em>' reference.
	 * @see #setCama(Cama)
	 * @see hostal.domain.DomainPackage#getHabitacion_Cama()
	 * @see hostal.domain.Cama#getHabitacion
	 * @model opposite="habitacion"
	 * @generated
	 */
	Cama getCama();

	/**
	 * Sets the value of the '{@link hostal.domain.Habitacion#getCama <em>Cama</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cama</em>' reference.
	 * @see #getCama()
	 * @generated
	 */
	void setCama(Cama value);

	/**
	 * Returns the value of the '<em><b>Lst Cama Sencilla</b></em>' reference list.
	 * The list contents are of type {@link hostal.domain.HabitacionSencilla}.
	 * It is bidirectional and its opposite is '{@link hostal.domain.HabitacionSencilla#getLstHabitacion <em>Lst Habitacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Cama Sencilla</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Cama Sencilla</em>' reference list.
	 * @see hostal.domain.DomainPackage#getHabitacion_LstCamaSencilla()
	 * @see hostal.domain.HabitacionSencilla#getLstHabitacion
	 * @model opposite="lstHabitacion"
	 * @generated
	 */
	EList<HabitacionSencilla> getLstCamaSencilla();

	/**
	 * Returns the value of the '<em><b>Hostel</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hostal.domain.Hostel#getListaHabitaciones <em>Lista Habitaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hostel</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostel</em>' container reference.
	 * @see #setHostel(Hostel)
	 * @see hostal.domain.DomainPackage#getHabitacion_Hostel()
	 * @see hostal.domain.Hostel#getListaHabitaciones
	 * @model opposite="listaHabitaciones" transient="false"
	 * @generated
	 */
	Hostel getHostel();

	/**
	 * Sets the value of the '{@link hostal.domain.Habitacion#getHostel <em>Hostel</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostel</em>' container reference.
	 * @see #getHostel()
	 * @generated
	 */
	void setHostel(Hostel value);

} // Habitacion
