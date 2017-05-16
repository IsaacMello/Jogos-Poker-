package Observer;

import javax.security.auth.Subject;

public interface Observer {
	
	String observedState=null;
    Subject observed=null;
    
    public static void Observ(Subject observed) {
       observed = observed;
     
    }    
    public abstract void update();
	
	
	

}
