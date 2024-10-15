package practice;

public class ObjectAndHashCode {
	public static void main(String[] args) {
		Laptop obj = new Laptop();
		obj.model = "Lenovo";
		obj.price = 1000;
		System.out.println(obj);// in default calls toString()
		System.out.println("obj ::: " + obj.toString());

		Laptop obj2 = new Laptop();
		obj2.model = "Lenovo";
		obj2.price = 1000;
		System.out.println(obj2);// in default calls toString()
		System.out.println("obj2 ::: " + obj.equals(obj2));// hash code and value must be same to return true

	}
}

class Laptop {
	String model;
	int price;

	// public boolean equals(Laptop that){

	// return this.model.equals(that.model) && this.price == (that.price);

	// }//custom equals

	public String toString() {
		return "Laptop [model=" + model + ", price=" + price + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

}
