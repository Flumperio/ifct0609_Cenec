package Template_Method_1;

public class TemplateMain {
	    public static void main(String[] args) {
        ComidaAsada cochinillo = new Cochinillo();
        cochinillo.prepararReceta(220, 3);

        ComidaFrita flamenquin = new Flamenquin();
        flamenquin.prepararReceta();

        ComidaCocida patatas = new Patatas();
        patatas.prepararReceta();
    }
}
