package cn.bnz.dy.controller;

import cn.bnz.dy.client.CommodityClient;
import cn.bnz.dy.entity.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("commodity")
public class ConsumerController {

    @Autowired
    private CommodityClient commodityClient;

    @GetMapping
    @ResponseBody
    public Commodity queryUserById(@RequestParam("id") Long id){
        Commodity commodity = this.commodityClient.queryById(id);
        return commodity;
    }
}
