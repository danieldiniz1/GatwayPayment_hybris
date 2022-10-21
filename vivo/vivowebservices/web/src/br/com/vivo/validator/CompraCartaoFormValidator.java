package br.com.vivo.validator;

import br.com.vivo.facades.form.CompraCartaoForm;
import org.springframework.util.Assert;

public class CompraCartaoFormValidator{

    public void validate(CompraCartaoForm form) {
        Assert.hasText(form.getCvvCartao(),"CVV não pode ser nulo");
    }
}
