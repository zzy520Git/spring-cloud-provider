package notes.mvc.web.modules.health;

import notes.mvc.web.controller.IndexController;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

/**
 * Description：健康自检指示器
 *
 * @author zzy520git
 * @date 2020/1/9 17:28
 * @ see
 * @since
 */
@Component
public class MyHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        if (IndexController.alive) {
            return new Health.Builder(Status.UP).build();
        }
        return new Health.Builder(Status.DOWN).build();
    }
}
