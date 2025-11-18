import java.util.Scanner;

public class exercici4 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exercici4 exercici = new exercici4();
        exercici.run();
    }

    public void run() {
        System.out.println("=== JOC D'ENDIVINANÇA ===");
        int numeroSecret = (int) (Math.random() * 50) + 1;
        int intents = 0;
        boolean endevinat = false;

        for(int i=0; i<5; i++){
            System.out.print("Intent " + (i+1) + "/5: Introdueix un número entre 1 i 50: ");
            int numero = intInput();
            intents++;
            if (numero == numeroSecret){
                System.out.println("Enhorabona! Has endevinat el número secret " + numeroSecret + " en " + intents + " intents.");
                endevinat = true;
                break;
            } else if (numero < numeroSecret){
                System.out.println("El número secret és MÉS GRAN.");
            } else {
                System.out.println("El número secret és MÉS PETIT.");
            }
        }

        if (!endevinat){
            System.out.println("Has esgotat els intents. El número secret era " + numeroSecret + ".");
        }
    }
    
    public int intInput(){
        while (true) {
            try {
                String inputLine = scanner.nextLine();
                int value = Integer.parseInt(inputLine);

                if (value < 1 || value > 50) {
                    System.out.print("ERROR: Entra un número entre 1 i 50: ");
                    continue;
                }

                return value;
            } catch (NumberFormatException e) {
                System.out.print("ERROR: Entra un número vàlid: ");
            }
        }
    }
}
