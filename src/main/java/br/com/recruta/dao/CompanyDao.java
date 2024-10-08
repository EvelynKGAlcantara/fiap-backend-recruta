package br.com.recruta.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.recruta.beans.Company;

public interface CompanyDao extends CrudRepository<Company, Integer> {

    public List<Company> findByNameStartingWith(String name);

}
