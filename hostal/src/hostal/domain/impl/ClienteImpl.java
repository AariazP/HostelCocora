/**
 */
package hostal.domain.impl;

import hostal.domain.Cliente;
import hostal.domain.DomainPackage;
import hostal.domain.Habitacion;
import hostal.domain.Hostel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.impl.ClienteImpl#getCedula <em>Cedula</em>}</li>
 *   <li>{@link hostal.domain.impl.ClienteImpl#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link hostal.domain.impl.ClienteImpl#getMovil <em>Movil</em>}</li>
 *   <li>{@link hostal.domain.impl.ClienteImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link hostal.domain.impl.ClienteImpl#getHostel <em>Hostel</em>}</li>
 *   <li>{@link hostal.domain.impl.ClienteImpl#getListaHabitaciones <em>Lista Habitaciones</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClienteImpl extends EObjectImpl implements Cliente {
	/**
	 * The default value of the '{@link #getCedula() <em>Cedula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCedula()
	 * @generated
	 * @ordered
	 */
	protected static final String CEDULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCedula() <em>Cedula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCedula()
	 * @generated
	 * @ordered
	 */
	protected String cedula = CEDULA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEFONO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected String telefono = TELEFONO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMovil() <em>Movil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovil()
	 * @generated
	 * @ordered
	 */
	protected static final String MOVIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMovil() <em>Movil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovil()
	 * @generated
	 * @ordered
	 */
	protected String movil = MOVIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListaHabitaciones() <em>Lista Habitaciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaHabitaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Habitacion> listaHabitaciones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClienteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.CLIENTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCedula(String newCedula) {
		String oldCedula = cedula;
		cedula = newCedula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLIENTE__CEDULA, oldCedula, cedula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelefono(String newTelefono) {
		String oldTelefono = telefono;
		telefono = newTelefono;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLIENTE__TELEFONO, oldTelefono, telefono));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMovil() {
		return movil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovil(String newMovil) {
		String oldMovil = movil;
		movil = newMovil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLIENTE__MOVIL, oldMovil, movil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLIENTE__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostel getHostel() {
		if (eContainerFeatureID() != DomainPackage.CLIENTE__HOSTEL) return null;
		return (Hostel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHostel(Hostel newHostel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHostel, DomainPackage.CLIENTE__HOSTEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostel(Hostel newHostel) {
		if (newHostel != eInternalContainer() || (eContainerFeatureID() != DomainPackage.CLIENTE__HOSTEL && newHostel != null)) {
			if (EcoreUtil.isAncestor(this, newHostel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHostel != null)
				msgs = ((InternalEObject)newHostel).eInverseAdd(this, DomainPackage.HOSTEL__LISTA_CLIENTES, Hostel.class, msgs);
			msgs = basicSetHostel(newHostel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLIENTE__HOSTEL, newHostel, newHostel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Habitacion> getListaHabitaciones() {
		if (listaHabitaciones == null) {
			listaHabitaciones = new EObjectWithInverseResolvingEList<Habitacion>(Habitacion.class, this, DomainPackage.CLIENTE__LISTA_HABITACIONES, DomainPackage.HABITACION__CLIENTE);
		}
		return listaHabitaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.CLIENTE__HOSTEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHostel((Hostel)otherEnd, msgs);
			case DomainPackage.CLIENTE__LISTA_HABITACIONES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaHabitaciones()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.CLIENTE__HOSTEL:
				return basicSetHostel(null, msgs);
			case DomainPackage.CLIENTE__LISTA_HABITACIONES:
				return ((InternalEList<?>)getListaHabitaciones()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DomainPackage.CLIENTE__HOSTEL:
				return eInternalContainer().eInverseRemove(this, DomainPackage.HOSTEL__LISTA_CLIENTES, Hostel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.CLIENTE__CEDULA:
				return getCedula();
			case DomainPackage.CLIENTE__TELEFONO:
				return getTelefono();
			case DomainPackage.CLIENTE__MOVIL:
				return getMovil();
			case DomainPackage.CLIENTE__EMAIL:
				return getEmail();
			case DomainPackage.CLIENTE__HOSTEL:
				return getHostel();
			case DomainPackage.CLIENTE__LISTA_HABITACIONES:
				return getListaHabitaciones();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomainPackage.CLIENTE__CEDULA:
				setCedula((String)newValue);
				return;
			case DomainPackage.CLIENTE__TELEFONO:
				setTelefono((String)newValue);
				return;
			case DomainPackage.CLIENTE__MOVIL:
				setMovil((String)newValue);
				return;
			case DomainPackage.CLIENTE__EMAIL:
				setEmail((String)newValue);
				return;
			case DomainPackage.CLIENTE__HOSTEL:
				setHostel((Hostel)newValue);
				return;
			case DomainPackage.CLIENTE__LISTA_HABITACIONES:
				getListaHabitaciones().clear();
				getListaHabitaciones().addAll((Collection<? extends Habitacion>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DomainPackage.CLIENTE__CEDULA:
				setCedula(CEDULA_EDEFAULT);
				return;
			case DomainPackage.CLIENTE__TELEFONO:
				setTelefono(TELEFONO_EDEFAULT);
				return;
			case DomainPackage.CLIENTE__MOVIL:
				setMovil(MOVIL_EDEFAULT);
				return;
			case DomainPackage.CLIENTE__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case DomainPackage.CLIENTE__HOSTEL:
				setHostel((Hostel)null);
				return;
			case DomainPackage.CLIENTE__LISTA_HABITACIONES:
				getListaHabitaciones().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DomainPackage.CLIENTE__CEDULA:
				return CEDULA_EDEFAULT == null ? cedula != null : !CEDULA_EDEFAULT.equals(cedula);
			case DomainPackage.CLIENTE__TELEFONO:
				return TELEFONO_EDEFAULT == null ? telefono != null : !TELEFONO_EDEFAULT.equals(telefono);
			case DomainPackage.CLIENTE__MOVIL:
				return MOVIL_EDEFAULT == null ? movil != null : !MOVIL_EDEFAULT.equals(movil);
			case DomainPackage.CLIENTE__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case DomainPackage.CLIENTE__HOSTEL:
				return getHostel() != null;
			case DomainPackage.CLIENTE__LISTA_HABITACIONES:
				return listaHabitaciones != null && !listaHabitaciones.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cedula: ");
		result.append(cedula);
		result.append(", telefono: ");
		result.append(telefono);
		result.append(", movil: ");
		result.append(movil);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //ClienteImpl
