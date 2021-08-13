package com.github.thatianexavier.citiesapi.states.repository;

import com.github.thatianexavier.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {

}