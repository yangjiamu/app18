package service;

import domain.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductServiceImpl implements ProductService{
    private Map<Long, Product> productMap = new HashMap<Long, Product>();
    private AtomicLong generator = new AtomicLong();

    public ProductServiceImpl() {
        Product product = new Product();
        product.setName("JX1 power Drill");
        product.setDescription("Powerful hand drill, made to perfection");
        product.setPrice(129.99f);
        add(product);
    }

    public Product add(Product product) {
        long newId = generator.incrementAndGet();
        product.setId(newId);
        productMap.put(newId, product);
        return product;
    }

    public Product get(long id) {
        return productMap.get(id);
    }
}
