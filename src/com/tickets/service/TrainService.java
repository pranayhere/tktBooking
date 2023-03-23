package com.tickets.service;

import com.tickets.domain.Train;
import com.tickets.store.TrainStore;

import java.util.Set;

public class TrainService implements TrainSvc {
    private TrainStore store;

    public TrainService(TrainStore store) {
        this.store = store;
    }

    @Override
    public void save(Train train) {
        store.save(train);

        for (String stn: train.getStations()) {
            store.saveStation(stn, train);
        }
    }

    @Override
    public Train get(String trainId) {
        return store.get(trainId);
    }

    @Override
    public Set<Train> searchTrain(String startStn, String lastStn) {
        return store.searchTrain(startStn, lastStn);
    }
}
