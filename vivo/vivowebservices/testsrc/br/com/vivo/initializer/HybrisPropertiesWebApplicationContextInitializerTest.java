/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.vivo.initializer;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.webservicescommons.testsupport.client.WsSecuredRequestBuilder;
import de.hybris.platform.webservicescommons.testsupport.server.NeedsEmbeddedServer;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.vivo.constants.VivowebservicesConstants;
import br.com.vivo.dto.SampleWsDTO;


@IntegrationTest
@NeedsEmbeddedServer(webExtensions =
{ VivowebservicesConstants.EXTENSIONNAME, "oauth2" })
public class HybrisPropertiesWebApplicationContextInitializerTest extends ServicelayerTest
{
	public static final String OAUTH_CLIENT_ID = "mobile_android";
	public static final String OAUTH_CLIENT_PASS = "secret";

	private WsSecuredRequestBuilder wsSecuredRequestBuilder;

	@Before
	public void setUp() throws Exception
	{
		wsSecuredRequestBuilder = new WsSecuredRequestBuilder()//
				.extensionName(VivowebservicesConstants.EXTENSIONNAME)//
				.client(OAUTH_CLIENT_ID, OAUTH_CLIENT_PASS);

		createCoreData();
		importCsv("/vivowebservices/test/democustomer-data.impex", "utf-8");
	}

	@Test
	public void testSpringFileOverride() throws IOException
	{
		final Response response = wsSecuredRequestBuilder.grantClientCredentials().path("/sample/testBean").build()
				.accept(MediaType.APPLICATION_JSON).get();

		Assert.assertEquals(HttpServletResponse.SC_OK, response.getStatus());

		final SampleWsDTO testBean = response.readEntity(SampleWsDTO.class);
		Assert.assertEquals("testText", testBean.getValue());
	}
}
