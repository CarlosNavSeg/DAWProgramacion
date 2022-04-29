package BaseDeDatos;


import javax.swing.JOptionPane;

public class UsuarioInput {
    public static void main(String[] args) {
        String opcion = "";
        do{
        opcion = JOptionPane.showInputDialog("1 Para nuevo usuario, 0 para salir");
        switch(opcion) {
            case "1":
            BaseDeDatos.create();
            break;
            case "0":
            break;
            default:
            JOptionPane.showMessageDialog(null, "Opcion inválida");
            break;
        }
    } while(opcion == "0");
    }
}
