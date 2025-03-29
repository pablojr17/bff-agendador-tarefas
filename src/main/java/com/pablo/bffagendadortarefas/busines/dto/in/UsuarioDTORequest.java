package com.pablo.bffagendadortarefas.busines.dto.in;

import lombok.*;

import java.util.List;

import com.pablo.bffagendadortarefas.busines.dto.out.EnderecoDTOResponse;
import com.pablo.bffagendadortarefas.busines.dto.out.TelefoneDTOResponse;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioDTORequest {
    private String nome;
    private String email;
    private String senha;
    private List<EnderecoDTOResponse> enderecos;
    private List<TelefoneDTOResponse> telefones;
}
