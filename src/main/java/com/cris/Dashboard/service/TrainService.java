package com.cris.Dashboard.service;

import com.cris.Dashboard.model.Train;
import com.cris.Dashboard.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {

    @Autowired
    private TrainRepository trainRepository;

    public List<Train> getAllTrains() {
        return trainRepository.getAllTrains();
    }
}
