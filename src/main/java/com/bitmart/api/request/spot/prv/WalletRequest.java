package com.bitmart.api.request.spot.prv;

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
public final class WalletRequest extends CloudRequest {

    @ParamKey("currency")
    private String currency;

    /**
     * url: GET https://api-cloud.bitmart.com/spot/v1/wallet
     * Get the user's wallet balance for all currencies
     */
    public WalletRequest() {
        super("/spot/v1/wallet", Method.GET, Auth.KEYED);
    }
}
