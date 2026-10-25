# Gestor de Tareas CLI (To-Do CLI)

Una aplicación de consola desarrollada en **Java puro** (sin frameworks externos como Spring), diseñada con POO.

---

## 🚀 Características Principales

* **Añadir tareas:** Permite registrar nuevas tareas indicando un título y una descripción, generando un ID secuencial automático.
* **Listar tareas:** Muestra un listado formateado en la consola con el estado actual de cada tarea (`[ ]` pendiente, `[X]` completada).
* **Menú interactivo robusto:** Implementado mediante un bucle `do-while` y la clase `Scanner` para garantizar una experiencia de usuario fluida y controlada en la consola.

---

## 📂 Arquitectura y Estructura del Proyecto

El código está estructurado en clases independientes bajo el principio de responsabilidad única:

1. **`Task.java` (Modelo):** Define la estructura de los datos de la tarea (`id`, `tarea`, `descripcion`, `completado`), incluyendo sus constructores, getters, setters y el formateo mediante `toString()`.
2. **`TaskManager.java` (Lógica de Negocio):** Actúa como el gestor principal. Utiliza un `ArrayList<Task>` para almacenar de forma segura las tareas y expone métodos limpios para añadirlas y listarlas.
3. **`Main.java` (Interfaz de Usuario):** El punto de entrada ejecutable que gestiona el bucle del menú por consola y procesa las opciones elegidas por el usuario.

---

## 💻 Requisitos y Cómo Ejecutarlo

1. **Requisitos:** Tener instalado **Java JDK** (versión 8 o superior).
2. **Ejecución:**
   * Abre el proyecto en tu entorno de desarrollo favorito (como **IntelliJ IDEA**).
   * Localiza y abre la clase `Main.java` dentro del directorio `src/main/java`.
   * Ejecuta el método `main` (puedes usar el botón de *Play* ▶️ de tu IDE).
   * ¡Interactúa con el menú directamente desde tu consola!

---

## 🛠️ Próximas Mejoras (Roadmap)
* Marcar tareas como completadas.
* Eliminar tareas por su ID.
* Persistencia de datos en archivos locales.
