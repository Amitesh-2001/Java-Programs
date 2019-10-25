package labPrograms;

public class Items {
	String category;
	String name;
	double cost;

	public Items(String category,String name,double cost ) {
		this.category = category;
		this.name=name;
		 this.cost=cost;
	}
	
	void display(){
		System.out.println("category: "+category);
		System.out.println("name: "+name);
		System.out.println("cost: "+cost);
	}

	

}
