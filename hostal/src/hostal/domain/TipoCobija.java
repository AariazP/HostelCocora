/**
 */
package hostal.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tipo Cobija</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.TipoCobija#getCama <em>Cama</em>}</li>
 *   <li>{@link hostal.domain.TipoCobija#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see hostal.domain.DomainPackage#getTipoCobija()
 * @model
 * @generated
 */
public interface TipoCobija extends EObject {
	/**
	 * Returns the value of the '<em><b>Cama</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hostal.domain.Cama#getTipoCobija <em>Tipo Cobija</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cama</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cama</em>' reference.
	 * @see #setCama(Cama)
	 * @see hostal.domain.DomainPackage#getTipoCobija_Cama()
	 * @see hostal.domain.Cama#getTipoCobija
	 * @model opposite="tipoCobija"
	 * @generated
	 */
	Cama getCama();

	/**
	 * Sets the value of the '{@link hostal.domain.TipoCobija#getCama <em>Cama</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cama</em>' reference.
	 * @see #getCama()
	 * @generated
	 */
	void setCama(Cama value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see hostal.domain.DomainPackage#getTipoCobija_Tipo()
	 * @model dataType="hostal.String"
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link hostal.domain.TipoCobija#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

} // TipoCobija
