package brankosaponjic.springbootsecurity.controller;

import brankosaponjic.springbootsecurity.model.Student;
import brankosaponjic.springbootsecurity.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public Student addStudent( @RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        return studentService.getStudent(studentId);
    }
}
