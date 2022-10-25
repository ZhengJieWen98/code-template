package ${package_controller};
import ${package_pojo}.${Table};
import ${package_service}.${Table}Service;
import com.github.pagehelper.PageInfo;
import entity.Result;
import entity.StatusCode;
<#if swagger==true>import io.swagger.annotations.*;</#if>
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import cn.zhengjiewen.core.controller.AbstractCoreController;

/**
 * @ClassName ${Table}Controller
 * @description
 * @author 郑洁文
 * @date 2022年10月21日 下午13:50
 * @Version v1.0
 */
@RestController
@RequestMapping("/${table}")
@CrossOrigin
public class ${Table}Controller extends AbstractCoreController<${Table}>{

    private ${Table}Service  ${table}Service;

    @Autowired
    public ${Table}Controller(${Table}Service  ${table}Service) {
        super(${table}Service, ${Table}.class);
        this.${table}Service = ${table}Service;
    }
}
