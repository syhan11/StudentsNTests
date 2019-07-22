package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

@Controller
public class HomeControl {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    TestRepository testRepository;

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("allstudents", studentRepository.findAll());
        model.addAttribute("alltests", testRepository.findAll());

        return "list";
    }

    @PostConstruct()
    public void fillTable(){
        Student person = new Student();
        person.setFirstName("John");
        person.setLastName("Smith");
        person.setMajor("Business");
        studentRepository.save(person);


        person = new Student("Jane", "Doe", "Accounting");
        studentRepository.save(person);

        person = new Student("Kim", "Strong", "BioChemistry");
        studentRepository.save(person);

        person = new Student("Hope", "Dreamer", "Astronomy");
        studentRepository.save(person);

        person = new Student("Mark", "Listener", "Psychology");
        studentRepository.save(person);



    }
}
