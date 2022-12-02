package com.github.cbobio.citiesapi.countries.repositories;

import com.github.cbobio.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
