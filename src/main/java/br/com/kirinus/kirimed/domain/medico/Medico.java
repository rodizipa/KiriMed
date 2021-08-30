package br.com.kirinus.kirimed.domain.medico;

import br.com.kirinus.kirimed.domain.endereco.Endereco;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String especialidade;

    private String telefone;

    private String registroCRM;

    @OneToOne
    private Endereco enderecoResidencial;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medico medico = (Medico) o;
        return Objects.equals(id, medico.id) && Objects.equals(nome, medico.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
