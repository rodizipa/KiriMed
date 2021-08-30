package br.com.kirinus.kirimed.domain.paciente;

import br.com.kirinus.kirimed.framework.JpaCrudServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PacienteServiceImpl extends JpaCrudServiceImpl<Paciente, Long> implements PacienteService {

    private final PacienteRepository repository;

    @Override
    public JpaRepository<Paciente, Long> getRepository() {
        return repository;
    }
}
