package com.allenhaley.services;

import com.allenhaley.dao.BaseDao;
import com.allenhaley.model.SupplyRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupplyRequestService {
    BaseDao<SupplyRequest> supplyRequestDao;

    @Transactional
    public void saveSupplyRequest(SupplyRequest supplyRequest) {
        supplyRequestDao.add(supplyRequest);
    }

    @Transactional(readOnly=true)
    public List<SupplyRequest> listSupplyRequest() {
        return (ArrayList<SupplyRequest>)supplyRequestDao.all();
    }
}
