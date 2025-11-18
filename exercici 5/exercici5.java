import java.util.Scanner;

public class exercici5 {
    
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exercici5 exercici = new exercici5();
        exercici.run();
    }

    public void run() {
        int mesGran = 0;
        int mesPetit = 0;
        int quantitatParells = 0;
        int sumaTotal = 0;
        int comptador = 0;

        System.out.println("=== ANÀLISI DE SEQÜÈNCIA ===");
        System.out.println("Introdueix números (0 per acabar):");
        
        while (true) {
            System.out.print("Número: ");
            int numero = intInput();
            if (numero == 0) {
                break;
            }
            if (comptador == 0) {
                mesGran = numero;
                mesPetit = numero;
            } else {
                if (numero > mesGran) {
                    mesGran = numero;
                }
                if (numero < mesPetit) {
                    mesPetit = numero;
                }
            }
            if (numero % 2 == 0) {
                quantitatParells++;
            }
            sumaTotal += numero;
            comptador++;
        }

        imprimirResultats(mesGran, mesPetit, quantitatParells, sumaTotal, comptador);
    }

    public int intInput(){
        while (true) {
            try {
                String inputLine = scanner.nextLine();
                int value = Integer.parseInt(inputLine);

                if (value < 0) {
                    System.out.print("ERROR: Entra un número positiu: ");
                    continue;
                }

                return value;
            } catch (NumberFormatException e) {
                System.out.print("ERROR: Entra un número vàlid: ");
            }
        }
    }

    private void imprimirResultats(int mesGran, int mesPetit, int quantitatParells, int sumaTotal, int comptador) {
        System.out.println("--- RESULTATS ---");
        System.out.println("Número més gran: " + mesGran);
        System.out.println("Número més petit: " + mesPetit);
        System.out.println("Mitjana: " + (comptador > 0 ? (double)sumaTotal / comptador : 0));
        System.out.println("Parells: " + quantitatParells);
        System.out.println("Senars: " + (comptador - quantitatParells));
    }
}
