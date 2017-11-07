package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by SQ-OGBE PC on 22/09/2017.
 */
@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Plan {
    private Integer id;
    private String name;
    private String plan_code;
    private Integer amount;
    private String interval;
    private String send_invoices;
    private String send_sms;
    private String NGN;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlan_code() {
        return plan_code;
    }

    public void setPlan_code(String plan_code) {
        this.plan_code = plan_code;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getSend_invoices() {
        return send_invoices;
    }

    public void setSend_invoices(String send_invoices) {
        this.send_invoices = send_invoices;
    }

    public String getSend_sms() {
        return send_sms;
    }

    public void setSend_sms(String send_sms) {
        this.send_sms = send_sms;
    }

    public String getNGN() {
        return NGN;
    }

    public void setNGN(String NGN) {
        this.NGN = NGN;
    }
}
