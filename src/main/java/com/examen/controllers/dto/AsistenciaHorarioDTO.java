package com.examen.controllers.dto;

import lombok.*;

import java.time.LocalTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Data
public class AsistenciaHorarioDTO {
    private Long id;
    private char estado;
    private Date fecha;
    private LocalTime hora;
    private String observacion;
    private String dia;
    private String aula;
    private String modulo;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private HorarioDTO horario;
}
