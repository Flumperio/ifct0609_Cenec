package State_Method;

public class EstadoSinMoneda implements Estado {
	//Atributo, asociamos una maquina expendedora
	private MaquinaExpendedora maquinaExpendedora;
	//Constructor
	public EstadoSinMoneda(MaquinaExpendedora maquinaExpendedora) {
		this.maquinaExpendedora = maquinaExpendedora;
	}
	//Override de los metodos del interfaz Estado
	@Override
	public void insertarMoneda(){
		System.out.println("Moneda Insertada.");
		//Cambiamos el estado de la maquina a "Con Moneda"
		maquinaExpendedora.setEstado(maquinaExpendedora.getEstadoConMoneda());
	}
	@Override
	public void devolverMoneda(){
		System.out.println("No hay moneda para devolver");
	}
	    @Override
    public void presionarBoton() {
        System.out.println("Inserte una moneda primero.");
    }
    @Override
    public void dispensar() {
        System.out.println("Inserte una moneda primero.");
    }


}
