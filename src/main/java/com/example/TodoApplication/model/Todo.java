package com.example.TodoApplication.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {
    
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private boolean done;
	
	
	public Todo() {
		super();
	}

	public Todo(int id, String name, String description, boolean done) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		// this.targetDate = targetDate;
		this.done = done;
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

	/*
	 * public LocalDate getTargetDate() { return targetDate; } public void
	 * setTargetDate(LocalDate targetDate) { this.targetDate = targetDate; }
	 */
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", name=" + name + ", description=" + description + ", done=" + done + "]";
	}
	
	
	
}
