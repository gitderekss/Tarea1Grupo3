import javax.swing.JOptionPane;

public class Tarea1Grupo3 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema, a continuación, ingrese los datos que se le solicitarán");
        
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        String apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido: ");
        String edad = JOptionPane.showInputDialog(null, "Ingrese su edad: ");
        String email = JOptionPane.showInputDialog(null, "Ingrese su email: ");
        String telefono = JOptionPane.showInputDialog(null, "Ingrese su número de teléfono: ");
    }
}
