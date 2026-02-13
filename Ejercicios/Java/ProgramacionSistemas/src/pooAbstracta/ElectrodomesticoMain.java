package pooAbstracta;


public class ElectrodomesticoMain {
    public static void main(String[] args) {

        Frigorifico[] frigorificos = {
                new Frigorifico("blanco", 65, "Bosch", "BSH", 599.99, 340, 175),
                new Frigorifico("inox", 72, "Liebherr", "Liebherr", 899.99, 310, 165),
                new Frigorifico("plateado", 58, "Balay", "BSH", 449.99, 290, 160),
                new Frigorifico("negro", 68, "Whirlpool", "Whirlpool", 679.99, 360, 180),
                new Frigorifico("blanco", 55, "Candy", "Haier", 399.99, 270, 155),
                new Frigorifico("inox", 82, "Samsung", "Samsung", 799.99, 390, 185),
                new Frigorifico("gris", 70, "LG", "LG", 749.99, 370, 178),
                new Frigorifico("plateado", 62, "Teka", "Teka", 529.99, 300, 168),
                new Frigorifico("negro", 75, "Siemens", "BSH", 829.99, 350, 172),
                new Frigorifico("inox", 59, "Hisense", "Hisense", 469.99, 280, 158),
                new Frigorifico("blanco", 67, "Indesit", "Whirlpool", 499.99, 320, 170)
        };
        Lavadora[] lavadoras = {
                new Lavadora("blanco", 62, "Bosch", "BSH", 499.99, 8),
                new Lavadora("inox", 70, "Samsung", "Samsung", 649.99, 9),
                new Lavadora("plateado", 58, "Balay", "BSH", 399.99, 7),
                new Lavadora("negro", 68, "LG", "LG", 579.99, 9),
                new Lavadora("blanco", 55, "Candy", "Haier", 349.99, 6),
                new Lavadora("gris", 72, "Whirlpool", "Whirlpool", 459.99, 8),
                new Lavadora("inox", 66, "Siemens", "BSH", 699.99, 9),
                new Lavadora("plateado", 60, "Teka", "Teka", 429.99, 7),
                new Lavadora("negro", 74, "Hisense", "Hisense", 379.99, 8),
                new Lavadora("blanco", 64, "Indesit", "Whirlpool", 419.99, 7),
                new Lavadora("gris", 69, "Aeg", "Electrolux", 749.99, 10)
        };
        Cafetera[] cafeteras = {
                new Cafetera("negro", 3, "Philips", "Philips", 89.99, "cápsulas"),
                new Cafetera("rojo", 2.5, "Nespresso", "Nestlé", 129.99, "cápsulas"),
                new Cafetera("blanco", 4, "Cecotec", "Cecotec", 69.99, "goteo"),
                new Cafetera("inox", 3.2, "De'Longhi", "De'Longhi", 179.99, "cápsulas"),
                new Cafetera("negro", 2.8, "Krups", "Krups", 99.99, "cápsulas"),
                new Cafetera("plateado", 5, "Taurus", "Taurus", 49.99, "goteo"),
                new Cafetera("crema", 3.5, "Oster", "Oster", 79.99, "goteo"),
                new Cafetera("negro", 2.2, "Dolce Gusto", "Nestlé", 119.99, "cápsulas"),
                new Cafetera("rojo", 4.2, "Ufesa", "Ufesa", 59.99, "goteo"),
                new Cafetera("inox", 3.8, "Saeco", "Philips", 249.99, "autoservicio"),
                new Cafetera("blanco", 2.9, "Tristar", "Tristar", 39.99, "goteo")
        };

        for (Frigorifico cnt : frigorificos) {
            System.out.println(cnt.toString());
        }
        for (Cafetera cnt : cafeteras) {
            System.out.println(cnt.toString());
        }
        for (Lavadora cnt : lavadoras) {
            System.out.println(cnt.toString());
        }
    }
}
