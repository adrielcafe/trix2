package trix2.interceptors;

import trix2.config.multitenance.TenantContextHolder;
//import trix2.repositories.UserRepository;
import trix2.services.UtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DomainInterceptor extends HandlerInterceptorAdapter {

//    @Autowired
//    private UserRepository userRepository;

    @Autowired
    private UtilService utilService;

    /**
     * Intercept all request and do the following.
     * <ol>
     *     <li>Set database to thread local for spring data rest based on app's unique subdomain.</li>
     * </ol>
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String host = request.getHeader("Host");
        String subdomain = utilService.getSubdomainFromHost(host);

        String path = request.getServletPath();

        resetValues();

        if(subdomain == null) {
			TenantContextHolder.setTenantSubdomain(null);
		}else{
            TenantContextHolder.setTenantSubdomain(subdomain);
        }

		return true;
	}

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
        resetValues();
    }

    public void resetValues(){
        TenantContextHolder.setTenantSubdomain(null);
    }
}