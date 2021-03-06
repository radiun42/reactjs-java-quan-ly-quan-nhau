package com.hns2t.QuanLyQuanNhau_server.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ctpx")
public class ChiTietPhieuXuat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ctpx_id; 
	
	@Column(name = "soluong")
	private Double ctpx_soluong;
	
	
	public ChiTietPhieuXuat() {
		super();
	}
	
	
}
