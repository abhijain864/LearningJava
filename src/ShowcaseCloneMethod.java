import java.util.Arrays;

class Student {

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ShowcaseCloneMethod {

    public static ShowcaseCloneMethod showcaseCloneMethod = new ShowcaseCloneMethod();
    public static void main(String[] args) {
        showcaseCloneMethod.on2DArrays();
    }

    private void onListOfObject() {
        Student[] students = {new Student("abhishek", 23), new Student("abhi", 17)};
        System.out.println(Arrays.toString(students));

        // on cloning only a shallow copy is being done, since only the references are being copied, and not the actual objects.
        Student[] newStudents = students.clone();
        newStudents[0].setAge(30);
        System.out.println(Arrays.toString(students));
    }

    private void on2DArrays() {
        int[][] arr = {{1,2},{3,4}};
        int[][] arr2 = arr.clone();
        if (!(arr == arr2)) {
            System.out.println("The upper lever array which keep references to the actual 2 arrays namely {1,2}, {3,4} are different");
        }
        if(arr[0]==arr2[0]){
            System.out.println("The reference for first array {1,2} in both array are same, so changing in one will affect other");
            System.out.println("                  Let's change arr2's element arr2[0][0] to -1 ");
            arr2[0][0] = -1;
            System.out.println("                  The value of arr[0][0] also gets changed to = " + arr[0][0]);
        }



    }
}
