/**
 */
package hostal.domain.impl;

import hostal.domain.Cama;
import hostal.domain.Cliente;
import hostal.domain.Domain;
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hostel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.impl.HostelImpl#getListaCama <em>Lista Cama</em>}</li>
 *   <li>{@link hostal.domain.impl.HostelImpl#getListaClientes <em>Lista Clientes</em>}</li>
 *   <li>{@link hostal.domain.impl.HostelImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link hostal.domain.impl.HostelImpl#getLstDomain <em>Lst Domain</em>}</li>
 *   <li>{@link hostal.domain.impl.HostelImpl#getListaHabitaciones <em>Lista Habitaciones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostelImpl extends EObjectImpl implements Hostel {
	/**
	 * The cached value of the '{@link #getListaCama() <em>Lista Cama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaCama()
	 * @generated
	 * @ordered
	 */
	protected EList<Cama> listaCama;

	/**
	 * The cached value of the '{@link #getListaClientes() <em>Lista Clientes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaClientes()
	 * @generated
	 * @ordered
	 */
	protected EList<Cliente> listaClientes;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstDomain() <em>Lst Domain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<Domain> lstDomain;

	/**
	 * The cached value of the '{@link #getListaHabitaciones() <em>Lista Habitaciones</em>}' containment reference list.
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
	protected HostelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.HOSTEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cama> getListaCama() {
		if (listaCama == null) {
			listaCama = new EObjectContainmentWithInverseEList<Cama>(Cama.class, this, DomainPackage.HOSTEL__LISTA_CAMA, DomainPackage.CAMA__HOSTEL);
		}
		return listaCama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cliente> getListaClientes() {
		if (listaClientes == null) {
			listaClientes = new EObjectContainmentWithInverseEList<Cliente>(Cliente.class, this, DomainPackage.HOSTEL__LISTA_CLIENTES, DomainPackage.CLIENTE__HOSTEL);
		}
		return listaClientes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HOSTEL__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Domain> getLstDomain() {
		if (lstDomain == null) {
			lstDomain = new EObjectWithInverseResolvingEList.ManyInverse<Domain>(Domain.class, this, DomainPackage.HOSTEL__LST_DOMAIN, DomainPackage.DOMAIN__LST_HOSTEL);
		}
		return lstDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Habitacion> getListaHabitaciones() {
		if (listaHabitaciones == null) {
			listaHabitaciones = new EObjectContainmentWithInverseEList<Habitacion>(Habitacion.class, this, DomainPackage.HOSTEL__LISTA_HABITACIONES, DomainPackage.HABITACION__HOSTEL);
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
			case DomainPackage.HOSTEL__LISTA_CAMA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaCama()).basicAdd(otherEnd, msgs);
			case DomainPackage.HOSTEL__LISTA_CLIENTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaClientes()).basicAdd(otherEnd, msgs);
			case DomainPackage.HOSTEL__LST_DOMAIN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstDomain()).basicAdd(otherEnd, msgs);
			case DomainPackage.HOSTEL__LISTA_HABITACIONES:
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
			case DomainPackage.HOSTEL__LISTA_CAMA:
				return ((InternalEList<?>)getListaCama()).basicRemove(otherEnd, msgs);
			case DomainPackage.HOSTEL__LISTA_CLIENTES:
				return ((InternalEList<?>)getListaClientes()).basicRemove(otherEnd, msgs);
			case DomainPackage.HOSTEL__LST_DOMAIN:
				return ((InternalEList<?>)getLstDomain()).basicRemove(otherEnd, msgs);
			case DomainPackage.HOSTEL__LISTA_HABITACIONES:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.HOSTEL__LISTA_CAMA:
				return getListaCama();
			case DomainPackage.HOSTEL__LISTA_CLIENTES:
				return getListaClientes();
			case DomainPackage.HOSTEL__NOMBRE:
				return getNombre();
			case DomainPackage.HOSTEL__LST_DOMAIN:
				return getLstDomain();
			case DomainPackage.HOSTEL__LISTA_HABITACIONES:
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
			case DomainPackage.HOSTEL__LISTA_CAMA:
				getListaCama().clear();
				getListaCama().addAll((Collection<? extends Cama>)newValue);
				return;
			case DomainPackage.HOSTEL__LISTA_CLIENTES:
				getListaClientes().clear();
				getListaClientes().addAll((Collection<? extends Cliente>)newValue);
				return;
			case DomainPackage.HOSTEL__NOMBRE:
				setNombre((String)newValue);
				return;
			case DomainPackage.HOSTEL__LST_DOMAIN:
				getLstDomain().clear();
				getLstDomain().addAll((Collection<? extends Domain>)newValue);
				return;
			case DomainPackage.HOSTEL__LISTA_HABITACIONES:
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
			case DomainPackage.HOSTEL__LISTA_CAMA:
				getListaCama().clear();
				return;
			case DomainPackage.HOSTEL__LISTA_CLIENTES:
				getListaClientes().clear();
				return;
			case DomainPackage.HOSTEL__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DomainPackage.HOSTEL__LST_DOMAIN:
				getLstDomain().clear();
				return;
			case DomainPackage.HOSTEL__LISTA_HABITACIONES:
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
			case DomainPackage.HOSTEL__LISTA_CAMA:
				return listaCama != null && !listaCama.isEmpty();
			case DomainPackage.HOSTEL__LISTA_CLIENTES:
				return listaClientes != null && !listaClientes.isEmpty();
			case DomainPackage.HOSTEL__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DomainPackage.HOSTEL__LST_DOMAIN:
				return lstDomain != null && !lstDomain.isEmpty();
			case DomainPackage.HOSTEL__LISTA_HABITACIONES:
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //HostelImpl
