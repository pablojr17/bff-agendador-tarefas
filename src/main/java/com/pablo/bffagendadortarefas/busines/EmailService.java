package com.pablo.bffagendadortarefas.busines;


import com.pablo.bffagendadortarefas.busines.dto.out.TarefasDTOResponse;
import com.pablo.bffagendadortarefas.infrastructure.client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final EmailClient emailClient;

    public void enviarEmail(TarefasDTOResponse dto) {
        emailClient.enviarEmail(dto);
    }
}
