package com.cloud.hq.business.feign.fallback;

import com.cloud.hq.business.enums.BizResultEnum;
import com.cloud.hq.business.feign.BusinessApiClient;
import com.cloud.hq.business.model.BizResult;
import org.springframework.stereotype.Component;

/**
 * @author huangqi
 * @Package com.cloud.hq.business.feign.fallback
 * @Description:
 * @date 2019-07-29 17:11
 */
@Component
public class BusinessApiClientFallback implements BusinessApiClient {
    @Override
    public BizResult update() {
        return BizResult.fail(BizResultEnum.SERVER_ERROR);
    }
}
