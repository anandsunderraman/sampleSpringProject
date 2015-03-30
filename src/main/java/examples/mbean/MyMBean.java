package examples.mbean;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName = "examples.mbean:name=MyMbean1")
public class MyMBean {

    @ManagedOperation(description = "Returns something.")
    public String getSomething() {
        return "Something";
    }

    MyMBean () {
        System.out.println("MyMBean constructor");
    }

}