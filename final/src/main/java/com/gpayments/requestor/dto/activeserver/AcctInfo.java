/*
 * GPayments 3DS Server API Reference
 * Welcome to the 3DS Server RESTful API. You can use our API to access 3DS Server functionalities.  The 3DS Server API is organised around REST. Our API has predictable, resource-oriented URLs, and uses HTTP response codes to indicate API errors. We use built-in HTTP features, such as HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We support cross-origin resource sharing, allowing you to interact securely with our API from a client-side web application (though you should never expose your secret API key in any public website’s client-side code). JSON is returned by all API responses, including errors.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: techsupport@gpayments.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.gpayments.requestor.dto.activeserver;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional information about the Cardholder’s account provided by the 3DS Requestor.
 */
public class AcctInfo {

    @JsonProperty("chAccAgeInd")
    private String chAccAgeInd = null;

    @JsonProperty("chAccChange")
    private String chAccChange = null;

    @JsonProperty("chAccChangeInd")
    private String chAccChangeInd = null;

    @JsonProperty("chAccDate")
    private String chAccDate = null;

    @JsonProperty("chAccPwChange")
    private String chAccPwChange = null;

    @JsonProperty("chAccPwChangeInd")
    private String chAccPwChangeInd = null;

    @JsonProperty("nbPurchaseAccount")
    private String nbPurchaseAccount = null;

    @JsonProperty("paymentAccAge")
    private String paymentAccAge = null;

    @JsonProperty("paymentAccInd")
    private String paymentAccInd = null;

    @JsonProperty("provisionAttemptsDay")
    private String provisionAttemptsDay = null;

    @JsonProperty("shipAddressUsage")
    private String shipAddressUsage = null;

    @JsonProperty("shipAddressUsageInd")
    private String shipAddressUsageInd = null;

    @JsonProperty("shipNameIndicator")
    private String shipNameIndicator = null;

    @JsonProperty("suspiciousAccActivity")
    private String suspiciousAccActivity = null;

    @JsonProperty("txnActivityDay")
    private String txnActivityDay = null;

    @JsonProperty("txnActivityYear")
    private String txnActivityYear = null;

    /**
     * Length of time that the cardholder has had the account with the 3DS Requestor. Values accepted: [01-05]
     *
     * @return chAccAgeInd
     **/
    public String getChAccAgeInd() {
        return chAccAgeInd;
    }

    public void setChAccAgeInd(String chAccAgeInd) {
        this.chAccAgeInd = chAccAgeInd;
    }

    /**
     * Date that the cardholder&#39;s account with the 3DS Requestor was last changed. Including Billing or Shipping address, new payment account, or new user(s) added. Format accepted: YYYYMMDD
     *
     * @return chAccChange
     **/
    public String getChAccChange() {
        return chAccChange;
    }

    public void setChAccChange(String chAccChange) {
        this.chAccChange = chAccChange;
    }


    /**
     * Length of time since the cardholder&#39;s account information with the 3DS Requestor was last changed. Including Billing or Shipping address, new payment account, or new user(s) added. Values accepted: [01-04]
     *
     * @return chAccChangeInd
     **/
    public String getChAccChangeInd() {
        return chAccChangeInd;
    }

    public void setChAccChangeInd(String chAccChangeInd) {
        this.chAccChangeInd = chAccChangeInd;
    }

    /**
     * Date that the cardholder opened the account with the 3DS Requestor. Date format &#x3D; YYYYMMDD
     *
     * @return chAccDate
     **/
    public String getChAccDate() {
        return chAccDate;
    }

    public void setChAccDate(String chAccDate) {
        this.chAccDate = chAccDate;
    }


    /**
     * Date that cardholder&#39;s account with the 3DS Requestor had a password change or account reset. Format accepted: YYYYMMDD
     *
     * @return chAccPwChange
     **/
    public String getChAccPwChange() {
        return chAccPwChange;
    }

    public void setChAccPwChange(String chAccPwChange) {
        this.chAccPwChange = chAccPwChange;
    }


    /**
     * Length of time since the cardholder&#39;s account with the 3DS Requestor had a password change or account reset. Values accepted: [01-05]
     *
     * @return chAccPwChangeInd
     **/
    public String getChAccPwChangeInd() {
        return chAccPwChangeInd;
    }

    public void setChAccPwChangeInd(String chAccPwChangeInd) {
        this.chAccPwChangeInd = chAccPwChangeInd;
    }


    /**
     * Number of purchases with this cardholder account during the previous six months. Length: maximum 4 characters
     *
     * @return nbPurchaseAccount
     **/
    public String getNbPurchaseAccount() {
        return nbPurchaseAccount;
    }

    public void setNbPurchaseAccount(String nbPurchaseAccount) {
        this.nbPurchaseAccount = nbPurchaseAccount;
    }


    /**
     * Date that the payment account was enrolled in the cardholder&#39;s account with the 3DS Requestor. Format accepted: YYYYMMDD
     *
     * @return paymentAccAge
     **/
    public String getPaymentAccAge() {
        return paymentAccAge;
    }

    public void setPaymentAccAge(String paymentAccAge) {
        this.paymentAccAge = paymentAccAge;
    }


    /**
     * Indicates the length of time that the payment account was enrolled in the cardholder&#39;s account with the 3DS Requestor. Values accepted: [01-05]
     *
     * @return paymentAccInd
     **/
    public String getPaymentAccInd() {
        return paymentAccInd;
    }

    public void setPaymentAccInd(String paymentAccInd) {
        this.paymentAccInd = paymentAccInd;
    }


    /**
     * Number of Add Card attempts in the last 24 hours. Length: maximum 3 characters
     *
     * @return provisionAttemptsDay
     **/
    public String getProvisionAttemptsDay() {
        return provisionAttemptsDay;
    }

    public void setProvisionAttemptsDay(String provisionAttemptsDay) {
        this.provisionAttemptsDay = provisionAttemptsDay;
    }


    /**
     * Date when the shipping address used for this transaction was first used with the 3DS Requestor. Format accepted: YYYYMMDD
     *
     * @return shipAddressUsage
     **/
    public String getShipAddressUsage() {
        return shipAddressUsage;
    }

    public void setShipAddressUsage(String shipAddressUsage) {
        this.shipAddressUsage = shipAddressUsage;
    }


    /**
     * Indicates when the shipping address used for this transaction was first used with the 3DS Requestor. Values accepted: [01-04]
     *
     * @return shipAddressUsageInd
     **/
    public String getShipAddressUsageInd() {
        return shipAddressUsageInd;
    }

    public void setShipAddressUsageInd(String shipAddressUsageInd) {
        this.shipAddressUsageInd = shipAddressUsageInd;
    }


    /**
     * Indicates if the Cardholder Name on the account is identical to the shipping Name used for this transaction. Values accepted: [01,02]
     *
     * @return shipNameIndicator
     **/
    public String getShipNameIndicator() {
        return shipNameIndicator;
    }

    public void setShipNameIndicator(String shipNameIndicator) {
        this.shipNameIndicator = shipNameIndicator;
    }


    /**
     * Indicates whether the 3DS Requestor has experienced suspicious activity (including previous fraud) on the cardholder account. Values accepted: [01,02]
     *
     * @return suspiciousAccActivity
     **/
    public String getSuspiciousAccActivity() {
        return suspiciousAccActivity;
    }

    public void setSuspiciousAccActivity(String suspiciousAccActivity) {
        this.suspiciousAccActivity = suspiciousAccActivity;
    }


    /**
     * Number of transactions (successful and abandoned) for this cardholder account with the 3DS Requestor across all payment accounts in the previous 24 hours. Length: maximum 3 characters
     *
     * @return txnActivityDay
     **/
    public String getTxnActivityDay() {
        return txnActivityDay;
    }

    public void setTxnActivityDay(String txnActivityDay) {
        this.txnActivityDay = txnActivityDay;
    }

    /**
     * Number of transactions (successful and abandoned) for this cardholder account with the 3DS Requestor across all payment accounts in the previous year. Length: maximum 3 characters
     *
     * @return txnActivityYear
     **/
    public String getTxnActivityYear() {
        return txnActivityYear;
    }

    public void setTxnActivityYear(String txnActivityYear) {
        this.txnActivityYear = txnActivityYear;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\t\t\"chAccAgeInd\":\"" + chAccAgeInd + "\",\n" +
                "\t\t\"chAccChange\":\"" + chAccChange + "\",\n" +
                "\t\t\"chAccChangeInd\":\"" + chAccChangeInd + "\",\n" +
                "\t\t\"chAccDate\":\"" + chAccDate + "\",\n" +
                "\t\t\"chAccPwChange\":\"" + chAccPwChange + "\",\n" +
                "\t\t\"chAccPwChangeInd\":\"" + chAccPwChangeInd + "\",\n" +
                "\t\t\"nbPurchaseAccount\":\"" + nbPurchaseAccount + "\",\n" +
                "\t\t\"paymentAccAge\":\"" + paymentAccAge + "\",\n" +
                "\t\t\"paymentAccInd\":\"" + paymentAccInd + "\",\n" +
                "\t\t\"provisionAttemptsDay\":\"" + provisionAttemptsDay + "\",\n" +
                "\t\t\"shipAddressUsage\":\"" + shipAddressUsage + "\",\n" +
                "\t\t\"shipAddressUsageInd\":\"" + shipAddressUsageInd + "\",\n" +
                "\t\t\"shipNameIndicator\":\"" + shipNameIndicator + "\",\n" +
                "\t\t\"suspiciousAccActivity\":\"" + suspiciousAccActivity + "\",\n" +
                "\t\t\"txnActivityDay\":\"" + txnActivityDay + "\",\n" +
                "\t\t\"txnActivityYear\":\"" + txnActivityYear + "\"\n" +
                "\t},\n";
    }
}

