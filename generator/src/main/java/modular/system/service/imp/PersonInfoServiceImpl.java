package modular.system.service.imp;

import modular.system.model.PersonInfoEntity;
import modular.system.dao.PersonInfoMapper;
import modular.system.service.IPersonInfoService;
import base.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lsp
 * @since 2020-03-19
 */
@Service
public class PersonInfoServiceImpl extends BaseServiceImpl<PersonInfoMapper, PersonInfoEntity> implements IPersonInfoService {

}
