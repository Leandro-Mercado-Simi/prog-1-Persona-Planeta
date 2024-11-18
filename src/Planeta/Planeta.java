package Planeta;


public class Planeta {

    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;
    boolean esObservable = false;
    tipoPlaneta tipo;
    double periodoOrbital = 0;
    double periodoRotacion = 0;


    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaSol, boolean esObservable, tipoPlaneta tipo, double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.esObservable = esObservable;
        this.tipo = tipo;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    //Definir un método que imprima en pantalla los valores de los atributos de un planeta.
    public void imprimir() {
        System.out.println("-------------------------------------------------");
        System.out.println("Nombre planeta: " + this.nombre);
        System.out.println("Cantidad de satélites: " + this.cantidadSatelites);
        System.out.println("Masa (Kilogramos): " + this.masa);
        System.out.println("Volumen (kilómetros cúbicos): " + this.volumen);
        System.out.println("Diámetro (Kilómetros): " + this.diametro);
        System.out.println("Distancia (Millones de kilómetros): " + this.distanciaSol);
        System.out.println("Tipo de planeta: " + this.tipo);
        System.out.println("Es observable a simple vista: " + this.esObservable);
        System.out.println("Período orbital (años): " + this.periodoOrbital);
        System.out.println("Período de rotación (días): " + this.periodoRotacion);
        System.out.println("-------------------------------------------------");
    }

    //Calcular la densidad un planeta, como el cociente entre su masa y su volumen.
    public double calcularDensidad() {
        double densidad = 0;
        if (this.masa != 0 && this.volumen != 0) {
            densidad = this.masa / this.volumen;
        }
        return densidad;
    }

    // Determinar si un planeta del sistema solar se considera exterior.
    public boolean esPlanetaExterior() {
        double distanciaEnUA = this.distanciaSol / 149.6;
        return distanciaEnUA > 3.4;
    }

    enum tipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }
}