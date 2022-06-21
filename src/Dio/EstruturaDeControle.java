package Dio;

public class EstruturaDeControle {
    public static void main(String[]args) {


        ifFlecha();
        int idade = 19;
       


        if(idade > 18){
            System.out.println("Maior de Idade");
        }
    
       
       
        
        
    }

    private static void ifFlecha() {
        int mes = 2;

       
        if(mes == 1){
            System.out.println("Janeiro");
        } else{ if(mes == 2 ){
            System.out.println("Fevereiro");
        }

        }
        
    }
    
}
