package controller;

import domain.Product;
import form.ProductForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ProductService;

@Controller
public class ProductController {
    private static final Log logger = LogFactory.getLog(ProductController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product_input")
    public String inputProduct(){
        logger.info("inputProduct called");
        return "ProductForm";
    }

    @RequestMapping(value = "/product_save")
    public String saveProduct(ProductForm productForm, Model model){
        logger.info("saveProduct called");
        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try {
            product.setPrice(Float.parseFloat(productForm.getPrice()));
        }catch (NumberFormatException e){

        }
        model.addAttribute("product", product);
        return "ProductDetails";
    }

    @RequestMapping(value = "/product_view/{id}")
    public String viewProduct(@PathVariable Long id, Model model){
        Product product = productService.get(id);
        model.addAttribute("product", product);
        return "ProductView";
    }
}
