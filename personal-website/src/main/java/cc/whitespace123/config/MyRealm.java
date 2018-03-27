package cc.whitespace123.config;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import cc.whitespace123.enity.User;
import cc.whitespace123.mapper.UserMapper;

/**
 * shiro realm类
 * 
 * @author Ra
 *
 */
public class MyRealm extends AuthorizingRealm {
	@Autowired
	private UserMapper userMapper;

	/**
	 * 认证方法
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken mytoken = (UsernamePasswordToken) token;
		String username = mytoken.getUsername();
		User target = new User();
		target.setUsername(username);
		// 根据用户名查询数据库中的密码
		User user = userMapper.selectUser(target);
		if (user == null) {
			// 用户名不存在
			return null;
		}
		// 如果能查询到，再由框架比对数据库中查询到的密码和页面提交的密码是否一致
		AuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), this.getName());
		return info;
	}

	/**
	 * 授权方法
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		// 为用户授权
		info.addStringPermission("staff-list");
		//TODO 后期需要修改为根据权限表来查询数据授权
		return info;
	}
}
