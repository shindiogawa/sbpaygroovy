package br.com.ogawadev.sbpaygroovy

class PaymentResponse {

    StatusPagamento statusPagamento
    String error

    PaymentResponse(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento
    }

    PaymentResponse(String error) {
        this.error = error
    }
}
