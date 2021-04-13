package control;


import modelo.Coordenada;
import modelo.GestionDatos;
import utiles.RespuestaColocacion;

public class Controlador {
	private GestionDatos gestion;
	private boolean tresEnRaya=false;

	public Controlador() {
		super();
		gestion = new GestionDatos();
	}
	
	//void no es
	public RespuestaColocacion realizarJugada(String posicion){
		return this.gestion.realizarJugada(new Coordenada(posicion));
	}

	public String getTipoName() {
		return this.gestion.getTipoActualName();
	}

	public String getTipoAnteriorName() {
		return this.gestion.getTipoAnteriorName();
	}

//	public String getErrorName() {
//		return this.gestion.getErrorActualName();
//	}
  
    
    
    public boolean isTresenRaya(){
		if(gestion.comprobarHorizontal() || gestion.comprobarVertical() || gestion.comprobarDiagonal()) {
			tresEnRaya=true;
		}else {
			tresEnRaya=false;
		}
		return tresEnRaya;
		
    }
}
