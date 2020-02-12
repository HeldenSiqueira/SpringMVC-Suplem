package br.com.suplem.loja.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.suplem.loja.controllers.HomeController;
import br.com.suplem.loja.daos.ProdutoDAO;

@EnableWebMvc
//Spring encontrar home, dao
@ComponentScan(basePackageClasses= {HomeController.class,ProdutoDAO.class})
public class AppWebConfiguration {
	//@Bean, você transforma-o em um Bean, para que o Spring o gerencie.
			@Bean
			//InternalResourceViewResolver: responsável por indicar qual diretório estão as views:
			public InternalResourceViewResolver internalResourceViewResolver() {
				InternalResourceViewResolver resolver = new InternalResourceViewResolver();
				//local
				resolver.setPrefix("/WEB-INF/views/");
				//Extensão
				resolver.setSuffix( ".jsp");
				return resolver;
			}

}
