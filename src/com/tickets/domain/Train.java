package com.tickets.domain;

import java.util.List;
import java.util.Objects;

public class Train {
    private String trainId;
    private String startStation;
    private String lastStation;
    private List<String> stations;
    private Integer totalSeats;

    public Train(String trainId, String startStation, String lastStation, List<String> stations, Integer totalSeats) {
        this.trainId = trainId;
        this.startStation = startStation;
        this.lastStation = lastStation;
        this.stations = stations;
        this.totalSeats = totalSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return Objects.equals(trainId, train.trainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainId);
    }

    public String getTrainId() {
        return trainId;
    }

    public String getStartStation() {
        return startStation;
    }

    public String getLastStation() {
        return lastStation;
    }

    public List<String> getStations() {
        return stations;
    }
}
