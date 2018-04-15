package com.example.demo.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TopInfo;

@Repository
public interface TopInfoRepository extends JpaRepository<TopInfo, Integer> {
	
	@Query(value = "select * from top_info", nativeQuery = true)
	public ArrayList<TopInfo> getTopInfos();

}
