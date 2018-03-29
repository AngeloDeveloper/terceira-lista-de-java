
import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {

        Scanner entrada= new Scanner(System.in);


        int n= entrada.nextInt();


        boolean vdd = true;


        for (int i = 2; i < n; i++)
        {



            if (vdd) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            } else {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }

            if (i % 10 == 0)
            {
                vdd = !vdd;
            }

        }

    }
}
