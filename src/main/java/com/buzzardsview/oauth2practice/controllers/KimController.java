package com.buzzardsview.oauth2practice.controllers;

import com.buzzardsview.oauth2practice.models.Kim;
import com.buzzardsview.oauth2practice.models.data.KimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("kim")
public class KimController {

    @Autowired
    private KimRepository repo;

    @GetMapping("/{id}")
    public Kim getOne(@PathVariable Integer id) {
        return repo.findById(id).orElseThrow();
    }

    @PostMapping("add")
    public void newKim(@RequestBody Kim kim) {
        repo.save(kim);
    }

}
