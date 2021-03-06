package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Ban;

@Repository
public interface BanRepository extends JpaRepository<Ban, Long> {
	@Query("SELECT b FROM Ban b WHERE b.b_stt = ?1")
	Ban findBySTT(Long b_stt);
}
