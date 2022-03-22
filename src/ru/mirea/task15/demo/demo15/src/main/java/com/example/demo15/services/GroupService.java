package com.example.demo15.services;


import com.example.demo15.tables.Groups;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service
public class GroupService {

    @Autowired
    private final SessionFactory factory;

    private Session session;

    public GroupService(SessionFactory factory) {
        this.factory = factory;
    }

    @PostConstruct
    private void init() {
        session = factory.openSession();
    }

    public List<Groups> getGroups() {
        return session.createQuery("FROM Groups ").getResultList();
    }

    public void save(Groups value) {
        session.beginTransaction();
        if (value.getId() == null)
            session.persist(value);
        else
            session.merge(value);
        session.getTransaction().commit();

    }

    public void remove(Integer id) {
        session.beginTransaction();
        Groups item = session.find(Groups.class, id);
        if (item != null) session.remove(item);
        session.getTransaction().commit();
    }

    @PreDestroy
    private void finish() {
        session.close();
    }
}
