package com.example.IncidentManagement.LowesApi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.IncidentManagement.LowesApi.entity.Incident;

public interface IncidentDao extends JpaRepository<Incident, Long> {
	
	List<Incident> findByUserId(long userId);
}
