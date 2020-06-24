package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.GioHang;
import com.example.demo.repository.GioHangRespository;


@Service
@Transactional
public class GioHangService {
	@Autowired
	private GioHangRespository repo;
	public List<GioHang> listAll(){
		return repo.findAll();
	}
	public void savegh(GioHang giohang) {
		repo.save(giohang);
	}
	public GioHang get(int MaGh) {
		return repo.findById(MaGh).get();
	}
	public void deletegh(int MaKh) {
		repo.deleteById(MaKh);
	}
}
