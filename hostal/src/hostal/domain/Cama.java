/**
 */
package hostal.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cama</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.Cama#getLargo <em>Largo</em>}</li>
 *   <li>{@link hostal.domain.Cama#getAncho <em>Ancho</em>}</li>
 *   <li>{@link hostal.domain.Cama#getAlmohada <em>Almohada</em>}</li>
 *   <li>{@link hostal.domain.Cama#getHostel <em>Hostel</em>}</li>
 *   <li>{@link hostal.domain.Cama#getTipoCobija <em>Tipo Cobija</em>}</li>
 *   <li>{@link hostal.domain.Cama#getHabitacion <em>Habitacion</em>}</li>
 * </ul>
 *
 * @see hostal.domain.DomainPackage#getCama()
 * @model abstract="true"
 * @generated
 */
public interface Cama extends EObject {
	/**
	 * Returns the value of the '<em><b>Largo</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largo</em>' attribute.
	 * @see #setLargo(Double)
	 * @see hostal.domain.DomainPackage#getCama_Largo()
	 * @model default="0" dataType="hostal.EDoubleObject"
	 * @generated
	 */
	Double getLargo();

	/**
	 * Sets the value of the '{@link hostal.domain.Cama#getLargo <em>Largo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largo</em>' attribute.
	 * @see #getLargo()
	 * @generated
	 */
	void setLargo(Double value);

	/**
	 * Returns the value of the '<em><b>Ancho</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ancho</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ancho</em>' attribute.
	 * @see #setAncho(Double)
	 * @see hostal.domain.DomainPackage#getCama_Ancho()
	 * @model default="0" dataType="hostal.EDoubleObject"
	 * @generated
	 */
	Double getAncho();

	/**
	 * Sets the value of the '{@link hostal.domain.Cama#getAncho <em>Ancho</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ancho</em>' attribute.
	 * @see #getAncho()
	 * @generated
	 */
	void setAncho(Double value);

	/**
	 * Returns the value of the '<em><b>Almohada</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Almohada</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Almohada</em>' attribute.
	 * @see #setAlmohada(Boolean)
	 * @see hostal.domain.DomainPackage#getCama_Almohada()
	 * @model default="false" dataType="hostal.EBooleanObject"
	 * @generated
	 */
	Boolean getAlmohada();

	/**
	 * Sets the value of the '{@link hostal.domain.Cama#getAlmohada <em>Almohada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Almohada</em>' attribute.
	 * @see #getAlmohada()
	 * @generated
	 */
	void setAlmohada(Boolean value);

	/**
	 * Returns the value of the '<em><b>Hostel</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hostal.domain.Hostel#getListaCama <em>Lista Cama</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hostel</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostel</em>' container reference.
	 * @see #setHostel(Hostel)
	 * @see hostal.domain.DomainPackage#getCama_Hostel()
	 * @see hostal.domain.Hostel#getListaCama
	 * @model opposite="listaCama" transient="false"
	 * @generated
	 */
	Hostel getHostel();

	/**
	 * Sets the value of the '{@link hostal.domain.Cama#getHostel <em>Hostel</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostel</em>' container reference.
	 * @see #getHostel()
	 * @generated
	 */
	void setHostel(Hostel value);

	/**
	 * Returns the value of the '<em><b>Tipo Cobija</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hostal.domain.TipoCobija#getCama <em>Cama</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Cobija</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Cobija</em>' reference.
	 * @see #setTipoCobija(TipoCobija)
	 * @see hostal.domain.DomainPackage#getCama_TipoCobija()
	 * @see hostal.domain.TipoCobija#getCama
	 * @model opposite="cama"
	 * @generated
	 */
	TipoCobija getTipoCobija();

	/**
	 * Sets the value of the '{@link hostal.domain.Cama#getTipoCobija <em>Tipo Cobija</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Cobija</em>' reference.
	 * @see #getTipoCobija()
	 * @generated
	 */
	void setTipoCobija(TipoCobija value);

	/**
	 * Returns the value of the '<em><b>Habitacion</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hostal.domain.Habitacion#getCama <em>Cama</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Habitacion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Habitacion</em>' reference.
	 * @see #setHabitacion(Habitacion)
	 * @see hostal.domain.DomainPackage#getCama_Habitacion()
	 * @see hostal.domain.Habitacion#getCama
	 * @model opposite="cama"
	 * @generated
	 */
	Habitacion getHabitacion();

	/**
	 * Sets the value of the '{@link hostal.domain.Cama#getHabitacion <em>Habitacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Habitacion</em>' reference.
	 * @see #getHabitacion()
	 * @generated
	 */
	void setHabitacion(Habitacion value);

} // Cama
