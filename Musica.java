
public class Musica extends Articulo {

	private String interprete, formato;
	
	public Musica(){
		super();
		this.interprete="";
		this.formato="";
	}
	
	public Musica(String c, String t, int a, boolean d,String i, String f){
		super(c,t,a,d);
		this.interprete=i;
		this.formato=f;
		
	}
	
	public void setInterprete(){
		this.interprete=interprete;
	}
	
	
	public String getInterprete(){
		return this.interprete;
	}
	
	public void setFormato(){
		this.formato=formato;
	}
	
	public String getFormato(){
		return this.formato;
		
	}
	
	public String toString(){
		return super.toString()+"/n Interprete: "+this.interprete+"/n Formato: "+ this.formato;
	}
	
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj ==null)
			return false;
		if(this.getClass()!= obj.getClass())
			return false;
		
		Musica mus=(Musica)obj;
		return ((this.getTitulo().equals(mus.getTitulo()))&&(this.interprete.equals(mus.interprete)));
	}
}
