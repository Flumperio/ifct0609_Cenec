package State_Method;

public class EstadoDispensando implements Estado{
	    private MaquinaExpendedora maquinaExpendedora;

    public EstadoDispensando(MaquinaExpendedora maquinaExpendedora) {
        this.maquinaExpendedora = maquinaExpendedora;
    }

    @Override
    public void insertarMoneda() {
        System.out.println("Espere a que termine la dispensación.");
    }

    @Override
    public void devolverMoneda() {
        System.out.println("No se puede devolver la moneda mientras se está dispensando.");
    }

    @Override
    public void presionarBoton() {
        System.out.println("Ya se está dispensando.");
    }

    @Override
    public void dispensar() {
        System.out.println("Artículo dispensado.");
        // Cambiamos el estado de la máquina a "Sin Moneda" después de dispensar el artículo
        maquinaExpendedora.setEstado(maquinaExpendedora.getEstadoSinMoneda());
    }


}
