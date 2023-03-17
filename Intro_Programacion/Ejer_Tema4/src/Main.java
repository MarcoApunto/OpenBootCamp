public class Main {
    public static void main(String[] args) {
        int numerolf = 0;
        int numeroWhile = 0;
        var estacion = "OTOÑO";

        System.out.println("IF:");

        if (numerolf > 0) {
            System.out.println("Es positivo");
        } else if (numerolf == 0){
            System.out.println("Es cero");
        } else {
            System.out.println("Es negativo");
        }

        System.out.println("WHILE:");

        // ORDEN CITADO DEL EJERCICIO
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        System.out.println("DO WHILE:");

        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 0);

        System.out.println("FOR:");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("SWITCH:");

        switch (estacion) {
            case "PRIMAVERA":
                System.out.println("PRIMAVERA");
                break;
            case "VERANO":
                System.out.println("VERANO");
                break;
            case "OTOÑO":
                System.out.println("OTOÑO");
                break;
            case "INVIERNO":
                System.out.println("INVIERNO");
                break;
            default:
                System.out.println("NO ES UNA ESTACIÓN");
        }
    }
}