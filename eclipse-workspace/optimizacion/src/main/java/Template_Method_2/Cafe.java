package Template_Method_2;

public class Cafe extends BebidaConCafeina {
	@Override
	void preparar(){
		System.out.println("Moliendo café.");
	}
	@Override
	void agregarCondimentos(){
		System.out.println("Agregando azúcar");
	}
}
