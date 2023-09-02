package edu.ejercicios;

import edu.ejercicios.pizza.Interfaces.PizzaBase;
import edu.ejercicios.pizza.base.Pizza;
import edu.ejercicios.pizza.base.Topping;
import edu.ejercicios.pizza.especialidades.PizzaItaliana;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        Pizza pizza=new Pizza("Pizza Margarita",60.00);
        pizza.addTopping(new Topping("Tomato",20));
        pizza.addTopping(new Topping("Mozzarella",20));
        pizza.addTopping(new Topping("Basil",20));
        System.out.println("Precio: "+pizza.getPrice());
        //pizza.prepare();

        //PizzaItaliana it = new PizzaItaliana("Mar",20.00,"tomate");
        //it.addTopping(new Topping("ricura"));
        //it.addTopping(new Topping("sabrosura"));
        //it.prepare();

        PizzaItaliana pizza2=new PizzaItaliana("Pizza Margarita",10.00,"Tou isl");
        pizza2.addTopping(new Topping("Tomato",20));
        pizza2.addTopping(new Topping("Mozzarella",20));
        pizza2.addTopping(new Topping("Basil",20));
        //pizza.prepare();
        //System.out.println("This is the Salsa:"+pizza.getSalsa());

        PizzaBase pum=new PizzaBase("Peperoni",20.00);
        //pum.prepare();

    }
}