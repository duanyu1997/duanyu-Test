package bnzdybusinessdesc.service;

import bnzdybusinessdesc.entity.CommodityDesc;
import bnzdybusinessdesc.mapper.CommodityDescMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityDescService {

    @Autowired
    private CommodityDescMapper commodityDescMapper;
    public List<CommodityDesc> findAll() {
        return commodityDescMapper.findAll();
    }

    public boolean add(CommodityDesc commodityDesc) {
        boolean flag=false;
        try{
            commodityDescMapper.add(commodityDesc);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public boolean update(CommodityDesc commodityDesc) {
        boolean flag=false;
        try{
            commodityDescMapper.update(commodityDesc);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    public boolean delete(Long itemId) {
        boolean flag=false;
        try{
            commodityDescMapper.delete(itemId);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public CommodityDesc queryById(Long itemId) {
        return this.commodityDescMapper.queryById(itemId);
    }
}
