package edu.ejercicios.pizza.especialidades;

import edu.ejercicios.pizza.base.Pizza;
import edu.ejercicios.pizza.base.Topping;

public class PizzaItaliana extends Pizza {
    private String salsa;
    public PizzaItaliana(String name, double price, String salsa, String size,Topping... toppings) {
        super(name, price, size,toppings);
        this.salsa=salsa;
    }
    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }



}
