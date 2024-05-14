package francisco.francisco.fisio.controller;

import francisco.francisco.fisio.dto.PacienteDTO;
import francisco.francisco.fisio.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping
    public ResponseEntity<PacienteDTO> addPaciente(@RequestBody PacienteDTO pacienteDTO) {
        PacienteDTO newPaciente = pacienteService.addPaciente(new PacienteDTO());
        return ResponseEntity.ok(newPaciente);
    }

}
