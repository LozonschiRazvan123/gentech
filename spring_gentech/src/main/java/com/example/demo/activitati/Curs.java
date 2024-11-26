package com.example.demo.activitati;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import basic.Persoana;
import basic.Trainer;

public class Curs implements Activitate{
	
	private String nume, dificultate;
	private Persoana trainer;
	private ArrayList<Persoana> exploreri;
	private int cost;
	private LinkedHashMap<String, Activitate> activitati = new LinkedHashMap<String, Activitate>();
	

	public LinkedHashMap<String, Activitate> getActivitati() {
		return activitati;
	}

	public void setActivitati(LinkedHashMap<String, Activitate> activitati) {
		this.activitati = activitati;
	}

	public Curs(String nume, String dificultate, Persoana trainer, ArrayList<Persoana> exploreri, int cost) {
		super();
		this.nume = nume;
		this.dificultate = dificultate;
		this.trainer = trainer;
		this.exploreri = exploreri;
		this.cost = cost;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getDificultate() {
		return dificultate;
	}

	public void setDificultate(String dificultate) {
		this.dificultate = dificultate;
	}

	public Persoana getTrainer() {
		return trainer;
	}

	public void setTrainer(Persoana trainer) {
		this.trainer = trainer;
	}

	public ArrayList<Persoana> getExploreri() {
		return exploreri;
	}

	public void setExploreri(ArrayList<Persoana> exploreri) {
		this.exploreri = exploreri;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String getDescriere() {
		return "Curs de " + nume + " cu o dificultate " + dificultate;
	}

	@Override
	public String getDurata() {
		if (dificultate.equals("usor")) {
			return "1 luna";
		} else if (dificultate.equals("mediu")) {
			return "3 luni";
		} else if (dificultate.equals("dificil")) {
			return "5 luni";
		} else {
			return "necunoscut"; 
		}
 	}
	
	public int getCost(Persoana p) {
		if(p instanceof Trainer) {
			return 0;
		} else {
			return this.cost;
		}
	}

	
}
