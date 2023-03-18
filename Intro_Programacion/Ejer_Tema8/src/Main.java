public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(23);
        persona.setTelefono(612345678);
        persona.setNombre("Francisco");

        System.out.println("Tiene " + persona.getEdad() + " años");
        System.out.println("Su nº de tlfno es: " + persona.getTelefono());
        System.out.println("Su nombre es: " + persona.getNombre());
    }
}

class Persona {
    private int edad;
    private int telefono;
    private String nombre;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }


}