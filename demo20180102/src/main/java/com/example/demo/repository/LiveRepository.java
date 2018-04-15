package com.example.demo.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.LiveEntity;

@Repository 
public interface LiveRepository extends JpaRepository<LiveEntity, Integer>{ 
	
	@Query(value = "select * from live order by date", nativeQuery = true)
	public ArrayList<LiveEntity> getEvents();
}
