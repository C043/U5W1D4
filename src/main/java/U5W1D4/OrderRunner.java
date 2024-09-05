package U5W1D4;

import U5W1D4.entities.Bevanda;
import U5W1D4.entities.Pizza;
import U5W1D4.entities.Topping;
import U5W1D4.exceptions.ValidationException;
import U5W1D4.services.CiboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class OrderRunner implements CommandLineRunner {
    @Autowired
    private CiboService ciboService;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Pizza pizzaMargherita = (Pizza) context.getBean("pizza_margherita");
        Bevanda acqua = (Bevanda) context.getBean("acqua");
        Topping tomato = (Topping) context.getBean("tomato");
        Topping cheese = (Topping) context.getBean("cheese");

        try {
            ciboService.saveFood(tomato);
            ciboService.saveFood(cheese);
            ciboService.saveFood(acqua);
            ciboService.saveFood(pizzaMargherita);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

        context.close();
    }
}
