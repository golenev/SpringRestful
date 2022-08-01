package com.golenev.spingrrestful.spingrrestful.controller;

import com.golenev.spingrrestful.spingrrestful.entity.Product;
import com.golenev.spingrrestful.spingrrestful.exceptions.CustomException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/products")
public class MainController {
    public int counter = 4;
    public List<Map<String, String>> products = new ArrayList<Map<String, String>>() {{

        add(new HashMap<String, String>() {{
            put("id", "2");
            put("isActive", "true");
            put("regionId", "72");
            put("composition", "Газированная вода, карамельный колер, фосфорная кислота, заменитель сахара аспартам," +
                    "бензонат натрия (консервант), кофеин, натуральные ароматизаторы, ацесульфам калия, " +
                    "цитрат калия, кофеин, Отсутствуют, азированный безалкогольный напиток," +
                    "производимый компанией Coca-Cola. Первоначально продававшийся как напиток для замены алкоголя и " +
                    "предназначавшийся  +" +
                    "в качестве патентного лекарства, он был изобретён в конце XIX века Джоном Ститом Пембертоном и был " +
                    "выкуплен бизнесменом Асой Григгсом Кэндлером, чья маркетинговая тактика привела Coca-Cola к доминированию " +
                    "на мировом рынке безалкогольных напитков на протяжении всего 20 века");
            put("shortDescription", "Кока-кола - Прохладительный напиток");
        }});
        add(new HashMap<String, String>() {{
            put("id", "3");
            put("isActive", "true");
            put("regionId", "72");
            put("composition", "Вода, восстановленный грейпфрутовый сок (16%), сахар, диоксид углерода, " +
                    "регулятор кислотности (лимонная кислота), натуральные ароматизаторы.");
            put("shortDescription", "Sanpellegrino - безалкогольный среднегазированный сокосодержащий напиток");
        }});
    }};

     @GetMapping
    public List<Map<String, String>> getList() {
        return products;
    }

    @GetMapping("{id}")
    public Map<String, String> getById(@PathVariable String id) {
        return products.stream().filter(product -> product.get("id").equals(id)).findFirst().orElseThrow(CustomException::new);
    }

    @PostMapping
    public Map<String, String> createProduct(@RequestBody Map<String, String> newProduct) {
        newProduct.put("id", String.valueOf(counter++));
        products.add(newProduct);
        return newProduct;
    }

}

