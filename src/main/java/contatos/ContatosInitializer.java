package contatos;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ContatosInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{HelloWorldConfiguration.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
