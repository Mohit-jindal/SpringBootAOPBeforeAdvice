package com.infotech.app.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.infotech.app.model.Account;
import com.infotech.app.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	private static Map<String, Account> map = null;
	
	static
	{
		map = new HashMap<>();
		map.put("c67669800", new Account("78278287000", "Saving Account"));
		map.put("c67669811", new Account("78278287111", "Current Account"));
	}
	
	@Override
	public Account getAccountByCustomerId(String customerId) throws Exception {
		if (customerId == null) {
			throw new Exception("Customer Id is invalid");
		}
		Account account = null;
		Set<Entry<String,Account>> entrySet = map.entrySet();
		for(Entry<String, Account> entry  : entrySet)
		{
			if(entry.getKey().equals(customerId))
			{
				account = entry.getValue();
			}
		}
		return account;
	}

	

}
