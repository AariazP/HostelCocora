/**
 */
package hostal.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Estado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.Estado#getInicio <em>Inicio</em>}</li>
 *   <li>{@link hostal.domain.Estado#getFin <em>Fin</em>}</li>
 *   <li>{@link hostal.domain.Estado#getMotivo <em>Motivo</em>}</li>
 *   <li>{@link hostal.domain.Estado#getHabitacion <em>Habitacion</em>}</li>
 *   <li>{@link hostal.domain.Estado#getTipoEstado <em>Tipo Estado</em>}</li>
 *   <li>{@link hostal.domain.Estado#getLstTipoEstado <em>Lst Tipo Estado</em>}</li>
 * </ul>
 *
 * @see hostal.domain.DomainPackage#getEstado()
 * @model
 * @generated
 */
public interface Estado extends EObject {
	/**
	 * Returns the value of the '<em><b>Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inicio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inicio</em>' attribute.
	 * @see #setInicio(String)
	 * @see hostal.domain.DomainPackage#getEstado_Inicio()
	 * @model dataType="hostal.String"
	 * @generated
	 */
	String getInicio();

	/**
	 * Sets the value of the '{@link hostal.domain.Estado#getInicio <em>Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inicio</em>' attribute.
	 * @see #getInicio()
	 * @generated
	 */
	void setInicio(String value);

	/**
	 * Returns the value of the '<em><b>Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin</em>' attribute.
	 * @see #setFin(String)
	 * @see hostal.domain.DomainPackage#getEstado_Fin()
	 * @model dataType="hostal.String"
	 * @generated
	 */
	String getFin();

	/**
	 * Sets the value of the '{@link hostal.domain.Estado#getFin <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin</em>' attribute.
	 * @see #getFin()
	 * @generated
	 */
	void setFin(String value);

	/**
	 * Returns the value of the '<em><b>Motivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motivo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motivo</em>' attribute.
	 * @see #setMotivo(String)
	 * @see hostal.domain.DomainPackage#getEstado_Motivo()
	 * @model dataType="hostal.String"
	 * @generated
	 */
	String getMotivo();

	/**
	 * Sets the value of the '{@link hostal.domain.Estado#getMotivo <em>Motivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motivo</em>' attribute.
	 * @see #getMotivo()
	 * @generated
	 */
	void setMotivo(String value);

	/**
	 * Returns the value of the '<em><b>Habitacion</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hostal.domain.Habitacion#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Habitacion</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Habitacion</em>' container reference.
	 * @see #setHabitacion(Habitacion)
	 * @see hostal.domain.DomainPackage#getEstado_Habitacion()
	 * @see hostal.domain.Habitacion#getEstado
	 * @model opposite="estado" transient="false"
	 * @generated
	 */
	Habitacion getHabitacion();

	/**
	 * Sets the value of the '{@link hostal.domain.Estado#getHabitacion <em>Habitacion</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Habitacion</em>' container reference.
	 * @see #getHabitacion()
	 * @generated
	 */
	void setHabitacion(Habitacion value);

	/**
	 * Returns the value of the '<em><b>Tipo Estado</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Estado</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Estado</em>' containment reference.
	 * @see #setTipoEstado(TipoEstado)
	 * @see hostal.domain.DomainPackage#getEstado_TipoEstado()
	 * @model containment="true"
	 * @generated
	 */
	TipoEstado getTipoEstado();

	/**
	 * Sets the value of the '{@link hostal.domain.Estado#getTipoEstado <em>Tipo Estado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Estado</em>' containment reference.
	 * @see #getTipoEstado()
	 * @generated
	 */
	void setTipoEstado(TipoEstado value);

	/**
	 * Returns the value of the '<em><b>Lst Tipo Estado</b></em>' reference list.
	 * The list contents are of type {@link hostal.domain.TipoEstado}.
	 * It is bidirectional and its opposite is '{@link hostal.domain.TipoEstado#getLstEstado <em>Lst Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Tipo Estado</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Tipo Estado</em>' reference list.
	 * @see hostal.domain.DomainPackage#getEstado_LstTipoEstado()
	 * @see hostal.domain.TipoEstado#getLstEstado
	 * @model opposite="lstEstado"
	 * @generated
	 */
	EList<TipoEstado> getLstTipoEstado();

} // Estado
