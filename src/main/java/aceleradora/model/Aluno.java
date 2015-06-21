package aceleradora.model;

import javax.persistence.*;
import java.io.Serializable;


public class Aluno implements Comparable<Aluno>, Serializable{


    private int codigo;

    private String nome;

    public Aluno() {

    }


    public Aluno(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Aluno o) {
        return this.getNome().compareTo(o.getNome());
    }
}