package com.sda.carsharing.web.controllers;

import com.sda.carsharing.dto.BranchesDto;
import com.sda.carsharing.model.entities.Branches;
import com.sda.carsharing.services.BranchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "admin/branches")
public class BranchesController {
    private BranchesService branchesService;

    @Autowired
    public BranchesController(BranchesService branchesService) {
        this.branchesService = branchesService;
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("branches", branchesService.findAll());
        return "admin/branches-list";
    }

    @GetMapping(value = "add")
    public String addBranchesView(Model model) {
        model.addAttribute("brancheDto", new BranchesDto());
        return "admin/branches-form";
    }

    @PostMapping
    public String addBranche(Model model, @Valid @ModelAttribute("brancheDto") BranchesDto branchesDto) {
        this.branchesService.addBranches(branchesDto);
        model.addAttribute("branches", branchesService.findAll());
        model.addAttribute("msg", "Oddział dodany");
        return "admin/branches-list";
    }

    @PostMapping(value = "del")
    public String delCarModel(@RequestParam(required = true) Long id, Model model) {
        this.branchesService.deleteBranchesById(id);
        model.addAttribute("msg", "Oddział usunięty");
        model.addAttribute("branches", branchesService.findAll());
        return "admin/branches-list";
    }
    @PostMapping(value = "edit")
    public String editBranches(@RequestParam(required = true) Long id, Model model){
        model.addAttribute("brancheDto", branchesService.findById(id));
        return "admin/branches-form";
    }
}