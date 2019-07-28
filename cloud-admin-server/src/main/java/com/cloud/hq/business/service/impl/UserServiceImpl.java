package com.cloud.hq.business.service.impl;

import com.cloud.hq.business.model.User;
import com.cloud.hq.business.mapper.UserMapper;
import com.cloud.hq.business.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账户表 服务实现类
 * </p>
 *
 * @author hq
 * @since 2019-07-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
