package laboratorio3;

public class Entrenador {

    private int idEntrenador;
    private String nombre;
    private String tipo;
    static int contadorEntrenadores;

    public Entrenador(String nombre, String tipo) {//punto 2
        contadorEntrenadores++;
        idEntrenador = contadorEntrenadores;

        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {//punto 3
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static int getContadorEntrenadores() {
        return contadorEntrenadores;
    }

}
