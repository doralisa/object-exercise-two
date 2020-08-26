# Ejercicio 2 de Programación orientada a objetos. 

Este ejercicio contiene la elaboración de la clase **_Item_**, es nuestra primera práctica colaborativa para el curso de Backend online de **ADA**.


## Colaboradoras.
- Doralys.
- Elizabeth.
- Judit.
- Sandy.

## Clase Item.

Creación de un producto.

```java
Item product = new Item();
```

### Atributos del producto.

- El nombre se encuentra como **name** y es tipo **String**.

- El precio se encuentra como **price** y es tipo **Double**.

- Los impuestos se encuentra como **tax** y es tipo **Double**.

- La fecha de expiración se encuentra como **expirationDate** y es tipo **Date**. 


### Método calculateTax.

Permite calcular el impuesto del producto. Sin retorno.

Uso:

```java 
product.calculateTax();
```
### Método canItBeSold.
Permite identificar si el producto se puede vender con base en su fecha de caducidad. Retorna **TRUE** o **FALSE**.

Uso:
```java
product.canItBeSold();
```

### Método getTotalToPay.
Calcula la cantidad total a pagar incluyendo precio del producto e impuestos. Retorna cantidad total en un **Double**.

```java
product.getTotalToPay();
``` 
