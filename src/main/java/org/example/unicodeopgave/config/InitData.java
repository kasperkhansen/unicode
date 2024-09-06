package org.example.unicodeopgave.config;


import jakarta.annotation.PostConstruct;
import org.example.unicodeopgave.model.Unicode;
import org.example.unicodeopgave.repository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class InitData {

    @Autowired
    private UnicodeRepository unicodeRepository;

    @PostConstruct
    public void init() {
        Set<Character> unicodeSet = Set.of('a', 'b', 'c', 'd', 'e');
        for (Character c: unicodeSet){
            Unicode unicode = new Unicode();
            unicode.setUnicode((int)c);
            unicode.setBogstav(c);
            unicode.setBeskrivelse("Dette er bogstavet " + c);
            unicode.setNavn(Character.getName(c));
            unicodeRepository.save(unicode);
        }
    }
}
