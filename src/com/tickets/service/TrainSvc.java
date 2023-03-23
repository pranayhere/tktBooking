package com.tickets.service;

import com.tickets.domain.Train;

import java.util.Set;

public interface TrainSvc {
    void save(Train train);
    Train get(String trainId);
    Set<Train> searchTrain(String startStn, String lastStn);
}
