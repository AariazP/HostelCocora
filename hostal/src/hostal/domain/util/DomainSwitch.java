/**
 */
package hostal.domain.util;

import hostal.domain.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hostal.domain.DomainPackage
 * @generated
 */
public class DomainSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DomainPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSwitch() {
		if (modelPackage == null) {
			modelPackage = DomainPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DomainPackage.CAMA: {
				Cama cama = (Cama)theEObject;
				T result = caseCama(cama);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.CAMA_DOBLE: {
				CamaDoble camaDoble = (CamaDoble)theEObject;
				T result = caseCamaDoble(camaDoble);
				if (result == null) result = caseCama(camaDoble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.CAMA_SENCILLA: {
				CamaSencilla camaSencilla = (CamaSencilla)theEObject;
				T result = caseCamaSencilla(camaSencilla);
				if (result == null) result = caseCama(camaSencilla);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.CLIENTE: {
				Cliente cliente = (Cliente)theEObject;
				T result = caseCliente(cliente);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ESTADO: {
				Estado estado = (Estado)theEObject;
				T result = caseEstado(estado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.HABITACION: {
				Habitacion habitacion = (Habitacion)theEObject;
				T result = caseHabitacion(habitacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.HABITACION_DOBLE: {
				HabitacionDoble habitacionDoble = (HabitacionDoble)theEObject;
				T result = caseHabitacionDoble(habitacionDoble);
				if (result == null) result = caseHabitacion(habitacionDoble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.HABITACION_SENCILLA: {
				HabitacionSencilla habitacionSencilla = (HabitacionSencilla)theEObject;
				T result = caseHabitacionSencilla(habitacionSencilla);
				if (result == null) result = caseHabitacion(habitacionSencilla);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.HOSTEL: {
				Hostel hostel = (Hostel)theEObject;
				T result = caseHostel(hostel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.TIPO_ESTADO: {
				TipoEstado tipoEstado = (TipoEstado)theEObject;
				T result = caseTipoEstado(tipoEstado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.TIPO_COBIJA: {
				TipoCobija tipoCobija = (TipoCobija)theEObject;
				T result = caseTipoCobija(tipoCobija);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cama</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cama</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCama(Cama object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cama Doble</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cama Doble</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamaDoble(CamaDoble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cama Sencilla</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cama Sencilla</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamaSencilla(CamaSencilla object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cliente</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cliente</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCliente(Cliente object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Estado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Estado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEstado(Estado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Habitacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Habitacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHabitacion(Habitacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Habitacion Doble</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Habitacion Doble</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHabitacionDoble(HabitacionDoble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Habitacion Sencilla</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Habitacion Sencilla</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHabitacionSencilla(HabitacionSencilla object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostel(Hostel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo Estado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo Estado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipoEstado(TipoEstado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo Cobija</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo Cobija</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipoCobija(TipoCobija object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DomainSwitch
