package francisco.francisco.fisio.controller;

import francisco.francisco.fisio.dto.PreCadastroDTO;
import francisco.francisco.fisio.service.PreCadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/precadastro")
public class PreCadastroController {

    @Autowired
    private PreCadastroService preCadastroService;

    @PostMapping
    public ResponseEntity<PreCadastroDTO> addPreCadastro(@RequestBody PreCadastroDTO preCadastroDTO) {
        PreCadastroDTO newPreCadastro = preCadastroService.addPreCadastro(preCadastroDTO);
        return ResponseEntity.ok(newPreCadastro);
    }

}
