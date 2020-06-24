package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.GioHang;
import com.example.demo.entity.KhachHang;
import com.example.demo.entity.NhanVien;
import com.example.demo.entity.SanPham;
import com.example.demo.service.GioHangService;
import com.example.demo.service.KhachHangService;
import com.example.demo.service.NhanVienService;
import com.example.demo.service.SanPhamService;

@Controller
public class SanPhamController {
	@Autowired
	SanPhamService service;
	@Autowired
    NhanVienService servicenv;
	@Autowired
	KhachHangService servicekh;
	@Autowired
	GioHangService servicegh;
	
	
	// hiển thị trang chủ
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<SanPham> listPhammodels = service.listAll();
		model.addAttribute("listPhammodels", listPhammodels);
		return "index";
	}

	// lấy tất cả sản phẩm
	@RequestMapping("/product")
	public String product(Model model) {
		List<SanPham> listPhammodels = service.listAll();
		model.addAttribute("listPhammodels", listPhammodels);
		return "product";
	}

	// tạo mới 1 sản phẩm
	@RequestMapping("/insertproduct")
	public String showNewSanPhamPage(Model model) {
		model.addAttribute("sanpham", new SanPham());
		return "insertproduct";
	}

	// lưu 1 sản phẩm
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertSanPham(@ModelAttribute("sanpham") SanPham sanpham, Model model) {
		service.save(sanpham);
		List<SanPham> listPhammodels = service.listAll();
		model.addAttribute("listPhammodels", listPhammodels);
		return "product";
	}


	//sửa 1 sản phẩm
	@RequestMapping("/updateproduct/{id}")
	public String Updateproduct(@PathVariable("id") int id, Model model) {
		SanPham pham = service.get(id);
		model.addAttribute("sanpham", pham);
		return "updateproduct";
	}
	
	// lưu thông tin vừa sửa 
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveSanPham(@ModelAttribute("sanpham") SanPham sanpham, Model model) {
		service.save(sanpham);
		List<SanPham> listPhammodels = service.listAll();
		model.addAttribute("listPhammodels", listPhammodels);
		return "product";
	}

	// xóa sản phẩm
	@RequestMapping("/delete/product/{masp}")
	public String deleteSanPham(@PathVariable(name = "masp") Integer masp, Model model) {
		service.delete(masp);
		List<SanPham> listPhammodels = service.listAll();
		model.addAttribute("listPhammodels", listPhammodels);
		return "redirect:/product";
	}
	
	// lấy tất cả nhân viên
			@RequestMapping("/employee")
			public String Employee(Model model) {
				List<NhanVien> listNhanVienmodels = servicenv.listAll();
				System.out.print(listNhanVienmodels.size());
				model.addAttribute("listNhanVienmodels", listNhanVienmodels);
				return "employee";
			}

			// tạo mới 1 nhân viên
			@RequestMapping("/insertemployee")
			public String showNewNhanVienPage(Model model) {
				model.addAttribute("nhanvien", new NhanVien());
				return "insertemployee";
			}
			
			// lưu 1 nhân viên
			@RequestMapping(value = "/newnv", method = RequestMethod.POST)
			public String insertNhanVien(@ModelAttribute("nhanvien") NhanVien nhanvien, Model model) {
				servicenv.savenv(nhanvien);
				List<NhanVien> listNhanVienmodels = servicenv.listAll();
				model.addAttribute("listNhanVienmodels", listNhanVienmodels);
				return "employee";
			}
			
			//sửa 1 nhân viên
				@RequestMapping("/updateemployee/employee/{id}")
				public String Updateemployee(@PathVariable("id") int id, Model model) {
					NhanVien nhanvien = servicenv.get(id);
					model.addAttribute("nhanvien", nhanvien);
					return "updateemployee";
				}
				
			// lưu thông tin vừa sửa 1 nhân viên
			@RequestMapping(value = "/savenv", method = RequestMethod.POST)
			public String saveNhanVien(@ModelAttribute("nhanvien") NhanVien nhanvien, Model model) {
				servicenv.savenv(nhanvien);
				List<NhanVien> listNhanVienmodels = servicenv.listAll();
				model.addAttribute("listNhanVienmodels", listNhanVienmodels);
				return "employee";
			}
			
			// xóa nhân viên
				@RequestMapping("/deletenv/{manv}")
				public String deleteNhanVien(@PathVariable(name = "manv") int manv, Model model) {
					servicenv.deletenv(manv);
					List<NhanVien> listNhanVienmodels = servicenv.listAll();
					model.addAttribute("listNhanVienmodels", listNhanVienmodels);
					return "redirect:/employee";
				}

	// lấy tất cả khách hàng
//	@RequestMapping("/customer")
//	public String Customer(Model model) {
//			List<KhachHang> listKHmodels = servicekh.listAll();
//			System.out.print(listKHmodels.size());
//			model.addAttribute("listKHmodels", listKHmodels);
//			return "customer";
//
//	}

	// tạo mới 1khách hàng
	@RequestMapping("/insertcustomer")
	public String showNewKhachHangPage(Model model) {
		model.addAttribute("khachhang", new KhachHang());
		return "insertcustomer";
	}
	
	// lưu 1 khách hàng
	@RequestMapping(value = "/newkh", method = RequestMethod.POST)
	public String insertKhachHang(@ModelAttribute("khachhang") KhachHang khachhang, Model model) {
		servicekh.savekh(khachhang);
		List<KhachHang> listKHnmodels = servicekh.listAll();
		model.addAttribute("listKHnmodels", listKHnmodels);
		return "customer";
	}

	//sửa 1 khách hàng
		@RequestMapping("/updatecustomer/customer/{id}")
		public String Updatecustomer(@PathVariable("id") int id, Model model) {
			KhachHang khachhang = servicekh.get(id);
			model.addAttribute("khachhang", khachhang);
			return "updatecustomer";
		}

	// lưu thông tin vừa sửa 1 khách hàng
	@RequestMapping(value = "/savekh", method = RequestMethod.POST)
	public String saveKhacHang(@ModelAttribute("khachhang") KhachHang khachhang, Model model) {
		servicekh.savekh(khachhang);
		List<KhachHang> listKHnmodels = servicekh.listAll();
		model.addAttribute("listKHnmodels", listKHnmodels);
		return "customer";
	}
	
	// xóa khách hàng
		@RequestMapping("/deletekh/{makh}")
		public String deleteKhachHang(@PathVariable(name = "makh") int makh, Model model) {
			servicekh.deletekh(makh);
			List<KhachHang> listKHnmodels = servicekh.listAll();
			model.addAttribute("listKHnmodels", listKHnmodels);
			return "redirect:/customer";
		}	
		
		
		
	// giỏ hàng
	@RequestMapping("/productinformation")
	public String produc(Model model) {
		List<SanPham> listPhammodels = service.listAll();
		model.addAttribute("listPhammodels", listPhammodels);
		return "productinformation";

	}
	
	// xem giỏ hàng
	@RequestMapping("/cart")
	public String Cart(Model model) {
			List<GioHang> listGHmodels = servicegh.listAll();
			System.out.print(listGHmodels.size());
			model.addAttribute("listGHmodels", listGHmodels);
			return "cart";

	}
	
		// lưu giỏ hàng
		@RequestMapping(value = "/insertgh", method = RequestMethod.POST)
		public String insertGioHang(@ModelAttribute("giohang") GioHang giohang, Model model) {
			servicegh.savegh(giohang);
			List<GioHang> listGHmodels = servicegh.listAll();
			model.addAttribute("listGHmodels", listGHmodels);
			return "cart";
		}


//		//sửa giỏ hàng
//		@RequestMapping("/updateproduct/{id}")
//		public String Updateproduct(@PathVariable("id") int id, Model model) {
//			SanPham pham = service.get(id);
//			model.addAttribute("sanpham", pham);
//			return "updateproduct";
//		}
//		
//		// lưu thông tin vừa sửa 
//		@RequestMapping(value = "/save", method = RequestMethod.POST)
//		public String saveSanPham(@ModelAttribute("sanpham") SanPham sanpham, Model model) {
//			service.save(sanpham);
//			List<SanPham> listPhammodels = service.listAll();
//			model.addAttribute("listPhammodels", listPhammodels);
//			return "product";
//		}
//
//		// xóa giỏ hàng
//		@RequestMapping("/delete/product/{masp}")
//		public String deleteSanPham(@PathVariable(name = "masp") Integer masp, Model model) {
//			service.delete(masp);
//			List<SanPham> listPhammodels = service.listAll();
//			model.addAttribute("listPhammodels", listPhammodels);
//			return "redirect:/product";
//		}
	
	
	//login
	@RequestMapping("/login")
	public String login() {
		
		return "login";

	}

	@RequestMapping("/contact")
	public String type() {

		return "contact";

	}

	@RequestMapping("/customer")
	public String customer() {

		return "customer";

	}

	@RequestMapping("/type")
	public String Category() {

		return "type";

	}



}
