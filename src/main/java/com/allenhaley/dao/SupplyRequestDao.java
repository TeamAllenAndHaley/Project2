package com.allenhaley.dao;

import com.allenhaley.model.SupplyRequest;

import java.util.List;

public interface SupplyRequestDao extends BaseDao<SupplyRequest> {

    List<SupplyRequest> getByEmpId(int id);
}
