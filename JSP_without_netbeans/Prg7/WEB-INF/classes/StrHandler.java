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
public class StrHandler extends TagSupport{
    String input;
    int start;
    int end;

    public StrHandler() {
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public int doStartTag() throws JspException {
        
        JspWriter out = pageContext.getOut();
        if(end>input.length()){
            try {
                out.print("please give start and end within range");
            } catch (IOException ex) {
                Logger.getLogger(StrHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            String s = input.substring(start, end);
            try {
                out.print(s);
            } catch (IOException ex) {
                Logger.getLogger(StrHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        return SKIP_BODY; //To change body of generated methods, choose Tools | Templates.
    }
    
}
