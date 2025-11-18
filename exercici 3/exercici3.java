import java.util.Scanner;

public class exercici3 {

    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        exercici3 exercici = new exercici3();
        exercici.run();
    }

    public void run() {
        System.out.println("=== DESCOMPOSICIÓ D'EUROS ===");
        int euros = intInput("Introdueix la quantitat: ");
        descomposicio(euros);
    }

    public int intInput(String prompt){
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

    private void descomposicio(int euros){
        int[] denominacions = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] quantitats = new int[denominacions.length];

        for (int i = 0; i < denominacions.length; i++) {
            while (euros >= denominacions[i]) {
                euros = euros - denominacions[i];
                quantitats[i]++;
            }
        }

        System.out.println("Descomposició:");
        for (int i = 0; i < denominacions.length; i++) {
            if (denominacions[i] > 2) {
                System.out.printf("%3d bitllets de %d euros\n", quantitats[i], denominacions[i]);  
            } else {
                System.out.printf("%3d monedes de %d euros\n", quantitats[i], denominacions[i]);
            }
        }
    }
}
