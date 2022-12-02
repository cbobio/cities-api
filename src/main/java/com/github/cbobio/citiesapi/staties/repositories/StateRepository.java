package com.github.cbobio.citiesapi.staties.repositories;


import com.github.cbobio.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
