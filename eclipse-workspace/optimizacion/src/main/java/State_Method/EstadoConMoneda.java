package State_Method;

public class EstadoConMoneda implements Estado{
	//Aributos, asocioacion del estado con la maquina expendedora.
	private MaquinaExpendedora maquinaExpendedora;

	public EstadoConMoneda(MaquinaExpendedora maquinaExpendedora){
		this.maquinaExpendedora = maquinaExpendedora;
	}
	@Override
	public void insertarMoneda(){
		System.out.println("Ya hay una moneda insertada.");
	}
	@Override
	public void devolverMoneda(){
		System.out.println("Moneda devuelta.");
		//Cambiamos el estado a maquina sin moneda
		maquinaExpendedora.setEstado(maquinaExpendedora.getEstadoSinMoneda());
	}
	@Override
	public void presionarBoton(){
		System.out.println("Botón presionado.");
		//Cambiamos el estado a maquina dispensando
		maquinaExpendedora.setEstado(maquinaExpendedora.getEstadoDispensando());
	}
	@Override
	public void dispensar(){
		System.out.println("No se ha dispensado ningún artículo.");
	}
}
