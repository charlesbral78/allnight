package com.schoolbit.model;


import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Estilo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_do_estilo;
    private String descricao_do_estilo;
    private String imagem;
    private String autor_da_dica;
    private String onde_comprar;

}
