package fr.salou.openapicasestudy.app;

import fr.salou.openapicasestudy.ctrl.CtrlContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({CtrlContext.class})
public class OpenapiCaseStudyAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenapiCaseStudyAppApplication.class, args);
    }

}
