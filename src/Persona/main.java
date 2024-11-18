package Persona;

public class main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro", "Perez", "38765201", 1994, "Argentina", 'H');
        Persona p2 = new Persona("Luis", "Leon", "39765231", 1997, "Uruguay", 'H');
        p1.imprimir();
        p2.imprimir();
    }
}
