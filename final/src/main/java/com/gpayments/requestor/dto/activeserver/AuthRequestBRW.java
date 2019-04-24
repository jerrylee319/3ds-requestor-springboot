/**
 * GPayments 3DS Server API Reference
 * Welcome to the 3DS Server RESTful API. You can use our API to access 3DS Server functionalities.  The 3DS Server API is organised around REST. Our API has predictable, resource-oriented URLs, and uses HTTP response codes to indicate API errors. We use built-in HTTP features, such as HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We support cross-origin resource sharing, allowing you to interact securely with our API from a dto-side web application (though you should never expose your secret API key in any public website’s dto-side code). JSON is returned by all API responses, including errors.
 * <p>
 * <p>
 * Contact: techsupport@gpayments.com
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gpayments.requestor.dto.activeserver;


import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * AuthRequestBRW
 */

public class AuthRequestBRW {
    @JsonProperty("threeDSRequestorTransID")
    private String threeDSRequestorTransID = null;

    @JsonProperty("threeDSServerTransID")
    private String threeDSServerTransID = null;

    /**
     * 'Universal unique transaction identifier assigned by the 3DS Requestor to identify a single transaction. Length: 36 characters
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
     * The threeDSServerTransID received in threeDSMethodURLProcess, Length: 36 characters
     *
     * @return threeDSServerTransID
     **/
    public String getThreeDSServerTransID() {
        return threeDSServerTransID;
    }

    public void setThreeDSServerTransID(String threeDSServerTransID) {
        this.threeDSServerTransID = threeDSServerTransID;
    }

    @Override
    public String toString() {
        return "\n{\n" +
                "\t\"threeDSRequestorTransID\":\"" + threeDSRequestorTransID + "\",\n" +
                "\t\"threeDSServerTransID\":\"" + threeDSServerTransID + "\"\n" +
                "}";
    }
}

