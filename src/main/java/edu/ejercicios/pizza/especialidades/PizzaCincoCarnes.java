package edu.ejercicios.pizza.especialidades;

import edu.ejercicios.pizza.base.Pizza;
import edu.ejercicios.pizza.base.Topping;

public class PizzaCincoCarnes extends Pizza {
    public PizzaCincoCarnes(String name, double price, String tamañ, Topping... toppings) {
        super(name, price, tamañ, toppings);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Los ingredientes fueron agregados a la pizza de 5 carnes");
    }
}
