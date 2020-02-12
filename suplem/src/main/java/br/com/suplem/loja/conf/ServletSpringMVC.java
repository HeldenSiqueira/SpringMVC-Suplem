package br.com.suplem.loja.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import br.com.suplem.loja.conf.AppWebConfiguration;
//Essa classe Configura a Servlet do Spring MVC para que ela atenda as requisições recebidas pelo servidor.
public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//referência da classe AppWebConfiguration e JPAConfiguration para spring encontra-los .
		return new Class[] {AppWebConfiguration.class,JPAConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}



}

