import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        int option = 0;

        //Bucle: El menú se repite hasta que el usuario selecciona salir (op3)
        do {
            System.out.println("\n--- GESTOR DE TAREAS (TO-DO CLI) ---");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            if (scanner.hasNextInt()){
                option = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada

                switch (option) {

                    case 1:
                        System.out.print("Introduce el título de la tarea: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Introduce la descripción: ");
                        String descripcion = scanner.nextLine();
                        manager.addTask(titulo, descripcion);
                        break;

                    case 2:
                        manager.listTasks();
                        break;

                    case 3:
                        System.out.println("Saliendo del programa");
                        break;

                    default:
                        System.out.println("Opción no valida. Por favor elige 1, 2 o 3");
                }
            } else {
                System.out.println("Por favor introduce un número válido");
                scanner.next(); //Limpia la entrada incorrecta.
            }
        } while (option != 3);

        scanner.close();

    }
}


