package br.com.acaosistemas.amazonwrappedclient;

import java.util.List;

import javax.xml.ws.Holder;

import br.com.acaosistemas.amazonwrapped.AWSECommerceService;
import br.com.acaosistemas.amazonwrapped.AWSECommerceServicePortType;
import br.com.acaosistemas.amazonwrapped.Item;
import br.com.acaosistemas.amazonwrapped.ItemSearch;
import br.com.acaosistemas.amazonwrapped.ItemSearchRequest;
import br.com.acaosistemas.amazonwrapped.Items;
import br.com.acaosistemas.amazonwrapped.OperationRequest;

class AmazonClientWrappedStyle {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("Usage: java AmazonClientW <access key> <secrete key>");
			return;
		}
		final String accessID = args[0];
		final String secretKey = args[1];

		AWSECommerceService service = new AWSECommerceService();
		service.setHandlerResolver(new AwsHandlerResolver(secretKey));
		AWSECommerceServicePortType port = service.getAWSECommerceServicePort();

		ItemSearchRequest request = new ItemSearchRequest();
		request.setSearchIndex("Books");
		request.setKeywords("Austen");

		ItemSearch search = new ItemSearch();
		search.getRequest().add(request);
		search.setAWSAccessKeyId(accessID);
		search.setAssociateTag("kalin");

		Holder<OperationRequest> operation_request = null;
		Holder<List<Items>> items = new Holder<List<Items>>();

		port.itemSearch(search.getMarketplaceDomain(), search.getAWSAccessKeyId(), search.getAssociateTag(),
				search.getXMLEscaping(), search.getValidate(), search.getShared(), search.getRequest(),
				operation_request, items);

		Items retval = items.value.get(0);
		int i = 1;
		List<Item> item_list = retval.getItem(); // list of Item subelements
		for (Item item : item_list) // each Item in the list
			System.out.println(String.format("%2d: ", i++) + item.getItemAttributes().getTitle());
	}
}
