package br.com.vivo.facades.form;

import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CompraCartaoForm {

    @NotBlank()
    @Length(min=3,max=255)
    private String nomeCliente;
    @Email
    private String email;
    private String numeroPedido;
    @NotBlank()
    private String valor;
    @NotBlank()
    @Size(min = 16, max = 16, message = "{payment.numeroCartao.invalid}")
    @Pattern(regexp = "[a-z|d*$]", message = "{payment.numeroCartao.invalid}")
    private String numeroCartao;
    @NotBlank()
    private String vencimentoCartao;
    @NotBlank()
    @Size(min = 3, max = 3, message = "{payment.cvvCartao.invalid}")
    private String cvvCartao;
    @NotBlank()
    private Boolean saveInfo;

    public CompraCartaoForm() {
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }


    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getVencimentoCartao() {
        return vencimentoCartao;
    }

    public void setVencimentoCartao(String vencimentoCartao) {
        this.vencimentoCartao = vencimentoCartao;
    }

    public String getCvvCartao() {
        return cvvCartao;
    }

    public void setCvvCartao(String cvvCartao) {
        this.cvvCartao = cvvCartao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Boolean getSaveInfo() {
        return saveInfo;
    }

    public void setSaveInfo(Boolean saveInfo) {
        this.saveInfo = saveInfo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
