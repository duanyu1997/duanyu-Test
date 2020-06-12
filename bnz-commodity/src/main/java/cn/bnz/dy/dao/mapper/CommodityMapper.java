package cn.bnz.dy.dao.mapper;

import cn.bnz.dy.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CommodityMapper {
    List<Commodity> findAll();
    void add(Commodity commodity);
    void update(Commodity commodity);
    void delete(Long id);

    Commodity queryById(Long id);
}
