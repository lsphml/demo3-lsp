package base.dao;

import base.entity.BaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


public interface IBaseMapper<T extends BaseEntity> extends BaseMapper<T> {
}
