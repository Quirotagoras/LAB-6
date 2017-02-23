
public class Libro extends Articulo{
	private String autor;
	private int noPaginas;
	
	public Libro(){
		super();
		this. autor="";
		this.noPaginas=0;
	}
	public Libro(String aut, int p, String c, String t, int a, boolean d){
		super(c,t,a,d);
		this.autor=aut;
		this.noPaginas=p;

	}
	
	public String getAutor(){
		return this.autor;
	}
	public void setautor(String a){
		this.autor=autor;
	}
	
	public int getNoPaginas(){
		return this.noPaginas;
	}
	
	public void setNoPaginas(){
		this.noPaginas=noPaginas;
	}
	
	public String toString(){
		return super.toString()+"/n Autor: "+this.autor + "Numero de paginas: "+ this.noPaginas;
	}
	
	public boolean equals (Object obj){
		if (this ==obj)
			return true;
		if(obj == null)
			return false;
		
		if(this.getClass() !=obj.getClass())
			return false;
		
		Libro lib=(Libro) obj;
		return ((this.getTitulo().equals(lib.getTitulo())))&&(this.autor.equals(lib.autor));
	}
}
