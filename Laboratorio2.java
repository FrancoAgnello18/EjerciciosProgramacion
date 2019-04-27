package laboratorio2;

public class Laboratorio2 {

    public static void main(String[] args) { // Punto 1

        Entrenador entrenador1 = new Entrenador();// Punto 5.1
        entrenador1.setEntrenador("Francisco", "Tenis");

        entrenador1.indicarEntrenamiento(); // Punto 5.2
        System.out.println("La variable entrenador1: " + entrenador1 + "\n");// Punto 5.3

        Entrenador entrenador2 = new Entrenador("Franco", "Basquet"); // Punto 5.4       
        entrenador2.indicarEntrenamiento(); // Punto 5.5
        System.out.println("La variable entrenador2: " + entrenador2); // Punto 5.6       

    }

}
