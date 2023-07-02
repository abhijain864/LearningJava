package AnonymousClass;

import lombok.Getter;

@Getter
public class ExtendingAnonymous extends Anonymous {

    private String newBase;

    ExtendingAnonymous(){}

    ExtendingAnonymous(String newBase){
        this.newBase = newBase;
    }
}
