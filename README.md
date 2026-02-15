# DOSW Lab2 - Reto 2

# El Chef de 5 Estrellas

**Implementación del Patrón Builder en Java**

---

# Autores

**Cristian Gonzalez**
**Rafael Moreno**

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
