package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.NhanVien;
import com.example.demo.repository.NhanVienRespository;



@Service
@Transactional
public class NhanVienService {

	@Autowired
	private NhanVienRespository repo;
	public List<NhanVien> listAll(){
		return repo.findAll();
	}
	public void savenv(NhanVien nhanvien) {
		repo.save(nhanvien);
	}
	public NhanVien get(int id) {
		return repo.findById(id).get();
	}
	public void deletenv(int id) {
		repo.deleteById(id);
	}
}
