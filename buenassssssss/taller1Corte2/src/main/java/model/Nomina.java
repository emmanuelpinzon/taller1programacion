package model;

public class Nomina extends Empleado{

	public Nomina() {
		// TODO Auto-generated constructor stub
	}
	  public double getAuxilioTransporte() {
	        return 140000; 
	    }

	    public double getSalud() {
	        return salarioBasico * 0.04;
	    }

	    public double getPension() {
	        return salarioBasico * 0.04; 
	    }

	    public double calcularSalario() {
	        double salarioTotal = (salarioBasico / 30) * dias;
	        return salarioTotal - getSalud() - getPension();
	    }
}
