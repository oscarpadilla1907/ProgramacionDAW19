import java.util.Scanner;

public class Conversiones{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un caracter: ");
		String texto = sc.nextLine();

		char caracter = texto.charAt(0);
		if(caracter >= 48 && caracter <= 57){
			int n = Integer.parseInt(texto);
			System.out.println(3+n);
		}else{
			System.out.println("No es un numero");
		}

		System.out.print("Introduce un numero: ");
		int n = sc.nextInt();
		System.out.println(n);
	}
}





//		char a;
//		for (int i=0;i<6 ;i++ ) {
//			a = "Supercaligrafi...".charAt(i);
//			System.out.println(a);
//		}