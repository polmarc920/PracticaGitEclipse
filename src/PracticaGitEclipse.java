import java.util.Scanner;
public class PracticaGitEclipse {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int clave=0;
		
		System.out.println("Cuál es la clave¿?: ");
		clave=teclado.nextInt();
		
		if(clave==123456) {
			
			System.out.println("Correcto!!!");
		}	
		
		else {
			System.out.println("Incorrecto!");
		}
		
		teclado.close();
	}
}
