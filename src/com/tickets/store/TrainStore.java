package com.tickets.store;

import com.tickets.domain.Train;

import java.util.Set;

public interface TrainStore {
    void save(Train train);
    Train get(String trainId);
    void saveStation(String station, Train train);
    Set<Train> searchTrain(String startStation, String lastStation);
}
