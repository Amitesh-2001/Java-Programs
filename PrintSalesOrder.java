package labPrograms;

public class PrintSalesOrder {
	public static void main(String[] args){
		SalesOrder myOrder=new SalesOrder();
		myOrder.getItems(new Items("book","abc",129.9));
		myOrder.getItems(new Items("food","biscuits",76.9));
		myOrder.getItems(new Items("electronics","phone",12900.9));
		
		for(int i=0;i<myOrder.n;i++)
			myOrder.A[i].display();
		
		double total = myOrder.calculateTotal();
		
		System.out.println("total bill= "+total);
		double tax = myOrder.calculateTax(total);
		System.out.println("total tax= "+tax);
		System.out.println("total bill= "+(total+tax));
		double total1=total+tax;
		double discount = myOrder.calculateDiscount(total1);
		System.out.println("total discount= "+discount);
		System.out.println("final bill= "+(total1-discount));
	}

}
