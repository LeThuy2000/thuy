package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String password;
    private String hoten;
    private boolean vaitro;
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
	public boolean isVaitro() {
		return vaitro;
	}
	public void setVaitro(boolean vaitro) {
		this.vaitro = vaitro;
	}
	public NhanVien() {
		super();
	}
	public NhanVien(int id, String password, String hoten, boolean vaitro) {
		super();
		this.id = id;
		this.password = password;
		this.hoten = hoten;
		this.vaitro = vaitro;
	}

}
