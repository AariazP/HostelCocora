/**
 */
package hostal.domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cama Sencilla</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.CamaSencilla#getMesita <em>Mesita</em>}</li>
 * </ul>
 *
 * @see hostal.domain.DomainPackage#getCamaSencilla()
 * @model
 * @generated
 */
public interface CamaSencilla extends Cama {
	/**
	 * Returns the value of the '<em><b>Mesita</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesita</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesita</em>' attribute.
	 * @see #setMesita(Boolean)
	 * @see hostal.domain.DomainPackage#getCamaSencilla_Mesita()
	 * @model default="false" dataType="hostal.EBooleanObject"
	 * @generated
	 */
	Boolean getMesita();

	/**
	 * Sets the value of the '{@link hostal.domain.CamaSencilla#getMesita <em>Mesita</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesita</em>' attribute.
	 * @see #getMesita()
	 * @generated
	 */
	void setMesita(Boolean value);

} // CamaSencilla
