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

---

# DOSW Lab2 - Reto 2

# El Chef de 5 Estrellas

**Implementación del Patrón Builder en Java**

---

# Descripcion

En el desarrollo de software es importante utilizar patrones de diseño que permitan construir objetos complejos paso a paso.

En este laboratorio se implementó un sistema que permite a un Chef preparar hamburguesas personalizadas según los ingredientes seleccionados por el cliente.

Para ello se utilizó el patrón de diseño **Builder**, el cual pertenece a la categoría de patrones creacionales.

Este patrón permite crear objetos complejos paso a paso sin necesidad de múltiples constructores.

---

# Patrón Utilizado

**Builder**

---

# Justificación

Se utilizó el patrón Builder porque la hamburguesa es un objeto complejo que puede construirse paso a paso.

Este patrón permite:

* Agregar ingredientes progresivamente
* Crear diferentes tipos de hamburguesas
* Evitar constructores complejos

---

# Cómo se Aplicó el Patrón

Se implementaron las siguientes clases:

| Clase              | Rol        |
| ------------------ | ---------- |
| Hamburguesa        | Producto   |
| HamburguesaBuilder | Builder    |
| Chef               | Director   |
| Ingrediente        | Componente |

El proceso:

1. El Builder agrega ingredientes
2. El Chef construye la hamburguesa
3. Se genera el objeto final

Ejemplo:

```java
HamburguesaBuilder builder = new HamburguesaBuilder();

builder.agregarIngrediente(pan);

Hamburguesa hamburguesa = builder.build();

---

# Ventajas del Patrón Builder

Permite:

* Construir objetos paso a paso
* Crear diferentes combinaciones
* Mejor organización
* Fácil mantenimiento

```
# Estructura del Proyecto

```
El chef de 5 estrellas
│
|
├── src
    ├──Reto2
        ├──.java

├── gitignore
|
├── UML.png
|
└── README.md
```