package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "giohang")
public class GioHang {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tensp;
    private float giatien;
    
	public GioHang() {
		super();
	}

	public GioHang(int id, String tensp, float giatien) {
		super();
		this.id = id;
		this.tensp = tensp;
		this.giatien = giatien;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTensp() {
		return tensp;
	}

	public void setTensp(String tensp) {
		this.tensp = tensp;
	}

	public float getGiatien() {
		return giatien;
	}

	public void setGiatien(float giatien) {
		this.giatien = giatien;
	}  

}
