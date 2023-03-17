/**
 */
package hostal.domain.impl;

import hostal.domain.DomainPackage;
import hostal.domain.Habitacion;
import hostal.domain.HabitacionSencilla;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Habitacion Sencilla</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.impl.HabitacionSencillaImpl#getAguaCaliente <em>Agua Caliente</em>}</li>
 *   <li>{@link hostal.domain.impl.HabitacionSencillaImpl#getTvLCD <em>Tv LCD</em>}</li>
 *   <li>{@link hostal.domain.impl.HabitacionSencillaImpl#getLstHabitacion <em>Lst Habitacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HabitacionSencillaImpl extends HabitacionImpl implements HabitacionSencilla {
	/**
	 * The default value of the '{@link #getAguaCaliente() <em>Agua Caliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAguaCaliente()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AGUA_CALIENTE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAguaCaliente() <em>Agua Caliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAguaCaliente()
	 * @generated
	 * @ordered
	 */
	protected Boolean aguaCaliente = AGUA_CALIENTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTvLCD() <em>Tv LCD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTvLCD()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TV_LCD_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getTvLCD() <em>Tv LCD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTvLCD()
	 * @generated
	 * @ordered
	 */
	protected Boolean tvLCD = TV_LCD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstHabitacion() <em>Lst Habitacion</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstHabitacion()
	 * @generated
	 * @ordered
	 */
	protected EList<Habitacion> lstHabitacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HabitacionSencillaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.HABITACION_SENCILLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAguaCaliente() {
		return aguaCaliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAguaCaliente(Boolean newAguaCaliente) {
		Boolean oldAguaCaliente = aguaCaliente;
		aguaCaliente = newAguaCaliente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HABITACION_SENCILLA__AGUA_CALIENTE, oldAguaCaliente, aguaCaliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getTvLCD() {
		return tvLCD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTvLCD(Boolean newTvLCD) {
		Boolean oldTvLCD = tvLCD;
		tvLCD = newTvLCD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HABITACION_SENCILLA__TV_LCD, oldTvLCD, tvLCD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Habitacion> getLstHabitacion() {
		if (lstHabitacion == null) {
			lstHabitacion = new EObjectWithInverseResolvingEList.ManyInverse<Habitacion>(Habitacion.class, this, DomainPackage.HABITACION_SENCILLA__LST_HABITACION, DomainPackage.HABITACION__LST_CAMA_SENCILLA);
		}
		return lstHabitacion;
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
			case DomainPackage.HABITACION_SENCILLA__LST_HABITACION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstHabitacion()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.HABITACION_SENCILLA__LST_HABITACION:
				return ((InternalEList<?>)getLstHabitacion()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.HABITACION_SENCILLA__AGUA_CALIENTE:
				return getAguaCaliente();
			case DomainPackage.HABITACION_SENCILLA__TV_LCD:
				return getTvLCD();
			case DomainPackage.HABITACION_SENCILLA__LST_HABITACION:
				return getLstHabitacion();
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
			case DomainPackage.HABITACION_SENCILLA__AGUA_CALIENTE:
				setAguaCaliente((Boolean)newValue);
				return;
			case DomainPackage.HABITACION_SENCILLA__TV_LCD:
				setTvLCD((Boolean)newValue);
				return;
			case DomainPackage.HABITACION_SENCILLA__LST_HABITACION:
				getLstHabitacion().clear();
				getLstHabitacion().addAll((Collection<? extends Habitacion>)newValue);
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
			case DomainPackage.HABITACION_SENCILLA__AGUA_CALIENTE:
				setAguaCaliente(AGUA_CALIENTE_EDEFAULT);
				return;
			case DomainPackage.HABITACION_SENCILLA__TV_LCD:
				setTvLCD(TV_LCD_EDEFAULT);
				return;
			case DomainPackage.HABITACION_SENCILLA__LST_HABITACION:
				getLstHabitacion().clear();
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
			case DomainPackage.HABITACION_SENCILLA__AGUA_CALIENTE:
				return AGUA_CALIENTE_EDEFAULT == null ? aguaCaliente != null : !AGUA_CALIENTE_EDEFAULT.equals(aguaCaliente);
			case DomainPackage.HABITACION_SENCILLA__TV_LCD:
				return TV_LCD_EDEFAULT == null ? tvLCD != null : !TV_LCD_EDEFAULT.equals(tvLCD);
			case DomainPackage.HABITACION_SENCILLA__LST_HABITACION:
				return lstHabitacion != null && !lstHabitacion.isEmpty();
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
		result.append(" (aguaCaliente: ");
		result.append(aguaCaliente);
		result.append(", tvLCD: ");
		result.append(tvLCD);
		result.append(')');
		return result.toString();
	}

} //HabitacionSencillaImpl
