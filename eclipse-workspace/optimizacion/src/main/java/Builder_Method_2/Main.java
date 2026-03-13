package Builder_Method_2;

public class Main {
    public static void main (String[] args){
        Game game = new GameBuilder()
                .nombre("Pioner")
                .plataforma("Steam")
                .sinopsis("Mata Mata")
                .min_Req("Pentium")
                .precio(99.99)
                .anio(2026)
                .build();
        //Imprimir resultado
        game.imprimirDetalles();
    }
}
