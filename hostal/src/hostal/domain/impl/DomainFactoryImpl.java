/**
 */
package hostal.domain.impl;

import hostal.domain.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainFactoryImpl extends EFactoryImpl implements DomainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainFactory init() {
		try {
			DomainFactory theDomainFactory = (DomainFactory)EPackage.Registry.INSTANCE.getEFactory(DomainPackage.eNS_URI);
			if (theDomainFactory != null) {
				return theDomainFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DomainPackage.CAMA_DOBLE: return createCamaDoble();
			case DomainPackage.CAMA_SENCILLA: return createCamaSencilla();
			case DomainPackage.DOMAIN: return createDomain();
			case DomainPackage.ESTADO: return createEstado();
			case DomainPackage.HABITACION_DOBLE: return createHabitacionDoble();
			case DomainPackage.HABITACION_SENCILLA: return createHabitacionSencilla();
			case DomainPackage.HOSTEL: return createHostel();
			case DomainPackage.TIPO_ESTADO: return createTipoEstado();
			case DomainPackage.TIPO_COBIJA: return createTipoCobija();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamaDoble createCamaDoble() {
		CamaDobleImpl camaDoble = new CamaDobleImpl();
		return camaDoble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamaSencilla createCamaSencilla() {
		CamaSencillaImpl camaSencilla = new CamaSencillaImpl();
		return camaSencilla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Estado createEstado() {
		EstadoImpl estado = new EstadoImpl();
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HabitacionDoble createHabitacionDoble() {
		HabitacionDobleImpl habitacionDoble = new HabitacionDobleImpl();
		return habitacionDoble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HabitacionSencilla createHabitacionSencilla() {
		HabitacionSencillaImpl habitacionSencilla = new HabitacionSencillaImpl();
		return habitacionSencilla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostel createHostel() {
		HostelImpl hostel = new HostelImpl();
		return hostel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoEstado createTipoEstado() {
		TipoEstadoImpl tipoEstado = new TipoEstadoImpl();
		return tipoEstado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoCobija createTipoCobija() {
		TipoCobijaImpl tipoCobija = new TipoCobijaImpl();
		return tipoCobija;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainPackage getDomainPackage() {
		return (DomainPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DomainPackage getPackage() {
		return DomainPackage.eINSTANCE;
	}

} //DomainFactoryImpl
