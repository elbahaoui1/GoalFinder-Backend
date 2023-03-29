package ma.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Field {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public Field() {
		super();
	}

	private String adresse;
	private double laltitude;
	private double longitude;
	private String nom;
	private int etat;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getLaltitude() {
		return laltitude;
	}
	public void setLaltitude(double laltitude) {
		this.laltitude = laltitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	
	


}
