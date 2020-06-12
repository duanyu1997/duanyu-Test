package bnzdybusinessdesc.controller;

import bnzdybusinessdesc.entity.CommodityDesc;
import bnzdybusinessdesc.service.CommodityDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("commodityDesc")
public class CommodityDescController {

    @Autowired
    private  CommodityDescService commodityDescService;
    @GetMapping("findAll")
    public List<CommodityDesc> findAll(){

        return commodityDescService.findAll();
    }

    @PostMapping("add")
    public boolean addUser(CommodityDesc commodityDesc) {
        System.out.println("开始新增...");
        return commodityDescService.add(commodityDesc);
    }

    @PutMapping("update")
    public boolean update(CommodityDesc commodityDesc) {
        System.out.println("开始更新...");
        return commodityDescService.update(commodityDesc);
    }
    @DeleteMapping("delete")
    public boolean delete(Long itemId) {
        System.out.println("开始删除...");
        return commodityDescService.delete(itemId);
    }
    @GetMapping("{itemId}")
    public CommodityDesc queryById(@PathVariable("itemId") Long itemId) {
        return this.commodityDescService.queryById(itemId);
    }
}
