package Controladores;
import java.util.Scanner;
public class Inicio {

	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de eses pago: ");
		int numMeses = sc.nextInt();
		
		int aux = 10; 
		System.out.println(aux);
       for( int i= 220; i<=numMeses ; i++) 
       {
    	   
	     aux= aux * 2;
	     System.out.println(aux);
       }
      System.out.println("-----");
      System.out.println(aux);
      
       //sc.next(); --> para string.
       //sc.next().charAt(0); --> para caracteres.
	}

}
