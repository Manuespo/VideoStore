package com.company;

import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Film> films=new ArrayList<Film>();
    private ArrayList<Customer> customers=new ArrayList<Customer>();
    private ArrayList<Rent> rents=new ArrayList<Rent>();


    public void addFilm(String title, String creationDate, int duration, int classification, String country, String description, Category category, int stock)
    {
        films.add(new Film(title,creationDate,duration,classification,country,description,category,stock));
    }
    public void addCustomer(String name, int phoneNumber, String address)
    {
        customers.add(new Customer(name,phoneNumber,address));
    }
    public void rentByTitle(String title,String name, int phoneNumber, String address)
    {
        for (Film film:
             films) {
            if (title.equals(film.getTitle()))
            {
                if (film.getStock()>0)
                {
                    film.setStock(film.getStock()-1);
                    if (findCustomer(new Customer(name,phoneNumber,address)));


                }
                else
                    System.out.println("No more in Stock");

            }
            
        }
    }
    public boolean findCustomer(Customer customerToSearch)
    {
        boolean founded=false
        for (Customer customer: customers) {
            if (customer.equals(customerToSearch)) {
                founded=true;
            }
        }
        return founded;
    }



}
