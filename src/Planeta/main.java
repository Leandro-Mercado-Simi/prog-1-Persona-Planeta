package Planeta;

public class main {
    public static void main(String[] args) {
        Planeta tierra = new Planeta(
                "Tierra",
                1,
                5.9736E24,
                1.08321E12,
                12742,
                150,
                true,
                Planeta.tipoPlaneta.TERRESTRE,
                1,
                1
        );

        Planeta jupiter = new Planeta(
                "Júpiter",
                1,
                1.899E27,
                1.4313E15,
                138920,
                750,
                true,
                Planeta.tipoPlaneta.GASEOSO,
                11.86,
                0.41
        );

        tierra.imprimir();
        System.out.println("Densidad del pĺaneta " + tierra.nombre + ": " + tierra.calcularDensidad());
        System.out.println("El planeta " + tierra.nombre + ": " + (tierra.esPlanetaExterior() ? "Se considera planeta exterior" : "Se considera planeta interior"));
        jupiter.imprimir();
        System.out.println("Densidad del pĺaneta " + jupiter.nombre + ": " + jupiter.calcularDensidad());
        System.out.println("El planeta " + jupiter.nombre + ": " + (jupiter.esPlanetaExterior() ? "Se considera planeta exterior" : "Se considera planeta interior"));
    }
}
