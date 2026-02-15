# 👨‍💻 Autores

Cristian Gonzalez
Rafael Moreno


---
# Tienda Don Pepe - Sistema de Ventas

## Implementación usando Factory Method, Streams y principios SOLID en Java

---

# Descripción del Proyecto

Este proyecto consiste en el desarrollo de un sistema de ventas para la tienda **Don Pepe**, el cual permite:

* Agregar productos a un carrito de compras
* Calcular el subtotal
* Aplicar descuentos según el tipo de cliente
* Generar un recibo de compra

El sistema fue desarrollado aplicando:

* Patrón de diseño **Factory Method**
* **Streams de Java**
* Principios **SOLID**
* **Encapsulamiento**
* **Polimorfismo**
* **Inmutabilidad**

---

# Patrón de Diseño Usado: Factory Method

El patrón **Factory Method** se utiliza para crear los objetos de tipo `Cliente` sin que el programa principal dependa directamente de las clases concretas.

# Aplicación de Principios SOLID

---

## S — Single Responsibility Principle

Cada clase tiene una única responsabilidad:

| Clase          | Responsabilidad    |
| -------------- | ------------------ |
| Producto       | Datos del producto |
| Cliente        | Tipo de cliente    |
| ClienteFactory | Crear clientes     |
| Carrito        | Manejar compras    |
| Recibo         | Generar recibo     |

---

## O — Open Closed Principle

El sistema es abierto a extensión y cerrado a modificación.

Se puede agregar:

```java
ClienteVIP
```

Sin modificar el código existente.

---

## L — Liskov Substitution Principle

Se puede usar cualquier tipo de cliente sin romper el sistema:

```java
Cliente cliente = new ClienteFrecuente();
```

---

## I — Interface Segregation Principle

La clase Cliente solo tiene el método necesario:

```java
getDescuento()
```

No tiene métodos innecesarios.

---

## D — Dependency Inversion Principle

El sistema depende de abstracciones:

```java
Cliente cliente;
```

No depende de clases concretas.

# Estructura del Proyecto

```
ProyectoDonPepe

│
|
├── src
    ├──Reto1
        ├──.java

├── gitignore
|
├── UML.png
|
└── README.md
```