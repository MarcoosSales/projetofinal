
package com.aluno.server.model;


public class Hotel {
    
    private String nome;
    private int numquarto;
    private int andar;
    private int cama;
    private double preço;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the numquarto
     */
    public int getNumquarto() {
        return numquarto;
    }

    /**
     * @param numquarto the numquarto to set
     */
    public void setNumquarto(int numquarto) {
        this.numquarto = numquarto;
    }

    /**
     * @return the andar
     */
    public int getAndar() {
        return andar;
    }

    /**
     * @param andar the andar to set
     */
    public void setAndar(int andar) {
        this.andar = andar;
    }

    /**
     * @return the cama
     */
    public int getCama() {
        return cama;
    }

    /**
     * @param cama the cama to set
     */
    public void setCama(int cama) {
        this.cama = cama;
    }

    /**
     * @return the preço
     */
    public double getPreço() {
        return preço;
    }

    /**
     * @param preço the preço to set
     */
    public void setPreço(double preço) {
        this.preço = preço;
    }
   
}
