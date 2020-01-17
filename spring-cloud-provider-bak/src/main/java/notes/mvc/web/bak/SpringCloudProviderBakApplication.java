package notes.mvc.web.bak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
//@EnableDiscoveryClient	//更通用，包含EnableEurekaClient功能
@SpringBootApplication
public class SpringCloudProviderBakApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProviderBakApplication.class, args);
	}

}
