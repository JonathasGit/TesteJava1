package Dio;

public class EstruturaDeControle {
    public static void main(String[] args) {

        ifFlecha();
        ifSemFlecha();





        int idade = 19;

        if (idade > 18) {
            System.out.println("Maior de Idade");
        }

    }

    


    //If FLecha - Evitar, pois polui o código, esteticamente é ruim. 
    private static void ifFlecha() {
        int mes = 6;

       
        if(mes == 1){
            System.out.println("Janeiro");
        } else{ if(mes == 2 ){
            System.out.println("Fevereiro");
        } else{ if(mes == 3){
            System.out.println("Março");
        } else{ if(mes == 4){
            System.out.println("Abril");
        } else{ if(mes == 5){
            System.out.println("Maio");
        } else{ if(mes == 6){
            System.out.println("Junho");
        } else{ if(mes == 7){
            System.out.println("Julho");
        } else{ if(mes == 8){
            System.out.println("Agosto");
        } else{ if(mes == 9){
            System.out.println("Setembro");
        } else{ if(mes == 10){
            System.out.println("Outubro");
        } else{ if(mes ==11){
            System.out.println("Novembro");
        } else{ if(mes==12){
            System.out.println("Dezembro");

        }

        }
    }

        } 
    }

        }

        }

        }

        }

        }

        }

        } 
        
    }

    //If sem flecha
    private static void ifSemFlecha(){

        int mes1 = 1;
        if(mes1 ==1 ){
            System.out.println("Janeiro");
        } else if (mes1 ==2){
            System.out.println("Fevereiro");
        } else if (mes1 ==3){
            System.out.println("Março");
        } else if (mes1 == 4){
            System.out.println("Abril");
        } else if(mes1 == 5){
            System.out.println("Maio");
        } else if(mes1==6){
            System.out.println("Junho");
        } else if(mes1==7){
            System.out.println("Julho");
        } else if(mes1==8){
            System.out.println("Agosto");
        } else if(mes1==9){
            System.out.println("Setembro");
        } else if(mes1==10){
            System.out.println("Outubro");
        } else if(mes1==11){
            System.out.println("Novembro");
        } else if(mes1==12){
            System.out.println("Dezembro");
        }

    }


}
