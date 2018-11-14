package com.mcommerce.microserviceexpedition.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcommerce.microserviceexpedition.model.Expedition;


@Repository
public interface ExpeditionDao extends JpaRepository<Expedition, Integer>{
}
