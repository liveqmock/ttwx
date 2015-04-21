package com.fjx.wechat.base.admin.service;

import com.fjx.common.framework.base.service.IBaseAbstractService;
import com.fjx.common.framework.system.pagination.Pagination;
import com.fjx.wechat.base.admin.entity.WechatPublicAccountEntity;
import com.fjx.wechat.base.admin.entity.WechatUserEntity;

import java.util.List;


/**
 * 微信用户分组管理
 * @author fengjx xd-fjx@qq.com
 * @date 2014年11月2日
 */
public interface WechatUserService extends IBaseAbstractService<WechatUserEntity> {
	
	/**
	 * 分页查询用户分组
	 * @param user
	 * @param group_id
	 * @param publicAccoun
	 * @return
	 */
	public Pagination<WechatUserEntity> pageList(WechatUserEntity user, String group_id, WechatPublicAccountEntity publicAccoun);
	
	/**
	 * 更新用户分组
	 * @param user_id
	 * @param group_id
	 */
	public void updateGroup (String user_id, String group_id);

    /**
     * 查询用户信息
     */
	public List<WechatUserEntity> getList(WechatUserEntity user, String group_id, WechatPublicAccountEntity publicAccount);
}
