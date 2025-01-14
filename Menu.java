package primero;
import javax.swing.JOptionPane;  // Importar un paquete
import programasPrimero.*; // Importar que importa un paquete

public class Menu {
    public static void main (String args[]) {
        byte selccion;
        String nombre;
        System.out.println("Menu de trabajo");
        selccion=Byte.parseByte(JOptionPane.showInputDialog("""
                                                               "Menú de programas"
                                                             1. Bienvenida
                                                             2. Area y volumen de un cilindro
                                                             3. Notas de calificaciones
                                                             4. Calcula la hipotenusa
                                                             5. Par o impar
                                                             6. Cual es el mayor
                                                             7. Numero mayor
                                                             8. Veerinaria PATITAS
                                                             9. Hospital
                                                            10. calificacion de Unidades
                                                            11. Calificacioes en una tabla
                                                            12. Ventas del mes
                                                            13. 
                                                            14. 
                                                            15.
                                                            Ingresa el numero del programa
                                                            """));
        switch (selccion) {
            case 1 -> {
                nombre=JOptionPane.showInputDialog("Ingresa tu nombre completo");
                // Creando un objeto que se llama "obj" para mandar llamar a los metodos
                // Que estan dentro de la clase "Bienenido"
                Bienvenida obj = new Bienvenida();
                obj.mensajeDespedida(nombre);
            }
            case 2 -> {
                System.out.println("Calcula el area y el volumen de un cilindro");
                U1_AreaVolumen arv = new U1_AreaVolumen();
                arv.AreaVolumen(args);
            }
            case 3 -> {
                System.out.println("Calificaciones");
                U1_Calificaciones notas = new U1_Calificaciones();
                notas.calificaciiones(args);
            }
            case 4 -> {
                System.out.println("Calcula la hipotenusa");
                U1_Hipotenusa hipo = new U1_Hipotenusa();
                hipo.hipotenusa(args);
            }
            case 5 -> {
                System.out.println("Es par o impar");
                U1_Par_o_Impar par = new U1_Par_o_Impar();
                par.parImpar(args);
            }
            case 6 -> {
                System.out.println("El mayor de tres");
                U1_TresNumerosMayor orden = new U1_TresNumerosMayor();
                orden.ordenNumero(args);
            }
            case 7 -> {
                System.out.println("Cual es el mayor");
                U1_numeroMayor may = new U1_numeroMayor();
                may.mayor(args);
            }
            case 8 -> {
                System.out.println("Veterinaria PATITAS");
                U3_Veterinaria vete = new U3_Veterinaria();
                vete.veteri(args);
            }
            case 9 -> {
                System.out.println("Hospital EL MERTO");
                U3_Hospital hos = new U3_Hospital();
                hos.hospo(args);
            }
            case 10 -> {
                System.out.println("Calificacion por unida");
                U3_CalificacionesFor cal = new U3_CalificacionesFor();
                cal.cali(args);
            }
            case 11 -> {
                System.out.println("Calificacioes en una tabla");
                U4_CalificaArray cali = new U4_CalificaArray();
                cali.califi(args);
            }
            case 12 -> {
                System.out.println("Ventas del mes");
                U4_VentasMes ventt = new U4_VentasMes();
                ventt.venta(args);
            }
            case 13 -> {
                
            }
            case 14 -> {
                
            }
            case 15 -> {
                
            }
            case 16 -> {
                
            }
            case 17 -> {
                
            }
            
            default -> JOptionPane.showInputDialog("Accion invalida, intente de nuevo");
        }
    }
}
