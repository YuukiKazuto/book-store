package com.group12.bookstore.controller.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.group12.bookstore.pojo.User;
import com.group12.bookstore.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user/toLogin")
    public String toLogin() {
        return "user/lpgin";
    }

    @GetMapping("/user/login")
    public String login(Model model, HttpSession session, String usernameOrEmail, String password) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("username",usernameOrEmail);
        queryWrapper.or();
        queryWrapper.eq("email",usernameOrEmail);
        queryWrapper.eq("password",password);
        User user = userService.getOne(queryWrapper);
        if (user != null) {
            session.setAttribute("user",user);
            return "redirect:/user/main";
        } else {
            model.addAttribute("errorMsg","用户名或密码有误，请重新输入");
            return "redirect:/user/toLogin";
        }
    }
}
