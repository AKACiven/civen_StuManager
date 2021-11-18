package com.civen.civen_stumanager.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.civen.civen_stumanager.dto.LoginDto;
import com.civen.civen_stumanager.entity.Admin;
import com.civen.civen_stumanager.result.Result;
import com.civen.civen_stumanager.service.AdminService;
import com.civen.civen_stumanager.service.impl.AdminServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author EdwardXu
 * @description 登陆
 */
@RestController
public class LoginController {
    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public Result<Map<String, Object>> login(@RequestBody LoginDto dto) {
        AdminService as = new AdminServiceImpl();
        Admin admin = as.getAdminByUsername(dto.getUsername());
        if (admin != null && admin.getPassword().equals(dto.getPassword())) {
            StpUtil.login(dto.getUsername());
            Map<String, Object> map = new HashMap<>(64);
            map.put("token", StpUtil.getTokenValue());
            return Result.success(map);
        } else {
            Map<String, Object> map = new HashMap<>(64);
            map.put("message", "用户名或密码错误！");
            return Result.failed(map);
        }
    }

    @RequestMapping(value = "/user/info", method = RequestMethod.GET)
    public Result<Map<String, Object>> userInfo(@RequestParam String token) {
        Object id = StpUtil.getLoginIdByToken(token);
        Map<String, Object> map = new HashMap<>(64);
        if (id instanceof String){
            String userId = String.valueOf(id);
            if ("admin".equals(userId)){
                List<String> role = new ArrayList<>();
                role.add("admin");
                map.put("roles",role);
                return Result.success(map);
            }else {
                map.put("message","查询失败");
                return Result.failed(map);
            }
        }else{
            map.put("message","查询失败");
            return Result.failed(map);
        }
    }
}
