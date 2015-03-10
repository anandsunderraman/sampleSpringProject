package examples.springhttp.client;

import examples.springhttp.StateCapitalServiceIF;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This class demonstrates a client of a Spring HTTP-exposed service and shows
 * how the client interacts with the server as if using normal Java objects
 * rather than using anything HTTP specific.
 */
public class HttpClient
{
    public static void printStateInfo(
            final StateCapitalServiceIF stateCapitalMapper,
            final String state)
    {
        System.out.println(
                "The capital of " + state + " is "
                        + stateCapitalMapper.getCapital(state));
    }

    public static void main(final String[] arguments)
    {
        final ApplicationContext context = new ClassPathXmlApplicationContext("examples/springhttp/client/spring-http-client-config.xml");
//        final ApplicationContext context = new ClassPathXmlApplicationContext("webapp/WEB-INF/spring-http-client-config.xml");
        final StateCapitalServiceIF stateCapitalService =
                (StateCapitalServiceIF) context.getBean("stateCapitalProxyService");
        printStateInfo(stateCapitalService, "California");
        printStateInfo(stateCapitalService, "Alabama");
    }
}