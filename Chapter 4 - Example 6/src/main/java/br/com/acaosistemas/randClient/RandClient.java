package br.com.acaosistemas.randClient;

import java.util.List;

import br.com.acaosistemas.rand.RandService;
import br.com.acaosistemas.rand.RandServiceService;

public class RandClient {
	public static void main(String[] args) {
		// set-up
		RandServiceService service = new RandServiceService();
		RandService port = service.getRandServicePort();

		// sample calls
		System.out.println(port.next1());
		System.out.println();
		List<Integer> nums = port.nextN(4);
		for (Integer num : nums)
			System.out.println(num);
	}
}
