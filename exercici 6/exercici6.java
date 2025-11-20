import java.util.Scanner;

public class exercici6 {
    
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        exercici6 exercici = new exercici6();
        exercici.run();
    }

    private void run() {
        int horesNormals, horesExtras;
        double salariNormal, salariExtra;

        System.out.println("=== CALCULADORA DE SALARI ===");
        System.out.print("Introdueix hores treballades: ");
        int horesTreballades = intInput();
        System.out.print("Introdueix preu per hora normal: ");
        int preuHora = intInput();

        if (horesTreballades <= 40) {
            horesNormals = horesTreballades;
            horesExtras = 0;
        } else {
            horesNormals = 40;
            horesExtras = horesTreballades - 40;
        }

        salariNormal = horesNormals * preuHora;
        salariExtra = horesExtras * preuHora * 2;
        System.out.println("--- DESGLOSSAMENT ---");
        System.out.printf("Hores normals: %2d -> %.1f euros\n", horesNormals, salariNormal);
        System.out.printf("Hores extras: %2d -> %.1f euros\n", horesExtras, salariExtra);
        System.out.printf("SALARI TOTAL: %.1f euros", salariNormal + salariExtra);
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
}
