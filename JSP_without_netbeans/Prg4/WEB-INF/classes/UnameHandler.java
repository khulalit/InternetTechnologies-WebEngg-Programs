/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag;

import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author lalit
 */
public class UnameHandler extends TagSupport {
    public String uname;
    
    public void setUname(String uname){
        
        this.uname = uname;
    }
    
    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        Date ndate = new Date();
        java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm ");
        java.text.SimpleDateFormat formatters = new java.text.SimpleDateFormat("dd/MM/yyyy hh:mm aa");
        String date= formatter.format(ndate);
        String dates= formatters.format(ndate);
        try {
        
        int hours = Integer.parseInt(date.substring(11,13));  
        out.println(dates);
//        out.println(hours);
        if(hours>0&&hours<=12){
            out.println("<h1 class='text-6xl text-purple-600'>Good Morning "+uname +"</h1>");
        }
        else if(hours>12&&hours<16){
            out.println("<h1 class='text-6xl' >Good Afternoon "+uname +"</h1>");
        }
        else{
            out.println("<h1 class='text-6xl'>Good Evening "+uname +"</h1>");
        }
        } catch (IOException ex) {
            Logger.getLogger(UnameHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SKIP_BODY; //To change body of generated methods, choose Tools | Templates.
    }
    
}
