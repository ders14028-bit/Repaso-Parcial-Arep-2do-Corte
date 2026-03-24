package co.edu.eci;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class GreetingController {

@GetMapping("/compute")
public Greeting compute(@RequestParam double value) {
return new Math.sin(value);
}
}