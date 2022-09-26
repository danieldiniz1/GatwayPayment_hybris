/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.vivo.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.vivo.dto.SampleWsDTO;


public class SampleWsDTOValidator implements Validator
{
	@Override
	public boolean supports(final Class clazz)
	{
		return SampleWsDTO.class.equals(clazz);
	}

	@Override
	public void validate(final Object target, final Errors errors)
	{
		ValidationUtils.rejectIfEmpty(errors, "value", "field.required");
	}
}
