package brankosaponjic.springbootsecurity.service;

import brankosaponjic.springbootsecurity.DAO.StudentDao;
import brankosaponjic.springbootsecurity.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentDao studentDao;

    @Autowired
    public StudentService(@Qualifier("studentDao") StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student saveStudent(Student student) {
        return studentDao.saveStudent(student);
    }

    public List<Student> findAll() {
        return studentDao.findAll();
    }

    public Student getStudent(int id) {
        return studentDao.getStudent(id);
    }
}
