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


package com.gpayments.requestor.sample_requestor.dto.activeserver;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InitAuthRequestBRW
 */

public class InitAuthRequestBRW {

    @JsonProperty("acctID")
    private String acctID = null;

    @JsonProperty("acctInfo")
    private AcctInfo acctInfo = null;

    @JsonProperty("acctNumber")
    private String acctNumber = null;

    @JsonProperty("acctType")
    private String acctType = null;

    @JsonProperty("authenticationInd")
    private String authenticationInd = null;

    @JsonProperty("authenticationInfo")
    private ThreeDSRequestorAuthenticationInfo authenticationInfo = null;

    @JsonProperty("cardExpiryDate")
    private String cardExpiryDate = null;

    @JsonProperty("cardHolderInfo")
    private CardholderInformation cardHolderInfo = null;

    @JsonProperty("challengeInd")
    private String challengeInd = null;

    @JsonProperty("eventCallbackUrl")
    private String eventCallbackUrl = null;

    @JsonProperty("merchantID")
    private String merchantID = null;

    @JsonProperty("merchanrRiskIndicator")
    private MerchantRiskIndicator merchantRiskIndicator;

    @JsonProperty("priorTransID")
    private String priorTransID = null;

    @JsonProperty("purchaseAmount")
    private String purchaseAmount = null;

    @JsonProperty("purchaseCurrency")
    private String purchaseCurrency = null;

    @JsonProperty("purchaseDate")
    private String purchaseDate = null;

    @JsonProperty("purchaseInstalData")
    private String purchaseInstalData = null;

    @JsonProperty("recurringExpiry")
    private String recurringExpiry = null;

    @JsonProperty("recurringFrequency")
    private String recurringFrequency = null;

    @JsonProperty("threeDSRequestorID")
    private String threeDSRequestorID = null;

    @JsonProperty("threeDSRequestorTransID")
    private String threeDSRequestorTransID = null;

    @JsonProperty("transType")
    private String transType = null;

    /**
     * Additional information about the account optionally provided by the 3DS Requestor. Length: Maximum 64 characters
     *
     * @return acctID
     **/
    public String getAcctID() {
        return acctID;
    }

    public void setAcctID(String acctID) {
        this.acctID = acctID;
    }

    /**
     * Additional information about the Cardholder’s account provided by the 3DS Requestor. (This field is optional, but strongly recommended to include.)
     *
     * @return acctInfo
     **/
    public AcctInfo getAcctInfo() {
        return acctInfo;
    }

    public void setAcctInfo(AcctInfo acctInfo) {
        this.acctInfo = acctInfo;
    }

    /**
     * Account number that will be used in the authorisation request for payment transactions.  May be represented by PAN, token. Length: 13–19 characters
     *
     * @return acctNumber
     **/
    public String getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    /**
     * Indicates the type of account. For example, for a multi-account card product.
     * (Required in some markets (for example, for Merchants in Brazil). Otherwise, it is optional.),  Length: 2 characters
     *
     * @return acctType
     **/
    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    /**
     * Indicates the type of Authentication request. This data element provides additional information to the ACS to
     * determine the best approach for handing an authentication request.   Length: 2 characters
     *
     * @return authenticationInd
     **/
    public String getAuthenticationInd() {
        return authenticationInd;
    }

    public void setAuthenticationInd(String authenticationInd) {
        this.authenticationInd = authenticationInd;
    }

    /**
     * Information about how the 3DS Requestor authenticated the cardholder before or during the transaction.
     * (This field is optional but recommended to include)
     *
     * @return authenticationInfo
     **/
    public ThreeDSRequestorAuthenticationInfo getAuthenticationInfo() {
        return authenticationInfo;
    }

    public void setAuthenticationInfo(ThreeDSRequestorAuthenticationInfo authenticationInfo) {
        this.authenticationInfo = authenticationInfo;
    }

    /**
     * Expiry Date of the PAN or token supplied to the 3DS Requestor by the Cardholder. Format accepted: YYMM
     *
     * @return cardExpiryDate
     **/
    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    /**
     * Information about the Cardholder which is provided by the 3DS Requestor.
     *
     * @return cardHolderInfo
     **/
    public CardholderInformation getCardHolderInfo() {
        return cardHolderInfo;
    }

    public void setCardHolderInfo(CardholderInformation cardHolderInfo) {
        this.cardHolderInfo = cardHolderInfo;
    }


    /**
     * Indicates whether a challenge is requested for this transaction. (This field is optional, For 01-PA, a 3DS Requestor may have concerns about the transaction, and request a challenge; For 02-NPA, a challenge may be necessary when adding a new card to a wallet.)
     *
     * @return challengeInd
     **/
    public String getChallengeInd() {
        return challengeInd;
    }

    public void setChallengeInd(String challengeInd) {
        this.challengeInd = challengeInd;
    }


    /**
     * Callback URL for events like 3DS Method Finished or Authentication Result Ready.
     *
     * @return eventCallbackUrl
     **/
    public String getEventCallbackUrl() {
        return eventCallbackUrl;
    }

    public void setEventCallbackUrl(String eventCallbackUrl) {
        this.eventCallbackUrl = eventCallbackUrl;
    }


    /**
     * assigned Merchant identifier.
     *
     * @return merchantID
     **/
    public String getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(String merchantID) {
        this.merchantID = merchantID;
    }

    /**
     * Merchant’s assessment of the level of fraud risk for the specific authentication for both the cardholder and the authentication being conducted.
     *
     * @return
     */
    public MerchantRiskIndicator getMerchantRiskIndicator() {
        return merchantRiskIndicator;
    }

    public void setMerchantRiskIndicator(MerchantRiskIndicator merchantRiskIndicator) {
        this.merchantRiskIndicator = merchantRiskIndicator;
    }

    /**
     * The 3DS Server Transaction ID for a prior authenticated transaction of a cardholder.
     *
     * @return priorTransID
     **/
    public String getPriorTransID() {
        return priorTransID;
    }

    public void setPriorTransID(String priorTransID) {
        this.priorTransID = priorTransID;
    }


    /**
     * Purchase amount in minor units of currency with all punctuation removed. When used in conjunction with the Purchase Currency Exponent field, proper punctuation can be calculated. (Required for 02-NPA if Instalment, or Recurring transactions.), Length: Maximum 48 characters
     *
     * @return purchaseAmount
     **/
    public String getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(String purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }


    /**
     * Currency in which purchase amount is expressed. (Required for 02-NPA if Instalment, or Recurring transactions.), Length: 3 characters; Numeric
     *
     * @return purchaseCurrency
     **/
    public String getPurchaseCurrency() {
        return purchaseCurrency;
    }

    public void setPurchaseCurrency(String purchaseCurrency) {
        this.purchaseCurrency = purchaseCurrency;
    }


    /**
     * Date and time of the purchase, expressed in UTC. Format accepted:  yyyyMMddHHmmss
     *
     * @return purchaseDate
     **/
    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }


    /**
     * Indicates the maximum number of authorisations permitted for instalment payments. (Required if the Merchant and Cardholder have agreed to instalment payments.). Length: Maximum 3 characters
     *
     * @return purchaseInstalData
     **/
    public String getPurchaseInstalData() {
        return purchaseInstalData;
    }

    public void setPurchaseInstalData(String purchaseInstalData) {
        this.purchaseInstalData = purchaseInstalData;
    }

    /**
     * Date after which no further authorisations shall be performed. (Required if Instalment, or Recurring transactions), Format accepted:   yyyyMMdd
     *
     * @return recurringExpiry
     **/
    public String getRecurringExpiry() {
        return recurringExpiry;
    }

    public void setRecurringExpiry(String recurringExpiry) {
        this.recurringExpiry = recurringExpiry;
    }


    /**
     * Indicates the minimum number of days between authorisations. (Required if Instalment, or Recurring transactions), Length: Maximum 4 characters
     *
     * @return recurringFrequency
     **/
    public String getRecurringFrequency() {
        return recurringFrequency;
    }

    public void setRecurringFrequency(String recurringFrequency) {
        this.recurringFrequency = recurringFrequency;
    }


    /**
     * DS assigned 3DS Requestor identifier. Each DS will provide a unique ID to each 3DS Requestor on an individual basis. Length: Maximum 35 characters
     *
     * @return threeDSRequestorID
     **/
    public String getThreeDSRequestorID() {
        return threeDSRequestorID;
    }

    public void setThreeDSRequestorID(String threeDSRequestorID) {
        this.threeDSRequestorID = threeDSRequestorID;
    }


    /**
     * &#39;Universal unique transaction identifier assigned by the 3DS Requestor to identify a single transaction. Length: 36 characters
     *
     * @return threeDSRequestorTransID
     **/
    public String getThreeDSRequestorTransID() {
        return threeDSRequestorTransID;
    }

    public void setThreeDSRequestorTransID(String threeDSRequestorTransID) {
        this.threeDSRequestorTransID = threeDSRequestorTransID;
    }

    /**
     * Identifies the type of transaction being authenticated. (This field is required in some markets (e.g. for Merchants in Brazil). Otherwise, optional.)
     *
     * @return transType
     **/
    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }


    @Override
    public String toString() {
        return "\n{\n" +
                "\t\"acctID\":\"" + acctID + "\",\n" +
                "\t\"acctInfo\":" + acctInfo +
                "\t\"acctNumber\":\"" + acctNumber + "\",\n" +
                "\t\"acctType\":\"" + acctType + "\",\n" +
                "\t\"authenticationInd\":\"" + authenticationInd + "\",\n" +
                "\t\"authenticationInfo\":" + authenticationInfo +
                "\t\"cardExpiryDate\":\"" + cardExpiryDate + "\",\n" +
                "\t\"cardHolderInfo\":" + cardHolderInfo +
                "\t\"challengeInd\":\"" + challengeInd + "\",\n" +
                "\t\"eventCallbackUrl\":\"" + eventCallbackUrl + "\",\n" +
                "\t\"merchantID\":\"" + merchantID + "\",\n" +
                "\t\"merchantRiskIndicator\":" + merchantRiskIndicator +
                "\t\"priorTransID\":\"" + priorTransID + "\",\n" +
                "\t\"purchaseAmount\":\"" + purchaseAmount + "\",\n" +
                "\t\"purchaseCurrency\":\"" + purchaseCurrency + "\",\n" +
                "\t\"purchaseDate\":\"" + purchaseDate + "\",\n" +
                "\t\"purchaseInstalData\":\"" + purchaseInstalData + "\",\n" +
                "\t\"recurringExpiry\":\"" + recurringExpiry + "\",\n" +
                "\t\"recurringFrequency\":\"" + recurringFrequency + "\",\n" +
                "\t\"threeDSRequestorID\":\"" + threeDSRequestorID + "\",\n" +
                "\t\"threeDSRequestorTransID\":\"" + threeDSRequestorTransID + "\",\n" +
                "\t\"transType\":\"" + transType + "\"\n" +
                "}\n";
    }
}

