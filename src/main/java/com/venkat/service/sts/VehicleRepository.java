package com.venkat.service.sts;

import com.venkat.model.sts.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Venkatram on 8/26/2017.
 */

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Integer>{
}
