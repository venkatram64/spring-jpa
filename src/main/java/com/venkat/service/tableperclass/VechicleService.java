package com.venkat.service.tableperclass;

import com.venkat.model.tableperclass.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Venkatram on 8/26/2017.
 */

@Service
public class VechicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getAllVehicles(){
        return vehicleRepository.findAll();
    }

    public Vehicle addVehicle(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    public Vehicle getVehicleById(Integer id){
        return vehicleRepository.getOne(id);
    }
    public boolean deleteVehicleById(Integer id){
        vehicleRepository.delete(id);
        return true;
    }
}
