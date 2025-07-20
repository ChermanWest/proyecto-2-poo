public class Especialidad extends Medico {

    public enum TipoEspecialidad {
        PEDIATRIA,
        CARDIOLOGIA,
        TRAUMATOLOGIA
    }

    private TipoEspecialidad tipo;

    public Especialidad(String nombre, String Rut , TipoEspecialidad tipo) {
        super(Nombre, Rut );
        this.tipo = tipo;
    }

    public TipoEspecialidad getTipoEspecialidad() {
        return tipo;
    }

    public int getPrecioConsulta() {
        switch (tipo) {
            case PEDIATRIA:
                return 25000;
            case CARDIOLOGIA:
                return 35000;
            case TRAUMATOLOGIA:
                return 30000;
            default:
                return 0;
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Especialidad: " + tipo);
        System.out.println("Precio de consulta: $" + getPrecioConsulta());
    }
}
