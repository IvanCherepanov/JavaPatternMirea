package com.example.demo15.Controllers;

import com.example.demo15.tables.Groups;
import com.example.demo15.tables.Student;
import com.example.demo15.services.GroupService;
import com.example.demo15.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private GroupService groupService;
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/home")
    public String getTestPage() {
        return "home";
    }

    @PostMapping(value = "/create-group")
    @ResponseBody
    public void createGroup(@RequestBody Groups groups) {
        groupService.save(groups);
    }

    @PostMapping(value = "/create-student",consumes = {"application/json"})
    public ResponseEntity<?> createStudent(@RequestBody Student student) {
        System.out.println("\n\n");
        System.out.println(student.getFirstName());
        studentService.save(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/delete-group")
    @ResponseBody
    public void deleteGame(Integer id) {
        groupService.remove(id);
    }

    @GetMapping(value = "/delete-student")
    @ResponseBody
    public void deleteAuthor(Integer id) {
        studentService.remove(id);
    }

    @GetMapping(value = "/show-group")
    @ResponseBody
    public List<Groups> showGroups() {
        return groupService.getGroups();
    }

    @GetMapping(value = "/show-author")
    @ResponseBody
    public List<Student> showStudents() {
        return studentService.getStudents();
    }
}
