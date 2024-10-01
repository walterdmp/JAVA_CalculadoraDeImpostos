package calculadora;

public class Product_Service {
	private String name;
	private double cost;
	private double tax;
	private double marginProfit;
	private double priceFinal;
	
	
	public Product_Service(String name, double cost, double marginProfit, double tax) {
		this.name = name;
		this.cost = cost;
		this.marginProfit = marginProfit;
		this.tax = tax;
		this.priceFinal = (cost + tax) * (1 + marginProfit);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		if(cost > 0) {
			this.cost = cost;
		} else {
			System.out.println("Valor de custo inválido.");
		}
			
	}
	public double getMarginProfit() {
		return marginProfit;
	}
	public void setMarginProfit(double marginProfit) {
		this.marginProfit = marginProfit;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getPriceFinal() {
		return priceFinal;
	}
	public void setPriceFinal(double priceFinal) {
		this.priceFinal = priceFinal;
	}

	@Override
	public String toString() {
		return "Produto/Serviço: Nome: " + name + ", Custo: " + cost + ", Taxa: " + tax + ", Margem Lucro: " + marginProfit
				+ ", Preço Final: " + priceFinal + ".";
	}

	
	
}
