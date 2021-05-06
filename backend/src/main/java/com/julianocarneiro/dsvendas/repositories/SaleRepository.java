package com.julianocarneiro.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julianocarneiro.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
