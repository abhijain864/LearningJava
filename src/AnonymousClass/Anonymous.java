package AnonymousClass;

import lombok.Getter;

@Getter
public class Anonymous {

    private String base;

    public static void main(String[] args) {
        Anonymous anonymousOld = new Anonymous();
        Anonymous anonymous = new ExtendingAnonymous("str");
        ExtendingAnonymous extendingAnonymous = (ExtendingAnonymous) anonymousOld;
        System.out.println(extendingAnonymous.getNewBase());


    }
}
