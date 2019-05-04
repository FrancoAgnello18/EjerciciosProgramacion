package laboratorio3;

public class Laboratorio3 {

    public static void main(String[] args) {//punto 3.1
        Entrenador entrenador1 = new Entrenador("Franco", "Basquet");
        entrenador1.getNombre();
        entrenador1.getTipo();

        System.out.println("id: " + Entrenador.getContadorEntrenadores() + "\tNombre: "//punto 3.2
                + entrenador1.getNombre() + "\tTipo: " + entrenador1.getTipo());

        Entrenador entrenador2 = new Entrenador("Juan", "Futbol");
        entrenador2.getNombre();
        entrenador2.getTipo();

        System.out.println("id: " + entrenador2.getContadorEntrenadores() + "\tNombre: "
                + entrenador2.getNombre() + "\tTipo: " + entrenador2.getTipo());

        Entrenador entrenador3 = new Entrenador("Marcos", "Tenis");
        entrenador3.getNombre();
        entrenador3.getTipo();

        System.out.println("id: " + entrenador3.getContadorEntrenadores() + "\tNombre: "
                + entrenador3.getNombre() + "\tTipo: " + entrenador3.getTipo());

        Entrenador entrenador4 = new Entrenador("Julio", "Rugby");
        entrenador4.getNombre();
        entrenador4.getTipo();

        System.out.println("id: " + entrenador4.getContadorEntrenadores() + "\tNombre: "
                + entrenador4.getNombre() + "\tTipo: " + entrenador4.getTipo());

        Entrenador entrenador5 = new Entrenador("Dario", "Natación");
        entrenador4.getNombre();
        entrenador4.getTipo();

        System.out.println("id: " + entrenador5.getContadorEntrenadores() + "\tNombre: "
                + entrenador5.getNombre() + "\tTipo: " + "" + entrenador5.getTipo());

    }

}
