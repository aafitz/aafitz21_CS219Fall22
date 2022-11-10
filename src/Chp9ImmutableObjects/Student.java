package Chp9ImmutableObjects;

public class Student {

    //private data cannot be accessed from outside of the class.
    private String first;
    private String last;
    private String id;

    private String nickname;

    // above are immutable b/c they are "private"

    //above are all instance variables or instance data

    public Student(String first_, String last_, String id_, String nickname_){
        //first= Hermoine, last = Granger, id = 123
        // want to store in the above variables
        first = first_;
        last = last_;
        id = id_;
        nickname = nickname_;
        // stores the data that we entered into the variables
        //immutable class as this is written --- whoever uses this class cannot modify the instance variables


    }

    public String toString(){
        return last + " ," + first + "(" + nickname + ")";
    }
    // classes encapsulate related data
}
