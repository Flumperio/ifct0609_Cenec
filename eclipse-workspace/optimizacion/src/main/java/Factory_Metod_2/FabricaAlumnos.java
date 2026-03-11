package Factory_Metod_2;

class FabricaAlumnos extends FabricaDeHumanos {
    @Override
    public Persona crearPersona() {
        return new Alumno();
    }
}
