public class FabricaCardiologia implements FabricaAbstrata {

    public Exame createExame() {
        return new ExameCardiologia();
    }

    public Historico createHistorico() {
        return  new HistoricoCardiologia();
    }
}
