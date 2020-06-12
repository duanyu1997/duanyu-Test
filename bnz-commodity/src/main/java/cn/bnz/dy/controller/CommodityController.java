package cn.bnz.dy.controller;
import	java.util.List;

import cn.bnz.dy.entity.Commodity;
import cn.bnz.dy.service.impl.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("commodity")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    @GetMapping("{id}")
    public Commodity queryById(@PathVariable("id") Long id) {
        return this.commodityService.queryById(id);
    }
    @GetMapping("findAll")
    public List<Commodity> findAll(){

        return commodityService.findAll();
    }

    @PostMapping("add")
    public boolean addUser(Commodity commodity) {
        System.out.println("开始新增...");
        return commodityService.add(commodity);
    }

    @PutMapping("update")
    public boolean update(Commodity commodity) {
        System.out.println("开始更新...");
        return commodityService.update(commodity);
    }
    @DeleteMapping("delete")
    public boolean delete(Long id) {
        System.out.println("开始删除...");
        return commodityService.delete(id);
    }
}
