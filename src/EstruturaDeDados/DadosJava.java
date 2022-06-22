package EstruturaDeDados;

// Aqui vamos fazer um Vetor = Estrutura de dados 

public class DadosJava {
    public static void main(String[] args) {

        //Declarando um vetor
        int[] vetor = new int[10];
        //INserindo dados no vetor
        vetor[0] = 3;
        vetor[1] = 5;
        vetor[2] = 10;
        vetor[3] = 15;
        vetor[4] = 21;
        vetor[5] = 33;
        vetor[6] = 41;
        vetor[7] = 12;
        vetor[8] = 88;
        vetor[9] = 332;
        System.out.println(vetor[9]);
        System.out.println(vetor[1]);

        //Usar um for para imprimir todo o vetor
      
        for(int i = 0; i <=9; i++){
           
            System.out.println(vetor[i]);

        }  System.out.println("Imprimindo o vetor novamente de outra maneira");


        // OUtra maneira, mais pegando todo comprimento do vetor, caso altere o tamanho, 
        //não precisa mexer aqui no for
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);

        }



        int x = 10;
        System.out.println("Valor de x: " + x);
        x = 4;
        System.out.println("Valor de x novamente: " + x);
    }
}
