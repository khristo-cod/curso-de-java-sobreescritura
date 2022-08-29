
package test;

import domain.Gerente;


public class testSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("juan", 5000, "sistemas");
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
    }
}
