# Gestor de Reservas

## Descripción

Este proyecto es una aplicación de consola (CLI) desarrollada en Java para gestionar las reservas de una peluquería.

Permite:

- Agendar una reserva.
- Listar las reservas del día.
- Cancelar una reserva.
- Ver el reporte de citas y dinero facturado.
- Salir del programa.

## Tecnologías utilizadas

- Java
- Visual Studio Code
- Git
- GitHub

## Estructura del proyecto

El proyecto está organizado en cuatro clases:

- **App.java**: contiene el método `main` y controla el menú principal.
- **Menu.java**: muestra el menú y lee la opción del usuario.
- **Validador.java**: valida nombres, horas y servicios.
- **Operaciones.java**: administra las reservas, el reporte y las cancelaciones.

## Reglas del sistema

- El horario permitido es de 8:00 a 17:00.
- No se permiten dos reservas en la misma hora.
- El nombre del cliente no puede estar vacío.
- Solo existen tres servicios:
  - Corte de cabello
  - Tinte
  - Manicure
- El sistema tiene un cupo máximo de reservas.

## Cómo ejecutar el proyecto

1. Clonar el repositorio:

```bash
git clone URL_DEL_REPOSITORIO
```

2. Entrar a la carpeta del proyecto.

3. Compilar los archivos:

```bash
javac *.java
```

4. Ejecutar la aplicación:

```bash
java App
```

## Autora

Angelica Saenz