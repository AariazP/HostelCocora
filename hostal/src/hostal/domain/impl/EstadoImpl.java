/**
 */
package hostal.domain.impl;

import hostal.domain.DomainPackage;
import hostal.domain.Estado;
import hostal.domain.Habitacion;
import hostal.domain.TipoEstado;

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
 * An implementation of the model object '<em><b>Estado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.impl.EstadoImpl#getInicio <em>Inicio</em>}</li>
 *   <li>{@link hostal.domain.impl.EstadoImpl#getFin <em>Fin</em>}</li>
 *   <li>{@link hostal.domain.impl.EstadoImpl#getMotivo <em>Motivo</em>}</li>
 *   <li>{@link hostal.domain.impl.EstadoImpl#getHabitacion <em>Habitacion</em>}</li>
 *   <li>{@link hostal.domain.impl.EstadoImpl#getTipoEstado <em>Tipo Estado</em>}</li>
 *   <li>{@link hostal.domain.impl.EstadoImpl#getLstTipoEstado <em>Lst Tipo Estado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EstadoImpl extends EObjectImpl implements Estado {
	/**
	 * The default value of the '{@link #getInicio() <em>Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInicio()
	 * @generated
	 * @ordered
	 */
	protected static final String INICIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInicio() <em>Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInicio()
	 * @generated
	 * @ordered
	 */
	protected String inicio = INICIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFin() <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFin() <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin()
	 * @generated
	 * @ordered
	 */
	protected String fin = FIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotivo() <em>Motivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotivo()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTIVO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotivo() <em>Motivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotivo()
	 * @generated
	 * @ordered
	 */
	protected String motivo = MOTIVO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTipoEstado() <em>Tipo Estado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoEstado()
	 * @generated
	 * @ordered
	 */
	protected TipoEstado tipoEstado;

	/**
	 * The cached value of the '{@link #getLstTipoEstado() <em>Lst Tipo Estado</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstTipoEstado()
	 * @generated
	 * @ordered
	 */
	protected EList<TipoEstado> lstTipoEstado;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EstadoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.ESTADO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInicio() {
		return inicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInicio(String newInicio) {
		String oldInicio = inicio;
		inicio = newInicio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ESTADO__INICIO, oldInicio, inicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFin() {
		return fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFin(String newFin) {
		String oldFin = fin;
		fin = newFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ESTADO__FIN, oldFin, fin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMotivo() {
		return motivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotivo(String newMotivo) {
		String oldMotivo = motivo;
		motivo = newMotivo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ESTADO__MOTIVO, oldMotivo, motivo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Habitacion getHabitacion() {
		if (eContainerFeatureID() != DomainPackage.ESTADO__HABITACION) return null;
		return (Habitacion)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHabitacion(Habitacion newHabitacion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHabitacion, DomainPackage.ESTADO__HABITACION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHabitacion(Habitacion newHabitacion) {
		if (newHabitacion != eInternalContainer() || (eContainerFeatureID() != DomainPackage.ESTADO__HABITACION && newHabitacion != null)) {
			if (EcoreUtil.isAncestor(this, newHabitacion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHabitacion != null)
				msgs = ((InternalEObject)newHabitacion).eInverseAdd(this, DomainPackage.HABITACION__ESTADO, Habitacion.class, msgs);
			msgs = basicSetHabitacion(newHabitacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ESTADO__HABITACION, newHabitacion, newHabitacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoEstado getTipoEstado() {
		return tipoEstado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTipoEstado(TipoEstado newTipoEstado, NotificationChain msgs) {
		TipoEstado oldTipoEstado = tipoEstado;
		tipoEstado = newTipoEstado;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.ESTADO__TIPO_ESTADO, oldTipoEstado, newTipoEstado);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoEstado(TipoEstado newTipoEstado) {
		if (newTipoEstado != tipoEstado) {
			NotificationChain msgs = null;
			if (tipoEstado != null)
				msgs = ((InternalEObject)tipoEstado).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.ESTADO__TIPO_ESTADO, null, msgs);
			if (newTipoEstado != null)
				msgs = ((InternalEObject)newTipoEstado).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.ESTADO__TIPO_ESTADO, null, msgs);
			msgs = basicSetTipoEstado(newTipoEstado, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ESTADO__TIPO_ESTADO, newTipoEstado, newTipoEstado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TipoEstado> getLstTipoEstado() {
		if (lstTipoEstado == null) {
			lstTipoEstado = new EObjectWithInverseResolvingEList.ManyInverse<TipoEstado>(TipoEstado.class, this, DomainPackage.ESTADO__LST_TIPO_ESTADO, DomainPackage.TIPO_ESTADO__LST_ESTADO);
		}
		return lstTipoEstado;
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
			case DomainPackage.ESTADO__HABITACION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHabitacion((Habitacion)otherEnd, msgs);
			case DomainPackage.ESTADO__LST_TIPO_ESTADO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstTipoEstado()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.ESTADO__HABITACION:
				return basicSetHabitacion(null, msgs);
			case DomainPackage.ESTADO__TIPO_ESTADO:
				return basicSetTipoEstado(null, msgs);
			case DomainPackage.ESTADO__LST_TIPO_ESTADO:
				return ((InternalEList<?>)getLstTipoEstado()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.ESTADO__HABITACION:
				return eInternalContainer().eInverseRemove(this, DomainPackage.HABITACION__ESTADO, Habitacion.class, msgs);
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
			case DomainPackage.ESTADO__INICIO:
				return getInicio();
			case DomainPackage.ESTADO__FIN:
				return getFin();
			case DomainPackage.ESTADO__MOTIVO:
				return getMotivo();
			case DomainPackage.ESTADO__HABITACION:
				return getHabitacion();
			case DomainPackage.ESTADO__TIPO_ESTADO:
				return getTipoEstado();
			case DomainPackage.ESTADO__LST_TIPO_ESTADO:
				return getLstTipoEstado();
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
			case DomainPackage.ESTADO__INICIO:
				setInicio((String)newValue);
				return;
			case DomainPackage.ESTADO__FIN:
				setFin((String)newValue);
				return;
			case DomainPackage.ESTADO__MOTIVO:
				setMotivo((String)newValue);
				return;
			case DomainPackage.ESTADO__HABITACION:
				setHabitacion((Habitacion)newValue);
				return;
			case DomainPackage.ESTADO__TIPO_ESTADO:
				setTipoEstado((TipoEstado)newValue);
				return;
			case DomainPackage.ESTADO__LST_TIPO_ESTADO:
				getLstTipoEstado().clear();
				getLstTipoEstado().addAll((Collection<? extends TipoEstado>)newValue);
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
			case DomainPackage.ESTADO__INICIO:
				setInicio(INICIO_EDEFAULT);
				return;
			case DomainPackage.ESTADO__FIN:
				setFin(FIN_EDEFAULT);
				return;
			case DomainPackage.ESTADO__MOTIVO:
				setMotivo(MOTIVO_EDEFAULT);
				return;
			case DomainPackage.ESTADO__HABITACION:
				setHabitacion((Habitacion)null);
				return;
			case DomainPackage.ESTADO__TIPO_ESTADO:
				setTipoEstado((TipoEstado)null);
				return;
			case DomainPackage.ESTADO__LST_TIPO_ESTADO:
				getLstTipoEstado().clear();
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
			case DomainPackage.ESTADO__INICIO:
				return INICIO_EDEFAULT == null ? inicio != null : !INICIO_EDEFAULT.equals(inicio);
			case DomainPackage.ESTADO__FIN:
				return FIN_EDEFAULT == null ? fin != null : !FIN_EDEFAULT.equals(fin);
			case DomainPackage.ESTADO__MOTIVO:
				return MOTIVO_EDEFAULT == null ? motivo != null : !MOTIVO_EDEFAULT.equals(motivo);
			case DomainPackage.ESTADO__HABITACION:
				return getHabitacion() != null;
			case DomainPackage.ESTADO__TIPO_ESTADO:
				return tipoEstado != null;
			case DomainPackage.ESTADO__LST_TIPO_ESTADO:
				return lstTipoEstado != null && !lstTipoEstado.isEmpty();
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
		result.append(" (inicio: ");
		result.append(inicio);
		result.append(", fin: ");
		result.append(fin);
		result.append(", motivo: ");
		result.append(motivo);
		result.append(')');
		return result.toString();
	}

} //EstadoImpl
