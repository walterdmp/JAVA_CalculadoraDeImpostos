package calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        ArrayList<Product_Service> products = new ArrayList<>();        
		int option = 0;
		Scanner sc = new Scanner(System.in);
		Tax tax = new Tax();
	
		do {
			System.out.println("Nome Produto/Serviço: ");
			String name = sc.nextLine();
			System.out.println("Custo do Produto/Serviço: ");
			double cost = sc.nextDouble();
			System.out.println("Custo do frete do Produto/Serviço: ");
			double freight = sc.nextDouble();
			System.out.println("Custo do seguro do Produto/Serviço: ");
			double insurance = sc.nextDouble();
			System.out.println("Custo alíquota ICMS do Produto/Serviço: ");
			double aliquotIcms = sc.nextDouble();
			System.out.println("Custo alíquota ISS do Produto/Serviço: ");
			double aliquotIss = sc.nextDouble();
			tax.setIpi(cost, freight, insurance);
			tax.setIcms(aliquotIcms, cost);
			tax.setIss(aliquotIss, cost);
			
			double taxTotal = tax.getIcms() + tax.getIpi() + tax.getIss();
			System.out.println("Margem de Lucro do Produto/Serviço: ");
			double marginProfit = sc.nextDouble();
			
			Product_Service newProdServ = new Product_Service(name, cost, marginProfit, taxTotal);
			
			products.add(newProdServ);
			System.out.println("Digite 1 para Cadastrar novo Produto/Serviço ou 0 para Sair: ");
			option = sc.nextInt();
			sc.next();
		} while(option != 0);
		
		System.out.println("Produtos / Serviços Cadastrados: ");
		for(Product_Service ps : products) {
			System.out.println(ps);
		}
		
		sc.close();
	}
}
