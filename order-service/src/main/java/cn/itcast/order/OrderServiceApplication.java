package cn.itcast.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "cn.itcast.order")
@SpringBootApplication
public class OrderServiceApplication
{
    public static void main( String[] args ) {

        SpringApplication.run(OrderServiceApplication.class,args);
    }
}
