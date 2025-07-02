package com.anh.balances.model.repo;

import java.util.List;

import com.anh.balances.model.BaseRepository;
import com.anh.balances.model.entity.District;

public interface DistrictRepo extends BaseRepository<District,Integer >{

	List<District> findByRegionId(int regionId);

}
