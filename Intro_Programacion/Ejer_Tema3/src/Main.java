public class Main {
    public static void main(String[] args) {

        // Parte 1
        int total = sum(5, 6, 8);
        System.out.println(total);

        // Parte 2
        Coche miCoche = new Coche();
        miCoche.SumaPuerta();
        miCoche.SumaPuerta();
        miCoche.SumaPuerta();
        miCoche.SumaPuerta();
        System.out.println("Se ha añadido " + miCoche.puertas + " puertas");
    }
    public static int sum(int a, int b, int c){

        return (a + b + c);
    }
}

class Coche {
    public int puertas = 0;
    public void SumaPuerta() {
        this.puertas++;
    }
}