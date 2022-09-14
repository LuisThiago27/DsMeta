package com.devluis.dsmeta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devluis.dsmeta.entities.Sale;
import com.devluis.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales() {
		return repository.findAll();
	}

}
