package Abstract_Method_1;

public class Main {
    public static void main (String[] args){
        //Crear una fabrica de muebles modernos
        FabricaMueblesModernos mueblesModernos = new FabricaMueblesModernos();
        Silla sillaModerna =  mueblesModernos.crearSilla();
        Sofa sofaModerno = mueblesModernos.crearSofa();
        Mesa mesaModerno = mueblesModernos.crearMesa();
        //Usamos la clase
        sillaModerna.describir();
        sofaModerno.describir();
        mesaModerno.describir();

        //Creamos una fábrica de muebles victorianos
        FabricaMueblesVictorianos mueblesVictorianos = new FabricaMueblesVictorianos();
        //Fabricamos los muebles.
        Silla sillaVictoriana = mueblesVictorianos.crearSilla();
        Mesa mesaVictoriana = mueblesVictorianos.crearMesa();
        Sofa sofaVictoriano = mueblesVictorianos.crearSofa();
        //Usamos los objetos
        sillaVictoriana.describir();
        mesaVictoriana.describir();
        sofaVictoriano.describir();



    }
}
