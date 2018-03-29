import java.util.Collections;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        String entrada = entry.nextLine();
        String RNA;

       entrada= entrada.replaceAll("T","X");
        entrada=entrada.replaceAll("A","T");
        entrada=entrada.replaceAll("X","A");

        entrada= entrada.replaceAll("G","X");
        entrada=entrada.replaceAll("C","G");
        entrada=entrada.replaceAll("X","C");

        System.out.println("Fita Complementar: "+entrada);
        entrada=entrada.replaceAll("T","U");
        System.out.println("RNA: "+entrada);
    }
}
