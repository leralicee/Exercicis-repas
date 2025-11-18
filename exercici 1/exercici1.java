import java.util.Scanner;

public class exercici1 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        exercici1 exercici = new exercici1();
        exercici.run();
    }

    public void run() {
        int opcio = showMenu();

        switch (opcio) {
            case 1:
                calcularQuadrat();
                break;
            case 2:
                calcularRectangle();
                break;
            case 3:
                calcularCercle();
                break;
            case 4:
                calcularTriangle();
                break;
        }
    }

    private int showMenu(){
        System.out.println("=== CALCULADORA DE FIGURES ===");
        System.out.println("1. Quadrat");
        System.out.println("2. Rectangle");
        System.out.println("3. Cercle");
        System.out.println("4. Triangle");
        return intInput(1,4);
    }

    private int intInput(int min, int max){
        while (true) {
            try {
                System.out.print("Opció: ");
                String inputLine = scanner.nextLine();
                int value = Integer.parseInt(inputLine);

                if (value < min || value > max) {
                    System.out.print("ERROR: Entra un número entre " + min + " i " + max + ".\n");
                    continue;
                }

                return value;
            } catch (NumberFormatException e) {
                System.out.print("ERROR: Entra un número vàlid.\n");
            }
        }
    }

    private int positiveIntInput(String prompt){
        while (true) {
            try {
                System.out.print(prompt);
                String inputLine = scanner.nextLine();
                int value = Integer.parseInt(inputLine);
                if (value <= 0) {
                    System.out.print("ERROR: Entra un número positiu.\n");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.print("ERROR: Entra un número vàlid.\n");
            }
        }
    }

    private void calcularQuadrat(){
        int costat = positiveIntInput("Introdueix el costat: ");
        System.out.println("Perímetre del quadrat: " + (4 * costat));
        System.out.println("Àrea del quadrat: " + (costat * costat));
    }

    private void calcularRectangle(){
        int base = positiveIntInput("Introdueix la base: ");
        int altura = positiveIntInput("Introdueix l'altura: ");
        System.out.println("Perímetre del rectangle: " + (2 * (base + altura)));
        System.out.println("Àrea del rectangle: " + (base * altura));
    }

    private void calcularCercle(){
        int radi = positiveIntInput("Introdueix el radi: ");
        System.out.printf("Perímetre: %.2f\n", (2 * Math.PI * radi));
        System.out.printf("Àrea: %.2f\n", (Math.PI * radi * radi));
    }

    private void calcularTriangle(){
        int base = positiveIntInput("Introdueix la base: ");
        int altura = positiveIntInput("Introdueix l'altura: ");
        int costat1 = positiveIntInput("Introdueix el costat 1: ");
        int costat2 = positiveIntInput("Introdueix el costat 2: ");
        System.out.println("Perímetre del triangle: " + (base + costat1 + costat2));
        System.out.println("Àrea del triangle: " + (0.5 * base * altura));
    }
}