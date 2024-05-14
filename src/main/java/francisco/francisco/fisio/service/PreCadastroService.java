package francisco.francisco.fisio.service;

import francisco.francisco.fisio.dto.PreCadastroDTO;
import francisco.francisco.fisio.model.PreCadastro;
import francisco.francisco.fisio.repository.PreCadastroRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreCadastroService {

    @Autowired
    private PreCadastroRepository preCadastroRepository;

    @Autowired
    private ModelMapper modelMapper;

    public PreCadastroDTO addPreCadastro(PreCadastroDTO preCadastroDTO) {
        PreCadastro preCadastro = modelMapper.map(preCadastroDTO, PreCadastro.class);
        PreCadastro savedPreCadastro = preCadastroRepository.save(preCadastro);
        return modelMapper.map(savedPreCadastro, PreCadastroDTO.class);
    }
}
