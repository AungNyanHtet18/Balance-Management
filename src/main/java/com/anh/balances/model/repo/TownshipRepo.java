package com.anh.balances.model.repo;

import java.util.List;

import com.anh.balances.model.BaseRepository;
import com.anh.balances.model.entity.Township;

public interface TownshipRepo extends  BaseRepository<Township, Integer>{

	List<Township> findByDistrictId(int districtId);

}
