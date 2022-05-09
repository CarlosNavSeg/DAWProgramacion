package Control04;


public class Cliente extends Persona {
    protected int id;
    protected String email;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return this.email +"\t"+ this.id +"\n"+this.apellidos+"\t"+this.nombre+"\n"+this.nif;
    }

    public Cliente(String nombre, int id, String apellidos, String nif, String email) {
        this.nombre = nombre;
        this.id = id;
        this.apellidos = apellidos;
        this.nif = nif;
        this.email = email;
    }
     
}
