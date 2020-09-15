package brankosaponjic.springbootsecurity.repository;

import brankosaponjic.springbootsecurity.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
