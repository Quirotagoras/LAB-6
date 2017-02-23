import java.util.Scanner;
public class Main {

	public static void menu(){
		System.out.println(" \n\t Menu");
		System.out.println("1.Agregar Ejemplar");
		System.out.println("2.Borrar un ejemplar");
		System.out.println("3.Lista de libros de un autor");
		System.out.println("4.Busca cancion ");
		System.out.println("5.Lista de Libros");
		System.out.println("6.Lista de Musica");
		System.out.println("7.Muestra Catalogo");
		System.out.println("8.Salir");
		System.out.println("Indica tu opcion==> ");
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Catalogo miCatalogo = new Catalogo();
	

		int opc1,opc2;
		String cod,tit,aut,inter,form;		
		int y,noPag=0;
		boolean dis=true;
		
		do {
			menu();
			opc1=teclado.nextInt();
			teclado.nextLine();
			switch (opc1){
				case 1:System.out.println("1.Libro");
				       System.out.println("2.Musica");
				       opc2=teclado.nextInt();
				       teclado.nextLine();
				       System.out.println("Dame el codigo");
					   cod = teclado.nextLine();
					   System.out.println("Dame el t�tulo");
					   tit = teclado.nextLine();
					   System.out.println("Dame el a�o");
						y=teclado.nextInt();
						teclado.nextLine();
						if (opc2==1){
							System.out.println("Dame el autor");
							aut = teclado.nextLine();
							System.out.println("Indica el total de Paginas ");
							noPag = teclado.nextInt();
							teclado.nextLine();
							Articulo miLibro;
							miLibro = new Libro(aut,100, cod,tit,y,dis);
							miCatalogo.agregarArticulo(miLibro);
							System.out.println("Libro agregado: " +miLibro.toString());
						}
						if (opc2 == 2){
							System.out.println("Dame el interprete");
							inter= teclado.nextLine();
							System.out.println("Dame el formato");
							form= teclado.nextLine();
							Articulo miMusica;
							miMusica = new Musica(cod,tit,y,dis,inter,form);
							miCatalogo.agregarArticulo(miMusica);
						}	  
			    break; 	
				case 2:System.out.println(" Dame el codigo del articulo");
					    cod = teclado.nextLine();
					    miCatalogo.borrarArticulo(cod);
					    System.out.println("Ahora tienes "+miCatalogo.getIndice()+" articulos");
				break;
				case 3:System.out.println("Dame el autor");
				        aut = teclado.nextLine();
				        miCatalogo.buscaAutor(aut);
			    break;		
				case 4: System.out.println("Cu�l es el titulo de la m�sica");
				        tit = teclado.nextLine();
				        cod = miCatalogo.buscaMusica(tit);
				        System.out.println(" Su codigo es "+ cod);
				break;
				case 5: miCatalogo.muestraLibros();
			    break;	
				case 6:miCatalogo.muestraMusica();
				break;
				case 7:miCatalogo.muestraCatalogo();
				break;
				case 8: System.out.println("Gracias por visitarnos");
				break;
				default: System.out.println("Invalido");
			}
		} while (opc1 != 8);	
		teclado.close();
	}
}
