package State_Method;

public class MaquinaExpendedora {
	//Atributos, creamos los estados de la máquina
	private Estado estadoSinMoneda;
	private Estado estadoConMoneda;
	private Estado estadoDispensando;
	//Creamos atributo estado del estado actual
	private Estado estadoActual;
	//Constructor de las maquina expendedora
	public MaquinaExpendedora() {
		this.estadoSinMoneda = new EstadoSinMoneda(this);
		this.estadoConMoneda = new EstadoConMoneda(this);
		this.estadoDispensando = new EstadoDispensando(this);
		estadoActual = estadoSinMoneda; //Incializamos con SinEstado
	}
	 // Método para insertar una moneda
    public void insertarMoneda() {
        estadoActual.insertarMoneda();
    }
    // Método para devolver una moneda
    public void devolverMoneda() {
        estadoActual.devolverMoneda();
    }
    // Método para presionar el botón
    public void presionarBoton() {
        estadoActual.presionarBoton();
        estadoActual.dispensar();
    }
	//Metodo para cambiar el estado actual de la máquina
	void setEstado(Estado estado){
		this.estadoActual = estado;
	}
	//Metodo para leer los estados.
	public Estado getEstadoSinMoneda(){
		return estadoSinMoneda;
	}
	public Estado getEstadoConMoneda(){
		return estadoConMoneda;
	}
	public Estado getEstadoDispensando(){
		return estadoDispensando;
	}

}
