package com.allenhaley.services;

import com.allenhaley.dao.SupplyRequestDao;
import com.allenhaley.dao.SupplyRequestDaoImpl;
import com.allenhaley.model.SupplyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupplyRequestService {
    private SupplyRequestDao supplyRequestDao;

    @Autowired
    public void setSupplyRequestDao(SupplyRequestDao supplyRequestDao) {
        this.supplyRequestDao = supplyRequestDao;
    }

    @Transactional
    public SupplyRequest saveSupplyRequest(SupplyRequest supplyRequest) {
        return supplyRequestDao.add(supplyRequest);
    }

    @Transactional(readOnly=true)
    public List<SupplyRequest> listSupplyRequest() {
        return (ArrayList<SupplyRequest>)supplyRequestDao.all();
    }

    @Transactional
    public ArrayList<SupplyRequest> getSupplyRequestsById(int id) {
        return (ArrayList<SupplyRequest>)supplyRequestDao.getByEmpId(id);
    }
}
