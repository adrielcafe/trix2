package trix2.services;

import trix2.util.ProfileType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * Created by misael on 19/10/2015.
 */
@Service
public class UtilService {

    @Value("${spring.profiles.active}")
    public String profile;

//    public App getAppFromHost(String subdomain){
//        // TODO implement db and cache to retreive
//        App app = new App();
//        app.name = "Admin";
//        app.subdomain = "admin";
//        return app;
//    }

    public ProfileType applicationProfile(){
        if(profile != null && profile.equals("prod"))
            return ProfileType.PROD;
        else
            return ProfileType.DEV;
    }

    public HttpServletRequest getHttpServletRequest(){
        return ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
    }

    public HttpServletResponse getHttpServletResponse(){
        return ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getResponse();
    }

    /**
     * Get the host name/ip
     * @return
     */
    public String getHost(){
        Enumeration<NetworkInterface> e;
        try {
            e = NetworkInterface.getNetworkInterfaces();
            while(e.hasMoreElements()){
                NetworkInterface n=(NetworkInterface) e.nextElement();
                Enumeration<InetAddress> ee = n.getInetAddresses();
                while(ee.hasMoreElements()){
                    InetAddress inetAddress = (InetAddress) ee.nextElement();
                    if (inetAddress instanceof Inet4Address){
                        String host = inetAddress.getHostAddress();
                        if(host.equals("127.0.0.1") == false && host.equals("127.0.1.1") == false && host.equals("0.0.0.0") == false){
                            return host;
                        }
                    }
                }
            }
        } catch (SocketException e1) {
            e1.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }

        return null;
        //		return "192.168.181.1";
    }

    public String getSubdomainFromHost(String host) {
		String[] names = host.split("\\.");
		String topDomain = null;
		try {
			topDomain = names[names.length - 2] + "." + names[names.length - 1];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new RuntimeException("Subdomain not found");
		}
		return !topDomain.equals(host) ? host.split("." + topDomain)[0] : null;
    }

//    public User getUser(){
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        Object object = null;
//        if (auth != null)
//            object = auth.getPrincipal();
//
//        if(object instanceof User)
//            return (User) object;
//        return null;
//    }
}
