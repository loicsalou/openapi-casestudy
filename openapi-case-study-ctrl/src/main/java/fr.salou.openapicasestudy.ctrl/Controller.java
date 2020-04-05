package fr.salou.openapicasestudy.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("/dto/{id}")
    public Dto get(
            @PathVariable(name = "id") String id) {
        Dto d = new Dto("Loic Salou", TypeEnum.type1);
        return d;
    }
}
