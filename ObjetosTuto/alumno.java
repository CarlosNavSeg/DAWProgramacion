

class alumno {
    private String nombre;
    private int id_alu;
    private String grupo;
    static int contadoralumnos = 0;

    public alumno (int id_alu, String grupo) {
        nombre = "Pepito Antonio";
        contadoralumnos++;

    }

    public alumno (String nombre, String grupo) {
        id_alu = 172211888;
        contadoralumnos++;
        
    }

    public alumno (String nombre, int id_alu) {
        grupo = "1Bach";
        contadoralumnos++;
    }

    public alumno(String nombre, int id_alu, String grupo) {
        this.nombre = nombre;
        this.id_alu = id_alu;
        this.grupo = grupo;
        contadoralumnos++;
    }


    static int informealumno() {
        return contadoralumnos;
    }

    static void informealumnos(alumno [] alumnos) {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i].nombre + ", " + alumnos[i].grupo + ", " + alumnos[i].id_alu);
        }
    }
    
    public void preguntarDuda() {
        System.out.println(nombre + " levanta la mano.");
    }
}
