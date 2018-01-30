package lesson7.springboot_07;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller

public class HomeController {
    @GetMapping("/tvform")
    public String loadTvForm(Model model){
        model.addAttribute("tvshow", new Tvshow());
        return "tvform";
    }

    @PostMapping("/tvform")
    public String ProcessTvForm(@Valid Tvshow tvshow, BindingResult result){
        if(result.hasErrors()){
            return "tvform";
        }
        return "tvshowconfirm";
    }
}
