package bohdan.examples.page;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.PriorityQueue;
import java.util.stream.Stream;

public class SumHandler {
	int agg = 0;
	Stream<Integer> stream = null;
	public SumHandler(Stream<Integer> s) {
		stream = s;		
		s.forEach( value -> agg = agg + value);		
	}
	
	public int getAgg() {
		return agg;
	}

}