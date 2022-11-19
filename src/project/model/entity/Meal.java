package project.model.entity;

import java.util.*;
import javax.swing.*;

public class Meal {
	private int id;
	private String name;
	private String description;
	private int totalPeople;
	private ArrayList<Ingredient> listIngredients;
	private ImageIcon picture;
	
	public Meal(int id, String name, String description, ArrayList<Ingredient> listIngredients, ImageIcon picture) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.totalPeople = 1;
		this.listIngredients = listIngredients;
		this.picture = picture;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTotalPeople() {
		return totalPeople;
	}

	public void setTotalPeople(int totalPeople) {
		this.totalPeople = totalPeople;
	}

	public ArrayList<Ingredient> getListIngredients() {
		return listIngredients;
	}

	public void setListIngredients(ArrayList<Ingredient> listIngredients) {
		this.listIngredients = listIngredients;
	}

	public ImageIcon getPicture() {
		return picture;
	}

	public void setPicture(ImageIcon picture) {
		this.picture = picture;
	}
}
