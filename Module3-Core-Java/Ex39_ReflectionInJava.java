import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Ex39_ReflectionInJava {

    public static void main(String[] args) {
        try {
            // 1. Load class dynamically by name
            Class<?> clazz = Class.forName("ReflectionSample");

            // 2. Get all declared methods
            Method[] methods = clazz.getDeclaredMethods();

            System.out.println("Methods in class " + clazz.getName() + ":");
            for (Method method : methods) {
                System.out.print("- " + method.getName() + "(");
                Parameter[] params = method.getParameters();
                for (int i = 0; i < params.length; i++) {
                    System.out.print(params[i].getType().getSimpleName() + " " + params[i].getName());
                    if (i < params.length - 1) System.out.print(", ");
                }
                System.out.println(")");
            }

            // 4. Create an instance (assuming default constructor)
            Object obj = clazz.getDeclaredConstructor().newInstance();

            // 5. Find method named "greet" that takes a String parameter
            Method greetMethod = clazz.getDeclaredMethod("greet", String.class);

            // 6. Invoke the method dynamically
            Object result = greetMethod.invoke(obj, "Reflection");
            System.out.println("Invocation result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

