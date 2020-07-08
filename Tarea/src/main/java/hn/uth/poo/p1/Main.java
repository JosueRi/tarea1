/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner teclado=new Scanner(System.in);
    String Cliente, seguir="S";
    int Identidad,TipoProducto, Contador=0;
    double NumeroCuenta=0,MontoApertura=0,BonoRegalo=0,MontoFinal=0, resultado=0, MontoTotal=0;
        try {
            do {
        System.out.println("Ingrese el numero de identidad");
        Identidad = teclado.nextInt();
        System.out.println("Ingrese el nombre del cliente");
        Cliente = teclado.next();
        System.out.println("Ingrese el numero de cuenta");
        NumeroCuenta = teclado.nextInt();
        System.out.println("Ingrese el monto de apertura");
        MontoApertura = teclado.nextDouble();
        System.out.println("Tipo de Producto: ");
        System.out.println("1) Ahorro.");
        System.out.println("2) Cheque.");
        System.out.println("3) Bonos.");
        System.out.println("4) Certificado de Deposito.");
        System.out.println("Que tipo de producto desea:");
        TipoProducto = teclado.nextInt();
        switch (TipoProducto) {
            case 1:
                if (MontoApertura>100) {
                    BonoRegalo = 1;
                }
                break;
            case 2:
                if (MontoApertura>10000) {
                    BonoRegalo = 10;
                }
                break;
            case 3:
                if (MontoApertura>100000) {
                    BonoRegalo = 100;
                }
                break;
            case 4:
                if (MontoApertura>1000000) {
                    BonoRegalo = 1000;
                }
                break;    
            default:
                throw new AssertionError();
        }
        MontoFinal = MontoApertura + BonoRegalo;
        MontoTotal+=MontoFinal;
        Contador++;
            System.out.println("El Monto final es: "+ MontoFinal);
            System.out.println("Desea eguir con la Apertura de otra cuenta");
            seguir=teclado.next();
            } while (seguir.equals("S")||seguir.equals("s"));
            System.out.println("El Monto total recaudado es: "+ MontoTotal);
            System.out.println("El numero de cuentas creadas fueron: " + Contador);
        } catch (Exception e) {
        }
    }
    
}
