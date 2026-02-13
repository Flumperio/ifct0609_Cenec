package Sobrecarga;

public class SobrecargaMain {
    public static void main(String[] args) {

        SobreCarga sobrecarga1=new SobreCarga("Juan Carlos", 4000);
        SobreCarga sobrecarga2=new SobreCarga("Juan Carlos");
        SobreCarga sobrecarga3=new SobreCarga("Juan Carlos", 56, 3000);

        sobrecarga1.mostrar();
        sobrecarga2.mostrar();
        sobrecarga3.mostrar();
    }
}
