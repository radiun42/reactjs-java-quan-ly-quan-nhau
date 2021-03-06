package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "ban")
public class Ban {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long b_id;
	@Column(unique = true, name = "sothutu")
	private Long b_stt;

	@Column(name = "soghe")
	private Integer b_soghe;

	@Column(name = "trangthai")
	private TrangThaiBan b_trangthai;

	public Long getB_id() {
		return b_id;
	}

	public void setB_id(Long b_id) {
		this.b_id = b_id;
	}

	public Long getB_stt() {
		return b_stt;
	}

	public void setB_stt(Long b_stt) {
		this.b_stt = b_stt;
	}

	public Integer getB_soghe() {
		return b_soghe;
	}

	public void setB_soghe(Integer b_soghe) {
		this.b_soghe = b_soghe;
	}

	public TrangThaiBan getB_trangthai() {
		return b_trangthai;
	}

	public void setB_trangthai(TrangThaiBan b_trangthai) {
		this.b_trangthai = b_trangthai;
	}

	public List<NhanVien> getNhanviens() {
		return nhanviens;
	}

	public void setNhanviens(List<NhanVien> nhanviens) {
		this.nhanviens = nhanviens;
	}

	public List<HoaDon> getHoadons() {
		return hoadons;
	}

	public void setHoadons(List<HoaDon> hoadons) {
		this.hoadons = hoadons;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "nhanvien_ban", joinColumns = @JoinColumn(name = "b_id", referencedColumnName = "b_id"), inverseJoinColumns = @JoinColumn(name = "nv_id", referencedColumnName = "nv_id"))
	@JsonManagedReference
	@JsonIgnore
	private List<NhanVien> nhanviens;

	@OneToMany(mappedBy = "ban")
	@JsonBackReference
	private List<HoaDon> hoadons;

	public Ban() {
		super();
	}

}
