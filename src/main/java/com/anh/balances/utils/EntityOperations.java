package com.anh.balances.utils;

import java.util.Optional;

import com.anh.balances.utils.exception.AppBusinessException;

public class EntityOperations {
     
	public static <T,ID> T safeCall(Optional<T> optional,String resourceName,String key,ID keyValue) {
		 return optional
				.orElseThrow(()-> new AppBusinessException("There is no %s member with %s : %s".formatted(resourceName,key,keyValue)));
	}
	  
}
