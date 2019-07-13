package com.schoolbit.model;

import com.schoolbit.constants.FormaPagamento;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Relacionamento JPA.
    @ManyToOne //Muitas inscricoes pode ser feita em uma night
    @JoinColumn(name = "Night_Id")
    private Night night;

    @ManyToOne
    @JoinColumn(name = "Baladeiro_Id")
    private Baladeiro baladeiro;

    @Enumerated(EnumType.STRING)
    private FormaPagamento formaPagamento;
    private String numeroCartao;
    private String nomeCartao;
    private String cvv;
    private Integer mesValidade;
    private  Integer anoValidade;
}
