package pooAbstracta;

public class VehiculosMain {
    public static void main(String[] args) {
        Coche[] coches = {
                new Coche("rojo", 4, "Mini", 1500),
                new Coche("azul", 4, "Smart", 900),
                new Coche("blanco", 4, "Fiat", 1066),
                new Coche("negro", 4, "Renault", 1170),
                new Coche("gris", 4, "Peugeot", 1111),
                new Coche("rojo", 4, "Toyota", 1090),
                new Coche("verde", 4, "Seat", 1033),
                new Coche("plateado", 4, "Hyundai", 1259),
                new Coche("amarillo", 4, "Mini Cooper S", 1335),
                new Coche("naranja", 4, "Citroën", 1151),
                new Coche("morado", 4, "Kia", 985)
        };
        for (Coche vehiculo : coches){
            System.out.println("Modelo: " + vehiculo.getModelo() + " color " + vehiculo.getColor() + ", ruedas: " + vehiculo.getRuedas()+", cilindrada: " + vehiculo.getCilindrada());
            if(vehiculo.getColor().contains("a")){
                vehiculo.aparcar();
            } else {
                if (vehiculo.getColor().contains("e")) {
                    vehiculo.acelerar();
                } else {
                    vehiculo.frenar();
                }
            }
            System.out.println("");
        }

        Bicicleta[] bicicletas = {
                new Bicicleta("verde", 2, "Mountain Bike", "montaña"),
                new Bicicleta("rojo", 2, "Trek Marlin", "montaña"),
                new Bicicleta("azul", 2, "Specialized Rockhopper", "montaña"),
                new Bicicleta("negro", 2, "Giant Talon", "montaña"),
                new Bicicleta("blanco", 2, "Cannondale Trail", "montaña"),
                new Bicicleta("amarillo", 2, "Scott Aspect", "montaña"),
                new Bicicleta("plateado", 2, "Cube Acid", "montaña"),
                new Bicicleta("naranja", 2, "Orbea Laufey", "montaña"),
                new Bicicleta("morado", 2, "GT Aggressor", "montaña"),
                new Bicicleta("gris", 2, "Merida Big Nine", "montaña"),
                new Bicicleta("rosa", 2, "Polygon Siskiu", "montaña")
        };
        for (Bicicleta bici : bicicletas){
            System.out.println("Modelo: " + bici.getModelo() + " color " + bici.getColor() + ", ruedas: " + bici.getRuedas()+", cilindrada: " + bici.tipo);
            if(bici.getColor().contains("a")){
                bici.aparcar();
            } else {
                if (bici.getColor().contains("e")) {
                    bici.acelerar();
                } else {
                    bici.frenar();
                }
            }
            System.out.println("");
        }
    }
}
