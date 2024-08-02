package ru.gb.oseminar.controller;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.service.TeacherService;
import ru.gb.oseminar.view.TeacherView;
import java.time.LocalDate;


public class TeacherController implements UserController<Teacher>{

    private final TeacherService dService = new TeacherService();
    private final TeacherView  teacherView = new TeacherView();

    
    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dService.getAll());
    }

}