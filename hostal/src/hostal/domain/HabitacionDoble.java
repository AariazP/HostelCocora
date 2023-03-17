/**
 */
package hostal.domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Habitacion Doble</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.HabitacionDoble#getJacuzzi <em>Jacuzzi</em>}</li>
 *   <li>{@link hostal.domain.HabitacionDoble#getTvHD <em>Tv HD</em>}</li>
 * </ul>
 *
 * @see hostal.domain.DomainPackage#getHabitacionDoble()
 * @model
 * @generated
 */
public interface HabitacionDoble extends Habitacion {
	/**
	 * Returns the value of the '<em><b>Jacuzzi</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jacuzzi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jacuzzi</em>' attribute.
	 * @see #setJacuzzi(Boolean)
	 * @see hostal.domain.DomainPackage#getHabitacionDoble_Jacuzzi()
	 * @model default="false" dataType="hostal.EBooleanObject"
	 * @generated
	 */
	Boolean getJacuzzi();

	/**
	 * Sets the value of the '{@link hostal.domain.HabitacionDoble#getJacuzzi <em>Jacuzzi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jacuzzi</em>' attribute.
	 * @see #getJacuzzi()
	 * @generated
	 */
	void setJacuzzi(Boolean value);

	/**
	 * Returns the value of the '<em><b>Tv HD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tv HD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tv HD</em>' attribute.
	 * @see #setTvHD(String)
	 * @see hostal.domain.DomainPackage#getHabitacionDoble_TvHD()
	 * @model dataType="hostal.String"
	 * @generated
	 */
	String getTvHD();

	/**
	 * Sets the value of the '{@link hostal.domain.HabitacionDoble#getTvHD <em>Tv HD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tv HD</em>' attribute.
	 * @see #getTvHD()
	 * @generated
	 */
	void setTvHD(String value);

} // HabitacionDoble
