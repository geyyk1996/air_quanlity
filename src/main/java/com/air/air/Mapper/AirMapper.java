package com.air.air.Mapper;

import com.air.air.bean.Air;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AirMapper {

    @Select("select * from air_data where id = (select max(id) from air_data)")
    Air getNewAir();
}
