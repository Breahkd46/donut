package com.donut;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "Donut")
public class DonutService {

    private List<String> donuts = new ArrayList<>();

    @WebMethod
    public boolean deposerUnDonut(String donut) {
        this.donuts.add(donut);
        return true;
    }

    @WebMethod
    public int nombreDonutsDisponibles() {
        return this.donuts.size();
    }

    @WebMethod
    public List<String> recevoirDonuts(int nbDonut) {
        return this.donuts.subList(0, nbDonut);
    }
}
