package edu.ejercicios.pizza.especialidades;

import edu.ejercicios.pizza.base.Pizza;
import edu.ejercicios.pizza.base.Topping;

public class PizzaHawaiana extends Pizza {
    public PizzaHawaiana(String name, double price, String tamaño, Topping... toppings) {
        super(name, price, tamaño, toppings);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Los ingredientes fueron agregados a la pizza de hawaiana.");
    }
}

