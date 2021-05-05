package com.julianocarneiro.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julianocarneiro.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
