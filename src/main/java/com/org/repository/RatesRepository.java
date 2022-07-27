
package com.org.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.entiry.Rates;

@Repository
public interface RatesRepository extends CrudRepository<Rates, Integer> {

}
