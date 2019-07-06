package com.schoolbit.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
public class Night {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String estilo;
    private String imagemUrl;
    private String videoUrl;
    private String localEncontro;
    private String dataEncontro;
    private String horaEncontro;
    private BigDecimal valor;

    @ManyToMany
    @JoinTable(name="night_balada", joinColumns=
            {@JoinColumn(name="night_id")}, inverseJoinColumns=
            {@JoinColumn(name="balada_id")})
    private List<Balada> baladas;

    @ManyToMany
    @JoinTable(name="night_baladeiro", joinColumns=
            {@JoinColumn(name="night_id")}, inverseJoinColumns=
            {@JoinColumn(name="baladeiro_id")})
    private List<Baladeiro> baladeiros;
}
