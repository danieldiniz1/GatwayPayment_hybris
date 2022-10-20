package br.com.vivo.controllers;

import br.com.vivo.controllers.form.CompraCartaoForm;
import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("mockcard")
public class MockCardPayment {

    private static final Logger LOGGER = Logger.getLogger(MockCardPayment.class);


    @PostMapping("compra-cartao")
    public ResponseEntity mockCompraCartao(@RequestBody CompraCartaoForm form){
        if(form.getNumeroCartao().equals("1")){
            LOGGER.info("deve lançar um runtime exception");
            throw new RuntimeException("teste controller erro");
        }
        LOGGER.info("NÃO deve lançar um runtime exception");
        return ResponseEntity.ok().build();
    }
}
