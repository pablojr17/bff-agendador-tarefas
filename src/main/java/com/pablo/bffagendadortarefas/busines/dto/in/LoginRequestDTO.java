package com.pablo.bffagendadortarefas.busines.dto.in;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginRequestDTO {
    private String email;
    private String senha;
}
