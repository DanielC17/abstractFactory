public class Paciente {
    private Exame exame;
    private Historico historico;

    public Paciente(FabricaAbstrata fabrica){
        this.exame = fabrica.createExame();
        this.historico = fabrica.createHistorico();
    }

    public String emitirExame(){
        return this.exame.emitir();
    }
    public String emitirHistorico(){
        return this.historico.emitir();
    }
}
