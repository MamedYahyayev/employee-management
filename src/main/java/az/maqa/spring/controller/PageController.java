package az.maqa.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping(value = "/index")
    public String indexPage() {
        return "index";
    }

    @GetMapping(value = "/404")
    public String Page404() {
        return "404";
    }

    @GetMapping(value = "/blank")
    public String blankPage() {
        return "blank";
    }

    @GetMapping(value = "/buttons")
    public String buttonsPage() {
        return "buttons";
    }

    @GetMapping(value = "/cards")
    public String cardsPage() {
        return "cards";
    }

    @GetMapping(value = "/charts")
    public String chartsPage() {
        return "charts";
    }

    @GetMapping(value = "/forgot-password")
    public String forgotPassword() {
        return "forgot-password";
    }

    @GetMapping(value = "/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping(value = "/register")
    public String registerPage() {
        return "register";
    }

    @GetMapping(value = "/tables")
    public String tablesPage() {
        return "tables";
    }

    @GetMapping(value = "/animations")
    public String animationPage() {
        return "utilities-animation";
    }

    @GetMapping(value = "/borders")
    public String borderPage() {
        return "utilities-border";
    }

    @GetMapping(value = "/colors")
    public String colorPage() {
        return "utilities-color";
    }

    @GetMapping(value = "/other-animations")
    public String otherAnimation() {
        return "utilities-other";
    }

}
