import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        String entrada = entry.nextLine();

        String teste="123";

        double vetor[]= new double[entrada.length()];
        char c;

        int topo=0;
        for (int i = 0; i < entrada.length(); i++)
        {
            c=entrada.charAt(i);
            if (c!=(char)'*' && c!=(char)'+' && c!=(char)'/'&& c!=(char)'-')
            {
                vetor[topo]= c-48;
            }
            else
            {
                switch (entrada.charAt(i)) {

                    case '*':
                        topo = topo - 2;
                        vetor[topo] = vetor[topo] * vetor[topo + 1];

                        break;
                    case '/':
                        topo = topo - 2;
                        vetor[topo] = vetor[topo] / vetor[topo + 1];
                        break;
                    case '-':
                        topo = topo - 2;
                        vetor[topo] = vetor[topo] - vetor[topo + 1];
                        break;
                    case '+':
                        topo = topo - 2;
                        vetor[topo] = vetor[topo] + vetor[topo + 1];
                        break;
                }

            }
            topo++;
        }
            System.out.println(vetor[0]);
        
    }
    
}
