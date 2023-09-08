package edu.ejercicios.pizza.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
private String name;
private double price;
 private List<Topping> toppings = new ArrayList<>();

 public String getTamaño() {
  return tamaño;
 }

 public void setTamaño(String tamaño) {
  this.tamaño = tamaño;
 }

 private String tamaño;

// los tres puntos (...) en el parámetro Topping... toppings del constructor de la clase Pizza tienen
// un significado especial en Java.
// Estos three dots se llaman "spread operator" (operador de dispersión) y permiten pasar un
// conjunto de argumentos variádicos a un método. En este caso, el constructor de la clase Pizza
// espera una lista de objetos Topping, pero en lugar de especificar explícitamente la lista de
// objetos, se utiliza el operador de dispersión para pasar todos los argumentos restantes como una
// lista de objetos Topping.
 public Pizza(String name, double price, String tamaño,Topping... toppings) {
  this.name = name;
 //convertir el price en una funcion que me retorne el valor de la pizza en base a sus ingredientes.
  //private double price;
  this.price = calculatePrice(price,tamaño);
  this.tamaño=tamaño;
   for (Topping topping : toppings) {
   this.toppings.add(topping);
   }
 }

 private double calculatePrice(double basePrice, String tamaño) {
  switch (tamaño.toLowerCase()) {
   case "mediana":
    return basePrice * 1.20;
   case "grande":
    return basePrice * 1.35;
   default:
    return basePrice;
  }
 }
 public void addTopping(Topping topping) {

  this.toppings.add(topping);
 }

 public void removeTopping(int index) {

  this.toppings.remove(index);
 }

 public List<Topping> getToppings() {

 return Collections.unmodifiableList(new ArrayList<>(toppings));
 }

 public String getName() {
 return name;
 }

 public double getPrice() {

  double totalPrice = price;

  for (Topping topping : toppings) {
   totalPrice += topping.getPrice();
  }

  return totalPrice;
 }

 @Override
 public String toString() {
 return "Pizza{" + "name='" + name + '\'' + ", price=" + price + ", toppings=" + toppings + '}';
 }

 public void prepare() {
 System.out.println("Preparando..... " + name);
 System.out.println("Añadiendo ingredientes:");
 for (Topping topping : toppings) {
 System.out.println("- " + topping.getNombre());
 //put 1 seconds delay
 try {
 Thread.sleep(1000);
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 }
 System.out.println("La pizza esta lista");
 }
}
