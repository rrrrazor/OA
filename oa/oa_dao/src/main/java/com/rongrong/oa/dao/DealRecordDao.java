package com.rongrong.oa.dao;

import com.rongrong.oa.entity.DealRecord;
import com.rongrong.oa.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("dealRecordDao")
public interface DealRecordDao {
    void insert(DealRecord dealRecord);
    List<DealRecord> selectByClaimVoucher(int cvid);
}
