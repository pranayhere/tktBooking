package com.tickets.store;

import com.tickets.domain.Booking;
import com.tickets.domain.Train;

public interface BookingStore {
    void save(Booking booking);
    void allocateSeat(Train train, String stn, Integer seats);
    Booking getByPNR(String pnr);
}
