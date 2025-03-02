package model;

public class Empleado extends Persona{

	public double salarioBasico;
    public int dias;
    
    public Empleado() {
		// TODO Auto-generated constructor stub
	}

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
}
