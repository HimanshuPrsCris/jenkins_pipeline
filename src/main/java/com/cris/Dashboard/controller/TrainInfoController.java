package com.cris.Dashboard.controller;

import com.cris.Dashboard.model.Train;
import com.cris.Dashboard.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Controller
public class TrainInfoController {

    @Autowired
    private TrainService trainService;

    @GetMapping("/dashboard")
    public List<Train> getDashboard(Model model) {

        return trainService.getAllTrains();
    }

}
