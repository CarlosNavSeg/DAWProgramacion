public class Cliente {
    public String nombre;
    public String apellido;
    public String nif;
    public String email;
    public String id;
    public Cliente(String nombre, String apellido, String nif, String email, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.email = email;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Cliente [apellido=" + apellido + ", email=" + email + ", id=" + id + ", nif=" + nif + ", nombre="
                + nombre + "]";
    }
    
}
