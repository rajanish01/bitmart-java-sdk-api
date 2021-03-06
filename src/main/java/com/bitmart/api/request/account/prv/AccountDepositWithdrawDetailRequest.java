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
public class AccountDepositWithdrawDetailRequest extends CloudRequest {

    @ParamKey("id")
    private Long id;    //withdraw_id or deposit_id


    /**
     * url: GET https://api-cloud.bitmart.com/account/v1/deposit-withdraw/detail
     * Query a single charge record
     */
    public AccountDepositWithdrawDetailRequest() {
        super("/account/v1/deposit-withdraw/detail", Method.GET, Auth.KEYED);
    }
}

