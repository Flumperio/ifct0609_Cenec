package Prototype_Method_2;

class OrdenadorSobremesa implements Ordenador{
    private String procesador, placaBase;
    private int ram, almacenamiento;
    private String tarjeta_Grafica;


    public OrdenadorSobremesa(String procesador, String placaBase, int ram, int almacenamiento, String tarjeta_Grafica) {
        this.procesador = procesador;
        this.placaBase = placaBase;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tarjeta_Grafica = tarjeta_Grafica;
    }
    public OrdenadorSobremesa(OrdenadorSobremesa clon_Ordenador){
        this.procesador = clon_Ordenador.procesador;
        this.placaBase = clon_Ordenador.placaBase;
        this.ram = clon_Ordenador.ram;
        this.almacenamiento = clon_Ordenador.almacenamiento;
        this.tarjeta_Grafica = clon_Ordenador.tarjeta_Grafica;
    }


    public String getTarjeta_Grafica() {
        return tarjeta_Grafica;
    }
    public void setTarjeta_Grafica(String tarjeta_Grafica) {
        this.tarjeta_Grafica = tarjeta_Grafica;
    }

    @Override
    public OrdenadorSobremesa clonar() {
        return new OrdenadorSobremesa(this);
    }
    @Override
    public void especificaciones() {
        System.out.println("Especificaciones del ordenador de sobremesa:");
        System.out.println("Procesador: " + procesador);
        System.out.println("Placa Base: " + placaBase);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Almacenamiento: " + almacenamiento + "GB");
        System.out.println("Tarjeta Grafica: " + tarjeta_Grafica);
    }
}
