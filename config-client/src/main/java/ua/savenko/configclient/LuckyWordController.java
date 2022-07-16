package ua.savenko.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWordController {

    @Value("${lucky-word}")
    private String luckyWord;

    @GetMapping("/lucky")
    public String getLuckyWord(){
        return "Hy, lucky word is "+ luckyWord;
    }
}
