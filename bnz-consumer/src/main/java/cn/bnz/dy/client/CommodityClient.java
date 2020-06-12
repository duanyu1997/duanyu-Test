package cn.bnz.dy.client;


import cn.bnz.dy.entity.Commodity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "bnz-commodity")
public interface CommodityClient {

    @GetMapping("commodity/{id}")
    Commodity queryById(@PathVariable("id")Long id);

}
