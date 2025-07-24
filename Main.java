import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CentroMedico centro = new CentroMedico("Centro Vida", "76.123.456-7", "Salud Vida Ltda");

        int opcion;

        do {
            System.out.println("\n=== MENÚ CENTRO MÉDICO ===");
            System.out.println("1. Agregar paciente");
            System.out.println("2. Modificar paciente");
            System.out.println("3. Ver todos los pacientes");
            System.out.println("4. Atender paciente (agregar notación médica)");
            System.out.println("5. Ver historial médico");
            System.out.println("6. Cobrar consulta");
            System.out.println("7. Gestionar médicos");
            System.out.println("8. Gestionar secretarias");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer
            // Esta es la opción para agregar pacientes
            switch (opcion) {
                case 1:
                    System.out.println("RUT:");
                    String rut = sc.nextLine();
                    System.out.println("Nombre:");
                    String nombre = sc.nextLine();
                    System.out.println("Apellido:");
                    String apellido = sc.nextLine();
                    System.out.println("Edad:");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Dirección:");
                    String direccion = sc.nextLine();
                    System.out.println("Teléfono:");
                    String telefono = sc.nextLine();
                    System.out.println("Tipo de seguridad social (1 = FONASA, 2 = ISAPRE):");
                    int tipoInt = sc.nextInt();
                    sc.nextLine();

                    TipoSeguridadSocial tipo = (tipoInt == 2) ? TipoSeguridadSocial.ISAPRE : TipoSeguridadSocial.FONASA;

                    Paciente nuevo = new Paciente(rut, nombre, apellido, edad, direccion, telefono, tipo);
                    centro.agregarPaciente(nuevo);
                    System.out.println("✅ Paciente agregado.");
                    break;
                //esta es la opcion para modificar pacientes
                case 2:
                    System.out.println("RUT del paciente a modificar:");
                    String rutMod = sc.nextLine();
                    System.out.println("Nueva dirección:");
                    String nuevaDir = sc.nextLine();
                    System.out.println("Nuevo teléfono:");
                    String nuevoFono = sc.nextLine();
                    System.out.println("Nuevo tipo de seguridad (1 = FONASA, 2 = ISAPRE):");
                    int nuevaSeg = sc.nextInt();
                    sc.nextLine();

                    TipoSeguridadSocial nuevaSeguridad = (nuevaSeg == 2) ? TipoSeguridadSocial.ISAPRE : TipoSeguridadSocial.FONASA;

                    boolean modificado = centro.modificarPaciente(rutMod, nuevaDir, nuevoFono, nuevaSeguridad);

                    if (modificado) {
                        System.out.println("✅ Datos modificados correctamente.");
                    } else {
                        System.out.println("❌ Paciente no encontrado.");
                    }
                    break;

                    //esta es la opcion para ver los pacientes, los lista
                    
                case 3:
                    System.out.println("=== Lista de Pacientes ===");
                    for (Paciente p : centro.getPacientes()) {
                        System.out.println("- " + p.getNombre() + " " + p.getApellido() + " | RUT: " + p.getRut());
                    }
                    break;

                //esta es la opcion para atender un paciente, previamente ingresado
                case 4:
                    System.out.println("RUT del paciente a atender:");
                    String rutAtender = sc.nextLine();

                    Paciente paciente = centro.buscarPacientePorRut(rutAtender);

                    if (paciente == null) {
                        System.out.println("❌ Paciente no encontrado.");
                        break;
                    }

                    // Crear ficha si no tiene
                    if (paciente.getFicha() == null) {
                        paciente.setFicha(new FichaMedica());
                    }

                    System.out.println("Ingrese síntomas:");
                    String sintomas = sc.nextLine();

                    System.out.println("Ingrese diagnóstico:");
                    String diagnostico = sc.nextLine();

                    System.out.println("Ingrese indicaciones:");
                    String indicaciones = sc.nextLine();

                    System.out.println("¿Se realizó procedimiento? (1 = Sí, 2 = No):");
                    int hayProc = sc.nextInt();
                    sc.nextLine();

                    Procedimiento proc = null;

                    if (hayProc == 1) {
                        System.out.println("Nombre del procedimiento:");
                        String nombreProc = sc.nextLine();

                        System.out.println("Costo del procedimiento:");
                        double costoProc = sc.nextDouble();
                        sc.nextLine();

                        proc = new Procedimiento(nombreProc, costoProc);
                    }

                    Notacion nueva = new Notacion(sintomas, diagnostico, indicaciones, proc);
                    paciente.getFicha().agregarNotacion(nueva);

                    System.out.println("✅ Consulta registrada correctamente.");
                    break;
                    //esta es la opción para ver la ficha medica del paciente,
                case 5:
                    System.out.println("RUT del paciente:");
                    String rutHistorial = sc.nextLine();

                    Paciente pacienteHist = centro.buscarPacientePorRut(rutHistorial);

                    if (pacienteHist != null && pacienteHist.getFicha() != null) {
                        pacienteHist.getFicha().mostrarHistorial();
                    } else if (pacienteHist != null) {
                        System.out.println("⚠️ El paciente no tiene ficha médica.");
                    } else {
                        System.out.println("❌ Paciente no encontrado.");
                    }
                    break;

                    // esta es la opcioón para proceder con el cobro al paciente
                case 6:
                    System.out.println("RUT del paciente:");
                    String rutCobro = sc.nextLine();

                    Paciente pacienteCobro = centro.buscarPacientePorRut(rutCobro);

                    if (pacienteCobro != null && pacienteCobro.getFicha() != null) {
                        double total = pacienteCobro.getFicha().calcularTotalProcedimientos();
                        System.out.println("💰 Total a pagar por procedimientos: $" + total);
                    } else if (pacienteCobro != null) {
                        System.out.println("⚠️ El paciente no tiene ficha médica.");
                    } else {
                        System.out.println("❌ Paciente no encontrado.");
                    }
                    break;

                case 7:
                    int opcionMedico = 0;
                    do {
                        System.out.println("\n=== Gestión de Médicos ===");
                        System.out.println("1. Agregar médico");
                        System.out.println("2. Modificar médico");
                        System.out.println("3. Eliminar médico");
                        System.out.println("4. Listar médicos");
                        System.out.println("5. Volver al menú principal");

                        opcionMedico = sc.nextInt();
                        sc.nextLine();

                    switch (opcionMedico) {
                        case 1:
                            // AGREGAR MÉDICO
                            System.out.println("Ingrese RUT:");
                            String rutM = sc.nextLine();
                            System.out.println("Ingrese nombre:");
                            String nombreM = sc.nextLine();
                            System.out.println("Ingrese apellido:");
                            String apellidoM = sc.nextLine();
                            System.out.println("Ingrese edad:");
                            int edadM = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Seleccione especialidad:");
                            for (Especialidad e : Especialidad.values()) {
                                System.out.println("- " + e);
                            }
                            String especStr = sc.nextLine().toUpperCase();
                            Especialidad especialidad = Especialidad.valueOf(especStr);

                            Medico nuevoMedico = new Medico(rutM, nombreM, apellidoM, edadM, especialidad);
                            centro.agregarMedico(nuevoMedico);

                            System.out.println("✅ Médico agregado correctamente.");
                            break;

                        case 2:
                            // MODIFICAR MÉDICO
                            System.out.println("Ingrese RUT del médico a modificar:");
                            rutMod = sc.nextLine();

                            Medico medicoMod = null;
                            for (Medico m : centro.getMedicos()) {
                                if (m.getRut().equalsIgnoreCase(rutMod)) {
                                    medicoMod = m;
                                    break;
                                }
                            }

                            if (medicoMod != null) {
                                System.out.println("Nuevo nombre:");
                                medicoMod.setNombre(sc.nextLine());
                                System.out.println("Nuevo apellido:");
                                medicoMod.setApellido(sc.nextLine());
                                System.out.println("Nueva edad:");
                                medicoMod.setEdad(sc.nextInt());
                                sc.nextLine();
                                System.out.println("Nueva especialidad:");
                                for (Especialidad e : Especialidad.values()) {
                                    System.out.println("- " + e);
                                }
                                medicoMod.setEspecialidad(Especialidad.valueOf(sc.nextLine().toUpperCase()));
                                System.out.println("✅ Médico modificado.");
                            } else {
                                System.out.println("❌ Médico no encontrado.");
                            }
                            break;

                        case 3:
                            // ELIMINAR MÉDICO
                            System.out.println("Ingrese RUT del médico a eliminar:");
                            String rutElim = sc.nextLine();

                            boolean eliminado = centro.getMedicos().removeIf(m -> m.getRut().equalsIgnoreCase(rutElim));

                            if (eliminado) {
                                System.out.println("✅ Médico eliminado.");
                            } else {
                                System.out.println("❌ Médico no encontrado.");
                            }
                            break;

                        case 4:
                            // LISTAR MÉDICOS
                            System.out.println("=== Lista de Médicos ===");
                            for (Medico m : centro.getMedicos()) {
                                System.out.println("- " + m.getNombre() + " " + m.getApellido() +
                                                " (" + m.getEspecialidad() + ") | RUT: " + m.getRut());
                            }
                            break;

                        case 5:
                            System.out.println("↩️ Volviendo al menú principal...");
                            break;

                        default:
                            System.out.println("⚠️ Opción inválida.");
                    }
                } while (opcionMedico != 5);
                break;

                //OPCION PARA GESTIONAR SECRETARIAS

                case 8:
    int opcionSec = 0;
    do {
        System.out.println("\n=== Gestión de Secretarias ===");
        System.out.println("1. Agregar secretaria");
        System.out.println("2. Modificar secretaria");
        System.out.println("3. Eliminar secretaria");
        System.out.println("4. Listar secretarias");
        System.out.println("5. Volver al menú principal");

        opcionSec = sc.nextInt();
        sc.nextLine();

        switch (opcionSec) {
            case 1:
                System.out.println("Ingrese RUT:");
                String rutS = sc.nextLine();
                System.out.println("Ingrese nombre:");
                String nombreS = sc.nextLine();
                System.out.println("Ingrese apellido:");
                String apellidoS = sc.nextLine();
                System.out.println("Ingrese edad:");
                int edadS = sc.nextInt();
                sc.nextLine();

                Secretaria nuevaSecretaria = new Secretaria(rutS, nombreS, apellidoS, edadS);
                centro.agregarSecretaria(nuevaSecretaria);
                System.out.println("✅ Secretaria agregada correctamente.");
                break;

            case 2:
                // MODIFICAR SECRETARIA
                System.out.println("Ingrese RUT de la secretaria a modificar:");
                rutMod = sc.nextLine();

                Secretaria secMod = null;
                for (Secretaria s : centro.getSecretarias()) {
                    if (s.getRut().equalsIgnoreCase(rutMod)) {
                        secMod = s;
                        break;
                    }
                }

                if (secMod != null) {
                    System.out.println("Nuevo nombre:");
                    secMod.setNombre(sc.nextLine());
                    System.out.println("Nuevo apellido:");
                    secMod.setApellido(sc.nextLine());
                    System.out.println("Nueva edad:");
                    secMod.setEdad(sc.nextInt());
                    sc.nextLine();
                    System.out.println("✅ Secretaria modificada.");
                } else {
                    System.out.println("❌ Secretaria no encontrada.");
                }
                break;

            case 3:
                // ELIMINAR SECRETARIA
                System.out.println("Ingrese RUT de la secretaria a eliminar:");
                String rutElim = sc.nextLine();

                boolean eliminada = centro.getSecretarias().removeIf(s -> s.getRut().equalsIgnoreCase(rutElim));

                if (eliminada) {
                    System.out.println("✅ Secretaria eliminada.");
                } else {
                    System.out.println("❌ Secretaria no encontrada.");
                }
                break;

            case 4:
                // LISTAR SECRETARIAS
                System.out.println("=== Lista de Secretarias ===");
                for (Secretaria s : centro.getSecretarias()) {
                    System.out.println("- " + s.getNombre() + " " + s.getApellido() + " | RUT: " + s.getRut());
                }
                break;

            case 5:
                System.out.println("↩️ Volviendo al menú principal...");
                break;

            default:
                System.out.println("⚠️ Opción inválida.");
        }
    } while (opcionSec != 5);
    break;
                    
                    
                //opcion para terminar programa
                    
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("❗ Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
