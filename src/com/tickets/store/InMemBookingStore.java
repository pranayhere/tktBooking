package com.tickets.store;

//Map<PNR, Booking>
//Map<TrainID, Map<Stn, Seats>>

import com.tickets.domain.Booking;
import com.tickets.domain.Train;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class InMemBookingStore implements BookingStore {
    private Map<String, Booking> bookingStore;

    public InMemBookingStore(Map<String, Booking> bookingStore) {
        this.bookingStore = bookingStore;
    }

    @Override
    public void save(Booking booking) {
        bookingStore.put(getPNR(), booking);
    }

    @Override
    public void allocateSeat(Train train, String stn, Integer seats) {

    }

    @Override
    public Booking getByPNR(String pnr) {
        return bookingStore.get(pnr);
    }

    private String getPNR() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 5) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}
