package com.pds.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pds.model.CityEntity;

@Repository
public interface CityRepository  extends JpaRepository<CityEntity, Long> {

}
