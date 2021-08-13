package com.github.thatianexavier.citiesapi.countries.repository;

import com.github.thatianexavier.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
