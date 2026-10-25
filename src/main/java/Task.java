public class Task {

    private int id;
    private String tarea;
    private String descripcion;
    private boolean completado;

    public Task(int id, String tarea, String descripcion) {
        this.id = id;
        this.tarea = tarea;
        this.descripcion = descripcion;
        this.completado = false; //la tarea por defecto no comienza no completada
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", tarea='" + tarea + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", completado=" + completado +
                '}';
    }
}
