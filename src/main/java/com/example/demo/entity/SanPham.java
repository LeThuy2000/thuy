package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class SanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	@Column(name = "tensp")
	private String TenSP;
	private int Gia;
	@Column(name = "mota")
	private String MoTa;
	private String Hinh;
	@Column(name = "maloai")
	private String MaLoai;
	
	public SanPham() {
	
	}
	public SanPham(int id, String tenSP, int gia, String moTa, String hinh, String maLoai) {
		super();
		this.id = id;
		TenSP = tenSP;
		Gia = gia;
		MoTa = moTa;
		Hinh = hinh;
		MaLoai = maLoai;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenSP() {
		return TenSP;
	}
	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}
	public int getGia() {
		return Gia;
	}
	public void setGia(int gia) {
		Gia = gia;
	}
	public String getMoTa() {
		return MoTa;
	}
	public void setMoTa(String moTa) {
		MoTa = moTa;
	}
	public String getHinh() {
		return Hinh;
	}
	public void setHinh(String hinh) {
		Hinh = hinh;
	}
	public String getMaLoai() {
		return MaLoai;
	}
	public void setMaLoai(String maLoai) {
		MaLoai = maLoai;
	}
	

	}
