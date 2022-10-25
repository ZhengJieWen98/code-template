package ${package_service_impl};
import ${package_mapper}.${Table}Mapper;
import ${package_pojo}.${Table};
import ${package_service}.${Table}Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;
import cn.zhengjiewen.core.service.impl.CoreServiceImpl;
import java.util.List;

/**
 * @ClassName ${Table}业务层接口实现类
 * @description
 * @author 郑洁文
 * @date 2022年10月21日 下午13:50
 * @Version v1.0
 */
@Service
public class ${Table}ServiceImpl extends CoreServiceImpl<${Table}> implements ${Table}Service {

    private ${Table}Mapper ${table}Mapper;

    @Autowired
    public ${Table}ServiceImpl(${Table}Mapper ${table}Mapper) {
        super(${table}Mapper, ${Table}.class);
        this.${table}Mapper = ${table}Mapper;
    }
}
