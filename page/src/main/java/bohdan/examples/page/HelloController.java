package bohdan.examples.page;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.PriorityQueue;

@RestController
public class HelloController {
	static PriorityQueue<Integer> q = new PriorityQueue<>();
	
	
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, the time at the server is now " + new Date() + "\n";
    }

    @PostMapping("/api/median/{value}")
    public String median( @RequestBody Integer value) {
    	
        return "Injected int is " + value;
    }
}