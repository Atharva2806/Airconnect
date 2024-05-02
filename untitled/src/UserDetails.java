public class UserDetails implements Comparable<UserDetails>{
    private static int userId;
    private String name;
    private  String emailId;
    private int age;
    private String dateOfBirth;
    private String gender;

    private long mobileNumber;

    public UserDetails(){
        this("Na","Na",0,"Na","Na",0);
    }
    public UserDetails(String name, String emailId, int age, String datrOfBirth, String gender, long mobileNumber){
        userId=userId+1;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.emailId=emailId;
        this.dateOfBirth=datrOfBirth;

    }

    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        UserDetails.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "SignUp{" +
                "name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", age=" + age +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", mobileNumber=" + mobileNumber +
                '}';
    }


    @Override
    public int compareTo(UserDetails o) {
        return emailId.compareTo(o.getEmailId());
    }
}
