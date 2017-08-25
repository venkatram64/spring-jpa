package com.venkat.service;

import com.venkat.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by venkatram.veerareddy on 8/25/2017.
 */

@Repository
public interface BankRepository extends JpaRepository<Bank,Integer> {
}
