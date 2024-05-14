package francisco.francisco.fisio.service;

import francisco.francisco.fisio.dto.PacienteDTO;
import francisco.francisco.fisio.model.Paciente;
import francisco.francisco.fisio.repository.PacienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private ModelMapper modelMapper;

    public PacienteDTO addPaciente(PacienteDTO pacienteDTO) {
        Paciente paciente = modelMapper.map(pacienteDTO, Paciente.class);
        Paciente savedPaciente = pacienteRepository.save(paciente);
        return modelMapper.map(savedPaciente, PacienteDTO.class);
    }
}
