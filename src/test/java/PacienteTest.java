import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacienteTest {

    @Test
    void deveEmitirHistoricoCardiologia(){
        FabricaAbstrata fabrica = new FabricaCardiologia();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Historico de Cardiologia", paciente.emitirHistorico());

    }

    @Test
    void deveEmitirExameCardiologia(){
        FabricaAbstrata fabrica = new FabricaCardiologia();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Exame de Cardiologia", paciente.emitirExame());

    }

    @Test
    void deveEmitirHistoricoNeurologia(){
        FabricaAbstrata fabrica = new FabricaNeurologia();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Historico de Neurologia", paciente.emitirHistorico());

    }

    @Test
    void deveEmitirExameNeurologia(){
        FabricaAbstrata fabrica = new FabricaNeurologia();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Exame de Neurologia", paciente.emitirExame());

    }
}
