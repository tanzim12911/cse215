package xEXERCISE_FINAL.ch_11.q2;

public class Student extends Person {
    public static final String FRESHMAN = "freshman";
    public static final String SOPHOMORE = "sophomore";
    public static final String JUNIOR = "junior";
    public static final String SENOIR = "senior";

    private String STAUTS;

    public Student(){

    }
    public Student(String STATUS){
        this.STAUTS = STATUS;
    }
    
    public Student(String name, String address, int phoneNum, String emailAddress, String sTAUTS) {
        super(name, address, phoneNum, emailAddress);
        STAUTS = sTAUTS;
    }
    public String getSTAUTS() {
        return STAUTS;
    }
    public void setSTAUTS(String STAUTS) {
        this.STAUTS = STAUTS;
    }
    @Override
    public String toString() {
        return "Student [name=" + getName() + "]";
    }

    
    

    
}
