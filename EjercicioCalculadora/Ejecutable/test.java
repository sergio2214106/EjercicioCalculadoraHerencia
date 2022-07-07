package Ejecutable;

import javax.swing.JOptionPane;

import clases.Division;
import clases.Multiplicacion;
import clases.Operacion;
import clases.Resta;
import clases.Suma;

public class test 
{
 public static void main(String[] args)
 {
    double x= Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));
    double y= Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));

    //Creacion objeto suma

    Suma miSuma= new Suma(x,y);
    miSuma.Sumar();
    JOptionPane.showMessageDialog(null, "La suma de " + x + " y " + y + " es: " + miSuma.mostrarResultado());

    Division miDivision= new Division(x,y);
    miDivision.Dividir();
    JOptionPane.showMessageDialog(null, "La division de " + x + " y " + y + " es: " + miDivision.mostrarResultado());

    Multiplicacion miMultiplicacion= new Multiplicacion(x,y);
    miMultiplicacion.Multiplicar();
    JOptionPane.showMessageDialog(null, "La multiplicacion de " + x + " y " + y + " es: " + miMultiplicacion.mostrarResultado());

    Resta miResta= new Resta(x,y);
    miResta.Restar();
    JOptionPane.showMessageDialog(null, "La resta de " + x + " y " + y + " es: " + miResta.mostrarResultado());
    

 }
}
