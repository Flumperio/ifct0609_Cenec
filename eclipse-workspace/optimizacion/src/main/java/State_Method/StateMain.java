package State_Method;

public class StateMain {
    public static void main(String[] args) {
        // Creamos una nueva máquina expendedora
        MaquinaExpendedora maquinaExpendedora = new MaquinaExpendedora();

        // Insertamos una moneda y presionamos el botón para dispensar un artículo
        maquinaExpendedora.insertarMoneda();
        maquinaExpendedora.presionarBoton();

        // Insertamos otra moneda, pero decidimos devolverla antes de presionar el botón
        maquinaExpendedora.insertarMoneda();
        maquinaExpendedora.devolverMoneda();

        // Intentamos presionar el botón sin haber insertado una moneda
        maquinaExpendedora.presionarBoton();
    }
}
