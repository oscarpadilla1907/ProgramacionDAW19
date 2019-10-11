import java.util.Scanner;


public class Area{
	public static void main(String[] args) {

			

			int area = 1; // 2 π rh + 2 π r 2
			int volu = 2;
			int saludo = 3;
		

			Scanner numero = new Scanner(System.in);

				System.out.println("Quieres calcular area o volumen");
				System.out.println(" '1' = Area ");
				System.out.println(" '2' = Volumen ");
				System.out.println(" '3' = Salir");
				
					area = numero.nextInt();
				
					if (area == 1){
						
						int altura = 0;
						int radio = 0;
						double pi = 3.1415926535897932384626433832;

							System.out.println("Introduce el radio en centimetros");
								radio = numero.nextInt();
							System.out.println("Introduce la altura en centimetros"); 
								altura = numero.nextInt();

									if ( (2 * pi * radio * altura) + ((2 * pi * radio)*(2 * pi * radio)) != 0);
										System.out.println("El area es "+pi*(radio*radio)*altura);
					
						
						
					    					 }else if (area != 1 && area != 3 && area != 4){
											

											int altura = 0;
											int radio = 0;
											double pi = 3.1415926535897932384626433832;

												System.out.println("Introduce el radio en centimetros");
													radio = numero.nextInt();
												System.out.println("Introduce la altura en centimetros"); 
													altura = numero.nextInt();

														if (pi*(radio*radio)*altura != 0);
															System.out.println("El volumen es "+pi*(radio*radio)*altura);
					
																}else if (saludo == 3 ){
																	System.out.println("exit");
																	System.out.println(".");
																	System.out.println(".");
																	System.out.println(".");
																	System.out.println(".");
																	System.out.println(".");
																	System.out.println(".");

				

					
                }

			}		
		
	}
