package Dio;


public class exemploLogicos {
    public static void main(String[] args){
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        //Conjunção &&
        System.out.println("b1 && b2" + " " + (b1 && b2)); // falso, porque b2 é falso
        System.out.println("b1 && b3" + " " + (b1 && b3)); // Vai ser true

        //Disjunção ||
        System.out.println("b2 && b3" + " " + (b2 || b3));
        System.out.println("b2 && b4" + " " + (b2 || b4)); //os dois são falsos, ai vai dar falso

        //Disjunção exclusiva ^
        System.out.println("b1 ^ b3" + " " + (b1 ^ b3));
        System.out.println("b4 ^ b1" + " " + (b4 ^ b1)); // são diferentes vai dar verdadeiro

        //negação !
        System.out.println("!b1" + " " + !b1);
        System.out.println("!b2" + " " + !b2);



    }
    
    
}
