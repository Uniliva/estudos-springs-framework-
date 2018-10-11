package br.com.uniestudos.base.restController;

import br.com.uniestudos.base.model.Student;
import br.com.uniestudos.base.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentRestController {

    @Autowired
    private DateUtil dateUtil;

    @GetMapping("/list")
    public List<Student> listStudents(){
        System.out.printf("Teste dataUtil" + dateUtil.formateLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return Arrays.asList(new Student("Unniliva"), new Student("Zumair"), new Student("Divino"));

    }
}
