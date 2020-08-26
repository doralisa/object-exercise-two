package ar.com.ada.online.second.exercisetwo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Item product = new Item();

        Scanner keyboard = new Scanner(System.in);

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Ingrese el producto a comprar: ");
        product.name = keyboard.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        product.price = keyboard.nextDouble();

        System.out.print("Ingrese la fecha de vencimiento: ");
        String dateString = keyboard.next();
        product.expirationDate = df.parse(dateString);

        product.calculateTax();

        product.getTotalToPay();

        product.canItBeSold();

    }
}
