package Mock_Practice;

class User{
    private String username = "";
    private String password = "";

    public void setUsername(String username){
        if(this.username.isEmpty()){
            this.username = username;
            System.out.println("Username Set Successful!");
        }
        else{
            System.out.println("User Already Assigned");
        }
    }

    public String getUsername(){
        return username;
    }
    public void setPassword(String password){
        if(this.password.isEmpty()){
            if(password.length() < 8){
                System.out.println("The password must be at least 8 characters long");
            }
            else{
                this.password = password;
                System.out.println("Password Set Successful");
            }


        }
        else{
            System.out.println("Password Already Assigned");
        }
    }

    public String getPassword(){
        return password;
    }
}

public class EncapsulationP2 {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setUsername("Mridul");
        System.out.println(user1.getUsername());
        user1.setUsername("Sumonta");
        System.out.println(user1.getUsername());

        user1.setPassword("1234");
        user1.setPassword("123456789");
        System.out.println(user1.getPassword());
        user1.setPassword("12345");
        System.out.println(user1.getPassword());
    }
}
