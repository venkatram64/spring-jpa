package com.venkat.service.tableperclass;

import com.venkat.model.tableperclass.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Venkatram on 8/26/2017.
 */

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Integer>{
}
