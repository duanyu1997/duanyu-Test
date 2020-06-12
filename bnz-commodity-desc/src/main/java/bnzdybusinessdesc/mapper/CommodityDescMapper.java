package bnzdybusinessdesc.mapper;

import bnzdybusinessdesc.entity.CommodityDesc;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommodityDescMapper {
    List<CommodityDesc> findAll();
    void add(CommodityDesc commodityDesc);
    void update(CommodityDesc commodityDesc);
    void delete(Long itemId);

    CommodityDesc queryById(Long itemId);
}
