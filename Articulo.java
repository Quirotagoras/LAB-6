
public class Articulo {
	private String codigo, titulo;
	private int anio;
	private boolean disponible;
	
	public Articulo(){
		this.codigo="";
		this.titulo="";
		this.anio=0;
		this.disponible= true;
	}
	
	public Articulo(String c, String t, int a, boolean d){
		this.codigo=c;
		this.titulo=t;
		this.anio=a;
		this.disponible=d;
		
	}
	
	public String getCodigo(){
		return this.codigo;
	}
	
	public String getTitulo(){
		return this.titulo;
		
	}
	public int getAnio(){
		return this.anio;
		
	}
	public boolean getDisponible(){
		return this.disponible;
	}
	
	public void setDisponible(boolean d){
		this.disponible=d;
	}
	
	public String toString(){
		if(disponible ==true){
			return "codigo"+this.codigo+"/n titulo:"+this.titulo+ "/n Anio:"+this.anio+this.disponible;
		}else{
			return "codigo"+this.codigo+"/n titulo:"+this.titulo+ "/n Anio:"+this.anio+this.disponible;
		}
	}
	
	public boolean equals (Object obj){
		if(this==obj)
			return true;
		
	if(obj ==null)
		return false;
	
	if(this.getClass() != obj.getClass())
		return false;
	
	Articulo art= (Articulo) obj;
	return this.titulo.equals(art.titulo);
	}
	
	
}
