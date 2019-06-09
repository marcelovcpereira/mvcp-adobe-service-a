package mvcp.adobe.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/")
@RestController
public class Entrypoint {
    public static final Logger logger = (Logger) LoggerFactory.getLogger(Entrypoint.class);

    @GetMapping("/marcelo/test/{id}")
    public @ResponseBody
    Object get(@PathVariable("id") String id) {
        logger.info("New get Request with id: " + id);
        return "{\"idServiceA\": " + id + "}";
    }

    @PostMapping("/marcelo/test/post")
    public @ResponseBody Object post(@RequestBody Map<String, String> body) {
        String ret = "{\"service\":\"A\",";
        for (String key : body.keySet()) {
            String value = body.get(key);
            ret += "\"" + key + "\": \"" + value + "\",";
        }
        ret = ret.substring(0,ret.length()-1);
        ret += "}";
        logger.info("New post Request with body size: " + body.size());
        return ret;
    }
}