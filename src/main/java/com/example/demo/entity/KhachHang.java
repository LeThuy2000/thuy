package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "khachhang")
public class KhachHang {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String password;
    private String hoten;
    private int sodt;
    private String email;
    private String diachi;
	public KhachHang(int id, String password, String hoten, int sodt, String email, String diachi) {
		super();
		this.id = id;
		this.password = password;
		this.hoten = hoten;
		this.sodt = sodt;
		this.email = email;
		this.diachi = diachi;
	}
	public KhachHang(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getSodt() {
		return sodt;
	}
	public void setSodt(int sodt) {
		this.sodt = sodt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public KhachHang() {
		super();
	}
}
