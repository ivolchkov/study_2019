package lesson6.task4.service;

import lesson6.task4.domain.Student;
import lesson6.task4.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student register(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("");
        }
        return studentRepository.save(student);
    }
}
