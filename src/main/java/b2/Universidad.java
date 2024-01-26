package b2;

public class Universidad {
    public class Universidad {

        public static void main(String[] args) {
            Estudiante estudiante = new Estudiante("Mauricio", "Muñoz", 30, 1144162);
            estudiante.setSemestre(1);

            List<Materias> listMaterias = List.of(new Materias("Matematicas"), new Materias("fisica"));

            // List<Materias> listMaterias = new ArrayList<>();
            // listMaterias.add(new Materias("Matematicas"));


            estudiante.setMateriasList(listMaterias);
            System.out.println(estudiante.getNombre());
            estudiante.getMateriasList().stream().forEach(a -> System.out.println(a.nombre));


        }
    }
}
