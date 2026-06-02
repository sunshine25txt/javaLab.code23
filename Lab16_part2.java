import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface A{ int m();}
@Retention(RetentionPolicy.RUNTIME)
@interface B{ String m();}
@Retention(RetentionPolicy.RUNTIME)
@interface C{}
@Retention(RetentionPolicy.RUNTIME)
@interface D{int value();}
@Retention(RetentionPolicy.RUNTIME)
@interface E{int value(); String m() default "EEE";}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
@interface F{int value();}
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(H.class)
@interface G{int value();}
@Retention(RetentionPolicy.RUNTIME)
@interface H{G[] value();}
@A(m=10)
@B(m="AAA")
@C
@D(100)
@E(200)
class AA {
    @A(m=10)
    @B(m="AAA")
    @C
    @D(100)
    @E(200)
    @Deprecated
    // @Override
    @G(1) @G(2) @G(3)
    void m(@F(300) @D(100) int i) {}
}
public class Lab16_part2 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> aaClass = AA.class;
        // A annotation = aaClass.getAnnotation(A.class);
        // IO.println("Annotation present: " + annotation);        
        // IO.println("Annotation value: " + annotation.m());
        for (Annotation a: aaClass.getAnnotations()) {
            IO.println("Annotation" + a);
        }
        Method m = aaClass.getDeclaredMethod("m", int.class);
        for (Annotation a: m.getAnnotations()) {
            IO.println("Annotation" + a);
        }
        for (Parameter p : m.getParameters()) {
            for (Annotation a: p.getAnnotations()) {
                IO.println("ParameterAnnotation" + a);
            }
            for (Annotation a: p.getAnnotatedType().getAnnotations()) {
                IO.println("ParameterTypeAnnotation" + a);
            }
        }
        H h = m.getAnnotation(H.class);
        for(G g: h.value()) {
            IO.println("RepeatAnno:"+g.value());
        }
    }    
}
