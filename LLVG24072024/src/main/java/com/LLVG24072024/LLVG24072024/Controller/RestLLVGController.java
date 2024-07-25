package com.LLVG24072024.LLVG24072024.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/Calculadora")
public class RestLLVGController {

    @GetMapping("/Resta")
    public String showSumForm(Model model) {
        model.addAttribute("Num1", 0);
        model.addAttribute("Num2", 0);
        model.addAttribute("resultado", 0);
        return "Calculadora/RestaLLVG";
    }

    @PostMapping("/Resta")
    public String performSum(@RequestParam("Num1") int Num1, @RequestParam("Num2") int Num2, Model model) {
        int result = Num1 - Num2;
        model.addAttribute("Num1", Num1);
        model.addAttribute("Num2", Num2);
        model.addAttribute("result", result);
        return "Calculadora/RestaLLVG";
    }

}
