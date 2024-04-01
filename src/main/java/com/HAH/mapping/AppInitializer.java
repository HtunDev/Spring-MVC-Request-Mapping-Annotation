//package com.HAH.mapping;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//public class AppInitializer implements WebApplicationInitializer {
//
//	@Override
//	public void onStartup(ServletContext container) throws ServletException {
//
//		var rootContext = new AnnotationConfigWebApplicationContext();
//		rootContext.register(RootConfig.class); 
//		container.addListener(new RootConfigLoaderListener(rootContext));
//
//		var servletContext = new AnnotationConfigWebApplicationContext();
//		servletContext.register(ServletConfig.class);
//		var servlet = container.addServlet("dispatcher", new DispatcherServlet(servletContext));
//		servlet.addMapping("/");
//		servlet.setLoadOnStartup(1);
//
//	}
////	This is used AbstractAnnotationConfigDispatcherServletInitializer
////	@Override
////	protected Class<?>[] getRootConfigClasses() {
////		return new Class<?>[] { RootConfig.class };
////	}
////
////	@Override
////	protected Class<?>[] getServletConfigClasses() {
////		return new Class<?>[] { ServletConfig.class };
////	}
////
////	@Override
////	protected String[] getServletMappings() {
////		return new String[] { "/" };
////	}
//
//}
