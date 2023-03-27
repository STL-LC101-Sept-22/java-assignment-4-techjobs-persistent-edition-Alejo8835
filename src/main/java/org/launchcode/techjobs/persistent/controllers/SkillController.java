package org.launchcode.techjobs.persistent.controllers;

import org.launchcode.techjobs.persistent.models.Skill;
import org.launchcode.techjobs.persistent.models.data.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("skills")
public class SkillController {

    @Autowired
    private SkillRepository skillRepository;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("title", "Skills");
        model.addAttribute("skills", skillRepository.findAll());
        return "skills/index";
    }

    @GetMapping
    public String displayAddSkillForm(Model model) {
        model.addAttribute(new Skill());
        return "skills/add";
        }
    }






















}
