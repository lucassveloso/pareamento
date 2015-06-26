package aceleradora.dao;

import aceleradora.model.Aluno;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 20/06/15.
 */
public class AlunoDAO {

    private List<Aluno> alunos;

    public AlunoDAO() {
        alunos = new ArrayList<>();
        alunos.add(new Aluno(0, "Amanda"));
        alunos.add(new Aluno(1, "Johan"));
        alunos.add(new Aluno(2, "Lucas"));
        alunos.add(new Aluno(3, "Thiago"));
        alunos.add(new Aluno(4, "Yasser"));
        alunos.add(new Aluno(5, "Eduardo"));
        alunos.add(new Aluno(6, "Juliana"));
        alunos.add(new Aluno(7, "Marcus"));
        alunos.add(new Aluno(8, "Rafael R."));
        alunos.add(new Aluno(9, "Guilherme"));
        alunos.add(new Aluno(10, "Raphael B."));
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Aluno> getAlunosManter(List<String> listamanter) {
        List<Aluno> alunosmanter = new ArrayList<>();
        for (int j = 0; j <alunos.size() ; j++) {
            for (int i = 0; i < listamanter.size(); i++) {
                if (alunos.get(j).getCodigo() == Integer.parseInt(listamanter.get(i))) {
                    alunosmanter.add(alunos.get(j));
                }
            }
        }

        return alunosmanter;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
