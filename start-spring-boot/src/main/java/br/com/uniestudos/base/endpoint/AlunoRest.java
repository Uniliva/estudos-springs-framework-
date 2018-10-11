package br.com.uniestudos.base.endpoint;

import br.com.uniestudos.base.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.uniestudos.base.util.DateUtil;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoRest {

    @Autowired
    private DateUtil dateUtil;

    @RequestMapping( method = RequestMethod.GET, path = "/lista")
    List<Aluno> buscaAlunos(){
        System.out.println(dateUtil.formateLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return  Arrays.asList(new Aluno("Uniliva"),
                new Aluno("Zumair"));
    }
}
