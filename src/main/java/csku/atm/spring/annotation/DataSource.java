package csku.atm.spring.annotation;

import java.util.Map;

public interface DataSource {
    Map<Integer,Customer> readCustomers();
}
