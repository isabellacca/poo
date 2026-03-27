class Calculadora{
 private double numero;
 private double segundonumero;

 public Calculadora () {}

 public Calculadora (double n1,double n2) {
	this.numero = n1;
	this.segundonumero = n2;
 }

 public double getNumero(){
	return this.numero;
 }

public void setNumero(double n1) {
	this.numero = n1;
}

public double getSegundonumero() {
	return this.segundonumero;
}

public void setSegundonumero(double n2) {
	this.segundonumero = n2;
}

public double soma () {
	return numero + segundonumero;
}

public double subtrair (){
 return numero - segundonumero;
}

public double multiplicao () {
	return numero * segundonumero;
}

public String divisao () {
	if ( segundonumero == 0){ 
		return "Impossivel realizar a divisão";
	}

	return String.valueOf(numero / segundonumero);
}

public double resto (){
	return numero % segundonumero;
}


public class Main
{
	public static void main(String[] args) {

		Calculadora cal = new Calculadora(5, 3);
	
	System.out.println("soma: " + cal.soma () );

   	System.out.println("divisão: " + cal.divisao() );
	    
	}
}

}

