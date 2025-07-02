package com.anh.balances.controller.member;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anh.balances.model.entity.District;
import com.anh.balances.model.entity.Township;
import com.anh.balances.service.LocationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("member/location")
public class MemberLocationApi {
     
	 private final LocationService service;
	
	 @GetMapping("district")
	 List<District> findDestrict(@RequestParam int regionId){
		  return service.findDistrictByRegion(regionId);
	 }
	
	 @GetMapping("township")
	 List<Township> findTownship(@RequestParam int districtId){
		  return service.findTownshipByDistrict(districtId);
	 }
	
}
