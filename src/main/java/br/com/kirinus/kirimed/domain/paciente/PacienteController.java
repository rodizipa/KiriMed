package br.com.kirinus.kirimed.domain.paciente;

import br.com.kirinus.kirimed.framework.CrudRestController;
import br.com.kirinus.kirimed.framework.JpaCrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController("pacientes")
@RequiredArgsConstructor
public class PacienteController extends CrudRestController<Paciente, Long> {

    private final PacienteService service;

    @Override
    public JpaCrudService<Paciente, Long> getService() {
        return service;
    }
}
