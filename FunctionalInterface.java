import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main
{
	public static void main(String[] args) {

//Implementing Predicate Functional Interface
	Predicate<Integer> predicate = (value) -> true;
        System.out.println(predicate.test(1)); 

//Implementing Consumer Functional Interface
        Consumer<String> consumer = (String name) -> System.out.println("Hello "+ name);
        consumer.accept("Muthukumar");
	}

//Implementing Function Functional Interface
        Function<String, Integer> function = (name) -> {
            int age = 23;
            return age;
        };

        function.apply("Muthukumar");
//Implementing Supplier Function Interface
        Supplier<String> supplier = () ->  "name";
        System.out.println(supplier.get());
}
