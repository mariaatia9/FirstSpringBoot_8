/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibb.demo;

import com.ibb.model.Address;
import com.ibb.model.Person;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author trainer
 */
@Controller
@Getter
@Setter
@RequestMapping(path = "/web")
public class FirstMvcController {

    @Autowired
    private MyService myService;

    private Person person;
    private List<Person> listPerson;

    public FirstMvcController() {
        listPerson = new ArrayList<>();
        person = new Person("Hans", "Musterman");
        Address a = new Address("München", "Hauptstrasse");
        person.setAddress(a);
        System.out.println("Controller erstellt!");
    }

    @GetMapping(path = "/start")
    public ModelAndView lp() {
        ModelAndView m = new ModelAndView();
        m.addObject("personen", myService.serviceListe());
        m.setViewName("listperson.xhtml");
        return m;
    }

    @GetMapping(path = "/person")
    public String person(Model m) {

        m.addAttribute("person", person);

        return "person.xhtml";
    }

    @GetMapping(path = "/new")
    public String mynew(Model m) {
        m.addAttribute("person", new Person());

        return "new.xhtml";
    }

    @PostMapping(path = "/create")
    public String submitPerson(@ModelAttribute Person p, Model m) {
        person = p;
        System.out.println("" + p);
        m.addAttribute("person", p);
        return "person.xhtml";
    }

    @PostMapping(path = "/add")
    public String addPerson(@ModelAttribute Person p, Model m) {
        person = p;
        m.addAttribute("person", new Person());
        System.out.println("add Person to List! " + p);
        listPerson.add(p);
        m.addAttribute("personen", listPerson);
        return "personen.xhtml";
    }

    @GetMapping(path = "/add")
    public String myAdd(Model m) {
        m.addAttribute("person", new Person());

        return "personen.xhtml";
    }
}
