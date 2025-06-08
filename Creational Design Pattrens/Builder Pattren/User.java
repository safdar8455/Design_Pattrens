public class User {

    private final String UserId;
    private final String UserName;
    private final String UserEmail;

    private User(UserBuilder builder){
        this.UserId = builder.UserId;
        this.UserName = builder.UserName;
        this.UserEmail = builder.UserEmail;

    }
    public String getUserId() {
        return UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    

    @Override
    public String toString() {
        
        return this.UserId + " : "+ this.UserName+" : "+this.UserEmail;
    }



    public static class UserBuilder {
    private String UserId;
    private String UserName;
    private String UserEmail;

    public UserBuilder(){}

    public UserBuilder setUserId(String userId) {
        UserId = userId;
        return this;
    }
    public UserBuilder setUserName(String userName) {
        UserName = userName;
        return this;
    }
    public UserBuilder setUserEmail(String userEmail) {
        UserEmail = userEmail;
        return this;
    }

    public User Build(){
        return new User(this);
    }
    
        
    }

}