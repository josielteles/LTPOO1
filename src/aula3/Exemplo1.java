
package aula3;
import java.util.Scanner;

public class Exemplo1 {
    
  
    

 public static void main(String[] args) {
     
     
 
    int opcao;
     Scanner valor = new Scanner(System.in);
        System.out.println("Se preferir praia, digite 1. "
        + "Se preferir montanha, digite 2");
        
    opcao = valor.nextInt();
    
        if(opcao==1)
            System.out.println("Você prefere praia");
        else 
    
            System.out.println("Você prefere montanha");
    
}

}
