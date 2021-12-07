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
public class ChocoBean extends TagSupport{

   
    public String name;
    public String texture;

    public ChocoBean() {
    }

    public String getName() {
        return name;
    }

    public String getTexture() {
        return texture;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }
    
     @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        if(texture.equals("chewy")){
            try {
                out.print("FiveStar, BarOne");
            } catch (IOException ex) {
                Logger.getLogger(ChocoBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(texture.equals("crunchy")){
            try {
                out.print("Munch, KitKat");
            } catch (IOException ex) {
                Logger.getLogger(ChocoBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return SKIP_BODY; //To change body of generated methods, choose Tools | Templates.
    }
}
