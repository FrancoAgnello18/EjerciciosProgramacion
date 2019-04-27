package laboratorio2;

public class Entrenador {

    private String nombre;
    private String tipo;

    public Entrenador() { // Punto 2
    }

    public Entrenador(String nombre, String tipo) { // Punto 3
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void setEntrenador(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void indicarEntrenamiento() { // Punto 4
        System.out.println("Mi nombre es " + this.nombre + " y soy entrenador de " + this.tipo);
    }

}
