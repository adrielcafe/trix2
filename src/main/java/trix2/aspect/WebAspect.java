package trix2.aspect;

import trix2.web.pages.PagesController;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Controller;

/**
 * Created by misael on 04/12/2015.
 * This class throws a not found exception for request that nave a @SubdomainMapping
 * annotation with a value that does not corresponde to the TenantContextHolder properies
 * @see SubdomainTypes
 * @see PagesController
 */
@Aspect
@Controller
public class WebAspect {
//    @Before("@annotation(subdomainMapping)")
//    public void subdomainMapping(SubdomainMapping subdomainMapping) throws Throwable {
//        if(subdomainMapping.value().equals(SubdomainTypes.ALL))
//            return;
//        if(subdomainMapping.value().equals(SubdomainTypes.NONE) && TenantContextHolder.getTenantSubdomain() != null)
//            throw new ResourceNotFoundException();
//        if(subdomainMapping.value().equals(SubdomainTypes.CONSOLE) && !TenantContextHolder.isTenantConsoleRequest()){
//            throw new ResourceNotFoundException();
//        }else if(subdomainMapping.value().equals(SubdomainTypes.APP) && TenantContextHolder.getTenantSubdomain() == null){
//            throw new ResourceNotFoundException();
//        }
//	}
}
