package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by SQ-OGBE PC on 22/09/2017.
 * This charge event is posted by paystack to our webhook url whenever they have completed a transaction from a user
 * after the trasnaction is completed then we have to verify using the values in this class
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaystackChargeEvent {
    private String event;
    private Data data;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
