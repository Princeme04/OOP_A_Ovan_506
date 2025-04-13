public class Admin extends User {
    private String username;
    private String password;

    public Admin(String name, String studentID, String username, String password){
        super(name, studentID);
        this.username = username;
        this.password = password;
    }
    @Override
    public void login(){
        if("admin".equals(username) && "1234".equals(password)){
            System.out.println("Admin login successful.");
        }else{
            System.out.println("Admin login failed. Invalid username or password");
        }
    }
    @Override
    public void displayInfo(){
        System.out.println("Admin " + getName() + " has successfully logged in.");
    }
}
