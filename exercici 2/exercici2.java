import java.util.Scanner;

public class exercici2 {
    
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        exercici2 exercici = new exercici2();
        exercici.run();
    }

    public void run() {
        System.out.println("=== SISTEMA DE NOTES ===");
        double nota1 = doubleInput("Nota 1: ", 0, 10);
        double nota2 = doubleInput("Nota 2: ", 0, 10);
        double nota3 = doubleInput("Nota 3: ", 0, 10);
        double mitjana = mitjana(nota1, nota2, nota3);
        System.out.println(mitjana);
        qualificacio(mitjana);
    }

    public double doubleInput(String prompt, double min, double max){
        while (true) {
            try {
                System.out.print(prompt);
                String inputLine = scanner.nextLine();
                double value = Double.parseDouble(inputLine);

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

    private double mitjana(double nota1, double nota2, double nota3){
        double mitjana = (nota1 + nota2 + nota3) / 3;
        return mitjana;
    }

    private void qualificacio(double mitjana){
        if (mitjana < 5) {
            System.out.println("Insuficient");
        } else if (mitjana < 6) {
            System.out.println("Suficient");
        } else if (mitjana < 7) {
            System.out.println("Bé");
        } else if (mitjana < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Excel·lent");
        }
    }
}
