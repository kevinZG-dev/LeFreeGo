package project.model.entity;

public class Ingredient {
	private int id;
	private String name;
	private String units;
	private float quantity;
	
	public Ingredient(int id, String name, String units, float quantity) {
		this.id = id;
		this.name = name;
		this.units = units;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	
	
	
	
}
