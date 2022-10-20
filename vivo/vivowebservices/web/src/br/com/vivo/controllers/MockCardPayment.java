package br.com.vivo.controllers;

import br.com.vivo.controllers.form.CompraCartaoForm;
import br.com.vivo.validator.CompraCartaoFormValidator;
import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("mockcard")
public class MockCardPayment {

    private static final Logger LOGGER = Logger.getLogger(MockCardPayment.class);

    @Resource()
    private CompraCartaoFormValidator compraCartaoFormValidator;

    @PostMapping("compra-cartao")
    public ResponseEntity mockCompraCartao(@RequestBody CompraCartaoForm form){
        compraCartaoFormValidator.validate(form);


        if(form.getNumeroCartao().equals("1")){
            LOGGER.info("deve lançar um runtime exception");
            throw new RuntimeException("teste controller erro");
        }
        LOGGER.info("NÃO deve lançar um runtime exception");
        return ResponseEntity.ok().build();
    }
}
