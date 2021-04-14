package lu.lv.sabine_kalnina_final_work;

import lu.lv.sabine_kalnina_final_work.ui.ConsulUi;
import lu.lv.sabine_kalnina_final_work.model.Product;
import lu.lv.sabine_kalnina_final_work.repository.ProductRepository;
import lu.lv.sabine_kalnina_final_work.service.ProductService;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Map<Long, Product> repository = new HashMap<>();
        ProductRepository productRepository = new ProductRepository(repository);
        ProductService productService = new ProductService(productRepository);
        Scanner scanner = new Scanner(System.in);

        new ConsulUi(productService, scanner).run();
    }
}
