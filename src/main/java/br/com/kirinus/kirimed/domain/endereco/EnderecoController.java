package br.com.kirinus.kirimed.domain.endereco;

import br.com.kirinus.kirimed.framework.CrudRestController;
import br.com.kirinus.kirimed.framework.JpaCrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController("enderecos")
@RequiredArgsConstructor
public class EnderecoController extends CrudRestController<Endereco, Long> {

    private final EnderecoService service;

    @Override
    public JpaCrudService<Endereco, Long> getService() {
        return service;
    }
}
