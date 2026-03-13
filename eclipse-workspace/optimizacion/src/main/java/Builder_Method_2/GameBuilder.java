package Builder_Method_2;

class GameBuilder {
    //Atributos
    private String nombre, plataforma, sinopsis, min_Req;
    private double precio;
    private int anio;
    //Cnostructores de las propiedades
    public GameBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public GameBuilder plataforma (String plataforma) {
        this.plataforma = plataforma;
        return this;
    }
    public GameBuilder sinopsis (String sinopsis) {
        this.sinopsis = sinopsis;
        return this;
    }
    public GameBuilder min_Req (String min_Req) {
        this.min_Req = min_Req;
        return this;
    }
    public GameBuilder precio (double precio) {
        this.precio = precio;
        return this;
    }
    public GameBuilder anio (int anio) {
        this.anio = anio;
        return this;
    }
    //Builder
    public Game build(){
        return new Game(nombre, plataforma, sinopsis, min_Req, precio, anio);
    }
}
