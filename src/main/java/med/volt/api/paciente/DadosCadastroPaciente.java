package med.volt.api.paciente;

import med.volt.api.endereco.DadosEndereco;
import med.volt.api.medico.Especialidade;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
}
