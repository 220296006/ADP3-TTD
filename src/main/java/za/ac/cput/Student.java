package za.ac.cput;


/**This my student worker class
 * @author Thabiso Matsaba (220296006)
 * 06 February 2022
*/

public class Student {

    private String _name;
    private int _grade;

    public Student(){
    }

    public Student(String name, int grade) {
        this._grade = grade;
        this._name = name;
    }

    public String Name() {
        return this._name;
    }

    public int Grade() {
        return this._grade;
    }
}

