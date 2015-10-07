
package br.com.acaosistemas.predictions3client;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

@Generated(value = {
		"wadl|file:/D:/temp/A\u00e7\u00e3o/Pesquisas/Java%20Web%20Services%20Up%20And%20Running%202nd%20Edition/localhost_predictions3.wadl" }, comments = "wadl2java, http://wadl.java.net", date = "2015-09-22T10:06:34-03:00")
public class Localhost_Predictions3ResourcesP {

	/**
	 * The base URI for the resource represented by this proxy
	 * 
	 */
	public final static URI BASE_URI;

	static {
		URI originalURI = URI.create("http://localhost:8080/predictions3/resourcesP/");
		// Look up to see if we have any indirection in the local copy
		// of META-INF/java-rs-catalog.xml file, assuming it will be in the
		// oasis:name:tc:entity:xmlns:xml:catalog namespace or similar duck type
		java.io.InputStream is = Localhost_Predictions3ResourcesP.class
				.getResourceAsStream("/META-INF/jax-rs-catalog.xml");
		if (is != null) {
			try {
				// Ignore the namespace in the catalog, can't use wildcard until
				// we are sure we have XPath 2.0
				String found = javax.xml.xpath.XPathFactory.newInstance().newXPath().evaluate(
						"/*[name(.) = 'catalog']/*[name(.) = 'uri' and @name ='" + originalURI + "']/@uri",
						new org.xml.sax.InputSource(is));
				if (found != null && found.length() > 0) {
					originalURI = java.net.URI.create(found);
				}

			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				try {
					is.close();
				} catch (java.io.IOException e) {
				}
			}
		}
		BASE_URI = originalURI;
	}

	public static Localhost_Predictions3ResourcesP.Root root(com.sun.jersey.api.client.Client client, URI baseURI) {
		return new Localhost_Predictions3ResourcesP.Root(client, baseURI);
	}

	/**
	 * Template method to allow tooling to customize the new Client
	 * 
	 */
	private static void customizeClientConfiguration(ClientConfig cc) {
	}

	/**
	 * Template method to allow tooling to override Client factory
	 * 
	 */
	private static com.sun.jersey.api.client.Client createClientInstance(ClientConfig cc) {
		return com.sun.jersey.api.client.Client.create(cc);
	}

	/**
	 * Create a new Client instance
	 * 
	 */
	public static com.sun.jersey.api.client.Client createClient() {
		ClientConfig cc = new DefaultClientConfig();
		customizeClientConfiguration(cc);
		return createClientInstance(cc);
	}

	public static Localhost_Predictions3ResourcesP.Root root() {
		return root(createClient(), BASE_URI);
	}

	public static Localhost_Predictions3ResourcesP.Root root(com.sun.jersey.api.client.Client client) {
		return root(client, BASE_URI);
	}

	public static class Root {

		private com.sun.jersey.api.client.Client _client;
		private UriBuilder _uriBuilder;
		private Map<String, Object> _templateAndMatrixParameterValues;

		private Root(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
			_client = client;
			_uriBuilder = uriBuilder.clone();
			_templateAndMatrixParameterValues = map;
		}

		/**
		 * Create new instance using existing Client instance, and a base URI
		 * and any parameters
		 * 
		 */
		public Root(com.sun.jersey.api.client.Client client, URI baseUri) {
			_client = client;
			_uriBuilder = UriBuilder.fromUri(baseUri);
			_uriBuilder = _uriBuilder.path("/");
			_templateAndMatrixParameterValues = new HashMap<String, Object>();
		}

		public Localhost_Predictions3ResourcesP.Root.Update update() {
			return new Localhost_Predictions3ResourcesP.Root.Update(_client,
					_uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
		}

		public Localhost_Predictions3ResourcesP.Root.DeleteId deleteId(Integer id) {
			return new Localhost_Predictions3ResourcesP.Root.DeleteId(_client,
					_uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
		}

		public Localhost_Predictions3ResourcesP.Root.Create create() {
			return new Localhost_Predictions3ResourcesP.Root.Create(_client,
					_uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
		}

		public Localhost_Predictions3ResourcesP.Root.Xml xml() {
			return new Localhost_Predictions3ResourcesP.Root.Xml(_client,
					_uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
		}

		public Localhost_Predictions3ResourcesP.Root.XmlId xmlId(Integer id) {
			return new Localhost_Predictions3ResourcesP.Root.XmlId(_client,
					_uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
		}

		public Localhost_Predictions3ResourcesP.Root.Json json() {
			return new Localhost_Predictions3ResourcesP.Root.Json(_client,
					_uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
		}

		public Localhost_Predictions3ResourcesP.Root.JsonId jsonId(Integer id) {
			return new Localhost_Predictions3ResourcesP.Root.JsonId(_client,
					_uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
		}

		public Localhost_Predictions3ResourcesP.Root.Plain plain() {
			return new Localhost_Predictions3ResourcesP.Root.Plain(_client,
					_uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
		}

		public static class Create {

			private com.sun.jersey.api.client.Client _client;
			private UriBuilder _uriBuilder;
			private Map<String, Object> _templateAndMatrixParameterValues;

			private Create(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
				_client = client;
				_uriBuilder = uriBuilder.clone();
				_templateAndMatrixParameterValues = map;
			}

			/**
			 * Create new instance using existing Client instance, and a base
			 * URI and any parameters
			 * 
			 */
			public Create(com.sun.jersey.api.client.Client client, URI baseUri) {
				_client = client;
				_uriBuilder = UriBuilder.fromUri(baseUri);
				_uriBuilder = _uriBuilder.path("/create");
				_templateAndMatrixParameterValues = new HashMap<String, Object>();
			}

			public <T> T postXWwwFormUrlencodedAsTextPlain(Object input,
					com.sun.jersey.api.client.GenericType<T> returnType) {
				UriBuilder localUriBuilder = _uriBuilder.clone();
				com.sun.jersey.api.client.WebResource resource = _client
						.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
				com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
				resourceBuilder = resourceBuilder.accept("text/plain");
				resourceBuilder = resourceBuilder.type("application/x-www-form-urlencoded");
				com.sun.jersey.api.client.ClientResponse response;
				response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
				if (response.getStatus() >= 400) {
					throw new Localhost_Predictions3ResourcesP.WebApplicationExceptionMessage(
							Response.status(response.getClientResponseStatus()).build());
				}
				return response.getEntity(returnType);
			}

			public <T> T postXWwwFormUrlencodedAsTextPlain(Object input, Class<T> returnType) {
				UriBuilder localUriBuilder = _uriBuilder.clone();
				com.sun.jersey.api.client.WebResource resource = _client
						.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
				com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
				resourceBuilder = resourceBuilder.accept("text/plain");
				resourceBuilder = resourceBuilder.type("application/x-www-form-urlencoded");
				com.sun.jersey.api.client.ClientResponse response;
				response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
				if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
					if (response.getStatus() >= 400) {
						throw new Localhost_Predictions3ResourcesP.WebApplicationExceptionMessage(
								Response.status(response.getClientResponseStatus()).build());
					}
				}
				if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
					return response.getEntity(returnType);
				} else {
					return returnType.cast(response);
				}
			}

		}

		public static class DeleteId {

			private com.sun.jersey.api.client.Client _client;
			private UriBuilder _uriBuilder;
			private Map<String, Object> _templateAndMatrixParameterValues;

			private DeleteId(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
				_client = client;
				_uriBuilder = uriBuilder.clone();
				_templateAndMatrixParameterValues = map;
			}

			/**
			 * Create new instance using existing Client instance, and a base
			 * URI and any parameters
			 * 
			 */
			public DeleteId(com.sun.jersey.api.client.Client client, URI baseUri, Integer id) {
				_client = client;
				_uriBuilder = UriBuilder.fromUri(baseUri);
				_uriBuilder = _uriBuilder.path("/delete/{id: \\d+}");
				_templateAndMatrixParameterValues = new HashMap<String, Object>();
				_templateAndMatrixParameterValues.put("id", id);
			}

			/**
			 * Create new instance using existing Client instance, and the URI
			 * from which the parameters will be extracted
			 * 
			 */
			public DeleteId(com.sun.jersey.api.client.Client client, URI uri) {
				_client = client;
				StringBuilder template = new StringBuilder(BASE_URI.toString());
				if (template.charAt((template.length() - 1)) != '/') {
					template.append("/delete/{id: \\d+}");
				} else {
					template.append("delete/{id: \\d+}");
				}
				_uriBuilder = UriBuilder.fromPath(template.toString());
				_templateAndMatrixParameterValues = new HashMap<String, Object>();
				com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(
						template.toString());
				HashMap<String, String> parameters = new HashMap<String, String>();
				uriTemplate.match(uri.toString(), parameters);
				_templateAndMatrixParameterValues.putAll(parameters);
			}

			/**
			 * Get id
			 * 
			 */
			public Integer getId() {
				return ((Integer) _templateAndMatrixParameterValues.get("id"));
			}

			/**
			 * Duplicate state and set id
			 * 
			 */
			public Localhost_Predictions3ResourcesP.Root.DeleteId setId(Integer id) {
				Map<String, Object> copyMap;
				copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
				UriBuilder copyUriBuilder = _uriBuilder.clone();
				copyMap.put("id", id);
				return new Localhost_Predictions3ResourcesP.Root.DeleteId(_client, copyUriBuilder, copyMap);
			}

			public <T> T deleteAsTextPlain(com.sun.jersey.api.client.GenericType<T> returnType) {
				UriBuilder localUriBuilder = _uriBuilder.clone();
				com.sun.jersey.api.client.WebResource resource = _client
						.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
				com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
				resourceBuilder = resourceBuilder.accept("text/plain");
				com.sun.jersey.api.client.ClientResponse response;
				response = resourceBuilder.method("DELETE", com.sun.jersey.api.client.ClientResponse.class);
				if (response.getStatus() >= 400) {
					throw new Localhost_Predictions3ResourcesP.WebApplicationExceptionMessage(
							Response.status(response.getClientResponseStatus()).build());
				}
				return response.getEntity(returnType);
			}

			public <T> T deleteAsTextPlain(Class<T> returnType) {
				UriBuilder localUriBuilder = _uriBuilder.clone();
				com.sun.jersey.api.client.WebResource resource = _client
						.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
				com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
				resourceBuilder = resourceBuilder.accept("text/plain");
				com.sun.jersey.api.client.ClientResponse response;
				response = resourceBuilder.method("DELETE", com.sun.jersey.api.client.ClientResponse.class);
				if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
					if (response.getStatus() >= 400) {
						throw new Localhost_Predictions3ResourcesP.WebApplicationExceptionMessage(
								Response.status(response.getClientResponseStatus()).build());
					}
				}
				if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
					return response.getEntity(returnType);
				} else {
					return returnType.cast(response);
				}
			}

		}

		public static class Json {

			private com.sun.jersey.api.client.Client _client;
			private UriBuilder _uriBuilder;
			private Map<String, Object> _templateAndMatrixParameterValues;

			private Json(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
				_client = client;
				_uriBuilder = uriBuilder.clone();
				_templateAndMatrixParameterValues = map;
			}

			/**
			 * Create new instance using existing Client instance, and a base
			 * URI and any parameters
			 * 
			 */
			public Json(com.sun.jersey.api.client.Client client, URI baseUri) {
				_client = client;
				_uriBuilder = UriBuilder.fromUri(baseUri);
				_uriBuilder = _uriBuilder.path("/json");
				_templateAndMatrixParameterValues = new HashMap<String, Object>();
			}

			public <T> T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
				UriBuilder localUriBuilder = _uriBuilder.clone();
				com.sun.jersey.api.client.WebResource resource = _client
						.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
				com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
				resourceBuilder = resourceBuilder.accept("application/json");
				com.sun.jersey.api.client.ClientResponse response;
				response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
				if (response.getStatus() >= 400) {
					throw new Localhost_Predictions3ResourcesP.WebApplicationExceptionMessage(
							Response.status(response.getClientResponseStatus()).build());
				}
				return response.getEntity(returnType);
			}

			public <T> T getAsJson(Class<T> returnType) {
				UriBuilder localUriBuilder = _uriBuilder.clone();
				com.sun.jersey.api.client.WebResource resource = _client
						.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
				com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
				resourceBuilder = resourceBuilder.accept("application/json");
				com.sun.jersey.api.client.ClientResponse response;
				response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
				if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
					if (response.getStatus() >= 400) {
						throw new Localhost_Predictions3ResourcesP.WebApplicationExceptionMessage(
								Response.status(response.getClientResponseStatus()).build());
					}
				}
				if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
					return response.getEntity(returnType);
				} else {
					return returnType.cast(response);
				}
			}

		}

		public static class JsonId {

			private com.sun.jersey.api.client.Client _client;
			private UriBuilder _uriBuilder;
			private Map<String, Object> _templateAndMatrixParameterValues;

			private JsonId(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
				_client = client;
				_uriBuilder = uriBuilder.clone();
				_templateAndMatrixParameterValues = map;
			}

			/**
			 * Create new instance using existing Client instance, and a base
			 * URI and any parameters
			 * 
			 */
			public JsonId(com.sun.jersey.api.client.Client client, URI baseUri, Integer id) {
				_client = client;
				_uriBuilder = UriBuilder.fromUri(baseUri);
				_uriBuilder = _uriBuilder.path("/json/{id: \\d+}");
				_templateAndMatrixParameterValues = new HashMap<String, Object>();
				_templateAndMatrixParameterValues.put("id", id);
			}

			/**
			 * Create new instance using existing Client instance, and the URI
			 * from which the parameters will be extracted
			 * 
			 */
			public JsonId(com.sun.jersey.api.client.Client client, URI uri) {
				_client = client;
				StringBuilder template = new StringBuilder(BASE_URI.toString());
				if (template.charAt((template.length() - 1)) != '/') {
					template.append("/json/{id: \\d+}");
				} else {
					template.append("json/{id: \\d+}");
				}
				_uriBuilder = UriBuilder.fromPath(template.toString());
				_templateAndMatrixParameterValues = new HashMap<String, Object>();
				com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(
						template.toString());
				HashMap<String, String> parameters = new HashMap<String, String>();
				uriTemplate.match(uri.toString(), parameters);
				_templateAndMatrixParameterValues.putAll(parameters);
			}

			/**
			 * Get id
			 * 
			 */
			public Integer getId() {
				return ((Integer) _templateAndMatrixParameterValues.get("id"));
			}

			/**
			 * Duplicate state and set id
			 * 
			 */
			public Localhost_Predictions3ResourcesP.Root.JsonId setId(Integer id) {
				Map<String, Object> copyMap;
				copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
				UriBuilder copyUriBuilder = _uriBuilder.clone();
				copyMap.put("id", id);
				return new Localhost_Predictions3ResourcesP.Root.JsonId(_client, copyUriBuilder, copyMap);
			}

			public <T> T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
				UriBuilder localUriBuilder = _uriBuilder.clone();
				com.sun.jersey.api.client.WebResource resource = _client
						.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
				com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
				resourceBuilder = resourceBuilder.accept("application/json");
				com.sun.jersey.api.client.ClientResponse response;
				response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
				if (response.getStatus() >= 400) {
					throw new Localhost_Predictions3ResourcesP.WebApplicationExceptionMessage(
							Response.status(response.getClientResponseStatus()).build());
				}
				return response.getEntity(returnType);
			}

			public <T> T getAsJson(Class<T> returnType) {
				UriBuilder localUriBuilder = _uriBuilder.clone();
				com.sun.jersey.api.client.WebResource resource = _client
						.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
				com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
				resourceBuilder = resourceBuilder.accept("application/json");
				com.sun.jersey.api.client.ClientResponse response;
				response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
				if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
					if (response.getStatus() >= 400) {
						throw new Localhost_Predictions3ResourcesP.WebApplicationExceptionMessage(
								Response.status(response.getClientResponseStatus()).build());
					}
				}
				if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
					return response.getEntity(returnType);
				} else {
					return returnType.cast(response);
				}
			}

		}

		public static class Plain {

			private com.sun.jersey.api.client.Client _client;
			private UriBuilder _uriBuilder;
			private Map<String, Object> _templateAndMatrixParameterValues;

			private Plain(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
				_client = client;
				_uriBuilder = uriBuilder.clone();
				_templateAndMatrixParameterValues = map;
			}

			/**
			 * Create new instance using existing Client instance, and a base
			 * URI and any parameters
			 * 
			 */
			public Plain(com.sun.jersey.api.client.Client client, URI baseUri) {
				_client = client;
				_uriBuilder = UriBuilder.fromUri(baseUri);
				_uriBuilder = _uriBuilder.path("/plain");
				_templateAndMatrixParameterValues = new HashMap<String, Object>();
			}

			public <T> T getAsTextPlain(com.sun.jersey.api.client.GenericType<T> returnType) {
				UriBuilder localUriBuilder = _uriBuilder.clone();
				com.sun.jersey.api.client.WebResource resource = _client
						.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
				com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
				resourceBuilder = resourceBuilder.accept("text/plain");
				com.sun.jersey.api.client.ClientResponse response;
				response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
				if (response.getStatus() >= 400) {
					throw new Localhost_Predictions3ResourcesP.WebApplicationExceptionMessage(
							Response.status(response.getClientResponseStatus()).build());
				}
				return response.getEntity(returnType);
			}

			public <T> T getAsTextPlain(Class<T> returnType) {
				UriBuilder localUriBuilder = _uriBuilder.clone();
				com.sun.jersey.api.client.WebResource resource = _client
						.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
				com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
				resourceBuilder = resourceBuilder.accept("text/plain");
				com.sun.jersey.api.client.ClientResponse response;
				response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
				if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
					if (response.getStatus() >= 400) {
						throw new Localhost_Predictions3ResourcesP.WebApplicationExceptionMessage(
								Response.status(response.getClientResponseStatus()).build());
					}
				}
				if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
					return response.getEntity(returnType);
				} else {
					return returnType.cast(response);
				}
			}

		}

		public static class Update {

			private com.sun.jersey.api.client.Client _client;
			private UriBuilder _uriBuilder;
			private Map<String, Object> _templateAndMatrixParameterValues;

			private Update(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
				_client = client;
				_uriBuilder = uriBuilder.clone();
				_templateAndMatrixParameterValues = map;
			}

			/**
			 * Create new instance using existing Client instance, and a base
			 * URI and any parameters
			 * 
			 */
			public Update(com.sun.jersey.api.client.Client client, URI baseUri) {
				_client = client;
				_uriBuilder = UriBuilder.fromUri(baseUri);
				_uriBuilder = _uriBuilder.path("/update");
				_templateAndMatrixParameterValues = new HashMap<String, Object>();
			}

			public <T> T putXWwwFormUrlencodedAsTextPlain(Object input,
					com.sun.jersey.api.client.GenericType<T> returnType) {
				UriBuilder localUriBuilder = _uriBuilder.clone();
				com.sun.jersey.api.client.WebResource resource = _client
						.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
				com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
				resourceBuilder = resourceBuilder.accept("text/plain");
				resourceBuilder = resourceBuilder.type("application/x-www-form-urlencoded");
				com.sun.jersey.api.client.ClientResponse response;
				response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
				if (response.getStatus() >= 400) {
					throw new Localhost_Predictions3ResourcesP.WebApplicationExceptionMessage(
							Response.status(response.getClientResponseStatus()).build());
				}
				return response.getEntity(returnType);
			}

			public <T> T putXWwwFormUrlencodedAsTextPlain(Object input, Class<T> returnType) {
				UriBuilder localUriBuilder = _uriBuilder.clone();
				com.sun.jersey.api.client.WebResource resource = _client
						.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
				com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
				resourceBuilder = resourceBuilder.accept("text/plain");
				resourceBuilder = resourceBuilder.type("application/x-www-form-urlencoded");
				com.sun.jersey.api.client.ClientResponse response;
				response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
				if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
					if (response.getStatus() >= 400) {
						throw new Localhost_Predictions3ResourcesP.WebApplicationExceptionMessage(
								Response.status(response.getClientResponseStatus()).build());
					}
				}
				if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
					return response.getEntity(returnType);
				} else {
					return returnType.cast(response);
				}
			}

		}

		public static class Xml {

			private com.sun.jersey.api.client.Client _client;
			private UriBuilder _uriBuilder;
			private Map<String, Object> _templateAndMatrixParameterValues;

			private Xml(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
				_client = client;
				_uriBuilder = uriBuilder.clone();
				_templateAndMatrixParameterValues = map;
			}

			/**
			 * Create new instance using existing Client instance, and a base
			 * URI and any parameters
			 * 
			 */
			public Xml(com.sun.jersey.api.client.Client client, URI baseUri) {
				_client = client;
				_uriBuilder = UriBuilder.fromUri(baseUri);
				_uriBuilder = _uriBuilder.path("/xml");
				_templateAndMatrixParameterValues = new HashMap<String, Object>();
			}

			public <T> T getAsXml(com.sun.jersey.api.client.GenericType<T> returnType) {
				UriBuilder localUriBuilder = _uriBuilder.clone();
				com.sun.jersey.api.client.WebResource resource = _client
						.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
				com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
				resourceBuilder = resourceBuilder.accept("application/xml");
				com.sun.jersey.api.client.ClientResponse response;
				response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
				if (response.getStatus() >= 400) {
					throw new Localhost_Predictions3ResourcesP.WebApplicationExceptionMessage(
							Response.status(response.getClientResponseStatus()).build());
				}
				return response.getEntity(returnType);
			}

			public <T> T getAsXml(Class<T> returnType) {
				UriBuilder localUriBuilder = _uriBuilder.clone();
				com.sun.jersey.api.client.WebResource resource = _client
						.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
				com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
				resourceBuilder = resourceBuilder.accept("application/xml");
				com.sun.jersey.api.client.ClientResponse response;
				response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
				if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
					if (response.getStatus() >= 400) {
						throw new Localhost_Predictions3ResourcesP.WebApplicationExceptionMessage(
								Response.status(response.getClientResponseStatus()).build());
					}
				}
				if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
					return response.getEntity(returnType);
				} else {
					return returnType.cast(response);
				}
			}

		}

		public static class XmlId {

			private com.sun.jersey.api.client.Client _client;
			private UriBuilder _uriBuilder;
			private Map<String, Object> _templateAndMatrixParameterValues;

			private XmlId(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
				_client = client;
				_uriBuilder = uriBuilder.clone();
				_templateAndMatrixParameterValues = map;
			}

			/**
			 * Create new instance using existing Client instance, and a base
			 * URI and any parameters
			 * 
			 */
			public XmlId(com.sun.jersey.api.client.Client client, URI baseUri, Integer id) {
				_client = client;
				_uriBuilder = UriBuilder.fromUri(baseUri);
				_uriBuilder = _uriBuilder.path("/xml/{id: \\d+}");
				_templateAndMatrixParameterValues = new HashMap<String, Object>();
				_templateAndMatrixParameterValues.put("id", id);
			}

			/**
			 * Create new instance using existing Client instance, and the URI
			 * from which the parameters will be extracted
			 * 
			 */
			public XmlId(com.sun.jersey.api.client.Client client, URI uri) {
				_client = client;
				StringBuilder template = new StringBuilder(BASE_URI.toString());
				if (template.charAt((template.length() - 1)) != '/') {
					template.append("/xml/{id: \\d+}");
				} else {
					template.append("xml/{id: \\d+}");
				}
				_uriBuilder = UriBuilder.fromPath(template.toString());
				_templateAndMatrixParameterValues = new HashMap<String, Object>();
				com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(
						template.toString());
				HashMap<String, String> parameters = new HashMap<String, String>();
				uriTemplate.match(uri.toString(), parameters);
				_templateAndMatrixParameterValues.putAll(parameters);
			}

			/**
			 * Get id
			 * 
			 */
			public Integer getId() {
				return ((Integer) _templateAndMatrixParameterValues.get("id"));
			}

			/**
			 * Duplicate state and set id
			 * 
			 */
			public Localhost_Predictions3ResourcesP.Root.XmlId setId(Integer id) {
				Map<String, Object> copyMap;
				copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
				UriBuilder copyUriBuilder = _uriBuilder.clone();
				copyMap.put("id", id);
				return new Localhost_Predictions3ResourcesP.Root.XmlId(_client, copyUriBuilder, copyMap);
			}

			public <T> T getAsXml(com.sun.jersey.api.client.GenericType<T> returnType) {
				UriBuilder localUriBuilder = _uriBuilder.clone();
				com.sun.jersey.api.client.WebResource resource = _client
						.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
				com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
				resourceBuilder = resourceBuilder.accept("application/xml");
				com.sun.jersey.api.client.ClientResponse response;
				response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
				if (response.getStatus() >= 400) {
					throw new Localhost_Predictions3ResourcesP.WebApplicationExceptionMessage(
							Response.status(response.getClientResponseStatus()).build());
				}
				return response.getEntity(returnType);
			}

			public <T> T getAsXml(Class<T> returnType) {
				UriBuilder localUriBuilder = _uriBuilder.clone();
				com.sun.jersey.api.client.WebResource resource = _client
						.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
				com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
				resourceBuilder = resourceBuilder.accept("application/xml");
				com.sun.jersey.api.client.ClientResponse response;
				response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
				if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
					if (response.getStatus() >= 400) {
						throw new Localhost_Predictions3ResourcesP.WebApplicationExceptionMessage(
								Response.status(response.getClientResponseStatus()).build());
					}
				}
				if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
					return response.getEntity(returnType);
				} else {
					return returnType.cast(response);
				}
			}

		}

	}

	/**
	 * Workaround for JAX_RS_SPEC-312
	 * 
	 */
	private static class WebApplicationExceptionMessage extends WebApplicationException {

		private WebApplicationExceptionMessage(Response response) {
			super(response);
		}

		/**
		 * Workaround for JAX_RS_SPEC-312
		 * 
		 */
		public String getMessage() {
			Response response = getResponse();
			Response.Status status = Response.Status.fromStatusCode(response.getStatus());
			if (status != null) {
				return (response.getStatus() + (" " + status.getReasonPhrase()));
			} else {
				return Integer.toString(response.getStatus());
			}
		}

		public String toString() {
			String s = "javax.ws.rs.WebApplicationException";
			String message = getLocalizedMessage();
			return (s + (": " + message));
		}

	}

}
