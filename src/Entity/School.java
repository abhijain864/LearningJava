package Entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class School {

    public String name;
    public static int a;
    private int totalStudents;
    public OneMore oneMore;

    public static void increaseStudentsBy10(School school){
//        totalStudents++;
        school.setTotalStudents(school.getTotalStudents()+10);
    }

    private static void func(){
        increaseStudentsBy10(null);
    }

    @Data
    public static class Standard{

        public int classNumber;

        public String section;

        public NestedClass nestedClass;

    }

    @Data
    public static class NestedClass{
        public Standard standard;

        public OneMore oneMore;

    }

    @Data
    private static class OneMore{
        public int one;
    }

    public static void main(){
        Standard standard = new Standard();
        standard.nestedClass.standard.nestedClass.standard.nestedClass.standard.nestedClass.standard =  new Standard();
    }


}
