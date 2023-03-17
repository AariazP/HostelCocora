/**
 */
package hostal.domain.impl;

import hostal.domain.CamaDoble;
import hostal.domain.DomainPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cama Doble</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.impl.CamaDobleImpl#getMesaNoche <em>Mesa Noche</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CamaDobleImpl extends CamaImpl implements CamaDoble {
	/**
	 * The default value of the '{@link #getMesaNoche() <em>Mesa Noche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesaNoche()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MESA_NOCHE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getMesaNoche() <em>Mesa Noche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesaNoche()
	 * @generated
	 * @ordered
	 */
	protected Boolean mesaNoche = MESA_NOCHE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamaDobleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.CAMA_DOBLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMesaNoche() {
		return mesaNoche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMesaNoche(Boolean newMesaNoche) {
		Boolean oldMesaNoche = mesaNoche;
		mesaNoche = newMesaNoche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CAMA_DOBLE__MESA_NOCHE, oldMesaNoche, mesaNoche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.CAMA_DOBLE__MESA_NOCHE:
				return getMesaNoche();
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
			case DomainPackage.CAMA_DOBLE__MESA_NOCHE:
				setMesaNoche((Boolean)newValue);
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
			case DomainPackage.CAMA_DOBLE__MESA_NOCHE:
				setMesaNoche(MESA_NOCHE_EDEFAULT);
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
			case DomainPackage.CAMA_DOBLE__MESA_NOCHE:
				return MESA_NOCHE_EDEFAULT == null ? mesaNoche != null : !MESA_NOCHE_EDEFAULT.equals(mesaNoche);
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
		result.append(" (mesaNoche: ");
		result.append(mesaNoche);
		result.append(')');
		return result.toString();
	}

} //CamaDobleImpl
