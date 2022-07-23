package com.golenev.spingrrestful.spingrrestful.controller;

import com.golenev.spingrrestful.spingrrestful.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.Map;

@RestController

public class MainController {

    @GetMapping("/v1/api")
    public ResponseEntity main() {
        return ResponseEntity.ok("your status is ok");
    }

    @GetMapping("/product")
    public ResponseEntity product(){
        return ResponseEntity.ok(new Product(12, true, 1200, 72, 9, false,
                "Газированная вода, карамельный колер, фосфорная кислота, заменитель сахара аспартам," +
                        " бензонат натрия (консервант), кофеин, натуральные ароматизаторы, ацесульфам калия, " +
                        "цитрат калия, кофеин", "Отсутствуют", "азированный безалкогольный напиток, " +
                "производимый компанией Coca-Cola. Первоначально продававшийся как напиток для замены алкоголя и " +
                "предназначавшийся " +
                "в качестве патентного лекарства, он был изобретён в конце XIX века Джоном Ститом Пембертоном и был " +
                "выкуплен бизнесменом Асой Григгсом Кэндлером, чья маркетинговая тактика привела Coca-Cola к доминированию " +
                "на мировом рынке безалкогольных напитков на протяжении всего 20 века","прокладительныйнапиток"));
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_PROBLEM_JSON_UTF8_VALUE)
    public ResponseEntity<Product> postProduct(Product product) {
        HttpHeaders headers = new HttpHeaders();

        return new ResponseEntity<Product>(product, headers, HttpStatus.CREATED);
    }


}
