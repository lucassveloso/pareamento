package aceleradora.controller;

import aceleradora.dao.AlunoDAO;
import aceleradora.model.Aluno;
import aceleradora.model.Dupla;
import aceleradora.model.Manter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class AlunoController {


    private AlunoDAO alunodao;
    private int codigo;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mostrartabela(Manter manter,Model model) {
        manter = new Manter();
        System.out.println(manter.aluno0);
        alunodao = new AlunoDAO();
        List<Aluno> alunos = alunodao.getAlunos();
        model.addAttribute("bloqueado", "||||||||||||||||||");
        model.addAttribute("aluno0", alunos.get(0));
        model.addAttribute("aluno1", alunos.get(1));
        model.addAttribute("aluno2", alunos.get(2));
        model.addAttribute("aluno3", alunos.get(3));
        model.addAttribute("aluno4", alunos.get(4));
        model.addAttribute("aluno5", alunos.get(5));
        model.addAttribute("aluno6", alunos.get(6));
        model.addAttribute("aluno7", alunos.get(7));
        model.addAttribute("aluno8", alunos.get(8));
        model.addAttribute("aluno9", alunos.get(9));
        model.addAttribute("aluno10", alunos.get(10));

        model.addAttribute("coringa", "O coringa é: ");
        return "tabela";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String mostrartabelapreenchida(Manter manter,Model model) {

        System.out.println(manter.aluno0);
        alunodao = new AlunoDAO();
        List<Aluno> alunos = alunodao.getAlunos();
        model.addAttribute("bloqueado", "||||||||||||||||||");
        model.addAttribute("aluno0", alunos.get(0));
        model.addAttribute("aluno1", alunos.get(1));
        model.addAttribute("aluno2", alunos.get(2));
        model.addAttribute("aluno3", alunos.get(3));
        model.addAttribute("aluno4", alunos.get(4));
        model.addAttribute("aluno5", alunos.get(5));
        model.addAttribute("aluno6", alunos.get(6));
        model.addAttribute("aluno7", alunos.get(7));
        model.addAttribute("aluno8", alunos.get(8));
        model.addAttribute("aluno9", alunos.get(9));
        model.addAttribute("aluno10", alunos.get(10));

        String duplatabela;
        List<Dupla> duplas = new ArrayList<>();
        Dupla dupla;
        int contdupla = 0;
        Collections.shuffle(alunos);

        for (int i = 0; i < alunos.size() - 1; i = i + 2) {
            if (alunos.get(i).getCodigo() < alunos.get(i + 1).getCodigo()) {
                dupla = new Dupla(contdupla, alunos.get(i), alunos.get(i + 1));
            } else {
                dupla = new Dupla(contdupla, alunos.get(i + 1), alunos.get(i));
            }
            duplas.add(dupla);
            duplatabela = "dupla" + dupla.getAluno1().getCodigo() + dupla.getAluno2().getCodigo();
            model.addAttribute(duplatabela, "X");
            contdupla++;
        }

        //model.addAttribute("coringa", "O coringa é: " + alunos.get(alunos.size() - 1).getNome());
        model.addAttribute("coringa", "O coringa é: " + alunos.get(codigo).getNome());
        model.addAttribute("dupla" + duplas.get(0).getCodigo(), "Dupla 1: " + duplas.get(0).getAluno1().getNome() + ", " + duplas.get(0).getAluno2().getNome());
        model.addAttribute("dupla" + duplas.get(1).getCodigo(), "Dupla 2: " + duplas.get(1).getAluno1().getNome() + ", " + duplas.get(1).getAluno2().getNome());
        model.addAttribute("dupla" + duplas.get(2).getCodigo(), "Dupla 3: " + duplas.get(2).getAluno1().getNome() + ", " + duplas.get(2).getAluno2().getNome());
        model.addAttribute("dupla" + duplas.get(3).getCodigo(), "Dupla 4: " + duplas.get(3).getAluno1().getNome() + ", " + duplas.get(3).getAluno2().getNome());
        model.addAttribute("dupla" + duplas.get(4).getCodigo(), "Dupla 5: " + duplas.get(4).getAluno1().getNome() + ", " + duplas.get(4).getAluno2().getNome());

        return "tabela";
    }

    public void teste(int codigo){
        this.codigo = codigo;
    }

}