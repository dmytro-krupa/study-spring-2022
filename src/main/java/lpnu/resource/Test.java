package lpnu.resource;

import lpnu.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/test")
public class Test {
    @GetMapping
    public String test() {
        return "TEEEEEST1234";
    }
}
