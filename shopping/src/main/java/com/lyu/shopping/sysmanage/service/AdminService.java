package com.lyu.shopping.sysmanage.service;

import java.util.List;

import com.lyu.shopping.sysmanage.entity.Admin;

/**
 * 类描述：访问用户数据的服务类
 * 类名称：com.lyu.shopping.sysmanage.service.AdminService
 * @author 曲健磊
 * 2018年2月25日.下午1:45:04
 * @version V1.0
 */
public interface AdminService {

	/**
	 * 通过管理员id获取管理员的详细信息
	 * @param adminId 管理员id
	 * @return
	 */
	Admin getAdminByAdminId(Long adminId);
	
	/**
	 * 验证用户是否存在，若存在，继续验证密码是否匹配
	 * @param loginName 用户登录名称
	 * @param password 密码
	 * @return
	 */
	Admin loginAdmin(String loginName, String password);
	
	/**
	 * 根据用户已知信息查询用户列表
	 * @param user 用户对象
	 * @return
	 */
	List<Admin> listAdmin(Admin admin);
	
	/**
	 * 新增管理严
	 * @param user 待新增的管理员
	 * @return
	 */
	boolean saveAdmin(Admin admin);
	
	/**
	 * 根据管理员id删除（逻辑删除）管理员
	 * @param adminId 管理员id
	 * @return
	 */
	boolean removeAdmin(Long adminId);
	
	/**
	 * 采用sha1加密算法将密码加密
	 * @param plainPsd 为经过加密的密码
	 * @return
	 */
	String encryptPsd(String plainPsd);
	
	/**
	 * 验证密码是否正确
	 * @param plainPsd 未加密的密码
	 * @param encryptedPsd 加密之后的密码
	 * @return
	 */
	boolean validatePsd(String plainPsd, String encryptedPsd);
	
}
