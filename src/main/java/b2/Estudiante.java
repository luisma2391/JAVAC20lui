package b2;

public class Estudiante {
    public Estudiante(){
    }

    public Estudiante(String nombre,String apellido,int edad, int id){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.id=id;
    }
    public Estudiante(String nombre,String apellido, int id){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.id=id;
    }

    public Estudiante(String nombre, String apellido, int edad, int id, List<Materias> materiasList, int semestre, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
        this.materiasList = materiasList;
        this.semestre = semestre;
        this.carrera = carrera;
    }

    private String nombre;
    private String apellido;
    private int edad;
    private int id;
    private List<Materias> materiasList;
    private int semestre;
    private String carrera;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }



    public List<Materias> getMateriasList() {
        return materiasList;
    }

    public void setMateriasList(List<Materias> materiasList) {
        this.materiasList = materiasList;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
}
