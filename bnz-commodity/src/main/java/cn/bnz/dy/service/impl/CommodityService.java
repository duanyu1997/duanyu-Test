package cn.bnz.dy.service.impl;

import cn.bnz.dy.dao.mapper.CommodityMapper;
import cn.bnz.dy.entity.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityService {
    @Autowired
    private CommodityMapper commodityMapper;

    public Commodity queryById(Long id) {
        return this.commodityMapper.queryById(id);
    }
    public List<Commodity> findAll() {
        return commodityMapper.findAll();
    }

    public boolean add(Commodity commodity) {
        boolean flag=false;
        try{
            commodityMapper.add(commodity);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public boolean update(Commodity commodity) {
        boolean flag=false;
        try{
            commodityMapper.update(commodity);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    public boolean delete(Long id) {
        boolean flag=false;
        try{
            commodityMapper.delete(id);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }


}
