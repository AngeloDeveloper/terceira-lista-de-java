import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int indice=1;

        for (int i = 0; i < indice; i++) {
            for (int j = 0; j < indice; j++) {
                if (i==0 || j==0 || i== indice-1 || j== indice-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
