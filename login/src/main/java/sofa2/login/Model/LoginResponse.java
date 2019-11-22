package sofa2.login.model;

public class LoginResponse {
   
    private String status;
    private String message;
    private Enum userRole;

    public LoginResponse(){
        super();
    }

    public LoginResponse(String status, String message, Enum userRole){
        this.status = status;
        this.message = message;
        this.userRole = userRole;
    }

    public String getStatus(){
        return this.status;
    }
    public String getMessage(){
        return this.message;
    }
    public Enum getUserRole(){
        return this.userRole;
    }
    public void setStatus(String status){
        this.status= status;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public void setUserRole(Enum userRole){
        this.userRole = userRole;
    }

}