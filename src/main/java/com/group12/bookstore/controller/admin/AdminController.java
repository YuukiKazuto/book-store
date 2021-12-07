package com.group12.bookstore.controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.group12.bookstore.pojo.Admin;
import com.group12.bookstore.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    @GetMapping("/admin/toLogin")
    public String toLogin() {
        return "admin/lpgin";
    }

    @GetMapping("/admin/login")
    public String login(Model model, HttpSession session, String username, String password) {
        QueryWrapper queryWrapper = new QueryWrapper();
        Map<String, Object> param = new HashMap<>();
        param.put("username", username);
        param.put("password", password);
        queryWrapper.allEq(param);
        Admin admin = adminService.getOne(queryWrapper);
        if (admin != null) {
            session.setAttribute("admin",admin);
            return "redirect:/admin/main";
        } else {
            model.addAttribute("errorMsg","用户名或密码有误，请重新输入");
            return "redirect:/admin/toLogin";
        }
    }

}
