/**
 */
package hostal.domain.impl;

import hostal.domain.DomainPackage;
import hostal.domain.HabitacionDoble;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Habitacion Doble</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.impl.HabitacionDobleImpl#getJacuzzi <em>Jacuzzi</em>}</li>
 *   <li>{@link hostal.domain.impl.HabitacionDobleImpl#getTvHD <em>Tv HD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HabitacionDobleImpl extends HabitacionImpl implements HabitacionDoble {
	/**
	 * The default value of the '{@link #getJacuzzi() <em>Jacuzzi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJacuzzi()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean JACUZZI_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getJacuzzi() <em>Jacuzzi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJacuzzi()
	 * @generated
	 * @ordered
	 */
	protected Boolean jacuzzi = JACUZZI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTvHD() <em>Tv HD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTvHD()
	 * @generated
	 * @ordered
	 */
	protected static final String TV_HD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTvHD() <em>Tv HD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTvHD()
	 * @generated
	 * @ordered
	 */
	protected String tvHD = TV_HD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HabitacionDobleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.HABITACION_DOBLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getJacuzzi() {
		return jacuzzi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJacuzzi(Boolean newJacuzzi) {
		Boolean oldJacuzzi = jacuzzi;
		jacuzzi = newJacuzzi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HABITACION_DOBLE__JACUZZI, oldJacuzzi, jacuzzi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTvHD() {
		return tvHD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTvHD(String newTvHD) {
		String oldTvHD = tvHD;
		tvHD = newTvHD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.HABITACION_DOBLE__TV_HD, oldTvHD, tvHD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.HABITACION_DOBLE__JACUZZI:
				return getJacuzzi();
			case DomainPackage.HABITACION_DOBLE__TV_HD:
				return getTvHD();
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
			case DomainPackage.HABITACION_DOBLE__JACUZZI:
				setJacuzzi((Boolean)newValue);
				return;
			case DomainPackage.HABITACION_DOBLE__TV_HD:
				setTvHD((String)newValue);
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
			case DomainPackage.HABITACION_DOBLE__JACUZZI:
				setJacuzzi(JACUZZI_EDEFAULT);
				return;
			case DomainPackage.HABITACION_DOBLE__TV_HD:
				setTvHD(TV_HD_EDEFAULT);
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
			case DomainPackage.HABITACION_DOBLE__JACUZZI:
				return JACUZZI_EDEFAULT == null ? jacuzzi != null : !JACUZZI_EDEFAULT.equals(jacuzzi);
			case DomainPackage.HABITACION_DOBLE__TV_HD:
				return TV_HD_EDEFAULT == null ? tvHD != null : !TV_HD_EDEFAULT.equals(tvHD);
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
		result.append(" (jacuzzi: ");
		result.append(jacuzzi);
		result.append(", tvHD: ");
		result.append(tvHD);
		result.append(')');
		return result.toString();
	}

} //HabitacionDobleImpl
