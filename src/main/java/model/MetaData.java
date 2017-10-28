package model;

/**
 * Created by SQ-OGBE PC on 28/10/2017.
 * This class is used to add extra information to a paystack transaction during initialization
 */
public class MetaData {
    /**
     * URL customer is redirected to if the cancel button is clicked.
     */
    private String cancel_action;

    public String getCancel_action() {
        return cancel_action;
    }

    public void setCancel_action(String cancel_action) {
        this.cancel_action = cancel_action;
    }
}
