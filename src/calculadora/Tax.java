package calculadora;

public class Tax {
	private double ipi;
	private double icms;
	private double iss;
	
	

	public double getIpi() {
		return ipi;
	}

	public void setIpi(double cost, double freight, double insurance) {
		this.ipi = (cost + freight + insurance) * 0.15;
	}

	public double getIcms() {
		return icms;
	}

	public void setIcms(double aliquot, double cost) {
		this.icms = cost * aliquot;
	}

	public double getIss() {
		return iss;
	}

	public void setIss(double aliquot, double cost) {
		this.iss = aliquot * cost;
	}




}
