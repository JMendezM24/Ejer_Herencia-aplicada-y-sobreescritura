# 📘 Práctica Completa de Herencia y Sobrescritura en Java

## 🎯 Objetivo General

Aplicar los conceptos fundamentales de **Programación Orientada a Objetos (POO)** en Java mediante múltiples ejercicios prácticos que incluyen:

* Herencia (`extends`)
* Sobrescritura de métodos (`@Override`)
* Uso de `super`
* Encapsulamiento (`private`, `protected`)
* Polimorfismo
* Organización por packages

---

## 🧠 Conceptos Clave

### 🔹 Herencia

Permite que una clase hija reutilice atributos y métodos de una clase padre.

```java
class Hija extends Padre
```

---

### 🔹 Sobrescritura (`@Override`)

Permite redefinir el comportamiento de un método heredado.

---

### 🔹 Uso de `super`

Se utiliza para:

* Llamar al constructor del padre
* Reutilizar métodos del padre

---

### 🔹 Encapsulamiento

Uso de:

* `private` → acceso restringido
* `protected` → acceso en clases hijas
* Getters y setters → control de datos

---

### 🔹 Polimorfismo

Un mismo método puede comportarse diferente según el objeto.

---

## 📦 Estructura del Proyecto

```
dev/
 └── herencia/
      ├── persona/
      ├── cuenta/
      ├── producto/
      ├── transporte/
      ├── empleado/
      ├── animal/
      ├── vehiculo/
      ├── figura/
      ├── libro/
      └── facturacion/
```

---

# 🧩 Ejercicios Realizados

---

## 1️⃣ Persona, Docente, Estudiante

### ✔ Aplicación

* Herencia desde `Persona`
* Sobrescritura de `mostrar()`

### ✔ Resultado

Cada clase muestra información diferente:

* Persona → nombre, edad
* Docente → + especialidad
* Estudiante → + carnet

---

## 2️⃣ Cuenta y CuentaCorriente

### ✔ Aplicación

* Sobrescritura de `retirar()`

### ✔ Lógica

* Cuenta → permite saldo negativo
* CuentaCorriente → permite sobregiro con límite

---

## 3️⃣ Producto y ProductoPerecedero

### ✔ Aplicación

* Uso de fechas (`LocalDate`)
* Método `estaVencido()`

### ✔ Lógica

* Detecta si un producto está vencido o vigente

---

## 4️⃣ Transporte y Bus

### ✔ Aplicación

* Sobrescritura de `descripcion()`

### ✔ Resultado

* Transporte → capacidad
* Bus → capacidad + ruta

---

## 5️⃣ Empleado y Gerente

### ✔ Aplicación

* Sobrescritura de `calcularSalario()`

### ✔ Lógica

* Empleado → salario base
* Gerente → salario + bono

---

## 6️⃣ Animal y Perro

### ✔ Aplicación

* Polimorfismo puro

### ✔ Resultado

* Animal → sonido genérico
* Perro → sonido específico

---

## 7️⃣ Vehiculo y Moto

### ✔ Aplicación

* Herencia de atributos
* Sobrescritura de `mostrarInfo()`

### ✔ Resultado

* Vehículo → marca, velocidad
* Moto → + cilindrada

---

## 8️⃣ Figura, Rectángulo y Círculo

### ✔ Aplicación

* Sobrescritura de `calcularArea()`

### ✔ Lógica

* Rectángulo → base × altura
* Círculo → π × radio²

---

## 9️⃣ Libro y LibroDigital

### ✔ Aplicación

* Sobrescritura de `mostrarInfo()`

### ✔ Resultado

* Libro → título, autor
* LibroDigital → + tamaño en MB

---

# 🧾 Sistema de Facturación con Herencia en Java

## 🎯 Objetivo

Aplicar los conceptos de **Programación Orientada a Objetos (POO)** en Java, específicamente:

* Herencia
* Sobrescritura de métodos (`@Override`)
* Uso de `super`
* Encapsulamiento
* Validaciones de lógica real

---

## 🧠 Conceptos aplicados

### 🔹 Herencia

Se utilizó una clase base `Factura`, de la cual heredan:

* `FacturaContado`
* `FacturaCredito`

Esto permite reutilizar atributos y métodos comunes.

---

### 🔹 Sobrescritura de métodos (`@Override`)

Se sobrescribieron los siguientes métodos:

* `calcularTotal()`

  * En `FacturaContado`: aplica descuento
  * En `FacturaCredito`: aplica recargo

* `mostrarInfo()`

  * En `FacturaCredito`: agrega información adicional (recargo y cuotas)

---

### 🔹 Uso de `super`

Se utilizó para:

* Llamar al constructor de la clase padre:

  ```java
  super(numero, cliente, total);
  ```
* Reutilizar métodos:

  ```java
  super.mostrarInfo();
  ```

---

### 🔹 Encapsulamiento

* Atributos privados en `Cliente`
* Uso de getters (`getNombre()`, `getNit()`)
* Validación en `setTotal()` para evitar valores negativos

---


## 🧪 Casos de prueba

### ✅ Caso 1: Factura al contado

* Total: Q500
* Descuento: Q50
* Resultado esperado: Q450

---

### ✅ Caso 2: Factura a crédito

* Total: Q500
* Recargo: Q100
* Cuotas: 6
* Resultado esperado: Q600

---

### ✅ Caso 3: Validación de total negativo

* Total: Q50
* Descuento: Q100
* Resultado esperado: Q0 (no permite negativos)

---

## ▶️ Ejecución

Ejemplo de salida en consola:

```
=== FACTURA CONTADO ===
Factura No: 1
Cliente: Daniel
NIT: 123456-7
Total: Q450.0

=== FACTURA CRÉDITO ===
Factura No: 2
Cliente: Ana
NIT: 987654-3
Total: Q600.0
Recargo: Q100.0
Cuotas: 6

=== VALIDACIÓN (NO NEGATIVO) ===
Factura No: 3
Cliente: Luis
NIT: 111111-1
Total: Q0.0
```

---


## 🎯 Conclusión

Este conjunto de ejercicios demuestra:

* Cómo estructurar proyectos en Java usando **packages**
* Cómo reutilizar código mediante **herencia**
* Cómo adaptar comportamientos con **sobrescritura**
* Cómo aplicar lógica real en sistemas simples
* Cómo escribir código más limpio, organizado y mantenible

---

## 🚀 Nivel Alcanzado

Al completar estos ejercicios, se domina:

✔ POO básica e intermedia
✔ Diseño de clases
✔ Reutilización de código
✔ Lógica aplicada

---

## 👨‍💻 Autor

Proyecto académico de práctica en Java enfocado en Herencia y Sobrescritura.
