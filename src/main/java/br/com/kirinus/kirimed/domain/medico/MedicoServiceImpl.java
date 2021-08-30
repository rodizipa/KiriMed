package br.com.kirinus.kirimed.domain.medico;

import br.com.kirinus.kirimed.framework.JpaCrudServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MedicoServiceImpl extends JpaCrudServiceImpl<Medico, Long> implements MedicoService{

    private final MedicoRepository repository;

    @Override
    public JpaRepository<Medico, Long> getRepository() {
        return repository;
    }
}
