import java.lang.annotation.*;
import java.lang.reflect.*;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}

// Logic class using the custom annotation
class LogicClass {
    @MyAnnotation("Executing business logic")
    public void execute() {
        System.out.println("Business logic is running...");
    }
}

// Main class to process the annotation
public class Main {
    public static void main(String[] args) throws Exception {
        LogicClass obj = new LogicClass();
        Method method = obj.getClass().getMethod("execute");

        // Check for annotation and display its value
        if (method.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println("Annotation Value: " + annotation.value());
        }

        // Call the actual method
        obj.execute();
    }
}
