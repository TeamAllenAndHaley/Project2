package com.allenhaley.services;

import com.allenhaley.dao.LocationDao;
import com.allenhaley.dao.LocationDaoImpl;
import com.allenhaley.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service
public class LocationService {
    private LocationDao locationDao;

    @Autowired
    public void setLocationDao(LocationDao locationDao) {
        this.locationDao = locationDao;
    }

    @Transactional
    public Location findById(Serializable id) {
        return locationDao.find(id);
    }

}
