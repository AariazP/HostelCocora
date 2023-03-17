/**
 */
package hostal.domain.impl;

import hostal.domain.Cama;
import hostal.domain.DomainPackage;
import hostal.domain.Habitacion;
import hostal.domain.Hostel;
import hostal.domain.TipoCobija;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cama</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.impl.CamaImpl#getLargo <em>Largo</em>}</li>
 *   <li>{@link hostal.domain.impl.CamaImpl#getAncho <em>Ancho</em>}</li>
 *   <li>{@link hostal.domain.impl.CamaImpl#getAlmohada <em>Almohada</em>}</li>
 *   <li>{@link hostal.domain.impl.CamaImpl#getHostel <em>Hostel</em>}</li>
 *   <li>{@link hostal.domain.impl.CamaImpl#getTipoCobija <em>Tipo Cobija</em>}</li>
 *   <li>{@link hostal.domain.impl.CamaImpl#getHabitacion <em>Habitacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CamaImpl extends EObjectImpl implements Cama {
	/**
	 * The default value of the '{@link #getLargo() <em>Largo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargo()
	 * @generated
	 * @ordered
	 */
	protected static final Double LARGO_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getLargo() <em>Largo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargo()
	 * @generated
	 * @ordered
	 */
	protected Double largo = LARGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getAncho() <em>Ancho</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAncho()
	 * @generated
	 * @ordered
	 */
	protected static final Double ANCHO_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getAncho() <em>Ancho</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAncho()
	 * @generated
	 * @ordered
	 */
	protected Double ancho = ANCHO_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlmohada() <em>Almohada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlmohada()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALMOHADA_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAlmohada() <em>Almohada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlmohada()
	 * @generated
	 * @ordered
	 */
	protected Boolean almohada = ALMOHADA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTipoCobija() <em>Tipo Cobija</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoCobija()
	 * @generated
	 * @ordered
	 */
	protected TipoCobija tipoCobija;

	/**
	 * The cached value of the '{@link #getHabitacion() <em>Habitacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHabitacion()
	 * @generated
	 * @ordered
	 */
	protected Habitacion habitacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.CAMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLargo() {
		return largo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargo(Double newLargo) {
		Double oldLargo = largo;
		largo = newLargo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CAMA__LARGO, oldLargo, largo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAncho() {
		return ancho;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAncho(Double newAncho) {
		Double oldAncho = ancho;
		ancho = newAncho;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CAMA__ANCHO, oldAncho, ancho));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAlmohada() {
		return almohada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlmohada(Boolean newAlmohada) {
		Boolean oldAlmohada = almohada;
		almohada = newAlmohada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CAMA__ALMOHADA, oldAlmohada, almohada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostel getHostel() {
		if (eContainerFeatureID() != DomainPackage.CAMA__HOSTEL) return null;
		return (Hostel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHostel(Hostel newHostel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHostel, DomainPackage.CAMA__HOSTEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostel(Hostel newHostel) {
		if (newHostel != eInternalContainer() || (eContainerFeatureID() != DomainPackage.CAMA__HOSTEL && newHostel != null)) {
			if (EcoreUtil.isAncestor(this, newHostel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHostel != null)
				msgs = ((InternalEObject)newHostel).eInverseAdd(this, DomainPackage.HOSTEL__LISTA_CAMA, Hostel.class, msgs);
			msgs = basicSetHostel(newHostel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CAMA__HOSTEL, newHostel, newHostel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoCobija getTipoCobija() {
		if (tipoCobija != null && tipoCobija.eIsProxy()) {
			InternalEObject oldTipoCobija = (InternalEObject)tipoCobija;
			tipoCobija = (TipoCobija)eResolveProxy(oldTipoCobija);
			if (tipoCobija != oldTipoCobija) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.CAMA__TIPO_COBIJA, oldTipoCobija, tipoCobija));
			}
		}
		return tipoCobija;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoCobija basicGetTipoCobija() {
		return tipoCobija;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTipoCobija(TipoCobija newTipoCobija, NotificationChain msgs) {
		TipoCobija oldTipoCobija = tipoCobija;
		tipoCobija = newTipoCobija;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.CAMA__TIPO_COBIJA, oldTipoCobija, newTipoCobija);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoCobija(TipoCobija newTipoCobija) {
		if (newTipoCobija != tipoCobija) {
			NotificationChain msgs = null;
			if (tipoCobija != null)
				msgs = ((InternalEObject)tipoCobija).eInverseRemove(this, DomainPackage.TIPO_COBIJA__CAMA, TipoCobija.class, msgs);
			if (newTipoCobija != null)
				msgs = ((InternalEObject)newTipoCobija).eInverseAdd(this, DomainPackage.TIPO_COBIJA__CAMA, TipoCobija.class, msgs);
			msgs = basicSetTipoCobija(newTipoCobija, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CAMA__TIPO_COBIJA, newTipoCobija, newTipoCobija));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Habitacion getHabitacion() {
		if (habitacion != null && habitacion.eIsProxy()) {
			InternalEObject oldHabitacion = (InternalEObject)habitacion;
			habitacion = (Habitacion)eResolveProxy(oldHabitacion);
			if (habitacion != oldHabitacion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.CAMA__HABITACION, oldHabitacion, habitacion));
			}
		}
		return habitacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Habitacion basicGetHabitacion() {
		return habitacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHabitacion(Habitacion newHabitacion, NotificationChain msgs) {
		Habitacion oldHabitacion = habitacion;
		habitacion = newHabitacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.CAMA__HABITACION, oldHabitacion, newHabitacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHabitacion(Habitacion newHabitacion) {
		if (newHabitacion != habitacion) {
			NotificationChain msgs = null;
			if (habitacion != null)
				msgs = ((InternalEObject)habitacion).eInverseRemove(this, DomainPackage.HABITACION__CAMA, Habitacion.class, msgs);
			if (newHabitacion != null)
				msgs = ((InternalEObject)newHabitacion).eInverseAdd(this, DomainPackage.HABITACION__CAMA, Habitacion.class, msgs);
			msgs = basicSetHabitacion(newHabitacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CAMA__HABITACION, newHabitacion, newHabitacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.CAMA__HOSTEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHostel((Hostel)otherEnd, msgs);
			case DomainPackage.CAMA__TIPO_COBIJA:
				if (tipoCobija != null)
					msgs = ((InternalEObject)tipoCobija).eInverseRemove(this, DomainPackage.TIPO_COBIJA__CAMA, TipoCobija.class, msgs);
				return basicSetTipoCobija((TipoCobija)otherEnd, msgs);
			case DomainPackage.CAMA__HABITACION:
				if (habitacion != null)
					msgs = ((InternalEObject)habitacion).eInverseRemove(this, DomainPackage.HABITACION__CAMA, Habitacion.class, msgs);
				return basicSetHabitacion((Habitacion)otherEnd, msgs);
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
			case DomainPackage.CAMA__HOSTEL:
				return basicSetHostel(null, msgs);
			case DomainPackage.CAMA__TIPO_COBIJA:
				return basicSetTipoCobija(null, msgs);
			case DomainPackage.CAMA__HABITACION:
				return basicSetHabitacion(null, msgs);
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
			case DomainPackage.CAMA__HOSTEL:
				return eInternalContainer().eInverseRemove(this, DomainPackage.HOSTEL__LISTA_CAMA, Hostel.class, msgs);
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
			case DomainPackage.CAMA__LARGO:
				return getLargo();
			case DomainPackage.CAMA__ANCHO:
				return getAncho();
			case DomainPackage.CAMA__ALMOHADA:
				return getAlmohada();
			case DomainPackage.CAMA__HOSTEL:
				return getHostel();
			case DomainPackage.CAMA__TIPO_COBIJA:
				if (resolve) return getTipoCobija();
				return basicGetTipoCobija();
			case DomainPackage.CAMA__HABITACION:
				if (resolve) return getHabitacion();
				return basicGetHabitacion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomainPackage.CAMA__LARGO:
				setLargo((Double)newValue);
				return;
			case DomainPackage.CAMA__ANCHO:
				setAncho((Double)newValue);
				return;
			case DomainPackage.CAMA__ALMOHADA:
				setAlmohada((Boolean)newValue);
				return;
			case DomainPackage.CAMA__HOSTEL:
				setHostel((Hostel)newValue);
				return;
			case DomainPackage.CAMA__TIPO_COBIJA:
				setTipoCobija((TipoCobija)newValue);
				return;
			case DomainPackage.CAMA__HABITACION:
				setHabitacion((Habitacion)newValue);
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
			case DomainPackage.CAMA__LARGO:
				setLargo(LARGO_EDEFAULT);
				return;
			case DomainPackage.CAMA__ANCHO:
				setAncho(ANCHO_EDEFAULT);
				return;
			case DomainPackage.CAMA__ALMOHADA:
				setAlmohada(ALMOHADA_EDEFAULT);
				return;
			case DomainPackage.CAMA__HOSTEL:
				setHostel((Hostel)null);
				return;
			case DomainPackage.CAMA__TIPO_COBIJA:
				setTipoCobija((TipoCobija)null);
				return;
			case DomainPackage.CAMA__HABITACION:
				setHabitacion((Habitacion)null);
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
			case DomainPackage.CAMA__LARGO:
				return LARGO_EDEFAULT == null ? largo != null : !LARGO_EDEFAULT.equals(largo);
			case DomainPackage.CAMA__ANCHO:
				return ANCHO_EDEFAULT == null ? ancho != null : !ANCHO_EDEFAULT.equals(ancho);
			case DomainPackage.CAMA__ALMOHADA:
				return ALMOHADA_EDEFAULT == null ? almohada != null : !ALMOHADA_EDEFAULT.equals(almohada);
			case DomainPackage.CAMA__HOSTEL:
				return getHostel() != null;
			case DomainPackage.CAMA__TIPO_COBIJA:
				return tipoCobija != null;
			case DomainPackage.CAMA__HABITACION:
				return habitacion != null;
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
		result.append(" (largo: ");
		result.append(largo);
		result.append(", ancho: ");
		result.append(ancho);
		result.append(", almohada: ");
		result.append(almohada);
		result.append(')');
		return result.toString();
	}

} //CamaImpl
