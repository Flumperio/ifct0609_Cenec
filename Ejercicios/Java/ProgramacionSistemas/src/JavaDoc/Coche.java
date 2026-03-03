package JavaDoc;

/**
 * Esta clase representa un objeto Coche.
 *
 * @author Alberto Ruiz
 * @version 1.0
 * @since 2022-03-01
 */
public class Coche {

    /**
     * La marca del coche.
     */
    private String marca;

    /**
     * El modelo del coche.
     */
    private String modelo;

    /**
     * El año de fabricación del coche.
     */
    private int anioFabricacion;

    /**
     * El constructor de la clase Coche.
     *
     * @param marca La marca del coche.
     * @param modelo El modelo del coche.
     * @param anioFabricacion El año de fabricación del coche.
     */
    public Coche(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    /**
     * Gets la marca del coche.
     *
     * @return la marca del coche
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Gets el modelo del coche.
     *
     * @return el modelo del coche
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Gets el año de fabricación del coche.
     *
     * @return el año de fabricación del coche
     */
    public int getAnioFabricacion() {
        return anioFabricacion;
    }
}
