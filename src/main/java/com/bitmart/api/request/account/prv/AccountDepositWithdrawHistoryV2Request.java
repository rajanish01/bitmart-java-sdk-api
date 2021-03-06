package com.bitmart.api.request.account.prv;

import com.bitmart.api.annotations.ParamKey;
import com.bitmart.api.request.Auth;
import com.bitmart.api.request.CloudRequest;
import com.bitmart.api.request.Method;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
@Accessors(chain = true)
public class AccountDepositWithdrawHistoryV2Request extends CloudRequest {

    @ParamKey("currency")
    private String currency;        //Token symbol, e.g., 'BTC'

    @ParamKey("operation_type")
    private String operationType;   //Type deposit=deposit; withdraw=withdraw


    @ParamKey("N")
    private int N;                  //Recent N records (value range 1-100)

    /**
     * url: GET https://api-cloud.bitmart.com/account/v2/deposit-withdraw/history
     * Search for all existed withdraws and deposits and return their latest status.
     */
    public AccountDepositWithdrawHistoryV2Request() {
        super("/account/v2/deposit-withdraw/history", Method.GET, Auth.KEYED);
    }

}
