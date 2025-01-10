package primero;
import javax.swing.JOptionPane;
public class Menu {
    public static void main (String args[]) {
        byte selccion;
        System.out.println("Menu de trabajo");
        selccion=Byte.parseByte(JOptionPane.showInputDialog("""
                                                            Menú:
                                                            1. 
                                                            2.
                                                            3.
                                                            4.
                                                            5.
                                                            6.
                                                            """));
        switch (selccion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default: JOptionPane.showInputDialog("Accion invalida, intente de nuevo");
        }
    }
}
