public class User {
    private String name;
    private String studentID;

    public User(String name, String studentID){
        this.name = name;
        this.studentID = studentID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getStudentID(){
        return name = name;
    }
    public void getStudentID(String studentID){
        this.studentID = studentID;
    }
    public void login(){
        System.out.println("Login method in user class.");
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
    }
}
