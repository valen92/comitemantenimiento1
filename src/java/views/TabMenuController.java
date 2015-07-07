
package views;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Alexandra
 */
public class TabMenuController {

    private int index = 0;
 
    public int getIndex() {
        return index;
    }
 
    public void setIndex(int index) {
        this.index = index;
    }
 
    public String doSomeWork(){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Some Work Achieved"));        
        index = 1;
        return "";
    }
    
}
