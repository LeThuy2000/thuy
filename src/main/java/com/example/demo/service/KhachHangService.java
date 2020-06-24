package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.KhachHang;
import com.example.demo.repository.KhachHangRespository;


@Service
@Transactional
public class KhachHangService {
	@Autowired
	private KhachHangRespository repo;
	public List<KhachHang> listAll(){
		return repo.findAll();
	}
	public void savekh(KhachHang khachhang) {
		repo.save(khachhang);
	}
	public KhachHang get(int MaKh) {
		return repo.findById(MaKh).get();
	}
	public void deletekh(int MaKh) {
		repo.deleteById(MaKh);
	}
}
