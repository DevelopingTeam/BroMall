package com.team.bromall.controller;

import com.team.bromall.common.CommonPage;
import com.team.bromall.dto.AdminParam;
import com.team.bromall.dto.LoginAdminParam;
import com.team.bromall.dto.UpdateAdminPwdParam;
import com.team.bromall.model.UserAdmin;
import com.team.bromall.model.UserPermission;
import com.team.bromall.model.UserRole;
import com.team.bromall.service.UserAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 后台系统用户管理
 *
 * @author team
 * @version v1.0
 * @date 2019/11/23 10:33
 */
@Controller
public class UserAdminController {
    @Autowired
    private UserAdminService userAdminService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public CommonResult<UserAdmin> register(AdminParam umsAdminParam, BindingResult result) {
//        UserAdmin userAdmin = userAdminService.register(umsAdminParam);
//        if (userAdmin == null) {
//            CommonResult.failed();
//        }
//        return CommonResult.success(userAdmin);
//    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(LoginAdminParam loginAdminParam) {
        String token = userAdminService.login(loginAdminParam.getUsername(), loginAdminParam.getPassword());
        if (token == null) {
            return "index";
        }
        Map<String, String> tokenMap = new HashMap<>(16);
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return "login";
    }

    @RequestMapping("/")
    public String root() {
        return "index";
    }

//    @RequestMapping(value = "/token/refresh", method = RequestMethod.GET)
//    public CommonResult refreshToken(HttpServletRequest request) {
//        String token = request.getHeader(tokenHeader);
//        String refreshToken = userAdminService.refreshToken(token);
//        if (refreshToken == null) {
//            return CommonResult.failed();
//        }
//        Map<String, String> tokenMap = new HashMap<>();
//        tokenMap.put("token", refreshToken);
//        tokenMap.put("tokenHead", tokenHead);
//        return CommonResult.success(tokenMap);
//    }

//    @RequestMapping(value = "/info", method = RequestMethod.GET)
//    public CommonResult getAdminInfo(Principal principal) {
//        String username = principal.getName();
//        UserAdmin userAdmin = userAdminService.getAdminByUsername(username);
//        Map<String, Object> data = new HashMap<>();
//        data.put("username", userAdmin.getUsername());
//        data.put("roles", new String[]{"TEST"});
//        data.put("icon", userAdmin.getIcon());
//        return CommonResult.success(data);
//    }

//    @RequestMapping(value = "/logout", method = RequestMethod.POST)
//    public CommonResult logout() {
//        return CommonResult.success(null);
//    }

//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public CommonResult<CommonPage<UserAdmin>> list(@RequestParam(value = "name", required = false) String name,
//                                                   @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
//                                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
//        List<UserAdmin> adminList = userAdminService.list(name, pageSize, pageNum);
//        return CommonResult.success(CommonPage.restPage(adminList));
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public CommonResult<UserAdmin> getItem(@PathVariable Long id) {
//        UserAdmin admin = userAdminService.getItem(id);
//        return CommonResult.success(admin);
//    }

//    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
//    public CommonResult update(@PathVariable Long id, @RequestBody UserAdmin admin) {
//        int count = userAdminService.update(id, admin);
//        if (count > 0) {
//            return CommonResult.success(count);
//        }
//        return CommonResult.failed();
//    }

//    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
//    public CommonResult updatePassword(@RequestBody UpdateAdminPwdParam updatePasswordParam) {
//        int status = userAdminService.updatePassword(updatePasswordParam);
//        if (status > 0) {
//            return CommonResult.success(status);
//        } else if (status == -1) {
//            return CommonResult.failed("提交参数不合法");
//        } else if (status == -2) {
//            return CommonResult.failed("找不到该用户");
//        } else if (status == -3) {
//            return CommonResult.failed("旧密码错误");
//        } else {
//            return CommonResult.failed();
//        }
//    }

//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
//    public CommonResult delete(@PathVariable Long id) {
//        int count = userAdminService.delete(id);
//        if (count > 0) {
//            return CommonResult.success(count);
//        }
//        return CommonResult.failed();
//    }

//    @RequestMapping(value = "/role/update", method = RequestMethod.POST)
//    public CommonResult updateRole(@RequestParam("adminId") Long adminId,
//                                   @RequestParam("roleIds") List<Long> roleIds) {
//        int count = userAdminService.updateRole(adminId, roleIds);
//        if (count >= 0) {
//            return CommonResult.success(count);
//        }
//        return CommonResult.failed();
//    }

//    @RequestMapping(value = "/role/{adminId}", method = RequestMethod.GET)
//    public CommonResult<List<UserRole>> getRoleList(@PathVariable Long adminId) {
//        List<UserRole> roleList = userAdminService.getRoleList(adminId);
//        return CommonResult.success(roleList);
//    }

//    @RequestMapping(value = "/permission/update", method = RequestMethod.POST)
//    public CommonResult updatePermission(@RequestParam Long adminId,
//                                         @RequestParam("permissionIds") List<Long> permissionIds) {
//        int count = userAdminService.updatePermission(adminId, permissionIds);
//        if (count > 0) {
//            return CommonResult.success(count);
//        }
//        return CommonResult.failed();
//    }

//    @RequestMapping(value = "/permission/{adminId}", method = RequestMethod.GET)
//    public CommonResult<List<UserPermission>> getPermissionList(@PathVariable Long adminId) {
//        List<UserPermission> permissionList = userAdminService.getPermissionList(adminId);
//        return CommonResult.success(permissionList);
//    }
}