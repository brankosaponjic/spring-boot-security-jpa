package brankosaponjic.springbootsecurity.DAO;

import brankosaponjic.springbootsecurity.model.Student;
import brankosaponjic.springbootsecurity.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("studentDao")
public class StudentDao {

    private final StudentRepository studentRepository;

    public StudentDao(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student getStudent(int id) {
        return studentRepository.getOne(id);
    }
}
