package com.venkat.service;

import com.venkat.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by venkatram.veerareddy on 8/23/2017.
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
