package com.example.demo24.services;

import com.example.demo24.repositories.GroupsRepository;
import com.example.demo24.tables.Groups;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class GroupServiceTest {


    @Mock
    private EmailService emailService;
    @Mock
    private GroupsRepository groupsRepository;
    private GroupService underTest;

    //перед каждым тестом получаем чистые данные
    @BeforeEach
    public void setUp() {
        underTest = new GroupService(groupsRepository, emailService);
    }

    @Test
    void createEntity() {
        Groups groups = new Groups();
        // given

        //when

        //then


    }

    @Test
    void readAllEntity() {
    }

    @Test
    void readOneEntity() {
    }

    @Test
    void updateEntity() {
    }

    @Test
    void deleteEntity() {
    }

    @Test
    void sortGroupsByName() {
    }

    @Test
    void filterGroupByFirstName() {
    }
}