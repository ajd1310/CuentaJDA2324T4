package cuenta;


public class Main {

    
    public static void main(String[] args) {
        CuentaJimenezDiazAlejandro2324T4 miCuentaJimenezDiazAlejandro2324T4;
        double saldoActual;
        int x;
        
        
        
        miCuentaJimenezDiazAlejandro2324T4 = new CuentaJimenezDiazAlejandro2324T4("Antonio Sánchez","ES55-3058-2365-8522-1234-5678",2500,0);
        System.out.println("Saldo inicial de la cuenta: "+miCuentaJimenezDiazAlejandro2324T4.estado()+"€");
        retiraDineroJimenezDiazAlejandro(miCuentaJimenezDiazAlejandro2324T4);
        
        ingresaDineroJimenezDiazAlejandro(miCuentaJimenezDiazAlejandro2324T4);
        saldoActual = miCuentaJimenezDiazAlejandro2324T4.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }

    private static void ingresaDineroJimenezDiazAlejandro(CuentaJimenezDiazAlejandro2324T4 miCuentaJimenezDiazAlejandro2324T4) {
        int x;
        try
        {
            x=100;
            System.out.println("Ingreso en cuenta de "+x+"€");
            miCuentaJimenezDiazAlejandro2324T4.ingresar(x, "Ingreso en Cuenta");
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
    }

    private static void retiraDineroJimenezDiazAlejandro(CuentaJimenezDiazAlejandro2324T4 miCuentaJimenezDiazAlejandro2324T4) {
        int x;
        try
        {
            x=1500;
            System.out.println("Retirada en cuenta de "+x+"€");
            miCuentaJimenezDiazAlejandro2324T4.retirar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
    }

}
