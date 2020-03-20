package base.service.impl;

import base.dao.IBaseMapper;
import base.entity.BaseEntity;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


/**
 * @author lsp
 * @description TODO
 * @date 2020/3/18 18:46
 **/
public class BaseServiceImpl<M extends IBaseMapper<T>, T extends BaseEntity> extends ServiceImpl<M,T> {
}
