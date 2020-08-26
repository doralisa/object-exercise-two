# Ejercicio 2 de Programación orientada a objetos. 

Este ejercicio contiene la elaboración de la clase **_Item_**, es nuestra primera práctica colaborativa para el curso de Backend online de **ADA**.

## Enunciado de la práctica:

Crear una clase en base el diagrama UML siguiente:

![Aquí la descripción de la imagen por si no carga](https://github.com/doralisa/object-exercise-two/blob/feature/Sandy/classimage.png)

Con base a esa clase, crear un programa que permita a un usuario crear un Item con los datos necesarios y con base a estos, el programa debe mostrar la siguiente salida por terminal:

```bash
- Nombre: xxxx
- Precio: xxxx
- Impuesto: xxxx
- Total a pagar: xxxx
```

Esto solo se debe mostrar si la fecha de vencimiento aun es valida, en caso contrario, se debe mostrar un texto que diga: 

```bash
Este Ítem no está habilitado para la venta
```
**_Nota: El usuario solo debe ingresar los datos para el nombre del ítem, el precio y la
fecha de vencimiento. El impuesto y el total a pagar se deben calcular en los métodos
de la clase._**

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

## Colaboradoras.
- Doralys.
- Elizabeth.
- Judit.
- Sandy.

