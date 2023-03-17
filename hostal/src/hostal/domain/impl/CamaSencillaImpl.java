/**
 */
package hostal.domain.impl;

import hostal.domain.CamaSencilla;
import hostal.domain.DomainPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cama Sencilla</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hostal.domain.impl.CamaSencillaImpl#getMesita <em>Mesita</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CamaSencillaImpl extends CamaImpl implements CamaSencilla {
	/**
	 * The default value of the '{@link #getMesita() <em>Mesita</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesita()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MESITA_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getMesita() <em>Mesita</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesita()
	 * @generated
	 * @ordered
	 */
	protected Boolean mesita = MESITA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamaSencillaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.CAMA_SENCILLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMesita() {
		return mesita;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMesita(Boolean newMesita) {
		Boolean oldMesita = mesita;
		mesita = newMesita;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CAMA_SENCILLA__MESITA, oldMesita, mesita));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.CAMA_SENCILLA__MESITA:
				return getMesita();
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
			case DomainPackage.CAMA_SENCILLA__MESITA:
				setMesita((Boolean)newValue);
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
			case DomainPackage.CAMA_SENCILLA__MESITA:
				setMesita(MESITA_EDEFAULT);
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
			case DomainPackage.CAMA_SENCILLA__MESITA:
				return MESITA_EDEFAULT == null ? mesita != null : !MESITA_EDEFAULT.equals(mesita);
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
		result.append(" (mesita: ");
		result.append(mesita);
		result.append(')');
		return result.toString();
	}

} //CamaSencillaImpl
