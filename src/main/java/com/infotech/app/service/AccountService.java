package com.infotech.app.service;

import com.infotech.app.model.Account;

public interface AccountService {

	public abstract Account getAccountByCustomerId(String customerId) throws Exception;
}
