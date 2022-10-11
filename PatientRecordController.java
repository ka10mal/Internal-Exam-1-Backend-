package com.example.demo.Controller;

import com.example.demo.Repository.PatientRecordRepository;
import com.example.demo.model.PatientRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class PatientRecordController {

    @Autowired
    PatientRecordRepository patientRepository;

    @GetMapping("/patient")
    public List<PatientRecord> getAllStudents() {
        return patientRepository.findAll();
    }

    // Get the student information
    @GetMapping("/patient/{id}")
    public PatientRecord getStudent(@PathVariable Integer id) { return patientRepository.findById(id).get();
    }

    // Delete the student
    @DeleteMapping("/patient/{id}")
    public List<PatientRecord> deleteStudent(@PathVariable Integer id) {
        patientRepository.delete(patientRepository.findById(id).get());
        return patientRepository.findAll();
    }

    // Add new student
    @PostMapping("/patient")
    public List<PatientRecord> addStudent(@RequestBody PatientRecord student) {
        patientRepository.save(student);
        return patientRepository.findAll();
    }

    // Update the student information
    @PutMapping("/patient/{id}")
    public List<PatientRecord> updateStudent(@RequestBody PatientRecord student, @PathVariable Integer id) {
        PatientRecord studentObj = patientRepository.findById(id).get();
        studentObj.setName(student.getName());
        studentObj.setAddress(student.getAddress());
        patientRepository.save(studentObj);
        return patientRepository.findAll();
    }

}
