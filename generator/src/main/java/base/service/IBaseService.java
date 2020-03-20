package base.service;

import base.entity.BaseEntity;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IBaseService<T extends BaseEntity> extends IService<T> {
}
