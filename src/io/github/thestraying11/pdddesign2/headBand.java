package io.github.thestraying11.pdddesign2;

import io.github.thestraying11.pdddesign2.data.client;

import java.time.ZonedDateTime;

public class headBand {
    private int price;
    private boolean rented;
    private ZonedDateTime expiryDate;
    private boolean paid;
    private client renter;

    public headBand(int price, boolean rented, ZonedDateTime expiryDate, boolean paid, client renter) {
        this.price = price;
        this.rented = rented;
        this.expiryDate = expiryDate;
        this.paid = paid;
        this.renter = renter;
    }

    public int getPrice() {
        return price;
    }

    public boolean isRented() {
        return rented;
    }

    public ZonedDateTime getExpiryDate() {
        return expiryDate;
    }

    public boolean isPaid() {
        return paid;
    }

    public client getRenter() {
        return renter;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public void setExpiryDate(ZonedDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public void setRenter(client renter) {
        this.renter = renter;
    }
}
