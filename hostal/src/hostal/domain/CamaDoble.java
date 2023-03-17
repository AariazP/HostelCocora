/**
 */
package hostal.domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cama Doble</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.CamaDoble#getMesaNoche <em>Mesa Noche</em>}</li>
 * </ul>
 *
 * @see hostal.domain.DomainPackage#getCamaDoble()
 * @model
 * @generated
 */
public interface CamaDoble extends Cama {
	/**
	 * Returns the value of the '<em><b>Mesa Noche</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesa Noche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesa Noche</em>' attribute.
	 * @see #setMesaNoche(Boolean)
	 * @see hostal.domain.DomainPackage#getCamaDoble_MesaNoche()
	 * @model default="false" dataType="hostal.EBooleanObject"
	 * @generated
	 */
	Boolean getMesaNoche();

	/**
	 * Sets the value of the '{@link hostal.domain.CamaDoble#getMesaNoche <em>Mesa Noche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesa Noche</em>' attribute.
	 * @see #getMesaNoche()
	 * @generated
	 */
	void setMesaNoche(Boolean value);

} // CamaDoble
