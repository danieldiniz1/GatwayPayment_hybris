/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31 de out de 2022 15:41:44                  ---
 * ----------------------------------------------------------------
 */
package br.com.vivo.core.jalo;

import br.com.vivo.core.constants.VivoCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem VivoPaymentInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVivoPaymentInfo extends GenericItem
{
	/** Qualifier of the <code>VivoPaymentInfo.creditCardNumber</code> attribute **/
	public static final String CREDITCARDNUMBER = "creditCardNumber";
	/** Qualifier of the <code>VivoPaymentInfo.creditCardCVV</code> attribute **/
	public static final String CREDITCARDCVV = "creditCardCVV";
	/** Qualifier of the <code>VivoPaymentInfo.creditCardDateValidate</code> attribute **/
	public static final String CREDITCARDDATEVALIDATE = "creditCardDateValidate";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CREDITCARDNUMBER, AttributeMode.INITIAL);
		tmp.put(CREDITCARDCVV, AttributeMode.INITIAL);
		tmp.put(CREDITCARDDATEVALIDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VivoPaymentInfo.creditCardCVV</code> attribute.
	 * @return the creditCardCVV
	 */
	public String getCreditCardCVV(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREDITCARDCVV);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VivoPaymentInfo.creditCardCVV</code> attribute.
	 * @return the creditCardCVV
	 */
	public String getCreditCardCVV()
	{
		return getCreditCardCVV( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VivoPaymentInfo.creditCardCVV</code> attribute. 
	 * @param value the creditCardCVV
	 */
	public void setCreditCardCVV(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREDITCARDCVV,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VivoPaymentInfo.creditCardCVV</code> attribute. 
	 * @param value the creditCardCVV
	 */
	public void setCreditCardCVV(final String value)
	{
		setCreditCardCVV( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VivoPaymentInfo.creditCardDateValidate</code> attribute.
	 * @return the creditCardDateValidate
	 */
	public String getCreditCardDateValidate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREDITCARDDATEVALIDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VivoPaymentInfo.creditCardDateValidate</code> attribute.
	 * @return the creditCardDateValidate
	 */
	public String getCreditCardDateValidate()
	{
		return getCreditCardDateValidate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VivoPaymentInfo.creditCardDateValidate</code> attribute. 
	 * @param value the creditCardDateValidate
	 */
	public void setCreditCardDateValidate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREDITCARDDATEVALIDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VivoPaymentInfo.creditCardDateValidate</code> attribute. 
	 * @param value the creditCardDateValidate
	 */
	public void setCreditCardDateValidate(final String value)
	{
		setCreditCardDateValidate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VivoPaymentInfo.creditCardNumber</code> attribute.
	 * @return the creditCardNumber
	 */
	public String getCreditCardNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREDITCARDNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VivoPaymentInfo.creditCardNumber</code> attribute.
	 * @return the creditCardNumber
	 */
	public String getCreditCardNumber()
	{
		return getCreditCardNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VivoPaymentInfo.creditCardNumber</code> attribute. 
	 * @param value the creditCardNumber
	 */
	public void setCreditCardNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREDITCARDNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VivoPaymentInfo.creditCardNumber</code> attribute. 
	 * @param value the creditCardNumber
	 */
	public void setCreditCardNumber(final String value)
	{
		setCreditCardNumber( getSession().getSessionContext(), value );
	}
	
}
