package examples.springhttp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Demonstrates how Spring bean can be used without any HTTP involvement.
 */
public class MainServiceAppContext
{
    public static void printStateInfo(
            final StateCapitalServiceIF stateCapitalMapper,
            final String state)
    {
        System.out.println(
                "The capital of " + state + " is "
                        + stateCapitalMapper.getCapital(state));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//        final ApplicationContext context = new ClassPathXmlApplicationContext("examples/springhttp/spring-http-config.xml" );
        final ApplicationContext context = new ClassPathXmlApplicationContext("webapp/WEB-INF/dispatcher-servlet.xml");
        StateCapitalServiceIF stateCapitalMapper =
                (StateCapitalServiceIF) context.getBean("stateCapitalService");
        printStateInfo(stateCapitalMapper, "Alabama");
        printStateInfo(stateCapitalMapper, "Colorado");
    }
}