package com.pablo.bffagendadortarefas.busines.dto.in;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TelefoneDTORequest {
    private String numero;
    private String ddd;
}
