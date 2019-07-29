package com.cloud.hq.business.feign;

import com.cloud.hq.business.feign.fallback.BusinessApiClientFallback;
import com.cloud.hq.business.model.BizResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author huangqi
 * @Package com.cloud.hq.business.feign
 * @Description:
 * @date 2019-07-29 17:09
 */
@FeignClient(value = "cloud-business-server", fallback = BusinessApiClientFallback.class)
public interface BusinessApiClient {

    @GetMapping("/order/update")
    BizResult update();
}
