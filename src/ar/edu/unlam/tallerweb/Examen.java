package ar.edu.unlam.tallerweb;

public class Examen {
	public Integer nota;
	public Integer calificar(Integer nota) throws Exception{
		if(nota >= 0 && nota <= 10){
			return nota;
		}
		else{
			throw new Exception("La nota debería ser de 0 a 10");
		}

			
	}

}
