package Bank_Application;

public interface IBaseRate {
    default double getbaserate(){
        return 2.5;
    }
}
