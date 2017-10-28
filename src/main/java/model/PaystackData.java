package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

/**
 * Created by SQ-OGBE PC on 22/09/2017.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public  class PaystackData {
    private BigDecimal amount;
    private String currency;
    private String transaction_date;
    private String status;
    private String reference;
    private String domain;
   // private String metadata;
    private String gateway_response;
    private String message;
    private String channel;
    private String ip_address;
    private String fees;
    private PaystackPlan plan;
    private PaystackLog log;
    private String paid_at;
    private PaystackAuthorization authorization;

    public PaystackData() {
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

//    public String getMetadata() {
//        return metadata;
//    }
//
//    public void setMetadata(String metadata) {
//        this.metadata = metadata;
//    }

    public String getGateway_response() {
        return gateway_response;
    }

    public void setGateway_response(String gateway_response) {
        this.gateway_response = gateway_response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public PaystackPlan getPlan() {
        return plan;
    }

    public void setPlan(PaystackPlan plan) {
        this.plan = plan;
    }

    public PaystackLog getLog() {
        return log;
    }

    public void setLog(PaystackLog log) {
        this.log = log;
    }

    public String getPaid_at() {
        return paid_at;
    }

    public void setPaid_at(String paid_at) {
        this.paid_at = paid_at;
    }

    public PaystackAuthorization getAuthorization() {
        return authorization;
    }

    public void setAuthorization(PaystackAuthorization authorization) {
        this.authorization = authorization;
    }
}
