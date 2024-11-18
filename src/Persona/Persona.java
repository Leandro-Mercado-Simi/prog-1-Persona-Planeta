package Persona;

/*
Agregar dos nuevos atributos a la clase Persona. Un atributo
que represente el país de nacimiento de la persona (de tipo
String) y otro que identifique el género de la persona, el cual
debe represen-tarse como un char con valores 'H' o 'M'.

▶ Modificar el constructor de la clase Persona para que inicialice
es-tos dos nuevos atributos.

▶ Modificar el método imprimir de la clase Persona para que
mues- tre en pantalla los valores de los nuevos atributos.
*/

public class Persona {
    private String nombre;
    private String apellidos;
    private String numeroDocumentoIdentidad;
    private int anioNacimiento;
    private String paisNacimiento;
    private char genero;

    public Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int anioNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anioNacimiento = anioNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad;
    }

    public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void imprimir() {
        System.out.println("----------------------------------------------------------");
        System.out.println("Nombre completo: " + this.nombre + " " + this.apellidos);
        System.out.println("Número de documento: " + this.numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento: " + this.anioNacimiento);
        System.out.println("País de nacimiento: " + this.paisNacimiento);
        System.out.println("Género: " + this.genero);
        System.out.println("----------------------------------------------------------");
    }
}
