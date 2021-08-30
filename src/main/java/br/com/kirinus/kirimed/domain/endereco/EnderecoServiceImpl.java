package br.com.kirinus.kirimed.domain.endereco;

import br.com.kirinus.kirimed.framework.JpaCrudServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnderecoServiceImpl extends JpaCrudServiceImpl<Endereco, Long> implements EnderecoService {

    private final EnderecoRepository repository;

    @Override
    public JpaRepository<Endereco, Long> getRepository() {
        return repository;
    }
}
