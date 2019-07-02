
package com.aluno.server.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Voo implements Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cidade cidadeOrigem;

    @ManyToOne
    private Cidade cidadeDestino;

    private int numeroVoo;

    private long precoPacagem;

    @ManyToOne
    private Aviao aviao;

    @ManyToOne
    private Piloto piloto;

    private LocalDate horadataPartida;

    private LocalDate horadataChegada;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cidade getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(Cidade cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public Cidade getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(Cidade cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public long getPrecoPacagem() {
        return precoPacagem;
    }

    public void setPrecoPacagem(long precoPacagem) {
        this.precoPacagem = precoPacagem;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public LocalDate getHoradataPartida() {
        return horadataPartida;
    }

    public void setHoradataPartida(LocalDate horadataPartida) {
        this.horadataPartida = horadataPartida;
    }

    public LocalDate getHoradataChegada() {
        return horadataChegada;
    }

    public void setHoradataChegada(LocalDate horadataChegada) {
        this.horadataChegada = horadataChegada;
    }
}
