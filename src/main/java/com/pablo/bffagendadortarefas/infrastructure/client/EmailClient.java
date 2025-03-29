package com.pablo.bffagendadortarefas.infrastructure.client;

import com.pablo.bffagendadortarefas.busines.dto.in.EnderecoDTORequest;
import com.pablo.bffagendadortarefas.busines.dto.in.LoginRequestDTO;
import com.pablo.bffagendadortarefas.busines.dto.in.TelefoneDTORequest;
import com.pablo.bffagendadortarefas.busines.dto.in.UsuarioDTORequest;
import com.pablo.bffagendadortarefas.busines.dto.out.EnderecoDTOResponse;
import com.pablo.bffagendadortarefas.busines.dto.out.TarefasDTOResponse;
import com.pablo.bffagendadortarefas.busines.dto.out.TelefoneDTOResponse;
import com.pablo.bffagendadortarefas.busines.dto.out.UsuarioDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "notificacao", url = "${notificacao.url}")
public interface EmailClient {

    void enviarEmail(@RequestBody TarefasDTOResponse dto);
}
