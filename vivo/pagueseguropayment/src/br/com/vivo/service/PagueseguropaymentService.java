/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.vivo.service;

public interface PagueseguropaymentService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);

	void getToken();
}
