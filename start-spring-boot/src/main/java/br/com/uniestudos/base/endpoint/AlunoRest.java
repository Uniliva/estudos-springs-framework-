package br.com.uniestudos.base.endpoint;

import br.com.uniestudos.base.model.Aluno;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoRest {

    @RequestMapping( method = RequestMethod.GET, path = "/lista")
    List<Aluno> buscaAlunos(){
        return  Arrays.asList(new Aluno("Uniliva"), new Aluno("Zumair"));
    }
}
