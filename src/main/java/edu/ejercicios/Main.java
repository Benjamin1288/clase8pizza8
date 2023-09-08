package edu.ejercicios;

import edu.ejercicios.pizza.Interfaces.PizzaBase;
import edu.ejercicios.pizza.base.Pizza;
import edu.ejercicios.pizza.base.Topping;
import edu.ejercicios.pizza.especialidades.*;

public class Main {
    public static void main(String[] args) {


        //Ejercicio 1
        //Pizza pizza=new Pizza("Pizza Margarita",60.00);
        //pizza.addTopping(new Topping("Tomato",20));
        //pizza.addTopping(new Topping("Mozzarella",20));
        //pizza.addTopping(new Topping("Basil",20));
        //System.out.println("Precio: "+pizza.getPrice());
        //pizza.prepare();

        //PizzaItaliana it = new PizzaItaliana("Mar",20.00,"tomate");
        //it.addTopping(new Topping("ricura"));
        //it.addTopping(new Topping("sabrosura"));
        //it.prepare();

        //PizzaItaliana pizza2=new PizzaItaliana("Pizza Margarita",10.00,"Tou isl");
        //pizza2.addTopping(new Topping("Tomato",20));
        //pizza2.addTopping(new Topping("Mozzarella",20));
        //pizza2.addTopping(new Topping("Basil",20));
        //pizza.prepare();
        //System.out.println("This is the Salsa:"+pizza.getSalsa());

        //PizzaBase pum=new PizzaBase("Peperoni",20.00);
        //pum.prepare();


        Topping pepperoni = new Topping("Pepperoni", 2.0);
        Topping carnes = new Topping("5 carnes", 1.5);
        Topping cebolla = new Topping("Cebolla", 1.0);
        Topping Tomate = new Topping("Tomate", 1.5);
        Topping Champiñones = new Topping("Champiñones", 2.0);
        Topping chile = new Topping("Chile", 0.5);
        Topping queso = new Topping("Queso", 5.0);
        Topping piña = new Topping("Piña", 2.0);
        Topping jamon = new Topping("Jamon", 1.0);


        // Preparar las pizzas

        PizzaChurrasco chum1=new PizzaChurrasco("Churrasco",15.0,"pequeña",chile,cebolla,queso,Champiñones);
        PizzaCincoCarnes chum2=new PizzaCincoCarnes("5 Carnes",25.0,"mediana",carnes,queso);
        PizzaHawaiana chum3=new PizzaHawaiana("Hawaina",35,"grande",piña,queso,jamon);
        PizzaPeperoni chum4=new PizzaPeperoni("Peperoni",15,"pequeña",pepperoni,queso);

        // Imprimir información sobre las pizzas
        chum1.prepare();
        System.out.println("----------------------------");
        chum2.prepare();
        System.out.println("----------------------------");
        chum3.prepare();
        System.out.println("----------------------------");
        chum4.prepare();
        System.out.println("----------------------------");

        System.out.println("Pizza Churrasco: Q"+chum1.getPrice());
        System.out.println("Pizza 5 Carnes: Q"+chum2.getPrice());
        System.out.println("Pizza Hawaina: Q"+chum3.getPrice());
        System.out.println("Pizza Peperoni: Q"+chum4.getPrice());

    }
}