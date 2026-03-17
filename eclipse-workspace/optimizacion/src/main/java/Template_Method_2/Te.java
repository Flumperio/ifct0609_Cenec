package Template_Method_2;

public class Te extends BebidaConCafeina {
	@Override
	void preparar(){
		System.out.println("Remojando el té.");
	}
	void agregarCondimentos(){
		System.out.println("Agregando limón y leche.");
	}
}
