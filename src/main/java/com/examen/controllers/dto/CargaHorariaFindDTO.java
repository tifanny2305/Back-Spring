package com.examen.controllers.dto;

import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
public class CargaHorariaFindDTO {
    private Long id;
    private String gestion;
    private String grupo;
    private String materia;
    private String carrera;
    private List<HorarioMateriaGrupoDTO> horarios;
}
