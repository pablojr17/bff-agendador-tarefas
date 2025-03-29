package com.pablo.bffagendadortarefas.busines;

import com.pablo.bffagendadortarefas.busines.dto.in.UsuarioDTORequest;
import com.pablo.bffagendadortarefas.busines.dto.in.EnderecoDTORequest;
import com.pablo.bffagendadortarefas.busines.dto.in.TelefoneDTORequest;
import com.pablo.bffagendadortarefas.busines.dto.in.LoginRequestDTO;
import com.pablo.bffagendadortarefas.busines.dto.out.EnderecoDTOResponse;
import com.pablo.bffagendadortarefas.busines.dto.out.TelefoneDTOResponse;
import com.pablo.bffagendadortarefas.busines.dto.out.UsuarioDTOResponse;
import com.pablo.bffagendadortarefas.infrastructure.client.UsuarioClient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioClient client;

    public UsuarioDTOResponse salvaUsuario(UsuarioDTORequest usuarioDTO) {

        return client.salvaUsuario(usuarioDTO);
    }

    public String loginUsuario(LoginRequestDTO usuarioDTO) {
        return client.login(usuarioDTO);
    }

    public UsuarioDTOResponse buscarusuarioPorEmail(String email, String token) {
        return client.buscaUsuarioPorEmail(email, token);
    }

    public void deletaUsuarioPorEmail(String email, String token) {
        client.deletaUsuarioPorEmail(email, token);
    }

    public UsuarioDTOResponse atualizaDadosUsuario(String token, UsuarioDTORequest dto) {
        return client.atualizaDadoUsuario(dto, token);
    }

    public EnderecoDTOResponse atualizaEndereco(Long idEndereco, EnderecoDTORequest enderecoDTO, String token) {
       return client.atualizaEndereco(enderecoDTO, idEndereco, token);
    }

    public TelefoneDTOResponse atualizaTelefone(Long idTelefone, TelefoneDTORequest telefoneDTO, String token) {
       return client.atualizaTelefone(telefoneDTO, idTelefone, token);
    }

    public EnderecoDTOResponse cadastraEndereco(String token, EnderecoDTORequest dto) {
      return client.cadastraEndereco(dto, token);
    }

    public TelefoneDTOResponse cadastraTelefone(String token, TelefoneDTORequest dto) {
        return client.cadastraTelefone(dto, token);

    }

}
