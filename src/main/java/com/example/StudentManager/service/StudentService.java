package com.example.StudentManager.service;

import com.example.StudentManager.model.Student;
import com.example.StudentManager.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository){
        this.repository = repository;
    }

    public List<Student> listAll() {
        return repository.findAll();
    }

    public Student getById(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Etudante não encontrado"));
    }

    public Student create(Student student){
        return repository.save(student);
    }

    public Student update(Long id, Student updated) {
        Student student = getById(id);
        student.setName(updated.getName());
        student.setEmail(updated.getEmail());
        return repository.save(student);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public StudentRepository getRepository() {
        return repository;
    }
}
