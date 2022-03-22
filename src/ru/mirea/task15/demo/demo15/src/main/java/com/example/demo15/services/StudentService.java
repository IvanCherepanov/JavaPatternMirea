package com.example.demo15.services;


import com.example.demo15.tables.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private final SessionFactory factory;
    private Session session;

    public StudentService(SessionFactory factory) {
        this.factory = factory;
    }

    @PostConstruct
    private void init() {
        session = factory.openSession();
    }

    public List<Student> getStudents() {
        return session.createQuery("FROM Student ").getResultList();
    }

    public void save(Student value) {
        session.beginTransaction();
        if (value.getId() == null)
            session.persist(value);
        else
            session.saveOrUpdate(value);
        session.getTransaction().commit();

    }

    public void remove(Integer id) {
        session.beginTransaction();
        Student item = session.find(Student.class, id);
        if (item != null) session.remove(item);
        session.getTransaction().commit();
    }

    @PreDestroy
    private void finish() {
        session.close();
    }
}
