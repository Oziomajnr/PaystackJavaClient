package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by SQ-OGBE PC on 21/09/2017.
 * the response returned from the paystack verification
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaystackVerifyTransactionResponse {

    private String status;
    private String message;
    private PaystackData data;

    public PaystackVerifyTransactionResponse() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PaystackData getData() {
        return data;
    }

    public void setData(PaystackData data) {
        this.data = data;
    }

}
