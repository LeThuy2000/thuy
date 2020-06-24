package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.SanPham;
import com.example.demo.repository.SanPhamRespository;



@Service
@Transactional
public class SanPhamService {
	@Autowired
	private SanPhamRespository repo;
	public List<SanPham> listAll(){
		return repo.findAll();
	}
	public void save(SanPham sanpham) {
		repo.save(sanpham);
	}
	public SanPham get(int MaSP) {
		return repo.findById(MaSP).get();
	}
	public void delete(int MaSP) {
		repo.deleteById(MaSP);
	}
}
