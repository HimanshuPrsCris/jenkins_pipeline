package com.cris.Dashboard.repository;

import com.cris.Dashboard.model.Train;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TrainRepository {

    public List<Train> getAllTrains() {
        List<Train> trains = new ArrayList<>();

        // Sample data, you can replace this with actual data or database queries.
        Train train1 = new Train();
        train1.setTrainNumber("12001");
        train1.setTrainName("Shatabdi Express");
        train1.setSourceStation("New Delhi");
        train1.setDestinationStation("Lucknow");
        train1.setArrivalTime("10:00 AM");
        train1.setDepartureTime("10:30 AM");

        Train train2 = new Train();
        train2.setTrainNumber("15001");
        train2.setTrainName("Rajdhani Express");
        train2.setSourceStation("New Delhi");
        train2.setDestinationStation("Mumbai");
        train2.setArrivalTime("5:00 PM");
        train2.setDepartureTime("5:30 PM");

        trains.add(train1);
        trains.add(train2);

        return trains;
    }
}
