package Builder_Method_2;

class Game {
    //Atributos
    private String nombre, plataforma, sinopsis, min_Req;
    private double precio;
    private int anio;
    //Constructor
    public Game(String nombre, String plataforma, String sinopsis, String min_Req, double precio, int anio) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.sinopsis = sinopsis;
        this.min_Req = min_Req;
        this.precio = precio;
        this.anio = anio;
    }
    //Setters y Getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPlataforma() {
        return plataforma;
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    public String getMin_Req() {
        return min_Req;
    }
    public void setMin_Req(String min_Req) {
        this.min_Req = min_Req;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void  imprimirDetalles() {
        System.out.println( "Producto{" +
                "\nnombre='" + nombre + '\'' +
                ",\nplataforma='" + plataforma + '\'' +
                ",\nsinopsis='" + sinopsis + '\'' +
                ",\nmin_Req='" + min_Req + '\'' +
                ",\nprecio=" + precio +
                ",\nanio=" + anio +
                '}');
    }
}



