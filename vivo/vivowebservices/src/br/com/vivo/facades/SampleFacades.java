/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.vivo.facades;

import de.hybris.platform.core.servicelayer.data.SearchPageData;

import java.util.List;

import br.com.vivo.data.UserData;
import br.com.vivo.dto.SampleWsDTO;
import br.com.vivo.dto.TestMapWsDTO;


public interface SampleFacades
{
	SampleWsDTO getSampleWsDTO(final String value);

	UserData getUser(String id);

	List<UserData> getUsers();

	SearchPageData<UserData> getUsers(SearchPageData<?> params);

	TestMapWsDTO getMap();
}
