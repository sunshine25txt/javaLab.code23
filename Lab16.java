import java.lang.reflect.*;
class A {}
class B extends A { int i; static int j;
    public void m(int k){} private static void m(){}
}
public class Lab16 {
    public static void main(String[] args) {
        Class<?> b = B.class;
        IO.println(b.getName());
        IO.println("Modifiers: " + Modifier.toString(b.getModifiers()));
        IO.println("Is Interface:"+ b.isInterface());
        IO.println("Is Enum:"+ b.isEnum());
        IO.println("Is Annotation:"+ b.isAnnotation());
        IO.println("Superclass:"+ b.getSuperclass());
        IO.println("Methods:");
        for(Method m: b.getDeclaredMethods()) {
            IO.println(m.getName()+", "+ Modifier.toString(m.getModifiers()));
        }
        IO.println("Fields:");
        for(Field f: b.getDeclaredFields()) {
            IO.println(f.getName()+", "+ Modifier.toString(f.getModifiers()));
        }
    }
}