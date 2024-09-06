package org.example.unicodeopgave.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/unicode")
public class UnicodeController {

    @GetMapping("/{i}")
    public String getUnicode(@PathVariable int i) {
        char c = (char) i;
        return "unicode=" + i + " char=" + c;
    }

    @GetMapping("/char/{c}")
    public String getUnicodeChar(@PathVariable char c) {
        int unicode = (int) c;
        return "char=" + c + " unicode=" + unicode;
    }

    @GetMapping("/range/{start}/{antal}")
    public List<String> getUnicodeRange(@PathVariable char start, @PathVariable int antal) {
       List<String> resultat = new ArrayList<>();
        for (int i = 0; i < antal; i++) {
            char c = (char) (start + i);
            resultat.add(c + " : " + (int) c);
        }
        return resultat;
    }
}
