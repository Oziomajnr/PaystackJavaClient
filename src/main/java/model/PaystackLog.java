package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * Created by SQ-OGBE PC on 22/09/2017.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaystackLog {

    public PaystackLog() {
    }

    private Integer time_spent;
    private Integer attempts;
    private String authentication;
    private Integer errors;
    private boolean success;
    private boolean mobile;
    private List<Object> input;
    private String channel;
    private List<PaystackHistory> history;

    public Integer getTime_spent() {
        return time_spent;
    }

    public void setTime_spent(Integer time_spent) {
        this.time_spent = time_spent;
    }

    public Integer getAttempts() {
        return attempts;
    }

    public void setAttempts(Integer attempts) {
        this.attempts = attempts;
    }

    public String getAuthentication() {
        return authentication;
    }

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    public Integer getErrors() {
        return errors;
    }

    public void setErrors(Integer errors) {
        this.errors = errors;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isMobile() {
        return mobile;
    }

    public void setMobile(boolean mobile) {
        this.mobile = mobile;
    }

    public List<Object> getInput() {
        return input;
    }

    public void setInput(List<Object> input) {
        this.input = input;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public List<PaystackHistory> getHistory() {
        return history;
    }

    public void setHistory(List<PaystackHistory> history) {
        this.history = history;
    }
}
