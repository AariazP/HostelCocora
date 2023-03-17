/**
 */
package hostal.domain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hostal.domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///hostal/domain.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hostal.domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = hostal.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link hostal.domain.impl.CamaImpl <em>Cama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hostal.domain.impl.CamaImpl
	 * @see hostal.domain.impl.DomainPackageImpl#getCama()
	 * @generated
	 */
	int CAMA = 0;

	/**
	 * The feature id for the '<em><b>Largo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA__LARGO = 0;

	/**
	 * The feature id for the '<em><b>Ancho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA__ANCHO = 1;

	/**
	 * The feature id for the '<em><b>Almohada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA__ALMOHADA = 2;

	/**
	 * The feature id for the '<em><b>Hostel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA__HOSTEL = 3;

	/**
	 * The feature id for the '<em><b>Tipo Cobija</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA__TIPO_COBIJA = 4;

	/**
	 * The feature id for the '<em><b>Habitacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA__HABITACION = 5;

	/**
	 * The number of structural features of the '<em>Cama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link hostal.domain.impl.CamaDobleImpl <em>Cama Doble</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hostal.domain.impl.CamaDobleImpl
	 * @see hostal.domain.impl.DomainPackageImpl#getCamaDoble()
	 * @generated
	 */
	int CAMA_DOBLE = 1;

	/**
	 * The feature id for the '<em><b>Largo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA_DOBLE__LARGO = CAMA__LARGO;

	/**
	 * The feature id for the '<em><b>Ancho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA_DOBLE__ANCHO = CAMA__ANCHO;

	/**
	 * The feature id for the '<em><b>Almohada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA_DOBLE__ALMOHADA = CAMA__ALMOHADA;

	/**
	 * The feature id for the '<em><b>Hostel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA_DOBLE__HOSTEL = CAMA__HOSTEL;

	/**
	 * The feature id for the '<em><b>Tipo Cobija</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA_DOBLE__TIPO_COBIJA = CAMA__TIPO_COBIJA;

	/**
	 * The feature id for the '<em><b>Habitacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA_DOBLE__HABITACION = CAMA__HABITACION;

	/**
	 * The feature id for the '<em><b>Mesa Noche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA_DOBLE__MESA_NOCHE = CAMA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cama Doble</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA_DOBLE_FEATURE_COUNT = CAMA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hostal.domain.impl.CamaSencillaImpl <em>Cama Sencilla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hostal.domain.impl.CamaSencillaImpl
	 * @see hostal.domain.impl.DomainPackageImpl#getCamaSencilla()
	 * @generated
	 */
	int CAMA_SENCILLA = 2;

	/**
	 * The feature id for the '<em><b>Largo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA_SENCILLA__LARGO = CAMA__LARGO;

	/**
	 * The feature id for the '<em><b>Ancho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA_SENCILLA__ANCHO = CAMA__ANCHO;

	/**
	 * The feature id for the '<em><b>Almohada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA_SENCILLA__ALMOHADA = CAMA__ALMOHADA;

	/**
	 * The feature id for the '<em><b>Hostel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA_SENCILLA__HOSTEL = CAMA__HOSTEL;

	/**
	 * The feature id for the '<em><b>Tipo Cobija</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA_SENCILLA__TIPO_COBIJA = CAMA__TIPO_COBIJA;

	/**
	 * The feature id for the '<em><b>Habitacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA_SENCILLA__HABITACION = CAMA__HABITACION;

	/**
	 * The feature id for the '<em><b>Mesita</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA_SENCILLA__MESITA = CAMA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cama Sencilla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMA_SENCILLA_FEATURE_COUNT = CAMA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hostal.domain.impl.ClienteImpl <em>Cliente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hostal.domain.impl.ClienteImpl
	 * @see hostal.domain.impl.DomainPackageImpl#getCliente()
	 * @generated
	 */
	int CLIENTE = 3;

	/**
	 * The feature id for the '<em><b>Cedula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__CEDULA = 0;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__TELEFONO = 1;

	/**
	 * The feature id for the '<em><b>Movil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__MOVIL = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Hostel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__HOSTEL = 4;

	/**
	 * The feature id for the '<em><b>Lista Habitaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__LISTA_HABITACIONES = 5;

	/**
	 * The number of structural features of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link hostal.domain.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hostal.domain.impl.DomainImpl
	 * @see hostal.domain.impl.DomainPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 4;

	/**
	 * The feature id for the '<em><b>The Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Lst Hostel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LST_HOSTEL = 1;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_UI = 2;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hostal.domain.impl.EstadoImpl <em>Estado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hostal.domain.impl.EstadoImpl
	 * @see hostal.domain.impl.DomainPackageImpl#getEstado()
	 * @generated
	 */
	int ESTADO = 5;

	/**
	 * The feature id for the '<em><b>Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO__INICIO = 0;

	/**
	 * The feature id for the '<em><b>Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO__FIN = 1;

	/**
	 * The feature id for the '<em><b>Motivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO__MOTIVO = 2;

	/**
	 * The feature id for the '<em><b>Habitacion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO__HABITACION = 3;

	/**
	 * The feature id for the '<em><b>Tipo Estado</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO__TIPO_ESTADO = 4;

	/**
	 * The feature id for the '<em><b>Lst Tipo Estado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO__LST_TIPO_ESTADO = 5;

	/**
	 * The number of structural features of the '<em>Estado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link hostal.domain.impl.HabitacionImpl <em>Habitacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hostal.domain.impl.HabitacionImpl
	 * @see hostal.domain.impl.DomainPackageImpl#getHabitacion()
	 * @generated
	 */
	int HABITACION = 6;

	/**
	 * The feature id for the '<em><b>Cliente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION__CLIENTE = 0;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION__ESTADO = 1;

	/**
	 * The feature id for the '<em><b>Banio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION__BANIO = 2;

	/**
	 * The feature id for the '<em><b>Internet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION__INTERNET = 3;

	/**
	 * The feature id for the '<em><b>Num Habitacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION__NUM_HABITACION = 4;

	/**
	 * The feature id for the '<em><b>Parking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION__PARKING = 5;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION__TELEFONO = 6;

	/**
	 * The feature id for the '<em><b>Cama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION__CAMA = 7;

	/**
	 * The feature id for the '<em><b>Lst Cama Sencilla</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION__LST_CAMA_SENCILLA = 8;

	/**
	 * The feature id for the '<em><b>Hostel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION__HOSTEL = 9;

	/**
	 * The number of structural features of the '<em>Habitacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link hostal.domain.impl.HabitacionDobleImpl <em>Habitacion Doble</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hostal.domain.impl.HabitacionDobleImpl
	 * @see hostal.domain.impl.DomainPackageImpl#getHabitacionDoble()
	 * @generated
	 */
	int HABITACION_DOBLE = 7;

	/**
	 * The feature id for the '<em><b>Cliente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_DOBLE__CLIENTE = HABITACION__CLIENTE;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_DOBLE__ESTADO = HABITACION__ESTADO;

	/**
	 * The feature id for the '<em><b>Banio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_DOBLE__BANIO = HABITACION__BANIO;

	/**
	 * The feature id for the '<em><b>Internet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_DOBLE__INTERNET = HABITACION__INTERNET;

	/**
	 * The feature id for the '<em><b>Num Habitacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_DOBLE__NUM_HABITACION = HABITACION__NUM_HABITACION;

	/**
	 * The feature id for the '<em><b>Parking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_DOBLE__PARKING = HABITACION__PARKING;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_DOBLE__TELEFONO = HABITACION__TELEFONO;

	/**
	 * The feature id for the '<em><b>Cama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_DOBLE__CAMA = HABITACION__CAMA;

	/**
	 * The feature id for the '<em><b>Lst Cama Sencilla</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_DOBLE__LST_CAMA_SENCILLA = HABITACION__LST_CAMA_SENCILLA;

	/**
	 * The feature id for the '<em><b>Hostel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_DOBLE__HOSTEL = HABITACION__HOSTEL;

	/**
	 * The feature id for the '<em><b>Jacuzzi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_DOBLE__JACUZZI = HABITACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tv HD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_DOBLE__TV_HD = HABITACION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Habitacion Doble</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_DOBLE_FEATURE_COUNT = HABITACION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hostal.domain.impl.HabitacionSencillaImpl <em>Habitacion Sencilla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hostal.domain.impl.HabitacionSencillaImpl
	 * @see hostal.domain.impl.DomainPackageImpl#getHabitacionSencilla()
	 * @generated
	 */
	int HABITACION_SENCILLA = 8;

	/**
	 * The feature id for the '<em><b>Cliente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_SENCILLA__CLIENTE = HABITACION__CLIENTE;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_SENCILLA__ESTADO = HABITACION__ESTADO;

	/**
	 * The feature id for the '<em><b>Banio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_SENCILLA__BANIO = HABITACION__BANIO;

	/**
	 * The feature id for the '<em><b>Internet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_SENCILLA__INTERNET = HABITACION__INTERNET;

	/**
	 * The feature id for the '<em><b>Num Habitacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_SENCILLA__NUM_HABITACION = HABITACION__NUM_HABITACION;

	/**
	 * The feature id for the '<em><b>Parking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_SENCILLA__PARKING = HABITACION__PARKING;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_SENCILLA__TELEFONO = HABITACION__TELEFONO;

	/**
	 * The feature id for the '<em><b>Cama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_SENCILLA__CAMA = HABITACION__CAMA;

	/**
	 * The feature id for the '<em><b>Lst Cama Sencilla</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_SENCILLA__LST_CAMA_SENCILLA = HABITACION__LST_CAMA_SENCILLA;

	/**
	 * The feature id for the '<em><b>Hostel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_SENCILLA__HOSTEL = HABITACION__HOSTEL;

	/**
	 * The feature id for the '<em><b>Agua Caliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_SENCILLA__AGUA_CALIENTE = HABITACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tv LCD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_SENCILLA__TV_LCD = HABITACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lst Habitacion</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_SENCILLA__LST_HABITACION = HABITACION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Habitacion Sencilla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITACION_SENCILLA_FEATURE_COUNT = HABITACION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hostal.domain.impl.HostelImpl <em>Hostel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hostal.domain.impl.HostelImpl
	 * @see hostal.domain.impl.DomainPackageImpl#getHostel()
	 * @generated
	 */
	int HOSTEL = 9;

	/**
	 * The feature id for the '<em><b>Lista Cama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTEL__LISTA_CAMA = 0;

	/**
	 * The feature id for the '<em><b>Lista Clientes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTEL__LISTA_CLIENTES = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTEL__NOMBRE = 2;

	/**
	 * The feature id for the '<em><b>Lst Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTEL__LST_DOMAIN = 3;

	/**
	 * The feature id for the '<em><b>Lista Habitaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTEL__LISTA_HABITACIONES = 4;

	/**
	 * The number of structural features of the '<em>Hostel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link hostal.domain.impl.TipoEstadoImpl <em>Tipo Estado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hostal.domain.impl.TipoEstadoImpl
	 * @see hostal.domain.impl.DomainPackageImpl#getTipoEstado()
	 * @generated
	 */
	int TIPO_ESTADO = 10;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_ESTADO__TIPO = 0;

	/**
	 * The feature id for the '<em><b>Lst Estado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_ESTADO__LST_ESTADO = 1;

	/**
	 * The number of structural features of the '<em>Tipo Estado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_ESTADO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hostal.domain.impl.TipoCobijaImpl <em>Tipo Cobija</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hostal.domain.impl.TipoCobijaImpl
	 * @see hostal.domain.impl.DomainPackageImpl#getTipoCobija()
	 * @generated
	 */
	int TIPO_COBIJA = 11;

	/**
	 * The feature id for the '<em><b>Cama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_COBIJA__CAMA = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_COBIJA__TIPO = 1;

	/**
	 * The number of structural features of the '<em>Tipo Cobija</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_COBIJA_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link hostal.domain.Cama <em>Cama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cama</em>'.
	 * @see hostal.domain.Cama
	 * @generated
	 */
	EClass getCama();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.Cama#getLargo <em>Largo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Largo</em>'.
	 * @see hostal.domain.Cama#getLargo()
	 * @see #getCama()
	 * @generated
	 */
	EAttribute getCama_Largo();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.Cama#getAncho <em>Ancho</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ancho</em>'.
	 * @see hostal.domain.Cama#getAncho()
	 * @see #getCama()
	 * @generated
	 */
	EAttribute getCama_Ancho();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.Cama#getAlmohada <em>Almohada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Almohada</em>'.
	 * @see hostal.domain.Cama#getAlmohada()
	 * @see #getCama()
	 * @generated
	 */
	EAttribute getCama_Almohada();

	/**
	 * Returns the meta object for the container reference '{@link hostal.domain.Cama#getHostel <em>Hostel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Hostel</em>'.
	 * @see hostal.domain.Cama#getHostel()
	 * @see #getCama()
	 * @generated
	 */
	EReference getCama_Hostel();

	/**
	 * Returns the meta object for the reference '{@link hostal.domain.Cama#getTipoCobija <em>Tipo Cobija</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tipo Cobija</em>'.
	 * @see hostal.domain.Cama#getTipoCobija()
	 * @see #getCama()
	 * @generated
	 */
	EReference getCama_TipoCobija();

	/**
	 * Returns the meta object for the reference '{@link hostal.domain.Cama#getHabitacion <em>Habitacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Habitacion</em>'.
	 * @see hostal.domain.Cama#getHabitacion()
	 * @see #getCama()
	 * @generated
	 */
	EReference getCama_Habitacion();

	/**
	 * Returns the meta object for class '{@link hostal.domain.CamaDoble <em>Cama Doble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cama Doble</em>'.
	 * @see hostal.domain.CamaDoble
	 * @generated
	 */
	EClass getCamaDoble();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.CamaDoble#getMesaNoche <em>Mesa Noche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mesa Noche</em>'.
	 * @see hostal.domain.CamaDoble#getMesaNoche()
	 * @see #getCamaDoble()
	 * @generated
	 */
	EAttribute getCamaDoble_MesaNoche();

	/**
	 * Returns the meta object for class '{@link hostal.domain.CamaSencilla <em>Cama Sencilla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cama Sencilla</em>'.
	 * @see hostal.domain.CamaSencilla
	 * @generated
	 */
	EClass getCamaSencilla();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.CamaSencilla#getMesita <em>Mesita</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mesita</em>'.
	 * @see hostal.domain.CamaSencilla#getMesita()
	 * @see #getCamaSencilla()
	 * @generated
	 */
	EAttribute getCamaSencilla_Mesita();

	/**
	 * Returns the meta object for class '{@link hostal.domain.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliente</em>'.
	 * @see hostal.domain.Cliente
	 * @generated
	 */
	EClass getCliente();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.Cliente#getCedula <em>Cedula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cedula</em>'.
	 * @see hostal.domain.Cliente#getCedula()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Cedula();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.Cliente#getTelefono <em>Telefono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono</em>'.
	 * @see hostal.domain.Cliente#getTelefono()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Telefono();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.Cliente#getMovil <em>Movil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movil</em>'.
	 * @see hostal.domain.Cliente#getMovil()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Movil();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.Cliente#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see hostal.domain.Cliente#getEmail()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Email();

	/**
	 * Returns the meta object for the container reference '{@link hostal.domain.Cliente#getHostel <em>Hostel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Hostel</em>'.
	 * @see hostal.domain.Cliente#getHostel()
	 * @see #getCliente()
	 * @generated
	 */
	EReference getCliente_Hostel();

	/**
	 * Returns the meta object for the reference list '{@link hostal.domain.Cliente#getListaHabitaciones <em>Lista Habitaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lista Habitaciones</em>'.
	 * @see hostal.domain.Cliente#getListaHabitaciones()
	 * @see #getCliente()
	 * @generated
	 */
	EReference getCliente_ListaHabitaciones();

	/**
	 * Returns the meta object for class '{@link hostal.domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see hostal.domain.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the container reference '{@link hostal.domain.Domain#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Model Factory</em>'.
	 * @see hostal.domain.Domain#getTheModelFactory()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheModelFactory();

	/**
	 * Returns the meta object for the reference list '{@link hostal.domain.Domain#getLstHostel <em>Lst Hostel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Hostel</em>'.
	 * @see hostal.domain.Domain#getLstHostel()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_LstHostel();

	/**
	 * Returns the meta object for the reference '{@link hostal.domain.Domain#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The UI</em>'.
	 * @see hostal.domain.Domain#getTheUI()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheUI();

	/**
	 * Returns the meta object for class '{@link hostal.domain.Estado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estado</em>'.
	 * @see hostal.domain.Estado
	 * @generated
	 */
	EClass getEstado();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.Estado#getInicio <em>Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inicio</em>'.
	 * @see hostal.domain.Estado#getInicio()
	 * @see #getEstado()
	 * @generated
	 */
	EAttribute getEstado_Inicio();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.Estado#getFin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin</em>'.
	 * @see hostal.domain.Estado#getFin()
	 * @see #getEstado()
	 * @generated
	 */
	EAttribute getEstado_Fin();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.Estado#getMotivo <em>Motivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Motivo</em>'.
	 * @see hostal.domain.Estado#getMotivo()
	 * @see #getEstado()
	 * @generated
	 */
	EAttribute getEstado_Motivo();

	/**
	 * Returns the meta object for the container reference '{@link hostal.domain.Estado#getHabitacion <em>Habitacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Habitacion</em>'.
	 * @see hostal.domain.Estado#getHabitacion()
	 * @see #getEstado()
	 * @generated
	 */
	EReference getEstado_Habitacion();

	/**
	 * Returns the meta object for the containment reference '{@link hostal.domain.Estado#getTipoEstado <em>Tipo Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tipo Estado</em>'.
	 * @see hostal.domain.Estado#getTipoEstado()
	 * @see #getEstado()
	 * @generated
	 */
	EReference getEstado_TipoEstado();

	/**
	 * Returns the meta object for the reference list '{@link hostal.domain.Estado#getLstTipoEstado <em>Lst Tipo Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Tipo Estado</em>'.
	 * @see hostal.domain.Estado#getLstTipoEstado()
	 * @see #getEstado()
	 * @generated
	 */
	EReference getEstado_LstTipoEstado();

	/**
	 * Returns the meta object for class '{@link hostal.domain.Habitacion <em>Habitacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Habitacion</em>'.
	 * @see hostal.domain.Habitacion
	 * @generated
	 */
	EClass getHabitacion();

	/**
	 * Returns the meta object for the reference '{@link hostal.domain.Habitacion#getCliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cliente</em>'.
	 * @see hostal.domain.Habitacion#getCliente()
	 * @see #getHabitacion()
	 * @generated
	 */
	EReference getHabitacion_Cliente();

	/**
	 * Returns the meta object for the containment reference '{@link hostal.domain.Habitacion#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Estado</em>'.
	 * @see hostal.domain.Habitacion#getEstado()
	 * @see #getHabitacion()
	 * @generated
	 */
	EReference getHabitacion_Estado();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.Habitacion#getBanio <em>Banio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Banio</em>'.
	 * @see hostal.domain.Habitacion#getBanio()
	 * @see #getHabitacion()
	 * @generated
	 */
	EAttribute getHabitacion_Banio();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.Habitacion#getInternet <em>Internet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internet</em>'.
	 * @see hostal.domain.Habitacion#getInternet()
	 * @see #getHabitacion()
	 * @generated
	 */
	EAttribute getHabitacion_Internet();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.Habitacion#getNumHabitacion <em>Num Habitacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Habitacion</em>'.
	 * @see hostal.domain.Habitacion#getNumHabitacion()
	 * @see #getHabitacion()
	 * @generated
	 */
	EAttribute getHabitacion_NumHabitacion();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.Habitacion#getParking <em>Parking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parking</em>'.
	 * @see hostal.domain.Habitacion#getParking()
	 * @see #getHabitacion()
	 * @generated
	 */
	EAttribute getHabitacion_Parking();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.Habitacion#getTelefono <em>Telefono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono</em>'.
	 * @see hostal.domain.Habitacion#getTelefono()
	 * @see #getHabitacion()
	 * @generated
	 */
	EAttribute getHabitacion_Telefono();

	/**
	 * Returns the meta object for the reference '{@link hostal.domain.Habitacion#getCama <em>Cama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cama</em>'.
	 * @see hostal.domain.Habitacion#getCama()
	 * @see #getHabitacion()
	 * @generated
	 */
	EReference getHabitacion_Cama();

	/**
	 * Returns the meta object for the reference list '{@link hostal.domain.Habitacion#getLstCamaSencilla <em>Lst Cama Sencilla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Cama Sencilla</em>'.
	 * @see hostal.domain.Habitacion#getLstCamaSencilla()
	 * @see #getHabitacion()
	 * @generated
	 */
	EReference getHabitacion_LstCamaSencilla();

	/**
	 * Returns the meta object for the container reference '{@link hostal.domain.Habitacion#getHostel <em>Hostel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Hostel</em>'.
	 * @see hostal.domain.Habitacion#getHostel()
	 * @see #getHabitacion()
	 * @generated
	 */
	EReference getHabitacion_Hostel();

	/**
	 * Returns the meta object for class '{@link hostal.domain.HabitacionDoble <em>Habitacion Doble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Habitacion Doble</em>'.
	 * @see hostal.domain.HabitacionDoble
	 * @generated
	 */
	EClass getHabitacionDoble();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.HabitacionDoble#getJacuzzi <em>Jacuzzi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jacuzzi</em>'.
	 * @see hostal.domain.HabitacionDoble#getJacuzzi()
	 * @see #getHabitacionDoble()
	 * @generated
	 */
	EAttribute getHabitacionDoble_Jacuzzi();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.HabitacionDoble#getTvHD <em>Tv HD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tv HD</em>'.
	 * @see hostal.domain.HabitacionDoble#getTvHD()
	 * @see #getHabitacionDoble()
	 * @generated
	 */
	EAttribute getHabitacionDoble_TvHD();

	/**
	 * Returns the meta object for class '{@link hostal.domain.HabitacionSencilla <em>Habitacion Sencilla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Habitacion Sencilla</em>'.
	 * @see hostal.domain.HabitacionSencilla
	 * @generated
	 */
	EClass getHabitacionSencilla();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.HabitacionSencilla#getAguaCaliente <em>Agua Caliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agua Caliente</em>'.
	 * @see hostal.domain.HabitacionSencilla#getAguaCaliente()
	 * @see #getHabitacionSencilla()
	 * @generated
	 */
	EAttribute getHabitacionSencilla_AguaCaliente();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.HabitacionSencilla#getTvLCD <em>Tv LCD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tv LCD</em>'.
	 * @see hostal.domain.HabitacionSencilla#getTvLCD()
	 * @see #getHabitacionSencilla()
	 * @generated
	 */
	EAttribute getHabitacionSencilla_TvLCD();

	/**
	 * Returns the meta object for the reference list '{@link hostal.domain.HabitacionSencilla#getLstHabitacion <em>Lst Habitacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Habitacion</em>'.
	 * @see hostal.domain.HabitacionSencilla#getLstHabitacion()
	 * @see #getHabitacionSencilla()
	 * @generated
	 */
	EReference getHabitacionSencilla_LstHabitacion();

	/**
	 * Returns the meta object for class '{@link hostal.domain.Hostel <em>Hostel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostel</em>'.
	 * @see hostal.domain.Hostel
	 * @generated
	 */
	EClass getHostel();

	/**
	 * Returns the meta object for the containment reference list '{@link hostal.domain.Hostel#getListaCama <em>Lista Cama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Cama</em>'.
	 * @see hostal.domain.Hostel#getListaCama()
	 * @see #getHostel()
	 * @generated
	 */
	EReference getHostel_ListaCama();

	/**
	 * Returns the meta object for the containment reference list '{@link hostal.domain.Hostel#getListaClientes <em>Lista Clientes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Clientes</em>'.
	 * @see hostal.domain.Hostel#getListaClientes()
	 * @see #getHostel()
	 * @generated
	 */
	EReference getHostel_ListaClientes();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.Hostel#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see hostal.domain.Hostel#getNombre()
	 * @see #getHostel()
	 * @generated
	 */
	EAttribute getHostel_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link hostal.domain.Hostel#getLstDomain <em>Lst Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Domain</em>'.
	 * @see hostal.domain.Hostel#getLstDomain()
	 * @see #getHostel()
	 * @generated
	 */
	EReference getHostel_LstDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link hostal.domain.Hostel#getListaHabitaciones <em>Lista Habitaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Habitaciones</em>'.
	 * @see hostal.domain.Hostel#getListaHabitaciones()
	 * @see #getHostel()
	 * @generated
	 */
	EReference getHostel_ListaHabitaciones();

	/**
	 * Returns the meta object for class '{@link hostal.domain.TipoEstado <em>Tipo Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo Estado</em>'.
	 * @see hostal.domain.TipoEstado
	 * @generated
	 */
	EClass getTipoEstado();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.TipoEstado#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see hostal.domain.TipoEstado#getTipo()
	 * @see #getTipoEstado()
	 * @generated
	 */
	EAttribute getTipoEstado_Tipo();

	/**
	 * Returns the meta object for the reference list '{@link hostal.domain.TipoEstado#getLstEstado <em>Lst Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Estado</em>'.
	 * @see hostal.domain.TipoEstado#getLstEstado()
	 * @see #getTipoEstado()
	 * @generated
	 */
	EReference getTipoEstado_LstEstado();

	/**
	 * Returns the meta object for class '{@link hostal.domain.TipoCobija <em>Tipo Cobija</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo Cobija</em>'.
	 * @see hostal.domain.TipoCobija
	 * @generated
	 */
	EClass getTipoCobija();

	/**
	 * Returns the meta object for the reference '{@link hostal.domain.TipoCobija#getCama <em>Cama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cama</em>'.
	 * @see hostal.domain.TipoCobija#getCama()
	 * @see #getTipoCobija()
	 * @generated
	 */
	EReference getTipoCobija_Cama();

	/**
	 * Returns the meta object for the attribute '{@link hostal.domain.TipoCobija#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see hostal.domain.TipoCobija#getTipo()
	 * @see #getTipoCobija()
	 * @generated
	 */
	EAttribute getTipoCobija_Tipo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hostal.domain.impl.CamaImpl <em>Cama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hostal.domain.impl.CamaImpl
		 * @see hostal.domain.impl.DomainPackageImpl#getCama()
		 * @generated
		 */
		EClass CAMA = eINSTANCE.getCama();

		/**
		 * The meta object literal for the '<em><b>Largo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMA__LARGO = eINSTANCE.getCama_Largo();

		/**
		 * The meta object literal for the '<em><b>Ancho</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMA__ANCHO = eINSTANCE.getCama_Ancho();

		/**
		 * The meta object literal for the '<em><b>Almohada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMA__ALMOHADA = eINSTANCE.getCama_Almohada();

		/**
		 * The meta object literal for the '<em><b>Hostel</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMA__HOSTEL = eINSTANCE.getCama_Hostel();

		/**
		 * The meta object literal for the '<em><b>Tipo Cobija</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMA__TIPO_COBIJA = eINSTANCE.getCama_TipoCobija();

		/**
		 * The meta object literal for the '<em><b>Habitacion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMA__HABITACION = eINSTANCE.getCama_Habitacion();

		/**
		 * The meta object literal for the '{@link hostal.domain.impl.CamaDobleImpl <em>Cama Doble</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hostal.domain.impl.CamaDobleImpl
		 * @see hostal.domain.impl.DomainPackageImpl#getCamaDoble()
		 * @generated
		 */
		EClass CAMA_DOBLE = eINSTANCE.getCamaDoble();

		/**
		 * The meta object literal for the '<em><b>Mesa Noche</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMA_DOBLE__MESA_NOCHE = eINSTANCE.getCamaDoble_MesaNoche();

		/**
		 * The meta object literal for the '{@link hostal.domain.impl.CamaSencillaImpl <em>Cama Sencilla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hostal.domain.impl.CamaSencillaImpl
		 * @see hostal.domain.impl.DomainPackageImpl#getCamaSencilla()
		 * @generated
		 */
		EClass CAMA_SENCILLA = eINSTANCE.getCamaSencilla();

		/**
		 * The meta object literal for the '<em><b>Mesita</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMA_SENCILLA__MESITA = eINSTANCE.getCamaSencilla_Mesita();

		/**
		 * The meta object literal for the '{@link hostal.domain.impl.ClienteImpl <em>Cliente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hostal.domain.impl.ClienteImpl
		 * @see hostal.domain.impl.DomainPackageImpl#getCliente()
		 * @generated
		 */
		EClass CLIENTE = eINSTANCE.getCliente();

		/**
		 * The meta object literal for the '<em><b>Cedula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__CEDULA = eINSTANCE.getCliente_Cedula();

		/**
		 * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__TELEFONO = eINSTANCE.getCliente_Telefono();

		/**
		 * The meta object literal for the '<em><b>Movil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__MOVIL = eINSTANCE.getCliente_Movil();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__EMAIL = eINSTANCE.getCliente_Email();

		/**
		 * The meta object literal for the '<em><b>Hostel</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTE__HOSTEL = eINSTANCE.getCliente_Hostel();

		/**
		 * The meta object literal for the '<em><b>Lista Habitaciones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTE__LISTA_HABITACIONES = eINSTANCE.getCliente_ListaHabitaciones();

		/**
		 * The meta object literal for the '{@link hostal.domain.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hostal.domain.impl.DomainImpl
		 * @see hostal.domain.impl.DomainPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>The Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_MODEL_FACTORY = eINSTANCE.getDomain_TheModelFactory();

		/**
		 * The meta object literal for the '<em><b>Lst Hostel</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LST_HOSTEL = eINSTANCE.getDomain_LstHostel();

		/**
		 * The meta object literal for the '<em><b>The UI</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_UI = eINSTANCE.getDomain_TheUI();

		/**
		 * The meta object literal for the '{@link hostal.domain.impl.EstadoImpl <em>Estado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hostal.domain.impl.EstadoImpl
		 * @see hostal.domain.impl.DomainPackageImpl#getEstado()
		 * @generated
		 */
		EClass ESTADO = eINSTANCE.getEstado();

		/**
		 * The meta object literal for the '<em><b>Inicio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTADO__INICIO = eINSTANCE.getEstado_Inicio();

		/**
		 * The meta object literal for the '<em><b>Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTADO__FIN = eINSTANCE.getEstado_Fin();

		/**
		 * The meta object literal for the '<em><b>Motivo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTADO__MOTIVO = eINSTANCE.getEstado_Motivo();

		/**
		 * The meta object literal for the '<em><b>Habitacion</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTADO__HABITACION = eINSTANCE.getEstado_Habitacion();

		/**
		 * The meta object literal for the '<em><b>Tipo Estado</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTADO__TIPO_ESTADO = eINSTANCE.getEstado_TipoEstado();

		/**
		 * The meta object literal for the '<em><b>Lst Tipo Estado</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTADO__LST_TIPO_ESTADO = eINSTANCE.getEstado_LstTipoEstado();

		/**
		 * The meta object literal for the '{@link hostal.domain.impl.HabitacionImpl <em>Habitacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hostal.domain.impl.HabitacionImpl
		 * @see hostal.domain.impl.DomainPackageImpl#getHabitacion()
		 * @generated
		 */
		EClass HABITACION = eINSTANCE.getHabitacion();

		/**
		 * The meta object literal for the '<em><b>Cliente</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HABITACION__CLIENTE = eINSTANCE.getHabitacion_Cliente();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HABITACION__ESTADO = eINSTANCE.getHabitacion_Estado();

		/**
		 * The meta object literal for the '<em><b>Banio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HABITACION__BANIO = eINSTANCE.getHabitacion_Banio();

		/**
		 * The meta object literal for the '<em><b>Internet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HABITACION__INTERNET = eINSTANCE.getHabitacion_Internet();

		/**
		 * The meta object literal for the '<em><b>Num Habitacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HABITACION__NUM_HABITACION = eINSTANCE.getHabitacion_NumHabitacion();

		/**
		 * The meta object literal for the '<em><b>Parking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HABITACION__PARKING = eINSTANCE.getHabitacion_Parking();

		/**
		 * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HABITACION__TELEFONO = eINSTANCE.getHabitacion_Telefono();

		/**
		 * The meta object literal for the '<em><b>Cama</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HABITACION__CAMA = eINSTANCE.getHabitacion_Cama();

		/**
		 * The meta object literal for the '<em><b>Lst Cama Sencilla</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HABITACION__LST_CAMA_SENCILLA = eINSTANCE.getHabitacion_LstCamaSencilla();

		/**
		 * The meta object literal for the '<em><b>Hostel</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HABITACION__HOSTEL = eINSTANCE.getHabitacion_Hostel();

		/**
		 * The meta object literal for the '{@link hostal.domain.impl.HabitacionDobleImpl <em>Habitacion Doble</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hostal.domain.impl.HabitacionDobleImpl
		 * @see hostal.domain.impl.DomainPackageImpl#getHabitacionDoble()
		 * @generated
		 */
		EClass HABITACION_DOBLE = eINSTANCE.getHabitacionDoble();

		/**
		 * The meta object literal for the '<em><b>Jacuzzi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HABITACION_DOBLE__JACUZZI = eINSTANCE.getHabitacionDoble_Jacuzzi();

		/**
		 * The meta object literal for the '<em><b>Tv HD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HABITACION_DOBLE__TV_HD = eINSTANCE.getHabitacionDoble_TvHD();

		/**
		 * The meta object literal for the '{@link hostal.domain.impl.HabitacionSencillaImpl <em>Habitacion Sencilla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hostal.domain.impl.HabitacionSencillaImpl
		 * @see hostal.domain.impl.DomainPackageImpl#getHabitacionSencilla()
		 * @generated
		 */
		EClass HABITACION_SENCILLA = eINSTANCE.getHabitacionSencilla();

		/**
		 * The meta object literal for the '<em><b>Agua Caliente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HABITACION_SENCILLA__AGUA_CALIENTE = eINSTANCE.getHabitacionSencilla_AguaCaliente();

		/**
		 * The meta object literal for the '<em><b>Tv LCD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HABITACION_SENCILLA__TV_LCD = eINSTANCE.getHabitacionSencilla_TvLCD();

		/**
		 * The meta object literal for the '<em><b>Lst Habitacion</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HABITACION_SENCILLA__LST_HABITACION = eINSTANCE.getHabitacionSencilla_LstHabitacion();

		/**
		 * The meta object literal for the '{@link hostal.domain.impl.HostelImpl <em>Hostel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hostal.domain.impl.HostelImpl
		 * @see hostal.domain.impl.DomainPackageImpl#getHostel()
		 * @generated
		 */
		EClass HOSTEL = eINSTANCE.getHostel();

		/**
		 * The meta object literal for the '<em><b>Lista Cama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTEL__LISTA_CAMA = eINSTANCE.getHostel_ListaCama();

		/**
		 * The meta object literal for the '<em><b>Lista Clientes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTEL__LISTA_CLIENTES = eINSTANCE.getHostel_ListaClientes();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSTEL__NOMBRE = eINSTANCE.getHostel_Nombre();

		/**
		 * The meta object literal for the '<em><b>Lst Domain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTEL__LST_DOMAIN = eINSTANCE.getHostel_LstDomain();

		/**
		 * The meta object literal for the '<em><b>Lista Habitaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTEL__LISTA_HABITACIONES = eINSTANCE.getHostel_ListaHabitaciones();

		/**
		 * The meta object literal for the '{@link hostal.domain.impl.TipoEstadoImpl <em>Tipo Estado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hostal.domain.impl.TipoEstadoImpl
		 * @see hostal.domain.impl.DomainPackageImpl#getTipoEstado()
		 * @generated
		 */
		EClass TIPO_ESTADO = eINSTANCE.getTipoEstado();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_ESTADO__TIPO = eINSTANCE.getTipoEstado_Tipo();

		/**
		 * The meta object literal for the '<em><b>Lst Estado</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIPO_ESTADO__LST_ESTADO = eINSTANCE.getTipoEstado_LstEstado();

		/**
		 * The meta object literal for the '{@link hostal.domain.impl.TipoCobijaImpl <em>Tipo Cobija</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hostal.domain.impl.TipoCobijaImpl
		 * @see hostal.domain.impl.DomainPackageImpl#getTipoCobija()
		 * @generated
		 */
		EClass TIPO_COBIJA = eINSTANCE.getTipoCobija();

		/**
		 * The meta object literal for the '<em><b>Cama</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIPO_COBIJA__CAMA = eINSTANCE.getTipoCobija_Cama();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_COBIJA__TIPO = eINSTANCE.getTipoCobija_Tipo();

	}

} //DomainPackage
