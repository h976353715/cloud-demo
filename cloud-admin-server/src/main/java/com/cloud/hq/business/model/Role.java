package com.cloud.hq.business.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author hq
 * @since 2019-07-28
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_role")
public class Role extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("roleName")
    private String roleName;

    @TableField("roleCode")
    private String roleCode;

    @TableField("useFlag")
    private Integer useFlag;

    @TableField("delFlag")
    private Integer delFlag;

    @TableField("createTime")
    private LocalDateTime createTime;

    @TableField("createUser")
    private String createUser;

    @TableField("updateTime")
    private LocalDateTime updateTime;

    @TableField("updateUser")
    private String updateUser;


}
