package com.air.air.Controller;

import com.air.air.Mapper.AirMapper;
import com.air.air.bean.Air;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    AirMapper airMapper;

    @GetMapping("/")
    public String index(Model model){
        Air air = airMapper.getNewAir();
        model.addAttribute("air",air);
        return "index";
    }
}
