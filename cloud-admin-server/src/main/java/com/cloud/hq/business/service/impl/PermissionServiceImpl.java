package com.cloud.hq.business.service.impl;

import com.cloud.hq.business.model.Permission;
import com.cloud.hq.business.mapper.PermissionMapper;
import com.cloud.hq.business.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源表 服务实现类
 * </p>
 *
 * @author hq
 * @since 2019-07-28
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
