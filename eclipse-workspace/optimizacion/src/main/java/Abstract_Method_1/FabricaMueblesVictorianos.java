package Abstract_Method_1;

class FabricaMueblesVictorianos implements FabricaMuebles{
    @Override
    public Silla crearSilla() {
        return new SillaVictoriana();
    }
    @Override
    public Sofa crearSofa() {
        return new SofaVictoriano();
    }
    @Override
    public Mesa crearMesa() {
        return new MesaVictoriana();
    }
}
