package aceleradora.model;

import javax.persistence.Entity;

/**
 * Created by lucas on 21/06/15.
 */

public class Dupla {

    private int codigo;
    private Aluno aluno1;
    private Aluno aluno2;

    public Dupla(int codigo, Aluno aluno1, Aluno aluno2) {
        this.codigo = codigo;
        this.aluno1 = aluno1;
        this.aluno2 = aluno2;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Aluno getAluno1() {
        return aluno1;
    }

    public void setAluno1(Aluno aluno1) {
        this.aluno1 = aluno1;
    }

    public Aluno getAluno2() {
        return aluno2;
    }

    public void setAluno2(Aluno aluno2) {
        this.aluno2 = aluno2;
    }
}
