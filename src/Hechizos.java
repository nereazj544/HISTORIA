import java.util.Scanner;

public class Hechizos {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la palabra: ");

        String p = sc.nextLine();
        String pi = "";
        for (int i =  p.length() -1; i >=0 ; i--) {
            pi += p.charAt(i);
        }

        System.out.println("> Mostrar Echizo: \n" + pi);
        sc.close();
    }
}
