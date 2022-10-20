package br.com.vivo.validator;

import br.com.vivo.controllers.form.CompraCartaoForm;
import org.springframework.util.Assert;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class CompraCartaoFormValidator{

    public void validate(CompraCartaoForm form) {
        Assert.hasText(form.getCvvCartao(),"CVV não pode ser nulo");
    }
}
