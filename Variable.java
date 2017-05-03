
package fundamentos;

	class CuentaBancaria {
    public int saldo;
    public static int numero=0;
    
}

    public class Variable{
    public static void sumarSaldo(CuentaBancaria cta){
        cta.saldo+=10;
        
    }
    public static void sumarSaldo (int saldo){
        saldo+=10;
        
}
    public static void main(String[] args){
        CuentaBancaria ct1 = new CuentaBancaria();
  
        ct1.saldo=1000;
        sumarSaldo(ct1);
        sumarSaldo(ct1);
        
        System.out.println("Objeto 1: "+ct1.saldo); //IMPRIME 1020
        
        CuentaBancaria pai = new CuentaBancaria();
        pai.saldo=2500;
        sumarSaldo(pai);

        System.out.println("Objeto 2: "+pai.saldo);	//IMPRIME 2510
        
        CuentaBancaria abr = new CuentaBancaria();
        abr.saldo=1390;
        sumarSaldo(abr);
        sumarSaldo(abr);

        System.out.println("Objeto 3: "+abr.saldo);	//IMPRIME 1410
        
        CuentaBancaria via = new CuentaBancaria();
        via.saldo=3840;
        sumarSaldo(via);
        sumarSaldo(via);
        sumarSaldo(via);

        System.out.println("Objeto 4: "+via.saldo);	//IMPRIME 3870
        
        CuentaBancaria ceo = new CuentaBancaria();
        ceo.saldo=2560;
        sumarSaldo(ceo);
        sumarSaldo(ceo);
        sumarSaldo(ceo);
        sumarSaldo(ceo);

        System.out.println("Objeto 5: "+ceo.saldo);	//IMPRIME 2600
        
        CuentaBancaria cto = new CuentaBancaria();
        cto.saldo=4080;
        sumarSaldo(cto);
        sumarSaldo(cto);

        System.out.println("Objeto 6: "+cto.saldo);	//IMPRIME 4100
        
        CuentaBancaria cbt = new CuentaBancaria();
        cbt.saldo=2950;
        sumarSaldo(cbt);
        sumarSaldo(cbt);
        sumarSaldo(cbt);

        System.out.println("Objeto 7: "+cbt.saldo);	//IMPRIME 2980
        
        CuentaBancaria cyb = new CuentaBancaria();
        cyb.saldo=4000;
        sumarSaldo(cyb);
        sumarSaldo(cyb);
        sumarSaldo(cyb);
        sumarSaldo(cyb);
        sumarSaldo(cyb);

        System.out.println("Objeto 8: "+cyb.saldo);	//IMPRIME 4050
        
        CuentaBancaria cue = new CuentaBancaria();
        cue.saldo=2450;
        sumarSaldo(cue);
        sumarSaldo(cue);

        System.out.println("Objeto 9: "+cue.saldo);	//IMPRIME 2470
        
        CuentaBancaria asj = new CuentaBancaria();
        asj.saldo=0;
        sumarSaldo(asj);
        sumarSaldo(asj);
        sumarSaldo(asj);
        sumarSaldo(asj);
        System.out.println("Objeto 10: "+asj.saldo);	//IMPRIME 40

    }
}