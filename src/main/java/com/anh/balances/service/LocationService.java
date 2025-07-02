package com.anh.balances.service;

import static com.anh.balances.utils.EntityOperations.safeCall;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anh.balances.model.entity.District;
import com.anh.balances.model.entity.Region;
import com.anh.balances.model.entity.Township;
import com.anh.balances.model.repo.DistrictRepo;
import com.anh.balances.model.repo.RegionRepo;
import com.anh.balances.model.repo.TownshipRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class LocationService {
    
	private final RegionRepo regionRepo;
	private final DistrictRepo districtRepo;
	private final TownshipRepo townshipRepo;
	
	
	public List<Region> getAllLocations() {
		return regionRepo.findAll();
	}

	public List<District> findDistrictByRegion(int regionId) {
		return districtRepo.findByRegionId(regionId);
	}

	public List<Township> findTownshipByDistrict(int districtId) {
		return townshipRepo.findByDistrictId(districtId);
	}

	public List<District> getDistrictForSelectedTownship(Integer townshipId) {
       	
		if(null != townshipId) {
			 var township = safeCall(townshipRepo.findById(townshipId), "township", "id", townshipId);
		     var regionId = township.getDistrict().getRegion().getId();
		     
             return districtRepo.findByRegionId(regionId);			 
		}
		
		return null;
	}

	public List<Township> getTownshipForSelectedTownship(Integer townshipId) {
		
		if(null != townshipId) {
			 var township = safeCall(townshipRepo.findById(townshipId), "township", "id", townshipId);
		     var districtId = township.getDistrict().getId();
		     
            return townshipRepo.findByDistrictId(districtId);			 
		}
		
		return null;
	}
      
}
