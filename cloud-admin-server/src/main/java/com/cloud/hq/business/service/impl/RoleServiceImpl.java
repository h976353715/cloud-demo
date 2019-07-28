package com.cloud.hq.business.service.impl;

import com.cloud.hq.business.model.Role;
import com.cloud.hq.business.mapper.RoleMapper;
import com.cloud.hq.business.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author hq
 * @since 2019-07-28
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
