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
/*
        Menu menu = context.getBean(Menu.class);
        menu.printMenu();
*/

/*
            List<Cibo> ciboList = new ArrayList<>();
            ciboList.add((Cibo) context.getBean("pizza_margherita"));
            ciboList.add((Cibo) context.getBean("salami_pizza"));
            ciboList.add((Cibo) context.getBean("cheese"));
            ciboList.add((Cibo) context.getBean("birra"));
            ciboList.add((Cibo) context.getBean("vino"));
            Ordine ordine = new Ordine((Tavolo) context.getBean("tavolo2"), 1, ciboList, 2, (double)context.getBean("coperto"));
            ordine.printOrder();
*/
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
