package com.smartthings.searchlight.persistence;

import com.smartthings.searchlight.model.Device;
import org.springframework.data.repository.CrudRepository;

public interface DeviceRepository extends CrudRepository<Device, Long> {

}