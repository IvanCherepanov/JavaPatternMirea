package com.example.demo15.tables;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//используем Lombok
@Entity
@Table(name = "groupss")
@Setter
@Getter
public class Groups {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "group_name")
    private String groupName;

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                '}';
    }
}
