package br.com.kirinus.kirimed.domain.paciente;

import br.com.kirinus.kirimed.domain.endereco.Endereco;
import br.com.kirinus.kirimed.domain.medico.Medico;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private String telefone;

    @ManyToOne
    private Medico medico;

    @OneToOne
    private Endereco enderecoResidencial;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(id, paciente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
