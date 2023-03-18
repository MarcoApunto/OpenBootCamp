public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.edad = 19;
        cliente.telefono = 612345678;
        cliente.nombre = "Juan";
        cliente.credito = 368.00;

        System.out.println("DATOS CLIENTE:");
        System.out.println("EDAD: " + cliente.edad);
        System.out.println("TLFNO: " + cliente.telefono);
        System.out.println("NOMBRE: " + cliente.nombre);
        System.out.println("CREDITO: " + cliente.credito + "$" + "\n");

        trabajador.edad = 27;
        trabajador.telefono = 687654321;
        trabajador.nombre = "Jose";
        trabajador.salario = 1958.80;

        System.out.println("DATOS TRABAJADOR:");
        System.out.println("EDAD: " + trabajador.edad);
        System.out.println("TLFNO: " + trabajador.telefono);
        System.out.println("NOMBRE: " + trabajador.nombre);
        System.out.println("SALARIO: " + trabajador.salario + "$");
    }
}

class Persona {
    int edad;
    int telefono;
    String nombre;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}