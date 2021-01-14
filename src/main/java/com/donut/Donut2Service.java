package com.donut;

import generated.donut2service.Donut2;
import generated.donut2service.ListOfDonuts;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "Donut2")
public class Donut2Service implements Donut2 {

    private final List<String> donuts = new ArrayList<>();

    @Override
    public boolean deposerDonut(String in) {
        this.donuts.add(in);
        return true;
    }

    @Override
    public int donutDispo() {
        return donuts.size();
    }

    @Override
    public ListOfDonuts recevoirDonut(int number) {
        ListOfDonuts listOfDonuts = new ListOfDonuts();
        List<String> respDonut = listOfDonuts.getDonut();
        respDonut = this.donuts.subList(0, number);
        return listOfDonuts;
    }

}
