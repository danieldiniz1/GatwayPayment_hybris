/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 24 de out de 2022 11:45:35                  ---
 * ----------------------------------------------------------------
 */
package br.com.vivo.core.jalo;

import br.com.vivo.core.constants.VivoCoreConstants;
import de.hybris.platform.basecommerce.jalo.site.BaseSite;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem IntegrationConfiguration}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedIntegrationConfiguration extends GenericItem
{
	/** Qualifier of the <code>IntegrationConfiguration.login</code> attribute **/
	public static final String LOGIN = "login";
	/** Qualifier of the <code>IntegrationConfiguration.password</code> attribute **/
	public static final String PASSWORD = "password";
	/** Qualifier of the <code>IntegrationConfiguration.baseSite</code> attribute **/
	public static final String BASESITE = "baseSite";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(LOGIN, AttributeMode.INITIAL);
		tmp.put(PASSWORD, AttributeMode.INITIAL);
		tmp.put(BASESITE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationConfiguration.baseSite</code> attribute.
	 * @return the baseSite
	 */
	public BaseSite getBaseSite(final SessionContext ctx)
	{
		return (BaseSite)getProperty( ctx, BASESITE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationConfiguration.baseSite</code> attribute.
	 * @return the baseSite
	 */
	public BaseSite getBaseSite()
	{
		return getBaseSite( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationConfiguration.baseSite</code> attribute. 
	 * @param value the baseSite
	 */
	public void setBaseSite(final SessionContext ctx, final BaseSite value)
	{
		setProperty(ctx, BASESITE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationConfiguration.baseSite</code> attribute. 
	 * @param value the baseSite
	 */
	public void setBaseSite(final BaseSite value)
	{
		setBaseSite( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationConfiguration.login</code> attribute.
	 * @return the login
	 */
	public String getLogin(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOGIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationConfiguration.login</code> attribute.
	 * @return the login
	 */
	public String getLogin()
	{
		return getLogin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationConfiguration.login</code> attribute. 
	 * @param value the login
	 */
	public void setLogin(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOGIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationConfiguration.login</code> attribute. 
	 * @param value the login
	 */
	public void setLogin(final String value)
	{
		setLogin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationConfiguration.password</code> attribute.
	 * @return the password
	 */
	public String getPassword(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PASSWORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IntegrationConfiguration.password</code> attribute.
	 * @return the password
	 */
	public String getPassword()
	{
		return getPassword( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationConfiguration.password</code> attribute. 
	 * @param value the password
	 */
	public void setPassword(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PASSWORD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IntegrationConfiguration.password</code> attribute. 
	 * @param value the password
	 */
	public void setPassword(final String value)
	{
		setPassword( getSession().getSessionContext(), value );
	}
	
}
