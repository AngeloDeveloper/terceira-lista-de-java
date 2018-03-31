import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        Map<String,Tmesa> Mesas =new HashMap<String, Tmesa>();

        //---------------------------------------------------------------\\
        //----VARIAVEIS TEMPORARIAS DEVIDO A LIMITAÇÃO DE JAVA NO SCAN----\\
        String tempcode;
        String tempprod;
        double value;
        //-----------------------------------------------------------------\\

        Short op=0;


        do{
            System.out.println("Bem vindo ao restaurante escolha uma opção");
            System.out.println("1 Cadastrar Item em uma Mesa:");
            System.out.println("2 Imprimir Resumo da Mesa:");
            System.out.println("3 Dar Baixa em Mesa:");
            System.out.println("4 ver todas as mesas cadastradas");
            System.out.println("0 Fechar Sistema:");
            op=entrada.nextShort();
            //limpa o buffer
            entrada.nextLine();
            switch (op)
            {
                case 1:

                    System.out.println("Digite o codigo da mesa");
                    System.out.println("Lembre-se caso ela não exista uma nova mesa será criada");
                    tempcode=entrada.nextLine();
                    System.out.println("Digite o nome do produto da mesa");
                    tempprod=entrada.nextLine();
                    System.out.println("Digite o valor do produto");
                    value=entrada.nextDouble();
                    entrada.nextLine();


                    //verifica o tamanho do hashmap caso ele seja maior q zero
                    if(Mesas.size()!=0)
                    {
                        //verifica se a mesa existe, se a mesa existir cadastra o produto na mesa
                        if(Mesas.containsKey(tempcode))
                        {
                            Mesas.get(tempcode).add(tempprod,value);
                        }
                        else
                        {
                            //caso a mesa não exista cria uma nova mesa
                            Mesas.put(tempcode,new Tmesa(tempprod,value));
                        }
                    }
                    else
                    {
                        //caso esteja vazio cria uma mesa direto

                        Mesas.put(tempcode,new Tmesa(tempprod,value));

                    }


                    break;
                case 2:

                        System.out.println("Digite o código da mesa pra ver o resumo");
                        tempcode= entrada.nextLine();
                        //se a mesa realmete existe
                        if(Mesas.containsKey(tempcode))
                        {
                            Mesas.get(tempcode).printa();
                        }
                        else
                        {
                            System.out.println("desculpe, essa mesa não existe");
                        }

                    break;
                case 3:
                    System.out.println("Digite o código da mesa para dar baixa");
                    tempcode= entrada.nextLine();
                    //se a mesa realmete existe
                    if(Mesas.containsKey(tempcode))
                    {
                        Mesas.get(tempcode).getPreco();
                    }
                    else
                    {
                        System.out.println("desculpe, essa mesa não existe");
                    }

                    break;
                case 4:
                    System.out.println(Mesas.keySet());
                    break;

            }

        }while(op!=0);
    }
}

class Tmesa{

    public Map<String,Double > produtos= new HashMap<String,Double>();

    public Tmesa(String tempS,Double valor)
    {
        produtos.put(tempS,valor);
    }

    public void add(String aproduto,double valor)
    {
        produtos.put(aproduto,valor);
    }

    public void printa()
    {
        System.out.println("Esta mesa possui: ");
        System.out.println(produtos.keySet());

    }

    public void getPreco()
    {
        double value=0;
        for (String key : produtos.keySet())
        {
            value += produtos.get(key);
        }

        int valor= (int)value;
        int moedas = (int)(100*(value-valor));

        System.out.println((valor/100)+" nota(s) de R$ 100,00");
        valor=valor%100;
        System.out.println((valor/50)+" nota(s) de R$ 50,00");
        valor=valor%50;
        System.out.println((valor/20)+" nota(s) de R$ 20,00");
        valor=valor%20;
        System.out.println((valor/10)+" nota(s) de R$ 10,00");
        valor=valor%10;
        System.out.println((valor/5)+" nota(s) de R$ 5,00");
        valor=valor%5;
        System.out.println((valor/2)+" nota(s) de R$ 2,00");
        valor=valor%2;
        System.out.println((valor)+" moeda(s) de R$ 1,00");

        System.out.println((moedas/50)+" moeda(s) de 50 centavos");
        moedas=moedas%50;
        System.out.println((moedas/25)+" moeda(s) de 25 centavos");
        moedas=moedas%25;
        System.out.println((moedas/10)+" moeda(s) de 10 centavos");
        moedas=moedas%10;
        System.out.println((moedas/5)+" moeda(s) de 5 centavos");
        moedas=moedas%5;
        System.out.println((moedas)+" moeda(s) de 1 centavos");
    }
}
