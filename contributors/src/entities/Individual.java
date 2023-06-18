package entities;

public class Individual extends TaxPayer {
	private double healthExpenditures;
	
	public Individual() {
	}

	public Individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	//metodo para calcular a taxa de individuo
	@Override
	public double Tax(){
		if (getAnualIncome() < 20000) {
			return (getAnualIncome()*0.15)-healthExpenditures*0.5;
		} else {
			return (getAnualIncome()*0.25)-healthExpenditures*0.5;
		}
	}
	
}
