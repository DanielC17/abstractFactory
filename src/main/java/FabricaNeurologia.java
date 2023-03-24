public class FabricaNeurologia implements FabricaAbstrata{
    public Exame createExame(){
        return new ExameNeurologia();
    }

    public Historico createHistorico() {
        return new HistoricoNeurologia();
    }
}
