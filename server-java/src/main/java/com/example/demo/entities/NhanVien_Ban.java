package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien_banphucvu")
public class NhanVien_Ban {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long nvb_id;
	@Column(name = "thoigian")
	private Date nvb_thoigian;
	public NhanVien_Ban() {
		super();
	}
	
}
