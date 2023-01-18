package problema1;

public class Cliente {
    private String nombre;
    private int cedula;
    public Cliente(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", cedula=" + cedula +
                '}';
    }
}
