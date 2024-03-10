/**
 * Esta clase representa una calculadora simple que puede realizar operaciones aritméticas básicas.
 */
public class Calculadora {

    /**
     * Constructor de la clase Calculadora que imprime un mensaje recibido como parámetro.
     * @param texto El texto a imprimir.
     */
    public Calculadora(String texto) {
        System.out.println(texto);
    }

    /**
     * Constructor predeterminado de la clase Calculadora.
     */
    public Calculadora() {
    }

    // Variables de instancia para almacenar los números y la opción seleccionada
    private float numero1, numero2;
    private int opc;

    /**
     * Método para realizar la operación de suma.
     * @return El resultado de la suma.
     */
    public float suma() {
        return this.numero1 + this.numero2;
    }

    /**
     * Método para realizar la operación de resta.
     * @return El resultado de la resta.
     */
    public float resta() {
        return this.numero1 - this.numero2;
    }

    /**
     * Método para realizar la operación de multiplicación.
     * @return El resultado de la multiplicación.
     */
    public float multiplicacion() {
        return this.numero1 * this.numero2;
    }

    /**
     * Método para realizar la operación de división.
     * @return El resultado de la división.
     */
    public float division() {
        return this.numero1 / this.numero2;
    }

    /**
     * Método getter para obtener el valor del primer número.
     * @return El valor del primer número.
     */
    public float getNumero1() {
        return this.numero1;
    }

    /**
     * Método setter para establecer el valor del primer número.
     * @param numero1 El valor a establecer para el primer número.
     */
    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    /**
     * Método getter para obtener el valor del segundo número.
     * @return El valor del segundo número.
     */
    public float getNumero2() {
        return this.numero2;
    }

    /**
     * Método setter para establecer el valor del segundo número.
     * @param numero2 El valor a establecer para el segundo número.
     */
    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    /**
     * Método getter para obtener la opción seleccionada.
     * @return La opción seleccionada.
     */
    public int getOpc() {
        return opc;
    }

    /**
     * Método setter para establecer la opción seleccionada.
     * @param opc La opción a establecer.
     */
    public void setOpc(int opc) {
        this.opc = opc;
    }
}
