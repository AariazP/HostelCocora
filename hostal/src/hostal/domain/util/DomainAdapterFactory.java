/**
 */
package hostal.domain.util;

import hostal.domain.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hostal.domain.DomainPackage
 * @generated
 */
public class DomainAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DomainPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DomainPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainSwitch<Adapter> modelSwitch =
		new DomainSwitch<Adapter>() {
			@Override
			public Adapter caseCama(Cama object) {
				return createCamaAdapter();
			}
			@Override
			public Adapter caseCamaDoble(CamaDoble object) {
				return createCamaDobleAdapter();
			}
			@Override
			public Adapter caseCamaSencilla(CamaSencilla object) {
				return createCamaSencillaAdapter();
			}
			@Override
			public Adapter caseCliente(Cliente object) {
				return createClienteAdapter();
			}
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseEstado(Estado object) {
				return createEstadoAdapter();
			}
			@Override
			public Adapter caseHabitacion(Habitacion object) {
				return createHabitacionAdapter();
			}
			@Override
			public Adapter caseHabitacionDoble(HabitacionDoble object) {
				return createHabitacionDobleAdapter();
			}
			@Override
			public Adapter caseHabitacionSencilla(HabitacionSencilla object) {
				return createHabitacionSencillaAdapter();
			}
			@Override
			public Adapter caseHostel(Hostel object) {
				return createHostelAdapter();
			}
			@Override
			public Adapter caseTipoEstado(TipoEstado object) {
				return createTipoEstadoAdapter();
			}
			@Override
			public Adapter caseTipoCobija(TipoCobija object) {
				return createTipoCobijaAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hostal.domain.Cama <em>Cama</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hostal.domain.Cama
	 * @generated
	 */
	public Adapter createCamaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hostal.domain.CamaDoble <em>Cama Doble</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hostal.domain.CamaDoble
	 * @generated
	 */
	public Adapter createCamaDobleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hostal.domain.CamaSencilla <em>Cama Sencilla</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hostal.domain.CamaSencilla
	 * @generated
	 */
	public Adapter createCamaSencillaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hostal.domain.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hostal.domain.Cliente
	 * @generated
	 */
	public Adapter createClienteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hostal.domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hostal.domain.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hostal.domain.Estado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hostal.domain.Estado
	 * @generated
	 */
	public Adapter createEstadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hostal.domain.Habitacion <em>Habitacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hostal.domain.Habitacion
	 * @generated
	 */
	public Adapter createHabitacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hostal.domain.HabitacionDoble <em>Habitacion Doble</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hostal.domain.HabitacionDoble
	 * @generated
	 */
	public Adapter createHabitacionDobleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hostal.domain.HabitacionSencilla <em>Habitacion Sencilla</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hostal.domain.HabitacionSencilla
	 * @generated
	 */
	public Adapter createHabitacionSencillaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hostal.domain.Hostel <em>Hostel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hostal.domain.Hostel
	 * @generated
	 */
	public Adapter createHostelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hostal.domain.TipoEstado <em>Tipo Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hostal.domain.TipoEstado
	 * @generated
	 */
	public Adapter createTipoEstadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hostal.domain.TipoCobija <em>Tipo Cobija</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hostal.domain.TipoCobija
	 * @generated
	 */
	public Adapter createTipoCobijaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DomainAdapterFactory
