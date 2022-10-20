package br.com.vivo.controllers.handler;

import java.time.LocalDateTime;

public class StandardError {

    private Integer status;
    private String message;
    private LocalDateTime timeStamp;

    private StandardError(Integer status, String message, LocalDateTime timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public static StandardError valueOf(Integer status, String messagem, LocalDateTime dataEHora){
        return new StandardError(status,messagem,dataEHora);
    }
}
