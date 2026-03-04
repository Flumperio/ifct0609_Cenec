package Socket;

import java.net.URI;
import java.net.UnknownHostException;

public class Ejercicio_2 {
    public static void main(String[] args) throws UnknownHostException {
        String url = "https://www.elcorteingles.es/search-nwx/1/?s=portatiles";
        URI uri = URI.create(url);
        System.out.println(uri.getPath());
        System.out.println(uri.getHost());
        System.out.println(uri.getQuery());
    }
}
