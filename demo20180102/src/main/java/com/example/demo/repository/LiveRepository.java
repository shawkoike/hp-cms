package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.LiveEntity;

@Repository 
public interface LiveRepository extends JpaRepository<LiveEntity, Integer>{ 
}
