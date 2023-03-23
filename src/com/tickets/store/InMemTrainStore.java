package com.tickets.store;

import com.tickets.domain.Train;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InMemTrainStore implements TrainStore {
    private Map<String, Train> trainStore;
    private Map<String, Set<Train>> stationTrainStore;

    public InMemTrainStore(Map<String, Train> trainStore, Map<String, Set<Train>> stationTrainStore) {
        this.trainStore = trainStore;
        this.stationTrainStore = stationTrainStore;
    }

    @Override
    public void save(Train train) {
        if (trainStore.containsKey(train.getTrainId())) {
            throw new RuntimeException("duplicate train Id"); // TODO define runtime exception
        }

        trainStore.put(train.getTrainId(), train);
    }

    @Override
    public Train get(String trainId) {
        if (!trainStore.containsKey(trainId)) {
            throw new RuntimeException("train not found"); // TODO define runtime exception
        }
        return trainStore.get(trainId);
    }

    @Override
    public void saveStation(String station, Train train) {
        stationTrainStore.computeIfAbsent(station, k -> new HashSet<>()).add(train);
    }

    @Override
    public Set<Train> searchTrain(String startStation, String lastStation) {
        Set<Train> startStn = stationTrainStore.getOrDefault(startStation, new HashSet<>());
        Set<Train> endStn = stationTrainStore.getOrDefault(lastStation, new HashSet<>());

        startStn.retainAll(endStn);
        return startStn;
    }
}
