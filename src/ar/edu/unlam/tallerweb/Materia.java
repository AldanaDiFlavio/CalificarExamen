package ar.edu.unlam.tallerweb;

public class Materia {
	private Examen calificacion1;
	private Examen calificacion2;
	public Materia(){
		this.calificacion1=new Examen();
		this.calificacion2=new Examen();
	}
	
	public void evaluar(Integer examen, Integer nota) throws Exception  {
		
		calificacion1.calificar(nota);
		calificacion2.calificar(nota);
	}

	public Integer recuperar(Integer examen, Integer nota) throws Exception{
		if(nota!=null){
			return nota;
		}
		else{
			throw new Exception("No puede recuperar sin nota de examen");
		}
	}
	
}
