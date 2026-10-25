import java.util.ArrayList;
import java.util.List;

    public class TaskManager {

        private List<Task> tasks;

        // Constructor: Inicializa la lista vacía cuando arranca el programa
        public TaskManager() {
            this.tasks = new ArrayList<>();
        }

        // Método para añadir una nueva tarea
        public void addTask(String tarea, String descripcion) {
            int id = tasks.size() + 1; // El ID se genera automáticamente según cuántas tareas haya
            Task newTask = new Task(id, tarea, descripcion);
            tasks.add(newTask);
            System.out.println("¡Tarea añadida con éxito!");
        }

        // Método para listar todas las tareas
        public void listTasks() {
            if (tasks.isEmpty()) {
                System.out.println("No hay tareas registradas todavía.");
            } else {
                System.out.println("\n--- LISTA DE TAREAS ---");
                for (Task t : tasks) {
                    System.out.println(t);
                }
            }
        }
    }
