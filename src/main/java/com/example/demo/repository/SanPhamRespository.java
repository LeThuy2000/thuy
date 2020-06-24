package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.SanPham;


public interface SanPhamRespository extends JpaRepository<SanPham, Integer>{

}
