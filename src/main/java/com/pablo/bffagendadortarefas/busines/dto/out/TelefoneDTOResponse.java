package com.pablo.bffagendadortarefas.busines.dto.out;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TelefoneDTOResponse {
    private Long id;
    private String numero;
    private String ddd;
}
