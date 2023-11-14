public class Person {
    String firstname;
    String lastname;
    int age;
    String phone;
    String email;
    boolean gender;

    public Person (String firstname,String lastname , int age){
        this("5418637255","emre@gmail.com", true);
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    public Person (String phone,String email , boolean gender){
        this.phone =phone;
        this.email = email;
        this.gender=gender;

    }

    public String getFirstName(){

        return firstname;
    }
    public String getLastName(){

        return lastname;
    }
    public int getAge(){

        return age;
    }
    public boolean isTeen(int age){
        if(age>13 && age<18){
            return true;
        }
        return false;
    }
    public boolean getGender(){

        return gender;
    }

}
