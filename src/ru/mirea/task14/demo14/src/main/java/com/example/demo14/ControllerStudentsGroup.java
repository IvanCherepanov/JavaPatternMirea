package com.example.demo14;

import com.example.demo14.Entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class ControllerStudentsGroup {
    private ArrayList<Student> list = new ArrayList<>();

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getTestPage() {
        return "home.html";
    }

    @PostMapping(value = "/add-student")
    @ResponseBody
    public void createGame(@RequestBody Student student) {
        student = new Student("qe","rew","fdg");
        list.add(student);
        System.out.println(student);
    }

    @GetMapping(value = "/show-student")
    @ResponseBody
    public Object[] showGames() {
        return list.stream()
                .filter(item -> item instanceof Student).toArray();
    }
}
