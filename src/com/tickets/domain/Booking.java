package com.tickets.domain;

public class Booking {
    private Integer userId;
    private Integer PNR;
    private String trainId;
    private Integer noOfSeats;
    private String startStn;
    private String endStn;

    public Booking(Integer userId, Integer PNR, String trainId, Integer noOfSeats, String startStn, String endStn) {
        this.userId = userId;
        this.trainId = trainId;
        this.noOfSeats = noOfSeats;
        this.startStn = startStn;
        this.endStn = endStn;
    }

    public void setPNR(Integer PNR) {
        this.PNR = PNR;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getPNR() {
        return PNR;
    }

    public String getTrainId() {
        return trainId;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public String getStartStn() {
        return startStn;
    }

    public String getEndStn() {
        return endStn;
    }
}
