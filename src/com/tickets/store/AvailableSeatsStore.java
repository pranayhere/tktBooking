package com.tickets.store;

import com.tickets.domain.Train;

public interface AvailableSeatsStore {
    void createSeats(Train train, String station);
}
