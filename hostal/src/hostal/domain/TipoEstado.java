/**
 */
package hostal.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tipo Estado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.TipoEstado#getTipo <em>Tipo</em>}</li>
 *   <li>{@link hostal.domain.TipoEstado#getLstEstado <em>Lst Estado</em>}</li>
 * </ul>
 *
 * @see hostal.domain.DomainPackage#getTipoEstado()
 * @model
 * @generated
 */
public interface TipoEstado extends EObject {
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
	 * @see hostal.domain.DomainPackage#getTipoEstado_Tipo()
	 * @model dataType="hostal.String"
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link hostal.domain.TipoEstado#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Lst Estado</b></em>' reference list.
	 * The list contents are of type {@link hostal.domain.Estado}.
	 * It is bidirectional and its opposite is '{@link hostal.domain.Estado#getLstTipoEstado <em>Lst Tipo Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Estado</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Estado</em>' reference list.
	 * @see hostal.domain.DomainPackage#getTipoEstado_LstEstado()
	 * @see hostal.domain.Estado#getLstTipoEstado
	 * @model opposite="lstTipoEstado"
	 * @generated
	 */
	EList<Estado> getLstEstado();

} // TipoEstado
