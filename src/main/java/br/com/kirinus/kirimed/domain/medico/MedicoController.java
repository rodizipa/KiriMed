package br.com.kirinus.kirimed.domain.medico;

import br.com.kirinus.kirimed.framework.CrudRestController;
import br.com.kirinus.kirimed.framework.JpaCrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController("medicos")
@RequiredArgsConstructor
public class MedicoController extends CrudRestController<Medico, Long> {

    private final MedicoService service;

    @Override
    public JpaCrudService<Medico, Long> getService() {
        return service;
    }
}
