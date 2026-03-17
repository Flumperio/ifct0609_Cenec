package Template_Method_2;

public class TemplateMain {
	    public static void main(String[] args) {
        BebidaConCafeina te = new Te();
        te.prepararReceta(); // Prepara el té siguiendo los pasos de la receta

        BebidaConCafeina cafe = new Cafe();
        cafe.prepararReceta(); // Prepara el café siguiendo los pasos de la receta

		BebidaDestilada ron = new BrugalNaranja();
		ron.prepararBebida("Panchitos.");
		ron.prepararBebida("Palomitas.");
    }
}
