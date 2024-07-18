import java.util.Scanner;
import java.util.Random;

public class Hechizos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Escribe la palabra: ");
        String p = sc.nextLine(); //Guarda la palabra introduccida por teclado
        
        // Invertir la palabra
        String pi = "";
        for (int i = p.length() - 1; i >= 0; i--) {
            pi += p.charAt(i);
        }
        
        // Reorganizar la palabra aleatoriamente
        char[] chars = p.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int randomIndex = rand.nextInt(chars.length);
            char temp = chars[i];
            chars[i] = chars[randomIndex];
            chars[randomIndex] = temp;
        }
        String randomWord = new String(chars);
        
        System.out.println("> Mostrar Echizo reorganizado aleatoriamente: \n" + randomWord);
        
        sc.close();
    }
}
