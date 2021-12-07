/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author lalit
 */
public class NameHandler extends TagSupport {
    public String uname;
    
    public void setUname(String uname){
        
        this.uname = uname;
    }

    public String getUname() {
        return uname;
    }
    
    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            out.print(uname);
        } catch (IOException ex) {
            Logger.getLogger(NameHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SKIP_BODY; //To change body of generated methods, choose Tools | Templates.
    }
    
}
