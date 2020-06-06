package practicanueva;
import java.util.Scanner;
public class practicanueva {
	public static void main(String[] args) {
System.out.println("SOPA DE LETRAS");
System.out.println("****************************");
String menu = "";
String palabrasEncontradas="0";
String palabrasNoEncontradas ="0";
int menuParseado=0;
String menuSegundo = "";
String puntosfinal="";
int menuSegundoparseado=0;
String tercerMenu ="";
String nombresGuardados ="";
String nombresGuardadosGanados ="";
String palabrasGuardadas ="";
String todo="";
String puntosFinal="";
String arreglopalabras[]=new String[1];
String nombre ="";
int contador2=0;
int parseado =0;
int estadisticasParcear = 0;
do{
Scanner scanner = new Scanner(System.in);
System.out.println("1)nueva partida 2)estadisticas 3)salir del juego");
System.out.println("****************************");
System.out.println("ingrese el numero de la opcion que desea ingresar");
String palabrasNoGuardadas="";
menu = scanner.next(); 
menuParseado= Integer.parseInt(menu);
switch(menuParseado){
case 1:
	System.out.println("¿cual es tu nombre?");
	 nombre = scanner.next();
	System.out.println("Escoje el tamano del la matriz");
	int par =0;
	String tamañoMatriz="";
	while(par<10){ tamañoMatriz  = scanner.next();
par = Integer.parseInt(tamañoMatriz);
if(par<10){
	System.out.println("tiene que ser igual o mayor a 10 el arreglo");	 
		}else{
		}
				 
}
			
if(par<9){
	System.out.println("tiene que ser igual o mayor a 10 el arreglo");
}else{
	do{
		System.out.println("****************************");
		System.out.println("1)menu palabras 2)jugar 3)salir de la partida");
		System.out.println("****************************");
			System.out.println("ingrese el numero de la opcion que desea ingresar");
				menuSegundo  = scanner.next();
		menuSegundoparseado = Integer.parseInt(menuSegundo);
				switch(menuSegundoparseado){
				case 1:
					do{System.out.println("****************************");
					 System.out.println("1)insertar 2)insertar todas 3)modificar 4)eliminar 5)salir");
					 System.out.println("****************************");
						System.out.println("ingrese el numero de la opcion que desea ingresar");
						tercerMenu  = scanner.next();
						parseado = Integer.parseInt(tercerMenu);
						switch(parseado){
					 case 1:
						System.out.println("ingrese el numero de palabras");
						int numeropalabras  = scanner.nextInt();
						System.out.println("ingrese las palabras");
						int a = 0;
								 
						 while(a<numeropalabras){
										 
							 String palabras  = scanner.next();
								if(palabras.length()>=5&&palabras.length()<=10){
								if(palabras.length()<par){
											 
										palabrasNoGuardadas+=palabras+"$";
										palabrasGuardadas+=palabrasNoGuardadas;
																					 
									 ++contador2;
									 ++a;	 
									}else{
										System.out.println("la palabra tiene que ser menor a la matriz");
												
								 }
												 
								}else{
									System.out.println("la palabra tiene que tener entre 5 y 10 caracteres");
								}
										
							}
						 break;
						case 2 :
						 System.out.println("ingrese las palabras con un espacio de $ por cada palabra");
						 palabrasNoGuardadas += scanner.next();
							palabrasGuardadas += palabrasNoGuardadas;
							break;
						case 3:
							if(palabrasNoGuardadas==""){ 
							}else{
							 System.out.println("escriba la palabra que quiere modificar");
								String modificar = scanner.next()+"$"; 
								if(palabrasNoGuardadas.contains(modificar)==true){
								 System.out.println("escriba la palabra nueva");
								 String palabraNueva = scanner.next()+"$"; 
								palabrasNoGuardadas= palabrasNoGuardadas.replace(modificar, palabraNueva);
								palabrasGuardadas = palabrasNoGuardadas;
									System.out.println("se ha modificado");
									System.out.println(palabrasGuardadas);
								}else{
									System.out.println("no ha sido encontrada");
							 }
							}
							break;
					 case 4 : 
							if(palabrasGuardadas==""){	 
							}
						 else{
							 System.out.println("escriba la palabra que quiere eliminar");
								String eliminar = scanner.next()+"$";
								if(palabrasNoGuardadas.contains(eliminar)==true){
									palabrasNoGuardadas = palabrasNoGuardadas.replace(eliminar, "");
									palabrasGuardadas = palabrasNoGuardadas; 
									System.out.println(palabrasGuardadas);
								}else{
								System.out.println("la palabra no fue encontrada");
								}
							}
							break;
					 }
					}while(parseado != 5);
				 break;
				case 2 :
					if(palabrasNoGuardadas==""){
					 System.out.println("ho hay palabras agregadas");
					}else{
						int tamañoMatrizparseada = Integer.parseInt(tamañoMatriz);
						String matrizPrincipal[][]= new String [tamañoMatrizparseada][tamañoMatrizparseada];
						String abc[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
						for(int c =0; c<matrizPrincipal.length;++c){
							for(int d =0; d<matrizPrincipal.length;++d){
								 double random =  Math.random()*26; 
									int random2 = (int)random;
								matrizPrincipal[c][d]= abc[random2];
							}
						}
						String [] palabrasSeparadas = palabrasNoGuardadas.split("\\$");
						String concatenarNumero="";
						String concatenarNumero2="";
						int palabrasNoEncontradas1 =0;
						for(String elemento: palabrasSeparadas){
								double random3 =  Math.random()*tamañoMatrizparseada; 
								int random4 = (int)random3;
								double random10 =  Math.random()*4; 
								int random11 = (int)random10;
								double verdadero =  Math.random()*2; 
								int verdadero1 = (int)verdadero;
									concatenarNumero += String.valueOf(random11)+"$";
									concatenarNumero2+=String.valueOf(random4)+"$";
										  
							 if(verdadero1==1){
									for(int k =0;k<elemento.length();++k){	 
									 double random5 =  Math.random()*2; 
										int random6 = (int)random5;
										char letra = elemento.charAt(k);
										String letrastring = Character.toString(letra);
										matrizPrincipal[random4][random11+k]= letrastring;		 
							}
								}else{
									for(int U =0;U<elemento.length();++U){	 
									 double random5 =  Math.random()*2; 
										int random9 = (int)random5;
										char letra = elemento.charAt(U);
										String letrastrings = Character.toString(letra);
										matrizPrincipal[U+random11][random4]= letrastrings;		 
						 }
								}			 
						};
						for(int l =0; l<matrizPrincipal.length;++l){
							for(int m =0; m<matrizPrincipal.length;++m){
								System.out.print("|"+matrizPrincipal[m][l]+"|");
							}
							System.out.println();
						}
						System.out.println("coloque las palabras encontradas");
						int vida=3;
						int putaso2=0;
									int puntos =20;
									int cambiarVida = 0;
									int aciertos=0;
						int l =0;
									
									for(String hoja : palabrasSeparadas){
										cambiarVida+=1;
										
									}
												while(putaso2<=cambiarVida-1 && vida>0 ){
													
													String buscar = scanner.next();
													if( palabrasNoGuardadas.contains(buscar)==true){
														putaso2+=1;
														++aciertos;
														puntos+=buscar.length();
														System.out.print("tiene "+ puntos +" puntos ");
														System.out.println("has encontrado la palabra " + putaso2);
														if(putaso2==cambiarVida){
															System.out.println("has ganado la partida");
															nombresGuardadosGanados+=nombre+"$";
														};
														
													}else{
														--vida;
														puntos-=5;
														
														System.out.println("te quedan " + vida + " vidas y tienes " + puntos+ " puntos " );
														++l;
														if(vida==0){
															System.out.println("has perdido el juego");
															nombresGuardados+=nombre+"$";
														}
													}	
													
												}
												puntosFinal += nombre+" "+ " errores: "+ l + " aciertos: "+aciertos + " puntos: "+puntos+"$";
												puntosfinal += nombre +" "+ puntos + "$";		
							 }
							 
							 break;
						 } 
					}while(menuSegundoparseado!=3);
			}

			break;
		case 2:
			if(nombre == ""){
				System.out.println("no hay datos en estadisticas");
			}
			else{
				do{
					System.out.println("1)historial de partidas 2)puntuaciones mas altas 3)jugadores que no encontraron las palabras 4)jugadores que encontraron las palabras 5)creditos 6)salir");
					System.out.println("ingrese el numero de la opcion");
					 String estadisticas = scanner.next(); 
					 estadisticasParcear = Integer.parseInt(estadisticas);
					 switch (estadisticasParcear){
					 case 1:
						 String [] palabrastodas = puntosFinal.split("\\$");
						 for(String elementostodo: palabrastodas){
							 System.out.println(elementostodo);	 
						 }
						 break;
					 case 2:
						 int neu =0;
						 String [] palabrasse = puntosfinal.split("\\$");
						 for(String elementosno: palabrasse){
							 ++neu;
							 if(neu<=3){
								 System.out.println(elementosno);		 
							 }
							  
						 }
						 break;
					 case 3:
						 String [] palabrasno = nombresGuardados.split("\\$");
						 for(String elementosno: palabrasno){
							 System.out.println(elementosno);	 
						 }
						 break;
					 case 4:
						 String [] palabrassi = nombresGuardadosGanados.split("\\$");
						 for(String elementossi: palabrassi){
							 System.out.println(elementossi);	 
						 }
						 break;
					 case 5:
						System.out.println("KEVIN ALEXIS LOPEZ CONTRERAS 201900157 SECCION D");
						 break;
					 }
					 
				}while(estadisticasParcear != 6);	
			}
			break;
			
		};	
		}while(menuParseado!=3);	
	}
	//FUNCIONES
		}

