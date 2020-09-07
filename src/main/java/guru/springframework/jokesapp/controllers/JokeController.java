package guru.springframework.jokesapp.controllers;

import guru.springframework.jokesapp.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokesService jokesService;

    @Autowired
    JokeController(final JokesService jokesService)
    {
        this.jokesService=jokesService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model)
    {
        model.addAttribute("joke",jokesService.renderJoke());
        return "chucknorris";
    }

}
