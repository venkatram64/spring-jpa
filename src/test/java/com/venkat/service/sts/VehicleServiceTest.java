package com.venkat.service.sts;

import com.venkat.model.sts.FourWheeler;
import com.venkat.model.sts.TwoWheeler;
import com.venkat.model.sts.Vehicle;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

/**
 * Created by Venkatram on 8/26/2017.
 */

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Vehicle.class, VechicleService.class})
@EntityScan(basePackages = {"com.venkat.model"})
@EnableAutoConfiguration
@AutoConfigureTestDatabase
@Transactional
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VehicleServiceTest {

    @Autowired
    private VechicleService vechicleService;

    @Test
    public void test1Insert(){
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("Car");
        vechicleService.addVehicle(vehicle);

        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.setVehicleName("Bike");
        twoWheeler.setSteeringHandle("steering handle");
        vechicleService.addVehicle(twoWheeler);

        FourWheeler fourWheeler = new FourWheeler();
        fourWheeler.setVehicleName("Honda");
        fourWheeler.setSteeringWheel("steering wheel");
        vechicleService.addVehicle(fourWheeler);
    }

}
