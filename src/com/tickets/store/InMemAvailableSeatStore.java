package com.tickets.store;

import com.tickets.domain.Train;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemAvailableSeatStore implements AvailableSeatsStore {

    private Map<Train, Map<String, Integer>> stationSeatsStore;

    public InMemAvailableSeatStore(Map<Train, Map<String, Integer>> stationSeatsStore) {
        this.stationSeatsStore = stationSeatsStore;
    }

    @Override
    public void createSeats(Train train, String station) {
        if (!stationSeatsStore.containsKey(train)) {
            stationSeatsStore.put(train, new HashMap<>());
        }

        Map<String, Integer> seatsStation = stationSeatsStore.get(train);
        seatsStation.put(station, 0);
    }

    public boolean allocateSeats(Train train, List<String> stations, Integer seats) {
        for (String station: stations) {
//            if () {
//
//            }
        }
        return false;
    }
}
