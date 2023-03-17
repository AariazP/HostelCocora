/**
 */
package hostal.domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Habitacion Sencilla</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.HabitacionSencilla#getAguaCaliente <em>Agua Caliente</em>}</li>
 *   <li>{@link hostal.domain.HabitacionSencilla#getTvLCD <em>Tv LCD</em>}</li>
 *   <li>{@link hostal.domain.HabitacionSencilla#getLstHabitacion <em>Lst Habitacion</em>}</li>
 * </ul>
 *
 * @see hostal.domain.DomainPackage#getHabitacionSencilla()
 * @model
 * @generated
 */
public interface HabitacionSencilla extends Habitacion {
	/**
	 * Returns the value of the '<em><b>Agua Caliente</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agua Caliente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agua Caliente</em>' attribute.
	 * @see #setAguaCaliente(Boolean)
	 * @see hostal.domain.DomainPackage#getHabitacionSencilla_AguaCaliente()
	 * @model default="false" dataType="hostal.EBooleanObject"
	 * @generated
	 */
	Boolean getAguaCaliente();

	/**
	 * Sets the value of the '{@link hostal.domain.HabitacionSencilla#getAguaCaliente <em>Agua Caliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agua Caliente</em>' attribute.
	 * @see #getAguaCaliente()
	 * @generated
	 */
	void setAguaCaliente(Boolean value);

	/**
	 * Returns the value of the '<em><b>Tv LCD</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tv LCD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tv LCD</em>' attribute.
	 * @see #setTvLCD(Boolean)
	 * @see hostal.domain.DomainPackage#getHabitacionSencilla_TvLCD()
	 * @model default="false" dataType="hostal.EBooleanObject"
	 * @generated
	 */
	Boolean getTvLCD();

	/**
	 * Sets the value of the '{@link hostal.domain.HabitacionSencilla#getTvLCD <em>Tv LCD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tv LCD</em>' attribute.
	 * @see #getTvLCD()
	 * @generated
	 */
	void setTvLCD(Boolean value);

	/**
	 * Returns the value of the '<em><b>Lst Habitacion</b></em>' reference list.
	 * The list contents are of type {@link hostal.domain.Habitacion}.
	 * It is bidirectional and its opposite is '{@link hostal.domain.Habitacion#getLstCamaSencilla <em>Lst Cama Sencilla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Habitacion</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Habitacion</em>' reference list.
	 * @see hostal.domain.DomainPackage#getHabitacionSencilla_LstHabitacion()
	 * @see hostal.domain.Habitacion#getLstCamaSencilla
	 * @model opposite="lstCamaSencilla"
	 * @generated
	 */
	EList<Habitacion> getLstHabitacion();

} // HabitacionSencilla
