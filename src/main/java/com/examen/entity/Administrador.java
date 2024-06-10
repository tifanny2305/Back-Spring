package com.examen.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "admins")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(name = "apellido_p")
    private String apellidoP;
    @Column(name = "apellido_m")
    private String apellidoM;
    @OneToOne(targetEntity = Usuario.class)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Usuario usuario;
    @OneToMany(targetEntity = CargaHoraria.class, mappedBy = "administrador")
    private List<CargaHoraria>cargaHorarias;

}
