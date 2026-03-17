package Template_Method_1;

public class Patatas extends ComidaCocida {
	@Override
	public void tiempoHervir(){
		System.out.println("Hirviendo las patatas.");
	}
	@Override
	public void sacarComida(){
		System.out.println("Escurriendo las patatas.");
	}

}
