package org.example.completeendtoenddailycodework.utility;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UrlUtil {

    public static String getApplicationUrl(HttpServletRequest request){

        String appUrl = request.getRequestURL().toString();
        return appUrl.replace(request.getServletPath(), "");

    }
}
