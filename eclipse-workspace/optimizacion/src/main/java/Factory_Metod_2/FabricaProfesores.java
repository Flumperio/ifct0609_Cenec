package Factory_Metod_2;

class FabricaProfesores extends FabricaDeHumanos{
    @Override
    public Persona crearPersona() {
        return new Profesor();
    }
}
