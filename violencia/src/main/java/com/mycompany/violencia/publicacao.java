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
public class publicacao {
   private int Cod_usuario;
   private String titulo;
   private int cod_publicação;
   private String texto;
   private int data_hora;        

    /**
     * @return the Cod_usuario
     */
    public int getCod_usuario() {
        return Cod_usuario;
    }

    /**
     * @param Cod_usuario the Cod_usuario to set
     */
    public void setCod_usuario(int Cod_usuario) {
        this.Cod_usuario = Cod_usuario;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
}
