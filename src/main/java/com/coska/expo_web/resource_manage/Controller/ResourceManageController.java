package com.coska.expo_web.resource_manage.Controller;

import com.coska.expo_web.Tools.BuilderJson;
import com.coska.expo_web.resource_manage.Entity.ResourceManage;
import com.coska.expo_web.resource_manage.Service.Impl.ResourceManageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class ResourceManageController {


    @Autowired
    ResourceManageServiceImpl resourceManageService;

    @RequestMapping("/")
    public String getResource(HttpSession session) {
        return "index";
    }

    @RequestMapping("/about")
    public String about(HttpSession session) {
        System.out.println("**********************");
        return "about";
    }

    @RequestMapping("/contact")
    public String contact(HttpSession session) {
        return "contact";
    }

    @RequestMapping("/login")
    public String login(HttpSession session) {
        return "login";
    }

    @RequestMapping("/getResource")
    public @ResponseBody List<ResourceManage> getName() {

        List<ResourceManage> nodes =resourceManageService.findAllElement();
        BuilderJson bj = new BuilderJson(nodes);
        List<ResourceManage> result = bj.buildJsonTree();
        return result;
    }


}
