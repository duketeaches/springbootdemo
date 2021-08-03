/**
 * 
 */
package duke.learn.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Kazi
 *
 */
@SpringBootApplication
@EnableJpaRepositories("duke.learn.spring.repo")
@EntityScan("duke.learn.spring.model")
public class Application {

    @Value("${server.port}")
    Integer port;

    @Value("${server.port.ssl}")
    Integer redirectPort;

    public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
    }

//    /**
//     * To redirect automatically from default port to secure port ex: 8080 to 8443 ,
//     * in this case 8081 to 8443
//     * 
//     * @return
//     */
//    @Bean
//    public ServletWebServerFactory servletContainer() {
//	CustomTomcatWebServrFactory tomcat = new CustomTomcatWebServrFactory();
//	tomcat.addAdditionalTomcatConnectors(redirectConnector());
//	return tomcat;
//    }
//
//    static final class CustomTomcatWebServrFactory extends TomcatServletWebServerFactory {
//	@Override
//	protected void postProcessContext(org.apache.catalina.Context context) {
//	    SecurityConstraint securityConstraint = new SecurityConstraint();
//	    securityConstraint.setUserConstraint("CONFIDENTIAL");
//	    SecurityCollection collection = new SecurityCollection();
//	    collection.addPattern("/*");
//	    securityConstraint.addCollection(collection);
//	    context.addConstraint(securityConstraint);
//	}
//    }
//
//    private Connector redirectConnector() {
//	Connector connector = new Connector(Http11NioProtocol.class.getName());
//	connector.setScheme("http");
//	connector.setPort(port);
//	connector.setSecure(false);
//	connector.setRedirectPort(redirectPort);
//	return connector;
//    }
}
