package ar.com.ada.online.second.exercisetwo;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Date;

public class Item {
    String name;
    Double price;
    Double tax;
    Date expirationDate;
    Date today = new Date();
    Double result;

    Double getTotalToPay() {
        result = this.price + this.tax;
        return result;
    }

    void calculateTax() {
        tax = 0.5 * price;
    }

    Boolean canItBeSold() {
        if (expirationDate.compareTo(today)>0) {
            System.out.println("Nombre: " + name  + "\n" + "Precio: " + price + "\n" + "Impuesto: " + tax + "\n" + "Total a pagar: " + result);
            return Boolean.TRUE;
        } else {
            System.out.println("Este Ítem no está habilitado para la venta");
            return Boolean.FALSE;
        }

    }

}
