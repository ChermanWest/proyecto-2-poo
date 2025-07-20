public enum Especialidad {
    PEDIATRIA(25000),
    CARDIOLOGIA(35000),
    TRAUMATOLOGIA(30000);

    private final int precioConsulta;

    Especialidad(int precioConsulta) {
        this.precioConsulta = precioConsulta;
    }

    public int getPrecioConsulta() {
        return precioConsulta;
    }
}