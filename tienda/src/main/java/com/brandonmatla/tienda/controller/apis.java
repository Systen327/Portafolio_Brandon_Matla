package com.brandonmatla.tienda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

import com.brandonmatla.tienda.model.telefono;

@RestController
@RequestMapping("/api")
public class apis {

    @GetMapping("/telefonos-map")
    
    public Map<String, telefono> listaMap() {

        Map<String, telefono> telefonos = new HashMap<>();
        
        telefonos.put("Galaxy S20", new telefono("Galaxy S20", "Samsung", 8, 4000, 749.99f, "https://m.media-amazon.com/images/I/71vaN3F+ZvL._AC_UF894,1000_QL80_.jpg"));
        telefonos.put("iPhone 12", new telefono("iPhone 12", "Apple", 6, 2815, 999.99f, "https://clevercel.mx/cdn/shop/products/apple-iphone-12-r1_1_477x_477x_1fdf5968-8b53-4922-bc5c-e53c8c752a3b.jpg?v=1714576832"));
        telefonos.put("Pixel 6", new telefono("Pixel 6", "Google", 8, 4600, 599.99f, "https://m.media-amazon.com/images/I/6102cYM0OHL._AC_UF1000,1000_QL80_.jpg"));
        telefonos.put("OnePlus 9", new telefono("OnePlus 9", "OnePlus", 12, 4500, 729.99f, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ27A3qXCdj8g0XUqtGd2y3FPUuDeRMNGDQow&s"));
        telefonos.put("Xiaomi Mi 11", new telefono("Xiaomi Mi 11", "Xiaomi", 8, 4600, 749.99f, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTMcXH3gBM3cdVo27l3uT28O3-_SgvHnbIYHQ&s"));
        telefonos.put("Huawei P40", new telefono("Huawei P40", "Huawei", 8, 4200, 799.99f, "https://cell-shop.com.mx/wp-content/uploads/2021/09/980019581-1l.jpg"));
        telefonos.put("Sony Xperia 5 II", new telefono("Sony Xperia 5 II", "Sony", 8, 4000, 949.99f, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3g6KPJwayWM84mLNFNoFj4P9ol67d21CMaw&s"));
        telefonos.put("Oppo Find X3", new telefono("Oppo Find X3", "Oppo", 12, 4500, 899.99f, "https://http2.mlstatic.com/D_NQ_NP_824763-MLU74224839145_012024-O.webp"));
        telefonos.put("Motorola Edge", new telefono("Motorola Edge", "Motorola", 6, 5000, 499.99f, "https://cdn1.coppel.com/images/catalog/pm/2193483-1.jpg?iresize=width:400,height:320"));
        telefonos.put("Nokia 8.3", new telefono("Nokia 8.3", "Nokia", 8, 4500, 649.99f, "https://cdn.dxomark.com/wp-content/uploads/medias/post-66383/nokia-8-3-5g-camera-review-capable-ultra-wide-camera-1.jpg"));

        return telefonos;

}
}
