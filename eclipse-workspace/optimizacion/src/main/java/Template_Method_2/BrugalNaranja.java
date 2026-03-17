package Template_Method_2;

public class BrugalNaranja extends BebidaDestilada {
	@Override
	void agregarDestilado(){
		System.out.println("4 deditos de Legendario");
	}
	@Override
	void agregarRefresco(){
		System.out.println("Fanta de Naranja");
	}
}
