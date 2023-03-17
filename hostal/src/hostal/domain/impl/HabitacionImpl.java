/**
 */
package hostal.domain.impl;

import hostal.domain.Cama;
import hostal.domain.Cliente;
import hostal.domain.DomainPackage;
import hostal.domain.Estado;
import hostal.domain.Habitacion;
import hostal.domain.HabitacionSencilla;
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
 * An implementation of the model object '<em><b>Habitacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.impl.HabitacionImpl#getCliente <em>Cliente</em>}</li>
 *   <li>{@link hostal.domain.impl.HabitacionImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link hostal.domain.impl.HabitacionImpl#getBanio <em>Banio</em>}</li>
 *   <li>{@link hostal.domain.impl.HabitacionImpl#getInternet <em>Internet</em>}</li>
 *   <li>{@link hostal.domain.impl.HabitacionImpl#getNumHabitacion <em>Num Habitacion</em>}</li>
 *   <li>{@link hostal.domain.impl.HabitacionImpl#getParking <em>Parking</em>}</li>
 *   <li>{@link hostal.domain.impl.HabitacionImpl#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link hostal.domain.impl.HabitacionImpl#getCama <em>Cama</em>}</li>
 *   <li>{@link hostal.domain.impl.HabitacionImpl#getLstCamaSencilla <em>Lst Cama Sencilla</em>}</li>
 *   <li>{@link hostal.domain.impl.HabitacionImpl#getHostel <em>Hostel</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HabitacionImpl extends EObjectImpl implements Habitacion {
	/**
	 * The cached value of the '{@link #getCliente() <em>Cliente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCliente()
	 * @generated
	 * @ordered
	 */
	protected Cliente cliente;

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected Estado estado;

	/**
	 * The default value of the '{@link #getBanio() <em>Banio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBanio()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BANIO_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getBanio() <em>Banio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBanio()
	 * @generated
	 * @ordered
	 */
	protected Boolean banio = BANIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternet() <em>Internet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternet()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INTERNET_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getInternet() <em>Internet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternet()
	 * @generated
	 * @ordered
	 */
	protected Boolean internet = INTERNET_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumHabitacion() <em>Num Habitacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumHabitacion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUM_HABITACION_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getNumHabitacion() <em>Num Habitacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumHabitacion()
	 * @generated
	 * @ordered
	 */
	protected Integer numHabitacion = NUM_HABITACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getParking() <em>Parking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParking()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PARKING_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getParking() <em>Parking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParking()
	 * @generated
	 * @ordered
	 */
	protected Boolean parking = PARKING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TELEFONO_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected Boolean telefono = TELEFONO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCama() <em>Cama</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCama()
	 * @generated
	 * @ordered
	 */
	protected Cama cama;

	/**
	 * The cached value of the '{@link #getLstCamaSencilla() <em>Lst Cama Sencilla</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstCamaSencilla()
	 * @generated
	 * @ordered
	 */
	protected EList<HabitacionSencilla> lstCamaSencilla;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HabitacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.HABITACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cliente getCliente() {
		if (cliente != null && cliente.eIsProxy()) {
			InternalEObject oldCliente = (InternalEObject)cliente;
			cliente = (Cliente)eResolveProxy(oldCliente);
			if (cliente != oldCliente) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.HABITACION__CLIENTE, oldCliente, cliente));
			}
		}
		return cliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cliente basicGetCliente() {
		return cliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCliente(Cliente newCliente, NotificationChain msgs) {
		Cliente oldCliente = cliente;
		cliente = newCliente;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.HABITACION__CLIENTE, oldCliente, newCliente);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCliente(Cliente newCliente) {
		if (newCliente != cliente) {
			NotificationChain msgs = null;
			if (cliente != null)
				msgs = ((InternalEObject)cliente).eInverseRemove(this, DomainPackage.CLIENTE__LISTA_HABITACIONES, Cliente.class, msgs);
			if (newCliente != null)
				msgs = ((InternalEObject)newCliente).eInverseAdd(this, DomainPackage.CLIENTE__LISTA_HABITACIONES, Cliente.class, msgs);
			msgs = basicSetCliente(newCliente, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HABITACION__CLIENTE, newCliente, newCliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstado(Estado newEstado, NotificationChain msgs) {
		Estado oldEstado = estado;
		estado = newEstado;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.HABITACION__ESTADO, oldEstado, newEstado);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstado(Estado newEstado) {
		if (newEstado != estado) {
			NotificationChain msgs = null;
			if (estado != null)
				msgs = ((InternalEObject)estado).eInverseRemove(this, DomainPackage.ESTADO__HABITACION, Estado.class, msgs);
			if (newEstado != null)
				msgs = ((InternalEObject)newEstado).eInverseAdd(this, DomainPackage.ESTADO__HABITACION, Estado.class, msgs);
			msgs = basicSetEstado(newEstado, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HABITACION__ESTADO, newEstado, newEstado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBanio() {
		return banio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBanio(Boolean newBanio) {
		Boolean oldBanio = banio;
		banio = newBanio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HABITACION__BANIO, oldBanio, banio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getInternet() {
		return internet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternet(Boolean newInternet) {
		Boolean oldInternet = internet;
		internet = newInternet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HABITACION__INTERNET, oldInternet, internet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumHabitacion() {
		return numHabitacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumHabitacion(Integer newNumHabitacion) {
		Integer oldNumHabitacion = numHabitacion;
		numHabitacion = newNumHabitacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HABITACION__NUM_HABITACION, oldNumHabitacion, numHabitacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getParking() {
		return parking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParking(Boolean newParking) {
		Boolean oldParking = parking;
		parking = newParking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HABITACION__PARKING, oldParking, parking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getTelefono() {
		return telefono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelefono(Boolean newTelefono) {
		Boolean oldTelefono = telefono;
		telefono = newTelefono;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HABITACION__TELEFONO, oldTelefono, telefono));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cama getCama() {
		if (cama != null && cama.eIsProxy()) {
			InternalEObject oldCama = (InternalEObject)cama;
			cama = (Cama)eResolveProxy(oldCama);
			if (cama != oldCama) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.HABITACION__CAMA, oldCama, cama));
			}
		}
		return cama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cama basicGetCama() {
		return cama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCama(Cama newCama, NotificationChain msgs) {
		Cama oldCama = cama;
		cama = newCama;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.HABITACION__CAMA, oldCama, newCama);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCama(Cama newCama) {
		if (newCama != cama) {
			NotificationChain msgs = null;
			if (cama != null)
				msgs = ((InternalEObject)cama).eInverseRemove(this, DomainPackage.CAMA__HABITACION, Cama.class, msgs);
			if (newCama != null)
				msgs = ((InternalEObject)newCama).eInverseAdd(this, DomainPackage.CAMA__HABITACION, Cama.class, msgs);
			msgs = basicSetCama(newCama, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HABITACION__CAMA, newCama, newCama));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HabitacionSencilla> getLstCamaSencilla() {
		if (lstCamaSencilla == null) {
			lstCamaSencilla = new EObjectWithInverseResolvingEList.ManyInverse<HabitacionSencilla>(HabitacionSencilla.class, this, DomainPackage.HABITACION__LST_CAMA_SENCILLA, DomainPackage.HABITACION_SENCILLA__LST_HABITACION);
		}
		return lstCamaSencilla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostel getHostel() {
		if (eContainerFeatureID() != DomainPackage.HABITACION__HOSTEL) return null;
		return (Hostel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHostel(Hostel newHostel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHostel, DomainPackage.HABITACION__HOSTEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostel(Hostel newHostel) {
		if (newHostel != eInternalContainer() || (eContainerFeatureID() != DomainPackage.HABITACION__HOSTEL && newHostel != null)) {
			if (EcoreUtil.isAncestor(this, newHostel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHostel != null)
				msgs = ((InternalEObject)newHostel).eInverseAdd(this, DomainPackage.HOSTEL__LISTA_HABITACIONES, Hostel.class, msgs);
			msgs = basicSetHostel(newHostel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HABITACION__HOSTEL, newHostel, newHostel));
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
			case DomainPackage.HABITACION__CLIENTE:
				if (cliente != null)
					msgs = ((InternalEObject)cliente).eInverseRemove(this, DomainPackage.CLIENTE__LISTA_HABITACIONES, Cliente.class, msgs);
				return basicSetCliente((Cliente)otherEnd, msgs);
			case DomainPackage.HABITACION__ESTADO:
				if (estado != null)
					msgs = ((InternalEObject)estado).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.HABITACION__ESTADO, null, msgs);
				return basicSetEstado((Estado)otherEnd, msgs);
			case DomainPackage.HABITACION__CAMA:
				if (cama != null)
					msgs = ((InternalEObject)cama).eInverseRemove(this, DomainPackage.CAMA__HABITACION, Cama.class, msgs);
				return basicSetCama((Cama)otherEnd, msgs);
			case DomainPackage.HABITACION__LST_CAMA_SENCILLA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstCamaSencilla()).basicAdd(otherEnd, msgs);
			case DomainPackage.HABITACION__HOSTEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHostel((Hostel)otherEnd, msgs);
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
			case DomainPackage.HABITACION__CLIENTE:
				return basicSetCliente(null, msgs);
			case DomainPackage.HABITACION__ESTADO:
				return basicSetEstado(null, msgs);
			case DomainPackage.HABITACION__CAMA:
				return basicSetCama(null, msgs);
			case DomainPackage.HABITACION__LST_CAMA_SENCILLA:
				return ((InternalEList<?>)getLstCamaSencilla()).basicRemove(otherEnd, msgs);
			case DomainPackage.HABITACION__HOSTEL:
				return basicSetHostel(null, msgs);
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
			case DomainPackage.HABITACION__HOSTEL:
				return eInternalContainer().eInverseRemove(this, DomainPackage.HOSTEL__LISTA_HABITACIONES, Hostel.class, msgs);
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
			case DomainPackage.HABITACION__CLIENTE:
				if (resolve) return getCliente();
				return basicGetCliente();
			case DomainPackage.HABITACION__ESTADO:
				return getEstado();
			case DomainPackage.HABITACION__BANIO:
				return getBanio();
			case DomainPackage.HABITACION__INTERNET:
				return getInternet();
			case DomainPackage.HABITACION__NUM_HABITACION:
				return getNumHabitacion();
			case DomainPackage.HABITACION__PARKING:
				return getParking();
			case DomainPackage.HABITACION__TELEFONO:
				return getTelefono();
			case DomainPackage.HABITACION__CAMA:
				if (resolve) return getCama();
				return basicGetCama();
			case DomainPackage.HABITACION__LST_CAMA_SENCILLA:
				return getLstCamaSencilla();
			case DomainPackage.HABITACION__HOSTEL:
				return getHostel();
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
			case DomainPackage.HABITACION__CLIENTE:
				setCliente((Cliente)newValue);
				return;
			case DomainPackage.HABITACION__ESTADO:
				setEstado((Estado)newValue);
				return;
			case DomainPackage.HABITACION__BANIO:
				setBanio((Boolean)newValue);
				return;
			case DomainPackage.HABITACION__INTERNET:
				setInternet((Boolean)newValue);
				return;
			case DomainPackage.HABITACION__NUM_HABITACION:
				setNumHabitacion((Integer)newValue);
				return;
			case DomainPackage.HABITACION__PARKING:
				setParking((Boolean)newValue);
				return;
			case DomainPackage.HABITACION__TELEFONO:
				setTelefono((Boolean)newValue);
				return;
			case DomainPackage.HABITACION__CAMA:
				setCama((Cama)newValue);
				return;
			case DomainPackage.HABITACION__LST_CAMA_SENCILLA:
				getLstCamaSencilla().clear();
				getLstCamaSencilla().addAll((Collection<? extends HabitacionSencilla>)newValue);
				return;
			case DomainPackage.HABITACION__HOSTEL:
				setHostel((Hostel)newValue);
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
			case DomainPackage.HABITACION__CLIENTE:
				setCliente((Cliente)null);
				return;
			case DomainPackage.HABITACION__ESTADO:
				setEstado((Estado)null);
				return;
			case DomainPackage.HABITACION__BANIO:
				setBanio(BANIO_EDEFAULT);
				return;
			case DomainPackage.HABITACION__INTERNET:
				setInternet(INTERNET_EDEFAULT);
				return;
			case DomainPackage.HABITACION__NUM_HABITACION:
				setNumHabitacion(NUM_HABITACION_EDEFAULT);
				return;
			case DomainPackage.HABITACION__PARKING:
				setParking(PARKING_EDEFAULT);
				return;
			case DomainPackage.HABITACION__TELEFONO:
				setTelefono(TELEFONO_EDEFAULT);
				return;
			case DomainPackage.HABITACION__CAMA:
				setCama((Cama)null);
				return;
			case DomainPackage.HABITACION__LST_CAMA_SENCILLA:
				getLstCamaSencilla().clear();
				return;
			case DomainPackage.HABITACION__HOSTEL:
				setHostel((Hostel)null);
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
			case DomainPackage.HABITACION__CLIENTE:
				return cliente != null;
			case DomainPackage.HABITACION__ESTADO:
				return estado != null;
			case DomainPackage.HABITACION__BANIO:
				return BANIO_EDEFAULT == null ? banio != null : !BANIO_EDEFAULT.equals(banio);
			case DomainPackage.HABITACION__INTERNET:
				return INTERNET_EDEFAULT == null ? internet != null : !INTERNET_EDEFAULT.equals(internet);
			case DomainPackage.HABITACION__NUM_HABITACION:
				return NUM_HABITACION_EDEFAULT == null ? numHabitacion != null : !NUM_HABITACION_EDEFAULT.equals(numHabitacion);
			case DomainPackage.HABITACION__PARKING:
				return PARKING_EDEFAULT == null ? parking != null : !PARKING_EDEFAULT.equals(parking);
			case DomainPackage.HABITACION__TELEFONO:
				return TELEFONO_EDEFAULT == null ? telefono != null : !TELEFONO_EDEFAULT.equals(telefono);
			case DomainPackage.HABITACION__CAMA:
				return cama != null;
			case DomainPackage.HABITACION__LST_CAMA_SENCILLA:
				return lstCamaSencilla != null && !lstCamaSencilla.isEmpty();
			case DomainPackage.HABITACION__HOSTEL:
				return getHostel() != null;
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
		result.append(" (banio: ");
		result.append(banio);
		result.append(", internet: ");
		result.append(internet);
		result.append(", numHabitacion: ");
		result.append(numHabitacion);
		result.append(", parking: ");
		result.append(parking);
		result.append(", telefono: ");
		result.append(telefono);
		result.append(')');
		return result.toString();
	}

} //HabitacionImpl
