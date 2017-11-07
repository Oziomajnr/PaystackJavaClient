package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by SQ-OGBE PC on 22/09/2017.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Authorization {
    /**
     * the authorization code for the card,
     * to be used for making transactions on behalf of the user
     */
    private String authorization_code;
    /**
     * the type of card
     */
    private String card_type;
    /**
     * the last four digits on the card
     */
    private Integer last4;
    /**
     * the year the card would expire
     */
    private Integer exp_year;
    /**
     * bank identification number
     */
    private String bin;
    /**
     * the bank that issued  the card to the user
     */
    private String bank;
    /**
     * the channel of this authorization "bank" or "card"
     */
    private String channel;
    /**
     * can this authorzation be used to make transaction on behalf of the user
     */
    private boolean reusable;
    /**
     * country code of the authorization e.g "NG"
     */
    private String country_code;

    public Authorization() {
    }

    public String getAuthorization_code() {
        return authorization_code;
    }

    public void setAuthorization_code(String authorization_code) {
        this.authorization_code = authorization_code;
    }

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public Integer getLast4() {
        return last4;
    }

    public void setLast4(Integer last4) {
        this.last4 = last4;
    }

    public Integer getExp_year() {
        return exp_year;
    }

    public void setExp_year(Integer exp_year) {
        this.exp_year = exp_year;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public boolean isReusable() {
        return reusable;
    }

    public void setReusable(boolean reusable) {
        this.reusable = reusable;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }
}