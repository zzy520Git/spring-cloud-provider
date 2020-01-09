package notes.mvc.web.modules.health;

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

/**
 * Description：健康自检处理器
 *
 * @author zzy520git
 * @date 2020/1/9 17:34
 * @ see
 * @since
 */
@Slf4j
@Component
public class MyHealthCheckHandler implements HealthCheckHandler {
    @Autowired
    private MyHealthIndicator myHealthIndicator;

    @Override
    public InstanceInfo.InstanceStatus getStatus(InstanceInfo.InstanceStatus instanceStatus) {
        Status status = myHealthIndicator.health().getStatus();
        if (Status.UP.equals(status)) {
            log.warn("服务存活");
            return InstanceInfo.InstanceStatus.UP;
        }
        log.warn("服务不存活");
        return InstanceInfo.InstanceStatus.DOWN;
    }
}
