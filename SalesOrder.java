package labPrograms;

public class SalesOrder implements Tax,Discount {
	Items[] A=new Items[10];
	int n=0;
	
	void getItems(Items item){
		A[n++]=item;
	}
	
	double calculateTotal(){
		double total=0;
		for(int i = 0;i<n;i++)
			total += A[i].cost;
		
		return total;
	}

	@Override
	public double calculateTax(double amount) {
		return amount*.1;
	}

	@Override
	public double calculateDiscount(double amount) {
		return amount*0.2;
	}
	
}
