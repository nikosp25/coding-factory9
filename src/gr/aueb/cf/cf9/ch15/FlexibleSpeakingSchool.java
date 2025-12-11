package gr.aueb.cf.cf9.ch15;

//loosely coupled.

public class FlexibleSpeakingSchool {
    private final ISpeakable iSpeakable;

    //dependency injection
    //IoC - Inversion of Control
    public FlexibleSpeakingSchool(ISpeakable iSpeakable) {
        this.iSpeakable = iSpeakable;
    }

    public void speak() {
        iSpeakable.speak();
    }

}
