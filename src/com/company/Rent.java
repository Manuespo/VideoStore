package com.company;

import java.time.LocalDate;

public class Rent {
    private Customer customer;
    private Film film;
    private LocalDate date=LocalDate.now();
    private int rentDays;
    private LocalDate dueDate=date.plusDays(rentDays);
    private static final double rentPricePerDay=500;

    public Rent(Customer customer, Film film, int rentDays) {
        this.customer = customer;
        this.film = film;
        this.rentDays = rentDays;
    }

    public Rent() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getRentDays() {
        return rentDays;
    }

    public void setRentDays(int rentDays) {
        this.rentDays = rentDays;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public double payment()
    {
        return rentPricePerDay*rentDays;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "customer=" + customer +
                ", film=" + film +
                ", date=" + date +
                ", rentDays=" + rentDays +
                ", dueDate=" + dueDate +
                '}';
    }
}
