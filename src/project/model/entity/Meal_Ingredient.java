package project.model.entity;

public class Meal_Ingredient {
	private int id;
	private int idMeal;
	private int idIngredient;
	private float quantity;
	
	public Meal_Ingredient(int id, int idMeal, int idIngredient, float quantity) {
		this.id = id;
		this.idMeal = idMeal;
		this.idIngredient = idIngredient;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdMeal() {
		return idMeal;
	}

	public void setIdMeal(int idMeal) {
		this.idMeal = idMeal;
	}

	public int getIdIngredient() {
		return idIngredient;
	}

	public void setIdIngredient(int idIngredient) {
		this.idIngredient = idIngredient;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	
}
