package com.mycompany.violencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class comentario {
    private int cod_usuario;
    private int cod_publicação;       
    private int cod_comentario;
    private int data_hora;
    private String texto;

    /**
     * @return the cod_usuario
     */
    public int getCod_usuario() {
        return cod_usuario;
    }

    /**
     * @param cod_usuario the cod_usuario to set
     */
    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    /**
     * @return the cod_publicação
     */
    public int getCod_publicação() {
        return cod_publicação;
    }

    /**
     * @param cod_publicação the cod_publicação to set
     */
    public void setCod_publicação(int cod_publicação) {
        this.cod_publicação = cod_publicação;
    }

    /**
     * @return the cod_comentario
     */
    public int getCod_comentario() {
        return cod_comentario;
    }

    /**
     * @param cod_comentario the cod_comentario to set
     */
    public void setCod_comentario(int cod_comentario) {
        this.cod_comentario = cod_comentario;
    }

    /**
     * @return the data_hora
     */
    public int getData_hora() {
        return data_hora;
    }

    /**
     * @param data_hora the data_hora to set
     */
    public void setData_hora(int data_hora) {
        this.data_hora = data_hora;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
}
