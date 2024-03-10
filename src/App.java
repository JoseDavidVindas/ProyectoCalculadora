import javax.swing.JOptionPane;

/**
 * Esta clase contiene un programa simple que actúa como una calculadora básica, permitiendo al usuario realizar operaciones aritméticas simples.
 */
public class App {

    /**
     * El método principal que ejecuta el programa.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {

        // Crear un objeto Calculadora
        Calculadora objCalculadora = new Calculadora();

        // Ciclo para permitir al usuario realizar múltiples operaciones hasta que decida salir
        do {

            // Solicitar al usuario que seleccione una operación
            objCalculadora.setOpc(Integer.parseInt(JOptionPane.showInputDialog("1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\n0.Salir\nSeleccione una opcion:")));

            // Realizar la operación seleccionada por el usuario
            switch (objCalculadora.getOpc()) {

                case 1:
                    // Solicitar al usuario que ingrese dos números para realizar la suma
                    objCalculadora.setNumero1(Float.parseFloat(JOptionPane.showInputDialog(
                            null, "Ingrese numero 1")));

                    objCalculadora.setNumero2(Float.parseFloat(
                            JOptionPane.showInputDialog(
                                    null, "Ingrese numero 2")));
                    // Mostrar el resultado de la suma
                    JOptionPane.showMessageDialog(null, objCalculadora.suma());
                    break;
                case 2:
                    // Solicitar al usuario que ingrese dos números para realizar la resta
                    objCalculadora.setNumero1(Float.parseFloat(
                            JOptionPane.showInputDialog(
                                    null, "Ingrese numero 1")));

                    objCalculadora.setNumero2(Float.parseFloat(
                            JOptionPane.showInputDialog(
                                    null, "Ingrese numero 2")));
                    // Mostrar el resultado de la resta
                    JOptionPane.showMessageDialog(null, objCalculadora.resta());
                    break;
                case 3:
                    // Solicitar al usuario que ingrese dos números para realizar la multiplicación
                    objCalculadora.setNumero1(Float.parseFloat(
                            JOptionPane.showInputDialog(
                                    null, "Ingrese numero 1")));

                    objCalculadora.setNumero2(Float.parseFloat(
                            JOptionPane.showInputDialog(
                                    null, "Ingrese numero 2")));
                    // Mostrar el resultado de la multiplicación
                    JOptionPane.showMessageDialog(null, objCalculadora.multiplicacion());
                    break;
                case 4:
                    // Solicitar al usuario que ingrese dos números para realizar la división
                    objCalculadora.setNumero1(Float.parseFloat(
                            JOptionPane.showInputDialog(
                                    null, "Ingrese numero 1")));

                    objCalculadora.setNumero2(Float.parseFloat(
                            JOptionPane.showInputDialog(
                                    null, "Ingrese numero 2")));
                    // Mostrar el resultado de la división
                    JOptionPane.showMessageDialog(null, objCalculadora.division());
                    break;
                case 0:
                    // Mostrar un mensaje de despedida cuando el usuario decide salir
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;

                default:
                    // Mostrar un mensaje de error si el usuario ingresa una opción incorrecta
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, intenta de nuevo");
                    break;

            }

        } while (objCalculadora.getOpc() != 0); // El ciclo se repite hasta que el usuario elija salir

    }

}
