package com.pds.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "offstreet_cities")
public class CityEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int city_id;
	
	@NotNull
    @Column(name = "city_name")
	private String city_name;
	
	@Column(name = "no_of_slots")
	private int no_of_slots;
	
	@Override
	public String toString() {
		return "CityEntity [city_name=" + city_name+ "]";
	}

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public int getNo_of_slots() {
		return no_of_slots;
	}

	public void setNo_of_slots(int no_of_slots) {
		this.no_of_slots = no_of_slots;
	}
}

