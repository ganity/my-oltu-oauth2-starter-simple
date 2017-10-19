package com.citic;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.ArrayList;
import java.util.List;

public class UserRealm extends AuthorizingRealm {


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        String userId = (String) super.getAvailablePrincipal(principals);
        // 获得用户角色
        List<String> userRoles = new ArrayList<String>();
        userRoles.add("USER");
        userRoles.add("role_2");

        info.addStringPermission("abcefffdfdf_a_1");
        info.addStringPermission("abcefffdfdf_a_2");
        info.addStringPermission("abcefffdfdf_a_3");
        info.addStringPermission("abcefffdfdf_a_4");
        info.addRoles(userRoles);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        String username = upToken.getUsername();
        // 根据用户名检索用户信息，此时不用判断密码是否相同
        String cp = new Sha256Hash(username, username, 1024).toBase64();
        // 登录,如果token中的密码经过加密后和检索出来的密码不符合，会登录失败
        AuthenticationInfo auth = new SimpleAuthenticationInfo(username, cp, ByteSource.Util.bytes(username), getName());
        return auth;
    }

}
