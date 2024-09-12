package com.brandonmatla.tienda.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.brandonmatla.tienda.model.telefono;

@Controller
public class inicioController {

    @GetMapping("/inicio")
    public String home(Model model) {

        model.addAttribute("telefonos", lista());
        return "inicio";
    }

    @GetMapping("/api/telefonos")
    public List<telefono> lista() {
        List<telefono> telefonos = new ArrayList<>();
        telefonos.add(new telefono("Galaxy S20", "Samsung", 8, 4000, 749.99f,
                "https://m.media-amazon.com/images/I/71vaN3F+ZvL._AC_UF894,1000_QL80_.jpg"));
        telefonos.add(new telefono("iPhone 12", "Apple", 6, 2815, 999.99f,
                "https://clevercel.mx/cdn/shop/products/apple-iphone-12-r1_1_477x_477x_1fdf5968-8b53-4922-bc5c-e53c8c752a3b.jpg?v=1714576832"));
        telefonos.add(new telefono("Pixel 6", "Google", 8, 4600, 599.99f,
                "https://m.media-amazon.com/images/I/6102cYM0OHL._AC_UF1000,1000_QL80_.jpg"));
        telefonos.add(new telefono("OnePlus 9", "OnePlus", 12, 4500, 729.99f,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ27A3qXCdj8g0XUqtGd2y3FPUuDeRMNGDQow&s"));
        telefonos.add(new telefono("Xiaomi Mi 11", "Xiaomi", 8, 4600, 749.99f,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTMcXH3gBM3cdVo27l3uT28O3-_SgvHnbIYHQ&s"));
        telefonos.add(new telefono("Huawei P40", "Huawei", 8, 4200, 799.99f,
                "https://cell-shop.com.mx/wp-content/uploads/2021/09/980019581-1l.jpg"));
        telefonos.add(new telefono("Sony Xperia 5 II", "Sony", 8, 4000, 949.99f,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3g6KPJwayWM84mLNFNoFj4P9ol67d21CMaw&s"));
        telefonos.add(new telefono("Oppo Find X3", "Oppo", 12, 4500, 899.99f,
                "https://http2.mlstatic.com/D_NQ_NP_824763-MLU74224839145_012024-O.webp"));
        telefonos.add(new telefono("Motorola Edge", "Motorola", 6, 5000, 499.99f,
                "https://cdn1.coppel.com/images/catalog/pm/2193483-1.jpg?iresize=width:400,height:320"));
        telefonos.add(new telefono("Nokia 8.3", "Nokia", 8, 4500, 649.99f,
                "https://cdn.dxomark.com/wp-content/uploads/medias/post-66383/nokia-8-3-5g-camera-review-capable-ultra-wide-camera-1.jpg"));

        return telefonos;
    }

    @SuppressWarnings("unused")
    @GetMapping("/telefono/{nombre}")
    public String telefonoDetalles(@PathVariable String nombre, Model model) {

        telefono telefonoSeleccionado = new telefono();
        for (int x = 0; x <= lista().size() - 1; x++) {
            if (lista().get(x).getNombre().equals(nombre)) {
                telefonoSeleccionado=lista().get(x);
                break;
            }
        }

        if (telefonoSeleccionado != null) {
            model.addAttribute("telefono", telefonoSeleccionado);
            return "telefono";
        } 
        else 
        {
            
            return "redirect:/inicio";
        }
    }

}
