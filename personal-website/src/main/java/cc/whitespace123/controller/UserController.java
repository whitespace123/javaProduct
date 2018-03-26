package cc.whitespace123.controller;

import javax.print.attribute.standard.RequestingUserName;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import cc.whitespace123.enity.User;
import cc.whitespace123.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	/**
	 * 用户登录,使用shiro框架提供的方式进行认证操作
	 */
	public String login() {
		// // 从Session中获取生成的验证码
		// // String validatecode = (String)
		// //ServletActionContext.getRequest().getSession().getAttribute("key");
		// // 校验验证码是否输入正确
		// //if (StringUtils.isNotBlank(checkcode) && checkcode.equals(validatecode)) {
		// // 使用shiro框架提供的方式进行认证操作
		// Subject subject = SecurityUtils.getSubject();// 获得当前用户对象,状态为“未认证”
		// AuthenticationToken token = new UsernamePasswordToken(model.getUsername(),
		// MD5Utils.md5(model.getPassword()));// 创建用户名密码令牌对象
		// try {
		// subject.login(token);
		// } catch (Exception e) {
		// e.printStackTrace();
		// return "login";
		// }
		// User user = (User) subject.getPrincipal();
		// ServletActionContext.getRequest().getSession().setAttribute("loginUser",
		// user);
		// return "home";
		// } else {
		// // 输入的验证码错误,设置提示信息，跳转到登录页面
		// this.addActionError("输入的验证码错误！");
		// return "login";
		// }
		return null;
	}
}
