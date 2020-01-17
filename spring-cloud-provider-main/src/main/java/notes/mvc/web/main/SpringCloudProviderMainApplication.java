package notes.mvc.web.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
//@EnableDiscoveryClient	//更通用，包含EnableEurekaClient功能
@SpringBootApplication
public class SpringCloudProviderMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProviderMainApplication.class, args);
	}

}
