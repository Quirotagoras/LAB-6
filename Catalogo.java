
public class Catalogo {
	private int indice;
	private Articulo articulos[];//arreglo de tipo Articulo

	public Catalogo(){
		indice=0;
		articulos = new Articulo[50];// creas el arreglo con 51 espacios
		for(int i=0; i<50;i++)
			articulos[i]=null;// pones todos los espacios del arreglo en null

	}
	public Catalogo(int ind, Articulo arts[]){
		articulos = new Articulo[50];
		this.indice=ind;
		this.articulos=arts;

	}

	public int getIndice(){
		return this.indice;

	}

	public Articulo [] getArticulos(){// regresa un arreglo de tipo Articulos
		return this.articulos;
	}

	public void setArticulos(Articulo [] articulos){
		this.articulos=articulos;
	}

	public void agregarArticulo(Articulo art){
		if(indice<=49){
			articulos[indice]=art;
			indice++;
		}else{
			System.out.println("El catalogo ya esta lleno");
		}
	}

	public void borrarArticulo(String codigo){
		int i,j;
		boolean enc= false;
		i=0;
		j=0;
		// while((! enc) && (i<50)){
		for(i=0; i<50;i++){
			enc= articulos[i].getCodigo().equals(codigo);// compara que los 2 codigos sean iguales.
			if( enc){
				j=i;
				i++;
			}else{
				System.out.println("No se encontro el articulo");
			} 
		}
	}

	public void buscaLibros(String autor){
		for(int i=0;i<indice;i++){
			if(articulos[i] instanceof Libro){
				Libro aux=(Libro) articulos[i];
				if(aux.getAutor().equals(autor)){
					System.out.println(articulos[i].getTitulo());
				}

			}
		}
	}

	public void muestraCatalogo(){
		int cantidad=0;
		for(int i =0; i<50; i++){
			if(articulos[i] instanceof Libro){
				Libro auxL= (Libro)articulos[i];
				System.out.println((i+1)+""+ auxL.toString());
				cantidad++;
			}
			if(articulos[i] instanceof Musica){
				Musica auxM=(Musica)articulos[i];
				System.out.println((i+1)+""+auxM.toString());
				cantidad++;
			}
		}
		if(cantidad==0){
			System.out.println("No hay articulos en el catalogo");
		}

	}

	public void muestraLibros(){
		for(int i=0;i<50;i++){
			if(articulos[i] instanceof Libro){
				Libro auxL=(Libro) articulos[i];
				System.out.println(auxL.toString());
			}
		}
	}
	public void muestraMusica(){
		for(int i=0;i<50;i++){
			if(articulos[i] instanceof Musica){
				Musica auxM=(Musica)articulos[i];
				System.out.println(auxM.toString());
			}
		}
	}

	public void buscaAutor(String aut){
		int c=0;
		for(int i=0;i<50;i++){
			if(articulos[i] instanceof Libro){
				Libro auxL=(Libro)articulos[i];
				if(auxL.getAutor().equalsIgnoreCase(aut)){
					System.out.println(auxL.toString());
					c++;
				}
			}
		}if(c==0){
			System.out.println("No hay libros de este autor");
		}
	}

	public String buscaMusica(String titulo){
		String codEnc="";
		boolean enc= false;
		for (int i=0; i<50;i++){
			if(articulos[i] instanceof Musica){
				Musica auxM=(Musica) articulos[i];
				if(auxM.getTitulo().equalsIgnoreCase(titulo)){
					enc=true;
					codEnc=auxM.getCodigo();
				}

			}
			i++;
		}
		if(! enc){
			System.out.println("No se encontro el titulo"+titulo);

		}
		return codEnc;

	}
	
}

